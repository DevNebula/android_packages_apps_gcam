package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: csx */
public final class csx {
    /* renamed from: a */
    private static final String f2877a = bli.m887a("FSViewNodeUpdater");
    /* renamed from: b */
    private static int f2878b = -1;

    /* renamed from: a */
    public static csy m1538a(List list, cre cre) {
        boolean z;
        cre cre2;
        int i = 0;
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Input list must be odd in size!");
        int size = (list.size() - 1) / 2;
        int size2 = list.size();
        cre cre3 = (cre) list.get(size);
        if (cre3.mo5688a()) {
            while (cre3.mo5688a() && cre3.mo5689b() != cre.f2792c) {
                cre3 = cre3.mo5689b();
            }
            if (cre3.mo5688a()) {
                while (cre3.mo5688a() && cre3.mo5690c() != cre.f2792c) {
                    cre3 = cre3.mo5690c();
                }
                cre2 = cre3.mo5688a() ? null : cre3;
            } else {
                cre2 = cre3;
            }
        } else {
            cre2 = cre3;
        }
        List nCopies;
        List nCopies2;
        List arrayList;
        if (cre2 == null) {
            bli.m894c(f2877a, "There are no remaining valid nodes. Returning empty response.");
            nCopies = Collections.nCopies(size2, cre.f2792c);
            nCopies2 = Collections.nCopies(size2, Integer.valueOf(-1));
            arrayList = new ArrayList();
            for (cre cre32 : list) {
                if (cre32 != cre.f2792c) {
                    arrayList.add(cre32);
                }
            }
            return new csy(nCopies, nCopies2);
        }
        cre32 = cre2.mo5690c();
        cre b = cre2.mo5689b();
        if (cre == null || cre32 == cre.f2792c || cre32.mo5692e() != cre.mo5692e()) {
            cre32 = cre != null ? b != cre.f2792c ? b.mo5692e() == cre.mo5692e() ? b : cre2 : cre2 : cre2;
        }
        nCopies2 = cre32.mo5686a(size);
        arrayList = new ArrayList(Collections.nCopies(size2, Integer.valueOf(f2878b)));
        while (i < size2) {
            cre32 = (cre) nCopies2.get(i);
            if (cre32 != cre.f2792c && list.contains(cre32)) {
                arrayList.set(i, Integer.valueOf(list.indexOf(cre32)));
            }
            i++;
        }
        nCopies = new ArrayList();
        for (cre cre322 : list) {
            if (cre322 != cre.f2792c && cre322.mo5688a()) {
                nCopies.add(cre322);
            }
        }
        return new csy(nCopies2, arrayList);
    }
}
