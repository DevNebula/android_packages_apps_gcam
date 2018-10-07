package p000;

/* compiled from: PG */
/* renamed from: kwh */
public final class kwh implements kwa, kwk {
    /* renamed from: a */
    private static final Object f22022a = new Object();
    /* renamed from: b */
    private volatile kwk f22023b;
    /* renamed from: c */
    private volatile Object f22024c = f22022a;

    private kwh(kwk kwk) {
        this.f22023b = kwk;
    }

    /* renamed from: a */
    public final Object mo10562a() {
        Object obj = this.f22024c;
        if (obj != f22022a) {
            return obj;
        }
        kwk kwk = this.f22023b;
        if (kwk == null) {
            return this.f22024c;
        }
        obj = kwk.mo10566a();
        this.f22024c = obj;
        this.f22023b = null;
        return obj;
    }

    /* renamed from: a */
    public static kwk m14279a(kwk kwk) {
        return ((kwk instanceof kwh) || (kwk instanceof kwc)) ? kwk : new kwh((kwk) ktm.m14218a((Object) kwk));
    }
}
