public class IGRMaroc implements IIGR{
    @Override
    public float calculerIGR(float salaireBrutAnuel) {
        float igr = 0;
        if(salaireBrutAnuel <= 40000)
        {
            igr= salaireBrutAnuel*5/100;
            System.out.println("igr1 : "+igr);
        }
        else if( salaireBrutAnuel == 120000)
        {
            igr= salaireBrutAnuel*20/100;
            System.out.println("igr2 : "+igr);
        }
        else
        {
            igr= salaireBrutAnuel*42/100;
            System.out.println("igr3 : "+igr);
        }
        return igr;
    }
}
