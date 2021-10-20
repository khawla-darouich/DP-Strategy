public class Employee {
    private String cin;
    private float salaireBrutMensuel;
    private IIGR Igr;
    public Employee(String cin, float salaireBrutMensuel) {

        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;

    }

    public Employee() {
    }

    public float calculerIGR(){

        float salaireBrutAnuel=salaireBrutMensuel*12;
        return Igr.calculerIGR(salaireBrutAnuel);

    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }

    public IIGR getIgr() {
        return Igr;
    }

    public void setIgr(IIGR igr) {
        Igr = igr;
    }
}
