package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: khe */
final class khe extends khi implements Entry {
    public static final long serialVersionUID = 0;

    khe(Entry entry, Object obj) {
        super(entry, obj);
    }

    /* renamed from: a */
    final /* synthetic */ Object mo9985a() {
        return (Entry) super.mo9985a();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        synchronized (this.f8653a) {
            equals = ((Entry) super.mo9985a()).equals(obj);
        }
        return equals;
    }

    public final Object getKey() {
        Object key;
        synchronized (this.f8653a) {
            key = ((Entry) super.mo9985a()).getKey();
        }
        return key;
    }

    public final Object getValue() {
        Object value;
        synchronized (this.f8653a) {
            value = ((Entry) super.mo9985a()).getValue();
        }
        return value;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f8653a) {
            hashCode = ((Entry) super.mo9985a()).hashCode();
        }
        return hashCode;
    }

    public final Object setValue(Object obj) {
        Object value;
        synchronized (this.f8653a) {
            value = ((Entry) super.mo9985a()).setValue(obj);
        }
        return value;
    }
}
