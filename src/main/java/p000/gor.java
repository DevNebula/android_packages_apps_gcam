package p000;

/* compiled from: PG */
/* renamed from: gor */
public final class gor {
    /* renamed from: a */
    private final gos f5974a;
    /* renamed from: b */
    private final iqz f5975b;

    public gor(gos gos, ira ira) {
        this.f5974a = gos;
        this.f5975b = ira.mo8854a("Settings");
    }

    /* renamed from: a */
    public final ilp mo7283a(String str, boolean z) {
        return mo7282a("default_scope", str, z);
    }

    /* renamed from: a */
    public final ilp mo7278a(String str, int i) {
        return mo7280a("default_scope", str, i);
    }

    /* renamed from: a */
    public final ilp mo7282a(String str, String str2, boolean z) {
        if (!this.f5974a.mo7302e(str, str2)) {
            iqz iqz = this.f5975b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(z);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo8836d(stringBuilder.toString());
            this.f5974a.mo7298b(str, str2, z);
        }
        return new gof(this.f5974a, str, str2);
    }

    /* renamed from: a */
    public final ilp mo7280a(String str, String str2, int i) {
        if (!this.f5974a.mo7302e(str, str2)) {
            iqz iqz = this.f5975b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 54) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(i);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo8836d(stringBuilder.toString());
            this.f5974a.mo7289a(str, str2, i);
        }
        return new gok(this.f5974a, str, str2);
    }

    /* renamed from: a */
    public final ilp mo7279a(String str, String str2) {
        return new gox(this.f5974a, str, str2);
    }

    /* renamed from: a */
    public final ilp mo7281a(String str, String str2, String str3) {
        if (!this.f5974a.mo7302e(str, str2)) {
            iqz iqz = this.f5975b;
            int length = String.valueOf(str3).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 43) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(str3);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo8836d(stringBuilder.toString());
            this.f5974a.mo7290a(str, str2, str3);
        }
        return mo7279a(str, str2);
    }

    /* renamed from: b */
    public final ilp mo7284b(String str, String str2) {
        return mo7281a("default_scope", str, str2);
    }
}
