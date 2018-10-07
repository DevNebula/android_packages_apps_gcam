package p000;

/* compiled from: PG */
/* renamed from: fro */
final class fro implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ frk f4899a;

    fro(frk frk) {
        this.f4899a = frk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A:{Catch:{ all -> 0x0159, all -> 0x0127, all -> 0x011c, all -> 0x00aa, all -> 0x00c3 }} */
    /* JADX WARNING: Missing block: B:9:?, code:
            r10.f4899a.f18711i.mo8856a("stream#getNext");
     */
    /* JADX WARNING: Missing block: B:11:?, code:
            r0 = (p000.fjj) r10.f4899a.f18708f.mo12344a();
     */
    /* JADX WARNING: Missing block: B:13:?, code:
            r10.f4899a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:14:0x002d, code:
            if (r0 == null) goto L_0x0103;
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code:
            r4 = r0.mo13251e();
            r6 = r0.mo13250d();
            r7 = p000.fds.m10424a(r0, 256);
            r0 = r10.f4899a;
            r6 = r0.mo13273a(r4, r0.mo13277b(r6));
     */
    /* JADX WARNING: Missing block: B:16:0x004d, code:
            if (r6 == null) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:17:0x004f, code:
            if (r7 != null) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:18:0x0051, code:
            r7.close();
     */
    /* JADX WARNING: Missing block: B:20:0x0058, code:
            monitor-enter(r10.f4899a.f18703a);
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            r10.f4899a.f18716n = false;
     */
    /* JADX WARNING: Missing block: B:26:0x0066, code:
            if (r6.mo6878a() == r4) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:27:0x0068, code:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:28:0x0069, code:
            p000.jqk.m13347a(r0);
     */
    /* JADX WARNING: Missing block: B:29:0x006c, code:
            if (r7 == null) goto L_0x006e;
     */
    /* JADX WARNING: Missing block: B:30:0x006e, code:
            r0 = r10.f4899a.f18710h;
            r7 = new java.lang.StringBuilder(56);
            r7.append("Failed to retrieve image from frame ");
            r7.append(r4);
            r0.mo8838f(r7.toString());
            r7 = new java.lang.StringBuilder(51);
            r7.append("Reprocessing failed for image ");
            r7.append(r4);
            r7.append("!");
            r6.mo6879a(new p000.isr(r7.toString()));
     */
    /* JADX WARNING: Missing block: B:42:?, code:
            r0 = r10.f4899a.f18710h;
            r8 = new java.lang.StringBuilder(53);
            r8.append("Reprocessing succeeded for image ");
            r8.append(r4);
            r0.mo8836d(r8.toString());
            r0 = new p000.frq(r6, r7);
     */
    /* JADX WARNING: Missing block: B:43:0x00f9, code:
            if (r6.f4902c.mo15641a(p000.fkp.m17666a(r0).mo15527a(p000.fkr.f4830a, r6.f4903d.f18837a)) == false) goto L_0x00fb;
     */
    /* JADX WARNING: Missing block: B:44:0x00fb, code:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:45:0x0100, code:
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:47:0x0107, code:
            monitor-enter(r10.f4899a.f18703a);
     */
    /* JADX WARNING: Missing block: B:49:?, code:
            r10.f4899a.f18710h.mo8838f("Failed to acquire a jpeg via reprocessing.");
            r0 = r10.f4899a;
            r0.f18716n = false;
            r0.mo13276a();
     */
    /* JADX WARNING: Missing block: B:64:?, code:
            java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing block: B:66:?, code:
            r10.f4899a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:67:0x0139, code:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:70:?, code:
            r10.f4899a.f18710h.mo8834c("Failed to acquire the next frame from the stream. The stream is closed.");
     */
    /* JADX WARNING: Missing block: B:72:?, code:
            r10.f4899a.f18711i.mo8857b();
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:73:0x0150, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:74:0x0151, code:
            r10.f4899a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:75:0x0158, code:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:93:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:95:?, code:
            return;
     */
    public final void run() {
        /*
        r10 = this;
        r1 = 0;
        r2 = 1;
        r3 = 0;
    L_0x0003:
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r4 = r0.f18703a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r4);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4899a;	 Catch:{ all -> 0x0127 }
        r0 = r0.f18713k;	 Catch:{ all -> 0x0127 }
        r0 = r0.size();	 Catch:{ all -> 0x0127 }
        if (r0 == 0) goto L_0x011f;
    L_0x0012:
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f18711i;	 Catch:{ all -> 0x00aa }
        r4 = "stream#getNext";
        r0.mo8856a(r4);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4899a;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = r0.f18708f;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = r0.mo12344a();	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = (p000.fjj) r0;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r4 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r4 = r4.f18711i;	 Catch:{ all -> 0x00aa }
        r4.mo8857b();	 Catch:{ all -> 0x00aa }
    L_0x002d:
        if (r0 == 0) goto L_0x0103;
    L_0x002f:
        r4 = r0.mo13251e();	 Catch:{ all -> 0x00aa }
        r6 = r0.mo13250d();	 Catch:{ all -> 0x00aa }
        r7 = 1;
        r7 = new int[r7];	 Catch:{ all -> 0x00aa }
        r8 = 0;
        r9 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r7[r8] = r9;	 Catch:{ all -> 0x00aa }
        r7 = p000.fds.m10424a(r0, r7);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r8 = r0.mo13277b(r6);	 Catch:{ all -> 0x00aa }
        r6 = r0.mo13273a(r4, r8);	 Catch:{ all -> 0x00aa }
        if (r6 != 0) goto L_0x0060;
    L_0x004f:
        if (r7 == 0) goto L_0x0054;
    L_0x0051:
        r7.close();	 Catch:{ all -> 0x00aa }
    L_0x0054:
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r1 = r0.f18703a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r1);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4899a;	 Catch:{ all -> 0x0159 }
        r2 = 0;
        r0.f18716n = r2;	 Catch:{ all -> 0x0159 }
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
    L_0x005f:
        return;
    L_0x0060:
        r8 = r6.mo6878a();	 Catch:{ all -> 0x00aa }
        r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0100;
    L_0x0068:
        r0 = r2;
    L_0x0069:
        p000.jqk.m13347a(r0);	 Catch:{ all -> 0x00aa }
        if (r7 != 0) goto L_0x00c6;
    L_0x006e:
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f18710h;	 Catch:{ all -> 0x00aa }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r8 = 56;
        r7.<init>(r8);	 Catch:{ all -> 0x00aa }
        r8 = "Failed to retrieve image from frame ";
        r7.append(r8);	 Catch:{ all -> 0x00aa }
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r7 = r7.toString();	 Catch:{ all -> 0x00aa }
        r0.mo8838f(r7);	 Catch:{ all -> 0x00aa }
        r0 = new isr;	 Catch:{ all -> 0x00aa }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r8 = 51;
        r7.<init>(r8);	 Catch:{ all -> 0x00aa }
        r8 = "Reprocessing failed for image ";
        r7.append(r8);	 Catch:{ all -> 0x00aa }
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = "!";
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = r7.toString();	 Catch:{ all -> 0x00aa }
        r0.<init>(r4);	 Catch:{ all -> 0x00aa }
        r6.mo6879a(r0);	 Catch:{ all -> 0x00aa }
        goto L_0x0003;
    L_0x00aa:
        r0 = move-exception;
        r1 = r10.f4899a;
        r1 = r1.f18703a;
        monitor-enter(r1);
        r2 = r10.f4899a;	 Catch:{ all -> 0x00c3 }
        r2 = r2.f18710h;	 Catch:{ all -> 0x00c3 }
        r3 = "Reprocessing ReadLoop failed unexpectedly.";
        r2.mo8835c(r3, r0);	 Catch:{ all -> 0x00c3 }
        r0 = r10.f4899a;	 Catch:{ all -> 0x00c3 }
        r2 = 0;
        r0.f18716n = r2;	 Catch:{ all -> 0x00c3 }
        r0.mo13276a();	 Catch:{ all -> 0x00c3 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c3 }
        goto L_0x005f;
    L_0x00c3:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c3 }
        throw r0;
    L_0x00c6:
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f18710h;	 Catch:{ all -> 0x00aa }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r9 = 53;
        r8.<init>(r9);	 Catch:{ all -> 0x00aa }
        r9 = "Reprocessing succeeded for image ";
        r8.append(r9);	 Catch:{ all -> 0x00aa }
        r8.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = r8.toString();	 Catch:{ all -> 0x00aa }
        r0.mo8836d(r4);	 Catch:{ all -> 0x00aa }
        r0 = new frq;	 Catch:{ all -> 0x00aa }
        r0.<init>(r6, r7);	 Catch:{ all -> 0x00aa }
        r4 = r6.f4902c;	 Catch:{ all -> 0x00aa }
        r5 = p000.fkp.m17666a(r0);	 Catch:{ all -> 0x00aa }
        r7 = p000.fkr.f4830a;	 Catch:{ all -> 0x00aa }
        r6 = r6.f4903d;	 Catch:{ all -> 0x00aa }
        r6 = r6.f18837a;	 Catch:{ all -> 0x00aa }
        r5 = r5.mo15527a(r7, r6);	 Catch:{ all -> 0x00aa }
        r4 = r4.mo15641a(r5);	 Catch:{ all -> 0x00aa }
        if (r4 != 0) goto L_0x0003;
    L_0x00fb:
        r0.close();	 Catch:{ all -> 0x00aa }
        goto L_0x0003;
    L_0x0100:
        r0 = r3;
        goto L_0x0069;
    L_0x0103:
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r1 = r0.f18703a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r1);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4899a;	 Catch:{ all -> 0x011c }
        r0 = r0.f18710h;	 Catch:{ all -> 0x011c }
        r2 = "Failed to acquire a jpeg via reprocessing.";
        r0.mo8838f(r2);	 Catch:{ all -> 0x011c }
        r0 = r10.f4899a;	 Catch:{ all -> 0x011c }
        r2 = 0;
        r0.f18716n = r2;	 Catch:{ all -> 0x011c }
        r0.mo13276a();	 Catch:{ all -> 0x011c }
        monitor-exit(r1);	 Catch:{ all -> 0x011c }
        goto L_0x005f;
    L_0x011c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x011c }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x011f:
        r0 = r10.f4899a;	 Catch:{ all -> 0x0127 }
        r1 = 0;
        r0.f18716n = r1;	 Catch:{ all -> 0x0127 }
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        goto L_0x005f;
    L_0x0127:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x012a:
        r0 = move-exception;
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0150 }
        r0.interrupt();	 Catch:{ all -> 0x0150 }
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f18711i;	 Catch:{ all -> 0x00aa }
        r0.mo8857b();	 Catch:{ all -> 0x00aa }
        r0 = r1;
        goto L_0x002d;
    L_0x013c:
        r0 = move-exception;
        r0 = r10.f4899a;	 Catch:{ all -> 0x0150 }
        r0 = r0.f18710h;	 Catch:{ all -> 0x0150 }
        r4 = "Failed to acquire the next frame from the stream. The stream is closed.";
        r0.mo8834c(r4);	 Catch:{ all -> 0x0150 }
        r0 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f18711i;	 Catch:{ all -> 0x00aa }
        r0.mo8857b();	 Catch:{ all -> 0x00aa }
        r0 = r1;
        goto L_0x002d;
    L_0x0150:
        r0 = move-exception;
        r1 = r10.f4899a;	 Catch:{ all -> 0x00aa }
        r1 = r1.f18711i;	 Catch:{ all -> 0x00aa }
        r1.mo8857b();	 Catch:{ all -> 0x00aa }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x0159:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
        throw r0;	 Catch:{ all -> 0x00aa }
        */
        throw new UnsupportedOperationException("Method not decompiled: fro.run():void");
    }
}
