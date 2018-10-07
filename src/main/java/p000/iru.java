package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: iru */
public final class iru {
    /* renamed from: a */
    public List f7747a;

    public iru(List list) {
        this.f7747a = list;
    }

    /* renamed from: a */
    public static List m4193a(List list, iqf iqf) {
        List b = khb.m4945b();
        for (Object next : list) {
            if (((Boolean) iqf.mo8767a(next)).booleanValue()) {
                b.add(next);
            }
        }
        return !b.isEmpty() ? b : list;
    }
}
