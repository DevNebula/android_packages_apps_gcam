package p000;

import java.util.Queue;

/* renamed from: ifz */
public final class ifz {
    /* renamed from: a */
    public final Object f7362a = new Object();
    /* renamed from: b */
    public Queue f7363b;
    /* renamed from: c */
    private boolean f7364c;

    ifz() {
    }

    /* JADX WARNING: Missing block: B:9:0x000f, code:
            r1 = r3.f7362a;
     */
    /* JADX WARNING: Missing block: B:10:0x0011, code:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:?, code:
            r0 = (p000.ify) r3.f7363b.poll();
     */
    /* JADX WARNING: Missing block: B:13:0x001a, code:
            if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:14:0x001c, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:15:0x001d, code:
            r1 = r0.f7360b;
     */
    /* JADX WARNING: Missing block: B:16:0x001f, code:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:19:0x0022, code:
            if (r0.f7361c == null) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:20:0x0024, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:21:0x0025, code:
            r0.f7359a.execute(new p000.ifx(r0, r4));
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            r3.f7364c = false;
     */
    /* JADX WARNING: Missing block: B:31:0x0038, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:48:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo8434a(p000.ifv r4) {
        /*
        r3 = this;
        r1 = r3.f7362a;
        monitor-enter(r1);
        r0 = r3.f7363b;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x003a;
    L_0x0007:
        r0 = r3.f7364c;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x003a;
    L_0x000b:
        r0 = 1;
        r3.f7364c = r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
    L_0x000f:
        r1 = r3.f7362a;
        monitor-enter(r1);
        r0 = r3.f7363b;	 Catch:{ all -> 0x003f }
        r0 = r0.poll();	 Catch:{ all -> 0x003f }
        r0 = (p000.ify) r0;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0035;
    L_0x001c:
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        r1 = r0.f7360b;
        monitor-enter(r1);
        r2 = r0.f7361c;	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x0030;
    L_0x0024:
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        r1 = r0.f7359a;
        r2 = new ifx;
        r2.<init>(r0, r4);
        r1.execute(r2);
        goto L_0x000f;
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        goto L_0x000f;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        throw r0;
    L_0x0035:
        r0 = 0;
        r3.f7364c = r0;	 Catch:{ all -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
    L_0x0039:
        return;
    L_0x003a:
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        goto L_0x0039;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ifz.a(ifv):void");
    }
}
