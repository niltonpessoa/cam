package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.j;
import com.xforce.v5.xdvpro.widget.r.a0;
import com.xforce.v5.xdvpro.widget.r.b0;
import com.xforce.v5.xdvpro.widget.r.e0;
import com.xforce.v5.xdvpro.widget.r.f0;
import com.xforce.v5.xdvpro.widget.r.h;
import com.xforce.v5.xdvpro.widget.r.h0;
import com.xforce.v5.xdvpro.widget.r.i;
import com.xforce.v5.xdvpro.widget.r.i0;
import com.xforce.v5.xdvpro.widget.r.n;
import com.xforce.v5.xdvpro.widget.r.o;
import com.xforce.v5.xdvpro.widget.r.q;
import com.xforce.v5.xdvpro.widget.r.u;
import com.xforce.v5.xdvpro.widget.r.v;
import com.xforce.v5.xdvpro.widget.r.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class X1PhotoEditActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public GridView f1035a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1036b;
    private RelativeLayout c;
    Bitmap d;
    Bitmap e;
    ImageView f;
    Button g;
    Button h;
    TextView i;
    String j;
    String k;
    RelativeLayout.LayoutParams l;
    List<h> m;
    private j n;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            X1PhotoEditActivity.this.finish();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            X1PhotoEditActivity.this.h();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            X1PhotoEditActivity.this.i();
        }
    }

    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "X1PhotoEditActivity", "onItemClick() position = " + i);
            f fVar = (f) X1PhotoEditActivity.this.f1035a.getAdapter();
            fVar.a(i);
            fVar.notifyDataSetChanged();
            h hVar = X1PhotoEditActivity.this.m.get(i);
            if (hVar.f1255b != null) {
                X1PhotoEditActivity x1PhotoEditActivity = X1PhotoEditActivity.this;
                new g(x1PhotoEditActivity, hVar.f1255b).execute(new Void[0]);
            } else if (i == 18) {
                X1PhotoEditActivity x1PhotoEditActivity2 = X1PhotoEditActivity.this;
                new g(x1PhotoEditActivity2, hVar.f1255b).execute(new Void[0]);
            } else {
                X1PhotoEditActivity x1PhotoEditActivity3 = X1PhotoEditActivity.this;
                x1PhotoEditActivity3.f.setImageBitmap(x1PhotoEditActivity3.d);
                X1PhotoEditActivity.this.e = null;
            }
        }
    }

    public static class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f1041a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f1042b;
    }

    public class f extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        Context f1043a;

        /* renamed from: b  reason: collision with root package name */
        private LayoutInflater f1044b;
        List<h> c;
        private e d;
        private int e;

        public f(X1PhotoEditActivity x1PhotoEditActivity, Context context, List<h> list) {
            this.c = list;
            this.f1043a = context;
            this.f1044b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(int i) {
            this.e = i;
        }

        public int getCount() {
            return this.c.size();
        }

        public Object getItem(int i) {
            return this.c.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            this.d = null;
            if (view == null) {
                view = this.f1044b.inflate(R.layout.list_item, (ViewGroup) null);
                e eVar = new e();
                this.d = eVar;
                ImageView unused = eVar.f1042b = (ImageView) view.findViewById(R.id.ItemImage);
                RelativeLayout unused2 = this.d.f1041a = (RelativeLayout) view.findViewById(R.id.itemlayout);
                view.setTag(this.d);
            } else {
                this.d = (e) view.getTag();
            }
            this.d.f1042b.setBackgroundDrawable(this.f1043a.getResources().getDrawable(this.c.get(i).f1254a));
            this.d.f1041a.setBackgroundColor(this.f1043a.getResources().getColor(R.color.transparent));
            if (this.e == i) {
                this.d.f1041a.setBackgroundColor(this.f1043a.getResources().getColor(R.color.main_color));
            }
            return view;
        }
    }

    public class g extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private o f1045a;

        public g(Activity activity, o oVar) {
            this.f1045a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r5) {
            /*
                r4 = this;
                r5 = 0
                com.xforce.v5.xdvpro.widget.r.r r0 = new com.xforce.v5.xdvpro.widget.r.r     // Catch:{ Exception -> 0x0051, all -> 0x004e }
                com.xforce.v5.xdvpro.ui.X1PhotoEditActivity r1 = com.xforce.v5.xdvpro.ui.X1PhotoEditActivity.this     // Catch:{ Exception -> 0x0051, all -> 0x004e }
                android.graphics.Bitmap r1 = r1.d     // Catch:{ Exception -> 0x0051, all -> 0x004e }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
                com.xforce.v5.xdvpro.widget.r.o r1 = r4.f1045a     // Catch:{ Exception -> 0x004c }
                if (r1 == 0) goto L_0x002e
                com.xforce.v5.xdvpro.widget.r.r r0 = r1.a(r0)     // Catch:{ Exception -> 0x004c }
                r0.e()     // Catch:{ Exception -> 0x004c }
                android.graphics.Bitmap r1 = r0.j()     // Catch:{ Exception -> 0x004c }
                if (r0 == 0) goto L_0x002d
                android.graphics.Bitmap r2 = r0.f1271a
                boolean r2 = r2.isRecycled()
                if (r2 == 0) goto L_0x002d
                android.graphics.Bitmap r2 = r0.f1271a
                r2.recycle()
                r0.f1271a = r5
                java.lang.System.gc()
            L_0x002d:
                return r1
            L_0x002e:
                com.xforce.v5.xdvpro.ui.X1PhotoEditActivity r1 = com.xforce.v5.xdvpro.ui.X1PhotoEditActivity.this     // Catch:{ Exception -> 0x004c }
                android.graphics.Bitmap r1 = r1.d     // Catch:{ Exception -> 0x004c }
                r2 = 20
                r3 = 6
                android.graphics.Bitmap r1 = com.xforce.v5.xdvpro.widget.r.j0.a(r1, r2, r3)     // Catch:{ Exception -> 0x004c }
                android.graphics.Bitmap r2 = r0.f1271a
                boolean r2 = r2.isRecycled()
                if (r2 == 0) goto L_0x004b
                android.graphics.Bitmap r2 = r0.f1271a
                r2.recycle()
                r0.f1271a = r5
                java.lang.System.gc()
            L_0x004b:
                return r1
            L_0x004c:
                goto L_0x0052
            L_0x004e:
                r1 = move-exception
                r0 = r5
                goto L_0x0068
            L_0x0051:
                r0 = r5
            L_0x0052:
                if (r0 == 0) goto L_0x007d
                android.graphics.Bitmap r1 = r0.f1272b     // Catch:{ all -> 0x0067 }
                boolean r1 = r1.isRecycled()     // Catch:{ all -> 0x0067 }
                if (r1 == 0) goto L_0x007d
                android.graphics.Bitmap r1 = r0.f1272b     // Catch:{ all -> 0x0067 }
                r1.recycle()     // Catch:{ all -> 0x0067 }
                r0.f1272b = r5     // Catch:{ all -> 0x0067 }
                java.lang.System.gc()     // Catch:{ all -> 0x0067 }
                goto L_0x007d
            L_0x0067:
                r1 = move-exception
            L_0x0068:
                if (r0 == 0) goto L_0x007c
                android.graphics.Bitmap r2 = r0.f1271a
                boolean r2 = r2.isRecycled()
                if (r2 == 0) goto L_0x007c
                android.graphics.Bitmap r2 = r0.f1271a
                r2.recycle()
                r0.f1271a = r5
                java.lang.System.gc()
            L_0x007c:
                throw r1
            L_0x007d:
                if (r0 == 0) goto L_0x0091
                android.graphics.Bitmap r1 = r0.f1271a
                boolean r1 = r1.isRecycled()
                if (r1 == 0) goto L_0x0091
                android.graphics.Bitmap r1 = r0.f1271a
                r1.recycle()
                r0.f1271a = r5
                java.lang.System.gc()
            L_0x0091:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.X1PhotoEditActivity.g.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                super.onPostExecute(bitmap);
                X1PhotoEditActivity.this.f.setImageBitmap(bitmap);
                X1PhotoEditActivity.this.e = bitmap;
            }
            X1PhotoEditActivity.this.g();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            X1PhotoEditActivity.this.m();
        }
    }

    private String f(Bitmap bitmap, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(b.c.a.a.d.b.c);
        String str = File.separator;
        sb.append(str);
        sb.append(b.c.a.a.d.b.x("yyyyMMdd_HHmmsss"));
        sb.append(".jpg");
        String sb2 = sb.toString();
        if (z) {
            sb2 = b.c.a.a.d.b.g + str + b.c.a.a.d.b.x("yyyyMMdd_HHmmsss") + ".jpg";
            File file = new File(b.c.a.a.d.b.g);
            if (file.listFiles().length > 0) {
                for (File file2 : file.listFiles()) {
                    if (file2.delete()) {
                        c0.a(0, "X1PhotoEditActivity", "bitmapSavedForFile()" + file2.getName() + " delete success!");
                    }
                }
            }
        }
        File file3 = new File(sb2);
        if (file3.exists()) {
            file3.delete();
        }
        c0.a(0, "X1PhotoEditActivity", "photoSave() path = " + sb2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            c0.a(0, "X1PhotoEditActivity", "photoSave() end!");
            com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_save_succ), true);
            return sb2;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_save_err), false);
        return null;
    }

    /* access modifiers changed from: private */
    public void g() {
        j jVar = this.n;
        if (jVar != null && jVar.isShowing()) {
            this.n.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        c0.a(0, "X1PhotoEditActivity", "photoSave()");
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            c0.a(3, "X1PhotoEditActivity", "photoSave() --- nowBitmap is null,no change!");
            com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_no_change), false);
        } else if (f(bitmap, false) != null) {
            com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_save_succ), true);
        } else {
            com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_save_err), false);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        c0.a(0, "X1PhotoEditActivity", "photoShare()");
        if (!b.c.a.a.d.b.p) {
            Toast.makeText(this, getResources().getString(R.string.edit_photo_share_not_offline_plz_save), 1).show();
            return;
        }
        Bitmap bitmap = this.e;
        String f2 = bitmap == null ? this.k : f(bitmap, true);
        if (f2 == null) {
            com.xforce.v5.xdvpro.widget.o.g(this, getResources().getString(R.string.edit_photo_share_err), false);
            return;
        }
        c0.a(0, "X1PhotoEditActivity", "photoShare() --- pathShare = " + f2);
        File file = new File(f2);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image" + "/*");
        intent.putExtra("android.intent.extra.STREAM", Build.VERSION.SDK_INT >= 24 ? FileProvider.e(this, "com.xforce.v5.xdvpro.fileProvider", file) : Uri.fromFile(file));
        startActivity(Intent.createChooser(intent, getResources().getString(R.string.file_opt_share)));
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        arrayList.add(new h(R.drawable.img_demo, (o) null));
        this.m.add(new h(R.drawable.demo_00, new f0(20, 8, 45, (byte) 1)));
        this.m.add(new h(R.drawable.demo_01, new f0(20, 8, 45, (byte) 2)));
        this.m.add(new h(R.drawable.demo_02, new com.xforce.v5.xdvpro.widget.r.g(this, R.drawable.texture2)));
        this.m.add(new h(R.drawable.demo_03, new v(false)));
        this.m.add(new h(R.drawable.demo_04, new e0(new com.xforce.v5.xdvpro.widget.r.e(), 0.800000011920929d, 0.800000011920929d)));
        this.m.add(new h(R.drawable.demo_05, new e0(new u(), 0.800000011920929d, 0.800000011920929d)));
        this.m.add(new h(R.drawable.demo_06, new n(40.0f)));
        this.m.add(new h(R.drawable.demo_07, new n(60.0f)));
        this.m.add(new h(R.drawable.demo_08, new n(80.0f)));
        this.m.add(new h(R.drawable.demo_09, new i0(30)));
        this.m.add(new h(R.drawable.demo_10, new com.xforce.v5.xdvpro.widget.r.f(Color.rgb(33, 168, 254), 192)));
        this.m.add(new h(R.drawable.demo_11, new com.xforce.v5.xdvpro.widget.r.c0(10)));
        this.m.add(new h(R.drawable.demo_12, new com.xforce.v5.xdvpro.widget.r.d(-97)));
        this.m.add(new h(R.drawable.demo_13, new q(3)));
        this.m.add(new h(R.drawable.demo_14, new i(50)));
        this.m.add(new h(R.drawable.demo_15, new b0()));
        this.m.add(new h(R.drawable.demo_16, new com.xforce.v5.xdvpro.widget.r.c()));
        this.m.add(new h(R.drawable.demo_17, (o) null));
        this.m.add(new h(R.drawable.demo_18, new com.xforce.v5.xdvpro.widget.r.a()));
        this.m.add(new h(R.drawable.demo_19, new a0()));
        this.m.add(new h(R.drawable.demo_20, new x()));
        this.m.add(new h(R.drawable.demo_21, new h0()));
    }

    private void k() {
        int size = this.m.size();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        this.f1035a.setLayoutParams(new LinearLayout.LayoutParams((int) (((float) (size * 104)) * f2), -1));
        this.f1035a.setColumnWidth((int) (((float) 100) * f2));
        this.f1035a.setHorizontalSpacing(6);
        this.f1035a.setStretchMode(0);
        this.f1035a.setNumColumns(size);
        this.f1035a.setSelector(new ColorDrawable(0));
        this.f1035a.setOnItemClickListener(new d());
        this.f1035a.setAdapter(new f(this, getApplicationContext(), this.m));
    }

    private void l() {
        c0.a(0, "X1PhotoEditActivity", "setLayoutParams()");
        int i2 = b.c.a.a.d.b.i;
        this.l = new RelativeLayout.LayoutParams(i2, (i2 * 3) / 4);
        c0.a(0, "X1PhotoEditActivity", "setLayoutParams() --- width:" + this.l.width + " height:" + this.l.height);
        this.l.addRule(14);
        this.l.addRule(3, R.id.top_title);
        this.l.setMargins(0, 0, 0, 0);
        this.c.setLayoutParams(this.l);
    }

    /* access modifiers changed from: private */
    public void m() {
        if (this.n == null) {
            this.n = new j(this, R.style.confirm_dialog);
        }
        this.n.show();
        this.n.d(true);
        this.n.c(getResources().getString(R.string.please_wait));
        this.n.setCancelable(false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0.a(0, "X1PhotoEditActivity", "onCreate()");
        setContentView(R.layout.activity_photoedit);
        this.f1035a = (GridView) findViewById(R.id.img_demo);
        this.f1036b = (Button) findViewById(R.id.back_btn);
        this.c = (RelativeLayout) findViewById(R.id.img_bg);
        this.f = (ImageView) findViewById(R.id.img_origin);
        this.f1036b.setOnClickListener(new a());
        Button button = (Button) findViewById(R.id.btn_save);
        this.g = button;
        button.setOnClickListener(new b());
        Button button2 = (Button) findViewById(R.id.btn_share);
        this.h = button2;
        button2.setOnClickListener(new c());
        this.i = (TextView) findViewById(R.id.title);
        j();
        k();
        l();
        String stringExtra = getIntent().getStringExtra("PARAM_PIC_NAME");
        this.j = stringExtra;
        this.i.setText(stringExtra);
        this.k = getIntent().getStringExtra("PARAM_PIC_PATH");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.k, options);
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        c0.a(0, "X1PhotoEditActivity", "org bitmap width:" + i3 + " height:" + i2);
        int round = Math.round(((float) i3) / ((float) this.l.width));
        options.inSampleSize = round;
        options.inJustDecodeBounds = false;
        this.d = BitmapFactory.decodeFile(this.k, options);
        c0.a(0, "X1PhotoEditActivity", "after bitmap inSampleSize : " + round + " width:" + this.d.getWidth() + " height:" + this.d.getHeight());
        this.f.setImageBitmap(this.d);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        c0.a(0, "X1PhotoEditActivity", "onDestroy()");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        c0.a(0, "X1PhotoEditActivity", "onResume()");
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        c0.a(0, "X1PhotoEditActivity", "onStop()");
    }
}
