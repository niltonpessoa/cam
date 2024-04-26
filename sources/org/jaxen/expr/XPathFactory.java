package org.jaxen.expr;

public interface XPathFactory {
    LocationPath createAbsoluteLocationPath();

    BinaryExpr createAdditiveExpr(Expr expr, Expr expr2, int i);

    Step createAllNodeStep(int i);

    BinaryExpr createAndExpr(Expr expr, Expr expr2);

    Step createCommentNodeStep(int i);

    BinaryExpr createEqualityExpr(Expr expr, Expr expr2, int i);

    FilterExpr createFilterExpr(Expr expr);

    FunctionCallExpr createFunctionCallExpr(String str, String str2);

    LiteralExpr createLiteralExpr(String str);

    BinaryExpr createMultiplicativeExpr(Expr expr, Expr expr2, int i);

    Step createNameStep(int i, String str, String str2);

    NumberExpr createNumberExpr(double d);

    NumberExpr createNumberExpr(int i);

    BinaryExpr createOrExpr(Expr expr, Expr expr2);

    PathExpr createPathExpr(FilterExpr filterExpr, LocationPath locationPath);

    Predicate createPredicate(Expr expr);

    PredicateSet createPredicateSet();

    Step createProcessingInstructionNodeStep(int i, String str);

    BinaryExpr createRelationalExpr(Expr expr, Expr expr2, int i);

    LocationPath createRelativeLocationPath();

    Step createTextNodeStep(int i);

    Expr createUnaryExpr(Expr expr, int i);

    UnionExpr createUnionExpr(Expr expr, Expr expr2);

    VariableReferenceExpr createVariableReferenceExpr(String str, String str2);

    XPathExpr createXPath(Expr expr);
}
