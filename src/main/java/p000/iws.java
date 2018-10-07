package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: iws */
public class iws implements iwt {
    /* renamed from: a */
    private final iwt f24691a;

    public iws(OutputConfiguration outputConfiguration) {
        this(new iue(outputConfiguration));
    }

    public iws(iwt iwt) {
        this.f24691a = iwt;
    }

    /* renamed from: a */
    public void mo13737a(Surface surface) {
        this.f24691a.mo13737a(surface);
    }

    /* renamed from: a */
    public final iud mo9118a() {
        return this.f24691a.mo9118a();
    }

    /* renamed from: b */
    public Surface mo13738b() {
        return this.f24691a.mo13738b();
    }
}
