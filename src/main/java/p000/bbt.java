package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bbt */
public final class bbt implements bbf, bbh {
    /* renamed from: a */
    public final imn f22559a = new imn(this.f22562d);
    /* renamed from: b */
    private final bbp f22560b;
    /* renamed from: c */
    private final Object f22561c = new Object();
    /* renamed from: d */
    private final iml f22562d = new iml(Integer.valueOf(0));

    public bbt(bbs bbs) {
        this.f22560b = new bbp(new bbu(this, bbs));
    }

    public final void close() {
        this.f22560b.close();
    }

    /* renamed from: d */
    final void mo14555d() {
        synchronized (this.f22561c) {
            iml iml = this.f22562d;
            iml.f24640b = Integer.valueOf(((Integer) iml.f24639a.f24635a.f24630c).intValue() - 1);
        }
        this.f22562d.f24639a.m2973a();
    }

    /* renamed from: a */
    public final Object mo12344a() {
        Object a = this.f22560b.mo12344a();
        mo14555d();
        return a;
    }

    /* renamed from: b */
    public final boolean mo12345b() {
        return this.f22560b.mo12345b();
    }

    /* renamed from: c */
    public final Object mo12346c() {
        Object c = this.f22560b.mo12346c();
        if (c != null) {
            mo14555d();
        }
        return c;
    }

    /* JADX WARNING: Missing block: B:16:?, code:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:23:0x003a, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:24:0x003b, code:
            p000.kqg.m5105a(r0, r1);
     */
    /* renamed from: a */
    public final void mo8826a(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = r4.f22559a;
        r1 = r0.mo15009a();
        r2 = r4.f22561c;	 Catch:{ all -> 0x0030 }
        monitor-enter(r2);	 Catch:{ all -> 0x0030 }
        r3 = r4.f22562d;	 Catch:{ all -> 0x0037 }
        r0 = r3.f24639a;	 Catch:{ all -> 0x0037 }
        r0 = r0.f24635a;	 Catch:{ all -> 0x0037 }
        r0 = r0.f24630c;	 Catch:{ all -> 0x0037 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0037 }
        r0 = r0.intValue();	 Catch:{ all -> 0x0037 }
        r0 = r0 + 1;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0037 }
        r3.f24640b = r0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r2);	 Catch:{ all -> 0x0037 }
        r0 = r4.f22562d;	 Catch:{ all -> 0x0030 }
        r0 = r0.f24639a;	 Catch:{ all -> 0x0030 }
        r0.m2973a();	 Catch:{ all -> 0x0030 }
        r0 = r4.f22560b;	 Catch:{ all -> 0x0030 }
        r0.mo8826a(r5);	 Catch:{ all -> 0x0030 }
        r1.close();
        return;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r2 = move-exception;
        r1.close();	 Catch:{ all -> 0x003a }
    L_0x0036:
        throw r2;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0037 }
        throw r0;	 Catch:{ all -> 0x0030 }
    L_0x003a:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbt.a(java.lang.Object):void");
    }
}
