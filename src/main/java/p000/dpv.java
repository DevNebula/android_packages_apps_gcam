package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: dpv */
public final class dpv implements kwk {
    /* renamed from: a */
    private final kwk f16471a;
    /* renamed from: b */
    private final kwk f16472b;

    private dpv(kwk kwk, kwk kwk2) {
        this.f16471a = kwk;
        this.f16472b = kwk2;
    }

    /* renamed from: a */
    public static dpv m9395a(kwk kwk, kwk kwk2) {
        return new dpv(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (fre) ktm.m14219a(new frf((fre) this.f16471a.mo10566a(), (Collection) this.f16472b.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
