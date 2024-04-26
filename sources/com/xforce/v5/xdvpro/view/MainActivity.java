package com.xforce.v5.xdvpro.view;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.X1NewWiFiSelectActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1167a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1168b;
    private Animation c;
    /* access modifiers changed from: private */
    public boolean d = false;
    /* access modifiers changed from: private */
    public boolean e = false;
    private int f;
    Handler g = new a();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                MainActivity.this.i();
            } else if (i == 1) {
                MainActivity.this.m();
                MainActivity.this.l();
                MainActivity.this.g.sendEmptyMessageDelayed(0, 1500);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            File file = new File(b.c.a.a.d.b.f865a + "/" + MainActivity.this.getResources().getString(R.string.app_name) + "_media");
            boolean exists = file.exists();
            StringBuilder sb = new StringBuilder();
            sb.append("isNewMediaDirExist ---- ");
            sb.append(exists);
            c0.a(0, "X1BeginActivity", sb.toString());
            if (!exists) {
                c0.a(0, "X1BeginActivity", file.mkdirs() ? "create new dir success" : "create new dir fail!");
                File file2 = new File(b.c.a.a.d.b.f865a);
                if (file2.exists()) {
                    for (File file3 : file2.listFiles()) {
                        if (file3.isDirectory()) {
                            String str = file3.getPath() + File.separator + "media";
                            c0.a(0, "X1BeginActivity", "oldDir : " + str);
                            File[] listFiles = new File(str).listFiles();
                            if (listFiles != null) {
                                for (File file4 : listFiles) {
                                    c0.a(0, "X1BeginActivity", "dirName:" + file3.getName() + " mediaName:" + file4.getName());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(file.getPath());
                                    sb2.append(File.separator);
                                    sb2.append(file4.getName());
                                    String sb3 = sb2.toString();
                                    b.c.a.a.d.b.d(file4.getPath(), sb3, true);
                                    b.c.a.a.d.b.A(MainActivity.this, sb3);
                                }
                            }
                        }
                    }
                }
            }
            boolean unused = MainActivity.this.d = true;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            boolean unused = MainActivity.this.e = false;
            SharedPreferences sharedPreferences = MainActivity.this.getSharedPreferences("1.5.3", 0);
            if (sharedPreferences.getInt("1.5.3", 0) != 1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("1.5.3", 1);
                edit.commit();
                c0.a(0, "X1BeginActivity", "start startModifyXmlFile()....");
                File file = new File(b.c.a.a.d.b.f866b);
                if (!file.exists()) {
                    c0.a(0, "X1BeginActivity", "file haven't create!");
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<String> k = b.c.a.a.d.b.k();
                    ArrayList arrayList2 = new ArrayList();
                    for (int size = k.size() - 1; size >= 0; size--) {
                        b.c.a.a.c.a i = b.c.a.a.d.b.i(k.get(size));
                        if (!arrayList.contains(i.c())) {
                            arrayList.add(i.c());
                            arrayList2.add(i);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        file.delete();
                        b.c.a.a.d.b.s();
                        try {
                            file.createNewFile();
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                b.c.a.a.d.b.a((b.c.a.a.c.a) arrayList2.get(i2));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            boolean unused2 = MainActivity.this.e = true;
        }
    }

    private void f() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            this.f = 0;
            ArrayList arrayList = new ArrayList();
            if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            }
            if (checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            }
            if (i < 30 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.size() > 0) {
                requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 127);
                return;
            }
        }
        this.g.sendEmptyMessage(1);
    }

    private int g(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        if (i != 0) {
            return i;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return i;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return i;
        } catch (InstantiationException e4) {
            e4.printStackTrace();
            return i;
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
            return i;
        } catch (IllegalArgumentException e6) {
            e6.printStackTrace();
            return i;
        } catch (SecurityException e7) {
            e7.printStackTrace();
            return i;
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
            return i;
        }
    }

    private String h() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        c0.a(0, "X1BeginActivity", "goLogin()");
        if (this.d || this.e) {
            startActivity(new Intent(this, X1NewWiFiSelectActivity.class));
            finish();
            return;
        }
        this.g.sendEmptyMessageDelayed(0, 3000);
    }

    private void j() {
        c0.a(0, "X1BeginActivity", "initData");
    }

    private void k() {
        c0.a(0, "X1BeginActivity", "initView");
        this.f1168b = (ImageView) findViewById(R.id.begin_loadingview);
        this.f1167a = (TextView) findViewById(R.id.begin_version);
    }

    /* access modifiers changed from: private */
    public void l() {
        c0.a(0, "X1BeginActivity", "startModifyXmlFile()");
        new Thread(new c()).start();
    }

    /* access modifiers changed from: private */
    public void m() {
        new Thread(new b()).start();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 127) {
            c0.a(0, "X1BeginActivity", "getPermissions SDK_PERMISSION_REQUEST");
            f();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0.a(0, "X1BeginActivity", "onCreate");
        requestWindowFeature(1);
        setContentView(R.layout.activity_begin);
        f();
        d0.t().y(this);
        b.c.a.a.d.b.u(this);
        k();
        j();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int i3 = displayMetrics.densityDpi;
        c0.a(3, "X1BeginActivity", "width=" + i + " height=" + i2 + " density=" + f2 + " densityDpi=" + i3);
        b.c.a.a.d.b.h = i2;
        b.c.a.a.d.b.i = i;
        b.c.a.a.d.b.j = f2;
        b.c.a.a.d.b.k = g(this);
        StringBuilder sb = new StringBuilder();
        sb.append("CCGlobal.STATUS_BAR_HEIGHT = ");
        sb.append(b.c.a.a.d.b.k);
        c0.a(0, "X1BeginActivity", sb.toString());
        b.c.a.a.d.b.o = h();
        this.f1167a.setText("V" + b.c.a.a.d.b.o);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.begin_loading_animation);
        this.c = loadAnimation;
        this.f1168b.startAnimation(loadAnimation);
        ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(this).threadPoolSize(1).build());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Product Model: ");
        String str = Build.MODEL;
        sb2.append(str);
        sb2.append(",");
        sb2.append(Build.VERSION.SDK);
        sb2.append(",");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(",");
        sb2.append(Build.DEVICE);
        c0.a(0, "X1BeginActivity", sb2.toString());
        String str2 = Build.MANUFACTURER;
        if (str2 != null && str2.trim().contains("samsung") && (str == null || (!str.trim().toLowerCase().contains("google") && !str.trim().toLowerCase().contains("nexus")))) {
            c0.a(3, "X1BeginActivity", "find samsung device");
        }
        if (str.contains("HM") || str.contains("MI")) {
            c0.a(3, "X1BeginActivity", "find xiao mi device!");
            b.c.a.a.d.b.r = true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        int length = strArr.length;
        c0.a(0, "X1BeginActivity", "request permission --- size:" + length);
        for (int i3 = 0; i3 < length; i3++) {
            c0.a(0, "X1BeginActivity", "request permission ---:" + strArr[i3] + " result:" + iArr[i3]);
            if (Build.VERSION.SDK_INT >= 23 && iArr[i3] == -1 && (i2 = this.f) == 0) {
                this.f = i2 + 1;
                c0.a(0, "X1BeginActivity", "request permissions：" + strArr[i3] + " is not allow");
                Toast.makeText(this, getResources().getString(R.string.all_permissions), 1).show();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
                startActivityForResult(intent, 127);
            }
        }
        if (this.f == 0) {
            c0.a(0, "X1BeginActivity", "permissions permission is all allow");
            this.g.sendEmptyMessage(1);
        }
    }
}
