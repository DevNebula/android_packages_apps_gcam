package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fhj */
public final class fhj implements fhh {
    /* renamed from: a */
    private boolean f24252a = false;
    /* renamed from: b */
    private final fyr f24253b;
    /* renamed from: c */
    private final /* synthetic */ fhi f24254c;

    fhj(fhi fhi, fyr fyr) {
        this.f24254c = fhi;
        this.f24253b = fyr;
    }

    public final void close() {
        if (!this.f24252a) {
            this.f24252a = true;
            this.f24253b.close();
        }
    }

    /* renamed from: a */
    public final void mo6816a(List list, fiv fiv) {
        jri.m13406b(this.f24252a ^ 1, (Object) "submitRequest() cannot be used after the Session is closed");
        this.f24254c.f18282a.mo6816a(list, fiv);
    }
}
