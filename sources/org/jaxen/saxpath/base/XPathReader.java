package org.jaxen.saxpath.base;

import com.google.android.exoplayer2.ui.g;
import java.util.LinkedList;
import org.jaxen.saxpath.Axis;
import org.jaxen.saxpath.XPathHandler;
import org.jaxen.saxpath.XPathSyntaxException;

public class XPathReader extends TokenTypes implements org.jaxen.saxpath.XPathReader {
    private XPathHandler handler;
    private XPathLexer lexer;
    private LinkedList tokens;

    public XPathReader() {
        setXPathHandler(DefaultXPathHandler.getInstance());
    }

    /* access modifiers changed from: package-private */
    public int LA(int i) {
        return LT(i).getTokenType();
    }

    /* access modifiers changed from: package-private */
    public Token LT(int i) {
        int i2 = i - 1;
        if (this.tokens.size() <= i2) {
            for (int i3 = 0; i3 < i; i3++) {
                this.tokens.add(this.lexer.nextToken());
            }
        }
        return (Token) this.tokens.get(i2);
    }

    /* access modifiers changed from: package-private */
    public void abbrStep() {
        int i;
        XPathHandler xPathHandler;
        int LA = LA(1);
        if (LA == 13) {
            match(13);
            xPathHandler = getXPathHandler();
            i = 11;
        } else if (LA == 14) {
            match(14);
            xPathHandler = getXPathHandler();
            i = 3;
        } else {
            return;
        }
        xPathHandler.startAllNodeStep(i);
        predicates();
        getXPathHandler().endAllNodeStep();
    }

    /* access modifiers changed from: package-private */
    public void absoluteLocationPath() {
        getXPathHandler().startAbsoluteLocationPath();
        int LA = LA(1);
        if (LA == 11) {
            match(11);
            int LA2 = LA(1);
            if (LA2 != 20) {
                switch (LA2) {
                    case 13:
                    case g.H:
                    case g.I:
                    case 16:
                        break;
                }
            }
        } else {
            if (LA == 12) {
                getXPathHandler().startAllNodeStep(12);
                getXPathHandler().endAllNodeStep();
                match(12);
                int LA3 = LA(1);
                if (LA3 != 20) {
                    switch (LA3) {
                        case 13:
                        case g.H:
                        case g.I:
                        case 16:
                            break;
                        default:
                            throw createSyntaxException("Location path cannot end with //");
                    }
                }
            }
            getXPathHandler().endAbsoluteLocationPath();
        }
        steps();
        getXPathHandler().endAbsoluteLocationPath();
    }

    /* access modifiers changed from: package-private */
    public void additiveExpr() {
        int i;
        getXPathHandler().startAdditiveExpr();
        getXPathHandler().startAdditiveExpr();
        multiplicativeExpr();
        int LA = LA(1);
        int i2 = 8;
        if (LA == 5) {
            match(5);
            multiplicativeExpr();
            i = 7;
        } else if (LA != 6) {
            i = 0;
        } else {
            match(6);
            multiplicativeExpr();
            i = 8;
        }
        getXPathHandler().endAdditiveExpr(i);
        int LA2 = LA(1);
        if (LA2 == 5) {
            match(5);
            additiveExpr();
            i2 = 7;
        } else if (LA2 != 6) {
            i2 = 0;
        } else {
            match(6);
            additiveExpr();
        }
        getXPathHandler().endAdditiveExpr(i2);
    }

    /* access modifiers changed from: package-private */
    public void andExpr() {
        getXPathHandler().startAndExpr();
        equalityExpr();
        boolean z = true;
        if (LA(1) != 28) {
            z = false;
        } else {
            match(28);
            andExpr();
        }
        getXPathHandler().endAndExpr(z);
    }

    /* access modifiers changed from: package-private */
    public void arguments() {
        while (LA(1) != 2) {
            expr();
            if (LA(1) == 32) {
                match(32);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int axisSpecifier() {
        int LA = LA(1);
        if (LA == 15) {
            Token LT = LT(1);
            int lookup = Axis.lookup(LT.getTokenText());
            if (lookup == 0) {
                throwInvalidAxis(LT.getTokenText());
            }
            match(15);
            match(19);
            return lookup;
        } else if (LA != 16) {
            return 0;
        } else {
            match(16);
            return 9;
        }
    }

    /* access modifiers changed from: package-private */
    public XPathSyntaxException createSyntaxException(String str) {
        return new XPathSyntaxException(this.lexer.getXPath(), LT(1).getTokenBegin(), str);
    }

    /* access modifiers changed from: package-private */
    public void equalityExpr() {
        int i;
        getXPathHandler().startEqualityExpr();
        getXPathHandler().startEqualityExpr();
        relationalExpr();
        int i2 = 1;
        int LA = LA(1);
        if (LA == 21) {
            match(21);
            relationalExpr();
            i = 1;
        } else if (LA != 22) {
            i = 0;
        } else {
            match(22);
            relationalExpr();
            i = 2;
        }
        getXPathHandler().endEqualityExpr(i);
        int LA2 = LA(1);
        if (LA2 == 21) {
            match(21);
            equalityExpr();
        } else if (LA2 != 22) {
            i2 = 0;
        } else {
            match(22);
            equalityExpr();
            i2 = 2;
        }
        getXPathHandler().endEqualityExpr(i2);
    }

    /* access modifiers changed from: package-private */
    public void expr() {
        orExpr();
    }

    /* access modifiers changed from: package-private */
    public void filterExpr() {
        getXPathHandler().startFilterExpr();
        int LA = LA(1);
        if (LA == 1) {
            match(1);
            expr();
            match(2);
        } else if (LA == 15) {
            functionCall();
        } else if (LA == 26) {
            variableReference();
        } else if (LA == 27) {
            literal();
        } else if (LA == 30) {
            numberInteger();
        } else if (LA == 31) {
            numberDouble();
        }
        predicates();
        getXPathHandler().endFilterExpr();
    }

    /* access modifiers changed from: package-private */
    public void functionCall() {
        String str;
        if (LA(2) == 18) {
            str = match(15).getTokenText();
            match(18);
        } else {
            str = "";
        }
        getXPathHandler().startFunction(str, match(15).getTokenText());
        match(1);
        arguments();
        match(2);
        getXPathHandler().endFunction();
    }

    public XPathHandler getXPathHandler() {
        return this.handler;
    }

    /* access modifiers changed from: package-private */
    public boolean isNodeTypeName(Token token) {
        String tokenText = token.getTokenText();
        return "node".equals(tokenText) || "comment".equals(tokenText) || "text".equals(tokenText) || "processing-instruction".equals(tokenText);
    }

    /* access modifiers changed from: package-private */
    public void literal() {
        getXPathHandler().literal(match(27).getTokenText());
    }

    /* access modifiers changed from: package-private */
    public void locationPath(boolean z) {
        int LA = LA(1);
        if (LA != 20) {
            switch (LA) {
                case 11:
                case 12:
                    if (z) {
                        absoluteLocationPath();
                        return;
                    }
                    break;
                case 13:
                case g.H:
                case g.I:
                case 16:
                    break;
                default:
                    throwUnexpected();
                    return;
            }
        }
        relativeLocationPath();
    }

    /* access modifiers changed from: package-private */
    public Token match(int i) {
        LT(1);
        Token token = (Token) this.tokens.get(0);
        if (token.getTokenType() == i) {
            this.tokens.removeFirst();
            return token;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected: ");
        stringBuffer.append(getTokenText(i));
        throw createSyntaxException(stringBuffer.toString());
    }

    /* access modifiers changed from: package-private */
    public void multiplicativeExpr() {
        int i;
        getXPathHandler().startMultiplicativeExpr();
        getXPathHandler().startMultiplicativeExpr();
        unaryExpr();
        int LA = LA(1);
        int i2 = 10;
        if (LA == 20) {
            match(20);
            unaryExpr();
            i = 9;
        } else if (LA == 24) {
            match(24);
            unaryExpr();
            i = 11;
        } else if (LA != 25) {
            i = 0;
        } else {
            match(25);
            unaryExpr();
            i = 10;
        }
        getXPathHandler().endMultiplicativeExpr(i);
        int LA2 = LA(1);
        if (LA2 == 20) {
            match(20);
            multiplicativeExpr();
            i2 = 9;
        } else if (LA2 == 24) {
            match(24);
            multiplicativeExpr();
            i2 = 11;
        } else if (LA2 != 25) {
            i2 = 0;
        } else {
            match(25);
            multiplicativeExpr();
        }
        getXPathHandler().endMultiplicativeExpr(i2);
    }

    /* access modifiers changed from: package-private */
    public void nameTest(int i) {
        String str;
        String str2 = null;
        if (LA(2) == 18 && LA(1) == 15) {
            str = match(15).getTokenText();
            match(18);
        } else {
            str = null;
        }
        int LA = LA(1);
        if (LA == 15) {
            str2 = match(15).getTokenText();
        } else if (LA == 20) {
            match(20);
            str2 = "*";
        }
        if (str == null) {
            str = "";
        }
        getXPathHandler().startNameStep(i, str, str2);
        predicates();
        getXPathHandler().endNameStep();
    }

    /* access modifiers changed from: package-private */
    public void nodeTest(int i) {
        int LA = LA(1);
        if (LA != 15) {
            if (LA != 20) {
                throw createSyntaxException("Expected <QName> or *");
            }
        } else if (LA(2) == 1) {
            nodeTypeTest(i);
            return;
        }
        nameTest(i);
    }

    /* access modifiers changed from: package-private */
    public void nodeTypeTest(int i) {
        String tokenText = match(15).getTokenText();
        match(1);
        if ("processing-instruction".equals(tokenText)) {
            String tokenText2 = LA(1) == 27 ? match(27).getTokenText() : "";
            match(2);
            getXPathHandler().startProcessingInstructionNodeStep(i, tokenText2);
            predicates();
            getXPathHandler().endProcessingInstructionNodeStep();
        } else if ("node".equals(tokenText)) {
            match(2);
            getXPathHandler().startAllNodeStep(i);
            predicates();
            getXPathHandler().endAllNodeStep();
        } else if ("text".equals(tokenText)) {
            match(2);
            getXPathHandler().startTextNodeStep(i);
            predicates();
            getXPathHandler().endTextNodeStep();
        } else if ("comment".equals(tokenText)) {
            match(2);
            getXPathHandler().startCommentNodeStep(i);
            predicates();
            getXPathHandler().endCommentNodeStep();
        } else {
            throw createSyntaxException("Expected node-type");
        }
    }

    /* access modifiers changed from: package-private */
    public void numberDouble() {
        getXPathHandler().number(Double.parseDouble(match(31).getTokenText()));
    }

    /* access modifiers changed from: package-private */
    public void numberInteger() {
        String tokenText = match(30).getTokenText();
        try {
            getXPathHandler().number(Integer.parseInt(tokenText));
        } catch (NumberFormatException unused) {
            getXPathHandler().number(Double.parseDouble(tokenText));
        }
    }

    /* access modifiers changed from: package-private */
    public void orExpr() {
        getXPathHandler().startOrExpr();
        andExpr();
        boolean z = true;
        if (LA(1) != 29) {
            z = false;
        } else {
            match(29);
            orExpr();
        }
        getXPathHandler().endOrExpr(z);
    }

    public void parse(String str) {
        setUpParse(str);
        getXPathHandler().startXPath();
        expr();
        getXPathHandler().endXPath();
        if (LA(1) != -1) {
            throwUnexpected();
        }
        this.lexer = null;
        this.tokens = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (LA(1) != 12) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pathExpr() {
        /*
            r6 = this;
            org.jaxen.saxpath.XPathHandler r0 = r6.getXPathHandler()
            r0.startPathExpr()
            r0 = 1
            int r1 = r6.LA(r0)
            r2 = 12
            r3 = 11
            if (r1 == r0) goto L_0x0066
            r4 = 20
            r5 = 0
            if (r1 == r4) goto L_0x0062
            r4 = 26
            if (r1 == r4) goto L_0x0066
            r4 = 27
            if (r1 == r4) goto L_0x0066
            r4 = 30
            if (r1 == r4) goto L_0x0066
            r4 = 31
            if (r1 == r4) goto L_0x0066
            switch(r1) {
                case 11: goto L_0x005e;
                case 12: goto L_0x005e;
                case 13: goto L_0x0062;
                case 14: goto L_0x0062;
                case 15: goto L_0x002e;
                case 16: goto L_0x0062;
                default: goto L_0x002a;
            }
        L_0x002a:
            r6.throwUnexpected()
            goto L_0x0075
        L_0x002e:
            r1 = 2
            int r4 = r6.LA(r1)
            if (r4 != r0) goto L_0x003f
            org.jaxen.saxpath.base.Token r4 = r6.LT(r0)
            boolean r4 = r6.isNodeTypeName(r4)
            if (r4 == 0) goto L_0x004e
        L_0x003f:
            int r1 = r6.LA(r1)
            r4 = 18
            if (r1 != r4) goto L_0x0062
            r1 = 4
            int r1 = r6.LA(r1)
            if (r1 != r0) goto L_0x0062
        L_0x004e:
            r6.filterExpr()
            int r1 = r6.LA(r0)
            if (r1 == r3) goto L_0x0062
            int r0 = r6.LA(r0)
            if (r0 != r2) goto L_0x0075
            goto L_0x0062
        L_0x005e:
            r6.locationPath(r0)
            goto L_0x0075
        L_0x0062:
            r6.locationPath(r5)
            goto L_0x0075
        L_0x0066:
            r6.filterExpr()
            int r1 = r6.LA(r0)
            if (r1 == r3) goto L_0x007d
            int r0 = r6.LA(r0)
            if (r0 == r2) goto L_0x007d
        L_0x0075:
            org.jaxen.saxpath.XPathHandler r0 = r6.getXPathHandler()
            r0.endPathExpr()
            return
        L_0x007d:
            java.lang.String r0 = "Node-set expected"
            org.jaxen.saxpath.XPathSyntaxException r0 = r6.createSyntaxException(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.saxpath.base.XPathReader.pathExpr():void");
    }

    /* access modifiers changed from: package-private */
    public void predicate() {
        getXPathHandler().startPredicate();
        match(3);
        predicateExpr();
        match(4);
        getXPathHandler().endPredicate();
    }

    /* access modifiers changed from: package-private */
    public void predicateExpr() {
        expr();
    }

    /* access modifiers changed from: package-private */
    public void predicates() {
        while (LA(1) == 3) {
            predicate();
        }
    }

    /* access modifiers changed from: package-private */
    public void relationalExpr() {
        int i;
        getXPathHandler().startRelationalExpr();
        getXPathHandler().startRelationalExpr();
        additiveExpr();
        int i2 = 6;
        switch (LA(1)) {
            case 7:
                match(7);
                additiveExpr();
                i = 3;
                break;
            case 8:
                match(8);
                additiveExpr();
                i = 4;
                break;
            case 9:
                match(9);
                additiveExpr();
                i = 5;
                break;
            case 10:
                match(10);
                additiveExpr();
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        getXPathHandler().endRelationalExpr(i);
        switch (LA(1)) {
            case 7:
                match(7);
                relationalExpr();
                i2 = 3;
                break;
            case 8:
                match(8);
                relationalExpr();
                i2 = 4;
                break;
            case 9:
                match(9);
                relationalExpr();
                i2 = 5;
                break;
            case 10:
                match(10);
                relationalExpr();
                break;
            default:
                i2 = 0;
                break;
        }
        getXPathHandler().endRelationalExpr(i2);
    }

    /* access modifiers changed from: package-private */
    public void relativeLocationPath() {
        getXPathHandler().startRelativeLocationPath();
        int LA = LA(1);
        int i = 11;
        if (LA != 11) {
            i = 12;
            if (LA == 12) {
                getXPathHandler().startAllNodeStep(12);
                getXPathHandler().endAllNodeStep();
            }
            steps();
            getXPathHandler().endRelativeLocationPath();
        }
        match(i);
        steps();
        getXPathHandler().endRelativeLocationPath();
    }

    /* access modifiers changed from: package-private */
    public void setUpParse(String str) {
        this.tokens = new LinkedList();
        this.lexer = new XPathLexer(str);
    }

    public void setXPathHandler(XPathHandler xPathHandler) {
        this.handler = xPathHandler;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (LA(2) == 19) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void step() {
        /*
            r3 = this;
            r0 = 1
            int r1 = r3.LA(r0)
            r2 = 20
            if (r1 == r2) goto L_0x0021
            switch(r1) {
                case 13: goto L_0x001d;
                case 14: goto L_0x001d;
                case 15: goto L_0x0013;
                case 16: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0 = 0
            goto L_0x0021
        L_0x000e:
            int r0 = r3.axisSpecifier()
            goto L_0x0021
        L_0x0013:
            r1 = 2
            int r1 = r3.LA(r1)
            r2 = 19
            if (r1 != r2) goto L_0x0021
            goto L_0x000e
        L_0x001d:
            r3.abbrStep()
            return
        L_0x0021:
            r3.nodeTest(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.saxpath.base.XPathReader.step():void");
    }

    /* access modifiers changed from: package-private */
    public void steps() {
        int LA = LA(1);
        if (LA != -1) {
            if (LA != 20) {
                switch (LA) {
                    case 13:
                    case g.H:
                    case g.I:
                    case 16:
                        break;
                    default:
                        throw createSyntaxException("Expected one of '.', '..', '@', '*', <QName>");
                }
            }
            while (true) {
                step();
                if (LA(1) == 11 || LA(1) == 12) {
                    int LA2 = LA(1);
                    if (LA2 == 11) {
                        match(11);
                    } else if (LA2 == 12) {
                        getXPathHandler().startAllNodeStep(12);
                        getXPathHandler().endAllNodeStep();
                        match(12);
                    }
                    int LA3 = LA(1);
                    if (LA3 != 20) {
                        switch (LA3) {
                            case 13:
                            case g.H:
                            case g.I:
                            case 16:
                                break;
                            default:
                                throw createSyntaxException("Expected one of '.', '..', '@', '*', <QName>");
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void throwInvalidAxis(String str) {
        String xPath = this.lexer.getXPath();
        int tokenBegin = LT(1).getTokenBegin();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected valid axis name instead of [");
        stringBuffer.append(str);
        stringBuffer.append("]");
        throw new XPathSyntaxException(xPath, tokenBegin, stringBuffer.toString());
    }

    /* access modifiers changed from: package-private */
    public void throwUnexpected() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unexpected '");
        stringBuffer.append(LT(1).getTokenText());
        stringBuffer.append("'");
        throw createSyntaxException(stringBuffer.toString());
    }

    /* access modifiers changed from: package-private */
    public void unaryExpr() {
        int i;
        getXPathHandler().startUnaryExpr();
        if (LA(1) != 6) {
            unionExpr();
            i = 0;
        } else {
            match(6);
            i = 12;
            unaryExpr();
        }
        getXPathHandler().endUnaryExpr(i);
    }

    /* access modifiers changed from: package-private */
    public void unionExpr() {
        getXPathHandler().startUnionExpr();
        pathExpr();
        boolean z = true;
        if (LA(1) != 17) {
            z = false;
        } else {
            match(17);
            expr();
        }
        getXPathHandler().endUnionExpr(z);
    }

    /* access modifiers changed from: package-private */
    public void variableReference() {
        String str;
        match(26);
        if (LA(2) == 18) {
            str = match(15).getTokenText();
            match(18);
        } else {
            str = "";
        }
        getXPathHandler().variableReference(str, match(15).getTokenText());
    }
}
