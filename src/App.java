import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner= new Scanner(System.in);
        while(true)
        {
            System.out.println("Entrer le CIN");
            String cin=scanner.nextLine();
            System.out.println("Entrer le salaire Brut Mensuel");
            float sbm=scanner.nextFloat();
            Employee employee= new Employee(cin,sbm);
            scanner= new Scanner(System.in);
            System.out.println("Entrer le nom du pays");
            String strategyClassName="IGR"+scanner.nextLine();
            IIGR igr=(IIGR) Class.forName(strategyClassName).newInstance();
            employee.setIgr(igr);
            employee.calculerIGR();

            System.out.println("Salaire brut mensuel"+employee.getSalaireNetMensuel());
        }
    }

}
