package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import p000.grd;
import p000.grr;
import p000.grt;
import p000.gsg;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class Instrumentation {
    /* renamed from: a */
    private static Instrumentation f2584a;
    /* renamed from: b */
    private final InstrumentationSessionRecorder f2585b;
    /* renamed from: c */
    private final InstrumentationSessionRecorder f2586c;
    /* renamed from: d */
    private final InstrumentationSessionRecorder f2587d;
    /* renamed from: e */
    private final InstrumentationSessionRecorder f2588e;
    /* renamed from: f */
    private final InstrumentationSessionRecorder f2589f;
    /* renamed from: g */
    private final InstrumentationSessionRecorder f2590g;
    /* renamed from: h */
    private final InstrumentationSessionRecorder f2591h;
    /* renamed from: i */
    private final InstrumentationSessionRecorder f2592i;
    /* renamed from: j */
    private final InstrumentationSessionRecorder f2593j;
    /* renamed from: k */
    private final InstrumentationSessionRecorder f2594k;

    private Instrumentation(InstrumentationSessionRecorder instrumentationSessionRecorder, InstrumentationSessionRecorder instrumentationSessionRecorder2, InstrumentationSessionRecorder instrumentationSessionRecorder3, InstrumentationSessionRecorder instrumentationSessionRecorder4, InstrumentationSessionRecorder instrumentationSessionRecorder5, InstrumentationSessionRecorder instrumentationSessionRecorder6, InstrumentationSessionRecorder instrumentationSessionRecorder7, InstrumentationSessionRecorder instrumentationSessionRecorder8, InstrumentationSessionRecorder instrumentationSessionRecorder9, InstrumentationSessionRecorder instrumentationSessionRecorder10) {
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        jri.m13395a(true);
        this.f2585b = instrumentationSessionRecorder;
        this.f2586c = instrumentationSessionRecorder2;
        this.f2587d = instrumentationSessionRecorder3;
        this.f2588e = instrumentationSessionRecorder4;
        this.f2589f = instrumentationSessionRecorder5;
        this.f2590g = instrumentationSessionRecorder6;
        this.f2591h = instrumentationSessionRecorder7;
        this.f2592i = instrumentationSessionRecorder8;
        this.f2594k = instrumentationSessionRecorder10;
        this.f2593j = instrumentationSessionRecorder9;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder burstStats() {
        return this.f2593j;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraActivity() {
        return this.f2585b;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraChange() {
        return this.f2588e;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder cameraDevice() {
        return this.f2586c;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder captureSession() {
        return this.f2587d;
    }

    @UsedByReflection
    public static Instrumentation instance() {
        if (f2584a == null) {
            f2584a = new Instrumentation(new InstrumentationSessionRecorder(CameraActivitySession.m8534a()), new InstrumentationSessionRecorder(CameraDeviceInstrumentationSession.m8537a()), new InstrumentationSessionRecorder(CameraCaptureSessionInstrumentationSession.m8535a()), new InstrumentationSessionRecorder(grd.m11606a()), new InstrumentationSessionRecorder(grt.m11633a()), new InstrumentationSessionRecorder(ViewfinderJankSession.m8543a()), new InstrumentationSessionRecorder(gsg.m11692a()), new InstrumentationSessionRecorder(OneCameraSession.m8541a()), new InstrumentationSessionRecorder(BurstSessionStatistics.m8523a()), new InstrumentationSessionRecorder(grr.m11630a()));
        }
        return f2584a;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder jankStats() {
        return this.f2590g;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder mediaRecorderStats() {
        return this.f2594k;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder modeSwitch() {
        return this.f2589f;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder oneCamera() {
        return this.f2592i;
    }

    @UsedByReflection
    public InstrumentationSessionRecorder viewfinder() {
        return this.f2591h;
    }
}
