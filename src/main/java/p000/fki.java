package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: fki */
final class fki implements iqt {
    /* renamed from: a */
    private final Object f18362a = new Object();
    /* renamed from: b */
    private final Map f18363b = new HashMap();
    /* renamed from: c */
    private final Comparator f18364c = fkj.f4828a;

    fki() {
    }

    /* renamed from: a */
    public final fhq mo13257a(Long l) {
        synchronized (this.f18362a) {
            if (this.f18363b.containsKey(l)) {
                fhq fhq = (fhq) ((TreeSet) this.f18363b.get(l)).first();
                return fhq;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo13258a(fhq fhq) {
        boolean d;
        synchronized (this.f18362a) {
            d = m10640d(fhq);
        }
        return d;
    }

    /* renamed from: b */
    final TreeSet mo13259b(fhq fhq) {
        TreeSet treeSet = new TreeSet(this.f18364c);
        synchronized (this.f18362a) {
            for (TreeSet it : this.f18363b.values()) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    fhq fhq2 = (fhq) it2.next();
                    if (fhq2.f4792b < fhq.f4792b) {
                        treeSet.add(fhq2);
                    }
                }
            }
            Iterator it3 = treeSet.iterator();
            while (it3.hasNext()) {
                m10640d((fhq) it3.next());
            }
        }
        return treeSet;
    }

    /* renamed from: d */
    private final boolean m10640d(fhq fhq) {
        boolean z;
        long j = fhq.f4791a;
        Map map = this.f18363b;
        Long valueOf = Long.valueOf(j);
        TreeSet treeSet = (TreeSet) map.get(valueOf);
        if (treeSet != null) {
            boolean remove = treeSet.remove(fhq);
            if (!remove) {
                z = remove;
            } else if (treeSet.isEmpty()) {
                this.f18363b.remove(valueOf);
                return remove;
            } else {
                z = remove;
            }
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo8826a(fhq fhq) {
        Long valueOf = Long.valueOf(fhq.f4791a);
        synchronized (this.f18362a) {
            if (this.f18363b.containsKey(valueOf)) {
                ((TreeSet) this.f18363b.get(valueOf)).add(fhq);
            } else {
                TreeSet treeSet = new TreeSet(this.f18364c);
                treeSet.add(fhq);
                this.f18363b.put(valueOf, treeSet);
            }
        }
    }
}
