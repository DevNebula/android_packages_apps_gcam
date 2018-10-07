package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: abq */
public final class abq {
    /* renamed from: a */
    private static final aby f165a = new aby("CamStateHolder");
    /* renamed from: b */
    private int f166b;
    /* renamed from: c */
    private boolean f167c;

    public abq() {
        this(0);
    }

    public abq(byte b) {
        this(0);
    }

    private abq(char c) {
        this((short) 0);
    }

    private abq(short s) {
        mo78a(1);
        this.f167c = false;
    }

    private abq(int i) {
        this((short) 0);
    }

    /* renamed from: a */
    public final synchronized int mo77a() {
        return this.f166b;
    }

    /* renamed from: b */
    public final synchronized void mo79b() {
        this.f167c = true;
    }

    /* renamed from: c */
    public final synchronized boolean mo81c() {
        return this.f167c;
    }

    /* renamed from: a */
    public final synchronized void mo78a(int i) {
        if (this.f166b != i) {
            aby aby = f165a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setState - state = ");
            stringBuilder.append(Integer.toBinaryString(i));
            abx.m90d(aby, stringBuilder.toString());
        }
        this.f166b = i;
        notifyAll();
    }

    /* renamed from: a */
    private final boolean m73a(abr abr) {
        long uptimeMillis = SystemClock.uptimeMillis() + 3500;
        synchronized (this) {
            while ((abr.f168a | abr.f169b.mo77a()) != abr.f168a) {
                try {
                    wait(3500);
                } catch (InterruptedException e) {
                    if (SystemClock.uptimeMillis() > uptimeMillis) {
                        abx.m91e(f165a, "Timeout waiting.");
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo80b(int i) {
        aby aby = f165a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("waitForStates - states = ");
        stringBuilder.append(Integer.toBinaryString(i));
        abx.m90d(aby, stringBuilder.toString());
        return m73a(new abr(this, i));
    }
}
