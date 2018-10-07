package p000;

/* compiled from: PG */
/* renamed from: a */
public class C0626a extends C0202e {
    /* renamed from: b */
    private static volatile C0626a f10107b;
    /* renamed from: a */
    public C0202e f10108a = this.f10109c;
    /* renamed from: c */
    private C0202e f10109c = new C0666d();

    static {
        C0053b c0053b = new C0053b();
        C0070c c0070c = new C0070c();
    }

    private C0626a() {
    }

    /* renamed from: a */
    public final void mo6151a(Runnable runnable) {
        this.f10108a.mo6151a(runnable);
    }

    /* renamed from: a */
    public static C0626a m6333a() {
        if (f10107b != null) {
            return f10107b;
        }
        synchronized (C0626a.class) {
            if (f10107b == null) {
                f10107b = new C0626a();
            }
        }
        return f10107b;
    }

    /* renamed from: b */
    public final boolean mo6153b() {
        return this.f10108a.mo6153b();
    }

    /* renamed from: b */
    public final void mo6152b(Runnable runnable) {
        this.f10108a.mo6152b(runnable);
    }
}
