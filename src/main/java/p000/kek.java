package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kek */
final class kek extends kcl implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f21880a;
    /* renamed from: b */
    private final Object f21881b;

    kek(Object obj, Object obj2) {
        this.f21880a = obj;
        this.f21881b = obj2;
    }

    public final Object getKey() {
        return this.f21880a;
    }

    public final Object getValue() {
        return this.f21881b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
