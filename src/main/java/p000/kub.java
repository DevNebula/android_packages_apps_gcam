package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kub */
final class kub implements Comparable, Entry {
    /* renamed from: a */
    public final Comparable f8931a;
    /* renamed from: b */
    private Object f8932b;
    /* renamed from: c */
    private final /* synthetic */ ktu f8933c;

    kub(ktu ktu, Comparable comparable, Object obj) {
        this.f8933c = ktu;
        this.f8931a = comparable;
        this.f8932b = obj;
    }

    kub(ktu ktu, Entry entry) {
        this(ktu, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8931a.compareTo(((kub) obj).f8931a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (kub.m5356a(this.f8931a, entry.getKey()) && kub.m5356a(this.f8932b, entry.getValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5356a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public final /* synthetic */ Object getKey() {
        return this.f8931a;
    }

    public final Object getValue() {
        return this.f8932b;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f8931a;
        if (comparable != null) {
            hashCode = comparable.hashCode();
        } else {
            hashCode = 0;
        }
        Object obj = this.f8932b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f8933c.mo10372a();
        Object obj2 = this.f8932b;
        this.f8932b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8931a);
        String valueOf2 = String.valueOf(this.f8932b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
