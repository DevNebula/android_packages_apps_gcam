package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: iue */
public final class iue implements iwt {
    /* renamed from: a */
    private final Object f24684a = new Object();
    /* renamed from: b */
    private final OutputConfiguration f24685b;
    /* renamed from: c */
    private boolean f24686c = false;

    public iue(OutputConfiguration outputConfiguration) {
        this.f24685b = outputConfiguration;
    }

    /* renamed from: a */
    public final void mo13737a(Surface surface) {
        jri.m13404b((Object) surface);
        synchronized (this.f24684a) {
            if (!this.f24686c) {
                this.f24686c = true;
                hsx.m3411a(this.f24685b, surface);
            }
        }
    }

    /* renamed from: a */
    public final iud mo9118a() {
        iud iud;
        synchronized (this.f24684a) {
            iud = new iud(this.f24685b);
        }
        return iud;
    }

    /* renamed from: b */
    public final Surface mo13738b() {
        Surface surface;
        synchronized (this.f24684a) {
            surface = this.f24685b.getSurface();
        }
        return surface;
    }

    public final String toString() {
        String kbd;
        synchronized (this.f24684a) {
            kbd = jqk.m13351b("AndroidOutputConfiguration").mo9703a("outputConfiguration", this.f24685b).toString();
        }
        return kbd;
    }
}
