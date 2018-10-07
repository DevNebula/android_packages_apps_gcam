package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.gra;
import p000.grb;
import p000.iya;
import p000.jri;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraActivitySession extends InstrumentationSession {
    /* renamed from: a */
    public static final String f12850a = bli.m887a("CamActivitySession");
    /* renamed from: b */
    public long f12851b;
    /* renamed from: c */
    public long f12852c;
    /* renamed from: d */
    public long f12853d;
    /* renamed from: e */
    public long f12854e;
    /* renamed from: f */
    public long f12855f;
    /* renamed from: g */
    public long f12856g;
    /* renamed from: h */
    public long f12857h;
    /* renamed from: i */
    public long f12858i;
    /* renamed from: j */
    public long f12859j;
    /* renamed from: n */
    private final grb f12860n;
    /* renamed from: o */
    private boolean f12861o;

    public CameraActivitySession(grb grb, iya iya) {
        super(iya, "CameraActivity");
        this.f12860n = grb;
    }

    @UsedByReflection
    public long getActivityOnCreateEndNs() {
        return this.f12852c;
    }

    @UsedByReflection
    public long getActivityOnCreateStartNs() {
        return this.f12851b;
    }

    @UsedByReflection
    public long getActivityOnResumeEndNs() {
        return this.f12855f;
    }

    @UsedByReflection
    public long getActivityOnResumeStartNs() {
        return this.f12854e;
    }

    @UsedByReflection
    public long getActivityOnStartStartNs() {
        return this.f12853d;
    }

    @UsedByReflection
    public boolean getIsColdStart() {
        return this.f12861o;
    }

    @UsedByReflection
    public long getShutterButtonFirstDrawNs() {
        return this.f12858i;
    }

    @UsedByReflection
    public long getShutterButtonFirstEnabledNs() {
        return this.f12859j;
    }

    /* renamed from: a */
    public static kwk m8534a() {
        return new gra();
    }

    @UsedByReflection
    public void recordActivityOnCreateStart() {
        boolean z = true;
        this.f12861o = true;
        if (this.f12851b != 0) {
            z = false;
        }
        jri.m13406b(z, (Object) "Accidental session reuse.");
        this.f12851b = SystemClock.elapsedRealtimeNanos();
        grb grb = this.f12860n;
        long j = grb.f19492a;
        long j2 = grb.f19493b;
        mo2698a("App OnCreate", j, j2);
        mo2699a("App OnCreate End", this.f12860n.f19493b, "Activity OnCreate Start", this.f12851b);
    }
}
