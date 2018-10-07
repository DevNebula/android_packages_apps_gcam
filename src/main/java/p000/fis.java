package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fis */
public final class fis {
    /* renamed from: a */
    public final kbg f4810a;
    /* renamed from: b */
    public final Set f4811b;
    /* renamed from: c */
    public final Set f4812c;
    /* renamed from: d */
    public final Set f4813d;

    public fis(kbg kbg, Set set, Set set2, Set set3) {
        this.f4810a = kbg;
        this.f4811b = keu.m13732a((Collection) set);
        this.f4812c = keu.m13732a((Collection) set2);
        this.f4813d = keu.m13732a((Collection) set3);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fis)) {
            fis fis = (fis) obj;
            if (kbf.m16778b(this.f4810a, fis.f4810a) && kbf.m16778b(this.f4811b, fis.f4811b) && kbf.m16778b(this.f4812c, fis.f4812c) && kbf.m16778b(this.f4813d, fis.f4813d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4810a, this.f4811b, this.f4812c, this.f4813d});
    }

    /* renamed from: a */
    public final void mo6818a(fio fio) {
        if (this.f4810a.mo9709b()) {
            fio.f4802a = ((Integer) this.f4810a.mo9706a()).intValue();
        }
        for (fhy a : this.f4811b) {
            fio.mo6810a(a);
        }
        for (fiw a2 : this.f4812c) {
            fio.mo6813a(a2);
        }
        for (fin a3 : this.f4813d) {
            fio.mo6812a(a3);
        }
    }
}
