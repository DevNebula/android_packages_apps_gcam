package p000;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: hck */
public final class hck {
    /* renamed from: a */
    public Integer f6327a;
    /* renamed from: b */
    public Integer f6328b;
    /* renamed from: c */
    public Drawable f6329c;
    /* renamed from: d */
    public Boolean f6330d;
    /* renamed from: e */
    public Integer f6331e;
    /* renamed from: f */
    public Integer f6332f;
    /* renamed from: g */
    public Integer f6333g;
    /* renamed from: h */
    private Integer f6334h;
    /* renamed from: i */
    private Integer f6335i;
    /* renamed from: j */
    private Integer f6336j;
    /* renamed from: k */
    private Integer f6337k;
    /* renamed from: l */
    private Integer f6338l;
    /* renamed from: m */
    private Integer f6339m;
    /* renamed from: n */
    private Integer f6340n;
    /* renamed from: o */
    private Integer f6341o;
    /* renamed from: p */
    private hbf f6342p;

    hck(byte b) {
        this();
    }

    /* renamed from: a */
    final hck mo7699a(boolean z) {
        this.f6330d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final hcj mo7696a() {
        String str = "";
        if (this.f6334h == null) {
            str = String.valueOf(str).concat(" photoCircleRadius");
        }
        if (this.f6335i == null) {
            str = String.valueOf(str).concat(" photoCircleAlpha");
        }
        if (this.f6327a == null) {
            str = String.valueOf(str).concat(" photoCircleColor");
        }
        if (this.f6336j == null) {
            str = String.valueOf(str).concat(" videoDotRadius");
        }
        if (this.f6328b == null) {
            str = String.valueOf(str).concat(" videoCircleColor");
        }
        if (this.f6337k == null) {
            str = String.valueOf(str).concat(" stopSquareHalfSize");
        }
        if (this.f6338l == null) {
            str = String.valueOf(str).concat(" portraitInnerCircleRadius");
        }
        if (this.f6339m == null) {
            str = String.valueOf(str).concat(" portraitOuterCircleRadius");
        }
        if (this.f6340n == null) {
            str = String.valueOf(str).concat(" buttonImageRectHalfSize");
        }
        if (this.f6330d == null) {
            str = String.valueOf(str).concat(" animateRippleEffect");
        }
        if (this.f6331e == null) {
            str = String.valueOf(str).concat(" ripplePaintAlpha");
        }
        if (this.f6332f == null) {
            str = String.valueOf(str).concat(" rippleRadius");
        }
        if (this.f6333g == null) {
            str = String.valueOf(str).concat(" mainButtonColor");
        }
        if (this.f6341o == null) {
            str = String.valueOf(str).concat(" roundButtonRadius");
        }
        if (this.f6342p == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (str.isEmpty()) {
            return new hay(this.f6334h.intValue(), this.f6335i.intValue(), this.f6327a.intValue(), this.f6336j.intValue(), this.f6328b.intValue(), this.f6337k.intValue(), this.f6338l.intValue(), this.f6339m.intValue(), this.f6329c, this.f6340n.intValue(), this.f6330d.booleanValue(), this.f6331e.intValue(), this.f6332f.intValue(), this.f6333g.intValue(), this.f6341o.intValue(), this.f6342p);
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

    /* renamed from: b */
    public final int mo7700b() {
        Integer num = this.f6340n;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"buttonImageRectHalfSize\" has not been set");
    }

    /* renamed from: a */
    final hck mo7697a(int i) {
        this.f6340n = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    final hck mo7701b(int i) {
        this.f6333g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final hbf mo7702c() {
        hbf hbf = this.f6342p;
        if (hbf != null) {
            return hbf;
        }
        throw new IllegalStateException("Property \"mode\" has not been set");
    }

    /* renamed from: a */
    public final hck mo7698a(hbf hbf) {
        if (hbf == null) {
            throw new NullPointerException("Null mode");
        }
        this.f6342p = hbf;
        return this;
    }

    /* renamed from: d */
    public final int mo7704d() {
        Integer num = this.f6335i;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"photoCircleAlpha\" has not been set");
    }

    /* renamed from: c */
    final hck mo7703c(int i) {
        this.f6335i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    final hck mo7705d(int i) {
        this.f6327a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: e */
    public final int mo7706e() {
        Integer num = this.f6334h;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"photoCircleRadius\" has not been set");
    }

    /* renamed from: e */
    final hck mo7707e(int i) {
        this.f6334h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: f */
    public final int mo7708f() {
        Integer num = this.f6338l;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"portraitInnerCircleRadius\" has not been set");
    }

    /* renamed from: f */
    final hck mo7709f(int i) {
        this.f6338l = Integer.valueOf(i);
        return this;
    }

    /* renamed from: g */
    public final int mo7710g() {
        Integer num = this.f6339m;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"portraitOuterCircleRadius\" has not been set");
    }

    /* renamed from: g */
    final hck mo7711g(int i) {
        this.f6339m = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    final hck mo7713h(int i) {
        this.f6331e = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    final hck mo7715i(int i) {
        this.f6332f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: h */
    public final int mo7712h() {
        Integer num = this.f6341o;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"roundButtonRadius\" has not been set");
    }

    /* renamed from: j */
    final hck mo7717j(int i) {
        this.f6341o = Integer.valueOf(i);
        return this;
    }

    /* renamed from: i */
    public final int mo7714i() {
        Integer num = this.f6337k;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"stopSquareHalfSize\" has not been set");
    }

    /* renamed from: k */
    final hck mo7718k(int i) {
        this.f6337k = Integer.valueOf(i);
        return this;
    }

    /* renamed from: l */
    final hck mo7719l(int i) {
        this.f6328b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: j */
    public final int mo7716j() {
        Integer num = this.f6336j;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"videoDotRadius\" has not been set");
    }

    /* renamed from: m */
    final hck mo7720m(int i) {
        this.f6336j = Integer.valueOf(i);
        return this;
    }
}
