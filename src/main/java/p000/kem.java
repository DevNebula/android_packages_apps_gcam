package p000;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: kem */
final class kem implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final EnumSet f8620a;

    kem(EnumSet enumSet) {
        this.f8620a = enumSet;
    }

    final Object readResolve() {
        return new kel(this.f8620a.clone());
    }
}
