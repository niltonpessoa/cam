package b.a.a.a.n0.p;

import android.net.Uri;
import java.util.Arrays;

public final class a {
    public static final a e = new a(new long[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f589a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f590b;
    public final C0033a[] c;
    public final long d;

    /* renamed from: b.a.a.a.n0.p.a$a  reason: collision with other inner class name */
    public static final class C0033a {

        /* renamed from: a  reason: collision with root package name */
        public final int f591a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f592b;
        public final long[] c;

        public C0033a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private C0033a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            b.a.a.a.r0.a.a(iArr.length == uriArr.length);
            this.f591a = i;
            this.f592b = iArr;
            this.c = jArr;
        }

        public int a() {
            return b(-1);
        }

        public int b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f592b;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        public boolean c() {
            return this.f591a == -1 || a() < this.f591a;
        }
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f589a = length;
        this.f590b = Arrays.copyOf(jArr, length);
        this.c = new C0033a[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = new C0033a();
        }
        this.d = 0;
    }

    public int a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f590b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.c[i].c())) {
                i++;
            }
        }
        if (i < this.f590b.length) {
            return i;
        }
        return -1;
    }

    public int b(long j) {
        int length = this.f590b.length - 1;
        while (length >= 0) {
            long[] jArr = this.f590b;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.c[length].c()) {
            return -1;
        }
        return length;
    }
}
