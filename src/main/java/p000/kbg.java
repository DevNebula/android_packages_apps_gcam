package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbg */
public abstract class kbg implements Serializable {
    public static final long serialVersionUID = 0;

    kbg() {
    }

    /* renamed from: a */
    public abstract Object mo9706a();

    /* renamed from: a */
    public abstract Object mo9707a(Object obj);

    /* renamed from: a */
    public abstract kbg mo9708a(kaw kaw);

    /* renamed from: b */
    public abstract boolean mo9709b();

    /* renamed from: c */
    public abstract Object mo9710c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* renamed from: b */
    public static kbg m4803b(Object obj) {
        if (obj != null) {
            return new kbm(obj);
        }
        return kau.f21835a;
    }

    /* renamed from: c */
    public static kbg m4804c(Object obj) {
        return new kbm(jri.m13404b(obj));
    }
}
