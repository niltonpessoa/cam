package com.xforce.v5.xdvpro.widget.r;

public interface o {

    public static class a {
        public static int a(int i, int i2, int i3) {
            return i < i3 ? i > i2 ? i : i2 : i3;
        }

        public static int b(double d) {
            return (int) (c(d, 0.0d, 255.0d) + 0.5d);
        }

        public static double c(double d, double d2, double d3) {
            return d < d3 ? d > d2 ? d : d2 : d3;
        }
    }

    r a(r rVar);
}
