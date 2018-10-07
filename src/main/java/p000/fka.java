package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: fka */
final class fka extends fiw {
    /* renamed from: a */
    private final /* synthetic */ fki f18350a;
    /* renamed from: b */
    private final /* synthetic */ fjz f18351b;

    fka(fjz fjz, fki fki) {
        this.f18351b = fjz;
        this.f18350a = fki;
    }

    /* renamed from: b */
    public final void mo6827b(fhq fhq) {
        super.mo6827b(fhq);
        synchronized (this.f18351b.f18342c) {
            this.f18351b.f18343d.add(fhq);
        }
        this.f18351b.mo13256a();
    }

    /* renamed from: a */
    public final void mo6823a(Surface surface, long j) {
        iqz iqz = this.f18351b.f18341b;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("onBufferLost: ");
        stringBuilder.append(j);
        iqz.mo8838f(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo6824a(fhq fhq) {
        super.mo6824a(fhq);
        this.f18350a.mo8826a(fhq);
        this.f18351b.f18344e.mo8826a(fhq);
        this.f18351b.mo13256a();
    }
}
