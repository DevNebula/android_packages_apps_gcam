package p000;

/* compiled from: PG */
/* renamed from: sl */
final class C0477sl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0754sk f9723a;

    C0477sl(C0754sk c0754sk) {
        this.f9723a = c0754sk;
    }

    public final void run() {
        C0754sk c0754sk = this.f9723a;
        switch (c0754sk.f22282o) {
            case 1:
                c0754sk.f22281n.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        c0754sk.f22282o = 3;
        c0754sk.f22281n.setFloatValues(new float[]{((Float) c0754sk.f22281n.getAnimatedValue()).floatValue(), 0.0f});
        c0754sk.f22281n.setDuration(500);
        c0754sk.f22281n.start();
    }
}
