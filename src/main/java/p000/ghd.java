package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ghd */
public final class ghd {
    /* renamed from: a */
    public final Object f5428a;
    /* renamed from: b */
    public final LinkedList f5429b;
    /* renamed from: c */
    public final HashMap f5430c;
    /* renamed from: d */
    public final int f5431d;
    /* renamed from: e */
    public int f5432e;

    public ghd(int i) {
        ghe ghe = new ghe();
        this(i, (byte) 0);
    }

    private ghd(int i, byte b) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "maxSize must be > 0.");
        this.f5431d = i;
        this.f5428a = new Object();
        this.f5429b = new LinkedList();
        this.f5430c = new HashMap();
    }

    /* renamed from: a */
    public final Object mo7123a(Object obj) {
        Object remove;
        jri.m13404b(obj);
        synchronized (this.f5428a) {
            if (this.f5429b.removeLastOccurrence(obj)) {
                remove = ((Queue) jri.m13404b((Queue) this.f5430c.get(obj))).remove();
                int i = this.f5432e;
                jri.m13396a(true, (Object) "Size was < 0.");
                this.f5432e = i - 1;
            } else {
                remove = null;
            }
        }
        return remove;
    }
}
