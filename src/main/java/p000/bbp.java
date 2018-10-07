package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bbp */
public final class bbp implements bbf, bbh, iqo {
    /* renamed from: a */
    private final Object f22555a;
    /* renamed from: b */
    private final BlockingQueue f22556b;
    /* renamed from: c */
    private final AtomicBoolean f22557c;
    /* renamed from: d */
    private final bbs f22558d;

    public bbp() {
        this(new bbq());
    }

    public bbp(bbs bbs) {
        this.f22558d = bbs;
        this.f22555a = new Object();
        this.f22556b = new LinkedBlockingQueue();
        this.f22557c = new AtomicBoolean();
    }

    /* JADX WARNING: Missing block: B:15:0x0031, code:
            r3 = r2.size();
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code:
            if (r0 >= r3) goto L_0x0012;
     */
    /* JADX WARNING: Missing block: B:17:0x0038, code:
            r1 = r0 + 1;
            r0 = (p000.bbr) r2.get(r0);
     */
    /* JADX WARNING: Missing block: B:18:0x0042, code:
            if (r0.f1096b != false) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:19:0x0044, code:
            r6.f22558d.mo1896a(r0.f1095a);
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:20:0x004d, code:
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:26:?, code:
            return;
     */
    public final void close() {
        /*
        r6 = this;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r6.f22555a;
        monitor-enter(r1);
        r0 = r6.f22557c;	 Catch:{ all -> 0x002d }
        r3 = 1;
        r0 = r0.getAndSet(r3);	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r6.f22556b;	 Catch:{ all -> 0x002d }
        r0.drainTo(r2);	 Catch:{ all -> 0x002d }
    L_0x0018:
        r0 = r6.f22556b;	 Catch:{ all -> 0x002d }
        r0 = r0.peek();	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0030;
    L_0x0020:
        r0 = r6.f22556b;	 Catch:{ all -> 0x002d }
        r3 = new bbr;	 Catch:{ all -> 0x002d }
        r4 = 0;
        r5 = 1;
        r3.<init>(r4, r5);	 Catch:{ all -> 0x002d }
        r0.add(r3);	 Catch:{ all -> 0x002d }
        goto L_0x0018;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        r3 = r2.size();
        r0 = 0;
    L_0x0036:
        if (r0 >= r3) goto L_0x0012;
    L_0x0038:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.bbr) r0;
        r4 = r0.f1096b;
        if (r4 != 0) goto L_0x004d;
    L_0x0044:
        r4 = r6.f22558d;
        r0 = r0.f1095a;
        r4.mo1896a(r0);
        r0 = r1;
        goto L_0x0036;
    L_0x004d:
        r0 = r1;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbp.close():void");
    }

    /* renamed from: a */
    public final Object mo12344a() {
        bbr bbr = (bbr) this.f22556b.take();
        if (!bbr.f1096b) {
            return bbr.f1095a;
        }
        this.f22556b.add(bbr);
        throw new bbg();
    }

    /* renamed from: b */
    public final boolean mo12345b() {
        return this.f22557c.get();
    }

    /* renamed from: c */
    public final Object mo12346c() {
        bbr bbr = (bbr) this.f22556b.poll();
        if (bbr == null) {
            return null;
        }
        if (!bbr.f1096b) {
            return bbr.f1095a;
        }
        this.f22556b.add(bbr);
        return null;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        boolean z;
        synchronized (this.f22555a) {
            z = this.f22557c.get();
            if (!z) {
                this.f22556b.add(new bbr(obj, false));
            }
        }
        if (z) {
            this.f22558d.mo1896a(obj);
        }
    }
}
