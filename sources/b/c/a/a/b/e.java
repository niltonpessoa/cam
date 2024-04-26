package b.c.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class e extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f847a;

    /* renamed from: b  reason: collision with root package name */
    private List<b.b.b.d.a> f848b;
    private List<b.b.b.d.a> c;
    private b.b.b.d.a d;
    private LayoutInflater e;
    private ImageLoader f = ImageLoader.getInstance();
    private DisplayImageOptions g = new DisplayImageOptions.Builder().showImageOnLoading((int) R.drawable.default_icon).showImageForEmptyUri((int) R.drawable.default_icon).showImageOnFail((int) R.drawable.default_icon).cacheInMemory(true).cacheOnDisk(true).displayer(new RoundedBitmapDisplayer(0)).build();
    private b h;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                e.this.notifyDataSetChanged();
            }
        }
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f850a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f851b;
        /* access modifiers changed from: private */
        public ImageView c;
        /* access modifiers changed from: private */
        public ImageView d;
        /* access modifiers changed from: private */
        public ImageView e;
    }

    public e(Context context, List<b.b.b.d.a> list) {
        new a();
        this.f847a = context;
        this.f848b = list;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    private void c() {
        c0.a(0, "XFFileListAdapter", "deleteDownloadFile()");
        File file = new File(b.c.a.a.d.b.g);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    public int a(int i) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        b.b.b.d.a aVar = this.f848b.get(i);
        if (this.c.contains(aVar)) {
            this.c.remove(aVar);
        } else {
            this.c.add(aVar);
        }
        notifyDataSetChanged();
        return this.c.size();
    }

    public void b() {
        this.f.clearMemoryCache();
        this.f.clearDiskCache();
        c();
    }

    public List<b.b.b.d.a> d() {
        return this.f848b;
    }

    public List<b.b.b.d.a> e() {
        return this.c;
    }

    public int f() {
        ArrayList arrayList;
        List<b.b.b.d.a> list = this.f848b;
        if (list == null || list.size() <= 0) {
            List<b.b.b.d.a> list2 = this.c;
            if (list2 == null) {
                arrayList = new ArrayList();
            } else {
                list2.clear();
                notifyDataSetChanged();
                return this.c.size();
            }
        } else {
            arrayList = new ArrayList(this.f848b);
        }
        this.c = arrayList;
        notifyDataSetChanged();
        return this.c.size();
    }

    public int g() {
        this.c = null;
        this.c = new ArrayList();
        notifyDataSetChanged();
        return this.c.size();
    }

    public int getCount() {
        List<b.b.b.d.a> list = this.f848b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        List<b.b.b.d.a> list = this.f848b;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.f848b.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout;
        int i2;
        Resources resources;
        Resources resources2;
        ImageView imageView;
        this.h = null;
        if (view == null) {
            view = this.e.inflate(R.layout.xffile_child_item, (ViewGroup) null);
            int i3 = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
            b bVar = new b();
            this.h = bVar;
            RelativeLayout unused = bVar.f850a = (RelativeLayout) view.findViewById(R.id.file_child_bg);
            this.h.f850a.setLayoutParams(layoutParams);
            ImageView unused2 = this.h.f851b = (ImageView) view.findViewById(R.id.file_child_icon);
            ImageView unused3 = this.h.c = (ImageView) view.findViewById(R.id.file_child_videotag);
            ImageView unused4 = this.h.d = (ImageView) view.findViewById(R.id.file_child_check);
            ImageView unused5 = this.h.e = (ImageView) view.findViewById(R.id.file_child_downloaded);
            view.setTag(this.h);
        } else {
            this.h = (b) view.getTag();
        }
        boolean z = i == getCount() - 1;
        c0.a(0, "isLastChild", "isLastChild ==" + i + "==" + z);
        if (z) {
            relativeLayout = this.h.f850a;
            resources = this.f847a.getResources();
            i2 = R.drawable.file_last_item_bg_selector;
        } else {
            relativeLayout = this.h.f850a;
            resources = this.f847a.getResources();
            i2 = R.drawable.file_item_bg_selector;
        }
        relativeLayout.setBackgroundDrawable(resources.getDrawable(i2));
        this.h.e.setVisibility(8);
        b.b.b.d.a aVar = this.f848b.get(i);
        this.d = aVar;
        if (aVar != null) {
            if (aVar.l() <= 0) {
                File file = new File(b.c.a.a.d.b.c + File.separator + this.d.d());
                if (file.exists()) {
                    file.length();
                }
            }
            this.h.c.setVisibility(0);
            if (this.d.m() == 1) {
                this.h.c.setVisibility(8);
            }
            if (this.c == null) {
                this.h.d.setVisibility(8);
            } else {
                ImageView g2 = this.h.d;
                Resources resources3 = this.f847a.getResources();
                int i4 = R.drawable.item_check;
                g2.setBackgroundDrawable(resources3.getDrawable(R.drawable.item_check));
                if (this.c.contains(this.d)) {
                    imageView = this.h.d;
                    resources2 = this.f847a.getResources();
                    i4 = R.drawable.item_checked;
                } else {
                    imageView = this.h.d;
                    resources2 = this.f847a.getResources();
                }
                imageView.setBackgroundDrawable(resources2.getDrawable(i4));
                this.h.d.setVisibility(0);
            }
            this.h.f851b.setImageResource(R.drawable.default_icon);
            this.f.displayImage(this.d.k(), this.h.f851b, this.g);
        }
        return view;
    }

    public void h(boolean z) {
        ArrayList arrayList;
        if (z) {
            List<b.b.b.d.a> list = this.c;
            if (list == null) {
                arrayList = new ArrayList();
            } else {
                list.clear();
                notifyDataSetChanged();
            }
        } else {
            List<b.b.b.d.a> list2 = this.c;
            if (list2 != null) {
                list2.clear();
            }
            arrayList = null;
        }
        this.c = arrayList;
        notifyDataSetChanged();
    }

    public void i(List<b.b.b.d.a> list) {
        this.f848b = list;
    }
}
