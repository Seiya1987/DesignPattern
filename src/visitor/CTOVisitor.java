package visitor;

public class CTOVisitor implements Visitor{

    @Override
    public void visit(Coder coder) {
        System.out.println("Coder kpi: " + coder.name + "\t" + "kpi:" + coder.kpi + "\t Line:" + coder.getCodeLines());
    }

    @Override
    public void visit(Enginner enginner) {
        System.out.print("#####");
    }
}
