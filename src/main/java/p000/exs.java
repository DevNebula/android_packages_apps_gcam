package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: exs */
public final class exs implements kwk {
    /* renamed from: a */
    private final kwk f17978a;
    /* renamed from: b */
    private final kwk f17979b;
    /* renamed from: c */
    private final kwk f17980c;
    /* renamed from: d */
    private final kwk f17981d;

    private exs(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17978a = kwk;
        this.f17979b = kwk2;
        this.f17980c = kwk3;
        this.f17981d = kwk4;
    }

    /* renamed from: a */
    public static exs m10230a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exs(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f17978a;
        kwk kwk2 = this.f17979b;
        kwk kwk3 = this.f17980c;
        bmb bmb = (bmb) kwk2.mo10566a();
        etg etg = (etg) kwk3.mo10566a();
        this.f17981d.mo10566a();
        if (euh.m2180a(bmb, etg)) {
            Collection hashSet = new HashSet();
            hashSet.add(fds.m10414a(new exl(kwk)));
            if (hsz.f6998z != null) {
                hashSet.add(fds.m10413a(hsz.f6998z, hsz.f6970A));
            }
            a = keu.m13732a(hashSet);
        } else {
            a = kgn.f24941a;
        }
        return (Set) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
