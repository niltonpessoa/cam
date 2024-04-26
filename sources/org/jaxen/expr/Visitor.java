package org.jaxen.expr;

public interface Visitor {
    void visit(AdditiveExpr additiveExpr);

    void visit(AllNodeStep allNodeStep);

    void visit(CommentNodeStep commentNodeStep);

    void visit(EqualityExpr equalityExpr);

    void visit(FilterExpr filterExpr);

    void visit(FunctionCallExpr functionCallExpr);

    void visit(LiteralExpr literalExpr);

    void visit(LocationPath locationPath);

    void visit(LogicalExpr logicalExpr);

    void visit(MultiplicativeExpr multiplicativeExpr);

    void visit(NameStep nameStep);

    void visit(NumberExpr numberExpr);

    void visit(PathExpr pathExpr);

    void visit(Predicate predicate);

    void visit(ProcessingInstructionNodeStep processingInstructionNodeStep);

    void visit(RelationalExpr relationalExpr);

    void visit(TextNodeStep textNodeStep);

    void visit(UnaryExpr unaryExpr);

    void visit(UnionExpr unionExpr);

    void visit(VariableReferenceExpr variableReferenceExpr);
}
