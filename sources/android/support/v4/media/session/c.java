package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final Object f188a;

    /* renamed from: b  reason: collision with root package name */
    a f189b;
    a c;

    private class a extends Handler {
    }

    private static class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f190a;

        b(c cVar) {
            this.f190a = new WeakReference<>(cVar);
        }

        public void a(List<?> list) {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        public void b(CharSequence charSequence) {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        public void c() {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        public void d(Object obj) {
            c cVar = (c) this.f190a.get();
            if (cVar != null && cVar.c == null) {
                cVar.d(PlaybackStateCompat.a(obj));
            }
        }

        public void e(Bundle bundle) {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        public void f(Object obj) {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        public void g(int i, int i2, int i3, int i4, int i5) {
            c cVar = (c) this.f190a.get();
            if (cVar != null) {
                cVar.a(new d(i, i2, i3, i4, i5));
            }
        }

        public void h(String str, Bundle bundle) {
            c cVar = (c) this.f190a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    private static class C0011c extends a.C0009a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f191a;

        C0011c(c cVar) {
            this.f191a = new WeakReference<>(cVar);
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(5, list, (Bundle) null);
            }
        }

        public void b(CharSequence charSequence) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, (Bundle) null);
            }
        }

        public void c() {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(8, (Object) null, (Bundle) null);
            }
        }

        public void d(int i) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void e(Bundle bundle) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(7, bundle, (Bundle) null);
            }
        }

        public void f(boolean z) {
        }

        public void h(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        public void i(boolean z) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        public void j(int i) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void k() {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(13, (Object) null, (Bundle) null);
            }
        }

        public void l(PlaybackStateCompat playbackStateCompat) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void m(String str, Bundle bundle) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        public void o(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = (c) this.f191a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f181a, parcelableVolumeInfo.f182b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e) : null, (Bundle) null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f188a = e.a(new b(this));
        } else {
            this.c = new C0011c(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void binderDied() {
        i(8, (Object) null, (Bundle) null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void i(int i, Object obj, Bundle bundle) {
        a aVar = this.f189b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
