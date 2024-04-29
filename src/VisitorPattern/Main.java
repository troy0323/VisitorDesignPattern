package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Visitable> items = new ArrayList<>();
        items.add(new Chair(15));
        items.add(new Sofa(30));

        ShippingCostVisitor visitor = new ShippingCostVisitor();
        for (Visitable item : items) {
            item.accept(visitor);
        }

        System.out.println("Total shipping cost: " + visitor.getTotalShippingCost());
    }
}