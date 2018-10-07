package p000;

/* compiled from: PG */
/* renamed from: cpa */
final class cpa implements iqo {
    /* renamed from: a */
    private final /* synthetic */ cpj f13090a;

    cpa(cpj cpj) {
        this.f13090a = cpj;
    }

    public final void close() {
        this.f13090a.cancel(true);
    }
}
