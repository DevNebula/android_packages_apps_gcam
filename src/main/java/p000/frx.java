package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: frx */
final class frx implements kaw {
    /* renamed from: a */
    private final /* synthetic */ List f18744a;

    frx(List list) {
        this.f18744a = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        boolean z;
        boolean z2 = true;
        Iterable iterable = (Set) obj;
        jri.m13404b((Object) iterable);
        if (iterable.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        gfw gfw = (gfw) khb.m4921a(iterable, 0);
        long f = gfw.f5387b.mo13744f();
        gfw.f5387b.close();
        List arrayList = new ArrayList();
        for (iwz f2 : this.f18744a) {
            arrayList.add(Long.valueOf(f2.mo13744f()));
        }
        int indexOf = arrayList.indexOf(Long.valueOf(f));
        if (indexOf < 0) {
            z2 = false;
        }
        jri.m13405b(z2);
        return Integer.valueOf(indexOf);
    }
}
