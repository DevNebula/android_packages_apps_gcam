package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bug */
public class bug {
    /* renamed from: a */
    public final buh f1623a;
    /* renamed from: b */
    public final Map f1624b;

    /* renamed from: a */
    public buf mo2147a(Class cls) {
        return (buf) this.f1624b.get(cls);
    }

    /* renamed from: a */
    public buh mo2148a() {
        return this.f1623a;
    }

    /* renamed from: b */
    public bug mo2150b() {
        return null;
    }

    /* renamed from: c */
    public void mo2151c() {
    }

    public bug(bug bug) {
        this(bug.mo2148a());
    }

    public bug(buh buh) {
        this.f1623a = buh;
        this.f1624b = new HashMap();
    }

    /* renamed from: d */
    public iqo mo2152d() {
        return this.f1623a.mo2153a();
    }

    /* renamed from: a */
    public void mo2149a(Class cls, buf buf) {
        this.f1624b.put(cls, buf);
    }
}
