package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import p000.grv;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class OneCameraSession extends InstrumentationSession {
    /* renamed from: a */
    public long f12874a;
    /* renamed from: b */
    public long f12875b;
    /* renamed from: c */
    public long f12876c;
    /* renamed from: d */
    public long f12877d;
    /* renamed from: e */
    public long f12878e;

    public OneCameraSession(iya iya) {
        super(iya, "OneCameraSession");
    }

    @UsedByReflection
    public long getOneCameraCreateNs() {
        return this.f12875b;
    }

    @UsedByReflection
    public long getOneCameraCreatedNs() {
        return this.f12876c;
    }

    @UsedByReflection
    public long getOneCameraStartNs() {
        return this.f12877d;
    }

    @UsedByReflection
    public long getOneCameraStartedNs() {
        return this.f12878e;
    }

    /* renamed from: a */
    public static kwk m8541a() {
        return new grv();
    }
}
