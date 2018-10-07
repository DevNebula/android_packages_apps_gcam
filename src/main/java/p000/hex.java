package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: hex */
public final class hex implements kwk {
    /* renamed from: a */
    private final hev f19995a;
    /* renamed from: b */
    private final kwk f19996b;
    /* renamed from: c */
    private final kwk f19997c;

    public hex(hev hev, kwk kwk, kwk kwk2) {
        this.f19995a = hev;
        this.f19996b = kwk;
        this.f19997c = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        hev hev = this.f19995a;
        kwk kwk = this.f19996b;
        ikd ikd = (ikd) kwk.mo10566a();
        ird ird = (ird) this.f19997c.mo10566a();
        Future d = kpw.m18486d();
        ikd.mo13667a(new hew(hev, ird, d));
        return (hes) ktm.m14219a((hes) kow.m13881c(d), "Cannot return null from a non-@Nullable @Provides method");
    }
}
