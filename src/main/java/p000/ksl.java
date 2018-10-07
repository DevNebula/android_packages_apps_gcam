package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ksl */
final class ksl implements Entry {
    /* renamed from: a */
    public Entry f8897a;

    ksl(Entry entry) {
        this.f8897a = entry;
    }

    public final Object getKey() {
        return this.f8897a.getKey();
    }

    public final Object getValue() {
        if (((ksk) this.f8897a.getValue()) == null) {
            return null;
        }
        return ksk.m14140a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof kte) {
            ksk ksk = (ksk) this.f8897a.getValue();
            kte kte = (kte) obj;
            kte kte2 = ksk.f8900b;
            ksk.f8899a = null;
            ksk.f8901c = null;
            ksk.f8900b = kte;
            return kte2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
