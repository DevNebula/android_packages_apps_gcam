package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: yo */
final class C0796yo extends C0619zs {
    /* renamed from: a */
    public static final aby f22440a = new aby("AndCamAgntImp");
    /* renamed from: j */
    private static final abi f22441j = new C0797yp();
    /* renamed from: b */
    public abh f22442b;
    /* renamed from: c */
    public C0803zo f22443c;
    /* renamed from: d */
    public final C0802zf f22444d;
    /* renamed from: e */
    public final abq f22445e;
    /* renamed from: f */
    public final abs f22446f;
    /* renamed from: g */
    public abi f22447g = f22441j;
    /* renamed from: h */
    private final HandlerThread f22448h = new HandlerThread("Camera Handler Thread");

    C0796yo() {
        this.f22448h.start();
        this.f22444d = new C0802zf(this, this, this.f22448h.getLooper());
        this.f22447g = new abi(this.f22444d);
        this.f22445e = new abq((byte) 0);
        this.f22446f = new abs(this.f22444d, this.f22448h);
        this.f22446f.start();
    }

    /* renamed from: a */
    public final abg mo11589a() {
        return C0798ys.m14845b();
    }

    /* renamed from: b */
    protected final abi mo11592b() {
        return this.f22447g;
    }

    /* renamed from: c */
    protected final Handler mo11593c() {
        return this.f22444d;
    }

    /* renamed from: d */
    protected final abq mo11594d() {
        return this.f22445e;
    }

    /* renamed from: e */
    protected final abs mo11595e() {
        return this.f22446f;
    }

    /* renamed from: f */
    public final void mo11596f() {
        mo11591a(true);
        abs abs = this.f22446f;
        synchronized (abs.f172b) {
            abs.f172b = Boolean.valueOf(true);
        }
        synchronized (abs.f171a) {
            abs.f171a.notifyAll();
        }
        this.f22445e.mo79b();
    }

    /* renamed from: a */
    public final void mo11590a(abi abi) {
        this.f22447g = abi;
    }
}
