package p000;

/* compiled from: PG */
/* renamed from: hjo */
public final class hjo implements iqo {
    /* renamed from: a */
    private final /* synthetic */ hjn f20169a;

    hjo(hjn hjn) {
        this.f20169a = hjn;
        hjn.f6643a.incrementAndGet();
    }

    public final void close() {
        this.f20169a.f6643a.decrementAndGet();
    }
}
