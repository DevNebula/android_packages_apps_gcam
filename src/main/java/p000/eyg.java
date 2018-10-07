package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyg */
public final class eyg {
    /* renamed from: a */
    public final kbg f4575a;
    /* renamed from: b */
    public final eym f4576b;
    /* renamed from: c */
    public final Map f4577c = new HashMap();

    public eyg(kbg kbg, eym eym) {
        this.f4575a = kbg;
        this.f4576b = eym;
    }

    /* renamed from: a */
    public final synchronized eyh mo6677a(long j) {
        eyh eyh;
        Map map = this.f4577c;
        Long valueOf = Long.valueOf(j);
        jri.m13406b(map.containsKey(valueOf) ^ 1, (Object) "Current session exists; didn't clear last one?");
        jri.m13406b(this.f4575a.mo9709b(), (Object) "Trying to create a tone map session with no microvideo API");
        eyh = new eyh(this, j);
        this.f4577c.put(valueOf, eyh);
        return eyh;
    }

    /* renamed from: b */
    public final synchronized kbg mo6678b(long j) {
        return kbg.m4803b((eyh) this.f4577c.get(Long.valueOf(j)));
    }
}
