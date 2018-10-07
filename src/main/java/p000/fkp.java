package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: fkp */
public class fkp extends iww {
    /* renamed from: b */
    public final Map f26352b;

    public fkp(fkp fkp) {
        this((iwz) fkp);
        this.f26352b.putAll(fkp.f26352b);
    }

    private fkp(iwz iwz) {
        super(iwz);
        this.f26352b = new ConcurrentHashMap();
    }

    public fkp(iwz iwz, kpk kpk) {
        this(iwz);
        if (kpk != null) {
            this.f26352b.put(fkr.f4830a, kpk);
        }
    }

    public fkp(iwz iwz, Map map) {
        super(iwz);
        this.f26352b = new ConcurrentHashMap(map);
    }

    /* renamed from: a */
    public final fkp mo15527a(fkq fkq, Object obj) {
        jri.m13404b((Object) fkq);
        jri.m13404b(obj);
        this.f26352b.put(fkq, obj);
        return this;
    }

    /* renamed from: a */
    public static fkp m17666a(iwz iwz) {
        return new fkp(iwz);
    }

    /* renamed from: a */
    public final Object mo15528a(fkq fkq) {
        Object b = m17667b(fkq);
        String valueOf = String.valueOf(fkq);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("No value found for key: ");
        stringBuilder.append(valueOf);
        return jri.m13391a(b, stringBuilder.toString());
    }

    /* renamed from: h */
    public final kpk mo15529h() {
        return (kpk) m17667b(fkr.f4830a);
    }

    /* renamed from: b */
    private final Object m17667b(fkq fkq) {
        return this.f26352b.containsKey(fkq) ? this.f26352b.get(fkq) : null;
    }

    /* renamed from: i */
    public final boolean mo15530i() {
        return mo13741c() != -1;
    }
}
