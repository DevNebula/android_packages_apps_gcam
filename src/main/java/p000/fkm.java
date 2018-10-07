package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fkm */
final class fkm implements iqo, iqt {
    /* renamed from: a */
    public final Map f18370a = new HashMap();
    /* renamed from: b */
    public final Object f18371b = new Object();

    fkm() {
    }

    public final void close() {
        synchronized (this.f18371b) {
            for (kpw a : this.f18370a.values()) {
                a.mo15642a(new isr("Camera has been closed"));
            }
            this.f18370a.clear();
        }
    }

    /* renamed from: a */
    final kpw mo13261a(Long l) {
        kpw kpw;
        synchronized (this.f18371b) {
            if (this.f18370a.containsKey(l)) {
                kpw = (kpw) this.f18370a.get(l);
            } else {
                kpw = kpw.m18486d();
                this.f18370a.put(l, kpw);
            }
        }
        return kpw;
    }
}
