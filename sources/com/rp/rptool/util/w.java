package com.rp.rptool.util;

import java.io.UnsupportedEncodingException;

public class w {
    public e A = new e();

    /* renamed from: a  reason: collision with root package name */
    public int f961a;

    /* renamed from: b  reason: collision with root package name */
    public int f962b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public c k = new c();
    public c l = new c();
    public c m = new c();
    public c n = new c();
    public c o = new c();
    public c p = new c();
    public c q = new c();
    public c r = new c();
    public c s = new c();
    public c t = new c();
    public c u = new c();
    public c v = new c();
    public c w = new c();
    public d x = new d();
    public c y = new c();
    public c z = new c();

    public w(byte[] bArr) {
        this.f961a = b.b(bArr, 0);
        this.f962b = b.b(bArr, 4);
        this.c = b.b(bArr, 8);
        this.d = b.b(bArr, 12);
        this.e = b.b(bArr, 16);
        this.f = b.b(bArr, 20);
        this.g = b.b(bArr, 24);
        this.h = b.b(bArr, 28);
        this.i = b.b(bArr, 32);
        this.j = b.b(bArr, 36);
        this.k.f927a = b.b(bArr, 40);
        this.k.f928b = b.b(bArr, 44);
        this.l.f927a = b.b(bArr, 48);
        this.l.f928b = b.b(bArr, 52);
        this.m.f927a = b.b(bArr, 56);
        this.m.f928b = b.b(bArr, 60);
        this.n.f927a = b.b(bArr, 64);
        this.n.f928b = b.b(bArr, 68);
        this.o.f927a = b.b(bArr, 72);
        this.o.f928b = b.b(bArr, 76);
        this.p.f927a = b.b(bArr, 80);
        this.p.f928b = b.b(bArr, 84);
        this.q.f927a = b.b(bArr, 88);
        this.q.f928b = b.b(bArr, 92);
        this.r.f927a = b.b(bArr, 96);
        this.r.f928b = b.b(bArr, 100);
        this.s.f927a = b.b(bArr, 104);
        this.s.f928b = b.b(bArr, 108);
        this.t.f927a = b.b(bArr, 112);
        this.t.f928b = b.b(bArr, 116);
        this.u.f927a = b.b(bArr, 120);
        this.u.f928b = b.b(bArr, 124);
        this.v.f927a = b.b(bArr, 128);
        this.v.f928b = b.b(bArr, 132);
        this.w.f927a = b.b(bArr, 136);
        this.w.f928b = b.b(bArr, 120);
        System.arraycopy(bArr, 124, this.x.f930a, 0, 128);
        System.arraycopy(bArr, 252, this.x.f931b, 0, 128);
        this.y.f927a = b.b(bArr, 380);
        this.y.f928b = b.b(bArr, 384);
        this.z.f927a = b.b(bArr, 388);
        this.z.f928b = b.b(bArr, 392);
        System.arraycopy(bArr, 396, this.A.f937a, 0, 128);
        System.arraycopy(bArr, 524, this.A.f938b, 0, 128);
        System.arraycopy(bArr, 652, this.A.c, 0, 128);
        System.arraycopy(bArr, 780, this.A.d, 0, 128);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        try {
            str5 = new String(this.x.f930a, "UTF-8").trim();
            try {
                str4 = new String(this.x.f931b, "UTF-8").trim();
                try {
                    str3 = new String(this.A.f937a, "UTF-8").trim();
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    str3 = str6;
                    str2 = str3;
                    str = str2;
                    e.printStackTrace();
                    return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
                }
                try {
                    str2 = new String(this.A.f938b, "UTF-8").trim();
                } catch (UnsupportedEncodingException e3) {
                    e = e3;
                    str2 = str6;
                    str = str2;
                    e.printStackTrace();
                    return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
                }
            } catch (UnsupportedEncodingException e4) {
                e = e4;
                str4 = str6;
                str3 = str4;
                str2 = str3;
                str = str2;
                e.printStackTrace();
                return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
            }
            try {
                str = new String(this.A.c, "UTF-8").trim();
                try {
                    str6 = new String(this.A.d, "UTF-8").trim();
                } catch (UnsupportedEncodingException e5) {
                    e = e5;
                    e.printStackTrace();
                    return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
                }
            } catch (UnsupportedEncodingException e6) {
                e = e6;
                str = str6;
                e.printStackTrace();
                return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
            }
        } catch (UnsupportedEncodingException e7) {
            e = e7;
            str5 = str6;
            str4 = str5;
            str3 = str4;
            str2 = str3;
            str = str2;
            e.printStackTrace();
            return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
        }
        return "AW_cdr_net_config is \nswitch_record_eis = " + this.f961a + "\nswitch_record_sound = " + this.f962b + "\nswitch_record_awmd = " + this.c + "\nswitch_record_drivingmode = " + this.d + "\nswitch_camera_imagerotation = " + this.e + "\nswitch_camera_ledindicator = " + this.f + "\nswitch_camera_timewatermark = " + this.g + "\nswitch_camera_distortioncalibration = " + this.h + "\nswitch_camera_wifi = " + this.i + "\nswitch_camera_keytone = " + this.j + "\nrecord_resolution_current = " + this.k.f927a + "\nrecord_resolution_count = " + this.k.f928b + "\nrecord_loop_current = " + this.l.f927a + "\nrecord_loop_count = " + this.l.f928b + "\nrecord_timelapse_curren = " + this.m.f927a + "\nrecord_timelapse_count = " + this.m.f928b + "\nrecord_slowmotion_current = " + this.n.f927a + "\nrecord_slowmotion_count = " + this.n.f928b + "\nphoto_resolution_current = " + this.o.f927a + "\nphoto_resolution_count = " + this.o.f928b + "\nphoto_timed_current = " + this.p.f927a + "\nphoto_timed_count = " + this.p.f928b + "\nphoto_auto_current = " + this.q.f927a + "\nphoto_auto_count = " + this.q.f928b + "\nphoto_dramashot_current = " + this.r.f927a + "\nphoto_dramashot_count = " + this.r.f928b + "\ncamera_exposure_current = " + this.s.f927a + "\ncamera_exposure_count = " + this.s.f928b + "\ncamera_whitebalance_current = " + this.t.f927a + "\ncamera_whitebalance_count = " + this.t.f928b + "\ncamera_lightfreq_current = " + this.u.f927a + "\ncamera_lightfreq_count = " + this.u.f928b + "\ncamera_autoscreensaver_current = " + this.v.f927a + "\ncamera_autoscreensaver_count = " + this.v.f928b + "\ncamera_timedshutdown_current = " + this.w.f927a + "\ncamera_timedshutdown_count = " + this.w.f928b + "\ndevice_language_current = " + this.y.f927a + "\ndevice_language_count = " + this.y.f928b + "\ndevice_voicestatus_current = " + this.z.f927a + "\ndevice_voicestatus_count = " + this.z.f928b + "\ncamera_wifiinfo_string1 = " + str5 + "\ncamera_wifiinfo_string2 = " + str4 + "\ndevice_deviceinfo_string1 = " + str3 + "\ndevice_deviceinfo_string2 = " + str2 + "\ndevice_deviceinfo_string3 = " + str + "\ndevice_deviceinfo_string4 = " + str6 + "\n";
    }
}
