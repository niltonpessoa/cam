package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.d;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f173a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f174b;
    private HashMap<c, a> c;
    final MediaSessionCompat.Token d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f175a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f175a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f173a) {
                    mediaControllerCompat$MediaControllerImplApi21.d.b(b.a.p(d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.C0011c {
        a(c cVar) {
            super(cVar);
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void b(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void c() {
            throw new AssertionError();
        }

        public void e(Bundle bundle) {
            throw new AssertionError();
        }

        public void h(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        public void o(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.d.a() != null) {
            for (c next : this.f174b) {
                a aVar = new a(next);
                this.c.put(next, aVar);
                next.c = aVar;
                try {
                    this.d.a().g(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f174b.clear();
        }
    }
}
