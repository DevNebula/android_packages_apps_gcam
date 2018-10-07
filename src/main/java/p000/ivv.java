package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: ivv */
final class ivv extends iws {
    /* renamed from: a */
    private final Surface f26553a;

    ivv(int i, Surface surface) {
        super(new iue(new OutputConfiguration(i, surface)));
        this.f26553a = surface;
    }

    /* renamed from: a */
    public final void mo13737a(Surface surface) {
        throw new IllegalStateException("addSurface is not supported.");
    }

    /* renamed from: b */
    public final Surface mo13738b() {
        return this.f26553a;
    }
}
