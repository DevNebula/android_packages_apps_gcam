package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import java.util.concurrent.Executor;
import p000.bli;
import p000.bxj;
import p000.ccs;
import p000.ged;
import p000.gef;

/* compiled from: PG */
public class ProcessingBoostService extends Service {
    /* renamed from: c */
    private static final String f2577c = bli.m887a("ProcessingBoost");
    /* renamed from: a */
    public bxj f2578a;
    /* renamed from: b */
    public Executor f2579b;
    /* renamed from: d */
    private final Messenger f2580d = new Messenger(new ged(this));

    public IBinder onBind(Intent intent) {
        return this.f2580d.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        bli.m894c(f2577c, "onCreate");
        ((gef) ((ccs) getApplication()).mo2253a(gef.class)).mo13333a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        bli.m894c(f2577c, "onDestroy");
    }
}
