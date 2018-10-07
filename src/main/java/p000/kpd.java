package p000;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* renamed from: kpd */
enum kpd implements kpb {
    ;
    
    /* renamed from: b */
    private static final Set f21944b = null;

    static {
        f21944b = new CopyOnWriteArraySet();
    }

    private kpd(String str) {
    }

    /* renamed from: a */
    public final void mo10192a(Class cls) {
        for (WeakReference weakReference : f21944b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        koz.m5091a(cls);
        if (f21944b.size() > 1000) {
            f21944b.clear();
        }
        f21944b.add(new WeakReference(cls));
    }
}
