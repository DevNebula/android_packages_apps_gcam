package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: erd */
final class erd implements iqo {
    /* renamed from: a */
    public final eqw f17683a;
    /* renamed from: b */
    public final ilb f17684b;
    /* renamed from: c */
    private final Collection f17685c;

    erd(eqw eqw, ilb ilb, Collection collection) {
        this.f17683a = eqw;
        this.f17684b = ilb;
        this.f17685c = collection;
    }

    public final void close() {
        for (iqo close : this.f17685c) {
            close.close();
        }
    }
}
