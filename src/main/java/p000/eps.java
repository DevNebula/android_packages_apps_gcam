package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: eps */
public final class eps {
    /* renamed from: a */
    private Integer f4276a;
    /* renamed from: b */
    private String f4277b;
    /* renamed from: c */
    private Boolean f4278c;
    /* renamed from: d */
    private Boolean f4279d;
    /* renamed from: e */
    private Float f4280e;
    /* renamed from: f */
    private String f4281f;
    /* renamed from: g */
    private String f4282g;
    /* renamed from: h */
    private Boolean f4283h;
    /* renamed from: i */
    private Float f4284i;
    /* renamed from: j */
    private kbg f4285j;
    /* renamed from: k */
    private Boolean f4286k;
    /* renamed from: l */
    private Rect f4287l;
    /* renamed from: m */
    private kbg f4288m;
    /* renamed from: n */
    private Boolean f4289n;

    eps(byte b) {
        this();
        this.f4285j = kau.f21835a;
        this.f4288m = kau.f21835a;
    }

    /* renamed from: a */
    public final epr mo6465a() {
        String str = "";
        if (this.f4276a == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (this.f4277b == null) {
            str = String.valueOf(str).concat(" filename");
        }
        if (this.f4278c == null) {
            str = String.valueOf(str).concat(" frontFacing");
        }
        if (this.f4279d == null) {
            str = String.valueOf(str).concat(" isHDR");
        }
        if (this.f4280e == null) {
            str = String.valueOf(str).concat(" zoom");
        }
        if (this.f4281f == null) {
            str = String.valueOf(str).concat(" flashSetting");
        }
        if (this.f4282g == null) {
            str = String.valueOf(str).concat(" hdrPlusSetting");
        }
        if (this.f4283h == null) {
            str = String.valueOf(str).concat(" gridLinesOn");
        }
        if (this.f4284i == null) {
            str = String.valueOf(str).concat(" timerSeconds");
        }
        if (this.f4286k == null) {
            str = String.valueOf(str).concat(" volumeButtonShutter");
        }
        if (this.f4287l == null) {
            str = String.valueOf(str).concat(" activeSensorSize");
        }
        if (this.f4289n == null) {
            str = String.valueOf(str).concat(" isSelfieFlashOn");
        }
        if (str.isEmpty()) {
            return new epo(this.f4276a.intValue(), this.f4277b, this.f4278c.booleanValue(), this.f4279d.booleanValue(), this.f4280e.floatValue(), this.f4281f, this.f4282g, this.f4283h.booleanValue(), this.f4284i.floatValue(), this.f4285j, this.f4286k, this.f4287l, this.f4288m, this.f4289n);
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

    /* renamed from: a */
    public final eps mo6468a(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null activeSensorSize");
        }
        this.f4287l = rect;
        return this;
    }

    /* renamed from: a */
    public final eps mo6470a(String str) {
        if (str == null) {
            throw new NullPointerException("Null filename");
        }
        this.f4277b = str;
        return this;
    }

    /* renamed from: b */
    public final eps mo6475b(String str) {
        if (str == null) {
            throw new NullPointerException("Null flashSetting");
        }
        this.f4281f = str;
        return this;
    }

    /* renamed from: a */
    public final eps mo6472a(boolean z) {
        this.f4278c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final eps mo6477b(boolean z) {
        this.f4283h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final eps mo6478c(String str) {
        if (str == null) {
            throw new NullPointerException("Null hdrPlusSetting");
        }
        this.f4282g = str;
        return this;
    }

    /* renamed from: c */
    public final eps mo6479c(boolean z) {
        this.f4279d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final eps mo6469a(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null isSelfieFlashOn");
        }
        this.f4289n = bool;
        return this;
    }

    /* renamed from: a */
    public final eps mo6471a(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null meteringData");
        }
        this.f4288m = kbg;
        return this;
    }

    /* renamed from: a */
    public final eps mo6467a(int i) {
        this.f4276a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final eps mo6466a(float f) {
        this.f4284i = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final eps mo6476b(kbg kbg) {
        if (kbg == null) {
            throw new NullPointerException("Null touchCoordinate");
        }
        this.f4285j = kbg;
        return this;
    }

    /* renamed from: b */
    public final eps mo6474b(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null volumeButtonShutter");
        }
        this.f4286k = bool;
        return this;
    }

    /* renamed from: b */
    public final eps mo6473b(float f) {
        this.f4280e = Float.valueOf(f);
        return this;
    }
}
