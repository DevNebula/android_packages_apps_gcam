package p000;

import java.util.concurrent.Executor;

/* renamed from: evz */
public final /* synthetic */ class evz implements Runnable {
    /* renamed from: a */
    private final ird f4514a;
    /* renamed from: b */
    private final kwk f4515b;
    /* renamed from: c */
    private final kwk f4516c;
    /* renamed from: d */
    private final kwk f4517d;
    /* renamed from: e */
    private final kwk f4518e;
    /* renamed from: f */
    private final kwk f4519f;
    /* renamed from: g */
    private final kwk f4520g;

    public evz(ird ird, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f4514a = ird;
        this.f4515b = kwk;
        this.f4516c = kwk2;
        this.f4517d = kwk3;
        this.f4518e = kwk4;
        this.f4519f = kwk5;
        this.f4520g = kwk6;
    }

    public final void run() {
        ird ird = this.f4514a;
        kwk kwk = this.f4515b;
        kwk kwk2 = this.f4516c;
        kwk kwk3 = this.f4517d;
        kwk kwk4 = this.f4518e;
        kwk kwk5 = this.f4519f;
        kwk kwk6 = this.f4520g;
        ird.mo8856a("MICRO_EncoderModule#runEncoderStartupTask");
        ((etl) kwk.mo10566a()).mo13186a();
        ((etc) kwk2.mo10566a()).mo6581a((esu) kwk3.mo10566a());
        exi exi = (exi) kwk4.mo10566a();
        ixd ixd = (ixd) kwk5.mo10566a();
        ixd.getClass();
        exi.mo6659a(new ewd(ixd), (Executor) kwk6.mo10566a());
        ird.mo8857b();
    }
}
