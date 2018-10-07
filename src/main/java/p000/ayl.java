package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ayl */
public final class ayl implements kwk {
    /* renamed from: a */
    private final kwk f11045a;
    /* renamed from: b */
    private final kwk f11046b;
    /* renamed from: c */
    private final kwk f11047c;

    public ayl(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11045a = kwk;
        this.f11046b = kwk2;
        this.f11047c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f11045a;
        kwk kwk2 = this.f11046b;
        kwk kwk3 = this.f11047c;
        kwk2.mo10566a();
        ivw ivw = (ivw) kwk3.mo10566a();
        Set set = (Set) kwk.mo10566a();
        if (set.size() > 0) {
            ayc ayc = new ayc(set, ivw.mo9110b());
            for (ayo ayo : ayc.f11031a) {
                ayc.f11032b.mo8557a(ilq.m3882a(ayo.mo1854b().f1059b, new ayd(ayc), kpq.f8776a));
                ayc.f11032b.mo8557a(ilq.m3882a(ayo.mo1854b().f1058a, new aye(ayc), kpq.f8776a));
            }
            obj = ayc;
        } else {
            obj = new ayg();
        }
        return (ayb) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
