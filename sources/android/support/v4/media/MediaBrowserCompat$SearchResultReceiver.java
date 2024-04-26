package android.support.v4.media;

import a.b.b.a.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends b {
    private final String c;
    private final Bundle d;
    private final f e;

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.e.a(this.c, this.d);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.e.b(this.c, this.d, arrayList);
    }
}
