package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: cko */
final class cko implements iqo {
    /* renamed from: a */
    private static final String f12656a = bli.m887a("LegacyRingBuffer");
    /* renamed from: b */
    private int f12657b;
    /* renamed from: c */
    private boolean f12658c;
    /* renamed from: d */
    private final AtomicInteger f12659d = new AtomicInteger(0);
    /* renamed from: e */
    private final kpk f12660e;
    /* renamed from: f */
    private final C0291in f12661f = new C0291in();
    /* renamed from: g */
    private final ckj f12662g;
    /* renamed from: h */
    private final List f12663h = new ArrayList();
    /* renamed from: i */
    private final jmr f12664i;
    /* renamed from: j */
    private final C0556wd f12665j;
    /* renamed from: k */
    private jwa f12666k = null;

    public cko(int i, kpk kpk, ckj ckj, jmr jmr, UUID uuid) {
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) ckj);
        jri.m13404b((Object) jmr);
        this.f12657b = i;
        this.f12660e = kpk;
        this.f12662g = ckj;
        this.f12664i = jmr;
        this.f12665j = bbz.m813a(uuid, false, bve.BURSTS.mo2167d(), true);
        this.f12658c = false;
        String str = f12656a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Created with capacity ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: b */
    private final synchronized void m8402b(fkp fkp) {
        this.f12661f.mo8627a(fkp.mo13744f(), new ckq(fkp, this.f12659d));
    }

    public final synchronized void close() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f12661f.mo8631c()) {
                ((ckq) this.f12661f.mo8628b(i2)).close();
                i = i2 + 1;
            } else {
                this.f12661f.mo8625a();
                this.f12663h.clear();
                this.f12662g.close();
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m8400a(ckq ckq, ckk ckk) {
        long f = ckq.mo13744f();
        int g = ckq.mo13745g();
        int d = ckq.mo13742d();
        iwz iwz = (iwz) ckk.f2291a.getAndSet(ckq);
        if (iwz != null) {
            iwz.close();
            throw new IllegalArgumentException("Old image was not null");
        }
        if (ckk.f2292b.getAndSet(this.f12665j) != null) {
            throw new IllegalArgumentException("Attempting to set multiple XMP metadata!");
        }
        this.f12663h.add(new chs(f, this.f12662g.mo12507a(ckk), g, d));
    }

    /* renamed from: f */
    private final synchronized jwa m8403f() {
        if (this.f12666k == null) {
            this.f12666k = (jwa) kow.m13881c(this.f12660e);
        }
        return this.f12666k;
    }

    /* renamed from: a */
    public final synchronized jrg mo12510a() {
        jrj jrj;
        m8404g();
        while (this.f12666k.mo13879a().size() > 8) {
            long d = this.f12666k.mo13882d();
            if (this.f12666k.mo13879a().size() > 8) {
                m8399a(d);
                this.f12666k.mo9575a(d);
            }
            m8404g();
        }
        Set a = this.f12666k.mo13879a();
        jrj = new jrj();
        this.f12658c = true;
        for (int i = 0; i < this.f12661f.mo8631c(); i++) {
            long a2 = this.f12661f.mo8624a(i);
            ckq ckq = (ckq) this.f12661f.mo8628b(i);
            if (a.contains(Long.valueOf(a2))) {
                jrj.mo9538a(a2, new ckn(ckq.f26619a), false);
            } else {
                ckq.close();
            }
        }
        for (chs chs : this.f12663h) {
            boolean z;
            if (this.f12664i != jmr.HYBRID_BURST) {
                z = false;
            } else if (a.contains(Long.valueOf(chs.f2179a))) {
                z = false;
            } else {
                z = true;
            }
            jrj.mo9538a(chs.f2179a, new ckn(chs), z);
        }
        this.f12661f.mo8625a();
        this.f12663h.clear();
        return jrj.mo9536a();
    }

    /* renamed from: b */
    public final synchronized void mo12512b() {
        this.f12657b++;
        String str = f12656a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("increased capacity by ");
        stringBuilder.append(1);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final synchronized void mo12511a(fkp fkp) {
        long f = fkp.mo13744f();
        if (this.f12661f.mo8629b(f) != null) {
            fkp.close();
        } else if (this.f12658c) {
            bli.m891b(f12656a, "Ring buffer is locked, cannot add image");
            fkp.close();
        } else if (this.f12659d.get() >= this.f12657b) {
            bli.m891b(f12656a, "Ring buffer is full, cannot add image");
            fkp.close();
        } else {
            m8402b(fkp);
            m8403f().mo9576b(f);
            m8404g();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo12513c() {
        this.f12658c = true;
        if (this.f12659d.get() < this.f12657b) {
            this.f12658c = false;
        }
        return this.f12658c;
    }

    /* renamed from: a */
    private final synchronized void m8399a(long j) {
        ckq b = m8401b(j);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    private final synchronized ckq m8401b(long j) {
        ckq ckq;
        ckq = (ckq) this.f12661f.mo8629b(j);
        if (ckq != null) {
            this.f12661f.mo8626a(j);
        } else {
            String str = f12656a;
            StringBuilder stringBuilder = new StringBuilder(80);
            stringBuilder.append("Could not remove image with timestamp ");
            stringBuilder.append(j);
            stringBuilder.append(": image does not exist");
            bli.m891b(str, stringBuilder.toString());
            bli.m888a(f12656a, "Available timestamps are: ");
            for (int i = 0; i < this.f12661f.mo8631c(); i++) {
                String str2 = f12656a;
                long a = this.f12661f.mo8624a(i);
                StringBuilder stringBuilder2 = new StringBuilder(24);
                stringBuilder2.append(GraphFactorySource.INDENT);
                stringBuilder2.append(a);
                bli.m888a(str2, stringBuilder2.toString());
            }
        }
        return ckq;
    }

    /* renamed from: d */
    public final synchronized int mo12514d() {
        return this.f12659d.get();
    }

    /* renamed from: g */
    private final synchronized void m8404g() {
        while (true) {
            kbg a = this.f12662g.mo12506a();
            if (!a.mo9709b()) {
                break;
            }
            ckk ckk = (ckk) a.mo9706a();
            kbg b = m8403f().mo13880b();
            if (!b.mo9709b()) {
                this.f12662g.mo12508b(ckk);
                break;
            }
            ckq b2 = m8401b(((Long) b.mo9706a()).longValue());
            if (b2 != null) {
                try {
                    m8400a(b2, ckk);
                } catch (Throwable th) {
                    if (b2 != null) {
                        b2.close();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    final synchronized void mo12515e() {
        try {
            if (this.f12658c) {
                bli.m898e(f12656a, "Trying to free up a slot when the ring buffer is already done");
            } else if (this.f12659d.get() >= this.f12657b) {
                long d = this.f12666k.mo13882d();
                m8399a(d);
                this.f12666k.mo9575a(d);
            }
        } catch (Throwable e) {
            bli.m892b(f12656a, "Error when freeing a slot", e);
        }
        return;
    }
}
