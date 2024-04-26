package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f183a;

    /* renamed from: b  reason: collision with root package name */
    final long f184b;
    final long c;
    final float d;
    final long e;
    final int f;
    final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f185a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f186b;
        private final int c;
        private final Bundle d;
        private Object e;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f185a = parcel.readString();
            this.f186b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f185a = str;
            this.f186b = charSequence;
            this.c = i;
            this.d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f186b + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f185a);
            TextUtils.writeToParcel(this.f186b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f183a = i2;
        this.f184b = j2;
        this.c = j3;
        this.d = f2;
        this.e = j4;
        this.f = i3;
        this.g = charSequence;
        this.h = j5;
        this.i = new ArrayList(list);
        this.j = j6;
        this.k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f183a = parcel.readInt();
        this.f184b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = null;
        if (obj2 == null || i2 < 21) {
            return null;
        }
        List<Object> d2 = g.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            for (Object a2 : d2) {
                arrayList2.add(CustomAction.a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (i2 >= 22) {
            bundle = h.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), bundle);
        playbackStateCompat.l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f183a + ", position=" + this.f184b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f183a);
        parcel.writeLong(this.f184b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i2);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }
}
