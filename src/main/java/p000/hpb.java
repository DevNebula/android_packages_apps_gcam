package p000;

/* compiled from: PG */
/* renamed from: hpb */
final class hpb implements iqt {
    /* renamed from: a */
    private final /* synthetic */ hox f20240a;

    hpb(hox hox) {
        this.f20240a = hox;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        int round = Math.round(((float) (Math.log((double) (((Float) obj).floatValue() / this.f20240a.f20224a)) / Math.log((double) (((Float) this.f20240a.f20239q.mo13673b()).floatValue() / this.f20240a.f20224a)))) * 100000.0f);
        if (this.f20240a.f20226c.getProgress() != round) {
            this.f20240a.f20226c.setProgress(round);
        }
    }
}
