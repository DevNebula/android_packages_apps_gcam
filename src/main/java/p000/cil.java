package p000;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cil */
final class cil implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jmr f2245a;
    /* renamed from: b */
    private final /* synthetic */ kpk f2246b;
    /* renamed from: c */
    private final /* synthetic */ bcy f2247c;
    /* renamed from: d */
    private final /* synthetic */ chi f2248d;
    /* renamed from: e */
    private final /* synthetic */ cjo f2249e;
    /* renamed from: f */
    private final /* synthetic */ gkr f2250f;
    /* renamed from: g */
    private final /* synthetic */ boolean f2251g;
    /* renamed from: h */
    private final /* synthetic */ UUID f2252h;
    /* renamed from: i */
    private final /* synthetic */ chv f2253i;
    /* renamed from: j */
    private final /* synthetic */ cig f2254j;

    cil(cig cig, jmr jmr, kpk kpk, bcy bcy, chi chi, cjo cjo, gkr gkr, boolean z, UUID uuid, chv chv) {
        this.f2254j = cig;
        this.f2245a = jmr;
        this.f2246b = kpk;
        this.f2247c = bcy;
        this.f2248d = chi;
        this.f2249e = cjo;
        this.f2250f = gkr;
        this.f2251g = z;
        this.f2252h = uuid;
        this.f2253i = chv;
    }

    public final /* synthetic */ Object call() {
        chf chf = (chf) this.f2254j.f2230l.get();
        if (chf == null) {
            throw new NullPointerException("Attempting to start burst, but BurstCaptureCommand is null!");
        }
        grw grw = new grw();
        this.f2254j.f2228j.set(grw);
        grw.mo7383a(chf.f12488a);
        cig cig = this.f2254j;
        Context context = cig.f2220b;
        jmr jmr = this.f2245a;
        kpk kpk = this.f2246b;
        cig.f2225g.get();
        bcy bcy = this.f2247c;
        chi chi = this.f2248d;
        cjn cjn = new cjn(this.f2254j, this.f2249e);
        gkr gkr = this.f2250f;
        cig cig2 = this.f2254j;
        gln gln = cig2.f2222d;
        gev b = cig2.f2212A;
        cig cig3 = this.f2254j;
        chh chj = new chj(context, jmr, kpk, bcy, chi, cjn, gkr, gln, b, grw, cig3.f2238t, this.f2251g, cig3.f2234p, this.f2252h, cig3.f2236r, cig3.f2240v, this.f2254j.f2241w);
        this.f2254j.f2229k.set(chj);
        jwa a = chj.mo2295a();
        chj.mo2296a(chf.f12489b, this.f2253i.f2186b);
        return a;
    }
}
