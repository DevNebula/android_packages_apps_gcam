package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bid */
final class bid implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Surface f1210a;
    /* renamed from: b */
    private final /* synthetic */ bhj f1211b;
    /* renamed from: c */
    private final /* synthetic */ bhs f1212c;
    /* renamed from: d */
    private final /* synthetic */ kpw f1213d;
    /* renamed from: e */
    private final /* synthetic */ bic f1214e;

    bid(bic bic, Surface surface, bhj bhj, bhs bhs, kpw kpw) {
        this.f1214e = bic;
        this.f1210a = surface;
        this.f1211b = bhj;
        this.f1212c = bhs;
        this.f1213d = kpw;
    }

    /* JADX WARNING: Missing block: B:8:0x0016, code:
            if (r5.f1214e.f11424d.isValid() == false) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:10:0x001e, code:
            if (r5.f1210a.isValid() == false) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:11:0x0020, code:
            p000.bli.m888a(p000.bic.f11421a, "Send recording command");
     */
    /* JADX WARNING: Missing block: B:13:?, code:
            r0 = r5.f1214e.f11422b.mo1956b(r5.f1211b);
            r0.mo9135a(r5.f1214e.f11424d);
            r0.mo9135a(r5.f1210a);
            r5.f1211b.mo12379a(p000.fiv.REPEATING, r0, r5.f1214e.f11423c, r5.f1212c);
            r5.f1213d.mo15641a(null);
     */
    /* JADX WARNING: Missing block: B:14:0x0051, code:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:16:0x0058, code:
            p000.bli.m896d(p000.bic.f11421a, "recording surface is already closed");
     */
    /* JADX WARNING: Missing block: B:17:0x0060, code:
            p000.bli.m896d(p000.bic.f11421a, "preview surface is already closed");
     */
    /* JADX WARNING: Missing block: B:22:0x006b, code:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:28:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:29:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            return;
     */
    public final void run() {
        /*
        r5 = this;
        r0 = r5.f1214e;
        r1 = r0.f11425e;
        monitor-enter(r1);
        r0 = r5.f1214e;	 Catch:{ all -> 0x0068 }
        r0 = r0.f11426f;	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
    L_0x000c:
        return;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        r0 = r5.f1214e;
        r0 = r0.f11424d;
        r0 = r0.isValid();
        if (r0 == 0) goto L_0x0060;
    L_0x0018:
        r0 = r5.f1210a;
        r0 = r0.isValid();
        if (r0 == 0) goto L_0x0058;
    L_0x0020:
        r0 = p000.bic.f11421a;
        r1 = "Send recording command";
        p000.bli.m888a(r0, r1);
        r0 = r5.f1214e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r0.f11422b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1211b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r0.mo1956b(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1214e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r1.f11424d;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0.mo9135a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1210a;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0.mo9135a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = r5.f1211b;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r2 = p000.fiv.REPEATING;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r3 = r5.f1214e;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r3 = r3.f11423c;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r4 = r5.f1212c;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1.mo12379a(r2, r0, r3, r4);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r0 = r5.f1213d;	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        r1 = 0;
        r0.mo15641a(r1);	 Catch:{ isr -> 0x0051, UnsupportedOperationException -> 0x006b }
        goto L_0x000c;
    L_0x0051:
        r0 = move-exception;
    L_0x0052:
        r1 = r5.f1213d;
        r1.mo15642a(r0);
        goto L_0x000c;
    L_0x0058:
        r0 = p000.bic.f11421a;
        r1 = "recording surface is already closed";
        p000.bli.m896d(r0, r1);
        goto L_0x000c;
    L_0x0060:
        r0 = p000.bic.f11421a;
        r1 = "preview surface is already closed";
        p000.bli.m896d(r0, r1);
        goto L_0x000c;
    L_0x0068:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0068 }
        throw r0;
    L_0x006b:
        r0 = move-exception;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: bid.run():void");
    }
}
