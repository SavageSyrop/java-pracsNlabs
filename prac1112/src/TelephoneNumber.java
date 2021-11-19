public class TelephoneNumber {
    TelephoneNumber()
    {

    }

    public String convertNumber(String number)
    {
        String converted = "";
        char[] num = number.toCharArray();
        if (num[0]=='+')
        {
            for (int i=num.length-1;i>=0;i--)
            {
                if ((i== num.length-5) || (i== num.length-8))
                {
                    converted+="-";
                }
                converted+=num[i];
            }
        }
        else
        {
            for (int i=num.length-1;i>=0;i--)
            {
                if ((i== num.length-5) || (i== num.length-8))
                {
                    converted+="-";
                }
                converted+=num[i];
            }
            converted+="+";
        }
        StringBuilder bld = new StringBuilder(converted).reverse();
        return bld.toString();
    }
}
