package p000;

/* compiled from: PG */
/* renamed from: dcp */
final class dcp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fbj f3195a;
    /* renamed from: b */
    private final /* synthetic */ cwc f3196b;
    /* renamed from: c */
    private final /* synthetic */ dch f3197c;

    dcp(dch dch, fbj fbj, cwc cwc) {
        this.f3197c = dch;
        this.f3195a = fbj;
        this.f3196b = cwc;
    }

    public final void run() {
        this.f3197c.f1623a.mo2154a(new daw(this.f3195a, this.f3196b));
    }
}
