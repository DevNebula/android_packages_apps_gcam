package p000;

/* compiled from: PG */
/* renamed from: xh */
public abstract class C0579xh {
    /* renamed from: a */
    public int f10018a = 0;

    /* renamed from: a */
    protected abstract int mo11532a();

    public C0579xh(int i) {
        m6297d(i);
        mo11536c(i);
    }

    /* renamed from: a */
    protected void mo11533a(int i) {
    }

    /* renamed from: d */
    private final void m6297d(int i) {
        int a = (mo11532a() ^ -1) & i;
        if (a == 0) {
            mo11533a(i);
            return;
        }
        String toHexString = Integer.toHexString(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 33);
        stringBuilder.append("The option bit(s) 0x");
        stringBuilder.append(toHexString);
        stringBuilder.append(" are invalid!");
        throw new C0554wb(stringBuilder.toString(), 103);
    }

    public boolean equals(Object obj) {
        return this.f10018a == ((C0579xh) obj).f10018a;
    }

    /* renamed from: b */
    public final boolean mo11535b(int i) {
        return (this.f10018a & i) != 0;
    }

    public int hashCode() {
        return this.f10018a;
    }

    /* renamed from: a */
    public final void mo11534a(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.f10018a | i;
        } else {
            i2 = this.f10018a & (i ^ -1);
        }
        this.f10018a = i2;
    }

    /* renamed from: c */
    public final void mo11536c(int i) {
        m6297d(i);
        this.f10018a = i;
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f10018a));
        String str = "0x";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
