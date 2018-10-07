package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: kss */
final class kss extends ksq {
    kss() {
    }

    /* renamed from: c */
    private static ksg m14146c(Object obj, long j) {
        return (ksg) kul.m5401j(obj, j);
    }

    /* renamed from: a */
    final void mo10295a(Object obj, long j) {
        kss.m14146c(obj, j).mo10281c();
    }

    /* renamed from: a */
    final void mo10296a(Object obj, Object obj2, long j) {
        Object c = kss.m14146c(obj, j);
        Collection c2 = kss.m14146c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo10280b()) {
                c = c.mo10279a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size <= 0) {
            c = c2;
        }
        kul.m5381a(obj, j, c);
    }

    /* renamed from: b */
    final List mo10297b(Object obj, long j) {
        ksg c = kss.m14146c(obj, j);
        if (c.mo10280b()) {
            return c;
        }
        int size = c.size();
        if (size != 0) {
            size += size;
        } else {
            size = 10;
        }
        Object a = c.mo10279a(size);
        kul.m5381a(obj, j, a);
        return a;
    }
}
