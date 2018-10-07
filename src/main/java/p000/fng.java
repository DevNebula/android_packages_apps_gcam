package p000;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: fng */
public final class fng implements iqo {
    /* renamed from: a */
    private final Object f18482a = new Object();
    /* renamed from: b */
    private Queue f18483b;
    /* renamed from: c */
    private final /* synthetic */ fmw f18484c;

    fng(fmw fmw, Collection collection) {
        this.f18484c = fmw;
        this.f18483b = new ArrayDeque(collection);
    }

    public final void close() {
        bbo bbo = new bbo();
        synchronized (this.f18482a) {
            bbo.addAll(this.f18483b);
            this.f18483b.clear();
        }
        bbo.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A:{Catch:{ all -> 0x0021 }} */
    /* renamed from: a */
    private final p000.fnf m10723a(long r8) {
        /*
        r7 = this;
        r2 = r7.f18482a;
        monitor-enter(r2);
        r0 = r7.f18483b;	 Catch:{ all -> 0x0021 }
        r0 = r0.poll();	 Catch:{ all -> 0x0021 }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x0021 }
        r1 = "Cannot create more images than were reserved, or create images after closed";
        p000.jri.m13391a(r0, r1);	 Catch:{ all -> 0x002f }
        r1 = r7.f18484c;	 Catch:{ all -> 0x002f }
        r1 = r1.f18472b;	 Catch:{ all -> 0x002f }
        r1 = r1.mo13756a(r8);	 Catch:{ all -> 0x002f }
        r3 = new fmy;	 Catch:{ all -> 0x002f }
        r4 = r7.f18484c;	 Catch:{ all -> 0x002f }
        r3.<init>(r4, r1, r0);	 Catch:{ all -> 0x002f }
        monitor-exit(r2);	 Catch:{ all -> 0x002c }
        return r3;
    L_0x0021:
        r0 = move-exception;
        r1 = 0;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0026:
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r0.close();	 Catch:{ all -> 0x002c }
    L_0x002b:
        throw r1;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x002c }
        throw r0;
    L_0x002f:
        r1 = move-exception;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: fng.a(long):fnf");
    }

    /* renamed from: a */
    public final fnf mo13264a(long j, iwz iwz) {
        try {
            Object a = m10723a(j);
            iuw.m4317a(iwz, a);
            fnf fnf = (fnf) jri.m13404b(a);
            return fnf;
        } finally {
            iwz.close();
        }
    }
}
