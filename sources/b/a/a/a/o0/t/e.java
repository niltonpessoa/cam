package b.a.a.a.o0.t;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;

public final class e extends b.a.a.a.o0.b {
    public final long m;
    public final long n;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f655a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f655a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f655a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f655a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.t.e.a.<clinit>():void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f656a;

        /* renamed from: b  reason: collision with root package name */
        private long f657b;
        private SpannableStringBuilder c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private float j;

        public b() {
            c();
        }

        private b b() {
            Layout.Alignment alignment = this.d;
            if (alignment == null) {
                this.i = Integer.MIN_VALUE;
            } else {
                int i2 = a.f655a[alignment.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.i = 1;
                    } else if (i2 != 3) {
                        Log.w("WebvttCueBuilder", "Unrecognized alignment: " + this.d);
                    } else {
                        this.i = 2;
                    }
                }
                this.i = 0;
            }
            return this;
        }

        public e a() {
            if (this.h != Float.MIN_VALUE && this.i == Integer.MIN_VALUE) {
                b();
            }
            return new e(this.f656a, this.f657b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public void c() {
            this.f656a = 0;
            this.f657b = 0;
            this.c = null;
            this.d = null;
            this.e = Float.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Float.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public b d(long j2) {
            this.f657b = j2;
            return this;
        }

        public b e(float f2) {
            this.e = f2;
            return this;
        }

        public b f(int i2) {
            this.g = i2;
            return this;
        }

        public b g(int i2) {
            this.f = i2;
            return this;
        }

        public b h(float f2) {
            this.h = f2;
            return this;
        }

        public b i(int i2) {
            this.i = i2;
            return this;
        }

        public b j(long j2) {
            this.f656a = j2;
            return this;
        }

        public b k(SpannableStringBuilder spannableStringBuilder) {
            this.c = spannableStringBuilder;
            return this;
        }

        public b l(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b m(float f2) {
            this.j = f2;
            return this;
        }
    }

    public e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.m = j;
        this.n = j2;
    }

    public e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    public boolean a() {
        return this.d == Float.MIN_VALUE && this.g == Float.MIN_VALUE;
    }
}
