package p000;

/* compiled from: PG */
/* renamed from: ghf */
public abstract class ghf {
    /* renamed from: a */
    public final ghd f5433a = new ghd(2);
    /* renamed from: b */
    public final Object f5434b = new Object();

    public ghf(int i) {
        jri.m13395a(true);
    }

    /* renamed from: a */
    protected abstract Object mo7124a(Object obj);

    /* renamed from: c */
    public final ghg mo7126c(Object obj) {
        Object a;
        synchronized (this.f5434b) {
            a = this.f5433a.mo7123a(obj);
        }
        if (a == null) {
            a = mo7124a(obj);
        }
        return new ghg(this, obj, a);
    }

    /* renamed from: b */
    protected Object mo7125b(Object obj) {
        return obj;
    }
}
