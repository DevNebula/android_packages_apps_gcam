package p000;

import java.util.concurrent.Executor;

/* renamed from: gus */
public final /* synthetic */ class gus implements Runnable {
    /* renamed from: a */
    private final kbg f6071a;
    /* renamed from: b */
    private final kwk f6072b;
    /* renamed from: c */
    private final kbg f6073c;
    /* renamed from: d */
    private final kwk f6074d;

    public gus(kbg kbg, kwk kwk, kbg kbg2, kwk kwk2) {
        this.f6071a = kbg;
        this.f6072b = kwk;
        this.f6073c = kbg2;
        this.f6074d = kwk2;
    }

    public final void run() {
        kbg kbg = this.f6071a;
        kwk kwk = this.f6072b;
        kbg kbg2 = this.f6073c;
        kwk kwk2 = this.f6074d;
        gva gva = (gva) kbg.mo9706a();
        kwk.mo10566a();
        kbg2.mo9706a();
        gva.mo13469b();
        exi exi = (exi) kwk.mo10566a();
        gva gva2 = (gva) kbg.mo9706a();
        gva2.getClass();
        exi.mo6659a(new guu(gva2), (Executor) kwk2.mo10566a());
    }
}
