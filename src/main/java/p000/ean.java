package p000;

/* compiled from: PG */
/* renamed from: ean */
public final class ean {
    /* renamed from: a */
    public iqp f3665a;
    /* renamed from: b */
    public iqp f3666b;
    /* renamed from: c */
    public iqp f3667c;

    public final String toString() {
        String valueOf = String.valueOf(this.f3665a);
        String valueOf2 = String.valueOf(this.f3666b);
        String valueOf3 = String.valueOf(this.f3667c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 26) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("SelectedPictureSizes: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf3);
        return stringBuilder.toString();
    }
}
