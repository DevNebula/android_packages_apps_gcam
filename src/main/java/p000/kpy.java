package p000;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: kpy */
public final class kpy implements ThreadFactory {
    /* renamed from: a */
    private final /* synthetic */ ThreadFactory f8779a;
    /* renamed from: b */
    private final /* synthetic */ String f8780b;
    /* renamed from: c */
    private final /* synthetic */ AtomicLong f8781c;
    /* renamed from: d */
    private final /* synthetic */ Boolean f8782d = null;
    /* renamed from: e */
    private final /* synthetic */ Integer f8783e = null;
    /* renamed from: f */
    private final /* synthetic */ UncaughtExceptionHandler f8784f = null;

    public kpy(ThreadFactory threadFactory, String str, AtomicLong atomicLong) {
        this.f8779a = threadFactory;
        this.f8780b = str;
        this.f8781c = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8779a.newThread(runnable);
        String str = this.f8780b;
        if (str != null) {
            newThread.setName(kpx.m5102a(str, Long.valueOf(this.f8781c.getAndIncrement())));
        }
        return newThread;
    }
}
