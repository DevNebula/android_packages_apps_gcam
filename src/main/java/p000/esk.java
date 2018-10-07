package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: esk */
final /* synthetic */ class esk implements Runnable {
    /* renamed from: a */
    private final eso f4428a;
    /* renamed from: b */
    private final grg f4429b;

    esk(esd esd, eso eso, grg grg) {
        this.f4428a = eso;
        this.f4429b = grg;
    }

    public final void run() {
        eso eso = this.f4428a;
        grg grg = this.f4429b;
        if (!eso.f4434a.f17819e.isCancelled()) {
            long currentTimeMillis = System.currentTimeMillis();
            euw a = eso.f4436c.mo6604a();
            klg klg = new klg();
            klg.f25241a = (int) (currentTimeMillis - eso.f4438e);
            klg.f25242b = (int) TimeUnit.MILLISECONDS.convert(eso.f4437d - a.f4486b, TimeUnit.MICROSECONDS);
            klg.f25243c = (int) TimeUnit.MILLISECONDS.convert(a.f4487c - eso.f4437d, TimeUnit.MICROSECONDS);
            klg.f25245e = true;
            klg.f25244d = a.f4485a;
            klg.f25246f = false;
            klg.f25247g = esd.m10042b(eso.f4439f);
            grg.mo7373a(klg);
        }
    }
}
