package android.support.v4.media;

import java.util.Arrays;

class c implements a {

    /* renamed from: a  reason: collision with root package name */
    int f171a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f172b = 0;
    int c = 0;
    int d = -1;

    c() {
    }

    public int a() {
        return this.f172b;
    }

    public int b() {
        int i = this.c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.d;
        return i != -1 ? i : AudioAttributesCompat.a(false, this.c, this.f171a);
    }

    public int d() {
        return this.f171a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f172b == cVar.a() && this.c == cVar.b() && this.f171a == cVar.d() && this.d == cVar.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f172b), Integer.valueOf(this.c), Integer.valueOf(this.f171a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f171a));
        sb.append(" content=");
        sb.append(this.f172b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
