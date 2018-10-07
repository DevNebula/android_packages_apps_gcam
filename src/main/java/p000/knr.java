package p000;

/* compiled from: PG */
/* renamed from: knr */
final class knr implements Runnable {
    /* renamed from: a */
    public final knk f8748a;
    /* renamed from: b */
    public final kpk f8749b;

    knr(knk knk, kpk kpk) {
        this.f8748a = knk;
        this.f8749b = kpk;
    }

    public final void run() {
        if (this.f8748a.value == this) {
            if (knk.f26597c.mo10171a(this.f8748a, (Object) this, knk.m18166a(this.f8749b))) {
                knk.m18168a(this.f8748a);
            }
        }
    }
}
