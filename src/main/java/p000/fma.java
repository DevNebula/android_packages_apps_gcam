package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fma */
final class fma extends flc {
    /* renamed from: a */
    private final fjj f26367a;

    private fma(fjj fjj) {
        this.f26367a = fjj;
    }

    /* renamed from: a */
    static fjj m17700a(fjj fjj, fyr fyr) {
        List arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(fjj.mo13247a());
        iwz f = fjj.mo13252f();
        while (f != null) {
            arrayList.add(new fmb(f, atomicInteger, fyr));
            f = fjj.mo13252f();
        }
        if (atomicInteger.get() == 0) {
            fyr.close();
        }
        fjj.mo1896a();
        return new fma(new fld(fjj.mo13251e(), fjj.mo13250d(), arrayList));
    }

    /* renamed from: b */
    static fjj m17701b(fjj fjj, fyr fyr) {
        List arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(fjj.mo13247a());
        LinkedList b = fjj.mo13248b();
        synchronized (fjj.mo13249c()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(new fmc((iwz) it.next(), atomicInteger, fyr));
            }
        }
        if (atomicInteger.get() == 0) {
            fyr.close();
        }
        return new fma(new fld(fjj.mo13251e(), fjj.mo13250d(), arrayList));
    }

    /* renamed from: g */
    protected final fjj mo14897g() {
        return this.f26367a;
    }

    /* renamed from: c */
    public final Object mo13249c() {
        return this.f26367a.mo13249c();
    }
}
