package p000;

/* compiled from: PG */
/* renamed from: byk */
public final class byk implements gqd {
    /* renamed from: a */
    private static final String f11964a = bli.m887a("HdrPlusPrewarm");
    /* renamed from: b */
    private final kwk f11965b;
    /* renamed from: c */
    private final fhc f11966c;
    /* renamed from: d */
    private final ird f11967d;

    public byk(kwk kwk, fhc fhc, ird ird) {
        this.f11965b = kwk;
        this.f11966c = fhc;
        this.f11967d = ird;
    }

    public final void run() {
        Object obj = 1;
        if (this.f11966c.f4781a == C0252go.f5849av && this.f11966c.f4781a == C0252go.f5849av) {
            obj = null;
        }
        if (obj != null) {
            this.f11967d.mo8856a("HdrPlus#initialize");
            this.f11965b.mo10566a();
            this.f11967d.mo8857b();
            return;
        }
        bli.m888a(f11964a, "HdrPlus is not supported on this device.");
    }
}
