package b.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b.a.a.a.h0.d;
import b.a.a.a.j0.c;
import b.a.a.a.j0.e;
import b.a.a.a.m0.f;
import b.a.a.a.o0.k;
import b.a.a.a.o0.l;
import b.a.a.a.s0.h;
import java.util.ArrayList;

public class g implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f237a;

    /* renamed from: b  reason: collision with root package name */
    private final c<e> f238b;
    private final int c;
    private final long d;

    public g(Context context) {
        this(context, (c<e>) null);
    }

    public g(Context context, c<e> cVar) {
        this(context, cVar, 0);
    }

    public g(Context context, c<e> cVar, int i) {
        this(context, cVar, i, 5000);
    }

    public g(Context context, c<e> cVar, int i, long j) {
        this.f237a = context;
        this.f238b = cVar;
        this.c = i;
        this.d = j;
    }

    public a0[] a(Handler handler, h hVar, b.a.a.a.h0.e eVar, k kVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        g(this.f237a, this.f238b, this.d, handler, hVar, this.c, arrayList);
        c(this.f237a, this.f238b, b(), handler, eVar, this.c, arrayList);
        ArrayList arrayList2 = arrayList;
        f(this.f237a, kVar, handler.getLooper(), this.c, arrayList2);
        d(this.f237a, fVar, handler.getLooper(), this.c, arrayList2);
        e(this.f237a, handler, this.c, arrayList);
        return (a0[]) arrayList.toArray(new a0[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    public d[] b() {
        return new d[0];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r15, b.a.a.a.j0.c<b.a.a.a.j0.e> r16, b.a.a.a.h0.d[] r17, android.os.Handler r18, b.a.a.a.h0.e r19, int r20, java.util.ArrayList<b.a.a.a.a0> r21) {
        /*
            r14 = this;
            r0 = r20
            r9 = r21
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<b.a.a.a.h0.d[]> r11 = b.a.a.a.h0.d[].class
            java.lang.Class<b.a.a.a.h0.e> r12 = b.a.a.a.h0.e.class
            b.a.a.a.h0.k r13 = new b.a.a.a.h0.k
            b.a.a.a.l0.c r2 = b.a.a.a.l0.c.f500a
            b.a.a.a.h0.c r7 = b.a.a.a.h0.c.a(r15)
            r4 = 1
            r1 = r13
            r3 = r16
            r5 = r18
            r6 = r19
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.add(r13)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            int r1 = r21.size()
            r2 = 2
            if (r0 != r2) goto L_0x002e
            int r1 = r1 + -1
        L_0x002e:
            r0 = 0
            r3 = 3
            r4 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r4] = r12     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r2] = r11     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r0] = r18     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r4] = r19     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r2] = r17     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            b.a.a.a.a0 r5 = (b.a.a.a.a0) r5     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            int r6 = r1 + 1
            r9.add(r1, r5)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r10, r1)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            goto L_0x006a
        L_0x005e:
            r1 = r6
            goto L_0x0069
        L_0x0060:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0069:
            r6 = r1
        L_0x006a:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r4] = r12     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r2] = r11     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r0] = r18     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r4] = r19     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r2] = r17     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            b.a.a.a.a0 r1 = (b.a.a.a.a0) r1     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            int r5 = r6 + 1
            r9.add(r6, r1)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0099 }
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r10, r1)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0097:
            r6 = r5
            goto L_0x00a2
        L_0x0099:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a2:
            r5 = r6
        L_0x00a3:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r6[r4] = r12     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r6[r2] = r11     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r0] = r18     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r4] = r19     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r2] = r17     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Object r0 = r1.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            b.a.a.a.a0 r0 = (b.a.a.a.a0) r0     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r9.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            goto L_0x00d7
        L_0x00ce:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.g.c(android.content.Context, b.a.a.a.j0.c, b.a.a.a.h0.d[], android.os.Handler, b.a.a.a.h0.e, int, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public void d(Context context, f fVar, Looper looper, int i, ArrayList<a0> arrayList) {
        arrayList.add(new b.a.a.a.m0.g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    public void e(Context context, Handler handler, int i, ArrayList<a0> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void f(Context context, k kVar, Looper looper, int i, ArrayList<a0> arrayList) {
        arrayList.add(new l(kVar, looper));
    }

    /* access modifiers changed from: protected */
    public void g(Context context, c<e> cVar, long j, Handler handler, h hVar, int i, ArrayList<a0> arrayList) {
        int i2 = i;
        ArrayList<a0> arrayList2 = arrayList;
        arrayList2.add(new b.a.a.a.s0.e(context, b.a.a.a.l0.c.f500a, j, cVar, false, handler, hVar, 50));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (a0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, h.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(j), handler, hVar, 50}));
                Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }
}
