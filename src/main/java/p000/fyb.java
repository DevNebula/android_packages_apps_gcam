package p000;

/* compiled from: PG */
/* renamed from: fyb */
public final class fyb implements AutoCloseable {
    /* renamed from: a */
    public final fyr f5046a;
    /* renamed from: b */
    public final Object f5047b = new Object();
    /* renamed from: c */
    public boolean f5048c = false;
    /* renamed from: d */
    public int f5049d = 0;

    public fyb(fyr fyr) {
        this.f5046a = fyr;
    }

    public final void close() {
        fyr fyr;
        synchronized (this.f5047b) {
            jri.m13405b(this.f5048c ^ 1);
            this.f5048c = true;
            if (this.f5049d == 0) {
                fyr = this.f5046a;
            } else {
                fyr = null;
            }
        }
        if (fyr != null) {
            fyr.close();
        }
    }

    /* renamed from: a */
    public final fyr mo6941a() {
        synchronized (this.f5047b) {
            jri.m13405b(this.f5048c ^ 1);
            this.f5049d++;
        }
        return new fyc(this);
    }
}
