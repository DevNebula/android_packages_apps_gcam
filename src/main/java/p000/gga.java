package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gga */
public final class gga implements kov {
    /* renamed from: a */
    private final /* synthetic */ gkr f19151a;
    /* renamed from: b */
    private final /* synthetic */ gfz f19152b;

    public gga(gfz gfz, gkr gkr) {
        this.f19152b = gfz;
        this.f19151a = gkr;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m891b(gfz.f26397c, "Lucky Shot Filter failed to return valid result.");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Set set = (Set) obj;
        if (set != null) {
            this.f19152b.mo15536a(set, this.f19151a);
        }
    }
}
