package p000;

/* compiled from: PG */
/* renamed from: bct */
final class bct implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bcs f1103a;

    bct(bcs bcs) {
        this.f1103a = bcs;
    }

    public final void run() {
        aws aws = this.f1103a.f11180b;
        if (aws == null || !aws.mo1828e()) {
            try {
                this.f1103a.mo12354c();
                return;
            } catch (Throwable e) {
                this.f1103a.f11181c.mo15642a(e);
                return;
            }
        }
        bli.m898e(bcs.f11179a, "Pre-initialization failed, the activity is not in the foreground.");
        this.f1103a.f11181c.mo15641a(Boolean.valueOf(false));
    }
}
