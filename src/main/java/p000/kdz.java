package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: kdz */
public abstract class kdz extends kdv implements Set {
    protected kdz() {
    }

    /* renamed from: c */
    protected abstract Set mo13974b();

    public boolean equals(Object obj) {
        return obj == this || mo13974b().equals(obj);
    }

    public int hashCode() {
        return mo13974b().hashCode();
    }
}
