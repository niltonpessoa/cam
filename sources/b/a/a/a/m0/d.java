package b.a.a.a.m0;

import b.a.a.a.m0.h.b;
import b.a.a.a.m0.i.g;
import b.a.a.a.m0.j.c;
import b.a.a.a.n;

public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f510a = new a();

    static class a implements d {
        a() {
        }

        public boolean a(n nVar) {
            String str = nVar.f;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        public b b(n nVar) {
            String str = nVar.f;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new c();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    boolean a(n nVar);

    b b(n nVar);
}
