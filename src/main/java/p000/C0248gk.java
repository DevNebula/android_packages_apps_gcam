package p000;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gk */
public abstract class C0248gk {
    /* renamed from: a */
    private static final ThreadFactory f5508a = new C0249gl();
    /* renamed from: b */
    public static final Executor f5509b;
    /* renamed from: h */
    private static final BlockingQueue f5510h = new LinkedBlockingQueue(10);
    /* renamed from: i */
    private static C0251gn f5511i;
    /* renamed from: j */
    private static volatile Executor f5512j;
    /* renamed from: c */
    public final C0253gp f5513c = new C0253gp(this);
    /* renamed from: d */
    public final FutureTask f5514d = new C0250gm(this, this.f5513c);
    /* renamed from: e */
    public volatile int f5515e = C0252go.f5801a;
    /* renamed from: f */
    public final AtomicBoolean f5516f = new AtomicBoolean();
    /* renamed from: g */
    public final AtomicBoolean f5517g = new AtomicBoolean();

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f5510h, f5508a);
        f5509b = threadPoolExecutor;
        f5512j = threadPoolExecutor;
    }

    /* renamed from: a */
    protected abstract Object mo7153a();

    C0248gk() {
    }

    /* renamed from: d */
    private static Handler m2625d() {
        Handler handler;
        synchronized (C0248gk.class) {
            if (f5511i == null) {
                f5511i = new C0251gn();
            }
            handler = f5511i;
        }
        return handler;
    }

    /* renamed from: b */
    protected void mo7156b() {
    }

    /* renamed from: a */
    protected void mo7154a(Object obj) {
    }

    /* renamed from: c */
    protected static void m2624c() {
    }

    /* renamed from: b */
    final Object mo7155b(Object obj) {
        C0248gk.m2625d().obtainMessage(1, new C0351ll(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: c */
    final void mo7157c(Object obj) {
        if (!this.f5517g.get()) {
            mo7155b(obj);
        }
    }
}
