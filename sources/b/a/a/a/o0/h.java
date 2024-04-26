package b.a.a.a.o0;

import b.a.a.a.n;
import b.a.a.a.o0.m.c;
import b.a.a.a.o0.t.b;
import b.a.a.a.o0.t.g;

public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f598a = new a();

    static class a implements h {
        a() {
        }

        public boolean a(n nVar) {
            String str = nVar.f;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        public f b(n nVar) {
            String str = nVar.f;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new b.a.a.a.o0.n.a(nVar.h);
                case 1:
                    return new b.a.a.a.o0.o.a();
                case 2:
                    return new b();
                case 3:
                    return new g();
                case 4:
                    return new b.a.a.a.o0.s.a(nVar.h);
                case 5:
                    return new b.a.a.a.o0.p.a(nVar.h);
                case 6:
                case 7:
                    return new b.a.a.a.o0.m.a(nVar.f, nVar.z);
                case 8:
                    return new c(nVar.z);
                case 9:
                    return new b.a.a.a.o0.q.a();
                case 10:
                    return new b.a.a.a.o0.r.a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    boolean a(n nVar);

    f b(n nVar);
}
