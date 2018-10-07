package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.List;
import p000.gsf;
import p000.iwp;
import p000.iya;
import p000.kke;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class ViewfinderJankSession extends InstrumentationSession {
    /* renamed from: a */
    public final Object f12879a = new Object();
    /* renamed from: b */
    public final List f12880b = new ArrayList(30);
    /* renamed from: c */
    public final List f12881c = new ArrayList();
    /* renamed from: d */
    public int f12882d = 0;
    /* renamed from: e */
    public int f12883e = 0;
    /* renamed from: f */
    public int f12884f = 0;
    /* renamed from: g */
    public kke f12885g;
    /* renamed from: h */
    public kke f12886h;

    public ViewfinderJankSession(iya iya) {
        super(iya, "PreviewSmoothness");
    }

    /* renamed from: a */
    public static kke m8542a(iwp iwp, double d, double d2) {
        kke kke = new kke();
        kke.f25081a = SystemClock.elapsedRealtimeNanos();
        kke.f25082b = ((Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP)).longValue();
        kke.f25083c = iwp.mo13731b();
        Long l = (Long) iwp.mo13730a(CaptureResult.SENSOR_FRAME_DURATION);
        Long l2 = (Long) iwp.mo13730a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            kke.f25084d = (int) (l.longValue() / 1000);
        }
        if (l2 != null) {
            kke.f25085e = (int) (l2.longValue() / 1000);
        }
        if (d > 0.0d) {
            kke.f25087g = (int) (1000.0d * d);
        }
        if (d2 > 0.0d) {
            kke.f25086f = (int) (1000.0d * d2);
        }
        return kke;
    }

    @UsedByReflection
    public int getDelay150PctCount() {
        return this.f12883e;
    }

    @UsedByReflection
    public int getDelay500PctCount() {
        return this.f12884f;
    }

    @UsedByReflection
    public int getDelay50PctCount() {
        return this.f12882d;
    }

    /* renamed from: a */
    public static kwk m8543a() {
        return new gsf();
    }

    /* renamed from: a */
    public final void mo12638a(kke kke) {
        if (this.f12885g == null) {
            this.f12885g = kke;
        }
        this.f12886h = kke;
    }
}
