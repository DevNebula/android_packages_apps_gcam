package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: eta */
public final class eta implements kwk {
    /* renamed from: a */
    private final kwk f17775a;
    /* renamed from: b */
    private final kwk f17776b;

    public eta(kwk kwk, kwk kwk2) {
        this.f17775a = kwk;
        this.f17776b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f17775a;
        if (((bmb) this.f17776b.mo10566a()).mo2022d()) {
            a = keu.m13727a((gqd) kwk.mo10566a());
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
