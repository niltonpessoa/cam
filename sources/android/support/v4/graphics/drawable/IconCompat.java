package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f155a;

    /* renamed from: b  reason: collision with root package name */
    Object f156b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i;

    private static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static String g(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    public int a() {
        int i2 = this.f155a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f156b);
        }
        if (i2 == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        int i2 = this.f155a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f156b);
        }
        if (i2 == 2) {
            return ((String) this.f156b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void e() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        int i2 = this.f155a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.f156b = this.c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.f156b = new String(this.c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.d;
            if (parcelable == null) {
                byte[] bArr = this.c;
                this.f156b = bArr;
                this.f155a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            }
        } else {
            parcelable = this.d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f156b = parcelable;
    }

    public void f(boolean z) {
        this.i = this.h.name();
        int i2 = this.f155a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.c = ((String) this.f156b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 == 3) {
                    this.c = (byte[]) this.f156b;
                    return;
                } else if (i2 == 4) {
                    this.c = this.f156b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.f156b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.d = (Parcelable) this.f156b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f155a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f156b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f155a
            java.lang.String r1 = g(r1)
            r0.append(r1)
            int r1 = r4.f155a
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f156b
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.e
            r0.append(r1)
            int r1 = r4.f
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.c()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f156b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f156b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.g
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.g
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.h
            android.graphics.PorterDuff$Mode r2 = j
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.h
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
