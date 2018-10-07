package p000;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: flp */
final class flp implements fjw, iqo {
    /* renamed from: a */
    public final Object f18408a = new Object();
    /* renamed from: b */
    public final Queue f18409b = new LinkedBlockingQueue();
    /* renamed from: c */
    public boolean f18410c = false;
    /* renamed from: d */
    private final fjw f18411d;

    flp(fjw fjw) {
        this.f18411d = fjw;
    }

    /* renamed from: a */
    public final kpk mo6838a(fkp fkp) {
        Object obj;
        iwz fkp2;
        synchronized (this.f18408a) {
            if (this.f18410c) {
                obj = null;
            } else {
                fou fou = new fou(fkp2, (fyr) this.f18409b.remove());
                fkp2 = null;
                obj = fou;
            }
        }
        if (fkp2 == null) {
            return this.f18411d.mo6838a((fkp) jri.m13404b(obj));
        }
        fkp2.close();
        return kow.m13873a(null);
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f18408a) {
            this.f18410c = true;
            bbo.addAll(this.f18409b);
            this.f18409b.clear();
        }
        bbo.close();
    }

    /* renamed from: a */
    public final boolean mo6839a() {
        return this.f18411d.mo6839a();
    }
}
