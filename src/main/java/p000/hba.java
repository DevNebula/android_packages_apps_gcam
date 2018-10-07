package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: hba */
public final class hba {
    /* renamed from: a */
    private Size f6247a;
    /* renamed from: b */
    private Rect f6248b;
    /* renamed from: c */
    private Rect f6249c;
    /* renamed from: d */
    private Rect f6250d;
    /* renamed from: e */
    private Rect f6251e;
    /* renamed from: f */
    private Rect f6252f;
    /* renamed from: g */
    private Rect f6253g;
    /* renamed from: h */
    private Rect f6254h;

    public hba(byte b) {
        this();
    }

    /* renamed from: a */
    public final gxv mo7621a() {
        String str = "";
        if (this.f6247a == null) {
            str = String.valueOf(str).concat(" window");
        }
        if (this.f6248b == null) {
            str = String.valueOf(str).concat(" preview");
        }
        if (this.f6249c == null) {
            str = String.valueOf(str).concat(" uncoveredPreview");
        }
        if (this.f6250d == null) {
            str = String.valueOf(str).concat(" topBar");
        }
        if (this.f6251e == null) {
            str = String.valueOf(str).concat(" optionsBar");
        }
        if (this.f6252f == null) {
            str = String.valueOf(str).concat(" bottomBar");
        }
        if (this.f6253g == null) {
            str = String.valueOf(str).concat(" fullScreen");
        }
        if (this.f6254h == null) {
            str = String.valueOf(str).concat(" modeSwitchUi");
        }
        if (str.isEmpty()) {
            return new gxq(this.f6247a, this.f6248b, this.f6249c, this.f6250d, this.f6251e, this.f6252f, this.f6253g, this.f6254h);
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
    public final hba mo7622a(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null bottomBar");
        }
        this.f6252f = rect;
        return this;
    }

    /* renamed from: b */
    public final hba mo7624b(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null fullScreen");
        }
        this.f6253g = rect;
        return this;
    }

    /* renamed from: c */
    public final hba mo7625c(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSwitchUi");
        }
        this.f6254h = rect;
        return this;
    }

    /* renamed from: d */
    public final hba mo7626d(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null optionsBar");
        }
        this.f6251e = rect;
        return this;
    }

    /* renamed from: e */
    public final hba mo7627e(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null preview");
        }
        this.f6248b = rect;
        return this;
    }

    /* renamed from: f */
    public final hba mo7628f(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null topBar");
        }
        this.f6250d = rect;
        return this;
    }

    /* renamed from: g */
    public final hba mo7629g(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null uncoveredPreview");
        }
        this.f6249c = rect;
        return this;
    }

    /* renamed from: a */
    public final hba mo7623a(Size size) {
        if (size == null) {
            throw new NullPointerException("Null window");
        }
        this.f6247a = size;
        return this;
    }
}
