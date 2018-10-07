package p000;

/* renamed from: hvr */
public abstract class hvr {
    /* renamed from: a */
    public Object f7106a;
    /* renamed from: b */
    public boolean f7107b = false;
    /* renamed from: c */
    private final /* synthetic */ hvm f7108c;

    public hvr(hvm hvm, Object obj) {
        this.f7108c = hvm;
        this.f7106a = obj;
    }

    /* renamed from: a */
    protected abstract void mo8204a();

    /* renamed from: a */
    protected abstract void mo8205a(Object obj);

    /* renamed from: c */
    public final void mo8206c() {
        mo8207d();
        synchronized (this.f7108c.f7089h) {
            this.f7108c.f7089h.remove(this);
        }
    }

    /* renamed from: d */
    public final void mo8207d() {
        synchronized (this) {
            this.f7106a = null;
        }
    }
}
