package com.google.android.apps.camera.legacy.app.app;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;
import p000.azt;
import p000.ban;
import p000.bao;
import p000.bbz;
import p000.bkx;
import p000.blb;
import p000.ble;
import p000.blj;
import p000.blw;
import p000.bsn;
import p000.cbw;
import p000.ccp;
import p000.ccs;
import p000.ccu;
import p000.cdp;
import p000.cgm;
import p000.cgn;
import p000.cgp;
import p000.cgt;
import p000.cgz;
import p000.enp;
import p000.eor;
import p000.fnr;
import p000.foi;
import p000.gcp;
import p000.gly;
import p000.grb;
import p000.hka;
import p000.ije;
import p000.irs;
import p000.iya;
import p000.jri;
import p000.ktm;
import p000.kwk;

@TargetApi(21)
/* compiled from: PG */
public class CameraApp extends eor implements ccs, cgt, HasCameraContentProviderComponent {
    /* renamed from: a */
    public blw f12768a;
    /* renamed from: b */
    public NotificationManager f12769b;
    /* renamed from: c */
    public cgz f12770c;
    /* renamed from: d */
    public kwk f12771d;
    /* renamed from: e */
    public irs f12772e;
    /* renamed from: g */
    private volatile cgm f12773g;

    public blb cameraContentProviderComponent(ccp ccp) {
        return mo2290a().mo14589a(ccp);
    }

    /* renamed from: a */
    public final cgm mo2290a() {
        if (this.f12773g == null) {
            synchronized (this) {
                if (this.f12773g == null) {
                    Trace.beginSection("GCA_App#initialize");
                    Trace.beginSection("GCA_App#buildComponent");
                    cgp a = cgn.m17246a();
                    a.f2134a = (cbw) ktm.m14218a(cbw.m1127a(this));
                    a.f2138e = (enp) ktm.m14218a(new enp(this.f4221f));
                    if (a.f2134a == null) {
                        throw new IllegalStateException(String.valueOf(cbw.class.getCanonicalName()).concat(" must be set"));
                    }
                    if (a.f2135b == null) {
                        a.f2135b = new ble();
                    }
                    if (a.f2136c == null) {
                        a.f2136c = new bbz();
                    }
                    if (a.f2137d == null) {
                        a.f2137d = new bkx();
                    }
                    if (a.f2138e == null) {
                        throw new IllegalStateException(String.valueOf(enp.class.getCanonicalName()).concat(" must be set"));
                    }
                    if (a.f2139f == null) {
                        a.f2139f = new azt();
                    }
                    if (a.f2140g == null) {
                        a.f2140g = new hka();
                    }
                    if (a.f2141h == null) {
                        a.f2141h = new gcp();
                    }
                    if (a.f2142i == null) {
                        a.f2142i = new foi();
                    }
                    if (a.f2143j == null) {
                        a.f2143j = new fnr();
                    }
                    this.f12773g = new cgn(a);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#initialize");
                    cgm cgm = this.f12773g;
                    Trace.beginSection("GCA_App#inject");
                    cgm.mo2289a(this);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#strictMode");
                    bsn bsn = this.f12768a.f1295a;
                    Trace.endSection();
                    Trace.beginSection("GCA_App#startAsync");
                    cgz cgz = this.f12770c;
                    if (cgz.f2155e.mo9709b()) {
                        cdp cdp = (cdp) cgz.f2155e.mo9706a();
                        if (!cdp.mo2271b()) {
                            cdp.mo2270a();
                        }
                        Trace.endSection();
                        Trace.beginSection("GCA_App#cancelNotifications");
                        this.f12769b.cancelAll();
                        Trace.endSection();
                        Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                        Thread.setDefaultUncaughtExceptionHandler(new bao(this.f12771d, new ban(getApplicationContext(), Thread.getDefaultUncaughtExceptionHandler()), this.f12772e));
                        Trace.endSection();
                        Trace.endSection();
                        Trace.endSection();
                    }
                    gly.m11393a(cgz.f2153c, cgz.f2151a);
                    gly.m11393a(cgz.f2152b, cgz.f2151a);
                    gly.m11393a(cgz.f2154d, cgz.f2151a);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#cancelNotifications");
                    this.f12769b.cancelAll();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                    Thread.setDefaultUncaughtExceptionHandler(new bao(this.f12771d, new ban(getApplicationContext(), Thread.getDefaultUncaughtExceptionHandler()), this.f12772e));
                    Trace.endSection();
                    Trace.endSection();
                    Trace.endSection();
                }
            }
        }
        return this.f12773g;
    }

    /* renamed from: a */
    public final ccu mo2253a(Class cls) {
        return (ccu) cls.cast(mo2290a());
    }

    public void onCreate() {
        Trace.beginSection("GCA_App#onCreate");
        grb a = grb.m11604a();
        iya iya = a.f2599m;
        a.f19492a = SystemClock.elapsedRealtimeNanos();
        Process.getStartElapsedRealtime();
        iya = a.f2599m;
        SystemClock.elapsedRealtime();
        ContentResolver contentResolver = getContentResolver();
        jri.m13404b((Object) contentResolver);
        blj.f1293a = ije.m3829a(contentResolver, "camera:logging_override_level", 0);
        super.onCreate();
        iya = a.f2599m;
        a.f19493b = SystemClock.elapsedRealtimeNanos();
        Trace.endSection();
    }
}
