package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jvz */
public final class jvz implements jwa {
    /* renamed from: a */
    private final float f24873a;
    /* renamed from: b */
    private final int f24874b;
    /* renamed from: c */
    private final jwa f24875c;
    /* renamed from: d */
    private final Set f24876d = new HashSet();
    /* renamed from: e */
    private Long f24877e = Long.valueOf(-1);
    /* renamed from: f */
    private final SortedSet f24878f = new TreeSet();
    /* renamed from: g */
    private final int f24879g;

    public jvz(jwa jwa) {
        jri.m13395a(true);
        jri.m13395a(true);
        this.f24875c = jwa;
        this.f24873a = 10.0f;
        this.f24879g = 2;
        this.f24874b = Math.round(1.0E9f / this.f24873a);
    }

    /* renamed from: a */
    public final synchronized Set mo13879a() {
        return this.f24875c.mo13879a();
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        this.f24876d.remove(Long.valueOf(j));
        this.f24875c.mo9575a(j);
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        if (this.f24877e.longValue() < 0) {
            this.f24877e = Long.valueOf(j);
        }
        if (j > this.f24877e.longValue() - 16666666) {
            this.f24876d.add(Long.valueOf(j));
            this.f24877e = Long.valueOf(this.f24877e.longValue() + ((long) this.f24874b));
        }
        this.f24875c.mo9576b(j);
    }

    /* renamed from: b */
    public final synchronized kbg mo13880b() {
        kbg kbg;
        if (this.f24878f.isEmpty()) {
            kbg = kau.f21835a;
        } else {
            long longValue = ((Long) this.f24878f.first()).longValue();
            SortedSet sortedSet = this.f24878f;
            Long valueOf = Long.valueOf(longValue);
            sortedSet.remove(valueOf);
            kbg = kbg.m4804c(valueOf);
        }
        return kbg;
    }

    /* renamed from: c */
    public final synchronized void mo13881c() {
        this.f24878f.clear();
        this.f24875c.mo13881c();
    }

    /* renamed from: d */
    public final synchronized long mo13882d() {
        long d;
        d = this.f24875c.mo13882d();
        while (this.f24878f.size() < this.f24879g) {
            Set set = this.f24876d;
            Long valueOf = Long.valueOf(d);
            if (!set.contains(valueOf) || mo13879a().size() <= 8) {
                break;
            }
            this.f24875c.mo9575a(d);
            this.f24876d.remove(valueOf);
            this.f24878f.add(valueOf);
            d = this.f24875c.mo13882d();
        }
        return d;
    }
}
