package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jwh */
public final class jwh implements jwa {
    /* renamed from: a */
    private final SortedSet f24886a = new TreeSet();

    /* renamed from: a */
    public final synchronized Set mo13879a() {
        return new HashSet(this.f24886a);
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        this.f24886a.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        this.f24886a.add(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized kbg mo13880b() {
        return kau.f21835a;
    }

    /* renamed from: c */
    public final synchronized void mo13881c() {
        this.f24886a.clear();
    }

    /* renamed from: d */
    public final synchronized long mo13882d() {
        return ((Long) this.f24886a.first()).longValue();
    }
}
