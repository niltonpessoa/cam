package b.a.a.a.q0;

import b.a.a.a.q0.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface o extends f {

    public static abstract class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final e f704a = new e();

        /* renamed from: b */
        public final o a() {
            return c(this.f704a);
        }

        /* access modifiers changed from: protected */
        public abstract o c(e eVar);
    }

    public static class b extends IOException {
        public b(IOException iOException, h hVar, int i) {
            super(iOException);
        }

        public b(String str, h hVar, int i) {
            super(str);
        }

        public b(String str, IOException iOException, h hVar, int i) {
            super(str, iOException);
        }
    }

    public static final class c extends b {
        public c(String str, h hVar) {
            super("Invalid content type: " + str, hVar, 1);
        }
    }

    public static final class d extends b {
        public d(int i, Map<String, List<String>> map, h hVar) {
            super("Response code: " + i, hVar, 1);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f705a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f706b;

        public synchronized Map<String, String> a() {
            if (this.f706b == null) {
                this.f706b = Collections.unmodifiableMap(new HashMap(this.f705a));
            }
            return this.f706b;
        }
    }
}
