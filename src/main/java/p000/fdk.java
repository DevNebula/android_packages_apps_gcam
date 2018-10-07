package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdk */
final class fdk implements fdf {
    /* renamed from: a */
    private final /* synthetic */ fdf f18146a;
    /* renamed from: b */
    private final /* synthetic */ Integer f18147b;

    fdk(fdf fdf, Integer num) {
        this.f18146a = fdf;
        this.f18147b = num;
    }

    public final void close() {
        this.f18146a.close();
    }

    /* renamed from: a */
    public final long mo6752a() {
        return this.f18146a.mo6752a();
    }

    /* renamed from: a */
    public final fim mo6753a(fim fim) {
        return new fio(this.f18146a.mo6753a(fim)).mo6809a(CaptureRequest.CONTROL_AF_MODE, this.f18147b).mo6807a();
    }
}
