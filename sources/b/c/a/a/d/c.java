package b.c.a.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f867a;

    /* renamed from: b  reason: collision with root package name */
    private IntentFilter f868b = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
    /* access modifiers changed from: private */
    public b c;
    private a d;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && (stringExtra = intent.getStringExtra("reason")) != null && c.this.c != null) {
                if (stringExtra.equals("homekey")) {
                    c.this.c.a();
                } else if (stringExtra.equals("recentapps")) {
                    c.this.c.b();
                }
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    public c(Context context) {
        this.f867a = context;
    }

    public void b(b bVar) {
        this.c = bVar;
        this.d = new a();
    }

    public void c() {
        a aVar = this.d;
        if (aVar != null) {
            this.f867a.registerReceiver(aVar, this.f868b);
        }
    }

    public void d() {
        a aVar = this.d;
        if (aVar != null) {
            this.f867a.unregisterReceiver(aVar);
        }
    }
}
