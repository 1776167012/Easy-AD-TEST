package Blessed;

//此表的结果中小于等于10为正常，大于10可认为有痴呆嫌疑
public class Blessed {


    private int TextEnd;

    public int Blessed(int a[])
    {
        for(int i=0;i<6;i++)//前6项测试，三个选项0，1，2
        {
            switch (a[i])
            {
                case 0:
                    TextEnd++;
                    break;
                case 1:
                    TextEnd+=2;
                    break;
                case 2:
                    TextEnd+=4;
                    break;
                default:
                    System.out.println("测试结果无效");
            }
        }
        for(int i=6;i<9;i++)//三项测试，四个选项，0，1，2，3
        {
            switch (a[i])
            {
                case 0:
                    TextEnd++;
                    break;
                case 1:
                    TextEnd+=4;
                    break;
                case 2:
                    TextEnd+=8;
                    break;
                case 3:
                    TextEnd+=12;
                    break;
                default:
                    System.out.println("测试结果无效");
            }
        }
        for(int i=9;i<a.length;i++)//最后10个测试，两个选项0，1
        {
            if(a[i]==1)
                TextEnd++;
        }
        return TextEnd;
    }
}
