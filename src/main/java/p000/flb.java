package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: flb */
public final class flb extends fld {
    flb(long j, kpk kpk, List list) {
        super(j, kpk, list);
    }

    /* renamed from: g */
    public final boolean mo15531g() {
        boolean z;
        synchronized (this.f24270b) {
            Iterator it = mo13248b().iterator();
            z = true;
            while (it.hasNext()) {
                int i;
                if (((iuz) ((iwz) it.next())).mo15557i() <= 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                z = i & z;
            }
        }
        return z;
    }

    public final synchronized void close() {
        mo15533i();
    }

    /* renamed from: h */
    public final fjj mo15532h() {
        fjj fld;
        synchronized (this.f24270b) {
            List arrayList = new ArrayList();
            Iterator it = mo13248b().iterator();
            while (it.hasNext()) {
                iwz h = ((iuz) ((iwz) it.next())).mo13195a();
                if (h != null) {
                    arrayList.add(h);
                }
            }
            fld = new fld(mo13251e(), this.f24269a, arrayList);
        }
        return fld;
    }

    /* renamed from: i */
    public final boolean mo15533i() {
        boolean z;
        synchronized (this.f24270b) {
            LinkedList b = mo13248b();
            Iterator it = mo13248b().iterator();
            boolean z2 = true;
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                z2 = ((iuz) ((iwz) it.next())).mo15558j() & z;
            }
            b.clear();
        }
        if (z) {
            super.close();
        }
        return z;
    }
}
