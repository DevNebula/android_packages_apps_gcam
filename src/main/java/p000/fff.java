package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fff */
public final class fff {
    /* renamed from: a */
    public final ird f4752a;
    /* renamed from: b */
    public final ikd f4753b;
    /* renamed from: c */
    public final Object f4754c = new Object();
    /* renamed from: d */
    public kpm f4755d;
    /* renamed from: e */
    public boolean f4756e;
    /* renamed from: f */
    private final kwk f4757f;

    public fff(ira ira, ird ird, ikd ikd, kwk kwk) {
        this.f4753b = ikd;
        this.f4752a = ird;
        ira.mo8854a("CommandExecutor");
        this.f4757f = kwk;
        this.f4756e = false;
    }

    /* renamed from: a */
    public final kpk mo6772a(ffe ffe) {
        kpk a;
        synchronized (this.f4754c) {
            if (this.f4756e) {
                a = kow.m13873a(null);
            } else {
                if (this.f4755d == null) {
                    this.f4755d = khx.m5001a((ExecutorService) this.f4757f.mo10566a());
                }
                jri.m13404b(this.f4755d);
                a = this.f4755d.mo10201a(new ffg(this, ffe));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo6773a() {
        boolean z;
        synchronized (this.f4754c) {
            z = this.f4756e;
        }
        return z;
    }
}
