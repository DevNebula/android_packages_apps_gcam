package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kbo */
public final class kbo implements Serializable, kbn {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kbn f21846a;
    /* renamed from: b */
    private volatile transient boolean f21847b;
    /* renamed from: c */
    private transient Object f21848c;

    public kbo(kbn kbn) {
        this.f21846a = (kbn) jri.m13404b((Object) kbn);
    }

    /* renamed from: b */
    public final Object mo9715b() {
        if (!this.f21847b) {
            synchronized (this) {
                if (!this.f21847b) {
                    Object b = this.f21846a.mo9715b();
                    this.f21848c = b;
                    this.f21847b = true;
                    return b;
                }
            }
        }
        return this.f21848c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object stringBuilder2;
        if (this.f21847b) {
            valueOf = String.valueOf(this.f21848c);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = this.f21846a;
        }
        valueOf = String.valueOf(stringBuilder2);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
