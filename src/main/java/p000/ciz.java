package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ciz */
public final class ciz implements kwk {
    /* renamed from: a */
    private final kwk f12597a;
    /* renamed from: b */
    private final kwk f12598b;

    private ciz(kwk kwk, kwk kwk2) {
        this.f12597a = kwk;
        this.f12598b = kwk2;
    }

    /* renamed from: a */
    public static ciz m8345a(kwk kwk, kwk kwk2) {
        return new ciz(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12597a;
        gsl gsl = (gsl) this.f12598b.mo10566a();
        return (gin) ktm.m14219a(new gin(gsl, gnv.m11435a((Context) kwk.mo10566a(), gsl)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
