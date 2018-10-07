package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imk */
public final class imk implements Executor {
    /* renamed from: a */
    private final Object f7461a = new Object();
    /* renamed from: b */
    private boolean f7462b = false;
    /* renamed from: c */
    private final Queue f7463c = new LinkedList();

    /* JADX WARNING: Missing block: B:9:0x0012, code:
            if (r4 == null) goto L_0x000d;
     */
    /* JADX WARNING: Missing block: B:10:0x0014, code:
            r4.run();
            r1 = r3.f7461a;
     */
    /* JADX WARNING: Missing block: B:11:0x0019, code:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:13:?, code:
            r0 = (java.lang.Runnable) r3.f7463c.poll();
     */
    /* JADX WARNING: Missing block: B:14:0x0022, code:
            if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:15:0x0024, code:
            r3.f7462b = false;
     */
    /* JADX WARNING: Missing block: B:16:0x0027, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:17:0x0028, code:
            r4 = r0;
     */
    /* JADX WARNING: Missing block: B:34:?, code:
            return;
     */
    public final void execute(java.lang.Runnable r4) {
        /*
        r3 = this;
        r1 = r3.f7461a;
        monitor-enter(r1);
        r0 = r3.f7462b;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x000e;
    L_0x0007:
        r0 = r3.f7463c;	 Catch:{ all -> 0x002a }
        r0.add(r4);	 Catch:{ all -> 0x002a }
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
    L_0x000d:
        return;
    L_0x000e:
        r0 = 1;
        r3.f7462b = r0;	 Catch:{ all -> 0x002a }
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
    L_0x0012:
        if (r4 == 0) goto L_0x000d;
    L_0x0014:
        r4.run();
        r1 = r3.f7461a;
        monitor-enter(r1);
        r0 = r3.f7463c;	 Catch:{ all -> 0x002d }
        r0 = r0.poll();	 Catch:{ all -> 0x002d }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0027;
    L_0x0024:
        r2 = 0;
        r3.f7462b = r2;	 Catch:{ all -> 0x002d }
    L_0x0027:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        r4 = r0;
        goto L_0x0012;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002a }
        throw r0;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: imk.execute(java.lang.Runnable):void");
    }
}
