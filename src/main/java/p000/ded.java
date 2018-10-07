package p000;

/* compiled from: PG */
/* renamed from: ded */
final class ded implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3219a;
    /* renamed from: b */
    private final /* synthetic */ int f3220b;
    /* renamed from: c */
    private final /* synthetic */ dec f3221c;

    ded(dec dec, byte[] bArr, int i) {
        this.f3221c = dec;
        this.f3219a = bArr;
        this.f3220b = i;
    }

    public final void run() {
        this.f3221c.f23854a.f1623a.mo2154a(new dbb(cwe.m1596a(this.f3219a, this.f3220b), this.f3219a));
    }
}
