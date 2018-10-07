package com.google.android.apps.camera.app.silentfeedback;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import p000.baq;
import p000.bli;
import p000.hji;
import p000.hur;
import p000.hxp;
import p000.kow;
import p000.kpq;

/* compiled from: PG */
public final class SilentFeedbackService extends Service {
    /* renamed from: a */
    public static final String f2423a = bli.m887a("SilentFdbkService");
    /* renamed from: b */
    private final Object f2424b = new Object();
    /* renamed from: c */
    private int f2425c = 0;
    /* renamed from: d */
    private int f2426d = 0;

    /* renamed from: b */
    private final boolean m1245b() {
        int i;
        bli.m896d(f2423a, "Checking valid GmsCoreVersion.");
        try {
            i = getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            i = 0;
        }
        if (i >= 6577000) {
            return true;
        }
        return false;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f2424b) {
            this.f2425c++;
            this.f2426d = i2;
        }
        bli.m896d(f2423a, "Starting silent feedback service.");
        if (m1245b()) {
            kow.m13878a(new hji(new hur(getApplicationContext()).mo8146a(hxp.f7158a).mo8145a()).mo13541a(), new baq(this, intent), kpq.f8776a);
        } else {
            bli.m888a(f2423a, "Not sending silent feedback. GMS version too low.");
            mo2420a();
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo2420a() {
        Integer valueOf;
        bli.m896d(f2423a, "Trying to stop self.");
        synchronized (this.f2424b) {
            int i = this.f2425c - 1;
            this.f2425c = i;
            if (i == 0) {
                valueOf = Integer.valueOf(this.f2426d);
            } else {
                valueOf = null;
            }
        }
        if (valueOf != null) {
            stopSelf(valueOf.intValue());
        }
    }
}
