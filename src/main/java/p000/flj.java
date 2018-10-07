package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: flj */
final class flj {
    /* renamed from: a */
    public final int f4839a;
    /* renamed from: b */
    public final fhq f4840b;
    /* renamed from: c */
    public final Map f4841c;
    /* renamed from: d */
    public fyr f4842d = null;
    /* renamed from: e */
    public kpw f4843e;

    flj(int i, fhq fhq) {
        this.f4839a = i;
        this.f4840b = fhq;
        this.f4841c = new HashMap();
        this.f4843e = kpw.m18486d();
    }

    /* renamed from: a */
    final void mo6848a() {
        for (iwz close : this.f4841c.values()) {
            close.close();
        }
        fyr fyr = this.f4842d;
        if (fyr != null) {
            fyr.close();
        }
        this.f4843e.mo15641a(Boolean.FALSE);
    }

    /* renamed from: a */
    final void mo6849a(int i, fkp fkp) {
        Map map = this.f4841c;
        Integer valueOf = Integer.valueOf(i);
        jri.m13405b(map.containsKey(valueOf) ^ 1);
        this.f4841c.put(valueOf, fkp);
    }
}
