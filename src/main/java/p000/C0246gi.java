package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: gi */
final class C0246gi extends Handler {
    /* renamed from: a */
    private final /* synthetic */ C0245gh f5439a;

    C0246gi(C0245gh c0245gh, Looper looper) {
        this.f5439a = c0245gh;
        super(looper);
    }

    /* JADX WARNING: Missing block: B:16:0x002a, code:
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:18:0x002c, code:
            if (r1 >= r5.length) goto L_0x000d;
     */
    /* JADX WARNING: Missing block: B:19:0x002e, code:
            r6 = r8.size();
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:20:0x0033, code:
            if (r3 >= r6) goto L_0x004a;
     */
    /* JADX WARNING: Missing block: B:21:0x0035, code:
            r0 = (p000.C0247gj) r8.get(r3);
     */
    /* JADX WARNING: Missing block: B:22:0x003d, code:
            if (r0.f5501c != false) goto L_0x0046;
     */
    /* JADX WARNING: Missing block: B:23:0x003f, code:
            r0.f5500b.onReceive(r4.f5424a, r8);
     */
    /* JADX WARNING: Missing block: B:24:0x0046, code:
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:25:0x004a, code:
            r1 = r1 + 1;
     */
    public final void handleMessage(android.os.Message r10) {
        /*
        r9 = this;
        r2 = 0;
        r8 = 0;
        r0 = r10.what;
        switch(r0) {
            case 1: goto L_0x000b;
            default: goto L_0x0007;
        };
    L_0x0007:
        super.handleMessage(r10);
    L_0x000a:
        return;
    L_0x000b:
        r4 = r9.f5439a;
    L_0x000d:
        r1 = r4.f5425b;
        monitor-enter(r1);
        r0 = r4.f5427d;	 Catch:{ all -> 0x001a }
        r0 = r0.size();	 Catch:{ all -> 0x001a }
        if (r0 > 0) goto L_0x001d;
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x000a;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r5 = new p000.C0351ll[r0];	 Catch:{ all -> 0x001a }
        r0 = r4.f5427d;	 Catch:{ all -> 0x001a }
        r0.toArray(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f5427d;	 Catch:{ all -> 0x001a }
        r0.clear();	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r1 = r2;
    L_0x002b:
        r0 = r5.length;
        if (r1 >= r0) goto L_0x000d;
    L_0x002e:
        r6 = r8.size();
        r3 = r2;
    L_0x0033:
        if (r3 >= r6) goto L_0x004a;
    L_0x0035:
        r0 = r8.get(r3);
        r0 = (p000.C0247gj) r0;
        r7 = r0.f5501c;
        if (r7 != 0) goto L_0x0046;
    L_0x003f:
        r0 = r0.f5500b;
        r7 = r4.f5424a;
        r0.onReceive(r7, r8);
    L_0x0046:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0033;
    L_0x004a:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.handleMessage(android.os.Message):void");
    }
}
