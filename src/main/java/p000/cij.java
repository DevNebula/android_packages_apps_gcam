package p000;

/* compiled from: PG */
/* renamed from: cij */
final class cij implements koj {
    /* renamed from: a */
    public final /* synthetic */ cig f12580a;
    /* renamed from: b */
    private final /* synthetic */ ikd f12581b;

    cij(cig cig, ikd ikd) {
        this.f12580a = cig;
        this.f12581b = ikd;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo10183a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return kow.m13873a(Boolean.valueOf(false));
        }
        kpk a;
        gqw gqw = this.f12580a.f2239u;
        if (gqw.f6009b == null) {
            gqw.mo7360b();
        } else if (gqw.f6008a.mo9709b()) {
            gqw.f6009b.f25303g = (float) (System.currentTimeMillis() - ((Long) gqw.f6008a.mo9706a()).longValue());
        }
        chf chf = (chf) this.f12580a.f2230l.getAndSet(null);
        if (chf == null) {
            a = kow.m13874a(new RuntimeException("Trying to stop a burst when none is running."));
        } else {
            ikd.m12501a();
            chf.f12490c.set(true);
            a = chf.f12491d;
        }
        kow.m13878a(a, new cik(this), this.f12581b);
        return a;
    }
}
