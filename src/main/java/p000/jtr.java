package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jtr */
final class jtr implements jwc {
    /* renamed from: a */
    private final /* synthetic */ jtq f21743a;

    jtr(jtq jtq) {
        this.f21743a = jtq;
    }

    /* renamed from: a */
    public final void mo9575a(long j) {
        synchronized (this.f21743a.f21740c) {
            TreeSet treeSet = this.f21743a.f21738a;
            Long valueOf = Long.valueOf(j);
            treeSet.remove(valueOf);
            if (this.f21743a.f21739b.size() == 20) {
                treeSet = this.f21743a.f21739b;
                treeSet.remove(treeSet.first());
            }
            this.f21743a.f21739b.add(valueOf);
        }
    }

    /* renamed from: b */
    public final void mo9576b(long j) {
        synchronized (this.f21743a.f21740c) {
            TreeSet treeSet = this.f21743a.f21739b;
            Long valueOf = Long.valueOf(j);
            if (!treeSet.contains(valueOf)) {
                this.f21743a.f21738a.add(valueOf);
            }
        }
    }
}
