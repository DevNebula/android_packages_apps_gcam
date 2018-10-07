package p000;

/* renamed from: jgr */
final /* synthetic */ class jgr implements Runnable {
    /* renamed from: a */
    private final jgp f8177a;
    /* renamed from: b */
    private final jgu f8178b;
    /* renamed from: c */
    private final jhl f8179c;

    jgr(jgp jgp, jgu jgu, jhl jhl) {
        this.f8177a = jgp;
        this.f8178b = jgu;
        this.f8179c = jhl;
    }

    public final void run() {
        jgp jgp = this.f8177a;
        jgu jgu = this.f8178b;
        jhl jhl = this.f8179c;
        synchronized (jgp.f24742a) {
            for (jgy a : jgu.f21473b) {
                jgp.mo15041a(jhl, a);
            }
        }
    }
}
