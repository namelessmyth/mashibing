package com.sjj.mashibing.ChainResponsibility.interfaceHandler;

import com.sjj.mashibing.ChainResponsibility.RequestData;

/**
 * 具体处理者（Concrete Handler）
 **/
public class HandlerA implements Handler {
    @Override
    public void handle(RequestData requestData, Context context) {
        System.out.println("HandlerA 执行代码逻辑! 处理: " + requestData.getData());

        requestData.setData(requestData.getData().replace("A", ""));
        Handler successor = context.getNext();
        if (successor != null) {
            successor.handle(requestData, context);
        } else {
            System.out.println("执行中止!");
        }
    }
}