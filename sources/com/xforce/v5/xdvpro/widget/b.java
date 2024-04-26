package com.xforce.v5.xdvpro.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.xforce.v5.xdvpro.R;
import java.util.ArrayList;
import java.util.List;

public class b extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private a f1182a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1183b;
    private LayoutInflater c;
    private List<b.b.b.d.a> d;
    private List<String> e;
    private List<String> f;
    private boolean g = false;
    private b.b.b.d.a h;
    private Resources i;
    private String j;
    private float k;
    private long l;
    private ImageLoader m;
    private DisplayImageOptions n;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f1184a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f1185b;
        /* access modifiers changed from: private */
        public ImageView c;
        /* access modifiers changed from: private */
        public TextView d;
        /* access modifiers changed from: private */
        public TextView e;
        /* access modifiers changed from: private */
        public TextView f;
        /* access modifiers changed from: private */
        public TextView g;
        /* access modifiers changed from: private */
        public ProgressBar h;
        /* access modifiers changed from: private */
        public ImageView i;
    }

    public b(Context context, List<b.b.b.d.a> list) {
        this.f1183b = context;
        this.d = list;
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.i = context.getResources();
        this.m = ImageLoader.getInstance();
        this.m.init(new ImageLoaderConfiguration.Builder(context).threadPoolSize(1).build());
        this.n = new DisplayImageOptions.Builder().showImageOnLoading((int) R.drawable.default_icon).showImageForEmptyUri((int) R.drawable.default_icon).showImageOnFail((int) R.drawable.default_icon).cacheInMemory(true).cacheOnDisk(true).displayer(new RoundedBitmapDisplayer(0)).build();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public void a(String str) {
        this.f.add(str);
    }

    public void b(String str) {
        this.e.add(str);
    }

    public void c() {
        this.m.clearMemoryCache();
        this.m.clearDiskCache();
    }

    public void d(String str) {
        this.j = str;
    }

    public void e(float f2) {
        this.k = f2;
    }

    public void f(long j2) {
        this.l = j2;
    }

    public int getCount() {
        List<b.b.b.d.a> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i2) {
        return null;
    }

    public long getItemId(int i2) {
        return 0;
    }

    @SuppressLint({"NewApi"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout;
        int i3;
        Resources resources;
        TextView k2;
        Resources resources2;
        int i4;
        this.f1182a = null;
        if (view == null) {
            view = this.c.inflate(R.layout.download_item, (ViewGroup) null);
            a aVar = new a();
            this.f1182a = aVar;
            ImageView unused = aVar.f1185b = (ImageView) view.findViewById(R.id.download_icon);
            ImageView unused2 = this.f1182a.c = (ImageView) view.findViewById(R.id.download_icon_tags);
            TextView unused3 = this.f1182a.d = (TextView) view.findViewById(R.id.download_name);
            TextView unused4 = this.f1182a.e = (TextView) view.findViewById(R.id.download_size);
            TextView unused5 = this.f1182a.f = (TextView) view.findViewById(R.id.download_speed);
            TextView unused6 = this.f1182a.g = (TextView) view.findViewById(R.id.download_state);
            ProgressBar unused7 = this.f1182a.h = (ProgressBar) view.findViewById(R.id.download_progress);
            ImageView unused8 = this.f1182a.i = (ImageView) view.findViewById(R.id.download_check);
            RelativeLayout unused9 = this.f1182a.f1184a = (RelativeLayout) view.findViewById(R.id.download_item_bg);
            view.setTag(this.f1182a);
        } else {
            this.f1182a = (a) view.getTag();
        }
        if (this.g) {
            this.f1182a.i.setVisibility(0);
            relativeLayout = this.f1182a.f1184a;
            resources = this.f1183b.getResources();
            i3 = R.drawable.file_item_bg_selector;
        } else {
            this.f1182a.i.setVisibility(8);
            relativeLayout = this.f1182a.f1184a;
            resources = this.f1183b.getResources();
            i3 = R.drawable.file_item_bg;
        }
        relativeLayout.setBackgroundDrawable(resources.getDrawable(i3));
        this.h = this.d.get(i2);
        this.f1182a.d.setText(this.h.d());
        if (1 != this.h.m()) {
            this.f1182a.c.setVisibility(0);
        } else {
            this.f1182a.c.setVisibility(8);
        }
        this.f1182a.g.setVisibility(8);
        this.f1182a.e.setVisibility(8);
        this.f1182a.f.setVisibility(8);
        this.f1182a.h.setVisibility(8);
        String str = this.j;
        if (str == null || str.equals("") || !this.h.d().contains(this.j) || this.e.contains(this.h.d())) {
            this.f1182a.g.setVisibility(0);
            this.f1182a.e.setVisibility(8);
            this.f1182a.f.setVisibility(8);
            this.f1182a.h.setVisibility(8);
            if (this.e.contains(this.h.d())) {
                k2 = this.f1182a.g;
                resources2 = this.f1183b.getResources();
                i4 = R.string.file_has_downloaded;
            } else if (this.f.contains(this.h.d())) {
                k2 = this.f1182a.g;
                resources2 = this.i;
                i4 = R.string.file_download_fail;
            } else {
                k2 = this.f1182a.g;
                resources2 = this.f1183b.getResources();
                i4 = R.string.please_wait;
            }
            k2.setText(resources2.getString(i4));
        } else {
            this.f1182a.g.setVisibility(8);
            this.f1182a.e.setVisibility(0);
            this.f1182a.f.setVisibility(0);
            this.f1182a.h.setVisibility(0);
            this.f1182a.h.setProgress((int) (this.k * 100.0f));
            this.i.getString(R.string.download_size);
            this.f1182a.e.setText(b.c.a.a.d.b.q(this.h.c()));
            this.f1182a.f.setText(String.format(this.i.getString(R.string.download_speed), new Object[]{b.c.a.a.d.b.o(this.l)}));
        }
        String k3 = this.h.k();
        this.f1182a.f1185b.setImageResource(R.drawable.default_icon);
        this.m.displayImage(k3, this.f1182a.f1185b, this.n);
        return view;
    }
}
