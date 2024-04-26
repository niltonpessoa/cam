package org.jaxen.expr;

public interface BinaryExpr extends Expr {
    Expr getLHS();

    Expr getRHS();
}
