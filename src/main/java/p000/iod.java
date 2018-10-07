package p000;

/* compiled from: PG */
/* renamed from: iod */
public final class iod {
    /* renamed from: a */
    private Integer f7576a;
    /* renamed from: b */
    private Integer f7577b;
    /* renamed from: c */
    private Integer f7578c;
    /* renamed from: d */
    private Integer f7579d;
    /* renamed from: e */
    private Integer f7580e;
    /* renamed from: f */
    private Integer f7581f;
    /* renamed from: g */
    private Integer f7582g;
    /* renamed from: h */
    private Integer f7583h;
    /* renamed from: i */
    private Integer f7584i;
    /* renamed from: j */
    private Integer f7585j;
    /* renamed from: k */
    private Integer f7586k;
    /* renamed from: l */
    private Integer f7587l;
    /* renamed from: m */
    private Integer f7588m;

    iod(byte b) {
        this();
    }

    /* renamed from: a */
    public final iod mo8670a(int i) {
        this.f7576a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final iod mo8671b(int i) {
        this.f7577b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final iod mo8672c(int i) {
        this.f7578c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final iod mo8673d(int i) {
        this.f7579d = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final ioc mo8669a() {
        String str = "";
        if (this.f7576a == null) {
            str = String.valueOf(str).concat(" audioBitRate");
        }
        if (this.f7577b == null) {
            str = String.valueOf(str).concat(" audioChannels");
        }
        if (this.f7578c == null) {
            str = String.valueOf(str).concat(" audioCodec");
        }
        if (this.f7579d == null) {
            str = String.valueOf(str).concat(" audioSampleRate");
        }
        if (this.f7580e == null) {
            str = String.valueOf(str).concat(" fileFormat");
        }
        if (this.f7581f == null) {
            str = String.valueOf(str).concat(" quality");
        }
        if (this.f7582g == null) {
            str = String.valueOf(str).concat(" videoBitRate");
        }
        if (this.f7583h == null) {
            str = String.valueOf(str).concat(" videoCodec");
        }
        if (this.f7584i == null) {
            str = String.valueOf(str).concat(" videoCodecProfile");
        }
        if (this.f7585j == null) {
            str = String.valueOf(str).concat(" videoCodecLevel");
        }
        if (this.f7586k == null) {
            str = String.valueOf(str).concat(" videoFrameHeight");
        }
        if (this.f7587l == null) {
            str = String.valueOf(str).concat(" videoFrameRate");
        }
        if (this.f7588m == null) {
            str = String.valueOf(str).concat(" videoFrameWidth");
        }
        if (str.isEmpty()) {
            return new inw(this.f7576a.intValue(), this.f7577b.intValue(), this.f7578c.intValue(), this.f7579d.intValue(), this.f7580e.intValue(), this.f7581f.intValue(), this.f7582g.intValue(), this.f7583h.intValue(), this.f7584i.intValue(), this.f7585j.intValue(), this.f7586k.intValue(), this.f7587l.intValue(), this.f7588m.intValue());
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: e */
    public final iod mo8674e(int i) {
        this.f7580e = Integer.valueOf(i);
        return this;
    }

    /* renamed from: f */
    public final iod mo8675f(int i) {
        this.f7581f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: g */
    public final iod mo8676g(int i) {
        this.f7582g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    public final iod mo8677h(int i) {
        this.f7583h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    public final iod mo8678i(int i) {
        this.f7585j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: j */
    public final iod mo8679j(int i) {
        this.f7584i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: k */
    public final iod mo8680k(int i) {
        this.f7586k = Integer.valueOf(i);
        return this;
    }

    /* renamed from: l */
    public final iod mo8681l(int i) {
        this.f7587l = Integer.valueOf(i);
        return this;
    }

    /* renamed from: m */
    public final iod mo8682m(int i) {
        this.f7588m = Integer.valueOf(i);
        return this;
    }
}
