package p000;

/* compiled from: PG */
/* renamed from: duj */
final class duj implements iqo {
    /* renamed from: a */
    private final /* synthetic */ kpk f16815a;

    duj(kpk kpk) {
        this.f16815a = kpk;
    }

    public final void close() {
        this.f16815a.cancel(true);
    }
}
