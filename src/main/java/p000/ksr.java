package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ksr */
final class ksr extends ksq {
    /* renamed from: c */
    private static final Class f21976c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    ksr() {
    }

    /* renamed from: c */
    private static List m14142c(Object obj, long j) {
        return (List) kul.m5401j(obj, j);
    }

    /* renamed from: a */
    final void mo10295a(Object obj, long j) {
        Object e;
        List list = (List) kul.m5401j(obj, j);
        if (list instanceof ksp) {
            e = ((ksp) list).mo10294e();
        } else if (!f21976c.isAssignableFrom(list.getClass())) {
            e = Collections.unmodifiableList(list);
        } else {
            return;
        }
        kul.m5381a(obj, j, e);
    }

    /* renamed from: a */
    final void mo10296a(Object obj, Object obj2, long j) {
        Collection c = ksr.m14142c(obj2, j);
        Object a = ksr.m14141a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size <= 0) {
            Collection a2 = c;
        }
        kul.m5381a(obj, j, a2);
    }

    /* renamed from: b */
    final List mo10297b(Object obj, long j) {
        return ksr.m14141a(obj, j, 10);
    }

    /* renamed from: a */
    private static List m14141a(Object obj, long j, int i) {
        List c = ksr.m14142c(obj, j);
        List arrayList;
        if (c.isEmpty()) {
            Object kso;
            if (c instanceof ksp) {
                kso = new kso(i);
            } else {
                kso = new ArrayList(i);
            }
            kul.m5381a(obj, j, kso);
            return kso;
        } else if (f21976c.isAssignableFrom(c.getClass())) {
            arrayList = new ArrayList(c.size() + i);
            arrayList.addAll(c);
            kul.m5381a(obj, j, (Object) arrayList);
            return arrayList;
        } else if (!(c instanceof kui)) {
            return c;
        } else {
            arrayList = new kso(c.size() + i);
            arrayList.addAll((kui) c);
            kul.m5381a(obj, j, (Object) arrayList);
            return arrayList;
        }
    }
}
