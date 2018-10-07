package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: fbd */
public final class fbd {
    /* renamed from: a */
    public final fbg f4651a;
    /* renamed from: b */
    public final fbe f4652b;
    /* renamed from: c */
    public final Handler f4653c;
    /* renamed from: d */
    public final ilb f4654d;
    /* renamed from: e */
    public final Runnable f4655e;
    /* renamed from: f */
    private final ikd f4656f;
    /* renamed from: g */
    private final bmb f4657g;
    /* renamed from: h */
    private final Runnable f4658h;
    /* renamed from: i */
    private final Object f4659i = new Object();
    /* renamed from: j */
    private iqo f4660j;

    public fbd(fbg fbg, ikd ikd, bmb bmb, String str) {
        this.f4651a = fbg;
        this.f4656f = ikd;
        this.f4657g = bmb;
        fbf a = fbg.mo6717a();
        a.f4670d = str;
        a.f4667a = true;
        a.f4668b = 1610612733;
        this.f4652b = a.mo6716a();
        this.f4653c = new Handler(Looper.getMainLooper());
        this.f4654d = new ilb(Boolean.valueOf(false));
        this.f4658h = new fal(this);
        this.f4655e = new fam(this, fbg);
    }

    /* renamed from: a */
    public final void mo6713a() {
        synchronized (this.f4659i) {
            this.f4653c.removeCallbacks(this.f4658h);
            iqo iqo = this.f4660j;
            if (iqo != null) {
                iqo.close();
                this.f4660j = null;
            }
            this.f4653c.removeCallbacks(this.f4655e);
            this.f4656f.execute(new fao(this));
        }
    }

    /* JADX WARNING: Missing block: B:20:0x0056, code:
            if (r2.f1336b.mo7906d() == false) goto L_0x0011;
     */
    /* renamed from: a */
    public final void mo6714a(p000.ilp r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.f4659i;
        monitor-enter(r1);
        r2 = r6.f4657g;	 Catch:{ all -> 0x0045 }
        r3 = r2.f1336b;	 Catch:{ all -> 0x0045 }
        r3 = r3.mo7904b();	 Catch:{ all -> 0x0045 }
        if (r3 == 0) goto L_0x0048;
    L_0x000e:
        r0 = r2.f1335a;	 Catch:{ all -> 0x0045 }
        r0 = 1;
    L_0x0011:
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = r6.f4654d;	 Catch:{ all -> 0x0045 }
        r2 = 0;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0045 }
        r0.mo8826a(r2);	 Catch:{ all -> 0x0045 }
        r0 = new fap;	 Catch:{ all -> 0x0045 }
        r2 = r6.f4654d;	 Catch:{ all -> 0x0045 }
        r0.<init>(r7, r2);	 Catch:{ all -> 0x0045 }
        r2 = r6.f4660j;	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x002d;
    L_0x002a:
        r2.close();	 Catch:{ all -> 0x0045 }
    L_0x002d:
        r2 = new fan;	 Catch:{ all -> 0x0045 }
        r2.<init>(r6);	 Catch:{ all -> 0x0045 }
        r3 = r6.f4656f;	 Catch:{ all -> 0x0045 }
        r0 = r0.mo13672a(r2, r3);	 Catch:{ all -> 0x0045 }
        r6.f4660j = r0;	 Catch:{ all -> 0x0045 }
        r0 = r6.f4653c;	 Catch:{ all -> 0x0045 }
        r2 = r6.f4658h;	 Catch:{ all -> 0x0045 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.postDelayed(r2, r4);	 Catch:{ all -> 0x0045 }
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        goto L_0x0014;
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        throw r0;
    L_0x0048:
        r3 = r2.f1336b;	 Catch:{ all -> 0x0045 }
        r3 = r3.mo7905c();	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x000e;
    L_0x0050:
        r3 = r2.f1336b;	 Catch:{ all -> 0x0045 }
        r3 = r3.mo7906d();	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x000e;
    L_0x0058:
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: fbd.a(ilp):void");
    }
}
