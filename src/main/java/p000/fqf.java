package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fqf */
final class fqf implements fux {
    /* renamed from: a */
    private final frg f24287a;
    /* renamed from: b */
    private final Map f24288b = new HashMap();
    /* renamed from: c */
    private final Map f24289c = new HashMap();

    fqf(frg frg) {
        this.f24287a = frg;
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        kbg kbg;
        this.f24289c.put(Long.valueOf(iwz.mo13744f()), fkp.m17666a(iwz).mo15527a(fkr.f4830a, kpk));
        if (this.f24289c.isEmpty()) {
            kbg = kau.f21835a;
        } else {
            Object obj;
            long j;
            Iterator it = this.f24289c.values().iterator();
            Object obj2 = null;
            long j2 = 0;
            while (true) {
                obj = obj2;
                j = j2;
                if (!it.hasNext()) {
                    break;
                }
                long f = ((iwz) it.next()).mo13744f();
                if (obj == null) {
                    j2 = f;
                    int obj22 = 1;
                } else if (f > j) {
                    j2 = f;
                    obj22 = 1;
                } else {
                    long j3 = j;
                    obj22 = obj;
                    j2 = j3;
                }
            }
            if (obj != null) {
                kbg = kbg.m4804c(Long.valueOf(j));
            } else {
                kbg = kau.f21835a;
            }
        }
        if (kbg.mo9709b()) {
            fqf.m16014a(((Long) kbg.mo9706a()).longValue(), this.f24289c);
            fqf.m16014a(((Long) kbg.mo9706a()).longValue(), this.f24288b);
        }
    }

    public final void close() {
        try {
            fkp fkp;
            Object obj;
            kpk a = kow.m13874a(new isr());
            if (this.f24289c.isEmpty()) {
                fkp = null;
            } else {
                fkp = null;
                for (fkp fkp2 : this.f24289c.values()) {
                    if (fkp == null) {
                        fkp = fkp2;
                    } else if (fkp2.mo13744f() > fkp.mo13744f()) {
                        fkp = fkp2;
                    }
                }
            }
            if (fkp != null) {
                this.f24289c.remove(Long.valueOf(fkp.mo13744f()));
                a = (kpk) jri.m13404b(fkp.mo15529h());
            }
            if (fkp != null) {
                obj = (iwz) this.f24288b.get(Long.valueOf(fkp.mo13744f()));
                if (obj != null) {
                    this.f24288b.remove(Long.valueOf(obj.mo13744f()));
                }
            } else {
                obj = null;
            }
            this.f24287a.mo6874a(kbg.m4803b(fkp), kbg.m4803b(obj), a);
        } finally {
            m16013a();
        }
    }

    /* renamed from: a */
    private final void m16013a() {
        for (iwz close : this.f24288b.values()) {
            close.close();
        }
        for (iwz close2 : this.f24289c.values()) {
            close2.close();
        }
    }

    /* renamed from: a */
    private static void m16014a(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Long longValue : map.keySet()) {
            long longValue2 = longValue.longValue();
            if (longValue2 < j) {
                Long valueOf = Long.valueOf(longValue2);
                ((iwz) map.get(valueOf)).close();
                arrayList.add(valueOf);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            map.remove((Long) arrayList.get(i));
            i = i2;
        }
    }
}
