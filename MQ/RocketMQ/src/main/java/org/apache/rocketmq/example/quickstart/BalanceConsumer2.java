package org.apache.rocketmq.example.quickstart;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

import java.util.List;

public class BalanceConsumer2 {
    public static void main(String[] args) throws Exception {
        // 实例化消费者,指定组名:  TopicTest  10条消息 group_consumer  ，  lijin 8(2)
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("group_consumer");
        //consumer.setUnitName("consumer1");  //一个订阅服务器A
        // 指定Namesrv地址信息.
        consumer.setNamesrvAddr("dev-study:9876");
        // 订阅Topic
        consumer.subscribe("TopicTest", "*"); //tag  tagA|TagB|TagC
        //consumer.setConsumeFromWhere();

        //集群模式消费
        consumer.setMessageModel(MessageModel.CLUSTERING);

        //再次订阅Topic即可
        consumer.subscribe("TopicTest", "*"); //tag  tagA|TagB|TagC

        // 注册回调函数，处理消息
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                                                            ConsumeConcurrentlyContext context) {
                try {
                    for(MessageExt msg : msgs) {
                        String topic = msg.getTopic();
                        String msgBody = new String(msg.getBody(), "utf-8");
                        String tags = msg.getTags();
                        //Thread.sleep(1000);
                        System.out.println("收到消息：" + " topic :" + topic + " ,tags : " + tags + " ,msg : " + msgBody);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return ConsumeConcurrentlyStatus.RECONSUME_LATER;

                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        //启动消息者
        consumer.start();
        //注销Consumer
        //consumer.shutdown();
        System.out.printf("Consumer Started.%n");
    }
}
