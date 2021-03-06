package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: akc */
public final class akc {
    /* renamed from: a */
    private final akh f509a;
    /* renamed from: b */
    private final akd f510b;

    public akc(C0300iw c0300iw) {
        this(new akh(c0300iw));
    }

    private akc(akh akh) {
        this.f510b = new akd();
        this.f509a = akh;
    }

    /* renamed from: a */
    public final synchronized void mo348a(Class cls, Class cls2, akb akb) {
        this.f509a.mo351a(cls, cls2, akb);
        this.f510b.f511a.clear();
    }

    /* renamed from: a */
    public final synchronized List mo346a(Class cls) {
        return this.f509a.mo352b(cls);
    }

    /* renamed from: a */
    public final synchronized List mo347a(Object obj) {
        List arrayList;
        List list;
        List unmodifiableList;
        Class cls = obj.getClass();
        ake ake = (ake) this.f510b.f511a.get(cls);
        if (ake != null) {
            list = ake.f512a;
        } else {
            list = null;
        }
        if (list == null) {
            unmodifiableList = Collections.unmodifiableList(this.f509a.mo350a(cls));
            if (((ake) this.f510b.f511a.put(cls, new ake(unmodifiableList))) != null) {
                String valueOf = String.valueOf(cls);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Already cached loaders for model: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        unmodifiableList = list;
        int size = unmodifiableList.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            ajz ajz = (ajz) unmodifiableList.get(i);
            if (ajz.mo344a(obj)) {
                arrayList.add(ajz);
            }
        }
        return arrayList;
    }
}
