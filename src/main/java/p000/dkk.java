package p000;

/* compiled from: PG */
/* renamed from: dkk */
public final class dkk implements kwk {
    /* renamed from: a */
    private final kwk f14157a;

    public dkk(kwk kwk) {
        this.f14157a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        bfk bfk = (bfk) this.f14157a.mo10566a();
        fbn a = bfk.mo12364a();
        iut[] values = iut.values();
        int length = values.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            boolean z2;
            iut iut = values[i];
            if (a.mo9094c(iut)) {
                kbg b = bfk.mo12367b(a.mo9091b(iut));
                if (b.mo9709b()) {
                    z2 = !z ? ((bez) b.mo9706a()).mo1932a() : true;
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        return (djq) ktm.m14219a(new djq(z), "Cannot return null from a non-@Nullable @Provides method");
    }
}
