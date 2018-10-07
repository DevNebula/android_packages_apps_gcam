package p000;

/* compiled from: PG */
/* renamed from: dde */
final class dde implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3205a;
    /* renamed from: b */
    private final /* synthetic */ int f3206b;
    /* renamed from: c */
    private final /* synthetic */ ddc f3207c;

    dde(ddc ddc, byte[] bArr, int i) {
        this.f3207c = ddc;
        this.f3205a = bArr;
        this.f3206b = i;
    }

    public final void run() {
        this.f3207c.f13721a.f1623a.mo2154a(new dba(this.f3205a, this.f3206b));
    }
}
