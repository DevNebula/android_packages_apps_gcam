package p000;

/* compiled from: PG */
/* renamed from: fxt */
final class fxt {
    /* renamed from: a */
    public final int f5035a;
    /* renamed from: b */
    public final bcp f5036b = bcp.m15005d();
    /* renamed from: c */
    public Exception f5037c;
    /* renamed from: d */
    public bbo f5038d;
    /* renamed from: e */
    public final /* synthetic */ fxr f5039e;

    fxt(fxr fxr, int i) {
        this.f5039e = fxr;
        this.f5035a = i;
    }

    /* renamed from: a */
    final void mo6940a() {
        boolean z = true;
        Exception exception = this.f5037c;
        if (exception != null) {
            if (this.f5038d != null) {
                z = false;
            }
            jri.m13405b(z);
            this.f5036b.mo14559a(new fys((Throwable) jqk.m13354c(this.f5037c)));
        } else if (this.f5038d != null) {
            if (exception != null) {
                z = false;
            }
            jri.m13405b(z);
            iqo iqo = this.f5038d;
            jri.m13404b((Object) iqo);
            this.f5036b.mo14558a(iqo);
        } else {
            throw new IllegalStateException("No result set");
        }
    }
}
