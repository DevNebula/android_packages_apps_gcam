package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixi */
public final class ixi implements ixm {
    /* renamed from: a */
    public final NavigableMap f21343a;
    /* renamed from: b */
    public final HashSet f21344b = new HashSet();
    /* renamed from: c */
    private final int f21345c = 8;

    public ixi(iqc iqc) {
        this.f21343a = khb.m4928a(ion.m4007a(new TreeMap(), 8, new ixj(this, iqc)), null);
    }

    /* renamed from: a */
    public final int mo9153a() {
        return this.f21345c;
    }

    /* renamed from: b */
    public final List mo9157b() {
        return khb.m4955c(this.f21343a.values());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo9158c() {
        Entry firstEntry = this.f21343a.firstEntry();
        return firstEntry != null ? (iqo) firstEntry.getValue() : null;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo9159d() {
        Entry lastEntry = this.f21343a.lastEntry();
        return lastEntry != null ? (iqo) lastEntry.getValue() : null;
    }

    /* renamed from: h */
    private final List m12884h() {
        List arrayList = new ArrayList();
        synchronized (this.f21343a) {
            while (!this.f21343a.isEmpty()) {
                arrayList.add((iqo) this.f21343a.pollFirstEntry().getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9161f() {
        Entry pollFirstEntry = this.f21343a.pollFirstEntry();
        return pollFirstEntry != null ? (iqo) pollFirstEntry.getValue() : null;
    }

    /* renamed from: i */
    private final Set m12885i() {
        Set a;
        synchronized (this.f21343a) {
            a = khb.m4933a(this.f21343a.navigableKeySet(), this.f21344b);
        }
        return a;
    }

    /* renamed from: a */
    public final iqo mo13759a(iqc iqc) {
        synchronized (this.f21343a) {
            Set i = m12885i();
            if (i.isEmpty()) {
                return null;
            }
            long longValue = ((Long) iqc.mo8766a(i)).longValue();
            HashSet hashSet = this.f21344b;
            Long valueOf = Long.valueOf(longValue);
            hashSet.add(valueOf);
            iqo iqo = (iqo) this.f21343a.get(valueOf);
            return iqo;
        }
    }

    /* renamed from: a */
    public final boolean mo9156a(int i) {
        return false;
    }

    /* renamed from: g */
    public final int mo9162g() {
        return this.f21343a.size();
    }
}
