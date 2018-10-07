package p000;

/* compiled from: PG */
/* renamed from: bwz */
public final class bwz extends bzx {
    /* renamed from: a */
    private final kbg f11886a;
    /* renamed from: b */
    private final kbg f11887b;
    /* renamed from: c */
    private final kbg f11888c;
    /* renamed from: d */
    private final kbg f11889d;
    /* renamed from: e */
    private final kbg f11890e;
    /* renamed from: f */
    private final kbg f11891f;
    /* renamed from: g */
    private final kbg f11892g;
    /* renamed from: h */
    private final kbg f11893h;
    /* renamed from: i */
    private final kbg f11894i;
    /* renamed from: j */
    private final kbg f11895j;

    public bwz(kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kbg kbg5, kbg kbg6, kbg kbg7, kbg kbg8, kbg kbg9, kbg kbg10) {
        this.f11886a = kbg;
        this.f11887b = kbg2;
        this.f11888c = kbg3;
        this.f11889d = kbg4;
        this.f11890e = kbg5;
        this.f11891f = kbg6;
        this.f11892g = kbg7;
        this.f11893h = kbg8;
        this.f11894i = kbg9;
        this.f11895j = kbg10;
    }

    /* renamed from: a */
    public final kbg mo2234a() {
        return this.f11887b;
    }

    /* renamed from: b */
    public final kbg mo2235b() {
        return this.f11890e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bzx)) {
            return false;
        }
        bzx bzx = (bzx) obj;
        if (this.f11886a.equals(bzx.mo2240g()) && this.f11887b.equals(bzx.mo2234a()) && this.f11888c.equals(bzx.mo2236c()) && this.f11889d.equals(bzx.mo2239f()) && this.f11890e.equals(bzx.mo2235b()) && this.f11891f.equals(bzx.mo2238e()) && this.f11892g.equals(bzx.mo2243j()) && this.f11893h.equals(bzx.mo2241h()) && this.f11894i.equals(bzx.mo2237d()) && this.f11895j.equals(bzx.mo2242i())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final kbg mo2236c() {
        return this.f11888c;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11886a.hashCode() ^ 1000003) * 1000003) ^ this.f11887b.hashCode()) * 1000003) ^ this.f11888c.hashCode()) * 1000003) ^ this.f11889d.hashCode()) * 1000003) ^ this.f11890e.hashCode()) * 1000003) ^ this.f11891f.hashCode()) * 1000003) ^ this.f11892g.hashCode()) * 1000003) ^ this.f11893h.hashCode()) * 1000003) ^ this.f11894i.hashCode()) * 1000003) ^ this.f11895j.hashCode();
    }

    /* renamed from: d */
    public final kbg mo2237d() {
        return this.f11894i;
    }

    /* renamed from: e */
    public final kbg mo2238e() {
        return this.f11891f;
    }

    /* renamed from: f */
    public final kbg mo2239f() {
        return this.f11889d;
    }

    /* renamed from: g */
    public final kbg mo2240g() {
        return this.f11886a;
    }

    /* renamed from: h */
    public final kbg mo2241h() {
        return this.f11893h;
    }

    /* renamed from: i */
    public final kbg mo2242i() {
        return this.f11895j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11886a);
        String valueOf2 = String.valueOf(this.f11887b);
        String valueOf3 = String.valueOf(this.f11888c);
        String valueOf4 = String.valueOf(this.f11889d);
        String valueOf5 = String.valueOf(this.f11890e);
        String valueOf6 = String.valueOf(this.f11891f);
        String valueOf7 = String.valueOf(this.f11892g);
        String valueOf8 = String.valueOf(this.f11893h);
        String valueOf9 = String.valueOf(this.f11894i);
        String valueOf10 = String.valueOf(this.f11895j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder stringBuilder = new StringBuilder((((((((((length + 185) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length());
        stringBuilder.append("ShotConfig{progressCallback=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", baseFrameCallback=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", exifMetadataCallback=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", postviewRgbCallback=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", dngCallback=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", pdCallback=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", yuvCallback=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", rgbCallback=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", jpegCallback=");
        stringBuilder.append(valueOf9);
        stringBuilder.append(", shotStatusCallback=");
        stringBuilder.append(valueOf10);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: j */
    public final kbg mo2243j() {
        return this.f11892g;
    }
}
