package p000;

import android.os.Process;

/* renamed from: iab */
final class iab implements Runnable {
    /* renamed from: a */
    private final Runnable f7234a;
    /* renamed from: b */
    private final int f7235b = 0;

    public iab(Runnable runnable, int i) {
        this.f7234a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f7235b);
        this.f7234a.run();
    }
}
