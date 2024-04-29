package VisitorPattern;

public class ShippingCostVisitor implements Visitor {
    private double totalShippingCost = 0;

    @Override
    public void visit(Chair chair) {
        totalShippingCost += chair.getWeight() * 10;  // Flat rate shipping for chairs
    }

    @Override
    public void visit(Sofa sofa) {
        totalShippingCost += sofa.getWeight() * 20;  // Distance-based shipping for sofas
    }

    double getTotalShippingCost() {
        return totalShippingCost;
    }
}
