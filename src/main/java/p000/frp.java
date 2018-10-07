package p000;

/* compiled from: PG */
/* renamed from: frp */
final class frp {
    /* renamed from: a */
    public final fri f4900a;
    /* renamed from: b */
    public final kpk f4901b;
    /* renamed from: c */
    public final kpw f4902c = kpw.m18486d();
    /* renamed from: d */
    public final fwn f4903d = new fwn();
    /* renamed from: e */
    public final /* synthetic */ frk f4904e;

    frp(frk frk, fri fri) {
        this.f4904e = frk;
        this.f4900a = fri;
        this.f4901b = (kpk) jri.m13404b(fri.f5389d);
    }

    /* renamed from: a */
    public final void mo6879a(Throwable th) {
        if (this.f4902c.mo15642a(th) || this.f4902c.isCancelled()) {
            synchronized (this.f4904e.f18703a) {
                this.f4904e.f18712j.remove(this);
                this.f4904e.f18713k.remove(this);
                this.f4904e.f18714l.remove(this);
                this.f4904e.f18709g.mo15007a();
                this.f4904e.mo13279d();
            }
        }
    }

    /* renamed from: a */
    public final long mo6878a() {
        return this.f4904e.mo13277b(this.f4901b);
    }
}
