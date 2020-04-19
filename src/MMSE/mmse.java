package MMSE;


public class mmse {

    private int TestEnd;

    public int MmseText(int a[])//30项，每个1分
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                TestEnd++;
            }
        }
        return TestEnd;
    }


}
