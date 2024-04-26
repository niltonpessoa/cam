package org.jaxen.saxpath.base;

import org.jaxen.JaxenRuntimeException;

class TokenTypes {
    static final int AND = 28;
    static final int AT = 16;
    static final int COLON = 18;
    static final int COMMA = 32;
    static final int DIV = 24;
    static final int DOLLAR = 26;
    static final int DOT = 13;
    static final int DOT_DOT = 14;
    static final int DOUBLE = 31;
    static final int DOUBLE_COLON = 19;
    static final int DOUBLE_SLASH = 12;
    static final int EOF = -1;
    static final int EQUALS = 21;
    static final int ERROR = -3;
    static final int GREATER_THAN = 9;
    static final int GREATER_THAN_EQUALS = 10;
    static final int IDENTIFIER = 15;
    static final int INTEGER = 30;
    static final int LEFT_BRACKET = 3;
    static final int LEFT_PAREN = 1;
    static final int LESS_THAN = 7;
    static final int LESS_THAN_EQUALS = 8;
    static final int LITERAL = 27;
    static final int MINUS = 6;
    static final int MOD = 25;
    static final int NOT = 23;
    static final int NOT_EQUALS = 22;
    static final int OR = 29;
    static final int PIPE = 17;
    static final int PLUS = 5;
    static final int RIGHT_BRACKET = 4;
    static final int RIGHT_PAREN = 2;
    static final int SKIP = -2;
    static final int SLASH = 11;
    static final int STAR = 20;

    TokenTypes() {
    }

    /* access modifiers changed from: package-private */
    public String getTokenText(int i) {
        if (i == ERROR) {
            return "(error)";
        }
        switch (i) {
            case 1:
                return "(";
            case 2:
                return ")";
            case 3:
                return "[";
            case 4:
                return "]";
            case 5:
                return "+";
            case 6:
                return "-";
            case 7:
                return "<";
            case 8:
                return "<=";
            case 9:
                return ">";
            case 10:
                return ">=";
            case 11:
                return "/";
            case 12:
                return "//";
            case 13:
                return ".";
            case 14:
                return "..";
            case 15:
                return "(identifier)";
            case AT /*16*/:
                return "@";
            case PIPE /*17*/:
                return "|";
            case COLON /*18*/:
                return ":";
            case DOUBLE_COLON /*19*/:
                return "::";
            case STAR /*20*/:
                return "*";
            case EQUALS /*21*/:
                return "=";
            case NOT_EQUALS /*22*/:
                return "!=";
            case NOT /*23*/:
                return "!";
            case DIV /*24*/:
                return "div";
            case MOD /*25*/:
                return "mod";
            case DOLLAR /*26*/:
                return "$";
            case LITERAL /*27*/:
                return "(literal)";
            case AND /*28*/:
                return "and";
            case OR /*29*/:
                return "or";
            case INTEGER /*30*/:
                return "(integer)";
            case DOUBLE /*31*/:
                return "(double)";
            case COMMA /*32*/:
                return ",";
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unrecognized token type: ");
                stringBuffer.append(i);
                throw new JaxenRuntimeException(stringBuffer.toString());
        }
    }
}
