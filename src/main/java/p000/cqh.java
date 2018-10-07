package p000;

import java.util.Comparator;
import java.util.Date;

/* compiled from: PG */
/* renamed from: cqh */
public final class cqh implements Comparator {
    /* renamed from: a */
    private final Date f2767a;

    public cqh(Date date) {
        jri.m13404b((Object) date);
        this.f2767a = new Date(date.getTime() + 86400000);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Date date;
        Date date2;
        err err = (err) obj2;
        eru g = ((err) obj).mo6541g();
        eru g2 = err.mo6541g();
        if (m1455a(g.f4381e)) {
            date = g.f4382f;
        } else {
            date = g.f4381e;
        }
        if (m1455a(g2.f4381e)) {
            date2 = g2.f4382f;
        } else {
            date2 = g2.f4381e;
        }
        int i = -date.compareTo(date2);
        if (i == 0) {
            i = -g.f4382f.compareTo(g2.f4382f);
        }
        if (i != 0) {
            return i;
        }
        return g.f4379c.compareTo(g2.f4379c);
    }

    /* renamed from: a */
    private final boolean m1455a(Date date) {
        return this.f2767a.compareTo(date) < 0;
    }
}
