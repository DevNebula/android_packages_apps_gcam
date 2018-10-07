package p000;

/* compiled from: PG */
/* renamed from: ktp */
public final class ktp implements ktc {
    /* renamed from: a */
    public final kte f22006a;
    /* renamed from: b */
    public final String f22007b;
    /* renamed from: c */
    public final Object[] f22008c;
    /* renamed from: d */
    private final int f22009d;

    public ktp(kte kte, String str, Object[] objArr) {
        this.f22006a = kte;
        this.f22007b = str;
        this.f22008c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f22009d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.f22009d = (charAt2 << i3) | i;
                return;
            }
        }
    }

    /* renamed from: a */
    public final kte mo10307a() {
        return this.f22006a;
    }

    /* renamed from: b */
    public final int mo10308b() {
        return (this.f22009d & 1) != 1 ? C0252go.f5910cc : C0252go.f5909cb;
    }

    /* renamed from: c */
    public final boolean mo10309c() {
        return (this.f22009d & 2) == 2;
    }
}
