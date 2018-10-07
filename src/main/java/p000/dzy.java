package p000;

/* compiled from: PG */
/* renamed from: dzy */
public final class dzy {
    /* renamed from: a */
    public cbw f3633a;
    /* renamed from: b */
    public ble f3634b;
    /* renamed from: c */
    public bkx f3635c;
    /* renamed from: d */
    public gcp f3636d;
    /* renamed from: e */
    public bbz f3637e;

    dzy() {
    }

    /* renamed from: a */
    public final dzy mo6150a(cbw cbw) {
        this.f3633a = (cbw) ktm.m14218a((Object) cbw);
        return this;
    }

    /* renamed from: a */
    public final dzv mo6149a() {
        if (this.f3633a == null) {
            throw new IllegalStateException(String.valueOf(cbw.class.getCanonicalName()).concat(" must be set"));
        }
        if (this.f3634b == null) {
            this.f3634b = new ble();
        }
        if (this.f3635c == null) {
            this.f3635c = new bkx();
        }
        if (this.f3636d == null) {
            this.f3636d = new gcp();
        }
        if (this.f3637e == null) {
            this.f3637e = new bbz();
        }
        return new dzw(this);
    }
}
