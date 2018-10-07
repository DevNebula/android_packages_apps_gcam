package p000;

import android.os.Process;

/* compiled from: PG */
/* renamed from: ijj */
public final class ijj extends Thread {
    /* renamed from: a */
    private final int f7401a;

    private ijj(int i, Runnable runnable) {
        super(runnable);
        this.f7401a = i;
    }

    public ijj(int i, Runnable runnable, String str) {
        this(i, runnable);
        setName(str);
    }

    public final void run() {
        Process.setThreadPriority(this.f7401a);
        super.run();
    }
}
