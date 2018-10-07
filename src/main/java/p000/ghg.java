package p000;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ghg */
public final class ghg implements iqo {
    /* renamed from: a */
    private final Object f19173a = new Object();
    /* renamed from: b */
    private final ghf f19174b;
    /* renamed from: c */
    private Object f19175c;
    /* renamed from: d */
    private Object f19176d;

    public ghg(ghf ghf, Object obj, Object obj2) {
        this.f19174b = ghf;
        this.f19175c = obj;
        this.f19176d = obj2;
    }

    public final void close() {
        synchronized (this.f19173a) {
            Object obj = this.f19176d;
            if (obj != null) {
                ghf ghf = this.f19174b;
                Object obj2 = this.f19175c;
                synchronized (ghf.f5434b) {
                    ghd ghd = ghf.f5433a;
                    Object b = ghf.mo7125b(obj);
                    jri.m13404b(obj2);
                    jri.m13404b(b);
                    synchronized (ghd.f5428a) {
                        Queue queue;
                        ghd.f5429b.push(obj2);
                        if (ghd.f5430c.containsKey(obj2)) {
                            queue = (Queue) ghd.f5430c.get(obj2);
                        } else {
                            queue = new LinkedList();
                            ghd.f5430c.put(obj2, queue);
                        }
                        queue.add(b);
                        int i = ghd.f5432e;
                        jri.m13396a(true, (Object) "Size was < 0.");
                        ghd.f5432e = i + 1;
                        int i2 = ghd.f5431d;
                        while (ghd.f5432e > i2 && !ghd.f5429b.isEmpty()) {
                            obj2 = ghd.f5429b.removeLast();
                            if (obj2 != null) {
                                queue = (Queue) jri.m13404b((Queue) ghd.f5430c.get(obj2));
                                queue.remove();
                                if (queue.size() <= 0) {
                                    ghd.f5430c.remove(obj2);
                                }
                                i = ghd.f5432e;
                                jri.m13396a(true, (Object) "Size was < 0.");
                                ghd.f5432e = i - 1;
                            }
                        }
                        if (ghd.f5432e < 0 || (ghd.f5429b.isEmpty() && ghd.f5432e != 0)) {
                            throw new IllegalStateException("LruPool.sizeOf() is reporting inconsistent results!");
                        }
                    }
                }
                this.f19176d = null;
                this.f19175c = null;
            }
        }
    }

    /* renamed from: a */
    public final Object mo13354a() {
        Object obj;
        synchronized (this.f19173a) {
            obj = this.f19176d;
        }
        return obj;
    }
}
