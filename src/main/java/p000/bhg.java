package p000;

/* compiled from: PG */
/* renamed from: bhg */
final class bhg implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f11377a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f11378b;
    /* renamed from: c */
    private final /* synthetic */ bhf f11379c;

    bhg(bhf bhf, kpw kpw, Runnable runnable) {
        this.f11379c = bhf;
        this.f11377a = kpw;
        this.f11378b = runnable;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bhf bhf = this.f11379c;
        Runnable runnable = this.f11378b;
        bli.m888a(bhf.f11372a, "Execute AF reset runnable");
        bhf.f11374c.mo8826a(fdp.m10408a());
        bhf.f11375d.mo8826a(fdp.m10408a());
        runnable.run();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        jri.m13404b((aua) obj);
        this.f11379c.f11373b.execute(new bhh(this.f11377a));
    }
}
