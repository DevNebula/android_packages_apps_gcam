package p000;

/* renamed from: gao */
final /* synthetic */ class gao implements iqt {
    /* renamed from: a */
    private final gal f18938a;
    /* renamed from: b */
    private final kcx f18939b;
    /* renamed from: c */
    private final ilp f18940c;
    /* renamed from: d */
    private final fzm f18941d;

    gao(gal gal, kcx kcx, ilp ilp, fzm fzm) {
        this.f18938a = gal;
        this.f18939b = kcx;
        this.f18940c = ilp;
        this.f18941d = fzm;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        gal gal = this.f18938a;
        kcx kcx = this.f18939b;
        ilp ilp = this.f18940c;
        fzm fzm = this.f18941d;
        fzp a = gal.m2505a(kcx, ilp, fzp.UNKNOWN);
        if (a == fzp.UNKNOWN) {
            String str = gal.f5186a;
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("Property value ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" is not associated with a MenuOption.");
            bli.m898e(str, stringBuilder.toString());
        } else if (fzm != null) {
            gal.f5222b.mo14601a(fzm, a);
            gal.f5222b.mo14600a();
        }
    }
}
