package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jbg */
public final class jbg {
    /* renamed from: a */
    public final jbj f7998a = jbj.m13001d();
    /* renamed from: b */
    public final Object[] f7999b;
    /* renamed from: c */
    public final jar[] f8000c;
    /* renamed from: d */
    public final AtomicInteger f8001d;
    /* renamed from: e */
    public volatile boolean f8002e = false;

    public jbg(Iterable iterable) {
        int size;
        int i = 0;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            long j = 0;
            while (it.hasNext()) {
                it.next();
                j++;
            }
            size = khx.m4994a(j);
        }
        this.f7999b = new Object[size];
        this.f8000c = new jar[size];
        this.f8001d = new AtomicInteger(size);
        for (jaq a : iterable) {
            a.mo9276a(kpq.f8776a, new jbh(this, i), new jbi(this, i)).mo9282a(izw.f21401a);
            i++;
        }
    }
}
