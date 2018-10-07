package p000;

/* compiled from: PG */
/* renamed from: jln */
final class jln implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f8282a;
    /* renamed from: b */
    private final /* synthetic */ jlm f8283b;

    jln(jlm jlm, Runnable runnable) {
        this.f8283b = jlm;
        this.f8282a = runnable;
    }

    public final void run() {
        if (this.f8283b.mo13820a(this.f8282a)) {
            this.f8282a.run();
        }
    }
}
