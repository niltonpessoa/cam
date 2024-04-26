package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

public abstract class a {
    protected static <T extends c> void B(T t, a aVar) {
        try {
            c(t).getDeclaredMethod("write", new Class[]{t.getClass(), a.class}).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private void E(c cVar) {
        try {
            z(d(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    private static <T extends c> Class c(T t) {
        return d(t.getClass());
    }

    private static Class d(Class<? extends c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    protected static <T extends c> T i(String str, a aVar) {
        Class<a> cls = a.class;
        try {
            return (c) Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls}).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public void A(String str, int i) {
        r(i);
        z(str);
    }

    /* access modifiers changed from: protected */
    public void C(c cVar) {
        if (cVar == null) {
            z((String) null);
            return;
        }
        E(cVar);
        a b2 = b();
        B(cVar, b2);
        b2.a();
    }

    public void D(c cVar, int i) {
        r(i);
        C(cVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract a b();

    public boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] f();

    public byte[] g(byte[] bArr, int i) {
        return !h(i) ? bArr : f();
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(int i);

    /* access modifiers changed from: protected */
    public abstract int j();

    public int k(int i, int i2) {
        return !h(i2) ? i : j();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t, int i) {
        return !h(i) ? t : l();
    }

    /* access modifiers changed from: protected */
    public abstract String n();

    public String o(String str, int i) {
        return !h(i) ? str : n();
    }

    /* access modifiers changed from: protected */
    public <T extends c> T p() {
        String n = n();
        if (n == null) {
            return null;
        }
        return i(n, b());
    }

    public <T extends c> T q(T t, int i) {
        return !h(i) ? t : p();
    }

    /* access modifiers changed from: protected */
    public abstract void r(int i);

    public void s(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public abstract void t(byte[] bArr);

    public void u(byte[] bArr, int i) {
        r(i);
        t(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void v(int i);

    public void w(int i, int i2) {
        r(i2);
        v(i);
    }

    /* access modifiers changed from: protected */
    public abstract void x(Parcelable parcelable);

    public void y(Parcelable parcelable, int i) {
        r(i);
        x(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void z(String str);
}
