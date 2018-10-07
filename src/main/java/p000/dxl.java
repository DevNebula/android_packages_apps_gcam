package p000;

/* compiled from: PG */
/* renamed from: dxl */
public final class dxl extends Thread {
    /* renamed from: a */
    private final /* synthetic */ aas f3543a;
    /* renamed from: b */
    private final /* synthetic */ aaf f3544b = null;
    /* renamed from: c */
    private final /* synthetic */ aaf f3545c;
    /* renamed from: d */
    private final /* synthetic */ dxj f3546d;

    public dxl(dxj dxj, aas aas, aaf aaf) {
        this.f3546d = dxj;
        this.f3543a = aas;
        this.f3545c = aaf;
    }

    public final void run() {
        synchronized (this.f3546d.f16941i) {
            dxj dxj = this.f3546d;
            dxj.f16936d = false;
            dxj.f16934b.mo21b(null, null);
            dxj = this.f3546d;
            dxj.f16934b.mo12a(dxj.f16940h, this.f3543a, null, this.f3545c);
        }
    }
}
