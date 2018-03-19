package visitor;

public class CEOVisitor implements Visitor{

    @Override
    public void visit(Coder coder) {
        System.out.print("^^^^^^^");
    }

    @Override
    public void visit(Enginner enginner) {
        System.out.println("Enginner kpi: " + enginner.name + "\t" + "kpi:" + enginner.kpi + "\t Line:" + enginner.getProduct());
    }
}
