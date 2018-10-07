package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gha */
public final class gha extends ggr {
    /* renamed from: a */
    private final gfz f19168a;
    /* renamed from: b */
    private final iqb f19169b;
    /* renamed from: i */
    private final ggc f19170i;
    /* renamed from: j */
    private final epl f19171j;
    /* renamed from: k */
    private final ird f19172k;

    public gha(gfw gfw, Executor executor, gfv gfv, gfz gfz, get get, iqb iqb, ggc ggc, epl epl, ird ird) {
        super(gfw, executor, gfv, C0252go.f5820aS, get);
        this.f19168a = gfz;
        this.f19169b = iqb;
        this.f19170i = ggc;
        this.f19171j = epl;
        this.f19172k = ird;
    }

    public final void run() {
        this.f19172k.mo8856a("LuckyShot");
        this.f19169b.mo8765a(this);
        klb klb = new klb();
        klb.f25212a = SystemClock.elapsedRealtimeNanos();
        ggd a = this.f19170i.mo7121a((gfw) jri.m13404b(this.f5405g));
        klb.f25213b = SystemClock.elapsedRealtimeNanos();
        epl epl = this.f19171j;
        synchronized (epl.f4261a) {
            if (epl.f4266f == null) {
                epl.f4266f = new ArrayList();
            }
            epl.f4266f.add(klb);
        }
        gfw a2 = this.f19168a.mo15535a(this.f5405g, a.f5396a);
        if (a.f5397b.mo9709b()) {
            epl = this.f19171j;
            epk epk = (epk) a.f5397b.mo9706a();
            kkz kkz = new kkz();
            kkz.f25203a = -1;
            kkz.f25204b = epk.f4259b;
            kkz.f25205c = 0.0f;
            kkz.f25206d = 0.0f;
            kkz.f25207e = epk.f4260c;
            epm epm = epk.f4258a;
            synchronized (epl.f4261a) {
                epl.f4262b.add(kkz);
                epl.f4263c.add(epm);
            }
        }
        if (a2 != null) {
            this.f5401c.mo7116a(a2.f5387b, this.f5402d);
        }
        this.f19172k.mo8857b();
    }
}
