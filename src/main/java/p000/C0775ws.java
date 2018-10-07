package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ws */
public final class C0775ws extends C0568wr {
    /* renamed from: b */
    private String f22361b;
    /* renamed from: c */
    private Iterator f22362c;
    /* renamed from: d */
    private int f22363d = 0;
    /* renamed from: e */
    private final /* synthetic */ C0555wc f22364e;

    public C0775ws(C0555wc c0555wc, C0570ww c0570ww, String str) {
        this.f22364e = c0555wc;
        super(c0555wc);
        if (c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            c0555wc.f9953b = c0570ww.f9988a;
        }
        this.f22361b = mo11486a(c0570ww, null, 1);
        this.f22362c = c0570ww.mo11508h();
    }

    public final boolean hasNext() {
        while (this.f9978a == null) {
            if (!this.f22362c.hasNext()) {
                return false;
            }
            String str;
            C0570ww c0570ww = (C0570ww) this.f22362c.next();
            this.f22363d++;
            if (c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
                this.f22364e.f9953b = c0570ww.f9988a;
                str = null;
            } else if (c0570ww.f9990c == null) {
                str = null;
            } else {
                str = mo11486a(c0570ww, this.f22361b, this.f22363d);
            }
            if (this.f22364e.f9952a.mo11535b(512)) {
                if (!c0570ww.mo11506f()) {
                }
            }
            this.f9978a = C0568wr.m6230a(c0570ww, this.f22364e.f9953b, str);
            return true;
        }
        return true;
    }
}
