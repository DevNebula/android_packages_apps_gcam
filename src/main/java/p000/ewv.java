package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewv */
public final class ewv implements kwk {
    /* renamed from: a */
    private final kwk f17949a;
    /* renamed from: b */
    private final kwk f17950b;
    /* renamed from: c */
    private final kwk f17951c;
    /* renamed from: d */
    private final kwk f17952d;
    /* renamed from: e */
    private final kwk f17953e;

    private ewv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17949a = kwk;
        this.f17950b = kwk2;
        this.f17951c = kwk3;
        this.f17952d = kwk4;
        this.f17953e = kwk5;
    }

    /* renamed from: a */
    public static ewv m10195a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ewv(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f17949a;
        kwk kwk2 = this.f17950b;
        kwk kwk3 = this.f17951c;
        kwk kwk4 = this.f17952d;
        etg etg = (etg) kwk4.mo10566a();
        ird ird = (ird) this.f17953e.mo10566a();
        if (((bmb) kwk3.mo10566a()).mo2022d() && etg.f4446a) {
            a = keu.m13727a(new ewl(ird, kwk2, kwk));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
