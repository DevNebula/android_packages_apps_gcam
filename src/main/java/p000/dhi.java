package p000;

/* compiled from: PG */
/* renamed from: dhi */
public final class dhi implements kwk {
    /* renamed from: a */
    private final kwk f13901a;

    public dhi(kwk kwk) {
        this.f13901a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        inc inc;
        bsn bsn = (bsn) this.f13901a.mo10566a();
        inc inc2 = inc.FPS_120;
        kbg a = bsn.mo2105a(bin.f1219c);
        if (!a.mo9709b()) {
            inc = inc2;
        } else if (((Integer) a.mo9706a()).intValue() == 240) {
            inc = inc.FPS_240;
        } else {
            inc = inc2;
        }
        return (ilb) ktm.m14219a(new ilb(inc), "Cannot return null from a non-@Nullable @Provides method");
    }
}
