package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: gfa */
public final class gfa implements gfh, gfv {
    /* renamed from: a */
    public static final String f19121a = bli.m887a("ImageBackend");
    /* renamed from: p */
    private static final iqp f19122p = new iqp(512, 384);
    /* renamed from: b */
    public final Map f19123b;
    /* renamed from: c */
    public final Set f19124c;
    /* renamed from: d */
    public int f19125d = 0;
    /* renamed from: e */
    public int f19126e = 0;
    /* renamed from: f */
    public gfo f19127f;
    /* renamed from: g */
    private final ExecutorService f19128g;
    /* renamed from: h */
    private final ExecutorService f19129h;
    /* renamed from: i */
    private final ExecutorService f19130i;
    /* renamed from: j */
    private final ExecutorService f19131j;
    /* renamed from: k */
    private final gev f19132k;
    /* renamed from: l */
    private final Map f19133l;
    /* renamed from: m */
    private final ghf f19134m;
    /* renamed from: n */
    private final ird f19135n;
    /* renamed from: o */
    private final iqp f19136o;
    /* renamed from: q */
    private int f19137q = 0;

    public gfa(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ghf ghf, gev gev, ird ird, int i) {
        this.f19128g = executorService;
        this.f19129h = executorService2;
        this.f19130i = executorService3;
        this.f19131j = executorService4;
        this.f19134m = ghf;
        this.f19127f = new gfo();
        this.f19132k = gev;
        this.f19135n = ird;
        this.f19123b = new HashMap();
        this.f19133l = new HashMap();
        this.f19136o = new iqp(i, i);
        this.f19124c = new HashSet();
    }

    /* renamed from: a */
    public final boolean mo7117a(ggr ggr, ggr ggr2) {
        gfw gfw;
        int i = 0;
        Set<ggr> hashSet = new HashSet(1);
        hashSet.add(ggr2);
        for (ggr ggr3 : hashSet) {
            gfw = ggr3.f5405g;
            boolean z = gfw == ggr.f5405g ? true : gfw == null;
            jri.m13405b(z);
        }
        gfw gfw2 = ggr.f5405g;
        for (ggr ggr32 : hashSet) {
            gfw = ggr32.f5405g;
            if (gfw != null && gfw != gfw2) {
                throw new RuntimeException("ERROR:  Spawned tasks cannot reference new images!");
            } else if (gfw != null) {
                i++;
            }
        }
        gfw2 = ggr.f5405g;
        if (!(gfw2 == null || i == 0)) {
            synchronized (this.f19123b) {
                gfd gfd = (gfd) jri.m13404b((gfd) this.f19123b.get(gfw2.f5387b));
                if (this.f19123b.get(gfw2.f5387b) == null) {
                    throw new RuntimeException("Image Reference has already been released or has never been held.");
                }
                gfd.mo7127a(i);
                this.f19123b.put(gfw2.f5387b, gfd);
                this.f19137q += i;
            }
        }
        m11227a((Set) hashSet, m11225a(ggr, (Set) hashSet));
        return true;
    }

    /* renamed from: a */
    final void mo13337a(ggr ggr) {
        synchronized (this.f19133l) {
            this.f19133l.remove(ggr);
        }
    }

    /* renamed from: a */
    final boolean mo13338a(gfu gfu) {
        synchronized (this.f19133l) {
            if (gfu.f24347a.mo7127a(-1) != 0) {
                return false;
            }
            gfu.f24347a.mo7131c();
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo7110a(iwz iwz) {
        synchronized (this.f19123b) {
            if (this.f19124c.contains(iwz)) {
                this.f19124c.remove(iwz);
                if (this.f19123b.remove(iwz) != null) {
                    this.f19137q--;
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final Set mo7107a() {
        Set unmodifiableSet;
        synchronized (this.f19123b) {
            this.f19124c.retainAll(this.f19123b.keySet());
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(this.f19124c));
        }
        return unmodifiableSet;
    }

    /* renamed from: b */
    public final gfo mo7118b() {
        return this.f19127f;
    }

    /* renamed from: a */
    private final gff m11225a(ggr ggr, Set set) {
        gff gff;
        synchronized (this.f19133l) {
            boolean z;
            gff = (gff) jri.m13404b((gff) this.f19133l.get(ggr));
            if (gff.f5377a != null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13406b(z, (Object) "Task NOT previously registered. ImageShadowTask booking-keeping is incorrect.");
            gff.f5377a.f24347a.mo7127a(set.size());
        }
        return gff;
    }

    /* renamed from: a */
    private final gff m11226a(Set set, get get, Set set2, kbg kbg) {
        ghh ghh = new ghh();
        ghh.mo7130b(set.size());
        gfu gfu = new gfu(ghh, get, kbg);
        synchronized (this.f19133l) {
            for (ggr ggr : set) {
                boolean z;
                if (((gff) this.f19133l.get(ggr)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13406b(z, (Object) "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
            }
        }
        return new gff(gfu, set2);
    }

    /* renamed from: a */
    public final boolean mo7109a(ggr ggr, boolean z, kbg kbg) {
        Set hashSet = new HashSet(1);
        hashSet.add(ggr);
        return m11228a(ggr.f5406h, hashSet, false, z, kbg);
    }

    /* renamed from: a */
    public final boolean mo7108a(gfw gfw, Executor executor, Set set, get get, kbg kbg) {
        kbg c;
        Set hashSet = new HashSet();
        if (set.contains(gfi.COMPRESS_TO_MARKED_JPEG_AND_WRITE_TO_DISK)) {
            ggn ggn = new ggn(gfw, executor, this, get, this.f19135n);
            if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new ghb(gfw, executor, this, get, f19122p, kbg.m4804c(ggn), this.f19135n));
            } else {
                hashSet.add(ggn);
            }
        } else if (set.contains(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK)) {
            ggk ggk = new ggk(gfw, executor, this, get, this.f19134m);
            if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new ghb(gfw, executor, this, get, f19122p, kbg.m4804c(ggk), this.f19135n));
            } else {
                hashSet.add(ggk);
            }
        } else if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
            hashSet.add(new ghb(gfw, executor, this, get, f19122p, kau.f21835a, this.f19135n));
        }
        if (set.contains(gfi.CONVERT_TO_RGB_PREVIEW)) {
            hashSet.add(new ggq(gfw, executor, this, C0252go.f5821aT, get, this.f19136o, C0252go.f5817aP, this.f19135n));
        }
        if (kbg.mo9709b()) {
            c = kbg.m4804c(new gfb(this, (gfn) kbg.mo9706a()));
        } else {
            c = kau.f21835a;
        }
        if (!m11228a(get, hashSet, set.contains(gfi.BLOCK_UNTIL_ALL_TASKS_RELEASE), set.contains(gfi.CLOSE_ON_ALL_TASKS_RELEASE), c)) {
            return false;
        }
        if (kbg.mo9709b()) {
            gfo gfo = this.f19127f;
            gfn gfn = (gfn) kbg.mo9706a();
            iwz iwz = gfw.f5387b;
            synchronized (gfo.f19144a) {
                gfp gfp = new gfp(gfo);
                if (!gfo.f19144a.contains(gfn)) {
                    gfo.f19144a.add(gfn);
                }
                if (iwz == null) {
                    gfo.f19145b.put(gfn, null);
                } else {
                    gfo.f19145b.put(gfn, Long.valueOf(iwz.mo13744f()));
                }
                gfq gfq = new gfq(gfo);
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m11228a(get get, Set set, boolean z, boolean z2, kbg kbg) {
        jri.m13391a((Object) get, (Object) "Need a valid Capture Session to associated with the Processing Task");
        if (set.size() <= 0) {
            return false;
        }
        Map hashMap = new HashMap();
        for (ggr ggr : set) {
            iwz iwz = ((gfw) jri.m13404b(ggr.f5405g)).f5387b;
            Integer num = (Integer) hashMap.get(iwz);
            if (num == null) {
                hashMap.put(iwz, Integer.valueOf(1));
            } else {
                hashMap.put(iwz, Integer.valueOf(num.intValue() + 1));
            }
        }
        gff a = m11226a(set, get, hashMap.keySet(), kbg);
        Set<gfd> hashSet = new HashSet(hashMap.keySet().size());
        for (iwz iwz2 : hashMap.keySet()) {
            hashSet.add(m11224a(iwz2, ((Integer) hashMap.get(iwz2)).intValue(), z, z2));
        }
        this.f19132k.mo7085a(a.f5377a);
        m11227a(set, a);
        for (gfd gfd : hashSet) {
            if (gfd.f19138a) {
                gfd.mo7128a();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7116a(iwz iwz, Executor executor) {
        synchronized (this.f19123b) {
            gfd gfd = (gfd) this.f19123b.get(iwz);
            if (gfd == null || gfd.mo7129b() <= 0) {
                throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
            }
            gfd.mo7127a(-1);
            this.f19137q--;
            int i = this.f19137q;
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Ref release.  Total refs = ");
            stringBuilder.append(i);
            bli.m896d(f19121a, stringBuilder.toString());
            if (gfd.mo7129b() == 0) {
                this.f19123b.remove(iwz);
                this.f19124c.retainAll(this.f19123b.keySet());
                if (gfd.f19139b) {
                    Runnable gfc = new gfc(this, iwz);
                    if (executor == null) {
                        gfc.run();
                    } else {
                        executor.execute(gfc);
                    }
                    bli.m896d(f19121a, "Ref release close.");
                }
                if (gfd.f19138a) {
                    gfd.mo7131c();
                }
            } else {
                this.f19123b.put(iwz, gfd);
            }
        }
    }

    /* renamed from: a */
    private final void m11227a(Set set, gff gff) {
        synchronized (this.f19133l) {
            for (ggr ggr : set) {
                this.f19133l.put(ggr, gff);
                Runnable gfe = new gfe(this, gff, ggr, this.f19135n);
                switch (ggr.f5404f - 1) {
                    case 0:
                        this.f19128g.execute(gfe);
                        break;
                    case 1:
                        this.f19129h.execute(gfe);
                        break;
                    case 2:
                        this.f19130i.execute(gfe);
                        break;
                    default:
                        this.f19131j.execute(gfe);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    private final gfd m11224a(iwz iwz, int i, boolean z, boolean z2) {
        gfd gfd;
        synchronized (this.f19123b) {
            boolean z3;
            if (this.f19123b.get(iwz) == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jri.m13406b(z3, (Object) "Image is already being processed by another task.");
            gfd = new gfd(z, z2);
            gfd.mo7130b(i);
            this.f19123b.put(iwz, gfd);
            this.f19137q += i;
            this.f19125d++;
            int i2 = this.f19125d;
            int i3 = this.f19126e;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("Received an opened image: ");
            stringBuilder.append(i2);
            stringBuilder.append("/");
            stringBuilder.append(i3);
            bli.m896d(f19121a, stringBuilder.toString());
            i2 = this.f19137q;
            StringBuilder stringBuilder2 = new StringBuilder(74);
            stringBuilder2.append("Setting an image reference count of ");
            stringBuilder2.append(i);
            stringBuilder2.append("   Total refs = ");
            stringBuilder2.append(i2);
            bli.m896d(f19121a, stringBuilder2.toString());
        }
        return gfd;
    }

    public final String toString() {
        int size = this.f19133l.size();
        int size2 = this.f19123b.size();
        int i = this.f19137q;
        int a = this.f19127f.mo13342a();
        int b = this.f19127f.mo13343b();
        StringBuilder stringBuilder = new StringBuilder(229);
        stringBuilder.append("ImageBackend Status BEGIN:\nShadow Image Map Size = ");
        stringBuilder.append(size);
        stringBuilder.append("\nImage Semaphore Map Size = ");
        stringBuilder.append(size2);
        stringBuilder.append("\nOutstandingImageRefs = ");
        stringBuilder.append(i);
        stringBuilder.append("\nProxy Listener Map Size = ");
        stringBuilder.append(a);
        stringBuilder.append("\nProxy Listener = ");
        stringBuilder.append(b);
        stringBuilder.append("\nImageBackend Status END:\n");
        return stringBuilder.toString();
    }
}
