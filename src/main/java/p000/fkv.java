package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fkv */
public final class fkv implements fjm {
    /* renamed from: a */
    public final fyt f18385a;
    /* renamed from: b */
    private final fjm f18386b;

    public fkv(fjm fjm, fyt fyt) {
        this.f18386b = fjm;
        this.f18385a = new fxy(ken.m13709a((Object) fyt, new fxr(fjm.mo6834a())));
    }

    /* renamed from: a */
    public final fjk mo6835a(fjm... fjmArr) {
        Collection arrayList = new ArrayList();
        for (fjm fjm : fjmArr) {
            jri.m13395a(fjm instanceof fkv);
            arrayList.add((fkv) fjm);
        }
        List arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            arrayList2.add(((fkv) arrayList.get(i)).f18386b);
            i = i2;
        }
        fjk a = this.f18386b.mo6835a((fjm[]) arrayList2.toArray(new fjm[arrayList2.size()]));
        arrayList.add(this);
        return new fkw(keu.m13732a(arrayList), a);
    }

    /* renamed from: a */
    public final int mo6834a() {
        return this.f18386b.mo6834a();
    }
}
