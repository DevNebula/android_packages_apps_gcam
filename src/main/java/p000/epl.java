package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: epl */
public final class epl {
    /* renamed from: a */
    public final Object f4261a = new Object();
    /* renamed from: b */
    public final List f4262b = new ArrayList();
    /* renamed from: c */
    public final List f4263c = new ArrayList();
    /* renamed from: d */
    public long f4264d = 0;
    /* renamed from: e */
    public long f4265e = 0;
    /* renamed from: f */
    public List f4266f;

    public epl(iya iya) {
    }

    /* renamed from: a */
    public final kla mo6443a() {
        kla kla;
        synchronized (this.f4261a) {
            kla = new kla();
            if (this.f4262b.size() <= 0 || this.f4263c.get(0) == null) {
                kla.f25209a = epm.UNKNOWN.f4271c;
            } else {
                kla.f25209a = ((epm) this.f4263c.get(0)).f4271c;
            }
            List list = this.f4262b;
            kla.f25210b = (kkz[]) list.toArray(new kkz[list.size()]);
        }
        return kla;
    }

    /* renamed from: b */
    public final klb[] mo6444b() {
        synchronized (this.f4261a) {
            List list = this.f4266f;
            if (list != null) {
                klb[] klbArr = (klb[]) list.toArray(new klb[list.size()]);
                return klbArr;
            }
            return null;
        }
    }
}
