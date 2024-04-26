package android.support.v4.app;

import android.support.v4.app.e;
import android.support.v4.app.k;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class b extends p implements k.l {

    /* renamed from: a  reason: collision with root package name */
    final k f71a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f72b = new ArrayList<>();
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String j;
    boolean k;
    int l = -1;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList<String> q;
    ArrayList<String> r;
    boolean s = false;
    ArrayList<Runnable> t;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f73a;

        /* renamed from: b  reason: collision with root package name */
        e f74b;
        int c;
        int d;
        int e;
        int f;

        a() {
        }

        a(int i, e eVar) {
            this.f73a = i;
            this.f74b = eVar;
        }
    }

    public b(k kVar) {
        this.f71a = kVar;
    }

    private void i(int i2, e eVar, String str, int i3) {
        Class<?> cls = eVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        eVar.r = this.f71a;
        if (str != null) {
            String str2 = eVar.z;
            if (str2 == null || str.equals(str2)) {
                eVar.z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + eVar + ": was " + eVar.z + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = eVar.x;
                if (i4 == 0 || i4 == i2) {
                    eVar.x = i2;
                    eVar.y = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + eVar + ": was " + eVar.x + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + eVar + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i3, eVar));
    }

    private static boolean r(a aVar) {
        e eVar = aVar.f74b;
        return eVar != null && eVar.k && eVar.I != null && !eVar.B && !eVar.A && eVar.L();
    }

    public boolean a(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        if (k.E) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.f71a.h(this);
        return true;
    }

    public p b(int i2, e eVar, String str) {
        i(i2, eVar, str, 1);
        return this;
    }

    public p c(e eVar) {
        f(new a(7, eVar));
        return this;
    }

    public void d() {
        h();
        this.f71a.d0(this, true);
    }

    public p e(e eVar) {
        f(new a(6, eVar));
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f72b.add(aVar);
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    /* access modifiers changed from: package-private */
    public void g(int i2) {
        if (this.i) {
            if (k.E) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f72b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f72b.get(i3);
                e eVar = aVar.f74b;
                if (eVar != null) {
                    eVar.q += i2;
                    if (k.E) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f74b + " to " + aVar.f74b.q);
                    }
                }
            }
        }
    }

    public p h() {
        if (!this.i) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.k);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.c == 0 && this.d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.m == 0 && this.n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (!(this.o == 0 && this.p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.f72b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f72b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f72b.get(i2);
                switch (aVar.f73a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f73a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f74b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int size = this.f72b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f72b.get(i2);
            e eVar = aVar.f74b;
            if (eVar != null) {
                eVar.b1(this.g, this.h);
            }
            switch (aVar.f73a) {
                case 1:
                    eVar.a1(aVar.c);
                    this.f71a.i(eVar, false);
                    break;
                case 3:
                    eVar.a1(aVar.d);
                    this.f71a.L0(eVar);
                    break;
                case 4:
                    eVar.a1(aVar.d);
                    this.f71a.r0(eVar);
                    break;
                case 5:
                    eVar.a1(aVar.c);
                    this.f71a.b1(eVar);
                    break;
                case 6:
                    eVar.a1(aVar.d);
                    this.f71a.r(eVar);
                    break;
                case 7:
                    eVar.a1(aVar.c);
                    this.f71a.l(eVar);
                    break;
                case 8:
                    this.f71a.Y0(eVar);
                    break;
                case 9:
                    this.f71a.Y0((e) null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f73a);
            }
            if (!(this.s || aVar.f73a == 1 || eVar == null)) {
                this.f71a.B0(eVar);
            }
        }
        if (!this.s) {
            k kVar = this.f71a;
            kVar.C0(kVar.l, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z) {
        for (int size = this.f72b.size() - 1; size >= 0; size--) {
            a aVar = this.f72b.get(size);
            e eVar = aVar.f74b;
            if (eVar != null) {
                eVar.b1(k.Q0(this.g), this.h);
            }
            switch (aVar.f73a) {
                case 1:
                    eVar.a1(aVar.f);
                    this.f71a.L0(eVar);
                    break;
                case 3:
                    eVar.a1(aVar.e);
                    this.f71a.i(eVar, false);
                    break;
                case 4:
                    eVar.a1(aVar.e);
                    this.f71a.b1(eVar);
                    break;
                case 5:
                    eVar.a1(aVar.f);
                    this.f71a.r0(eVar);
                    break;
                case 6:
                    eVar.a1(aVar.e);
                    this.f71a.l(eVar);
                    break;
                case 7:
                    eVar.a1(aVar.f);
                    this.f71a.r(eVar);
                    break;
                case 8:
                    this.f71a.Y0((e) null);
                    break;
                case 9:
                    this.f71a.Y0(eVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f73a);
            }
            if (!(this.s || aVar.f73a == 3 || eVar == null)) {
                this.f71a.B0(eVar);
            }
        }
        if (!this.s && z) {
            k kVar = this.f71a;
            kVar.C0(kVar.l, true);
        }
    }

    /* access modifiers changed from: package-private */
    public e n(ArrayList<e> arrayList, e eVar) {
        ArrayList<e> arrayList2 = arrayList;
        e eVar2 = eVar;
        int i2 = 0;
        while (i2 < this.f72b.size()) {
            a aVar = this.f72b.get(i2);
            int i3 = aVar.f73a;
            if (i3 != 1) {
                if (i3 == 2) {
                    e eVar3 = aVar.f74b;
                    int i4 = eVar3.y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        e eVar4 = arrayList2.get(size);
                        if (eVar4.y == i4) {
                            if (eVar4 == eVar3) {
                                z = true;
                            } else {
                                if (eVar4 == eVar2) {
                                    this.f72b.add(i2, new a(9, eVar4));
                                    i2++;
                                    eVar2 = null;
                                }
                                a aVar2 = new a(3, eVar4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.f72b.add(i2, aVar2);
                                arrayList2.remove(eVar4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.f72b.remove(i2);
                        i2--;
                    } else {
                        aVar.f73a = 1;
                        arrayList2.add(eVar3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.f74b);
                    e eVar5 = aVar.f74b;
                    if (eVar5 == eVar2) {
                        this.f72b.add(i2, new a(9, eVar5));
                        i2++;
                        eVar2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f72b.add(i2, new a(9, eVar2));
                        i2++;
                        eVar2 = aVar.f74b;
                    }
                }
                i2++;
            }
            arrayList2.add(aVar.f74b);
            i2++;
        }
        return eVar2;
    }

    public String o() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean p(int i2) {
        int size = this.f72b.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = this.f72b.get(i3).f74b;
            int i4 = eVar != null ? eVar.y : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean q(ArrayList<b> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f72b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f72b.get(i5).f74b;
            int i6 = eVar != null ? eVar.y : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    b bVar = arrayList.get(i7);
                    int size2 = bVar.f72b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        e eVar2 = bVar.f72b.get(i8).f74b;
                        if ((eVar2 != null ? eVar2.y : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        for (int i2 = 0; i2 < this.f72b.size(); i2++) {
            if (r(this.f72b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.t.get(i2).run();
            }
            this.t = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(e.f fVar) {
        for (int i2 = 0; i2 < this.f72b.size(); i2++) {
            a aVar = this.f72b.get(i2);
            if (r(aVar)) {
                aVar.f74b.c1(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e v(ArrayList<e> arrayList, e eVar) {
        for (int i2 = 0; i2 < this.f72b.size(); i2++) {
            a aVar = this.f72b.get(i2);
            int i3 = aVar.f73a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            eVar = null;
                            break;
                        case 9:
                            eVar = aVar.f74b;
                            break;
                    }
                }
                arrayList.add(aVar.f74b);
            }
            arrayList.remove(aVar.f74b);
        }
        return eVar;
    }
}
