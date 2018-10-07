package p000;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ffx */
public final class ffx implements kwk {
    /* renamed from: a */
    private final kwk f18228a;
    /* renamed from: b */
    private final kwk f18229b;
    /* renamed from: c */
    private final kwk f18230c;

    private ffx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f18228a = kwk;
        this.f18229b = kwk2;
        this.f18230c = kwk3;
    }

    /* renamed from: a */
    public static ffx m10485a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ffx(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18228a;
        kwk kwk2 = this.f18229b;
        Set set = (Set) this.f18230c.mo10566a();
        return (kpk) ktm.m14219a(kny.m18475a(kow.m13872a((Set) kwk2.mo10566a()), new fmf(new ArrayList((Set) kwk.mo10566a()), set), kpq.f8776a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
