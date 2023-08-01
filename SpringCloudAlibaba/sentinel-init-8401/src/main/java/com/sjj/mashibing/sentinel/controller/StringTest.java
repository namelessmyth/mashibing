package com.sjj.mashibing.sentinel.controller;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang.CharUtils;

import java.nio.charset.Charset;

/**
 * 类功能说明<br>
 *
 * @author namelessmyth
 * @version 1.0
 * @date 2023/4/18/0018
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "000,xx,BOM修改,分配Basic UDI-DI,分配UDI-DI;;0000000026;11111;0000000032;;0000000033;;0000000034;0000000034;;0000000036;;0000000070;;0000000080;QWI0003;QWI0003;;;QWI0004;IQCF80010002;IQCF80010002;;0000011;xx;;000005425-V011111;000005425-V011111;000005425-V01,xx;;00001;;0068;;0068;;;10000000001,XX;;0000000026A0,111;10000000002,1;10000000002;10000000002;10000000002;10000000002;VenusA主动脉瓣膜;10000000003;10000000003;10000000003;10000000003;;10000000004;10000000004;10000000004;10000000004;10000000004;10000000004;;10000000005;10000000005;10000000003,XX;;10000000007,BBBB;;10000000009;1A04001001A;1C02001001A;1F01001001A;;10000000014;;10000000015;;10000000017;;10000000018;;10000000019,1;;10000000020;;10000000021;;10000000022;1A01001001A,1;1A01002001A;1A01001001A,1;2;10000000036,2;xx;10000000037,xx;1;10000000038,1;肺动脉瓣输送系统;10000000039,肺动脉瓣输送系统;BBBB;A;10000000041,A;AA;10000000042,AA;AAA;AAAAA;A;a;A;1;10000000054,1;xx;10000000057,xx;xx;10000000058,xx;xx;10000000059,xx;2;10000000061,2;1;10000000064,1;1;10000000065,1;BBBB;10000000066,BBBB;BBBB;10000000068,BBBB;1;10000000070,1;1;10000000071,1;BB;10000000075,BB;A;10000000076,A;BBBB;10000000077,BBBB,BOM修改,分配UDI-DI,属性信息修改,物件作废;2;BBBB;BBBB;BBBB;BBBB;xx;BBBB;xx;10000000088,xx;aaa;xx;xx;球囊;1;xx;xx;BBBB;BBBB;BBBB;BBBB;BBBB;1A02001001A,肺动脉瓣膜;1A04005001A,管子;10000000002,1;1A04005001A,管子;1;BBBB;1;10000000135,1;1;1;1;10000000145,1;1;1;10000000147,1;1A01007001A,主动脉瓣膜;xx;10000000154,xx;1;10000000155,1;VenusA主动脉瓣膜;10000000160,VenusA主动脉瓣膜;1;1;1;10000000171,1;1;10000000172,1;1;10000000173,1;1;1;10000000175,1;VenusA主动脉瓣膜;VenusA主动脉瓣膜;VenusA主动脉瓣膜;10000000180,VenusA主动脉瓣膜;1;10000000183,1;1;10000000189,1;XXX;XXX;支架;支架;瓣膜;瓣膜;测试;测试;测试;10000000195,测试;测试;10000000197,测试;10000000197,测试;10000000197,测试;10000000197,测试;10000000197,测试;测试;支架;支架;测试;10000000213,测试;支架1;10000000217,支架1;VenusA主动脉瓣膜;10000000219,VenusA主动脉瓣膜;部件;BB;10000000224,BB;瓣膜;10000000228,瓣膜;12;主动脉瓣膜;10000000244,测试成品;10000000245,测试3-1;10000000246,主动脉瓣膜;BBBB1;xx;1;1;xx;xx;xx;xx;10000000002,xx;10000000002,xx;xx;10000000002D0,xx;000005425-V01D0,1;支架;BBBB;1A00002001A,BBBB;1A00002001A,BBBB;1A00002001A,BBBB;测试;100;;;111;11;11111,11;11;;BBBB;1,仅适用于文档编号（默认编号）;BBBB;BBBB;1A00002001A,BBBB;1A00002001A,BBBB;;1A01001001A;1A01001001A,1;1A01001001A,1;;;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1A01003001A;1;1A01004001A,1;1;1A01005001A,1;xx;1A04005001A,管子;1A04005001A,管子;A;AAAA;1A05002001B,AAAA;1A05002001B,AAAA;2;1A05003001A,2;1;1A06001001A,1;654321;1B05001001A,654321;;xx;1C03001001A,xx;;BBBB;1F01002001A,BBBB;XX;XX;2A03001001A;;20000000002;20000000002;20000000002;20000000002;20000000002;20000000002;ASD;20000000005,ASD;裙体;20000000008,裙体;1;1;1;1;1;123;20000000024,123;部件;20000000045,测试物料;20000000046A0,猪心包膜（固定后）;20000000047,测试2-1;20000000048,组膜;外管组件;上架23;20000000052,上架26;20000000053,组膜;瓣叶;外管组件;上架23;20000000052,上架26;20000000053,组膜;瓣叶;球囊;ASD;20000000068,ASD;;2A01001001A,1;1;2A01002001A,1;BBBBHHHH;;肺动脉瓣输送系统;2B05001001A,肺动脉瓣输送系统;BBBB;1;30000000002,1;1;30000000003,1;支架;30000000006,支架;支架;30000000007,支架;主连接器;30000000009,主连接器;AS导;1;支架;234;11;1;1;瓣膜;瓣膜;支架;支架;1;1;支架;支架;部件;部件;部件;部件;40000000031,碳酸氢钠;测试物料;30000000062A0,猪心包膜（新鲜）;30000000063A0,猪心包膜（新鲜）;30000000064A0,猪心包（切割后）;30000000065,测试1-1;30000000066,测试1-2;30000000067,支架;30000000068,支架;支架;支架;支架;输送系统运输箱;泡沫盒;泡沫盖;导管座;垫圈;瓶盖;30000000078,支架;珍珠棉;A-Plus中盒;A-Pro中盒;装载盆纸塑袋;Vitae输送系统运输箱;30000000067,外管0.135;心脏瓣膜安装工具套件外箱;30000000067,扩散应力管;30000000067,导丝;30000000067,圈套器;BBBB;1;40000000005,1;40000000005,1;1;40000000006,1;40000000006,1;40000000006,1;热缩管;40000000010,热缩管;123;40000000011,123;q;1;1;等";
        System.out.println(StrUtil.byteLength(s, Charset.forName("utf-8")));
        System.out.println(getGBKLength(s));
    }

    /**
     * <p>按GBK的方式计算文本的字节长度.1个中文算2个字节.utf8一个中文3个字节</p>
     * @return [参数说明]
     * @author shenjunjie
     * @since [2016年12月14日]
     */
    public static int getGBKLength(String str) {
        int length = 0;
        if (StrUtil.isNotEmpty(str)) {
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                length++;
                char c = ch[i];
                if (!CharUtils.isAscii(c)) {
                    //如果不在ASCII表里,就认为长度是2
                    length++;
                }
            }
        }
        return length;
    }
}
