package p000;

/* compiled from: PG */
/* renamed from: ia */
final class C0283ia {
    /* renamed from: f */
    private static final byte[] f7225f = new byte[1792];
    /* renamed from: a */
    public final CharSequence f7226a;
    /* renamed from: b */
    public final boolean f7227b = false;
    /* renamed from: c */
    public final int f7228c;
    /* renamed from: d */
    public int f7229d;
    /* renamed from: e */
    public char f7230e;

    static {
        for (int i = 0; i < 1792; i++) {
            f7225f[i] = Character.getDirectionality(i);
        }
    }

    C0283ia(CharSequence charSequence) {
        this.f7226a = charSequence;
        this.f7228c = charSequence.length();
    }

    /* renamed from: a */
    final byte mo8295a() {
        this.f7230e = this.f7226a.charAt(this.f7229d - 1);
        if (Character.isLowSurrogate(this.f7230e)) {
            int codePointBefore = Character.codePointBefore(this.f7226a, this.f7229d);
            this.f7229d -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f7229d--;
        return C0283ia.m3654a(this.f7230e);
    }

    /* renamed from: a */
    static byte m3654a(char c) {
        return c < 1792 ? f7225f[c] : Character.getDirectionality(c);
    }
}
