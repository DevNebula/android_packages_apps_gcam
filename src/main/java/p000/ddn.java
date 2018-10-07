package p000;

/* compiled from: PG */
/* renamed from: ddn */
final class ddn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3212a;
    /* renamed from: b */
    private final /* synthetic */ int f3213b;
    /* renamed from: c */
    private final /* synthetic */ ddm f3214c;

    ddn(ddm ddm, byte[] bArr, int i) {
        this.f3214c = ddm;
        this.f3212a = bArr;
        this.f3213b = i;
    }

    public final void run() {
        this.f3214c.f23840a.f1623a.mo2154a(new dbb(cwe.m1596a(this.f3212a, this.f3213b), this.f3212a));
    }
}
