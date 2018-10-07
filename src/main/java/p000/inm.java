package p000;

/* compiled from: PG */
/* renamed from: inm */
public final class inm {
    /* renamed from: a */
    public final imz f7530a;
    /* renamed from: b */
    public final int f7531b;
    /* renamed from: c */
    public final int f7532c;
    /* renamed from: d */
    public final int f7533d;

    public inm(imz imz, int i, int i2, int i3) {
        this.f7530a = imz;
        this.f7531b = i;
        this.f7532c = i2;
        this.f7533d = i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7530a);
        int i = this.f7532c;
        int i2 = this.f7531b;
        int i3 = this.f7533d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 79);
        stringBuilder.append("encoder=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sampling rate=");
        stringBuilder.append(i);
        stringBuilder.append(", bit rate=");
        stringBuilder.append(i2);
        stringBuilder.append(", channels=");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
