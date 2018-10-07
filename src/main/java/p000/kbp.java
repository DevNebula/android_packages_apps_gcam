package p000;

/* compiled from: PG */
/* renamed from: kbp */
public final class kbp implements kbn {
    /* renamed from: a */
    private volatile kbn f21849a;
    /* renamed from: b */
    private volatile boolean f21850b;
    /* renamed from: c */
    private Object f21851c;

    public kbp(kbn kbn) {
        this.f21849a = (kbn) jri.m13404b((Object) kbn);
    }

    /* renamed from: b */
    public final Object mo9715b() {
        if (!this.f21850b) {
            synchronized (this) {
                if (!this.f21850b) {
                    Object b = this.f21849a.mo9715b();
                    this.f21851c = b;
                    this.f21850b = true;
                    this.f21849a = null;
                    return b;
                }
            }
        }
        return this.f21851c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object obj = this.f21849a;
        if (obj == null) {
            valueOf = String.valueOf(this.f21851c);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            obj = stringBuilder.toString();
        }
        valueOf = String.valueOf(obj);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
