class Bank{
    double getrateofinterest()
    {
        return 0.0;
    }
}

class HDFC extends Bank{
    double getrateofinterest()
    {
        return 4.0;
    }
}
class SBI extends Bank{
    double getrateofinterest()
    {
        return 4.5;
    }
}
class PNB extends Bank{
    double getrateofinterest()
    {
        return 5.0;
    }
}

class Q15{
    public static void main(String args[])
    {
        Bank hdfc=new HDFC();
        System.out.println("the rate of interest is "+hdfc.getrateofinterest()+"%");

        Bank sbi=new SBI();
        System.out.println("the rate of interest is "+sbi.getrateofinterest()+"%");

        Bank pnb=new PNB();
        System.out.println("the rate of interest is "+pnb.getrateofinterest()+"%");



    }
}


