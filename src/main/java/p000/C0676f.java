package p000;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: f */
public final class C0676f extends C0239g {
    /* renamed from: a */
    public HashMap f18082a = new HashMap();

    /* renamed from: a */
    public final boolean mo13213a(Object obj) {
        return this.f18082a.containsKey(obj);
    }

    /* renamed from: b */
    protected final C0302j mo6985b(Object obj) {
        return (C0302j) this.f18082a.get(obj);
    }

    /* renamed from: a */
    public final Object mo6983a(Object obj, Object obj2) {
        C0302j b = mo6985b(obj);
        if (b != null) {
            return b.f7960b;
        }
        this.f18082a.put(obj, mo6986b(obj, obj2));
        return null;
    }

    /* renamed from: c */
    public final Object mo6987c(Object obj) {
        Object c = super.mo6987c(obj);
        this.f18082a.remove(obj);
        return c;
    }
}
