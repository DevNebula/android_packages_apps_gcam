package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: keq */
final class keq implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object[] f8621a;

    keq(Object[] objArr) {
        this.f8621a = objArr;
    }

    final Object readResolve() {
        return ken.m13715b(this.f8621a);
    }
}
