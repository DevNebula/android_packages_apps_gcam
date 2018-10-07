package p000;

import android.annotation.TargetApi;
import android.hardware.Camera.Parameters;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yu */
final class C0800yu extends aah {
    /* renamed from: a */
    public final /* synthetic */ C0796yo f22452a;
    /* renamed from: b */
    private final C0619zs f22453b;
    /* renamed from: c */
    private final int f22454c;
    /* renamed from: d */
    private final abh f22455d;
    /* renamed from: e */
    private final C0803zo f22456e;

    /* synthetic */ C0800yu(C0796yo c0796yo, C0619zs c0619zs, int i, abh abh, C0803zo c0803zo) {
        this(c0796yo, c0619zs, i, abh, c0803zo, (byte) 0);
    }

    private C0800yu(C0796yo c0796yo, C0619zs c0619zs, int i, abh abh, C0803zo c0803zo, byte b) {
        this.f22452a = c0796yo;
        this.f22453b = c0619zs;
        this.f22454c = i;
        this.f22455d = abh;
        this.f22456e = c0803zo;
    }

    /* renamed from: a */
    public final boolean mo18a(abo abo) {
        return mo19a(abo, 6);
    }

    /* renamed from: a */
    public final void mo14a(Handler handler, C0623zw c0623zw) {
        this.f22452a.f22446f.mo82a(new C0604za(this, new C0602yy(this, handler, c0623zw)));
    }

    /* renamed from: a */
    public final C0619zs mo8a() {
        return this.f22453b;
    }

    /* renamed from: b */
    public final Handler mo20b() {
        return this.f22452a.f22444d;
    }

    /* renamed from: c */
    public final int mo22c() {
        return this.f22454c;
    }

    /* renamed from: d */
    public final abq mo23d() {
        return this.f22452a.f22445e;
    }

    /* renamed from: e */
    public final aaz mo24e() {
        return new C0803zo(this.f22456e);
    }

    /* renamed from: f */
    public final abh mo25f() {
        return this.f22455d;
    }

    /* renamed from: g */
    public final abs mo26g() {
        return this.f22452a.f22446f;
    }

    @Deprecated
    /* renamed from: h */
    public final Parameters mo27h() {
        aaw aaw = new aaw();
        Parameters[] parametersArr = new Parameters[1];
        try {
            this.f22452a.f22446f.mo83a(new C0600yw(this, parametersArr, aaw), aaw.f39b, "get parameters");
        } catch (RuntimeException e) {
            this.f22453b.mo11592b().mo59a(e);
        }
        return parametersArr[0];
    }

    /* renamed from: i */
    public final abo mo28i() {
        return new C0804zr(this.f22456e, mo27h());
    }

    @TargetApi(16)
    /* renamed from: a */
    public final void mo15a(Handler handler, C0624zx c0624zx) {
        try {
            this.f22452a.f22446f.mo82a(new C0605zb(this, handler, c0624zx));
        } catch (RuntimeException e) {
            this.f22453b.mo11592b().mo59a(e);
        }
    }

    /* renamed from: a */
    public final void mo11a(Handler handler, aag aag) {
        this.f22452a.f22446f.mo82a(new C0599yv(this, handler, aag));
    }

    /* renamed from: b */
    public final void mo21b(Handler handler, aag aag) {
        this.f22452a.f22446f.mo82a(new C0601yx(this, handler, aag));
    }

    /* renamed from: a */
    public final void mo12a(Handler handler, aas aas, aaf aaf, aaf aaf2) {
        try {
            this.f22452a.f22446f.mo82a(new C0608ze(this, handler, aas, aaf, new C0606zc(this, handler, aaf2)));
        } catch (RuntimeException e) {
            this.f22453b.mo11592b().mo59a(e);
        }
    }
}
