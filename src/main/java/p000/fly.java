package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fly */
final class fly implements flg, ikz {
    /* renamed from: a */
    public final img f26360a = new img(new flz(this));
    /* renamed from: b */
    private final fjs f26361b;
    /* renamed from: c */
    private final int f26362c;
    /* renamed from: d */
    private final int f26363d;
    /* renamed from: e */
    private final Object f26364e = new Object();
    /* renamed from: f */
    private final List f26365f = new ArrayList();
    /* renamed from: g */
    private boolean f26366g;

    fly(fju fju, int i, int i2) {
        this.f26361b = fju.f4820a;
        this.f26362c = i;
        this.f26363d = i2;
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f26364e) {
            this.f26366g = true;
            bbo.addAll(this.f26365f);
            this.f26365f.clear();
        }
        this.f26360a.m2973a();
        bbo.close();
    }

    /* renamed from: a */
    public final List mo14898a() {
        bbo bbo = new bbo();
        List arrayList = new ArrayList();
        synchronized (this.f26364e) {
            for (flb flb : this.f26365f) {
                Object obj;
                iwp iwp = (iwp) iel.m3770a(flb.f24269a);
                if (iwp == null) {
                    obj = null;
                } else if (this.f26361b.mo6836a(iwp)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    bbo.add(flb);
                } else {
                    arrayList.add(flb);
                }
            }
            this.f26365f.clear();
        }
        this.f26360a.m2973a();
        bbo.close();
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo6944e() {
        boolean z = false;
        flb flb = null;
        int i = 1;
        while (!z && i != 0) {
            synchronized (this.f26364e) {
                if (!this.f26365f.isEmpty()) {
                    Collection collection = this.f26365f;
                    ken.m13713a(collection);
                    flb = (flb) collection.remove(0);
                }
                i = this.f26365f.isEmpty() ^ 1;
            }
            if (flb != null) {
                z = flb.mo15533i();
            }
        }
        this.f26360a.m2973a();
        return z;
    }

    /* renamed from: c */
    public final List mo14899c() {
        bbo bbo = new bbo();
        List arrayList = new ArrayList();
        synchronized (this.f26364e) {
            for (flb flb : this.f26365f) {
                Object obj;
                iwp iwp = (iwp) iel.m3770a(flb.f24269a);
                if (iwp == null) {
                    obj = null;
                } else if (this.f26361b.mo6836a(iwp)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    bbo.add(flb);
                } else {
                    arrayList.add(flb.mo15532h());
                }
            }
            this.f26365f.removeAll(bbo);
            int max = Math.max(Math.min(this.f26363d, this.f26365f.size() - 1), 0);
            while (this.f26365f.size() > max) {
                Collection collection = this.f26365f;
                ken.m13713a(collection);
                bbo.add((flb) collection.remove(0));
            }
        }
        this.f26360a.m2973a();
        bbo.close();
        return arrayList;
    }

    /* renamed from: f */
    public final ilp mo6945f() {
        return this.f26360a;
    }

    /* renamed from: t_ */
    public final String mo8597t_() {
        return "SelectiveFrameStore";
    }

    /* renamed from: b */
    public final boolean mo12347b() {
        boolean z;
        synchronized (this.f26364e) {
            z = this.f26366g;
        }
        return z;
    }

    /* renamed from: d */
    final /* synthetic */ Integer mo15534d() {
        Integer valueOf;
        synchronized (this.f26364e) {
            int i = 0;
            for (flb g : this.f26365f) {
                if (g.mo15531g()) {
                    i++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        return valueOf;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        fjj fjj = (fjj) obj;
        bbo bbo = new bbo();
        synchronized (this.f26364e) {
            List list = this.f26365f;
            List arrayList = new ArrayList();
            for (iwz f = fjj.mo13252f(); f != null; f = fjj.mo13252f()) {
                arrayList.add(new iuz(f));
            }
            fjj.mo1896a();
            list.add(new flb(fjj.mo13251e(), fjj.mo13250d(), arrayList));
            for (fjj fjj2 : this.f26365f) {
                if (fjj2.mo13247a() == 0) {
                    bbo.add(fjj2);
                } else {
                    iwp iwp = (iwp) iel.m3770a(fjj2.mo13250d());
                    if (iwp != null && this.f26361b.mo6836a(iwp)) {
                        bbo.add(fjj2);
                    }
                }
            }
            if (this.f26366g) {
                bbo.add(fjj);
            }
            this.f26365f.removeAll(bbo);
            while (this.f26365f.size() > this.f26362c) {
                ken.m13713a(this.f26365f);
                bbo.add((fjj) this.f26365f.remove(0));
            }
        }
        this.f26360a.m2973a();
        bbo.close();
    }
}
