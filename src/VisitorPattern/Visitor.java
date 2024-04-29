package VisitorPattern;

public interface Visitor {
    void visit(Chair chair);
    void visit(Sofa sofa);
    // Add more visit methods for other furniture types
}