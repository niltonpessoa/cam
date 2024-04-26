package b.a.a.a.q0;

import android.net.Uri;
import android.util.Log;
import b.a.a.a.q0.o;
import b.a.a.a.r0.a;
import b.a.a.a.r0.o;
import b.a.a.a.r0.w;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class l implements o {
    private static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> r = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f699a;

    /* renamed from: b  reason: collision with root package name */
    private final int f700b;
    private final int c;
    private final String d;
    private final o<String> e;
    private final o.e f;
    private final o.e g = new o.e();
    private final r<? super l> h;
    private h i;
    private HttpURLConnection j;
    private InputStream k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;

    public l(String str, b.a.a.a.r0.o<String> oVar, r<? super l> rVar, int i2, int i3, boolean z, o.e eVar) {
        a.d(str);
        this.d = str;
        this.e = oVar;
        this.h = rVar;
        this.f700b = i2;
        this.c = i3;
        this.f699a = z;
        this.f = eVar;
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.j = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long f(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00a4
            java.util.regex.Pattern r1 = q
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00a4
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x008d }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x008d }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0064
            r4 = r6
            goto L_0x00a4
        L_0x0064:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x008d }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x008d }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x008d }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x008d }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x008d }
            r4 = r0
            goto L_0x00a4
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.q0.l.f(java.net.HttpURLConnection):long");
    }

    private static URL g(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    private HttpURLConnection h(h hVar) {
        HttpURLConnection i2;
        h hVar2 = hVar;
        URL url = new URL(hVar2.f691a.toString());
        byte[] bArr = hVar2.f692b;
        long j2 = hVar2.d;
        long j3 = hVar2.e;
        boolean a2 = hVar2.a(1);
        if (!this.f699a) {
            return i(url, bArr, j2, j3, a2, true);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j4 = j2;
                int i5 = i4;
                i2 = i(url, bArr, j2, j3, a2, false);
                int responseCode = i2.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = i2.getHeaderField("Location");
                    i2.disconnect();
                    url = g(url, headerField);
                    i3 = i5;
                    j2 = j4;
                }
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i4);
            }
        }
        return i2;
    }

    private HttpURLConnection i(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f700b);
        httpURLConnection.setReadTimeout(this.c);
        o.e eVar = this.f;
        if (eVar != null) {
            for (Map.Entry next : eVar.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        for (Map.Entry next2 : this.g.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            String str = "bytes=" + j2 + "-";
            if (j3 != -1) {
                str = str + ((j2 + j3) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private static void j(HttpURLConnection httpURLConnection, long j2) {
        int i2 = w.f743a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int k(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.n;
        if (j2 != -1) {
            long j3 = j2 - this.p;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min((long) i3, j3);
        }
        int read = this.k.read(bArr, i2, i3);
        if (read != -1) {
            this.p += (long) read;
            r<? super l> rVar = this.h;
            if (rVar != null) {
                rVar.c(this, read);
            }
            return read;
        } else if (this.n == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    private void l() {
        if (this.o != this.m) {
            byte[] andSet = r.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j2 = this.o;
                long j3 = this.m;
                if (j2 != j3) {
                    int read = this.k.read(andSet, 0, (int) Math.min(j3 - j2, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.o += (long) read;
                        r<? super l> rVar = this.h;
                        if (rVar != null) {
                            rVar.c(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    r.set(andSet);
                    return;
                }
            }
        }
    }

    public int a(byte[] bArr, int i2, int i3) {
        try {
            l();
            return k(bArr, i2, i3);
        } catch (IOException e2) {
            throw new o.b(e2, this.i, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(b.a.a.a.q0.h r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to connect to "
            r7.i = r8
            r1 = 0
            r7.p = r1
            r7.o = r1
            r3 = 1
            java.net.HttpURLConnection r4 = r7.h(r8)     // Catch:{ IOException -> 0x00c0 }
            r7.j = r4     // Catch:{ IOException -> 0x00c0 }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x00a1 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 < r4) goto L_0x0085
            r5 = 299(0x12b, float:4.19E-43)
            if (r0 <= r5) goto L_0x001e
            goto L_0x0085
        L_0x001e:
            java.net.HttpURLConnection r5 = r7.j
            java.lang.String r5 = r5.getContentType()
            b.a.a.a.r0.o<java.lang.String> r6 = r7.e
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.evaluate(r5)
            if (r6 == 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            r7.e()
            b.a.a.a.q0.o$c r0 = new b.a.a.a.q0.o$c
            r0.<init>(r5, r8)
            throw r0
        L_0x0038:
            if (r0 != r4) goto L_0x0041
            long r4 = r8.d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            r1 = r4
        L_0x0041:
            r7.m = r1
            boolean r0 = r8.a(r3)
            if (r0 != 0) goto L_0x0063
            long r0 = r8.e
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            goto L_0x0065
        L_0x0052:
            java.net.HttpURLConnection r0 = r7.j
            long r0 = f(r0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0060
            long r4 = r7.m
            long r4 = r0 - r4
        L_0x0060:
            r7.n = r4
            goto L_0x0067
        L_0x0063:
            long r0 = r8.e
        L_0x0065:
            r7.n = r0
        L_0x0067:
            java.net.HttpURLConnection r0 = r7.j     // Catch:{ IOException -> 0x007b }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x007b }
            r7.k = r0     // Catch:{ IOException -> 0x007b }
            r7.l = r3
            b.a.a.a.q0.r<? super b.a.a.a.q0.l> r0 = r7.h
            if (r0 == 0) goto L_0x0078
            r0.b(r7, r8)
        L_0x0078:
            long r0 = r7.n
            return r0
        L_0x007b:
            r0 = move-exception
            r7.e()
            b.a.a.a.q0.o$b r1 = new b.a.a.a.q0.o$b
            r1.<init>((java.io.IOException) r0, (b.a.a.a.q0.h) r8, (int) r3)
            throw r1
        L_0x0085:
            java.net.HttpURLConnection r1 = r7.j
            java.util.Map r1 = r1.getHeaderFields()
            r7.e()
            b.a.a.a.q0.o$d r2 = new b.a.a.a.q0.o$d
            r2.<init>(r0, r1, r8)
            r8 = 416(0x1a0, float:5.83E-43)
            if (r0 != r8) goto L_0x00a0
            b.a.a.a.q0.g r8 = new b.a.a.a.q0.g
            r0 = 0
            r8.<init>(r0)
            r2.initCause(r8)
        L_0x00a0:
            throw r2
        L_0x00a1:
            r1 = move-exception
            r7.e()
            b.a.a.a.q0.o$b r2 = new b.a.a.a.q0.o$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.f691a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        L_0x00c0:
            r1 = move-exception
            b.a.a.a.q0.o$b r2 = new b.a.a.a.q0.o$b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.f691a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.q0.l.b(b.a.a.a.q0.h):long");
    }

    public Uri c() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public void close() {
        try {
            if (this.k != null) {
                j(this.j, d());
                this.k.close();
            }
            this.k = null;
            e();
            if (this.l) {
                this.l = false;
                r<? super l> rVar = this.h;
                if (rVar != null) {
                    rVar.a(this);
                }
            }
        } catch (IOException e2) {
            throw new o.b(e2, this.i, 3);
        } catch (Throwable th) {
            this.k = null;
            e();
            if (this.l) {
                this.l = false;
                r<? super l> rVar2 = this.h;
                if (rVar2 != null) {
                    rVar2.a(this);
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final long d() {
        long j2 = this.n;
        return j2 == -1 ? j2 : j2 - this.p;
    }
}
