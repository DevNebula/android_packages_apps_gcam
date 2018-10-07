package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grc;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class CameraCaptureSessionInstrumentationSession extends InstrumentationSession {
    /* renamed from: a */
    public int f12862a = 0;
    /* renamed from: b */
    public long f12863b;
    /* renamed from: c */
    public long f12864c;
    /* renamed from: d */
    public long f12865d;
    /* renamed from: e */
    public long f12866e;
    /* renamed from: f */
    private boolean f12867f = false;

    static {
        bli.m887a("CamCpSssSession");
    }

    public CameraCaptureSessionInstrumentationSession(iya iya) {
        super(iya, "CameraCaptureSession");
    }

    @UsedByReflection
    public long getCameraDeviceSessionCreateNs() {
        return this.f2597k;
    }

    @UsedByReflection
    public long getCameraDeviceSessionCreatedNs() {
        return this.f12863b;
    }

    @UsedByReflection
    public long getCaptureSessionFirstCaptureResultReceivedNs() {
        return this.f12865d;
    }

    @UsedByReflection
    public long getCaptureSessionRequestSentNs() {
        return this.f12864c;
    }

    @UsedByReflection
    public long getCaptureSessionSecondCaptureResultReceivedNs() {
        return this.f12866e;
    }

    /* renamed from: a */
    public static kwk m8535a() {
        return new grc();
    }

    /* renamed from: b */
    public final void mo12619b() {
        if (!this.f12867f) {
            this.f12867f = true;
            this.f12864c = SystemClock.elapsedRealtimeNanos();
            mo2697a("First capture request sent", this.f12864c);
        }
    }
}
