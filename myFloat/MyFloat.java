package com.company;

public class MyFloat
{
    private long mantissa;
    private long exponent;

    public MyFloat(long mantissa, long exponent)
    {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }

    public long getMantissa()
    {
        return mantissa;
    }

    public long getExponent()
    {
        return exponent;
    }

    public static long stepen(long ch, long step)
    {
        long res = 1;
        int m = 0;
        while (m < step)
        {
            res = res * ch;
            m++;
        }
        return res;
    }

    public void summa(MyFloat b)
    {
        long exponA = this.getExponent();
        long exponB = b.getExponent();
        long cela = this.getMantissa() / stepen(10, exponA);
        long posleta = this.getMantissa() % stepen(10, exponA);
        long celb = b.getMantissa() / stepen(10, exponB);
        long posletb = b.getMantissa() % stepen(10, exponB);
        long summirovanie = cela + celb;
        if (exponA > exponB)
        {
            posletb = posletb * stepen(10, (exponA - exponB));
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, exponA)))
            {
                summirovanie = summirovanie + 1;
                posletsum = posletsum - stepen(10, exponA);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, exponA - 1))
            {
                while (k <= exponA - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print(summirovanie);
            System.out.print(".");
            System.out.println(posletsums);
        } else if (exponA < exponB)
        {
            posleta = posleta * stepen(10, (exponB - exponA));
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, exponB)))
            {
                summirovanie = summirovanie + 1;
                posletsum = posletsum - stepen(10, exponB);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, exponB - 1))
            {
                while (k <= exponB - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print((summirovanie));
            System.out.print(".");
            System.out.println(posletsums);
        } else
            {
            long posletsum = posleta + posletb;
            if (posletsum >= (stepen(10, exponB)))
            {
                summirovanie = summirovanie + 1;
                posletsum = posletsum - stepen(10, exponB);
            }
            int k = 1;
            String posletsums = Long.toString(posletsum);
            if (posletsum < stepen(10, exponB - 1))
            {
                while (k <= exponB - 1)
                {
                    posletsums = "0" + posletsums;
                    k++;
                }
            }
            System.out.print(summirovanie);
            System.out.print(".");
            System.out.println(posletsums);
        }
    }

    public void raznost(MyFloat b)
    {
        long aexp = this.getExponent();
        long bexp = b.getExponent();
        long cela = this.getMantissa() / stepen(10, aexp);
        long posleta = this.getMantissa() % stepen(10, aexp);
        long celb = b.getMantissa() / stepen(10, bexp);
        long posletb = b.getMantissa() % stepen(10, bexp);
        long celraz = cela - celb;
        if (aexp > bexp)
        {
            posletb = posletb * stepen(10, (aexp - bexp));
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, aexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, aexp - 1))
            {
                while (k <= aexp - 1)
                {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        } else if (aexp < bexp)
        {
            posleta = posleta * stepen(10, (bexp - aexp));
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, bexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1) {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        } else
            {
            long posletraz = posleta - posletb;
            if (posletraz < 0)
            {
                celraz = celraz - 1;
                posletraz = stepen(10, bexp) + posletraz;
            }
            int k = 1;
            String posletrazs = Long.toString(posletraz);
            if (posletraz < stepen(10, bexp - 1))
            {
                while (k <= bexp - 1) {
                    posletrazs = "0" + posletrazs;
                    k++;
                }
            }
            System.out.print(celraz);
            System.out.print(".");
            System.out.println(posletrazs);
        }
    }
}

