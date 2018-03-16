package Template;

public class client {

    public static void main(String[] args){
        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.startUp();

        CompanyComputer companyComputer = new CompanyComputer();
        companyComputer.startUp();
    }

}
