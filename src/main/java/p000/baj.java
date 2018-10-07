package p000;

/* compiled from: PG */
/* renamed from: baj */
final class baj implements iqo {
    /* renamed from: a */
    private final ikb f11120a;
    /* renamed from: b */
    private final /* synthetic */ bai f11121b;

    public baj(bai bai, ikb ikb) {
        this.f11121b = bai;
        this.f11120a = ikb;
    }

    public final void close() {
        synchronized (this.f11121b.f11109a) {
            this.f11120a.close();
        }
    }
}
