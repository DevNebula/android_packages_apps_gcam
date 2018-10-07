package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: exh */
public abstract class exh implements exc {
    /* renamed from: a */
    private final ixm f17961a;
    /* renamed from: b */
    private volatile int f17962b;
    /* renamed from: c */
    private final Map f17963c = new HashMap();
    /* renamed from: d */
    private final Object f17964d = new Object();
    /* renamed from: e */
    private volatile boolean f17965e = true;

    public exh(int i) {
        this.f17961a = ion.m4022c(i);
        this.f17962b = i;
    }

    /* renamed from: a */
    protected abstract iqo mo13195a(iqo iqo);

    /* renamed from: d */
    protected abstract Pair mo13197d();

    /* JADX WARNING: Missing block: B:19:0x0039, code:
            r4 = r8.f17964d;
     */
    /* JADX WARNING: Missing block: B:20:0x003b, code:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            r5 = r8.f17963c.keySet().iterator();
     */
    /* JADX WARNING: Missing block: B:24:0x004a, code:
            if (r5.hasNext() == false) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:25:0x004c, code:
            r3 = (java.lang.Runnable) r5.next();
            ((java.util.concurrent.Executor) r8.f17963c.get(r3)).execute(r3);
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:32:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:33:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo6658a() {
        /*
        r8 = this;
        r3 = r8.f17961a;
        monitor-enter(r3);
        r4 = r8.mo13197d();	 Catch:{ all -> 0x0024 }
        if (r4 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
    L_0x000a:
        return;
    L_0x000b:
        r2 = r8.f17965e;	 Catch:{ all -> 0x0024 }
        if (r2 != 0) goto L_0x0027;
    L_0x000f:
        r2 = r8.f17961a;	 Catch:{ all -> 0x0024 }
        r2 = r2.mo9162g();	 Catch:{ all -> 0x0024 }
        r5 = r8.f17962b;	 Catch:{ all -> 0x0024 }
        if (r2 < r5) goto L_0x0027;
    L_0x0019:
        if (r4 == 0) goto L_0x0022;
    L_0x001b:
        r2 = r4.second;	 Catch:{ all -> 0x0024 }
        r2 = (p000.iqo) r2;	 Catch:{ all -> 0x0024 }
        r2.close();	 Catch:{ all -> 0x0024 }
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        goto L_0x000a;
    L_0x0024:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        throw r2;
    L_0x0027:
        r5 = r8.f17961a;	 Catch:{ all -> 0x0024 }
        r2 = r4.first;	 Catch:{ all -> 0x0024 }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x0024 }
        r6 = r2.longValue();	 Catch:{ all -> 0x0024 }
        r2 = r4.second;	 Catch:{ all -> 0x0024 }
        r2 = (p000.iqo) r2;	 Catch:{ all -> 0x0024 }
        r5.mo9155a(r6, r2);	 Catch:{ all -> 0x0024 }
        monitor-exit(r3);	 Catch:{ all -> 0x0024 }
        r4 = r8.f17964d;
        monitor-enter(r4);
        r2 = r8.f17963c;	 Catch:{ all -> 0x0060 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0060 }
        r5 = r2.iterator();	 Catch:{ all -> 0x0060 }
    L_0x0046:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0060 }
        if (r2 == 0) goto L_0x0063;
    L_0x004c:
        r2 = r5.next();	 Catch:{ all -> 0x0060 }
        r0 = r2;
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0060 }
        r3 = r0;
        r2 = r8.f17963c;	 Catch:{ all -> 0x0060 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0060 }
        r2 = (java.util.concurrent.Executor) r2;	 Catch:{ all -> 0x0060 }
        r2.execute(r3);	 Catch:{ all -> 0x0060 }
        goto L_0x0046;
    L_0x0060:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        throw r2;
    L_0x0063:
        monitor-exit(r4);	 Catch:{ all -> 0x0060 }
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: exh.a():void");
    }

    /* renamed from: b */
    private final iqo m10209b(long j) {
        iqo iqo;
        synchronized (this.f17961a) {
            iqo = (iqo) this.f17961a.mo9154a(j);
            iqo = iqo != null ? mo13195a(iqo) : null;
        }
        return iqo;
    }

    /* renamed from: f */
    private final iqo m10210f() {
        iqo iqo;
        synchronized (this.f17961a) {
            iqo = (iqo) this.f17961a.mo9159d();
            iqo = iqo != null ? mo13195a(iqo) : null;
        }
        return iqo;
    }

    /* renamed from: a */
    public final void mo6659a(Runnable runnable, Executor executor) {
        synchronized (this.f17964d) {
            this.f17963c.put(runnable, executor);
        }
    }

    /* renamed from: e */
    public final iqo mo6661c() {
        return (iqo) this.f17961a.mo9161f();
    }

    /* renamed from: a */
    public final boolean mo13196a(int i) {
        boolean a;
        synchronized (this.f17961a) {
            this.f17962b = i;
            a = this.f17961a.mo9156a(i);
        }
        return a;
    }
}
