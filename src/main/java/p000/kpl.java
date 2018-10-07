package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: kpl */
public final class kpl extends FutureTask implements kpk {
    /* renamed from: a */
    private final koo f21946a = new koo();

    private kpl(Callable callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo10200a(Runnable runnable, Executor executor) {
        koo koo = this.f21946a;
        jri.m13391a((Object) runnable, (Object) "Runnable was null.");
        jri.m13391a((Object) executor, (Object) "Executor was null.");
        synchronized (koo) {
            if (koo.f8760b) {
                koo.m5084a(runnable, executor);
                return;
            }
            koo.f8759a = new kop(runnable, executor, koo.f8759a);
        }
    }

    /* renamed from: a */
    public static kpl m13884a(Callable callable) {
        return new kpl(callable);
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code:
            if (r1 == null) goto L_0x001c;
     */
    /* JADX WARNING: Missing block: B:9:0x0015, code:
            r2 = r1.f8763c;
            r1.f8763c = r0;
            r0 = r1;
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:10:0x001c, code:
            if (r0 == null) goto L_0x0009;
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code:
            p000.koo.m5084a(r0.f8761a, r0.f8762b);
            r0 = r0.f8763c;
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            return;
     */
    protected final void done() {
        /*
        r4 = this;
        r0 = 0;
        r2 = r4.f21946a;
        monitor-enter(r2);
        r1 = r2.f8760b;	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
    L_0x0009:
        return;
    L_0x000a:
        r1 = 1;
        r2.f8760b = r1;	 Catch:{ all -> 0x0028 }
        r1 = r2.f8759a;	 Catch:{ all -> 0x0028 }
        r3 = 0;
        r2.f8759a = r3;	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
    L_0x0013:
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r1.f8763c;
        r1.f8763c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0013;
    L_0x001c:
        if (r0 == 0) goto L_0x0009;
    L_0x001e:
        r1 = r0.f8761a;
        r2 = r0.f8762b;
        p000.koo.m5084a(r1, r2);
        r0 = r0.f8763c;
        goto L_0x001c;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kpl.done():void");
    }
}
