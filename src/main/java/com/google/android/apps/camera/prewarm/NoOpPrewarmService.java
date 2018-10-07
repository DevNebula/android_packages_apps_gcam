package com.google.android.apps.camera.prewarm;

import android.service.media.CameraPrewarmService;
import p000.bli;
import p000.ccs;
import p000.gea;
import p000.geb;
import p000.ikq;
import p000.irs;

/* compiled from: PG */
public class NoOpPrewarmService extends CameraPrewarmService {
    /* renamed from: a */
    public static final String f2573a = bli.m887a("NoOpPrewarmService");
    /* renamed from: b */
    public irs f2574b;
    /* renamed from: c */
    public ikq f2575c;
    /* renamed from: d */
    private Runnable f2576d;

    public void onCooldown(boolean z) {
        this.f2575c.mo13670a();
        this.f2574b.mo8917g();
    }

    public void onCreate() {
        ((geb) ((ccs) getApplication()).mo2253a(geb.class)).mo13332a(this);
        super.onCreate();
        this.f2576d = new gea(this);
    }

    public void onPrewarm() {
        this.f2575c.mo13671a(this.f2576d);
        this.f2574b.mo8918h();
    }
}
