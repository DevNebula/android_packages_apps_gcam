package p000;

import android.util.Size;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: hmj */
final class hmj implements hmx {
    /* renamed from: a */
    private final Surface f24488a;

    public hmj(Surface surface) {
        this.f24488a = surface;
    }

    public final void close() {
        this.f24488a.release();
    }

    /* renamed from: a */
    public final kpk mo13545a() {
        return kow.m13873a(this.f24488a);
    }

    /* renamed from: a */
    public final void mo13546a(Size size) {
    }

    /* renamed from: a */
    public final void mo13547a(iqm iqm) {
    }
}
