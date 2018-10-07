package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: flv */
final class flv implements fjk {
    /* renamed from: a */
    private final List f18435a;
    /* renamed from: b */
    private final ikv f18436b;
    /* renamed from: c */
    private final fyt f18437c;

    flv(List list, ikv ikv) {
        this.f18435a = ken.m13713a((Collection) list);
        this.f18436b = ikv;
        List arrayList = new ArrayList();
        for (flu flu : list) {
            arrayList.add(flu.f18429b);
        }
        this.f18437c = new fxy(arrayList);
    }

    /* renamed from: a */
    public final fjn mo6831a(int i, int i2, fju fju) {
        flu flu;
        iqo ikb = new ikb(this.f18436b);
        fyl fly = new fly(fju, i2, (i + i2) / 2);
        ikb.mo8557a(fly);
        fyl fli = new fli(this.f18437c, fly, this.f18435a.size());
        ikb.mo8557a(fli);
        for (flu flu2 : this.f18435a) {
            iqo a = flu2.f18429b.mo13311a(fly);
            iqo a2 = flu2.f18429b.mo13311a(fli);
            ikb.mo8557a(a);
            ikb.mo8557a(a2);
        }
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Iterator it = this.f18435a.iterator();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (!it.hasNext()) {
                return new flx(fly, fib.m2350a(hashSet, fds.m10427b(arrayList)), ikb);
            }
            flu2 = (flu) it.next();
            hashSet.add(flu2.f18431d);
            arrayList.add(flu2.f18428a.mo6837a(fli.mo13262a(i4)));
            i3 = i4 + 1;
        }
    }

    /* renamed from: a */
    public final fjl mo6830a() {
        flu flu;
        ikb ikb = new ikb(this.f18436b);
        for (flu flu2 : this.f18435a) {
            iqo b = flu2.f18432e.mo8558b();
            b.mo8557a(ikb);
            ikb.mo8557a(b);
        }
        bbf d = fle.m17682d();
        ikb.mo8557a(d);
        fyd fyd = new fyd(this.f18437c);
        ikb.mo8557a(fyd);
        Object fli = new fli(fyd, d, this.f18435a.size());
        ikb.mo8557a(fli);
        Collection arrayList = new ArrayList();
        Set hashSet = new HashSet();
        Iterator it = this.f18435a.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new flh(fib.m2350a(hashSet, fds.m10427b(arrayList)), ikb, d, fyd);
            }
            flu2 = (flu) it.next();
            hashSet.add(flu2.f18431d);
            arrayList.add(flu2.f18428a.mo6837a(fli.mo13262a(i2)));
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public final ilp mo6832b() {
        return this.f18437c.mo6949c();
    }

    /* renamed from: c */
    public final int mo6833c() {
        Iterator it = this.f18435a.iterator();
        int i = LfuScheduler.MAX_PRIORITY;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = Math.min(i2, ((flu) it.next()).f18430c);
        }
    }
}
