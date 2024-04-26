package b.b.a;

import java.io.File;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private a f794a;

    /* renamed from: b  reason: collision with root package name */
    private d f795b;
    private boolean c = false;

    public c(a aVar, d dVar) {
        this.f794a = aVar;
        this.f795b = dVar;
    }

    private void b(File file) {
        b.a(0, "RPDLRunnable", "cancelDownloadOpt() name = " + this.f794a.c());
        if (file.exists()) {
            file.delete();
        }
        d dVar = this.f795b;
        if (dVar != null) {
            dVar.a(102, this);
        }
    }

    public void a() {
        b.a(0, "RPDLRunnable", "cancelDownload() name = " + this.f794a.c());
        if (!this.c) {
            this.c = true;
        }
    }

    public a c() {
        return this.f794a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r17v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r17v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r17v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r17v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: type inference failed for: r17v9 */
    /* JADX WARNING: type inference failed for: r17v10 */
    /* JADX WARNING: type inference failed for: r17v11 */
    /* JADX WARNING: type inference failed for: r17v12 */
    /* JADX WARNING: type inference failed for: r17v13 */
    /* JADX WARNING: type inference failed for: r17v14 */
    /* JADX WARNING: type inference failed for: r17v15 */
    /* JADX WARNING: type inference failed for: r17v16 */
    /* JADX WARNING: type inference failed for: r17v17 */
    /* JADX WARNING: type inference failed for: r17v18 */
    /* JADX WARNING: type inference failed for: r17v19 */
    /* JADX WARNING: type inference failed for: r17v20 */
    /* JADX WARNING: type inference failed for: r17v21 */
    /* JADX WARNING: type inference failed for: r17v22 */
    /* JADX WARNING: type inference failed for: r17v23 */
    /* JADX WARNING: type inference failed for: r17v24 */
    /* JADX WARNING: type inference failed for: r17v25 */
    /* JADX WARNING: type inference failed for: r17v26 */
    /* JADX WARNING: type inference failed for: r17v27 */
    /* JADX WARNING: type inference failed for: r17v28 */
    /* JADX WARNING: type inference failed for: r17v29 */
    /* JADX WARNING: type inference failed for: r17v30 */
    /* JADX WARNING: type inference failed for: r2v47, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v31, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:(1:52)|(2:54|55)|56|57|239) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:70|(1:72)|(2:74|75)|76|77|241) */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024b, code lost:
        r2 = r16;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0251, code lost:
        r2 = r16;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0257, code lost:
        r2 = r16;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026e, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0272, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0276, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ee, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ef, code lost:
        r16 = r8;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        r16 = r8;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0175, code lost:
        r16 = r8;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        r16 = r8;
        r2 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x02ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x016a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x01b2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:84:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ee A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v38 java.net.HttpURLConnection) = (r2v27 java.net.HttpURLConnection), (r2v75 java.net.HttpURLConnection), (r2v79 java.net.HttpURLConnection) binds: [B:38:0x00d9, B:44:0x010e, B:45:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:38:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x035e A[SYNTHETIC, Splitter:B:192:0x035e] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0393 A[SYNTHETIC, Splitter:B:203:0x0393] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03c8 A[SYNTHETIC, Splitter:B:214:0x03c8] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03da A[SYNTHETIC, Splitter:B:223:0x03da] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03e1 A[SYNTHETIC, Splitter:B:227:0x03e1] */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:209:0x03a0=Splitter:B:209:0x03a0, B:187:0x0336=Splitter:B:187:0x0336, B:198:0x036b=Splitter:B:198:0x036b} */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "  filename = "
            b.b.a.a r2 = r1.f794a
            r3 = 0
            java.lang.String r4 = "RPDLRunnable"
            if (r2 != 0) goto L_0x0011
            java.lang.String r0 = "run() dlFile == null!"
            b.b.a.b.a(r3, r4, r0)
            return
        L_0x0011:
            java.lang.String r2 = r2.d()
            r5 = 3
            if (r2 == 0) goto L_0x03f8
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.d()
            java.lang.String r6 = ""
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0028
            goto L_0x03f8
        L_0x0028:
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.f()
            if (r2 == 0) goto L_0x03f0
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.f()
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x003e
            goto L_0x03f0
        L_0x003e:
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.c()
            if (r2 == 0) goto L_0x03e8
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.c()
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0054
            goto L_0x03e8
        L_0x0054:
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.d()
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            boolean r7 = r6.exists()
            if (r7 != 0) goto L_0x0068
            r6.mkdirs()
        L_0x0068:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = java.io.File.separator
            r6.append(r2)
            b.b.a.a r2 = r1.f794a
            java.lang.String r2 = r2.c()
            r6.append(r2)
            java.lang.String r2 = "_DLTMP"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x00b2
            java.io.File r2 = r6.getParentFile()
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00a3
            java.io.File r2 = r6.getParentFile()
            r2.mkdirs()
        L_0x00a3:
            r6.createNewFile()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00b2
        L_0x00a7:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "run() create tmp file null!"
            b.b.a.b.a(r5, r4, r0)
            r2.printStackTrace()
            return
        L_0x00b2:
            b.b.a.d r2 = r1.f795b
            if (r2 == 0) goto L_0x00bb
            r7 = 103(0x67, float:1.44E-43)
            r2.a(r7, r1)
        L_0x00bb:
            r1.c = r3
            r2 = 0
            r7 = 1
            java.net.URL r8 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            b.b.a.a r9 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            java.lang.String r9 = r9.f()     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            r8.<init>(r9)     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SocketTimeoutException -> 0x039c, ConnectTimeoutException -> 0x0367, Exception -> 0x0332, all -> 0x032c }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0322, ConnectTimeoutException -> 0x0319, Exception -> 0x0310, all -> 0x0306 }
            r9.<init>(r6, r7)     // Catch:{ SocketTimeoutException -> 0x0322, ConnectTimeoutException -> 0x0319, Exception -> 0x0310, all -> 0x0306 }
            java.lang.String r10 = "User-Agent"
            java.lang.String r11 = "NetFox"
            r8.setRequestProperty(r10, r11)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            java.lang.String r10 = "RANGE"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            java.lang.String r12 = "bytes="
            r11.append(r12)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            r12 = 0
            r11.append(r12)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            java.lang.String r14 = "-"
            r11.append(r14)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            java.lang.String r11 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            r8.setRequestProperty(r10, r11)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            r10 = 5000(0x1388, float:7.006E-42)
            r8.setConnectTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            r8.setReadTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            java.io.InputStream r2 = r8.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0300, ConnectTimeoutException -> 0x02fa, Exception -> 0x02f4, all -> 0x02ee }
            int r10 = r8.getContentLength()     // Catch:{ SocketTimeoutException -> 0x02e8, ConnectTimeoutException -> 0x02e2, Exception -> 0x02dc, all -> 0x02d6 }
            long r10 = (long) r10
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x017d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r14.<init>()     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            java.lang.String r15 = "httpConnection.getContentLength() fileSize = "
            r14.append(r15)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r14.append(r10)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r14.append(r0)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            b.b.a.a r10 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            java.lang.String r10 = r10.c()     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r14.append(r10)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            java.lang.String r10 = r14.toString()     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            b.b.a.b.a(r5, r4, r10)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            b.b.a.a r10 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            long r10 = r10.b()     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r14.<init>()     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            java.lang.String r15 = "dlFile.getFile_Size = "
            r14.append(r15)     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            b.b.a.a r15 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0179, ConnectTimeoutException -> 0x0175, Exception -> 0x0171, all -> 0x02ee }
            r16 = r8
            long r7 = r15.b()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r14.append(r7)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r14.append(r0)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            b.b.a.a r0 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.String r0 = r0.c()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r14.append(r0)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.String r0 = r14.toString()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            b.b.a.b.a(r5, r4, r0)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x017f
            if (r16 == 0) goto L_0x0165
            r16.disconnect()
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            r2.close()     // Catch:{ IOException -> 0x016a }
        L_0x016a:
            r9.flush()     // Catch:{ IOException -> 0x0170 }
            r9.close()     // Catch:{ IOException -> 0x0170 }
        L_0x0170:
            return
        L_0x0171:
            r16 = r8
            goto L_0x02c7
        L_0x0175:
            r16 = r8
            goto L_0x02cc
        L_0x0179:
            r16 = r8
            goto L_0x02d1
        L_0x017d:
            r16 = r8
        L_0x017f:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r14.<init>()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.String r15 = "start download : "
            r14.append(r15)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            b.b.a.a r15 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.String r15 = r15.f()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r14.append(r15)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            java.lang.String r14 = r14.toString()     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            b.b.a.b.a(r3, r4, r14)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            boolean r14 = r1.c     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            if (r14 == 0) goto L_0x01b9
            r1.b(r6)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            if (r16 == 0) goto L_0x01ad
            r16.disconnect()
        L_0x01ad:
            if (r2 == 0) goto L_0x01b2
            r2.close()     // Catch:{ IOException -> 0x01b2 }
        L_0x01b2:
            r9.flush()     // Catch:{ IOException -> 0x01b8 }
            r9.close()     // Catch:{ IOException -> 0x01b8 }
        L_0x01b8:
            return
        L_0x01b9:
            r14 = r12
        L_0x01ba:
            int r5 = r2.read(r0)     // Catch:{ SocketTimeoutException -> 0x02d1, ConnectTimeoutException -> 0x02cc, Exception -> 0x02c7, all -> 0x02c5 }
            r17 = r2
            r2 = -1
            if (r5 == r2) goto L_0x027a
            r9.write(r0, r3, r5)     // Catch:{ SocketTimeoutException -> 0x02d3, ConnectTimeoutException -> 0x02ce, Exception -> 0x02c9, all -> 0x02c2 }
            r18 = r4
            long r3 = (long) r5
            long r12 = r12 + r3
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0276, ConnectTimeoutException -> 0x0272, Exception -> 0x026e, all -> 0x02c2 }
            long r4 = r2 - r7
            r19 = 1000(0x3e8, double:4.94E-321)
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x025d
            long r4 = r12 - r14
            float r7 = (float) r12
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r8
            float r8 = (float) r10
            float r7 = r7 / r8
            b.b.a.a r8 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.h(r7)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            b.b.a.a r8 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.g(r4)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.<init>()     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r14 = "name: "
            r8.append(r14)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            b.b.a.a r14 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r14 = r14.c()     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.append(r14)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r14 = "\n[fileSize     = "
            r8.append(r14)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.append(r10)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r14 = "]\n[dlSizeReaded = "
            r8.append(r14)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.append(r12)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r14 = "]\n[dlSizeInSec  = "
            r8.append(r14)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.append(r4)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r4 = "]\n[dlProgress   = "
            r8.append(r4)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r8.append(r7)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r4 = "]"
            r8.append(r4)     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            java.lang.String r4 = r8.toString()     // Catch:{ SocketTimeoutException -> 0x0257, ConnectTimeoutException -> 0x0251, Exception -> 0x024b, all -> 0x02c2 }
            r7 = r18
            r5 = 0
            b.b.a.b.a(r5, r7, r4)     // Catch:{ SocketTimeoutException -> 0x0248, ConnectTimeoutException -> 0x0245, Exception -> 0x0242, all -> 0x02c2 }
            b.b.a.d r4 = r1.f795b     // Catch:{ SocketTimeoutException -> 0x0248, ConnectTimeoutException -> 0x0245, Exception -> 0x0242, all -> 0x02c2 }
            if (r4 == 0) goto L_0x023b
            r8 = 104(0x68, float:1.46E-43)
            r4.a(r8, r1)     // Catch:{ SocketTimeoutException -> 0x0248, ConnectTimeoutException -> 0x0245, Exception -> 0x0242, all -> 0x02c2 }
            b.b.a.d r4 = r1.f795b     // Catch:{ SocketTimeoutException -> 0x0248, ConnectTimeoutException -> 0x0245, Exception -> 0x0242, all -> 0x02c2 }
            r8 = 105(0x69, float:1.47E-43)
            r4.a(r8, r1)     // Catch:{ SocketTimeoutException -> 0x0248, ConnectTimeoutException -> 0x0245, Exception -> 0x0242, all -> 0x02c2 }
        L_0x023b:
            r14 = r12
            r22 = r2
            r3 = r7
            r7 = r22
            goto L_0x0260
        L_0x0242:
            r3 = r7
            goto L_0x0316
        L_0x0245:
            r3 = r7
            goto L_0x031f
        L_0x0248:
            r3 = r7
            goto L_0x0328
        L_0x024b:
            r2 = r16
            r3 = r18
            goto L_0x0336
        L_0x0251:
            r2 = r16
            r3 = r18
            goto L_0x036b
        L_0x0257:
            r2 = r16
            r3 = r18
            goto L_0x03a0
        L_0x025d:
            r3 = r18
            r5 = 0
        L_0x0260:
            boolean r2 = r1.c     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            if (r2 == 0) goto L_0x0268
            r1.b(r6)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            goto L_0x027b
        L_0x0268:
            r4 = r3
            r2 = r17
            r3 = 0
            goto L_0x01ba
        L_0x026e:
            r3 = r18
            goto L_0x0316
        L_0x0272:
            r3 = r18
            goto L_0x031f
        L_0x0276:
            r3 = r18
            goto L_0x0328
        L_0x027a:
            r3 = r4
        L_0x027b:
            boolean r0 = r1.c     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            if (r0 != 0) goto L_0x02b0
            java.io.File r0 = new java.io.File     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            b.b.a.a r4 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            java.lang.String r4 = r4.d()     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r2.append(r4)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r2.append(r4)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            b.b.a.a r4 = r1.f794a     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            java.lang.String r4 = r4.c()     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r2.append(r4)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r0.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            r6.renameTo(r0)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            b.b.a.d r0 = r1.f795b     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
            if (r0 == 0) goto L_0x02b0
            r2 = 100
            r0.a(r2, r1)     // Catch:{ SocketTimeoutException -> 0x0328, ConnectTimeoutException -> 0x031f, Exception -> 0x0316, all -> 0x02c2 }
        L_0x02b0:
            if (r16 == 0) goto L_0x02b5
            r16.disconnect()
        L_0x02b5:
            if (r17 == 0) goto L_0x02ba
            r17.close()     // Catch:{ IOException -> 0x02ba }
        L_0x02ba:
            r9.flush()     // Catch:{ IOException -> 0x03d1 }
            r9.close()     // Catch:{ IOException -> 0x03d1 }
            goto L_0x03d1
        L_0x02c2:
            r0 = move-exception
            goto L_0x030c
        L_0x02c5:
            r0 = move-exception
            goto L_0x02f1
        L_0x02c7:
            r17 = r2
        L_0x02c9:
            r3 = r4
            goto L_0x0316
        L_0x02cc:
            r17 = r2
        L_0x02ce:
            r3 = r4
            goto L_0x031f
        L_0x02d1:
            r17 = r2
        L_0x02d3:
            r3 = r4
            goto L_0x0328
        L_0x02d6:
            r0 = move-exception
            r17 = r2
            r16 = r8
            goto L_0x030c
        L_0x02dc:
            r17 = r2
            r3 = r4
            r16 = r8
            goto L_0x0316
        L_0x02e2:
            r17 = r2
            r3 = r4
            r16 = r8
            goto L_0x031f
        L_0x02e8:
            r17 = r2
            r3 = r4
            r16 = r8
            goto L_0x0328
        L_0x02ee:
            r0 = move-exception
            r16 = r8
        L_0x02f1:
            r17 = r2
            goto L_0x030c
        L_0x02f4:
            r3 = r4
            r16 = r8
            r17 = r2
            goto L_0x0316
        L_0x02fa:
            r3 = r4
            r16 = r8
            r17 = r2
            goto L_0x031f
        L_0x0300:
            r3 = r4
            r16 = r8
            r17 = r2
            goto L_0x0328
        L_0x0306:
            r0 = move-exception
            r16 = r8
            r9 = r2
            r17 = r9
        L_0x030c:
            r2 = r16
            goto L_0x03d3
        L_0x0310:
            r3 = r4
            r16 = r8
            r9 = r2
            r17 = r9
        L_0x0316:
            r2 = r16
            goto L_0x0336
        L_0x0319:
            r3 = r4
            r16 = r8
            r9 = r2
            r17 = r9
        L_0x031f:
            r2 = r16
            goto L_0x036b
        L_0x0322:
            r3 = r4
            r16 = r8
            r9 = r2
            r17 = r9
        L_0x0328:
            r2 = r16
            goto L_0x03a0
        L_0x032c:
            r0 = move-exception
            r9 = r2
            r17 = r9
            goto L_0x03d3
        L_0x0332:
            r3 = r4
            r9 = r2
            r17 = r9
        L_0x0336:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d2 }
            r0.<init>()     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = "other Exception() name = "
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            b.b.a.a r4 = r1.f794a     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = r4.c()     // Catch:{ all -> 0x03d2 }
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03d2 }
            r4 = 3
            b.b.a.b.a(r4, r3, r0)     // Catch:{ all -> 0x03d2 }
            r0 = 1
            r1.c = r0     // Catch:{ all -> 0x03d2 }
            r1.b(r6)     // Catch:{ all -> 0x03d2 }
            if (r2 == 0) goto L_0x035c
            r2.disconnect()
        L_0x035c:
            if (r17 == 0) goto L_0x0363
            r17.close()     // Catch:{ IOException -> 0x0362 }
            goto L_0x0363
        L_0x0362:
        L_0x0363:
            if (r9 == 0) goto L_0x03d1
            goto L_0x02ba
        L_0x0367:
            r3 = r4
            r9 = r2
            r17 = r9
        L_0x036b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d2 }
            r0.<init>()     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = "ConnectTimeoutException() name = "
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            b.b.a.a r4 = r1.f794a     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = r4.c()     // Catch:{ all -> 0x03d2 }
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03d2 }
            r4 = 3
            b.b.a.b.a(r4, r3, r0)     // Catch:{ all -> 0x03d2 }
            r0 = 1
            r1.c = r0     // Catch:{ all -> 0x03d2 }
            r1.b(r6)     // Catch:{ all -> 0x03d2 }
            if (r2 == 0) goto L_0x0391
            r2.disconnect()
        L_0x0391:
            if (r17 == 0) goto L_0x0398
            r17.close()     // Catch:{ IOException -> 0x0397 }
            goto L_0x0398
        L_0x0397:
        L_0x0398:
            if (r9 == 0) goto L_0x03d1
            goto L_0x02ba
        L_0x039c:
            r3 = r4
            r9 = r2
            r17 = r9
        L_0x03a0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d2 }
            r0.<init>()     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = "SocketTimeoutException() name = "
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            b.b.a.a r4 = r1.f794a     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = r4.c()     // Catch:{ all -> 0x03d2 }
            r0.append(r4)     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03d2 }
            r4 = 3
            b.b.a.b.a(r4, r3, r0)     // Catch:{ all -> 0x03d2 }
            r0 = 1
            r1.c = r0     // Catch:{ all -> 0x03d2 }
            r1.b(r6)     // Catch:{ all -> 0x03d2 }
            if (r2 == 0) goto L_0x03c6
            r2.disconnect()
        L_0x03c6:
            if (r17 == 0) goto L_0x03cd
            r17.close()     // Catch:{ IOException -> 0x03cc }
            goto L_0x03cd
        L_0x03cc:
        L_0x03cd:
            if (r9 == 0) goto L_0x03d1
            goto L_0x02ba
        L_0x03d1:
            return
        L_0x03d2:
            r0 = move-exception
        L_0x03d3:
            if (r2 == 0) goto L_0x03d8
            r2.disconnect()
        L_0x03d8:
            if (r17 == 0) goto L_0x03df
            r17.close()     // Catch:{ IOException -> 0x03de }
            goto L_0x03df
        L_0x03de:
        L_0x03df:
            if (r9 == 0) goto L_0x03e7
            r9.flush()     // Catch:{ IOException -> 0x03e7 }
            r9.close()     // Catch:{ IOException -> 0x03e7 }
        L_0x03e7:
            throw r0
        L_0x03e8:
            r3 = r4
            java.lang.String r0 = "run() dlFile name is null!"
            r2 = 3
            b.b.a.b.a(r2, r3, r0)
            return
        L_0x03f0:
            r3 = r4
            r2 = 3
            java.lang.String r0 = "run() dlFile url is null!"
            b.b.a.b.a(r2, r3, r0)
            return
        L_0x03f8:
            r3 = r4
            r2 = 3
            java.lang.String r0 = "run() dlFile path is null!"
            b.b.a.b.a(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.c.run():void");
    }
}
