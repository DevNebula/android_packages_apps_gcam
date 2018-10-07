package p000;

/* compiled from: PG */
/* renamed from: eug */
public final class eug implements eyu {
    /* renamed from: a */
    public final kbn f17815a;
    /* renamed from: b */
    public kge f17816b;
    /* renamed from: c */
    public boolean f17817c = false;
    /* renamed from: d */
    public boolean f17818d;
    /* renamed from: e */
    public final kpw f17819e = kpw.m18486d();
    /* renamed from: f */
    public final long f17820f;
    /* renamed from: g */
    public final kpw f17821g = kpw.m18486d();
    /* renamed from: h */
    private final /* synthetic */ etx f17822h;

    eug(etx etx, kbn kbn, kge kge, long j) {
        this.f17822h = etx;
        this.f17815a = kbn;
        this.f17816b = kge;
        this.f17820f = j;
    }

    /* renamed from: a */
    public final void mo6683a() {
        synchronized (this.f17822h.f17803c) {
            if (this.f17818d) {
                bli.m899e(etx.f17801a, "Cancelling session twice", new Throwable());
            } else if (this.f17816b.mo14038a()) {
                bli.m898e(etx.f17801a, "Cancelling session that already ended");
            } else {
                this.f17818d = true;
                this.f17822h.mo13188b();
                this.f17819e.cancel(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo6684a(long j) {
        synchronized (this.f17822h.f17803c) {
            if (this.f17816b.mo14038a()) {
                bli.m898e(etx.f17801a, "Ending session twice");
            } else if (this.f17818d) {
                bli.m898e(etx.f17801a, "Ending already cancelled session");
            } else {
                this.f17816b = kge.m13750a((Long) this.f17816b.f21895a.mo9812a(), Long.valueOf(j));
                this.f17822h.mo13188b();
                this.f17822h.f17802b.mo6594c();
            }
        }
    }
}
