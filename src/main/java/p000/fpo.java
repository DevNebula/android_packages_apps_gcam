package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fpo */
public final class fpo implements kaw {
    /* renamed from: a */
    public static bbo m10807a(fyt fyt) {
        try {
            return (bbo) aqe.m609a(fyt.mo6947a(1));
        } catch (Throwable e) {
            if (e.getCause() instanceof fys) {
                throw new fys(e);
            }
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static void m10810a(fux fux, fjj fjj) {
        iwz f = fjj.mo13252f();
        while (f != null) {
            fux.mo13282a(f, fjj.mo13250d());
            f = fjj.mo13252f();
        }
        fjj.mo1896a();
    }

    /* renamed from: a */
    public static fvy m10809a(fff fff, ikb ikb, ira ira, fwl fwl, ilb ilb) {
        ikb.mo8557a(ilq.m3881a(fwl.mo9689a(), (iqt) ilb));
        ilb.mo8826a((fis) fwl.mo9689a().mo13673b());
        return new fvy(fff, fwl, ira);
    }

    /* JADX WARNING: Missing block: B:15:0x002f, code:
            if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:17:?, code:
            r2.close();
     */
    /* JADX WARNING: Missing block: B:24:0x0042, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x0043, code:
            p000.kqg.m5105a(r0, r2);
     */
    /* renamed from: a */
    public static p000.bbo m10808a(p000.fyt r4, int r5) {
        /*
        r0 = new bbo;
        r0.<init>();
        r2 = r4.mo6948a();
        r1 = 0;
    L_0x000a:
        if (r1 >= r5) goto L_0x003c;
    L_0x000c:
        r3 = r4.mo6950d();	 Catch:{ all -> 0x002c }
        if (r3 == 0) goto L_0x0018;
    L_0x0012:
        r0.add(r3);	 Catch:{ all -> 0x002c }
        r1 = r1 + 1;
        goto L_0x000a;
    L_0x0018:
        r1 = r0.iterator();	 Catch:{ all -> 0x002c }
    L_0x001c:
        r0 = r1.hasNext();	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0035;
    L_0x0022:
        r0 = r1.next();	 Catch:{ all -> 0x002c }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x002c }
        r0.close();	 Catch:{ all -> 0x002c }
        goto L_0x001c;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r1 = move-exception;
        if (r2 == 0) goto L_0x0034;
    L_0x0031:
        r2.close();	 Catch:{ all -> 0x0042 }
    L_0x0034:
        throw r1;
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r2.close();
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        if (r2 == 0) goto L_0x003b;
    L_0x003e:
        r2.close();
        goto L_0x003b;
    L_0x0042:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: fpo.a(fyt, int):bbo");
    }
}
