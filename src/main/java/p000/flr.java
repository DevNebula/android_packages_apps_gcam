package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: flr */
final class flr implements fjk {
    /* renamed from: a */
    public final fyt f18418a;
    /* renamed from: b */
    private final List f18419b;
    /* renamed from: c */
    private final ikv f18420c;

    flr(List list, ikv ikv) {
        this.f18419b = ken.m13713a((Collection) list);
        this.f18420c = ikv;
        List arrayList = new ArrayList();
        for (flq flq : list) {
            arrayList.add(flq.f18413b);
        }
        this.f18418a = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo6831a(int i, int i2, fju fju) {
        flq flq;
        ikb ikb = new ikb(this.f18420c);
        bbz.m815a(m10681d(), ikb);
        fyl fly = new fly(fju, i2, (i + i2) / 2);
        ikb.mo8557a(fly);
        fyl fli = new fli(new fxv(), fly, this.f18419b.size());
        ikb.mo8557a(fli);
        for (flq flq2 : this.f18419b) {
            iqo a = flq2.f18413b.mo13311a(fly);
            iqo a2 = flq2.f18413b.mo13311a(fli);
            ikb.mo8557a(a);
            ikb.mo8557a(a2);
        }
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Collection arrayList2 = new ArrayList();
        Iterator it = this.f18419b.iterator();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (!it.hasNext()) {
                return new flx(fly, (fhz) ikb.mo8557a(new fks(new fls(this, fly, i), hashSet, fds.m10427b(arrayList), arrayList2, this.f18418a)), ikb);
            }
            flq2 = (flq) it.next();
            hashSet.add(flq2.f18415d);
            Object flp = new flp(fli.mo13262a(i4));
            ikb.mo8557a(flp);
            arrayList2.add(flp);
            arrayList.add(flq2.f18412a.mo6837a(flp));
            i3 = i4 + 1;
        }
    }

    /* renamed from: a */
    public final fjl mo6830a() {
        int i = 0;
        ikb ikb = new ikb(this.f18420c);
        bbf d = fle.m17682d();
        bbz.m810a(Arrays.asList(new ikb[]{ikb, m10681d()})).mo8557a(d);
        fyd fyd = new fyd(this.f18418a);
        ikb.mo8557a(fyd);
        Object fli = new fli(new fxv(), d, this.f18419b.size());
        ikb.mo8557a(fli);
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Collection arrayList2 = new ArrayList();
        Iterator it = this.f18419b.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new flh((fhz) ikb.mo8557a(new fks(new fla(), hashSet, fds.m10427b(arrayList), arrayList2, fyd)), ikb, d, fyd);
            }
            flq flq = (flq) it.next();
            hashSet.add(flq.f18415d);
            Object flp = new flp(fli.mo13262a(i2));
            ikb.mo8557a(flp);
            arrayList2.add(flp);
            arrayList.add(flq.f18412a.mo6837a(flp));
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public final ilp mo6832b() {
        return this.f18418a.mo6949c();
    }

    /* renamed from: c */
    public final int mo6833c() {
        Iterator it = this.f18419b.iterator();
        int i = LfuScheduler.MAX_PRIORITY;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = Math.min(i2, ((flq) it.next()).f18414c);
        }
    }

    /* renamed from: d */
    private final ikb m10681d() {
        Collection arrayList = new ArrayList(this.f18419b.size());
        for (flq flq : this.f18419b) {
            arrayList.add(flq.f18416e);
        }
        return bbz.m810a(arrayList);
    }
}
