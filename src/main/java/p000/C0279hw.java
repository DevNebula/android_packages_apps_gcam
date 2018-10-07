package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hw */
final class C0279hw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f7121a;
    /* renamed from: b */
    private final /* synthetic */ Callable f7122b;
    /* renamed from: c */
    private final /* synthetic */ ReentrantLock f7123c;
    /* renamed from: d */
    private final /* synthetic */ AtomicBoolean f7124d;
    /* renamed from: e */
    private final /* synthetic */ Condition f7125e;

    C0279hw(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f7121a = atomicReference;
        this.f7122b = callable;
        this.f7123c = reentrantLock;
        this.f7124d = atomicBoolean;
        this.f7125e = condition;
    }

    public final void run() {
        try {
            this.f7121a.set(this.f7122b.call());
        } catch (Exception e) {
        }
        this.f7123c.lock();
        try {
            this.f7124d.set(false);
            this.f7125e.signal();
        } finally {
            this.f7123c.unlock();
        }
    }
}
