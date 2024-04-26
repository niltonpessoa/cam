package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.c;
import android.os.Bundle;

public class m extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f63a;

    interface a {
        void a();

        void b();

        void c();
    }

    private void a(c.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof g) {
            ((g) activity).a().i(aVar);
        } else if (activity instanceof e) {
            c a2 = ((e) activity).a();
            if (a2 instanceof f) {
                ((f) a2).i(aVar);
            }
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public static void e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f63a);
        a(c.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(c.a.ON_DESTROY);
        this.f63a = null;
    }

    public void onPause() {
        super.onPause();
        a(c.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f63a);
        a(c.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f63a);
        a(c.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(c.a.ON_STOP);
    }
}
