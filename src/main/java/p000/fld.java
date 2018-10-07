package p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fld */
public class fld implements fjj {
    /* renamed from: a */
    public final kpk f24269a;
    /* renamed from: b */
    public final Object f24270b;
    /* renamed from: c */
    private final long f24271c;
    /* renamed from: d */
    private final LinkedList f24272d;

    public fld(long j, kpk kpk, List list) {
        for (iwz f : list) {
            boolean z;
            if (f.mo13744f() == j) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
        }
        this.f24270b = new Object();
        this.f24271c = j;
        this.f24269a = kpk;
        this.f24272d = new LinkedList(list);
    }

    public synchronized void close() {
        synchronized (this.f24270b) {
            Iterator it = this.f24272d.iterator();
            while (it.hasNext()) {
                ((iwz) it.next()).close();
            }
            this.f24272d.clear();
        }
    }

    /* renamed from: a */
    public final synchronized int mo13247a() {
        int size;
        synchronized (this.f24270b) {
            size = this.f24272d.size();
        }
        return size;
    }

    /* renamed from: b */
    public final synchronized LinkedList mo13248b() {
        LinkedList linkedList;
        synchronized (this.f24270b) {
            linkedList = this.f24272d;
        }
        return linkedList;
    }

    /* renamed from: c */
    public final Object mo13249c() {
        return this.f24270b;
    }

    /* renamed from: d */
    public final kpk mo13250d() {
        return this.f24269a;
    }

    /* renamed from: e */
    public final synchronized long mo13251e() {
        return this.f24271c;
    }

    /* renamed from: f */
    public final synchronized iwz mo13252f() {
        iwz iwz;
        synchronized (this.f24270b) {
            iwz = (iwz) this.f24272d.pollFirst();
        }
        return iwz;
    }
}
