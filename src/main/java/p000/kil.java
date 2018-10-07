package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kil */
final class kil implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final String f8678a;
    /* renamed from: b */
    private final int f8679b;
    /* renamed from: c */
    private final String f8680c;

    kil(String str, int i, String str2) {
        this.f8678a = str;
        this.f8679b = i;
        this.f8680c = str2;
    }

    private final Object readResolve() {
        return new kij(this.f8678a, this.f8679b, this.f8680c);
    }
}
