package a.b.b.b;

import android.util.Log;
import java.io.Writer;

public class e extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f22a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f23b = new StringBuilder(128);

    public e(String str) {
        this.f22a = str;
    }

    private void a() {
        if (this.f23b.length() > 0) {
            Log.d(this.f22a, this.f23b.toString());
            StringBuilder sb = this.f23b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.f23b.append(c);
            }
        }
    }
}
