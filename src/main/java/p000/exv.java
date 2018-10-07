package p000;

import android.os.Handler;
import java.util.Set;

/* compiled from: PG */
/* renamed from: exv */
public final class exv implements kwk {
    /* renamed from: a */
    private final kwk f17989a;
    /* renamed from: b */
    private final kwk f17990b;
    /* renamed from: c */
    private final kwk f17991c;
    /* renamed from: d */
    private final kwk f17992d;
    /* renamed from: e */
    private final kwk f17993e;

    private exv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17989a = kwk;
        this.f17990b = kwk2;
        this.f17991c = kwk3;
        this.f17992d = kwk4;
        this.f17993e = kwk5;
    }

    /* renamed from: a */
    public static exv m10236a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new exv(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f17989a;
        kwk kwk2 = this.f17990b;
        kwk kwk3 = this.f17991c;
        if (euh.m2180a((bmb) this.f17992d.mo10566a(), (etg) this.f17993e.mo10566a())) {
            ixb ixb = (ixb) kwk.mo10566a();
            exi exi = (exi) kwk2.mo10566a();
            exi.getClass();
            ixb.mo13747a(new exm(exi), (Handler) kwk3.mo10566a());
            a = keu.m13727a(ixb.mo13753g());
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
