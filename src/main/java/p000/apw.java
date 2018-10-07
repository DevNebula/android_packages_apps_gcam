package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: apw */
public final class apw {
    /* renamed from: a */
    private final List f872a = new ArrayList();
    /* renamed from: b */
    private final Map f873b = new HashMap();

    /* renamed from: a */
    public final synchronized void mo1670a(String str, adq adq, Class cls, Class cls2) {
        m580a(str).add(new apx(cls, cls2, adq));
    }

    /* renamed from: a */
    public final synchronized List mo1669a(Class cls, Class cls2) {
        List arrayList;
        arrayList = new ArrayList();
        for (String str : this.f872a) {
            List<apx> list = (List) this.f873b.get(str);
            if (list != null) {
                for (apx apx : list) {
                    if (apx.mo1673a(cls, cls2)) {
                        arrayList.add(apx.f875b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final synchronized List m580a(String str) {
        List list;
        if (!this.f872a.contains(str)) {
            this.f872a.add(str);
        }
        list = (List) this.f873b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f873b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized List mo1672b(Class cls, Class cls2) {
        List arrayList;
        arrayList = new ArrayList();
        for (String str : this.f872a) {
            List<apx> list = (List) this.f873b.get(str);
            if (list != null) {
                for (apx apx : list) {
                    if (apx.mo1673a(cls, cls2) && !arrayList.contains(apx.f874a)) {
                        arrayList.add(apx.f874a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo1671a(List list) {
        ArrayList arrayList = new ArrayList(this.f872a);
        this.f872a.clear();
        this.f872a.addAll(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = (String) arrayList.get(i);
            if (list.contains(str)) {
                i = i2;
            } else {
                this.f872a.add(str);
                i = i2;
            }
        }
    }
}
