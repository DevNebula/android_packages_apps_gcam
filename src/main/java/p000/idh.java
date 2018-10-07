package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: idh */
final class idh extends idl {
    /* renamed from: a */
    private final ArrayList f20952a;
    /* renamed from: b */
    private final /* synthetic */ idb f20953b;

    public idh(idb idb, ArrayList arrayList) {
        this.f20953b = idb;
        super(idb);
        this.f20952a = arrayList;
    }

    /* renamed from: a */
    public final void mo8371a() {
        Set set;
        idb idb = this.f20953b;
        idn idn = idb.f20923a.f24610m;
        hvx hvx = idb.f20932j;
        if (hvx != null) {
            Set hashSet = new HashSet(hvx.f7112b);
            Map map = idb.f20932j.f7114d;
            for (huh huh : map.keySet()) {
                if (!idb.f20923a.f24604g.containsKey(huh.mo8131b())) {
                    map.get(huh);
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        } else {
            set = Collections.emptySet();
        }
        idn.f20962f = set;
        ArrayList arrayList = this.f20952a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            huo huo = (huo) obj;
            idb idb2 = this.f20953b;
            huo.mo13574a(idb2.f20929g, idb2.f20923a.f24610m.f20962f);
        }
    }
}
