package p000;

/* compiled from: PG */
/* renamed from: xa */
public final class C0778xa implements C0580xl {
    /* renamed from: a */
    private final /* synthetic */ String f22367a;
    /* renamed from: b */
    private final /* synthetic */ String f22368b;
    /* renamed from: c */
    private final /* synthetic */ String f22369c;
    /* renamed from: d */
    private final /* synthetic */ C0779xf f22370d;

    public C0778xa(String str, String str2, String str3, C0779xf c0779xf) {
        this.f22367a = str;
        this.f22368b = str2;
        this.f22369c = str3;
        this.f22370d = c0779xf;
    }

    /* renamed from: a */
    public final C0779xf mo11540a() {
        return this.f22370d;
    }

    /* renamed from: b */
    public final String mo11541b() {
        return this.f22367a;
    }

    /* renamed from: c */
    public final String mo11542c() {
        return this.f22368b;
    }

    /* renamed from: d */
    public final String mo11543d() {
        return this.f22369c;
    }

    public final String toString() {
        String str = this.f22368b;
        String str2 = this.f22369c;
        String str3 = this.f22367a;
        String valueOf = String.valueOf(this.f22370d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 14) + length2) + String.valueOf(str3).length()) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(" NS(");
        stringBuilder.append(str3);
        stringBuilder.append("), FORM (");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
