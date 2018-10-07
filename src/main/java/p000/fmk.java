package p000;

/* compiled from: PG */
/* renamed from: fmk */
public final class fmk {
    /* renamed from: a */
    public fmd f4853a;
    /* renamed from: b */
    public fmn f4854b;
    /* renamed from: c */
    public ble f4855c;
    /* renamed from: d */
    public bbz f4856d;
    /* renamed from: e */
    public fln f4857e;

    fmk() {
    }

    /* renamed from: a */
    public final fmm mo6856a() {
        if (this.f4853a == null) {
            throw new IllegalStateException(String.valueOf(fmd.class.getCanonicalName()).concat(" must be set"));
        } else if (this.f4854b == null) {
            throw new IllegalStateException(String.valueOf(fmn.class.getCanonicalName()).concat(" must be set"));
        } else {
            if (this.f4855c == null) {
                this.f4855c = new ble();
            }
            if (this.f4856d == null) {
                this.f4856d = new bbz();
            }
            if (this.f4857e != null) {
                return new fmj(this);
            }
            throw new IllegalStateException(String.valueOf(fln.class.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: a */
    public final fmk mo6853a(fln fln) {
        this.f4857e = (fln) ktm.m14218a((Object) fln);
        return this;
    }

    /* renamed from: a */
    public final fmk mo6854a(fmd fmd) {
        this.f4853a = (fmd) ktm.m14218a((Object) fmd);
        return this;
    }

    /* renamed from: a */
    public final fmk mo6855a(fmn fmn) {
        this.f4854b = (fmn) ktm.m14218a((Object) fmn);
        return this;
    }
}
