package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: gfk */
class gfk implements gfj {
    /* renamed from: a */
    public final AtomicInteger f24338a = new AtomicInteger(0);
    /* renamed from: b */
    public final Object f24339b = new Object();
    /* renamed from: c */
    private final Set f24340c = new HashSet();
    /* renamed from: d */
    private final ggw f24341d;
    /* renamed from: e */
    private final gfh f24342e;
    /* renamed from: f */
    private final kpw f24343f = kpw.m18486d();
    /* renamed from: g */
    private final boolean f24344g;
    /* renamed from: h */
    private int f24345h = C0252go.f5814aM;

    public gfk(gfh gfh, ggw ggw, boolean z) {
        this.f24342e = gfh;
        this.f24341d = ggw;
        this.f24344g = true;
        this.f24345h = C0252go.f5814aM;
    }

    public synchronized void close() {
        boolean z = true;
        synchronized (this) {
            synchronized (this.f24339b) {
                if (!(this.f24345h == C0252go.f5815aN || this.f24345h == C0252go.f5816aO)) {
                    z = false;
                }
                jri.m13405b(z);
                if (this.f24345h == C0252go.f5816aO) {
                } else {
                    this.f24345h = C0252go.f5816aO;
                    if (this.f24338a.decrementAndGet() == 0) {
                        mo14902b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    final void mo14902b() {
        boolean z;
        if (this.f24345h == C0252go.f5816aO) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (this.f24340c.size() > 0) {
            Set a = this.f24342e.mo7107a();
            Object hashSet = new HashSet();
            for (gfw gfw : this.f24340c) {
                iwz iwz = gfw.f5387b;
                if (iwz != null && a.contains(iwz)) {
                    this.f24342e.mo7110a(gfw.f5387b);
                    hashSet.add(gfw);
                }
            }
            this.f24343f.mo15641a(hashSet);
            return;
        }
        this.f24343f.mo15641a(new HashSet());
    }

    /* renamed from: a */
    public kpk mo13340a() {
        kpk kpk;
        boolean z = true;
        synchronized (this.f24339b) {
            if (this.f24345h != C0252go.f5814aM) {
                z = false;
            }
            jri.m13405b(z);
            this.f24338a.set(1);
            this.f24345h = C0252go.f5815aN;
            kpk = this.f24343f;
        }
        return kpk;
    }

    /* renamed from: a */
    public synchronized void mo13341a(gfw gfw, get get) {
        boolean z = true;
        synchronized (this) {
            synchronized (this.f24339b) {
                boolean z2;
                if (this.f24345h == C0252go.f5815aN) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13405b(z2);
                if (this.f24338a.get() <= 0) {
                    z = false;
                }
                jri.m13405b(z);
                this.f24338a.incrementAndGet();
                this.f24340c.add(gfw);
                gfl gfl = new gfl(this);
                try {
                    gfh gfh = this.f24342e;
                    ggw ggw = this.f24341d;
                    gfh.mo7109a(new gha(gfw, ggw.f5416b, ggw.f5415a, ggw.f5417c, get, ggw.f5418d, ggw.f5419e, ggw.f5420f, ggw.f5421g), this.f24344g, kbg.m4804c(gfl));
                } catch (Throwable e) {
                    kqg.f8786a.mo10213b(e);
                    throw new IllegalStateException("Interrupt should NOT happen, because call is non-blocking");
                }
            }
        }
    }
}
