package p000;

import android.graphics.Bitmap;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fwd */
public final class fwd implements fwb {
    /* renamed from: c */
    private static final String f24314c = bli.m887a("ProcProgress");
    /* renamed from: a */
    public final fbk f24315a;
    /* renamed from: b */
    public final gkr f24316b;
    /* renamed from: d */
    private final bpn f24317d;
    /* renamed from: e */
    private final ikd f24318e;
    /* renamed from: f */
    private final Object f24319f = new Object();
    /* renamed from: g */
    private boolean f24320g = false;
    /* renamed from: h */
    private boolean f24321h = false;
    /* renamed from: i */
    private boolean f24322i = false;
    /* renamed from: j */
    private boolean f24323j = false;
    /* renamed from: k */
    private boolean f24324k = false;

    public fwd(fbk fbk, gkr gkr, ikd ikd, bpn bpn) {
        this.f24315a = fbk;
        this.f24316b = gkr;
        this.f24318e = ikd;
        this.f24317d = bpn;
    }

    /* JADX WARNING: Missing block: B:23:?, code:
            return;
     */
    public final void close() {
        /*
        r3 = this;
        r1 = r3.f24319f;
        monitor-enter(r1);
        r0 = r3.f24320g;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.f24320g = r0;	 Catch:{ all -> 0x0031 }
        r0 = r3.f24324k;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0021;
    L_0x0010:
        r0 = r3.f24321h;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001c;
    L_0x0014:
        r0 = r3.f24322i;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001c;
    L_0x0018:
        r0 = r3.f24323j;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r3.f24317d;	 Catch:{ all -> 0x0031 }
        r0.mo2076a();	 Catch:{ all -> 0x0031 }
    L_0x0021:
        r0 = r3.f24324k;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r3.f24318e;	 Catch:{ all -> 0x0031 }
        r2 = new fwk;	 Catch:{ all -> 0x0031 }
        r2.<init>(r3);	 Catch:{ all -> 0x0031 }
        r0.execute(r2);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        goto L_0x0008;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fwd.close():void");
    }

    /* renamed from: a */
    public final void mo13290a(Bitmap bitmap, int i) {
        synchronized (this.f24319f) {
            if (this.f24322i) {
                return;
            }
            this.f24322i = true;
            this.f24318e.execute(new fwf(this, bitmap, i));
        }
    }

    /* renamed from: a */
    public final void mo13291a(fwc fwc) {
        synchronized (this.f24319f) {
            if (this.f24320g) {
                return;
            }
            jri.m13405b(this.f24324k ^ 1);
            this.f24324k = true;
            Executors.newSingleThreadExecutor(iel.m3778c("ProPrgsFin", 0)).submit(new fwj(this, fwc));
        }
    }

    /* renamed from: a */
    public final void mo13293a(byte[] bArr) {
        synchronized (this.f24319f) {
            jri.m13405b(this.f24323j ^ 1);
            this.f24323j = true;
            this.f24318e.execute(new fwg(this, bArr));
        }
    }

    /* renamed from: a */
    public final void mo13289a(Bitmap bitmap) {
        synchronized (this.f24319f) {
            if (this.f24321h) {
                bli.m898e(f24314c, "Duplicate thumbnail set");
                return;
            }
            this.f24321h = true;
            this.f24318e.execute(new fwe(this, bitmap));
        }
    }

    /* renamed from: a */
    public final void mo13288a(float f) {
        synchronized (this.f24319f) {
            if (this.f24320g) {
                return;
            }
            this.f24318e.execute(new fwi(this, f));
        }
    }

    /* renamed from: a */
    public final void mo13292a(hec hec) {
        synchronized (this.f24319f) {
            if (this.f24320g) {
                return;
            }
            this.f24318e.execute(new fwh(this, hec));
        }
    }
}
