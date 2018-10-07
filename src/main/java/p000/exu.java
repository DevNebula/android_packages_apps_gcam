package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: exu */
public final class exu implements kwk {
    /* renamed from: a */
    private final kwk f17984a;
    /* renamed from: b */
    private final kwk f17985b;
    /* renamed from: c */
    private final kwk f17986c;
    /* renamed from: d */
    private final kwk f17987d;
    /* renamed from: e */
    private final kwk f17988e;

    private exu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17984a = kwk;
        this.f17985b = kwk2;
        this.f17986c = kwk3;
        this.f17987d = kwk4;
        this.f17988e = kwk5;
    }

    /* renamed from: a */
    public static exu m10234a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new exu(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f17984a;
        kwk kwk2 = this.f17985b;
        kwk kwk3 = this.f17986c;
        kwk kwk4 = this.f17987d;
        ird ird = (ird) this.f17988e.mo10566a();
        if (euh.m2180a((bmb) kwk3.mo10566a(), (etg) kwk4.mo10566a())) {
            a = keu.m13727a(new exn(kwk2, ird, kwk));
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
