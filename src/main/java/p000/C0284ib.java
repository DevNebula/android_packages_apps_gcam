package p000;

/* compiled from: PG */
/* renamed from: ib */
public final class C0284ib {
    /* renamed from: a */
    private final C0286if f7257a;
    /* renamed from: b */
    private final boolean f7258b;

    private C0284ib(C0286if c0286if) {
        this.f7257a = c0286if;
    }

    C0284ib(C0286if c0286if, boolean z) {
        this(c0286if);
        this.f7258b = z;
    }

    /* renamed from: a */
    public final boolean mo8315a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C0286if c0286if = this.f7257a;
        if (c0286if == null) {
            return this.f7258b;
        }
        switch (c0286if.mo8415a(charSequence, 0, i)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return this.f7258b;
        }
    }
}
