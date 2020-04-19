package HDS;

public class HDS {
    private float end;

    public float HdsText(int a[])//前三个问题，每个问题2.5分
    {
        for(int i=0;i<3;i++)
        {
            if(a[i]==1)
                end+=2.5;
        }
        for(int i=3;i<6;i++)
        {
            if(a[i]==1)
                end+=3;
        }
        for(int i=6;i<11;i++)
        {
            if(a[i]==1)
                end+=2;
        }
        switch (a[11])
        {
            case 0:
                break;
            case 1:
                end+=0.5;
                break;
            case 2:
                end+=1.5;
                break;
            case 3:
                end+=2.5;
                break;
            case 4:
                end+=3.5;
                break;
            default:
                System.out.println("你的测试有误");

        }
        if(a[12]==1)
            end+=3.5;

        return end;
    }
}
