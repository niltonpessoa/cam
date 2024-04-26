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
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.BaseImageDecoder;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class g extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f855a;

    /* renamed from: b  reason: collision with root package name */
    private List<b.b.b.d.a> f856b;
    private List<b.b.b.d.a> c;
    private b.b.b.d.a d;
    private LayoutInflater e;
    private ImageLoader f;
    private DisplayImageOptions g;
    private c h;
    private Handler i = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            File file = new File(b.c.a.a.d.b.e);
            if (file.exists() && file.listFiles() != null && file.listFiles().length != 0) {
                for (File file2 : file.listFiles()) {
                    if (!(g.this.f() == null || g.this.f().size() == 0)) {
                        for (b.b.b.d.a i : g.this.f()) {
                            if (file2.getName().equals(i.i())) {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                g.this.notifyDataSetChanged();
            } else if (i == 1) {
                g.this.h(message.arg1, (View) message.obj);
            }
        }
    }

    public static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f859a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f860b;
        /* access modifiers changed from: private */
        public ImageView c;
        /* access modifiers changed from: private */
        public ImageView d;
        /* access modifiers changed from: private */
        public ImageView e;
    }

    public g(Context context, List<b.b.b.d.a> list) {
        this.f855a = context;
        this.f856b = list;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
        new ImageLoaderConfiguration.Builder(this.f855a).memoryCacheExtraOptions(480, 800).diskCacheExtraOptions(480, 800, (BitmapProcessor) null).threadPoolSize(3).threadPriority(3).tasksProcessingOrder(QueueProcessingType.FIFO).denyCacheImageMultipleSizesInMemory().memoryCache(new LruMemoryCache(2097152)).memoryCacheSize(2097152).memoryCacheSizePercentage(13).diskCacheSize(52428800).diskCacheFileCount(1000).diskCacheFileNameGenerator(new Md5FileNameGenerator()).imageDownloader(new BaseImageDownloader(this.f855a)).imageDecoder(new BaseImageDecoder(true)).defaultDisplayImageOptions(DisplayImageOptions.createSimple()).writeDebugLogs().build();
        this.f = ImageLoader.getInstance();
        this.g = new DisplayImageOptions.Builder().showImageOnLoading((int) R.drawable.default_icon).showImageForEmptyUri((int) R.drawable.default_icon).showImageOnFail((int) R.drawable.default_icon).cacheInMemory(true).cacheOnDisk(true).displayer(new RoundedBitmapDisplayer(0)).build();
    }

    private void e() {
        c0.a(0, "XFTPFileListAdapter", "deleteDownloadFile()");
        File file = new File(b.c.a.a.d.b.g);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void h(int i2, View view) {
        Resources resources;
        ImageView imageView;
        String str;
        if (view == null) {
            str = "handleReloadDataAtIndex convertView is null";
        } else {
            c cVar = (c) view.getTag();
            this.h = cVar;
            if (cVar == null) {
                str = "handleReloadDataAtIndex childHolder is null";
            } else {
                if (cVar == null) {
                    int i3 = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                    c cVar2 = new c();
                    this.h = cVar2;
                    RelativeLayout unused = cVar2.f859a = (RelativeLayout) view.findViewById(R.id.file_child_bg);
                    this.h.f859a.setLayoutParams(layoutParams);
                    ImageView unused2 = this.h.f860b = (ImageView) view.findViewById(R.id.file_child_icon);
                    ImageView unused3 = this.h.c = (ImageView) view.findViewById(R.id.file_child_videotag);
                    ImageView unused4 = this.h.d = (ImageView) view.findViewById(R.id.file_child_check);
                    ImageView unused5 = this.h.e = (ImageView) view.findViewById(R.id.file_child_downloaded);
                    view.setTag(this.h);
                }
                int i4 = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
                RelativeLayout unused6 = this.h.f859a = (RelativeLayout) view.findViewById(R.id.file_child_bg);
                this.h.f859a.setLayoutParams(layoutParams2);
                ImageView unused7 = this.h.f860b = (ImageView) view.findViewById(R.id.file_child_icon);
                ImageView unused8 = this.h.c = (ImageView) view.findViewById(R.id.file_child_videotag);
                ImageView unused9 = this.h.d = (ImageView) view.findViewById(R.id.file_child_check);
                ImageView unused10 = this.h.e = (ImageView) view.findViewById(R.id.file_child_downloaded);
                this.h.e.setVisibility(8);
                b.b.b.d.a aVar = this.f856b.get(i2);
                this.d = aVar;
                if (aVar != null) {
                    this.h.c.setVisibility(0);
                    this.h.f860b.setImageResource(R.drawable.default_icon);
                    if (this.d.m() == 1) {
                        this.h.c.setVisibility(8);
                    }
                    if (this.c == null) {
                        this.h.d.setVisibility(8);
                    } else {
                        ImageView g2 = this.h.d;
                        Resources resources2 = this.f855a.getResources();
                        int i5 = R.drawable.item_check;
                        g2.setBackgroundDrawable(resources2.getDrawable(R.drawable.item_check));
                        if (this.c.contains(this.d)) {
                            imageView = this.h.d;
                            resources = this.f855a.getResources();
                            i5 = R.drawable.item_checked;
                        } else {
                            imageView = this.h.d;
                            resources = this.f855a.getResources();
                        }
                        imageView.setBackgroundDrawable(resources.getDrawable(i5));
                        this.h.d.setVisibility(0);
                    }
                    String k = this.d.k();
                    c0.a(0, "XFTPFileListAdapter", "imageURL = " + k);
                    this.f.displayImage(k, this.h.f860b, this.g);
                    return;
                }
                return;
            }
        }
        c0.a(0, "XFTPFileListAdapter", str);
    }

    public int b(int i2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        b.b.b.d.a aVar = this.f856b.get(i2);
        if (this.c.contains(aVar)) {
            this.c.remove(aVar);
        } else {
            this.c.add(aVar);
        }
        notifyDataSetChanged();
        return this.c.size();
    }

    public void c() {
        this.f.clearMemoryCache();
        this.f.clearDiskCache();
        e();
    }

    public void d() {
        new Thread(new a()).start();
    }

    public List<b.b.b.d.a> f() {
        return this.f856b;
    }

    public List<b.b.b.d.a> g() {
        return this.c;
    }

    public int getCount() {
        List<b.b.b.d.a> list = this.f856b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i2) {
        List<b.b.b.d.a> list = this.f856b;
        if (list == null || i2 >= list.size()) {
            return null;
        }
        return this.f856b.get(i2);
    }

    public long getItemId(int i2) {
        return 0;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        Resources resources;
        RelativeLayout relativeLayout;
        ImageView imageView;
        Resources resources2;
        c0.a(0, "XFTPFileListAdapter", "getView()");
        this.h = null;
        if (view == null) {
            view = this.e.inflate(R.layout.xffile_child_item, (ViewGroup) null);
            int i4 = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
            c cVar = new c();
            this.h = cVar;
            RelativeLayout unused = cVar.f859a = (RelativeLayout) view.findViewById(R.id.file_child_bg);
            this.h.f859a.setLayoutParams(layoutParams);
            ImageView unused2 = this.h.f860b = (ImageView) view.findViewById(R.id.file_child_icon);
            ImageView unused3 = this.h.c = (ImageView) view.findViewById(R.id.file_child_videotag);
            ImageView unused4 = this.h.d = (ImageView) view.findViewById(R.id.file_child_check);
            ImageView unused5 = this.h.e = (ImageView) view.findViewById(R.id.file_child_downloaded);
            view.setTag(this.h);
        } else {
            this.h = (c) view.getTag();
        }
        boolean z = i2 == getCount() - 1;
        c0.a(0, "isLastChild", "isLastChild ==" + i2 + "==" + z);
        if (z) {
            relativeLayout = this.h.f859a;
            resources = this.f855a.getResources();
            i3 = R.drawable.file_last_item_bg_selector;
        } else {
            relativeLayout = this.h.f859a;
            resources = this.f855a.getResources();
            i3 = R.drawable.file_item_bg_selector;
        }
        relativeLayout.setBackgroundDrawable(resources.getDrawable(i3));
        this.h.e.setVisibility(8);
        b.b.b.d.a aVar = this.f856b.get(i2);
        this.d = aVar;
        if (aVar != null) {
            this.h.c.setVisibility(0);
            this.h.f860b.setImageResource(R.drawable.default_icon);
            if (this.d.m() == 1) {
                this.h.c.setVisibility(8);
            }
            if (this.c == null) {
                this.h.d.setVisibility(8);
            } else {
                ImageView g2 = this.h.d;
                Resources resources3 = this.f855a.getResources();
                int i5 = R.drawable.item_check;
                g2.setBackgroundDrawable(resources3.getDrawable(R.drawable.item_check));
                if (this.c.contains(this.d)) {
                    imageView = this.h.d;
                    resources2 = this.f855a.getResources();
                    i5 = R.drawable.item_checked;
                } else {
                    imageView = this.h.d;
                    resources2 = this.f855a.getResources();
                }
                imageView.setBackgroundDrawable(resources2.getDrawable(i5));
                this.h.d.setVisibility(0);
            }
            String k = this.d.k();
            c0.a(0, "XFTPFileListAdapter", "imageURL = " + k);
            this.f.displayImage(k, this.h.f860b, this.g);
        }
        return view;
    }

    public void i(int i2, View view) {
        Message obtainMessage = this.i.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.arg1 = i2;
        obtainMessage.obj = view;
        this.i.sendMessage(obtainMessage);
    }

    public int j() {
        ArrayList arrayList;
        List<b.b.b.d.a> list = this.f856b;
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
            arrayList = new ArrayList(this.f856b);
        }
        this.c = arrayList;
        notifyDataSetChanged();
        return this.c.size();
    }

    public int k() {
        this.c = null;
        this.c = new ArrayList();
        notifyDataSetChanged();
        return this.c.size();
    }

    public void l(boolean z) {
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

    public void m(List<b.b.b.d.a> list) {
        this.f856b = list;
    }
}
