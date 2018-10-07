package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ewf */
public final class ewf implements kwk {
    /* renamed from: a */
    private final kwk f17891a;
    /* renamed from: b */
    private final kwk f17892b;
    /* renamed from: c */
    private final kwk f17893c;
    /* renamed from: d */
    private final kwk f17894d;
    /* renamed from: e */
    private final kwk f17895e;
    /* renamed from: f */
    private final kwk f17896f;
    /* renamed from: g */
    private final kwk f17897g;

    private ewf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f17891a = kwk;
        this.f17892b = kwk2;
        this.f17893c = kwk3;
        this.f17894d = kwk4;
        this.f17895e = kwk5;
        this.f17896f = kwk6;
        this.f17897g = kwk7;
    }

    /* renamed from: a */
    public static ewf m10171a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        return new ewf(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17891a;
        kwk kwk2 = this.f17893c;
        kwk kwk3 = this.f17894d;
        kwk kwk4 = this.f17895e;
        kwk kwk5 = this.f17896f;
        MediaFormat mediaFormat = (MediaFormat) kwk.mo10566a();
        euj euj = (euj) kwk2.mo10566a();
        exi exi = (exi) kwk3.mo10566a();
        iuw iuw = (iuw) kwk4.mo10566a();
        evo evo = (evo) kwk5.mo10566a();
        this.f17897g.mo10566a();
        evm evm = new evm(evo, euj, kau.f21835a);
        exi.getClass();
        evb evb = new evb(mediaFormat, new etf(exi), evm, iuw, euh.m2175a("mv-vid-encoder"));
        evb.getClass();
        exi.mo6659a(new ewb(evb), kpq.f8776a);
        return (evb) ktm.m14219a(evb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
