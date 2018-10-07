package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: fgr */
public final class fgr extends fiw {
    /* renamed from: a */
    public final ReentrantLock f18254a = new ReentrantLock();
    /* renamed from: b */
    public final Condition f18255b = this.f18254a.newCondition();
    /* renamed from: c */
    public long f18256c = -1;
    /* renamed from: d */
    private TreeMap f18257d = new TreeMap();
    /* renamed from: e */
    private long f18258e = -1;
    /* renamed from: f */
    private final Set f18259f = new HashSet();

    /* renamed from: a */
    public final long mo13239a() {
        this.f18254a.lock();
        try {
            long j = this.f18256c;
            return j;
        } finally {
            this.f18254a.unlock();
        }
    }

    /* renamed from: b */
    public final long mo13240b() {
        this.f18254a.lock();
        try {
            long j = this.f18258e;
            return j;
        } finally {
            this.f18254a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo6824a(fhq fhq) {
        super.mo6824a(fhq);
        this.f18254a.lock();
        try {
            long j = fhq.f4792b;
            if (this.f18256c < j) {
                this.f18256c = j;
                this.f18258e = fhq.f4791a;
                this.f18255b.signal();
                while (!this.f18257d.isEmpty() && ((Long) this.f18257d.firstKey()).longValue() >= this.f18256c) {
                    ((Runnable) ((Entry) jri.m13404b(this.f18257d.pollFirstEntry())).getValue()).run();
                }
                Iterator it = this.f18259f.iterator();
                while (it.hasNext()) {
                    it.next();
                    if (this.f18256c % 0 == 0) {
                        Runnable runnable = null;
                        runnable.run();
                    }
                }
            }
            this.f18254a.unlock();
        } catch (Throwable th) {
            this.f18254a.unlock();
        }
    }
}
