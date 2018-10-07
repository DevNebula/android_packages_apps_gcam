package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: it */
final class C0297it implements Iterator, Entry {
    /* renamed from: a */
    private int f7799a;
    /* renamed from: b */
    private int f7800b;
    /* renamed from: c */
    private boolean f7801c = false;
    /* renamed from: d */
    private final /* synthetic */ C0293ip f7802d;

    C0297it(C0293ip c0293ip) {
        this.f7802d = c0293ip;
        this.f7799a = c0293ip.mo8703c() - 1;
        this.f7800b = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f7801c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (C0289il.m3869a(entry.getKey(), this.f7802d.mo8694a(this.f7800b, 0)) && C0289il.m3869a(entry.getValue(), this.f7802d.mo8694a(this.f7800b, 1))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f7801c) {
            return this.f7802d.mo8694a(this.f7800b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f7801c) {
            return this.f7802d.mo8694a(this.f7800b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f7800b < this.f7799a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f7801c) {
            int hashCode;
            Object a = this.f7802d.mo8694a(this.f7800b, 0);
            Object a2 = this.f7802d.mo8694a(this.f7800b, 1);
            if (a != null) {
                hashCode = a.hashCode();
            } else {
                hashCode = 0;
            }
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            this.f7800b++;
            this.f7801c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7801c) {
            this.f7802d.mo8697a(this.f7800b);
            this.f7800b--;
            this.f7799a--;
            this.f7801c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f7801c) {
            return this.f7802d.mo8695a(this.f7800b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }
}
