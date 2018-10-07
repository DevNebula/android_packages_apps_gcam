package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: kgr */
final class kgr extends kgu {
    /* renamed from: a */
    public final /* synthetic */ Set f21903a;
    /* renamed from: b */
    public final /* synthetic */ Set f21904b;

    kgr(Set set, Set set2) {
        this.f21903a = set;
        this.f21904b = set2;
    }

    public final boolean contains(Object obj) {
        return this.f21903a.contains(obj) && !this.f21904b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f21904b.containsAll(this.f21903a);
    }

    /* renamed from: a */
    public final khy iterator() {
        return new kgs(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f21903a) {
            if (!this.f21904b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
