package p000;

/* compiled from: PG */
/* renamed from: ie */
final class C0690ie implements C0286if {
    /* renamed from: a */
    public static final C0690ie f20982a = new C0690ie();

    private C0690ie() {
    }

    /* renamed from: a */
    public final int mo8415a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            i4 = C0285ic.m3723b(Character.getDirectionality(charSequence.charAt(i5)));
        }
        return i4;
    }
}
