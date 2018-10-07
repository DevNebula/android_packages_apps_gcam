package p000;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: kqi */
final class kqi {
    /* renamed from: a */
    private final ConcurrentHashMap f8788a = new ConcurrentHashMap(16, 0.75f, 10);
    /* renamed from: b */
    private final ReferenceQueue f8789b = new ReferenceQueue();

    kqi() {
    }

    /* renamed from: a */
    public final List mo10214a(Throwable th, boolean z) {
        Object poll = this.f8789b.poll();
        while (poll != null) {
            this.f8788a.remove(poll);
            poll = this.f8789b.poll();
        }
        List list = (List) this.f8788a.get(new kqj(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        list = (List) this.f8788a.putIfAbsent(new kqj(th, this.f8789b), vector);
        return list == null ? vector : list;
    }
}
