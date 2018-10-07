package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grf;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraDeviceInstrumentationSession extends InstrumentationSession {
    /* renamed from: a */
    private long f12868a;
    /* renamed from: b */
    private long f12869b;

    static {
        bli.m887a("CameraDevSession");
    }

    public CameraDeviceInstrumentationSession(iya iya) {
        super(iya, "CameraDevice");
    }

    @UsedByReflection
    public long getCameraDeviceOpenNs() {
        return this.f12868a;
    }

    @UsedByReflection
    public long getCameraDeviceOpenedNs() {
        return this.f12869b;
    }

    /* renamed from: a */
    public static kwk m8537a() {
        return new grf();
    }

    /* renamed from: b */
    public final void mo12625b() {
        if (this.f12868a == 0) {
            this.f12868a = SystemClock.elapsedRealtimeNanos();
        }
    }

    /* renamed from: c */
    public final void mo12626c() {
        if (this.f12868a != 0 && this.f12869b == 0) {
            this.f12869b = SystemClock.elapsedRealtimeNanos();
            mo2698a("Open", this.f12868a, this.f12869b);
        }
    }
}
