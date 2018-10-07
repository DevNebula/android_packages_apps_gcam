package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: j */
public final class C0302j implements Entry {
    /* renamed from: a */
    public final Object f7959a;
    /* renamed from: b */
    public final Object f7960b;
    /* renamed from: c */
    public C0302j f7961c;
    /* renamed from: d */
    public C0302j f7962d;

    C0302j(Object obj, Object obj2) {
        this.f7959a = obj;
        this.f7960b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0302j)) {
            return false;
        }
        C0302j c0302j = (C0302j) obj;
        if (this.f7959a.equals(c0302j.f7959a) && this.f7960b.equals(c0302j.f7960b)) {
            return true;
        }
        return false;
    }

    public final Object getKey() {
        return this.f7959a;
    }

    public final Object getValue() {
        return this.f7960b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f7959a);
        stringBuilder.append("=");
        stringBuilder.append(this.f7960b);
        return stringBuilder.toString();
    }
}
