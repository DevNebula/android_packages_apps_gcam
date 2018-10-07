package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilk */
final class ilk implements ilp {
    /* renamed from: a */
    public final List f24633a;

    ilk(Collection collection) {
        this.f24633a = ken.m13713a(collection);
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        if (this.f24633a.isEmpty()) {
            executor.execute(new ill(iqt));
            return new iql();
        }
        ilm ilm = new ilm(this, iqt, executor);
        ikb ikb = new ikb();
        Executor imk = new imk();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f24633a.size()) {
                return ikb;
            }
            ikb.mo8557a(((ilp) this.f24633a.get(i2)).mo13672a(new iln(ilm, i2), imk));
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13673b() {
        List arrayList = new ArrayList();
        for (ilp b : this.f24633a) {
            arrayList.add(b.mo13673b());
        }
        return arrayList;
    }
}
