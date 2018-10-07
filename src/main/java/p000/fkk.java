package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: fkk */
public final class fkk implements fjv, iqo {
    /* renamed from: a */
    private final Object f18365a = new Object();
    /* renamed from: b */
    private final fjv f18366b;
    /* renamed from: c */
    private final List f18367c = new ArrayList();

    public fkk(fjv fjv) {
        this.f18366b = fjv;
    }

    /* renamed from: a */
    public final fiw mo6837a(fjw fjw) {
        iqt fkm = new fkm();
        fiw a = fds.m10419a(fkm);
        fiw a2 = this.f18366b.mo6837a(new fkl(fjw, fkm));
        synchronized (this.f18365a) {
            this.f18367c.add(fkm);
        }
        return fds.m10420a(a, a2);
    }

    public final void close() {
        synchronized (this.f18365a) {
            ListIterator listIterator = this.f18367c.listIterator();
            while (listIterator.hasNext()) {
                ((fkm) listIterator.next()).close();
                listIterator.remove();
            }
        }
    }
}
