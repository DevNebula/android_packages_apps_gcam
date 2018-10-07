package p000;

import android.util.Size;

/* compiled from: PG */
/* renamed from: gxx */
public final class gxx {
    /* renamed from: a */
    public Size f6146a;
    /* renamed from: b */
    public Size f6147b;
    /* renamed from: c */
    private Boolean f6148c;
    /* renamed from: d */
    private hir f6149d;

    gxx(byte b) {
        this();
    }

    gxx(gxw gxw) {
        this();
        this.f6148c = Boolean.valueOf(gxw.mo7525e());
        this.f6146a = gxw.mo7524d();
        this.f6147b = gxw.mo7522b();
        this.f6149d = gxw.mo7521a();
    }

    /* renamed from: a */
    public final gxw mo7526a() {
        jri.m13405b(m2950c().mo9709b());
        jri.m13405b(m2949b().mo9709b());
        Size size = (Size) m2950c().mo9706a();
        hir hir = (hir) m2949b().mo9706a();
        if (hir == hir.PORTRAIT || hir == hir.REVERSE_PORTRAIT) {
            this.f6147b = new Size(Math.min(size.getWidth(), size.getHeight()), Math.max(size.getWidth(), size.getHeight()));
        } else {
            this.f6147b = new Size(Math.max(size.getWidth(), size.getHeight()), Math.min(size.getWidth(), size.getHeight()));
        }
        String str = "";
        if (this.f6148c == null) {
            str = String.valueOf(str).concat(" windowSizeAsPreviewSize");
        }
        if (this.f6146a == null) {
            str = String.valueOf(str).concat(" windowSize");
        }
        if (this.f6147b == null) {
            str = String.valueOf(str).concat(" previewSize");
        }
        if (this.f6149d == null) {
            str = String.valueOf(str).concat(" orientation");
        }
        if (str.isEmpty()) {
            return new gxr(this.f6148c.booleanValue(), this.f6146a, this.f6147b, this.f6149d);
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
    private final kbg m2949b() {
        hir hir = this.f6149d;
        if (hir != null) {
            return kbg.m4804c(hir);
        }
        return kau.f21835a;
    }

    /* renamed from: c */
    private final kbg m2950c() {
        Size size = this.f6147b;
        if (size != null) {
            return kbg.m4804c(size);
        }
        return kau.f21835a;
    }

    /* renamed from: a */
    public final gxx mo7527a(hir hir) {
        if (hir == null) {
            throw new NullPointerException("Null orientation");
        }
        this.f6149d = hir;
        return this;
    }

    /* renamed from: a */
    public final gxx mo7528a(boolean z) {
        this.f6148c = Boolean.valueOf(z);
        return this;
    }
}
