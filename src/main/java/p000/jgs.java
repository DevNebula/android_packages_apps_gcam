package p000;

/* renamed from: jgs */
final /* synthetic */ class jgs implements Runnable {
    /* renamed from: a */
    private final jhl f8180a;
    /* renamed from: b */
    private final jgy f8181b;

    jgs(jhl jhl, jgy jgy) {
        this.f8180a = jhl;
        this.f8181b = jgy;
    }

    public final void run() {
        Object obj = null;
        jhl jhl = this.f8180a;
        jgy jgy = this.f8181b;
        long j = jgy.f8185b.presentationTimeUs;
        if (j >= jhl.f8202b && !jhl.mo9433a(j)) {
            obj = 1;
        }
        if (obj != null) {
            ((jhf) jhl.f8201a).mo9430a(jgy.f8184a, jgy.f8185b);
            jgy.f8184a.rewind();
        } else if (jhl.mo9433a(jgy.f8185b.presentationTimeUs)) {
            ((jhf) jhl.f8201a).close();
        }
    }
}
