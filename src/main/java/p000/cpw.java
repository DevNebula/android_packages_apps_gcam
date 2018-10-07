package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: cpw */
public final class cpw implements csj {
    /* renamed from: a */
    public final ConcurrentLinkedQueue f13133a = new ConcurrentLinkedQueue();
    /* renamed from: b */
    public final int f13134b = 3;

    /* renamed from: a */
    public final void mo5731a(int i, cre cre) {
        Iterator it = this.f13133a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo5731a(i, cre);
        }
    }

    /* renamed from: b */
    public final void mo5733b(int i, cre cre) {
        Iterator it = this.f13133a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo5733b(i, cre);
        }
    }

    /* renamed from: a */
    public final void mo5732a(csk csk) {
        Iterator it = this.f13133a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo5732a(csk);
        }
    }

    /* renamed from: a */
    public final void mo5730a() {
        Iterator it = this.f13133a.iterator();
        while (it.hasNext()) {
            ((csj) it.next()).mo5730a();
        }
    }
}
