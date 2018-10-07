package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: wr */
public class C0568wr implements Iterator {
    /* renamed from: a */
    public C0784xn f9978a = null;
    /* renamed from: b */
    private int f9979b = 0;
    /* renamed from: c */
    private C0570ww f9980c;
    /* renamed from: d */
    private String f9981d;
    /* renamed from: e */
    private Iterator f9982e = null;
    /* renamed from: f */
    private int f9983f = 0;
    /* renamed from: g */
    private Iterator f9984g = Collections.EMPTY_LIST.iterator();
    /* renamed from: h */
    private final /* synthetic */ C0555wc f9985h;

    public C0568wr(C0555wc c0555wc) {
        this.f9985h = c0555wc;
    }

    public C0568wr(C0555wc c0555wc, C0570ww c0570ww, String str, int i) {
        this.f9985h = c0555wc;
        this.f9980c = c0570ww;
        this.f9979b = 0;
        if (c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            c0555wc.f9953b = c0570ww.f9988a;
        }
        this.f9981d = mo11486a(c0570ww, str, i);
    }

    /* renamed from: a */
    protected final String mo11486a(C0570ww c0570ww, String str, int i) {
        if (c0570ww.f9990c == null || c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            return null;
        }
        String valueOf;
        String str2;
        if (c0570ww.f9990c.mo11503d().mo11535b(512)) {
            valueOf = String.valueOf(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append("[");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            valueOf = stringBuilder.toString();
            str2 = "";
        } else {
            valueOf = c0570ww.f9988a;
            str2 = "/";
        }
        if (str == null || str.length() == 0) {
            return valueOf;
        }
        if (!this.f9985h.f9952a.mo11535b(1024)) {
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            stringBuilder2.append(valueOf);
            return stringBuilder2.toString();
        } else if (valueOf.startsWith("?")) {
            return valueOf.substring(1);
        } else {
            return valueOf;
        }
    }

    /* renamed from: a */
    protected static C0784xn m6230a(C0570ww c0570ww, String str, String str2) {
        Object obj;
        if (c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            obj = null;
        } else {
            obj = c0570ww.f9989b;
        }
        return new C0784xn(str, str2, obj, c0570ww);
    }

    public boolean hasNext() {
        if (this.f9978a != null) {
            return true;
        }
        int i = this.f9979b;
        if (i == 0) {
            this.f9979b = 1;
            if (this.f9980c.f9990c == null || (this.f9985h.f9952a.mo11535b(512) && this.f9980c.mo11506f())) {
                return hasNext();
            }
            this.f9978a = C0568wr.m6230a(this.f9980c, this.f9985h.f9953b, this.f9981d);
            return true;
        } else if (i == 1) {
            if (this.f9982e == null) {
                this.f9982e = this.f9980c.mo11508h();
            }
            boolean a = m6231a(this.f9982e);
            if (a || !this.f9980c.mo11507g() || this.f9985h.f9952a.mo11535b(4096)) {
                return a;
            }
            this.f9979b = 2;
            this.f9982e = null;
            return hasNext();
        } else {
            if (this.f9982e == null) {
                this.f9982e = this.f9980c.mo11509i();
            }
            return m6231a(this.f9982e);
        }
    }

    /* renamed from: a */
    private final boolean m6231a(Iterator it) {
        if (!this.f9984g.hasNext() && it.hasNext()) {
            C0570ww c0570ww = (C0570ww) it.next();
            this.f9983f++;
            this.f9984g = new C0568wr(this.f9985h, c0570ww, this.f9981d, this.f9983f);
        }
        if (!this.f9984g.hasNext()) {
            return false;
        }
        this.f9978a = (C0784xn) this.f9984g.next();
        return true;
    }

    public Object next() {
        if (hasNext()) {
            C0784xn c0784xn = this.f9978a;
            this.f9978a = null;
            return c0784xn;
        }
        throw new NoSuchElementException("There are no more nodes to return");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
