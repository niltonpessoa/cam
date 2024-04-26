package org.jaxen.saxpath.base;

class XPathLexer {
    private int currentPosition;
    private int endPosition;
    private Token previousToken;
    private String xpath;

    XPathLexer() {
    }

    public XPathLexer(String str) {
        setXPath(str);
    }

    /* access modifiers changed from: package-private */
    public char LA(int i) {
        int i2 = i - 1;
        if (this.currentPosition + i2 >= endPosition()) {
            return 65535;
        }
        return getXPath().charAt(currentPosition() + i2);
    }

    /* access modifiers changed from: package-private */
    public Token and() {
        if (LA(1) != 'a' || LA(2) != 'n' || LA(3) != 'd' || isIdentifierChar(LA(4))) {
            return null;
        }
        Token token = new Token(28, getXPath(), currentPosition(), currentPosition() + 3);
        consume();
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token at() {
        Token token = new Token(16, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token colon() {
        Token token = new Token(18, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token comma() {
        Token token = new Token(32, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public void consume() {
        this.currentPosition++;
    }

    /* access modifiers changed from: package-private */
    public void consume(int i) {
        this.currentPosition += i;
    }

    /* access modifiers changed from: package-private */
    public int currentPosition() {
        return this.currentPosition;
    }

    /* access modifiers changed from: package-private */
    public Token div() {
        if (LA(1) != 'd' || LA(2) != 'i' || LA(3) != 'v' || isIdentifierChar(LA(4))) {
            return null;
        }
        Token token = new Token(24, getXPath(), currentPosition(), currentPosition() + 3);
        consume();
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token dollar() {
        Token token = new Token(26, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token dots() {
        if (LA(2) != '.') {
            Token token = new Token(13, getXPath(), currentPosition(), currentPosition() + 1);
            consume();
            return token;
        }
        Token token2 = new Token(14, getXPath(), currentPosition(), currentPosition() + 2);
        consume();
        consume();
        return token2;
    }

    /* access modifiers changed from: package-private */
    public Token doubleColon() {
        Token token = new Token(19, getXPath(), currentPosition(), currentPosition() + 2);
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public int endPosition() {
        return this.endPosition;
    }

    /* access modifiers changed from: package-private */
    public Token equals() {
        Token token = new Token(21, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token getPreviousToken() {
        return this.previousToken;
    }

    public String getXPath() {
        return this.xpath;
    }

    /* access modifiers changed from: package-private */
    public boolean hasMoreChars() {
        return currentPosition() < endPosition();
    }

    /* access modifiers changed from: package-private */
    public Token identifier() {
        int currentPosition2 = currentPosition();
        while (hasMoreChars() && isIdentifierChar(LA(1))) {
            consume();
        }
        return new Token(15, getXPath(), currentPosition2, currentPosition());
    }

    /* access modifiers changed from: package-private */
    public Token identifierOrOperatorName() {
        Token previousToken2 = getPreviousToken();
        if (previousToken2 != null) {
            switch (previousToken2.getTokenType()) {
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                case 25:
                case 26:
                case 28:
                case 29:
                case 32:
                    break;
                default:
                    return operatorName();
            }
        }
        return identifier();
    }

    /* access modifiers changed from: package-private */
    public boolean isIdentifierChar(char c) {
        return Verifier.isXMLNCNameCharacter(c);
    }

    /* access modifiers changed from: package-private */
    public boolean isIdentifierStartChar(char c) {
        return Verifier.isXMLNCNameStartCharacter(c);
    }

    /* access modifiers changed from: package-private */
    public Token leftBracket() {
        Token token = new Token(3, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token leftParen() {
        Token token = new Token(1, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token literal() {
        char LA = LA(1);
        consume();
        int currentPosition2 = currentPosition();
        Token token = null;
        while (token == null && hasMoreChars()) {
            if (LA(1) == LA) {
                token = new Token(27, getXPath(), currentPosition2, currentPosition());
            }
            consume();
        }
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token minus() {
        Token token = new Token(6, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token mod() {
        if (LA(1) != 'm' || LA(2) != 'o' || LA(3) != 'd' || isIdentifierChar(LA(4))) {
            return null;
        }
        Token token = new Token(25, getXPath(), currentPosition(), currentPosition() + 3);
        consume();
        consume();
        consume();
        return token;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jaxen.saxpath.base.Token nextToken() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 0
            r1 = 1
            char r2 = r5.LA(r1)
            r3 = 9
            if (r2 == r3) goto L_0x00c6
            r3 = 10
            if (r2 == r3) goto L_0x00c6
            r3 = 13
            if (r2 == r3) goto L_0x00c6
            r3 = 36
            if (r2 == r3) goto L_0x00c1
            r3 = 64
            if (r2 == r3) goto L_0x00bc
            r3 = 91
            if (r2 == r3) goto L_0x00b7
            r3 = 93
            if (r2 == r3) goto L_0x00b2
            r3 = 124(0x7c, float:1.74E-43)
            if (r2 == r3) goto L_0x00ad
            r3 = 2
            switch(r2) {
                case 32: goto L_0x00c6;
                case 33: goto L_0x009b;
                case 34: goto L_0x0096;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r2) {
                case 39: goto L_0x0096;
                case 40: goto L_0x0091;
                case 41: goto L_0x008c;
                case 42: goto L_0x0087;
                case 43: goto L_0x0082;
                case 44: goto L_0x007d;
                case 45: goto L_0x0078;
                case 46: goto L_0x006c;
                case 47: goto L_0x0066;
                case 48: goto L_0x0060;
                case 49: goto L_0x0060;
                case 50: goto L_0x0060;
                case 51: goto L_0x0060;
                case 52: goto L_0x0060;
                case 53: goto L_0x0060;
                case 54: goto L_0x0060;
                case 55: goto L_0x0060;
                case 56: goto L_0x0060;
                case 57: goto L_0x0060;
                case 58: goto L_0x004c;
                default: goto L_0x002d;
            }
        L_0x002d:
            switch(r2) {
                case 60: goto L_0x0046;
                case 61: goto L_0x0040;
                case 62: goto L_0x0046;
                default: goto L_0x0030;
            }
        L_0x0030:
            char r1 = r5.LA(r1)
            boolean r1 = r5.isIdentifierStartChar(r1)
            if (r1 == 0) goto L_0x00ca
            org.jaxen.saxpath.base.Token r0 = r5.identifierOrOperatorName()
            goto L_0x00ca
        L_0x0040:
            org.jaxen.saxpath.base.Token r0 = r5.equals()
            goto L_0x00ca
        L_0x0046:
            org.jaxen.saxpath.base.Token r0 = r5.relationalOperator()
            goto L_0x00ca
        L_0x004c:
            char r0 = r5.LA(r3)
            r1 = 58
            if (r0 != r1) goto L_0x005a
            org.jaxen.saxpath.base.Token r0 = r5.doubleColon()
            goto L_0x00ca
        L_0x005a:
            org.jaxen.saxpath.base.Token r0 = r5.colon()
            goto L_0x00ca
        L_0x0060:
            org.jaxen.saxpath.base.Token r0 = r5.number()
            goto L_0x00ca
        L_0x0066:
            org.jaxen.saxpath.base.Token r0 = r5.slashes()
            goto L_0x00ca
        L_0x006c:
            char r0 = r5.LA(r3)
            switch(r0) {
                case 48: goto L_0x0060;
                case 49: goto L_0x0060;
                case 50: goto L_0x0060;
                case 51: goto L_0x0060;
                case 52: goto L_0x0060;
                case 53: goto L_0x0060;
                case 54: goto L_0x0060;
                case 55: goto L_0x0060;
                case 56: goto L_0x0060;
                case 57: goto L_0x0060;
                default: goto L_0x0073;
            }
        L_0x0073:
            org.jaxen.saxpath.base.Token r0 = r5.dots()
            goto L_0x00ca
        L_0x0078:
            org.jaxen.saxpath.base.Token r0 = r5.minus()
            goto L_0x00ca
        L_0x007d:
            org.jaxen.saxpath.base.Token r0 = r5.comma()
            goto L_0x00ca
        L_0x0082:
            org.jaxen.saxpath.base.Token r0 = r5.plus()
            goto L_0x00ca
        L_0x0087:
            org.jaxen.saxpath.base.Token r0 = r5.star()
            goto L_0x00ca
        L_0x008c:
            org.jaxen.saxpath.base.Token r0 = r5.rightParen()
            goto L_0x00ca
        L_0x0091:
            org.jaxen.saxpath.base.Token r0 = r5.leftParen()
            goto L_0x00ca
        L_0x0096:
            org.jaxen.saxpath.base.Token r0 = r5.literal()
            goto L_0x00ca
        L_0x009b:
            char r0 = r5.LA(r3)
            r1 = 61
            if (r0 != r1) goto L_0x00a8
            org.jaxen.saxpath.base.Token r0 = r5.notEquals()
            goto L_0x00ca
        L_0x00a8:
            org.jaxen.saxpath.base.Token r0 = r5.not()
            goto L_0x00ca
        L_0x00ad:
            org.jaxen.saxpath.base.Token r0 = r5.pipe()
            goto L_0x00ca
        L_0x00b2:
            org.jaxen.saxpath.base.Token r0 = r5.rightBracket()
            goto L_0x00ca
        L_0x00b7:
            org.jaxen.saxpath.base.Token r0 = r5.leftBracket()
            goto L_0x00ca
        L_0x00bc:
            org.jaxen.saxpath.base.Token r0 = r5.at()
            goto L_0x00ca
        L_0x00c1:
            org.jaxen.saxpath.base.Token r0 = r5.dollar()
            goto L_0x00ca
        L_0x00c6:
            org.jaxen.saxpath.base.Token r0 = r5.whitespace()
        L_0x00ca:
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r5.hasMoreChars()
            if (r0 != 0) goto L_0x00e5
            org.jaxen.saxpath.base.Token r0 = new org.jaxen.saxpath.base.Token
            r1 = -1
            java.lang.String r2 = r5.getXPath()
            int r3 = r5.currentPosition()
            int r4 = r5.endPosition()
            r0.<init>(r1, r2, r3, r4)
            goto L_0x00f7
        L_0x00e5:
            org.jaxen.saxpath.base.Token r0 = new org.jaxen.saxpath.base.Token
            r1 = -3
            java.lang.String r2 = r5.getXPath()
            int r3 = r5.currentPosition()
            int r4 = r5.endPosition()
            r0.<init>(r1, r2, r3, r4)
        L_0x00f7:
            int r1 = r0.getTokenType()
            r2 = -2
            if (r1 == r2) goto L_0x0000
            r5.setPreviousToken(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.saxpath.base.XPathLexer.nextToken():org.jaxen.saxpath.base.Token");
    }

    /* access modifiers changed from: package-private */
    public Token not() {
        Token token = new Token(23, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token notEquals() {
        Token token = new Token(22, getXPath(), currentPosition(), currentPosition() + 2);
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token number() {
        Token token;
        int currentPosition2 = currentPosition();
        boolean z = true;
        while (true) {
            switch (LA(1)) {
                case '.':
                    if (!z) {
                        break;
                    } else {
                        z = false;
                        continue;
                    }
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
            }
            consume();
        }
        if (z) {
            String xPath = getXPath();
            int currentPosition3 = currentPosition();
        } else {
            token = new Token(31, getXPath(), currentPosition2, currentPosition());
        }
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token operatorName() {
        char LA = LA(1);
        if (LA == 'a') {
            return and();
        }
        if (LA == 'd') {
            return div();
        }
        if (LA == 'm') {
            return mod();
        }
        if (LA != 'o') {
            return null;
        }
        return or();
    }

    /* access modifiers changed from: package-private */
    public Token or() {
        if (LA(1) != 'o' || LA(2) != 'r' || isIdentifierChar(LA(3))) {
            return null;
        }
        Token token = new Token(29, getXPath(), currentPosition(), currentPosition() + 2);
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token pipe() {
        Token token = new Token(17, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token plus() {
        Token token = new Token(5, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token relationalOperator() {
        Token token;
        Token token2;
        char LA = LA(1);
        if (LA != '<') {
            if (LA != '>') {
                return null;
            }
            if (LA(2) == '=') {
                token = new Token(10, getXPath(), currentPosition(), currentPosition() + 2);
            } else {
                token2 = new Token(9, getXPath(), currentPosition(), currentPosition() + 1);
                token = token2;
                consume();
                return token;
            }
        } else if (LA(2) == '=') {
            token = new Token(8, getXPath(), currentPosition(), currentPosition() + 2);
        } else {
            token2 = new Token(7, getXPath(), currentPosition(), currentPosition() + 1);
            token = token2;
            consume();
            return token;
        }
        consume();
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token rightBracket() {
        Token token = new Token(4, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token rightParen() {
        Token token = new Token(2, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public void setPreviousToken(Token token) {
        this.previousToken = token;
    }

    /* access modifiers changed from: package-private */
    public void setXPath(String str) {
        this.xpath = str;
        this.currentPosition = 0;
        this.endPosition = str.length();
    }

    /* access modifiers changed from: package-private */
    public Token slashes() {
        if (LA(2) != '/') {
            Token token = new Token(11, getXPath(), currentPosition(), currentPosition() + 1);
            consume();
            return token;
        }
        Token token2 = new Token(12, getXPath(), currentPosition(), currentPosition() + 2);
        consume();
        consume();
        return token2;
    }

    /* access modifiers changed from: package-private */
    public Token star() {
        Token token = new Token(20, getXPath(), currentPosition(), currentPosition() + 1);
        consume();
        return token;
    }

    /* access modifiers changed from: package-private */
    public Token whitespace() {
        char LA;
        while (true) {
            consume();
            if (!hasMoreChars() || !((LA = LA(1)) == 9 || LA == 10 || LA == 13 || LA == ' ')) {
            }
        }
        return new Token(-2, getXPath(), 0, 0);
    }
}
