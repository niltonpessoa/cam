package b.b.d;

import android.content.Context;
import android.util.Log;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class b {
    private static b F;
    private List<String> A;
    private List<List<c>> B;
    private int[] C = {0, 0, 0, 0, 0, 0, 0, 0};
    private String[][] D = {new String[]{"ml_record_resolution", "ml_record_eis", "ml_camera_distortioncalibration", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_video_quality", "ml_camera_iso", "ml_camera_timewatermark", "ml_record_audio"}, new String[]{"ml_record_slowmotion", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_video_quality"}, new String[]{"ml_record_resolution", "ml_record_length", "ml_record_eis", "ml_camera_distortioncalibration", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_video_quality", "ml_camera_iso", "ml_camera_timewatermark", "ml_record_audio"}, new String[]{"ml_timelapse_resolution", "ml_camera_distortioncalibration", "ml_record_interval", "ml_camera_whitebalance", "ml_camera_exposure", "ml_video_length", "ml_camera_metering", "ml_camera_sharpness", "ml_video_quality", "ml_camera_iso"}, new String[]{"ml_photo_resolution", "ml_camera_distortioncalibration", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_photo_shutter", "ml_camera_iso", "ml_camera_timewatermark"}, new String[]{"ml_photo_resolution", "ml_camera_distortioncalibration", "ml_photo_interval", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_camera_iso", "ml_camera_timewatermark"}, new String[]{"ml_photo_resolution", "ml_camera_distortioncalibration", "ml_photo_freq", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_camera_iso", "ml_camera_timewatermark"}, new String[]{"ml_photo_resolution", "ml_camera_distortioncalibration", "ml_photo_countdown", "ml_camera_whitebalance", "ml_camera_exposure", "ml_camera_metering", "ml_camera_sharpness", "ml_camera_iso", "ml_camera_timewatermark"}, new String[]{"ml_camera_imagerotation", "ml_device_wireless_reset", "ml_camera_lightsourcefrequency", "ml_camera_ledindicator", "ml_camera_autoscreensaver", "ml_camera_timedshutdown", "ml_device_beep", "ml_device_language", "ml_device_datetime_format", "ml_device_time_config", "ml_device_format", "ml_device_resetfactory"}};
    private int[] E = {0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15};

    /* renamed from: a  reason: collision with root package name */
    private List<c> f813a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f814b;
    private List<c> c;
    private List<c> d;
    private c e;
    private c f;
    private c g;
    private c h;
    private c i;
    private c j;
    private c k;
    private c l;
    private c m;
    private c n;
    private c o;
    private c p;
    private c q;
    private c r;
    private c s;
    private c t;
    private c u;
    private c v;
    private c w;
    private c x;
    private c y;
    private c z;

    public b() {
    }

    public static b e() {
        if (F == null) {
            F = new b();
        }
        return F;
    }

    private List<c> m(int i2) {
        if (i2 == 0) {
            return this.f813a;
        }
        if (i2 == 1) {
            return this.f814b;
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 != 3) {
            return null;
        }
        return this.d;
    }

    private c n(Document document, String str, int i2, int i3) {
        int i4 = str.equals("ml_device_wireless_reset") ? 1003 : (str.equals("ml_device_time_config") || str.equals("ml_device_format") || str.equals("ml_device_resetfactory") || str.equals("ml_device_date_config")) ? 1004 : 1001;
        if (d.c().e(document, str) == null) {
            return null;
        }
        c cVar = new c(str, d.c().e(document, str), i4);
        if (i4 == 1001) {
            cVar.f(d.c().d(document, str));
        }
        return cVar;
    }

    private void r(List<String> list, int i2) {
        this.D[i2] = new String[list.size()];
        Log.d("RPSet", "initLstTPIDs: lstTPIDs[" + i2 + "] count = " + this.D[i2].length);
        int i3 = 0;
        while (true) {
            String[][] strArr = this.D;
            if (i3 < strArr[i2].length) {
                strArr[i2][i3] = list.get(i3);
                Log.d("RPSet", "initSettingKeys: lstTPIDs[" + i2 + "][" + i3 + "] = " + this.D[i2][i3]);
                i3++;
            } else {
                return;
            }
        }
    }

    private void v(Context context) {
        Document document;
        File file = new File(b.c.a.a.d.b.f865a + File.separator + "setting_keys.xml");
        SAXReader sAXReader = new SAXReader();
        try {
            if (file.exists()) {
                document = sAXReader.read(file);
                if (document != null) {
                    List<String> d2 = d.c().d(document, "record_normal_setting_keys");
                    List<String> d3 = d.c().d(document, "record_slow_setting_keys");
                    List<String> d4 = d.c().d(document, "record_loop_setting_keys");
                    List<String> d5 = d.c().d(document, "record_timelapse_setting_keys");
                    List<String> d6 = d.c().d(document, "photo_normal_setting_keys");
                    List<String> d7 = d.c().d(document, "photo_auto_setting_keys");
                    List<String> d8 = d.c().d(document, "photo_burst_setting_keys");
                    List<String> d9 = d.c().d(document, "photo_time_setting_keys");
                    List<String> d10 = d.c().d(document, "system_setting_keys");
                    Log.d("RPSet", "ealenTest - normalRecordSettingKeys = " + d2);
                    Log.d("RPSet", "ealenTest - slowRecordSettingKeys = " + d3);
                    Log.d("RPSet", "ealenTest - loopRecordSettingKeys = " + d4);
                    Log.d("RPSet", "ealenTest - timelapseRecordSettingKeys = " + d5);
                    Log.d("RPSet", "ealenTest - normalPhotoSettingKeys = " + d6);
                    Log.d("RPSet", "ealenTest - autoPhotoSettingKeys = " + d7);
                    Log.d("RPSet", "ealenTest - burstPhotoSettingKeys = " + d8);
                    Log.d("RPSet", "ealenTest - timePhotoSettingKeys = " + d9);
                    Log.d("RPSet", "ealenTest - systemSettingKeys = " + d10);
                    if (d2 != null && d2.size() > 0) {
                        r(d2, 0);
                    }
                    if (d3 != null && d3.size() > 0) {
                        r(d3, 1);
                    }
                    if (d4 != null && d4.size() > 0) {
                        r(d4, 2);
                    }
                    if (d5 != null && d5.size() > 0) {
                        r(d5, 3);
                    }
                    if (d6 != null && d6.size() > 0) {
                        r(d6, 4);
                    }
                    if (d7 != null && d7.size() > 0) {
                        r(d7, 5);
                    }
                    if (d8 != null && d8.size() > 0) {
                        r(d8, 6);
                    }
                    if (d9 != null && d9.size() > 0) {
                        r(d9, 7);
                    }
                    if (d10 != null && d10.size() > 0) {
                        r(d10, 8);
                    }
                }
            }
        } catch (DocumentException e2) {
            e2.printStackTrace();
            document = null;
        }
    }

    private void w(Context context, List<c> list) {
        Document a2 = a.c().a(context, b.c.a.a.d.b.f865a);
        for (c next : list) {
            next.g(d.c().e(a2, next.c()));
            if (next.e() == 1001) {
                next.f(d.c().d(a2, next.c()));
            }
            Log.v("TAG", "1111111 RPSetItem:" + next);
        }
    }

    public List<List<c>> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f813a);
        arrayList.add(this.f814b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        return arrayList;
    }

    public c b() {
        return this.l;
    }

    public int c(int i2) {
        return this.C[i2];
    }

    public int d(int i2) {
        return this.E[i2];
    }

    public c f(int i2) {
        if (i2 == 1599 || i2 == 1600) {
            return this.v;
        }
        if (i2 == 1605 || i2 == 1606) {
            return this.w;
        }
        if (i2 == 1794 || i2 == 1795) {
            return this.t;
        }
        if (i2 == 1808 || i2 == 1809) {
            return this.x;
        }
        if (i2 == 1812 || i2 == 1813) {
            return this.s;
        }
        if (i2 == 1832 || i2 == 1833) {
            return this.p;
        }
        switch (i2) {
            case 1648:
            case 1649:
                return this.e;
            case 1650:
            case 1651:
                return this.h;
            case 1652:
            case 1653:
                return this.g;
            case 1654:
            case 1655:
                return this.f;
            default:
                switch (i2) {
                    case 1664:
                    case 1665:
                        return this.i;
                    case 1666:
                    case 1667:
                        return this.j;
                    case 1668:
                    case 1669:
                        return this.k;
                    case 1670:
                    case 1671:
                        return this.l;
                    case 1672:
                    case 1673:
                        return this.m;
                    default:
                        switch (i2) {
                            case 1680:
                            case 1681:
                                return this.n;
                            case 1682:
                            case 1683:
                                return this.o;
                            case 1684:
                            case 1685:
                                return this.r;
                            case 1686:
                            case 1687:
                                return this.q;
                            case 1688:
                            case 1689:
                                return this.u;
                            default:
                                return null;
                        }
                }
        }
    }

    public c g(int i2, int i3) {
        return m(i2).get(i3);
    }

    public List<c> h(int i2) {
        List<List<c>> list = this.B;
        if (list == null || list.size() < i2) {
            return null;
        }
        return this.B.get(i2);
    }

    public c i(int i2, int i3) {
        List<List<c>> list = this.B;
        if (list == null || list.size() < i2) {
            return null;
        }
        return (c) this.B.get(i2).get(i3);
    }

    public String[] j(int i2) {
        int i3 = i2 / 4 == 1 ? 4 : 0;
        return new String[]{this.A.get(i3 + 0), this.A.get(i3 + 1), this.A.get(i3 + 2), this.A.get(i3 + 3)};
    }

    public String[] k(int i2, int i3) {
        int i4 = 4;
        boolean z2 = i2 < 4;
        if (z2) {
            i4 = 0;
        }
        if (z2) {
            if (i2 == 0) {
                return new String[]{this.A.get(i4 + 0)};
            }
            return new String[]{this.A.get(i4 + 2)};
        } else if (i3 == 0) {
            return new String[]{this.A.get(i4 + 0), this.A.get(i4 + 2), this.A.get(i4 + 3)};
        } else {
            return new String[]{this.A.get(i4 + 0), this.A.get(i4 + 2), this.A.get(i4 + 1)};
        }
    }

    public c l() {
        return this.j;
    }

    public c o() {
        return this.k;
    }

    public c p() {
        return this.e;
    }

    public c q() {
        return this.i;
    }

    public void s(Context context) {
        Context context2 = context;
        this.e = new c("ml_record_resolution", 1648, 1649, 1001);
        this.f = new c("ml_record_volume", 1654, 1655, 1002);
        this.g = new c("ml_record_timelapse", 1652, 1653, 1001);
        this.h = new c("ml_record_loop", 1650, 1651, 1001);
        this.i = new c("ml_record_slowmotion", 1664, 1665, 1001);
        this.j = new c("ml_photo_resolution", 1666, 1667, 1001);
        this.k = new c("ml_photo_timed", 1668, 1669, 1001);
        this.l = new c("ml_photo_auto", 1670, 1671, 1001);
        this.m = new c("ml_photo_dramashot", 1672, 1673, 1001);
        this.n = new c("ml_camera_exposure", 1680, 1681, 1001);
        this.o = new c("ml_camera_whitebalance", 1682, 1683, 1001);
        this.p = new c("ml_camera_wifi_set", context.getResources().getString(R.string.setting_group_2_6), 1832, 1833, 1003);
        this.q = new c("ml_camera_imagerotation", 1686, 1687, 1002);
        this.r = new c("ml_camera_lightsourcefrequency", 1684, 1685, 1001);
        this.s = new c("ml_camera_ledindicator", 1812, 1813, 1002);
        this.t = new c("ml_camera_autoscreensaver", 1794, 1795, 1001);
        this.u = new c("ml_camera_timewatermark", 1688, 1689, 1002);
        this.v = new c("ml_device_datetime_sync", context.getResources().getString(R.string.setting_group_2_7), 1599, 1600, 1003);
        this.w = new c("ml_device_format", 1605, 1606, 1004);
        this.x = new c("ml_device_resetfactory", 1808, 1809, 1004);
        this.y = new c("ml_storage_id", context.getResources().getString(R.string.setting_group_3_2), 1004);
        this.z = new c("ml_exit_id", context.getResources().getString(R.string.setting_group_3_3), 1004);
        ArrayList arrayList = new ArrayList();
        this.f813a = arrayList;
        arrayList.add(this.e);
        this.f813a.add(this.f);
        this.f813a.add(this.g);
        this.f813a.add(this.h);
        this.f813a.add(this.i);
        ArrayList arrayList2 = new ArrayList();
        this.f814b = arrayList2;
        arrayList2.add(this.j);
        this.f814b.add(this.k);
        this.f814b.add(this.l);
        this.f814b.add(this.m);
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        arrayList3.add(this.n);
        this.c.add(this.o);
        this.c.add(this.q);
        this.c.add(this.r);
        this.c.add(this.s);
        this.c.add(this.t);
        this.c.add(this.u);
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        arrayList4.add(this.w);
        this.d.add(this.x);
        w(context2, this.f813a);
        w(context2, this.f814b);
        w(context2, this.c);
        w(context2, this.d);
        this.c.add(this.p);
        this.c.add(this.v);
        this.d.add(this.y);
        this.d.add(this.z);
    }

    public void t(Context context) {
        v(context);
        Document a2 = a.c().a(context, b.c.a.a.d.b.f865a);
        this.A = new ArrayList();
        this.A.add(d.c().e(a2, "mode_normal_rec"));
        this.A.add(d.c().e(a2, "mode_slowly_rec"));
        this.A.add(d.c().e(a2, "mode_loop_rec"));
        this.A.add(d.c().e(a2, "mode_timelapse_rec"));
        this.A.add(d.c().e(a2, "mode_normal_pic"));
        this.A.add(d.c().e(a2, "mode_auto_pic"));
        this.A.add(d.c().e(a2, "mode_continue_pic"));
        this.A.add(d.c().e(a2, "mode_timing_pic"));
        c0.a(0, "RPSet", "lstStrMode:" + this.A);
        c0.a(0, "RPSet", " --- lstTPIDs LENGTH: " + this.D.length);
        this.B = new ArrayList();
        for (int i2 = 0; i2 < this.D.length; i2++) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                String[][] strArr = this.D;
                if (i3 >= strArr[i2].length) {
                    break;
                }
                c n2 = n(a2, strArr[i2][i3], i2, i3);
                if (n2 != null) {
                    arrayList.add(n2);
                }
                i3++;
            }
            this.B.add(arrayList);
            c0.a(0, "RPSet", "i:" + i2 + " list:" + arrayList);
        }
    }

    public void u(Context context, String str) {
        v(context);
        Document b2 = a.c().b(context, str);
        this.A = new ArrayList();
        this.A.add(d.c().e(b2, "mode_normal_rec"));
        this.A.add(d.c().e(b2, "mode_slowly_rec"));
        this.A.add(d.c().e(b2, "mode_loop_rec"));
        this.A.add(d.c().e(b2, "mode_timelapse_rec"));
        this.A.add(d.c().e(b2, "mode_normal_pic"));
        this.A.add(d.c().e(b2, "mode_auto_pic"));
        this.A.add(d.c().e(b2, "mode_continue_pic"));
        this.A.add(d.c().e(b2, "mode_timing_pic"));
        c0.a(0, "RPSet", "lstStrMode:" + this.A);
        c0.a(0, "RPSet", " --- lstTPIDs LENGTH: " + this.D.length);
        this.B = new ArrayList();
        for (int i2 = 0; i2 < this.D.length; i2++) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                String[][] strArr = this.D;
                if (i3 >= strArr[i2].length) {
                    break;
                }
                c n2 = n(b2, strArr[i2][i3], i2, i3);
                if (n2 != null && !"ml_device_deviceinfo_version".equals(n2.c())) {
                    arrayList.add(n2);
                    c0.a(0, "RPSet", "each item i:" + i2 + " j:" + i3 + " tmpItem:" + n2);
                }
                i3++;
            }
            this.B.add(arrayList);
            c0.a(0, "RPSet", "each mode items i:" + i2 + " size:" + arrayList.size() + " list:" + arrayList);
        }
    }
}
