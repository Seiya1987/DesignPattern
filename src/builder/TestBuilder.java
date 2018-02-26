package builder;

public class TestBuilder {

    public static void main(String[] args){
        Computer computer = new MacbookBuilder().buildBorad("4").buildDisplay("seiya").buildOS().create();
        System.out.println(computer.toString());
    }


}
