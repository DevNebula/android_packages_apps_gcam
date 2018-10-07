package p000;

/* compiled from: PG */
/* renamed from: bih */
final class bih implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bie f1215a;

    bih(bie bie) {
        this.f1215a = bie;
    }

    public final void run() {
        if (((Integer) this.f1215a.f11432e.mo13673b()).intValue() == 0) {
            bie bie = this.f1215a;
            bie.f11435h.f10785b = null;
            bie.f11437j.mo15641a(null);
            return;
        }
        bli.m888a(bie.f11428a, "onSceneChanged while ev comp is set, ignoring");
    }
}
