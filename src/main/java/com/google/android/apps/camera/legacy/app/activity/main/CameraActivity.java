package com.google.android.apps.camera.legacy.app.activity.main;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.Instrumentation;
import p000.bli;
import p000.bls;
import p000.blx;
import p000.bsa;
import p000.bsn;
import p000.cct;
import p000.ccu;
import p000.cef;
import p000.ceo;
import p000.cfa;
import p000.cfd;
import p000.epf;
import p000.eph;
import p000.iya;
import p000.jqk;

/* compiled from: PG */
public class CameraActivity extends cef implements cct, cfd {
    /* renamed from: g */
    private static final String f23258g = bli.m887a("CameraActivity");
    /* renamed from: d */
    public bsn f23259d;
    /* renamed from: e */
    public bls f23260e;
    /* renamed from: f */
    public blx f23261f;
    /* renamed from: h */
    private ceo f23262h;
    /* renamed from: i */
    private cfa f23263i;
    /* renamed from: j */
    private Instrumentation f23264j;

    static {
        bsa bsa = new bsa("camera.exp.activity");
    }

    /* renamed from: a */
    public final ccu mo2254a(Class cls) {
        return (ccu) cls.cast(this.f23262h);
    }

    /* renamed from: d */
    public final cfa mo2276d() {
        return (cfa) jqk.m13354c(this.f23263i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0189  */
    protected void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r0 = p000.epf.m1992a();
        r1 = r0.f4236g;
        r4 = p000.eph.f4239d;
        r1 = r1.mo6442a(r4);
        if (r1 != 0) goto L_0x01b2;
    L_0x0010:
        r0 = r8.mo12458c();
        r1 = "CameraActivity#onCreate";
        r0.mo8856a(r1);
        r0 = com.google.android.apps.camera.stats.Instrumentation.instance();
        r8.f23264j = r0;
        r0 = r8.f23264j;
        r0 = r0.cameraActivity();
        r0 = r0.create();
        r0 = (com.google.android.apps.camera.stats.CameraActivitySession) r0;
        r0.recordActivityOnCreateStart();
        super.onCreate(r9);
        r1 = r8.getApplicationContext();
        r1 = (com.google.android.apps.camera.legacy.app.app.CameraApp) r1;
        r1 = r1.mo2290a();
        r1.mo14593a(r8);
        r4 = r8.mo12458c();
        r5 = "setupDefaultActivity#init";
        r4.mo8856a(r5);
        r4 = r8.mo12457b();
        r5 = r8.mo12456a();
        r6 = new gqr;
        r6.<init>(r0);
        p000.jri.m13404b(r4);
        p000.jri.m13404b(r5);
        r1 = r1.mo14590a(r4, r5, r6);
        r8.f23262h = r1;
        r1 = r8.mo12458c();
        r4 = "activityInitializer#get";
        r1.mo8858b(r4);
        r1 = r8.f23262h;
        r1 = r1.f22886D;
        r1 = r1.mo10566a();
        r1 = (p000.cey) r1;
        r4 = r8.mo12458c();
        r5 = "activityInitializer#start";
        r4.mo8858b(r5);
        r1.mo8560a();
        r1 = r8.mo12458c();
        r4 = "#cameraUiModule#inflate";
        r1.mo8858b(r4);
        r1 = r8.f23262h;
        r4 = new heu;
        r5 = r1.f22909a;
        r5 = p000.cbk.m8057a(r5);
        r6 = new hkh;
        r7 = r1.f22909a;
        r7 = p000.cbk.m8057a(r7);
        r6.<init>(r7);
        r1 = r1.f22909a;
        r1 = p000.cbm.m8060a(r1);
        r4.<init>(r5, r6, r1);
        p000.ikd.m12501a();
        r1 = r4.f6496b;
        r5 = p000.heu.f6495a;
        r6 = "Initializing Window Flags";
        p000.bli.m894c(r5, r6);
        r5 = r1.getAttributes();
        r6 = 3;
        r5.rotationAnimation = r6;
        r1.setAttributes(r5);
        r5 = 8;
        r1.requestFeature(r5);
        r5 = p000.heu.f6495a;
        r6 = "Requesting ActionBar";
        p000.bli.m896d(r5, r6);
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1.addFlags(r5);
        r5 = p000.heu.f6495a;
        r6 = "Setting window flags for drawing system bar backgrounds.";
        p000.bli.m896d(r5, r6);
        r5 = 0;
        r1.setBackgroundDrawable(r5);
        r1 = r1.getDecorView();
        r1.setPadding(r3, r3, r3, r3);
        r1 = r4.f6496b;
        p000.heu.m3155a(r1);
        r1 = r4.f6497c;
        r5 = p000.heu.f6495a;
        r6 = "Initializing Camera Ui";
        p000.bli.m894c(r5, r6);
        r5 = r1.f20180a;
        r6 = 2130968606; // 0x7f04001e float:1.754587E38 double:1.0528383806E-314;
        r5.setContentView(r6);
        r5 = new het;
        r1 = p000.hkg.m3277a(r1);
        r5.<init>(r1);
        r1 = r4.f6498d;
        r6 = p000.heu.f6495a;
        r7 = "Initializing Action Bar";
        p000.bli.m894c(r6, r7);
        r1 = r1.getActionBar();
        p000.jri.m13404b(r1);
        r6 = new android.graphics.drawable.ColorDrawable;
        r6.<init>(r3);
        r1.setBackgroundDrawable(r6);
        r1.hide();
        r6 = new hev;
        r4 = r4.f6499e;
        r6.<init>(r1, r4, r5);
        r1 = r8.mo12458c();
        r4 = "activityUiInitializer#get";
        r1.mo8858b(r4);
        r1 = r8.f23262h;
        r4 = new cfa;
        r4.<init>(r1, r6);
        r8.f23263i = r4;
        r1 = r8.f23263i;
        r1 = r1.f2078d;
        r1 = r1.mo10566a();
        r1 = (p000.cfb) r1;
        r4 = r8.mo12458c();
        r5 = "#activityUiInitializer#start";
        r4.mo8858b(r5);
        r1.mo8560a();
        r1 = r8.mo12458c();
        r1.mo8857b();
        r1 = r8.mo12458c();
        r4 = "CameraActivity#disablePreviewScreenshots";
        r1.mo8856a(r4);
        r1 = android.app.Activity.class;
        r4 = "setDisablePreviewScreenshots";
        r5 = 1;
        r5 = new java.lang.Class[r5];	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r7 = 0;
        r5[r7] = r6;	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r1 = r1.getMethod(r4, r5);	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r4 = 1;
        r1.setAccessible(r4);	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r5 = 1;
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
        r1.invoke(r8, r4);	 Catch:{ InvocationTargetException -> 0x01cb, NoSuchMethodException -> 0x01c9, IllegalAccessException -> 0x01ba }
    L_0x017a:
        r1 = r8.mo12458c();
        r1.mo8857b();
        r1 = r8.f23260e;
        r1 = r1.mo2015b();
        if (r1 != 0) goto L_0x01c3;
    L_0x0189:
        r4 = r0.f12852c;
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 != 0) goto L_0x01b0;
    L_0x0191:
        r1 = r2;
    L_0x0192:
        r2 = "Accidental session reuse.";
        p000.jri.m13406b(r1, r2);
        r1 = r0.f2599m;
        r2 = android.os.SystemClock.elapsedRealtimeNanos();
        r0.f12852c = r2;
        r1 = "OnCreate";
        r2 = r0.f12851b;
        r4 = r0.f12852c;
        r0.mo2698a(r1, r2, r4);
        r0 = r8.mo12458c();
        r0.mo8857b();
        return;
    L_0x01b0:
        r1 = r3;
        goto L_0x0192;
    L_0x01b2:
        r4 = android.os.SystemClock.elapsedRealtimeNanos();
        r0.f4230a = r4;
        goto L_0x0010;
    L_0x01ba:
        r1 = move-exception;
    L_0x01bb:
        r1 = f23258g;
        r4 = "Could not find method: setDisablePreviewScreenshots";
        p000.bli.m898e(r1, r4);
        goto L_0x017a;
    L_0x01c3:
        r0 = new blr;
        r0.<init>();
        throw r0;
    L_0x01c9:
        r1 = move-exception;
        goto L_0x01bb;
    L_0x01cb:
        r1 = move-exception;
        goto L_0x01bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.legacy.app.activity.main.CameraActivity.onCreate(android.os.Bundle):void");
    }

    protected void onResume() {
        iya iya;
        CameraActivitySession cameraActivitySession = (CameraActivitySession) this.f23264j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12854e == 0) {
            iya = cameraActivitySession.f2599m;
            cameraActivitySession.f12854e = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.mo2699a("OnCreate End", cameraActivitySession.f12852c, "OnResume Start", cameraActivitySession.f12854e);
        }
        super.onResume();
        cameraActivitySession = (CameraActivitySession) this.f23264j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12855f == 0) {
            iya = cameraActivitySession.f2599m;
            cameraActivitySession.f12855f = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.mo2698a("OnResume", cameraActivitySession.f12854e, cameraActivitySession.f12855f);
        }
    }

    protected void onStart() {
        CameraActivitySession cameraActivitySession = (CameraActivitySession) this.f23264j.cameraActivity().getCurrentSession();
        if (cameraActivitySession.f12853d == 0) {
            iya iya = cameraActivitySession.f2599m;
            cameraActivitySession.f12853d = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.mo2697a("OnStart", cameraActivitySession.f12853d);
        }
        epf a = epf.m1992a();
        if (a.f4236g.mo6442a(eph.f4240e)) {
            a.f4231b = SystemClock.elapsedRealtimeNanos();
        }
        super.onStart();
    }
}
