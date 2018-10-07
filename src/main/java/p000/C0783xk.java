package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: xk */
public final class C0783xk extends C0579xh {
    /* renamed from: b */
    public int f22371b = DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
    /* renamed from: c */
    public String f22372c = "\n";
    /* renamed from: d */
    public String f22373d = "  ";
    /* renamed from: e */
    public int f22374e = 0;

    private C0783xk(int i) {
        super(i);
    }

    public final Object clone() {
        try {
            C0783xk c0783xk = new C0783xk(this.f10018a);
            c0783xk.f22374e = this.f22374e;
            c0783xk.f22373d = this.f22373d;
            c0783xk.f22372c = this.f22372c;
            c0783xk.f22371b = this.f22371b;
            return c0783xk;
        } catch (C0554wb e) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo14459b() {
        return (this.f10018a & 3) == 2;
    }

    /* renamed from: c */
    public final boolean mo14460c() {
        return (this.f10018a & 3) == 3;
    }

    /* renamed from: d */
    public final String mo14462d() {
        if (mo14459b()) {
            return "UTF-16BE";
        }
        if (mo14460c()) {
            return "UTF-16LE";
        }
        return "UTF-8";
    }

    /* renamed from: a */
    protected final int mo11532a() {
        return 4976;
    }

    /* renamed from: e */
    public final C0783xk mo14463e() {
        mo11534a(16, true);
        return this;
    }

    /* renamed from: f */
    public final C0783xk mo14464f() {
        mo11534a(64, true);
        return this;
    }
}
