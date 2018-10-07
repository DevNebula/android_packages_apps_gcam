package p000;

/* compiled from: PG */
/* renamed from: ad */
final class C0001ad implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0000ac f290a;

    C0001ad(C0000ac c0000ac) {
        this.f290a = c0000ac;
    }

    public final void run() {
        Object access$100;
        synchronized (this.f290a.mDataLock) {
            access$100 = this.f290a.mPendingData;
            this.f290a.mPendingData = C0000ac.NOT_SET;
        }
        this.f290a.setValue(access$100);
    }
}
