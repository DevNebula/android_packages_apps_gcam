package p000;

/* compiled from: PG */
/* renamed from: kdi */
final class kdi extends kcl {
    /* renamed from: a */
    private final Object f21871a;
    /* renamed from: b */
    private int f21872b;
    /* renamed from: c */
    private final /* synthetic */ kdb f21873c;

    kdi(kdb kdb, int i) {
        this.f21873c = kdb;
        this.f21871a = kdb.f8581b[i];
        this.f21872b = i;
    }

    public final Object getKey() {
        return this.f21871a;
    }

    public final Object getValue() {
        m13674a();
        int i = this.f21872b;
        return i != -1 ? this.f21873c.f8582c[i] : null;
    }

    public final Object setValue(Object obj) {
        m13674a();
        int i = this.f21872b;
        if (i == -1) {
            this.f21873c.put(this.f21871a, obj);
            return null;
        }
        Object[] objArr = this.f21873c.f8582c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* renamed from: a */
    private final void m13674a() {
        int i = this.f21872b;
        if (i == -1 || i >= this.f21873c.size() || !kbf.m16778b(this.f21871a, this.f21873c.f8581b[this.f21872b])) {
            this.f21872b = this.f21873c.mo9768a(this.f21871a);
        }
    }
}
