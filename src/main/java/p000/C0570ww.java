package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: ww */
public final class C0570ww implements Comparable {
    /* renamed from: a */
    public String f9988a;
    /* renamed from: b */
    public String f9989b;
    /* renamed from: c */
    public C0570ww f9990c;
    /* renamed from: d */
    public List f9991d;
    /* renamed from: e */
    public List f9992e;
    /* renamed from: f */
    public C0782xj f9993f;
    /* renamed from: g */
    public boolean f9994g;
    /* renamed from: h */
    public boolean f9995h;
    /* renamed from: i */
    public boolean f9996i;
    /* renamed from: j */
    public boolean f9997j;

    public C0570ww(String str, C0782xj c0782xj) {
        this(str, null, c0782xj);
    }

    public C0570ww(String str, String str2, C0782xj c0782xj) {
        this.f9991d = null;
        this.f9992e = null;
        this.f9993f = null;
        this.f9988a = str;
        this.f9989b = str2;
        this.f9993f = c0782xj;
    }

    /* renamed from: a */
    public final void mo11493a(int i, C0570ww c0570ww) {
        m6241c(c0570ww.f9988a);
        c0570ww.f9990c = this;
        mo11495b().add(i - 1, c0570ww);
    }

    /* renamed from: a */
    public final void mo11494a(C0570ww c0570ww) {
        m6241c(c0570ww.f9988a);
        c0570ww.f9990c = this;
        mo11495b().add(c0570ww);
    }

    /* renamed from: b */
    public final void mo11498b(C0570ww c0570ww) {
        String str = c0570ww.f9988a;
        if ("[]".equals(str) || mo11497b(str) == null) {
            c0570ww.f9990c = this;
            c0570ww.mo11503d().mo11534a(32, true);
            mo11503d().mo14451b(true);
            if (c0570ww.m6243l()) {
                this.f9993f.mo14449a(true);
                m6242k().add(0, c0570ww);
                return;
            } else if (c0570ww.m6244m()) {
                this.f9993f.mo14454c(true);
                m6242k().add(this.f9993f.mo11535b(64), c0570ww);
                return;
            } else {
                m6242k().add(c0570ww);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("Duplicate '");
        stringBuilder.append(str);
        stringBuilder.append("' qualifier");
        throw new C0554wb(stringBuilder.toString(), 203);
    }

    /* renamed from: c */
    private final void m6241c(String str) {
        if (!"[]".equals(str) && mo11491a(str) != null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
            stringBuilder.append("Duplicate property or field node '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw new C0554wb(stringBuilder.toString(), 203);
        }
    }

    /* renamed from: a */
    protected final void mo11492a() {
        if (this.f9991d.isEmpty()) {
            this.f9991d = null;
        }
    }

    public final Object clone() {
        C0782xj c0782xj;
        try {
            c0782xj = new C0782xj(mo11503d().f10018a);
        } catch (C0554wb e) {
            c0782xj = new C0782xj();
        }
        C0570ww c0570ww = new C0570ww(this.f9988a, this.f9989b, c0782xj);
        try {
            Iterator h = mo11508h();
            while (h.hasNext()) {
                c0570ww.mo11494a((C0570ww) ((C0570ww) h.next()).clone());
            }
            h = mo11509i();
            while (h.hasNext()) {
                c0570ww.mo11498b((C0570ww) ((C0570ww) h.next()).clone());
            }
        } catch (C0554wb e2) {
        }
        return c0570ww;
    }

    public final int compareTo(Object obj) {
        if (mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            return this.f9989b.compareTo(((C0570ww) obj).f9989b);
        }
        return this.f9988a.compareTo(((C0570ww) obj).f9988a);
    }

    /* renamed from: a */
    private static C0570ww m6240a(List list, String str) {
        if (list != null) {
            for (C0570ww c0570ww : list) {
                if (c0570ww.f9988a.equals(str)) {
                    return c0570ww;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C0570ww mo11491a(String str) {
        return C0570ww.m6240a(mo11495b(), str);
    }

    /* renamed from: b */
    public final C0570ww mo11497b(String str) {
        return C0570ww.m6240a(this.f9992e, str);
    }

    /* renamed from: a */
    public final C0570ww mo11490a(int i) {
        return (C0570ww) mo11495b().get(i - 1);
    }

    /* renamed from: b */
    final List mo11495b() {
        if (this.f9991d == null) {
            this.f9991d = new ArrayList(0);
        }
        return this.f9991d;
    }

    /* renamed from: c */
    public final int mo11499c() {
        List list = this.f9991d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: d */
    public final C0782xj mo11503d() {
        if (this.f9993f == null) {
            this.f9993f = new C0782xj();
        }
        return this.f9993f;
    }

    /* renamed from: k */
    private final List m6242k() {
        if (this.f9992e == null) {
            this.f9992e = new ArrayList(0);
        }
        return this.f9992e;
    }

    /* renamed from: b */
    public final C0570ww mo11496b(int i) {
        return (C0570ww) m6242k().get(i - 1);
    }

    /* renamed from: e */
    public final int mo11505e() {
        List list = this.f9992e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public final boolean mo11506f() {
        List list = this.f9991d;
        return list != null && list.size() > 0;
    }

    /* renamed from: g */
    public final boolean mo11507g() {
        List list = this.f9992e;
        return list != null && list.size() > 0;
    }

    /* renamed from: l */
    private final boolean m6243l() {
        return "xml:lang".equals(this.f9988a);
    }

    /* renamed from: m */
    private final boolean m6244m() {
        return "rdf:type".equals(this.f9988a);
    }

    /* renamed from: h */
    public final Iterator mo11508h() {
        if (this.f9991d != null) {
            return mo11495b().iterator();
        }
        return Collections.EMPTY_LIST.listIterator();
    }

    /* renamed from: i */
    public final Iterator mo11509i() {
        if (this.f9992e != null) {
            return new C0571wx(m6242k().iterator());
        }
        return Collections.EMPTY_LIST.iterator();
    }

    /* renamed from: c */
    public final void mo11500c(C0570ww c0570ww) {
        mo11495b().remove(c0570ww);
        mo11492a();
    }

    /* renamed from: d */
    public final void mo11504d(C0570ww c0570ww) {
        C0782xj d = mo11503d();
        if (c0570ww.m6243l()) {
            d.mo14449a(false);
        } else if (c0570ww.m6244m()) {
            d.mo14454c(false);
        }
        m6242k().remove(c0570ww);
        if (this.f9992e.isEmpty()) {
            d.mo14451b(false);
            this.f9992e = null;
        }
    }

    /* renamed from: j */
    public final void mo11510j() {
        int i = 0;
        if (mo11507g()) {
            int length;
            ListIterator listIterator;
            C0570ww[] c0570wwArr = (C0570ww[]) m6242k().toArray(new C0570ww[mo11505e()]);
            int i2 = 0;
            while (true) {
                length = c0570wwArr.length;
                if (length <= i2 || !("xml:lang".equals(c0570wwArr[i2].f9988a) || "rdf:type".equals(c0570wwArr[i2].f9988a))) {
                    Arrays.sort(c0570wwArr, i2, length);
                    listIterator = this.f9992e.listIterator();
                } else {
                    c0570wwArr[i2].mo11510j();
                    i2++;
                }
            }
            Arrays.sort(c0570wwArr, i2, length);
            listIterator = this.f9992e.listIterator();
            while (i < c0570wwArr.length) {
                listIterator.next();
                listIterator.set(c0570wwArr[i]);
                c0570wwArr[i].mo11510j();
                i++;
            }
        }
        if (mo11506f()) {
            if (!mo11503d().mo11535b(512)) {
                Collections.sort(this.f9991d);
            }
            Iterator h = mo11508h();
            while (h.hasNext()) {
                ((C0570ww) h.next()).mo11510j();
            }
        }
    }
}
