package VisitorPattern;

public class Sofa implements Visitable {
    private double weight;

    Sofa(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}