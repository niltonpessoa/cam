package org.jaxen.util;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import org.jaxen.expr.AdditiveExpr;
import org.jaxen.expr.AllNodeStep;
import org.jaxen.expr.CommentNodeStep;
import org.jaxen.expr.EqualityExpr;
import org.jaxen.expr.Expr;
import org.jaxen.expr.FilterExpr;
import org.jaxen.expr.FunctionCallExpr;
import org.jaxen.expr.LiteralExpr;
import org.jaxen.expr.LocationPath;
import org.jaxen.expr.LogicalExpr;
import org.jaxen.expr.MultiplicativeExpr;
import org.jaxen.expr.NameStep;
import org.jaxen.expr.NumberExpr;
import org.jaxen.expr.PathExpr;
import org.jaxen.expr.Predicate;
import org.jaxen.expr.ProcessingInstructionNodeStep;
import org.jaxen.expr.RelationalExpr;
import org.jaxen.expr.Step;
import org.jaxen.expr.TextNodeStep;
import org.jaxen.expr.UnaryExpr;
import org.jaxen.expr.UnionExpr;
import org.jaxen.expr.VariableReferenceExpr;
import org.jaxen.expr.Visitor;

public class XPath2XMLVisitor implements Visitor {
    protected PrintWriter printer;
    protected int tabIndex;

    public XPath2XMLVisitor() {
        this.printer = new PrintWriter(System.out);
    }

    public XPath2XMLVisitor(PrintWriter printWriter) {
        this.printer = printWriter;
    }

    /* access modifiers changed from: protected */
    public void handlePredicates(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Predicate) it.next()).accept(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void printLhsRhs(Expr expr, Expr expr2) {
        this.tabIndex++;
        printLn("<lhsExpr>");
        expr.accept(this);
        printLn("</lhsExpr>");
        printLn("<rhsExpr>");
        expr2.accept(this);
        printLn("</rhsExpr>");
        this.tabIndex--;
    }

    /* access modifiers changed from: protected */
    public void printLn(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.tabIndex; i++) {
            stringBuffer.append("\t");
        }
        stringBuffer.append(str);
        this.printer.println(stringBuffer.toString());
    }

    public void visit(AdditiveExpr additiveExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<AdditiveExpr operator=\"");
        stringBuffer.append(additiveExpr.getOperator());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        printLhsRhs(additiveExpr.getLHS(), additiveExpr.getRHS());
        printLn("</AdditiveExpr>");
    }

    public void visit(AllNodeStep allNodeStep) {
        printLn("<AllNodeStep>");
        this.tabIndex++;
        handlePredicates(allNodeStep.getPredicates());
        this.tabIndex--;
        printLn("</AllNodeStep>");
    }

    public void visit(CommentNodeStep commentNodeStep) {
        printLn("<CommentNodeStep>");
        this.tabIndex++;
        handlePredicates(commentNodeStep.getPredicates());
        this.tabIndex--;
        printLn("</CommentNodeStep>");
    }

    public void visit(EqualityExpr equalityExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<EqualityExpr operator=\"");
        stringBuffer.append(equalityExpr.getOperator());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        printLhsRhs(equalityExpr.getLHS(), equalityExpr.getRHS());
        printLn("</EqualityExpr>");
    }

    public void visit(FilterExpr filterExpr) {
        printLn("<FilterExpr>");
        this.tabIndex++;
        if (filterExpr.getExpr() != null) {
            filterExpr.getExpr().accept(this);
        }
        for (Predicate expr : filterExpr.getPredicates()) {
            expr.getExpr().accept(this);
        }
        this.tabIndex--;
        printLn("</FilterExpr>");
    }

    public void visit(FunctionCallExpr functionCallExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<FunctionCallExpr prefix=\"");
        stringBuffer.append(functionCallExpr.getPrefix());
        stringBuffer.append("\" functionName=\"");
        stringBuffer.append(functionCallExpr.getFunctionName());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        this.tabIndex++;
        printLn("<Args>");
        for (Expr accept : functionCallExpr.getParameters()) {
            accept.accept(this);
        }
        printLn("</Args>");
        this.tabIndex--;
        printLn("</FunctionCallExpr>");
    }

    public void visit(LiteralExpr literalExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<LiteralExpr literal=\"");
        stringBuffer.append(literalExpr.getLiteral());
        stringBuffer.append("\"/>");
        printLn(stringBuffer.toString());
    }

    public void visit(LocationPath locationPath) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<LocationPath absolute=\"");
        stringBuffer.append(locationPath.isAbsolute());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        for (Step accept : locationPath.getSteps()) {
            accept.accept(this);
        }
        printLn("</LocationPath>");
    }

    public void visit(LogicalExpr logicalExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<LogicalExpr operator=\"");
        stringBuffer.append(logicalExpr.getOperator());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        printLhsRhs(logicalExpr.getLHS(), logicalExpr.getRHS());
        printLn("</LogicalExpr>");
    }

    public void visit(MultiplicativeExpr multiplicativeExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<MultiplicativeExpr operator=\"");
        stringBuffer.append(multiplicativeExpr.getOperator());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        printLhsRhs(multiplicativeExpr.getLHS(), multiplicativeExpr.getRHS());
        printLn("</MultiplicativeExpr>");
    }

    public void visit(NameStep nameStep) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<NameStep prefix=\"");
        stringBuffer.append(nameStep.getPrefix());
        stringBuffer.append("\" localName=\"");
        stringBuffer.append(nameStep.getLocalName());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        this.tabIndex++;
        for (Predicate accept : nameStep.getPredicates()) {
            accept.accept(this);
        }
        this.tabIndex--;
        printLn("</NameStep>");
    }

    public void visit(NumberExpr numberExpr) {
        printLn("<NumberExpr>");
        printLn("</NumberExpr>");
    }

    public void visit(PathExpr pathExpr) {
        printLn("<PathExpr>");
        if (pathExpr.getFilterExpr() != null) {
            pathExpr.getFilterExpr().accept(this);
        }
        if (pathExpr.getLocationPath() != null) {
            pathExpr.getLocationPath().accept(this);
        }
        printLn("</PathExpr>");
    }

    public void visit(Predicate predicate) {
        printLn("<Predicate>");
        this.tabIndex++;
        predicate.getExpr().accept(this);
        this.tabIndex--;
        printLn("</Predicate>");
    }

    public void visit(ProcessingInstructionNodeStep processingInstructionNodeStep) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<ProcessingInstructionNodeStep name=\"");
        stringBuffer.append(processingInstructionNodeStep.getName());
        stringBuffer.append("\" axis=\"");
        stringBuffer.append(processingInstructionNodeStep.getAxis());
        stringBuffer.append(">");
        printLn(stringBuffer.toString());
        this.tabIndex++;
        handlePredicates(processingInstructionNodeStep.getPredicates());
        this.tabIndex--;
        printLn("</ProcessingInstructionNodeStep>");
    }

    public void visit(RelationalExpr relationalExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<RelationalExpr operator=\"");
        stringBuffer.append(relationalExpr.getOperator());
        stringBuffer.append("\">");
        printLn(stringBuffer.toString());
        printLhsRhs(relationalExpr.getLHS(), relationalExpr.getRHS());
        printLn("</RelationalExpr>");
    }

    public void visit(TextNodeStep textNodeStep) {
        printLn("<TextNodeStep>");
        this.tabIndex++;
        handlePredicates(textNodeStep.getPredicates());
        this.tabIndex--;
        printLn("</TextNodeStep>");
    }

    public void visit(UnaryExpr unaryExpr) {
        printLn("<UnaryExpr>");
        unaryExpr.getExpr().accept(this);
        printLn("</UnaryExpr>");
    }

    public void visit(UnionExpr unionExpr) {
        printLn("<UnionExpr>");
        printLhsRhs(unionExpr.getLHS(), unionExpr.getRHS());
        printLn("</UnionExpr>");
    }

    public void visit(VariableReferenceExpr variableReferenceExpr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<VariableReferenceExpr name=\"");
        stringBuffer.append(variableReferenceExpr.getVariableName());
        stringBuffer.append("\"/>");
        printLn(stringBuffer.toString());
    }
}
