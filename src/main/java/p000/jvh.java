package p000;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvh */
public final class jvh implements juk {
    /* renamed from: a */
    public final List mo9570a(List list) {
        juh juh;
        juh juh2;
        Collection b = khb.m4945b();
        for (juh juh3 : list) {
            if (juh3.mo9562a(jui.ACTION)) {
                juh2 = juh3;
                break;
            }
            b.add(juh3);
        }
        juh2 = null;
        Object b2 = khb.m4945b();
        List b3 = khb.m4945b();
        Object obj = null;
        for (juh juh32 : khb.m4927a(list)) {
            if (juh32.mo9562a(jui.ACTION)) {
                obj = 1;
            }
            if (obj != null) {
                b2.add(juh32);
                if (juh32 == juh2) {
                    break;
                }
            } else {
                b3.add(juh32);
            }
        }
        List b4 = khb.m4945b();
        b4.addAll(b);
        if (!b2.isEmpty()) {
            boolean z;
            jri.m13404b(b2);
            if (b2.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            Collection b5 = khb.m4945b();
            Set e = khb.m4963e();
            int size = b2.size();
            long j = Long.MAX_VALUE;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                juh32 = (juh) b2.get(i);
                if (juh32 != null) {
                    b5.addAll(juh32.f8350a);
                    long j3 = juh32.f8352c;
                    long j4 = juh32.f8353d;
                    if (j3 < j) {
                        j = j3;
                    }
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    for (jui add : juh32.f8351b) {
                        e.add(add);
                    }
                }
                i = i2;
            }
            if (b5.isEmpty()) {
                throw new IllegalArgumentException("No segments found to merge!");
            }
            b4.add(new juh(b5, j, j2, e));
            b4.addAll(khb.m4927a(b3));
        }
        return b4;
    }

    public final String toString() {
        return "ToSingleActionMerger";
    }
}
