package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fuc */
public final class fuc {
    /* renamed from: a */
    public final fts f4952a;
    /* renamed from: b */
    public final fts f4953b;
    /* renamed from: c */
    public final fue f4954c;
    /* renamed from: d */
    public final Object f4955d = new Object();
    /* renamed from: e */
    public final Map f4956e = new HashMap();

    public fuc(fts fts, fts fts2, fue fue) {
        this.f4952a = fts;
        this.f4953b = fts2;
        this.f4954c = fue;
    }

    /* renamed from: a */
    public final fub mo6912a(long j) {
        fub fub;
        synchronized (this.f4955d) {
            Map map = this.f4956e;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                fub = (fub) jri.m13404b((fub) this.f4956e.get(valueOf));
            } else {
                fub = new fub("");
            }
        }
        return fub;
    }
}
