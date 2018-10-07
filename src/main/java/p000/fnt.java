package p000;

/* compiled from: PG */
/* renamed from: fnt */
public final class fnt implements kwk {
    /* renamed from: a */
    private final kwk f18499a;
    /* renamed from: b */
    private final kwk f18500b;

    public fnt(fnr fnr, kwk kwk, kwk kwk2) {
        this.f18499a = kwk;
        this.f18500b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18499a;
        bkw bkw = (bkw) kwk.mo10566a();
        ivw ivw = (ivw) this.f18500b.mo10566a();
        int a = ije.m3829a(bkw.f1283a, "camera:global_imagereader_ticket_limit", Math.max(bkw.mo1999b(), bkw.mo2000c()) + Math.min(10, bkw.mo2001d()));
        fyt fxr = new fxr(a);
        ivw.mo9110b().mo8557a(fxr.mo6949c().mo13672a(new fns(a), kpq.f8776a));
        return (fyt) ktm.m14219a(fxr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
