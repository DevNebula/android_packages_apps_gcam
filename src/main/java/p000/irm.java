package p000;

/* compiled from: PG */
/* renamed from: irm */
final class irm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ irl f7729a;

    irm(irl irl) {
        this.f7729a = irl;
    }

    public final void run() {
        irl irl = this.f7729a;
        ird ird = irl.f21221b;
        String valueOf = String.valueOf(irl.f21220a);
        String str = "OpenCamera#";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        ird.mo8856a(valueOf);
        this.f7729a.mo13703a().mo13706a(this.f7729a.f21223d);
        this.f7729a.f21221b.mo8857b();
    }
}
