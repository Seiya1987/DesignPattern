package visitor;

public class Client {

    public static void main(String[] args){
        BusinessReport report = new BusinessReport();
        report.showReport(new CTOVisitor());
        System.out.println("******************************");
        report.showReport(new CEOVisitor());

    }

}
