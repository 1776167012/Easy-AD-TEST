import Blessed.Blessed;
import CalculateResult.Calculate;
import DATA.XinXiShouJi;
import DATA.ZhuanHuan;
import HDS.HDS;
import MMSE.mmse;

public class text {
    //变量对象定义
    private int BlessedEnd;
    private int MmseEnd;
    private float HdsEnd;
    private float Result;

    public int getBlessedEnd() {
        return BlessedEnd;
    }

    public void setBlessedEnd(int BlessedEnd)
    {
        this.BlessedEnd=BlessedEnd;
    }

    public int getMmseEnd()
    {
        return MmseEnd;
    }
    public void setMmseEnd(int MmseEnd)
    {
        this.MmseEnd=MmseEnd;
    }

    public float getHdsEnd()
    {
        return HdsEnd;
    }
    public void setHdsEnd(float HdsEnd)
    {
        this.HdsEnd=HdsEnd;
    }
    public float getResult()
    {
        return Result;
    }
    public void setResult(float Result)
    {
        this.Result=Result;
    }


    public static void main(String[] args) {

        Blessed blessed=new Blessed();
        mmse mmse=new mmse();
        HDS hds=new HDS();
        Calculate calculate=new Calculate();
        text text=new text();


        XinXiShouJi xinxi=new XinXiShouJi();
       //数据获取模块
        int a[]=xinxi.getA();//一级测试数据结果集
        int b[];//二级测试mmse数据结果集


        //初步belssed测试
        text.setBlessedEnd(blessed.Blessed(a));
        int ble=text.getBlessedEnd();
        //System.out.println(ble);

        //二级测试
        if(ble<=10)
        {
            System.out.println("你要测试的病人很正常，如果您有怀疑，请按照真实情况作答。");
        }
        else{
            xinxi.setB();
            b=xinxi.getB();
            ZhuanHuan zhuanhuan=new ZhuanHuan(b);
            int c[]=zhuanhuan.getC();//二级测试hds数据结果集
            text.setMmseEnd(mmse.MmseText(b));
            text.setHdsEnd(hds.HdsText(c));
        }

        int one=text.getMmseEnd();
        float two=text.getHdsEnd();

        System.out.println("mmse:"+one);
        System.out.println("hds:"+two);

//        //结果分析
//        text.setResult(calculate.CalculateResult(one,two));
//        System.out.println(text.getResult());


        //数据存储

    }
}

//问题：为什么当作参数的变量要被初始化？
// 局部变量使用前必须初始化的规定。

