package p000;

/* compiled from: PG */
/* renamed from: id */
final class C0689id implements C0286if {
    /* renamed from: a */
    public static final C0689id f20920a = new C0689id(true);
    /* renamed from: b */
    private final boolean f20921b;

    static {
        C0689id c0689id = new C0689id(false);
    }

    private C0689id(boolean z) {
        this.f20921b = z;
    }

    /* renamed from: a */
    public final int mo8415a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            switch (C0285ic.m3722a(Character.getDirectionality(charSequence.charAt(i5)))) {
                case 0:
                    if (!this.f20921b) {
                        i4 = 1;
                        break;
                    }
                    return 0;
                case 1:
                    if (this.f20921b) {
                        i4 = 1;
                        break;
                    }
                    return 1;
                default:
                    break;
            }
        }
        return i4 != 0 ? this.f20921b : 2;
    }
}
