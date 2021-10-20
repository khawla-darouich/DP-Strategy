
public class IGRAlgerie implements IIGR{
    @Override
    public float calculerIGR(float salaireBrutAnuel) {
        return salaireBrutAnuel*35/100;
    }
}