package p000;

/* compiled from: PG */
/* renamed from: jei */
final class jei implements jdo {
    /* renamed from: a */
    private final jdo f26562a;

    public jei(jdo jdo) {
        this.f26562a = jdo;
    }

    public final void close() {
        this.f26562a.close();
    }

    /* renamed from: a */
    public final jas mo13767a() {
        return this.f26562a.mo9286a();
    }

    public final void execute(Runnable runnable) {
        this.f26562a.execute(new jej(runnable));
    }

    /* renamed from: d */
    public final jfj mo15032d() {
        return this.f26562a.mo15032d();
    }

    /* renamed from: e */
    public final boolean mo15033e() {
        return this.f26562a.mo15033e();
    }

    /* renamed from: f */
    public final jdk mo15034f() {
        return this.f26562a.mo15034f();
    }
}
