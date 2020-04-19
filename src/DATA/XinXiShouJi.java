package DATA;

import java.util.Scanner;

public class XinXiShouJi {
    private int a[]=new int[19];
    private int b[]=new int[30];

    public int[] getA()
    {
        return this.a;
    }

    public int[] getB()
    {
        return this.b;
    }
    public XinXiShouJi()
    {
        Scanner reader=new Scanner(System.in);

        int x[]=new int[19];
        System.out.println("1.您要测试的对象完成一般家务的能力？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[0]=reader.nextInt();

        System.out.println("2.您要测试的对象管理少量钱财？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[1]=reader.nextInt();

        System.out.println("3.您要测试的对象的记忆事情的能力，如买几样东西，吃药？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[2]=reader.nextInt();

        System.out.println("4.您要测试的对象在熟悉的街道内独自出门，认路，乘公交车？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[3]=reader.nextInt();

        System.out.println("5.您要测试的对象辨认环境，如认识所在的地点，辨认周围人物，如亲戚，医护人员？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[4]=reader.nextInt();

        System.out.println("6.您要测试的对象回忆近期发生的事情？");
        System.out.println("0.完全正常");
        System.out.println("1.需要他人适当帮助");
        System.out.println("2.完全依赖他人");
        x[5]=reader.nextInt();

        System.out.println("7.您要测试的对象吃饭时？");
        System.out.println("0.用筷子，不掉饭，吃的干净");
        System.out.println("1.用筷子，但掉饭菜，需要他人帮助");
        System.out.println("2.只能用勺子");
        System.out.println("3.需要喂饭");
        x[6]=reader.nextInt();

        System.out.println("8.您要测试的对象穿衣时？");
        System.out.println("0.无需帮助");
        System.out.println("1.有时系错扣字");
        System.out.println("2.经常穿错衣服");
        System.out.println("3.自己完全不会");
        x[7]=reader.nextInt();

        System.out.println("9.您要测试的对象尿床？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        System.out.println("2.经常性尿床");
        System.out.println("3.二便均不能控制");
        x[8]=reader.nextInt();

        System.out.println("10.您要测试的对象是否变得顽固，固执？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[9]=reader.nextInt();
        System.out.println("11.您要测试的对象是否变得自私，自我中心，计较钱财，尊严？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[10]=reader.nextInt();
        System.out.println("12.您要测试的对象是否变得不顾他人只求自己方便？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[11]=reader.nextInt();
        System.out.println("13.您要测试的对象是否变得对别人的事不闻不问？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[12]=reader.nextInt();
        System.out.println("14.您要测试的对象是否变得易怒？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[13]=reader.nextInt();
        System.out.println("15.您要测试的对象是否变得无端伤心或开心？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[14]=reader.nextInt();
        System.out.println("16.您要测试的对象是否情感反应减弱？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[15]=reader.nextInt();
        System.out.println("17.您要测试的对象是否变得放弃爱好，在社会生活中退缩？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[16]=reader.nextInt();
        System.out.println("18.您要测试的对象是否主动性减退，无活动欲望？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[17]=reader.nextInt();
        System.out.println("19.您要测试的对象是否变得无目的活动，多动？");
        System.out.println("0.不会");
        System.out.println("1.有时");
        x[18]=reader.nextInt();

        this.a=x;
    }

    public void setB()
    {
        Scanner reader=new Scanner(System.in);
        int y[]=new int[30];
        System.out.println("1.今年是那一年？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[0]=reader.nextInt();

        System.out.println("2.您多大岁数？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[1]=reader.nextInt();

        System.out.println("3.今年是那一年？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[2]=reader.nextInt();
        System.out.println("4.今天是几号？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[3]=reader.nextInt();
        System.out.println("5.今年是星期几？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[4]=reader.nextInt();
        System.out.println("6.你现在在那个省？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[5]=reader.nextInt();
        System.out.println("7.你现在在那个县？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[6]=reader.nextInt();
        System.out.println("8.你现在在那个乡？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[7]=reader.nextInt();
        System.out.println("9.最近发生了什么事？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[8]=reader.nextInt();
        System.out.println("10.这里事什么地方？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[9]=reader.nextInt();
        System.out.println("11.请复述下面词语：皮球？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[10]=reader.nextInt();
        System.out.println("12.请复述下面词语：国旗？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[11]=reader.nextInt();
        System.out.println("13.一年有几个月？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[12]=reader.nextInt();
        System.out.println("14.100-7=？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[13]=reader.nextInt();
        System.out.println("15.再-7=？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[14]=reader.nextInt();
        System.out.println("16.再-7=？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[15]=reader.nextInt();
        System.out.println("17.再-7=？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[16]=reader.nextInt();
        System.out.println("18.再-7=？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[17]=reader.nextInt();
        System.out.println("19.回忆皮球？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[18]=reader.nextInt();
        System.out.println("20.回忆国旗？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[19]=reader.nextInt();
        System.out.println("21.说出您一个远房亲戚的名字？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[20]=reader.nextInt();
        System.out.println("22.辨认手表？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[21]=reader.nextInt();
        System.out.println("23.辨认铅笔？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[22]=reader.nextInt();
        System.out.println("24.倒背下面的数字6-8-2-4？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[23]=reader.nextInt();
        System.out.println("25.按指令做事0？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[24]=reader.nextInt();
        System.out.println("26.按指令做事1？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[25]=reader.nextInt();
        System.out.println("27.按指令做事2？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[26]=reader.nextInt();
        System.out.println("28.按指令做事3？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[27]=reader.nextInt();
        System.out.println("29.说一句完整的句子？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[28]=reader.nextInt();
        System.out.println("30.按样子画图？");
        System.out.println("0.错误");
        System.out.println("1.正确");
        y[29]=reader.nextInt();

        this.b=y;

    }
}
