package p000;

/* compiled from: PG */
/* renamed from: fud */
public final class fud implements iqo {
    /* renamed from: a */
    public final /* synthetic */ fub f18787a;
    /* renamed from: b */
    public final /* synthetic */ fuc f18788b;

    fud(fuc fuc, fub fub) {
        this.f18788b = fuc;
        this.f18787a = fub;
    }

    public final void close() {
        fuc fuc = this.f18788b;
        fub fub = this.f18787a;
        synchronized (fuc.f4955d) {
            for (Long remove : fub.f4947e) {
                fuc.f4956e.remove(remove);
            }
            fuc.f4954c.mo6913a(fub);
        }
    }
}
