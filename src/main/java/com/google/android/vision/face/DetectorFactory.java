package com.google.android.vision.face;

import android.content.Context;
import com.google.android.vision.face.Detector.Settings;

/* compiled from: PG */
public class DetectorFactory {
    /* renamed from: a */
    public Context f2665a;
    /* renamed from: b */
    public Settings f2666b = new Settings();

    /* compiled from: PG */
    public class Callback {
    }

    public DetectorFactory(Context context) {
        this.f2665a = context;
    }

    /* renamed from: a */
    public final DetectorFactory mo3668a() {
        this.f2666b.getDetectionSettings().setConfidenceThreshold(0.75f);
        return this;
    }
}
