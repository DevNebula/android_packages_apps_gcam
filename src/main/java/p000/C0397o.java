package p000;

import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: o */
public final class C0397o {
    /* renamed from: a */
    public final int f9499a;
    /* renamed from: b */
    public final Method f9500b;

    C0397o(int i, Method method) {
        this.f9499a = i;
        this.f9500b = method;
        this.f9500b.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0397o c0397o = (C0397o) obj;
        if (this.f9499a == c0397o.f9499a && this.f9500b.getName().equals(c0397o.f9500b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9499a * 31) + this.f9500b.getName().hashCode();
    }
}
