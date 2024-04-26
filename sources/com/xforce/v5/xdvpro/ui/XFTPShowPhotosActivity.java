package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import b.c.a.a.d.c;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.photoview.PhotoView;
import com.xforce.v5.xdvpro.widget.photoview.b;
import com.xforce.v5.xdvpro.widget.viewpagerindicator.HackyViewPager;
import java.io.File;
import java.util.ArrayList;

public class XFTPShowPhotosActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    protected ImageLoader f1093a = ImageLoader.getInstance();

    /* renamed from: b  reason: collision with root package name */
    DisplayImageOptions f1094b;
    private int c;
    private HackyViewPager d;
    /* access modifiers changed from: private */
    public ArrayList<b.b.b.d.a> e;
    private Button f;
    private TextView g;
    private RelativeLayout h;
    private RelativeLayout i;
    KeyguardManager.KeyguardLock j;
    private Button k;
    int l = 0;
    boolean m = true;
    /* access modifiers changed from: private */
    public Handler n = new d();
    private b.c.a.a.d.c o;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            XFTPShowPhotosActivity.this.k();
            XFTPShowPhotosActivity.this.finish();
        }
    }

    class b implements ViewPager.j {
        b() {
        }

        public void a(int i, float f, int i2) {
            XFTPShowPhotosActivity.this.n.sendEmptyMessage(2);
        }

        public void b(int i) {
            XFTPShowPhotosActivity.this.n.sendEmptyMessage(2);
        }

        public void c(int i) {
            c0.a(0, "XFTPShowPhotosActivity", "onPageSelected(" + i + ")");
            Message obtainMessage = XFTPShowPhotosActivity.this.n.obtainMessage();
            obtainMessage.what = 0;
            obtainMessage.arg1 = i;
            XFTPShowPhotosActivity.this.n.sendMessage(obtainMessage);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            c0.a(0, "XFTPShowPhotosActivity", "filter btn onclick -----! currentIndex = " + XFTPShowPhotosActivity.this.l);
            String d = ((b.b.b.d.a) XFTPShowPhotosActivity.this.e.get(XFTPShowPhotosActivity.this.l)).d();
            c0.a(0, "XFTPShowPhotosActivity", "filter btn onclick -----! currentIndex = " + XFTPShowPhotosActivity.this.l + " fileName=" + d);
            if (d.contains(".mp4")) {
                XFTPShowPhotosActivity xFTPShowPhotosActivity = XFTPShowPhotosActivity.this;
                Toast.makeText(xFTPShowPhotosActivity, xFTPShowPhotosActivity.getResources().getString(R.string.edit_video_not_support), 0).show();
                return;
            }
            Intent intent = new Intent(XFTPShowPhotosActivity.this, X1PhotoEditActivity.class);
            intent.putExtra("PARAM_PIC_NAME", d);
            intent.putExtra("PARAM_PIC_PATH", b.c.a.a.d.b.c + File.separator + d);
            XFTPShowPhotosActivity.this.startActivity(intent);
        }
    }

    class d extends Handler {
        d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                XFTPShowPhotosActivity.this.i(message.arg1);
            } else if (i == 1) {
                XFTPShowPhotosActivity.this.g();
            } else if (i == 2) {
                XFTPShowPhotosActivity.this.l();
            }
        }
    }

    class e implements c.b {
        e(XFTPShowPhotosActivity xFTPShowPhotosActivity) {
        }

        public void a() {
            b.c.a.a.d.b.z(0);
        }

        public void b() {
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1099a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.nostra13.universalimageloader.core.assist.FailReason$FailType[] r0 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1099a = r0
                com.nostra13.universalimageloader.core.assist.FailReason$FailType r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1099a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.nostra13.universalimageloader.core.assist.FailReason$FailType r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.DECODING_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1099a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.nostra13.universalimageloader.core.assist.FailReason$FailType r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.NETWORK_DENIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1099a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.nostra13.universalimageloader.core.assist.FailReason$FailType r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.OUT_OF_MEMORY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1099a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.nostra13.universalimageloader.core.assist.FailReason$FailType r1 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.XFTPShowPhotosActivity.f.<clinit>():void");
        }
    }

    private class g extends android.support.v4.view.f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<b.b.b.d.a> f1100a;

        /* renamed from: b  reason: collision with root package name */
        private LayoutInflater f1101b;

        class a implements b.g {
            a() {
            }

            public void a(View view, float f, float f2) {
                XFTPShowPhotosActivity xFTPShowPhotosActivity = XFTPShowPhotosActivity.this;
                xFTPShowPhotosActivity.n.sendEmptyMessage(xFTPShowPhotosActivity.m ? 1 : 2);
            }
        }

        class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f1103a;

            b(int i) {
                this.f1103a = i;
            }

            public void onClick(View view) {
                Intent intent;
                c0.a(0, "XFTPShowPhotosActivity", "btn_icon ONCLICK~~~");
                if (((b.b.b.d.a) g.this.f1100a.get(this.f1103a)).d().contains("mp4")) {
                    String str = b.c.a.a.d.b.c + File.separator + ((b.b.b.d.a) g.this.f1100a.get(this.f1103a)).d();
                    if (new File(str).exists()) {
                        intent = new Intent(XFTPShowPhotosActivity.this, X1PlayMp4Activity.class);
                    } else {
                        str = "http://" + (d0.t().p() != null ? d0.t().p().c() : "192.168.10.1") + ":8082/file/media/" + ((b.b.b.d.a) g.this.f1100a.get(this.f1103a)).h();
                        c0.a(0, "XFTPShowPhotosActivity", "The vidoe play url is = " + str);
                        intent = new Intent(XFTPShowPhotosActivity.this, X1PlayDevMp4Activity.class);
                    }
                    intent.putExtra("param_name", ((b.b.b.d.a) g.this.f1100a.get(this.f1103a)).d());
                    intent.putExtra("param_url", str);
                    XFTPShowPhotosActivity.this.startActivity(intent);
                }
            }
        }

        class c implements ImageLoadingListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProgressBar f1105a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1106b;
            final /* synthetic */ Button c;

            c(ProgressBar progressBar, int i, Button button) {
                this.f1105a = progressBar;
                this.f1106b = i;
                this.c = button;
            }

            public void onLoadingCancelled(String str, View view) {
            }

            public void onLoadingComplete(String str, View view, Bitmap bitmap) {
                c0.a(0, "XFTPShowPhotosActivity", "onLoadingComplete(" + str + ")");
                this.f1105a.setVisibility(8);
            }

            public void onLoadingFailed(String str, View view, FailReason failReason) {
                c0.a(0, "XFTPShowPhotosActivity", "onLoadingFailed()");
                int i = f.f1099a[failReason.getType().ordinal()];
                Toast.makeText(XFTPShowPhotosActivity.this, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "Unknown error" : "Out Of Memory error" : "Downloads are denied" : "Image can't be decoded" : "Input/Output error", 0).show();
                this.f1105a.setVisibility(8);
            }

            public void onLoadingStarted(String str, View view) {
                c0.a(0, "XFTPShowPhotosActivity", "onLoadingStarted()");
                this.f1105a.setVisibility(0);
                if (((b.b.b.d.a) g.this.f1100a.get(this.f1106b)).d().contains(".mp4")) {
                    this.c.setVisibility(0);
                }
            }
        }

        g(ArrayList<b.b.b.d.a> arrayList, Context context) {
            this.f1100a = arrayList;
            this.f1101b = XFTPShowPhotosActivity.this.getLayoutInflater();
        }

        public void a(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((View) obj);
        }

        public void b(View view) {
        }

        public int d() {
            return this.f1100a.size();
        }

        public Object g(ViewGroup viewGroup, int i) {
            c0.a(0, "XFTPShowPhotosActivity", "instantiateItem(" + i + ")");
            View inflate = this.f1101b.inflate(R.layout.item_pager_image, viewGroup, false);
            PhotoView photoView = (PhotoView) inflate.findViewById(R.id.image);
            Button button = (Button) inflate.findViewById(R.id.video_icon);
            button.setVisibility(8);
            photoView.setOnViewTapListener(new a());
            button.setOnClickListener(new b(i));
            XFTPShowPhotosActivity.this.f1093a.displayImage(this.f1100a.get(i).k(), (ImageView) photoView, XFTPShowPhotosActivity.this.f1094b, (ImageLoadingListener) new c((ProgressBar) inflate.findViewById(R.id.loading), i, button));
            ((ViewPager) viewGroup).addView(inflate, 0);
            return inflate;
        }

        public boolean h(View view, Object obj) {
            return view.equals(obj);
        }

        public void i(Parcelable parcelable, ClassLoader classLoader) {
        }

        public Parcelable j() {
            return null;
        }

        public void n(View view) {
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        c0.a(0, "XFTPShowPhotosActivity", "dismissTipsView()");
        this.n.removeMessages(2);
        this.n.removeMessages(1);
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.h.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.i;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            this.i.setVisibility(8);
        }
        this.m = false;
    }

    /* access modifiers changed from: private */
    public void i(int i2) {
        c0.a(0, "XFTPShowPhotosActivity", "refreshUI( " + i2 + ")");
        String d2 = this.e.get(i2).d();
        if (this.c == 0) {
            if (d2.contains(".mp4")) {
                this.k.setVisibility(8);
            } else {
                this.k.setVisibility(0);
            }
        }
        this.f.setText(d2);
        this.l = i2;
        this.g.setText((i2 + 1) + "/" + this.e.size());
    }

    private void j() {
        b.c.a.a.d.c cVar = new b.c.a.a.d.c(this);
        this.o = cVar;
        cVar.b(new e(this));
        this.o.c();
    }

    /* access modifiers changed from: private */
    public void k() {
        c0.a(0, "XFTPShowPhotosActivity", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        intent.putExtra("notify_only", true);
        sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void l() {
        c0.a(0, "XFTPShowPhotosActivity", "showTipsView()");
        this.n.removeMessages(2);
        this.n.removeMessages(1);
        RelativeLayout relativeLayout = this.h;
        if (!(relativeLayout == null || relativeLayout.getVisibility() == 0)) {
            this.h.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = this.i;
        if (!(relativeLayout2 == null || relativeLayout2.getVisibility() == 0)) {
            this.i.setVisibility(0);
        }
        this.m = true;
        this.n.sendEmptyMessageDelayed(1, 5000);
    }

    public void h(Context context) {
        ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(context).threadPriority(3).denyCacheImageMultipleSizesInMemory().discCacheFileNameGenerator(new Md5FileNameGenerator()).tasksProcessingOrder(QueueProcessingType.LIFO).writeDebugLogs().build());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(128, 128);
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435462, "SimpleTimer");
        newWakeLock.acquire();
        newWakeLock.release();
        KeyguardManager.KeyguardLock newKeyguardLock = ((KeyguardManager) getSystemService("keyguard")).newKeyguardLock("");
        this.j = newKeyguardLock;
        newKeyguardLock.disableKeyguard();
        setContentView(R.layout.activity_showphotos);
        this.f = (Button) findViewById(R.id.back_btn);
        this.g = (TextView) findViewById(R.id.photos_bottom_tips);
        this.h = (RelativeLayout) findViewById(R.id.photos_top_view);
        this.i = (RelativeLayout) findViewById(R.id.photos_bottom_view);
        this.f.setOnClickListener(new a());
        h(this);
        Bundle extras = getIntent().getExtras();
        this.e = extras.getParcelableArrayList("param_file_list");
        int i2 = extras.getInt("param_index", 0);
        if (bundle != null) {
            i2 = bundle.getInt("state_position");
        }
        this.f1094b = new DisplayImageOptions.Builder().showImageForEmptyUri((int) R.drawable.ic_empty).showImageOnFail((int) R.drawable.ic_error).resetViewBeforeLoading(true).cacheOnDisc(true).imageScaleType(ImageScaleType.EXACTLY).bitmapConfig(Bitmap.Config.ARGB_8888).displayer(new FadeInBitmapDisplayer(300)).build();
        HackyViewPager hackyViewPager = (HackyViewPager) findViewById(R.id.pager);
        this.d = hackyViewPager;
        hackyViewPager.setAdapter(new g(this.e, this));
        this.d.setCurrentItem(i2);
        Message obtainMessage = this.n.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.arg1 = i2;
        this.n.sendMessage(obtainMessage);
        this.d.setOnPageChangeListener(new b());
        this.c = getIntent().getIntExtra("param_dev_view", 0);
        Button button = (Button) findViewById(R.id.btn_filter);
        this.k = button;
        if (this.c == 1) {
            button.setVisibility(8);
        }
        this.k.setOnClickListener(new c());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        j();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("state_position", this.d.getCurrentItem());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.n.sendEmptyMessage(2);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.j.reenableKeyguard();
        this.o.d();
    }
}
