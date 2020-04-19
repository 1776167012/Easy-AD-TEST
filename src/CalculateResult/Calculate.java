package CalculateResult;

public class Calculate {
    private float result;
    public float CalculateResult(int one ,float two)
    {

        if(one<14&&two<20.5)
            System.out.println("有问题");

        result=one+two;
        return result;
    }
}
