package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ky */
public final class C0344ky {
    /* renamed from: a */
    public final C0300iw f9107a = new C0694ix(10);
    /* renamed from: b */
    public final C0301iz f9108b = new C0301iz();
    /* renamed from: c */
    public final ArrayList f9109c = new ArrayList();
    /* renamed from: d */
    public final HashSet f9110d = new HashSet();

    /* renamed from: a */
    public final void mo10568a(Object obj) {
        if (!this.f9108b.containsKey(obj)) {
            this.f9108b.put(obj, null);
        }
    }

    /* renamed from: a */
    public final void mo10569a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f9108b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    mo10569a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
        }
    }
}
