package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cmd */
public final class cmd implements kwk {
    /* renamed from: a */
    private final kwk f12727a;
    /* renamed from: b */
    private final kwk f12728b;
    /* renamed from: c */
    private final kwk f12729c;
    /* renamed from: d */
    private final kwk f12730d;
    /* renamed from: e */
    private final kwk f12731e;

    public cmd(cmc cmc, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f12727a = kwk;
        this.f12728b = kwk2;
        this.f12729c = kwk3;
        this.f12730d = kwk4;
        this.f12731e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f12727a;
        kwk kwk2 = this.f12728b;
        kwk kwk3 = this.f12729c;
        kwk kwk4 = this.f12730d;
        kwk kwk5 = this.f12731e;
        csh csh = (csh) kwk.mo10566a();
        boolean booleanValue = ((Boolean) kwk2.mo10566a()).booleanValue();
        Context context = (Context) kwk3.mo10566a();
        hfz hfz = (hfz) kwk4.mo10566a();
        irs irs = (irs) kwk5.mo10566a();
        acm b = acc.m100b(context);
        csj cls = new cls();
        ikd.m12501a();
        cls.f12717o = csh;
        cls.f12716n = booleanValue;
        cls.f12718p = b;
        cls.f12719q = irs;
        cls.f12714l = true;
        hfz.mo7822a(cls);
        return (cls) ktm.m14219a(cls, "Cannot return null from a non-@Nullable @Provides method");
    }
}
