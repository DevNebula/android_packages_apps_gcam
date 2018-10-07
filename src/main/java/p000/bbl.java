package p000;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* renamed from: bbl */
public final class bbl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bbi f1090a;
    /* renamed from: b */
    private final /* synthetic */ CountDownLatch f1091b;

    public bbl(bbi bbi, CountDownLatch countDownLatch) {
        this.f1090a = bbi;
        this.f1091b = countDownLatch;
    }

    public final void run() {
        if (this.f1090a.mo12350b()) {
            this.f1091b.countDown();
        }
    }
}
