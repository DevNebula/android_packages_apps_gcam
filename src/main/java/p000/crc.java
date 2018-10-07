package p000;

import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: crc */
final class crc implements cre {
    /* renamed from: a */
    public cra f13176a;
    /* renamed from: b */
    public err f13177b;
    /* renamed from: d */
    private final /* synthetic */ crb f13178d;

    public crc(crb crb, err err) {
        this.f13178d = crb;
        this.f13177b = (err) jri.m13404b((Object) err);
    }

    /* renamed from: a */
    public final List mo5686a(int i) {
        int i2 = 0;
        this.f13178d.f2789e.lock();
        try {
            int i3;
            List linkedList = new LinkedList();
            cre c = mo5690c();
            int i4 = i;
            while (i4 > 0) {
                if (c == f2792c) {
                    i3 = 0;
                    break;
                }
                linkedList.addFirst(c);
                c = c.mo5690c();
                i4--;
            }
            i3 = 0;
            while (i3 < i4) {
                linkedList.addFirst(f2792c);
                i3++;
            }
            linkedList.addLast(this);
            c = mo5689b();
            while (i > 0 && c != f2792c) {
                linkedList.addLast(c);
                c = c.mo5689b();
                i--;
            }
            while (i2 < i) {
                linkedList.addLast(f2792c);
                i2++;
            }
            return linkedList;
        } finally {
            this.f13178d.f2789e.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo5688a() {
        return this.f13176a.mo5675c();
    }

    /* renamed from: b */
    public final cre mo5689b() {
        this.f13178d.f2789e.lock();
        crd crd;
        try {
            cre cre;
            if (this.f13176a.mo5673a()) {
                cre = (cre) this.f13176a.mo5677e().mo5680h();
                if (!(crd == null || cre == null)) {
                    crd.mo5685a(cre);
                }
                return cre;
            }
            cre = cre.f2792c;
            this.f13178d.f2789e.unlock();
            crd = this.f13178d.f2786b;
            return cre;
        } finally {
            this.f13178d.f2789e.unlock();
            crd = this.f13178d.f2786b;
        }
    }

    /* renamed from: c */
    public final cre mo5690c() {
        this.f13178d.f2789e.lock();
        crd crd;
        try {
            cre cre;
            if (this.f13176a.mo5674b()) {
                cre = (cre) this.f13176a.mo5678f().mo5680h();
                if (!(crd == null || cre == null)) {
                    crd.mo5685a(cre);
                }
                return cre;
            }
            cre = cre.f2792c;
            this.f13178d.f2789e.unlock();
            crd = this.f13178d.f2786b;
            return cre;
        } finally {
            this.f13178d.f2789e.unlock();
            crd = this.f13178d.f2786b;
        }
    }

    /* renamed from: d */
    public final void mo5691d() {
        this.f13178d.f2790f.lock();
        try {
            err err = ((crc) this.f13176a.mo5680h()).f13177b;
            this.f13176a.mo5679g();
            this.f13178d.f2787c.remove(err.mo6541g().f4384h);
        } finally {
            this.f13178d.f2790f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo5687a(err err) {
        jri.m13404b((Object) err);
        this.f13178d.f2790f.lock();
        try {
            this.f13178d.f2787c.remove(this.f13177b.mo6541g().f4384h);
            this.f13178d.f2787c.put(err.mo6541g().f4384h, this);
            this.f13177b = err;
        } finally {
            this.f13178d.f2790f.unlock();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13177b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("FilmstripItemNode{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public final err mo5692e() {
        return this.f13177b;
    }
}
