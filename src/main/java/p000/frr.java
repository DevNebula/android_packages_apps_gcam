package p000;

/* compiled from: PG */
/* renamed from: frr */
final class frr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ frk f4905a;

    frr(frk frk) {
        this.f4905a = frk;
    }

    /* JADX WARNING: Missing block: B:19:0x00a2, code:
            r1 = r10.f4905a.f18711i;
            r4 = r0.mo6878a();
            r3 = new java.lang.StringBuilder(21);
            r3.append("w");
            r3.append(r4);
            r1.mo8856a(r3.toString());
     */
    /* JADX WARNING: Missing block: B:21:?, code:
            r3 = new p000.fio(r10.f4905a.mo13274a(r0.f4901b));
            r4 = r0.f4900a.f18702a.iterator();
     */
    /* JADX WARNING: Missing block: B:23:0x00d9, code:
            if (r4.hasNext() == false) goto L_0x0113;
     */
    /* JADX WARNING: Missing block: B:24:0x00db, code:
            r3.mo6812a((p000.fin) r4.next());
     */
    /* JADX WARNING: Missing block: B:26:0x00e5, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:28:?, code:
            r3 = r10.f4905a.f18710h;
            r4 = r0.mo6878a();
            r6 = new java.lang.StringBuilder(62);
            r6.append("Failed to initiate reprocessing for image ");
            r6.append(r4);
            r3.mo8835c(r6.toString(), r1);
            r0.mo6879a(r1);
     */
    /* JADX WARNING: Missing block: B:29:0x0107, code:
            r2.close();
            r10.f4905a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            r3.mo6813a(r0.f4903d);
            r3.mo6810a(r10.f4905a.f18708f);
            r1 = r3.mo6807a();
            r3 = new p000.iuy(r0.f4900a.f5387b);
            r10.f4905a.f18711i.mo8856a("submit");
     */
    /* JADX WARNING: Missing block: B:33:?, code:
            r3 = r2.mo13264a(r0.mo6878a(), r3);
     */
    /* JADX WARNING: Missing block: B:35:?, code:
            r3.mo14900h();
            r10.f4905a.f18706d.mo6802a(r1);
            r10.f4905a.mo13279d();
            r1 = r10.f4905a.f18710h;
            r4 = r0.mo6878a();
            r6 = r3.mo13744f();
            r8 = new java.lang.StringBuilder(88);
            r8.append("Reprocessing started for request ");
            r8.append(r4);
            r8.append(" with image at ");
            r8.append(r6);
            r1.mo8836d(r8.toString());
     */
    /* JADX WARNING: Missing block: B:36:0x0176, code:
            if (r3 == null) goto L_0x017b;
     */
    /* JADX WARNING: Missing block: B:38:?, code:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:40:?, code:
            r10.f4905a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:41:0x0182, code:
            r2.close();
            r10.f4905a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:53:?, code:
            r10.f4905a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:59:0x01b2, code:
            if (r3 != null) goto L_0x01b4;
     */
    /* JADX WARNING: Missing block: B:61:?, code:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:65:0x01b9, code:
            r2.close();
            r10.f4905a.f18711i.mo8857b();
     */
    /* JADX WARNING: Missing block: B:67:0x01c4, code:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:69:?, code:
            p000.kqg.m5105a(r1, r3);
     */
    public final void run() {
        /*
        r10 = this;
    L_0x0000:
        r0 = r10.f4905a;
        r1 = r0.f18703a;
        monitor-enter(r1);
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r2 = r0.f18717o;	 Catch:{ all -> 0x0196 }
        if (r2 != 0) goto L_0x0013;
    L_0x000b:
        r0 = r0.f18712j;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r2 = 0;
        r0.f18715m = r2;	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
    L_0x0019:
        return;
    L_0x001a:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f18713k;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r2 = r2.f18714l;	 Catch:{ all -> 0x0196 }
        r2 = r2.size();	 Catch:{ all -> 0x0196 }
        r0 = r0 + r2;
        r2 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r3 = r2.f18705c;	 Catch:{ all -> 0x0196 }
        if (r0 >= r3) goto L_0x0013;
    L_0x0031:
        r0 = r2.f18713k;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r3 = r2.f18704b;	 Catch:{ all -> 0x0196 }
        if (r0 == r3) goto L_0x0013;
    L_0x003d:
        r0 = r2.f18708f;	 Catch:{ all -> 0x0196 }
        r0 = r0.mo14895d();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r2 = r2.f18713k;	 Catch:{ all -> 0x0196 }
        r2 = r2.size();	 Catch:{ all -> 0x0196 }
        if (r0 == r2) goto L_0x0199;
    L_0x004d:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f18707e;	 Catch:{ all -> 0x0196 }
        r2 = 1;
        r2 = r0.mo6861a(r2);	 Catch:{ all -> 0x0196 }
        if (r2 == 0) goto L_0x018e;
    L_0x0058:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f18712j;	 Catch:{ all -> 0x0196 }
        r0 = r0.removeFirst();	 Catch:{ all -> 0x0196 }
        r0 = (p000.frp) r0;	 Catch:{ all -> 0x0196 }
        r3 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r3 = r3.f18713k;	 Catch:{ all -> 0x0196 }
        r3.add(r0);	 Catch:{ all -> 0x0196 }
        r3 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r4 = r3.f18710h;	 Catch:{ all -> 0x0196 }
        r3 = r3.f18713k;	 Catch:{ all -> 0x0196 }
        r3 = r3.size();	 Catch:{ all -> 0x0196 }
        r5 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r5 = r5.f18704b;	 Catch:{ all -> 0x0196 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0196 }
        r7 = 49;
        r6.<init>(r7);	 Catch:{ all -> 0x0196 }
        r7 = "Adding request to queue (";
        r6.append(r7);	 Catch:{ all -> 0x0196 }
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r3 = "/";
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r6.append(r5);	 Catch:{ all -> 0x0196 }
        r3 = ")";
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r3 = r6.toString();	 Catch:{ all -> 0x0196 }
        r4.mo8836d(r3);	 Catch:{ all -> 0x0196 }
        r3 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r3 = r3.f18709g;	 Catch:{ all -> 0x0196 }
        r3.mo15007a();	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        r1 = r10.f4905a;
        r1 = r1.f18711i;
        r4 = r0.mo6878a();
        r3 = new java.lang.StringBuilder;
        r6 = 21;
        r3.<init>(r6);
        r6 = "w";
        r3.append(r6);
        r3.append(r4);
        r3 = r3.toString();
        r1.mo8856a(r3);
        r1 = r10.f4905a;	 Catch:{ all -> 0x00e5 }
        r3 = r0.f4901b;	 Catch:{ all -> 0x00e5 }
        r1 = r1.mo13274a(r3);	 Catch:{ all -> 0x00e5 }
        r3 = new fio;	 Catch:{ all -> 0x00e5 }
        r3.<init>(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r0.f4900a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f18702a;	 Catch:{ all -> 0x00e5 }
        r4 = r1.iterator();	 Catch:{ all -> 0x00e5 }
    L_0x00d5:
        r1 = r4.hasNext();	 Catch:{ all -> 0x00e5 }
        if (r1 == 0) goto L_0x0113;
    L_0x00db:
        r1 = r4.next();	 Catch:{ all -> 0x00e5 }
        r1 = (p000.fin) r1;	 Catch:{ all -> 0x00e5 }
        r3.mo6812a(r1);	 Catch:{ all -> 0x00e5 }
        goto L_0x00d5;
    L_0x00e5:
        r1 = move-exception;
        r3 = r10.f4905a;	 Catch:{ all -> 0x01b8 }
        r3 = r3.f18710h;	 Catch:{ all -> 0x01b8 }
        r4 = r0.mo6878a();	 Catch:{ all -> 0x01b8 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r7 = 62;
        r6.<init>(r7);	 Catch:{ all -> 0x01b8 }
        r7 = "Failed to initiate reprocessing for image ";
        r6.append(r7);	 Catch:{ all -> 0x01b8 }
        r6.append(r4);	 Catch:{ all -> 0x01b8 }
        r4 = r6.toString();	 Catch:{ all -> 0x01b8 }
        r3.mo8835c(r4, r1);	 Catch:{ all -> 0x01b8 }
        r0.mo6879a(r1);	 Catch:{ all -> 0x01b8 }
        r2.close();
        r0 = r10.f4905a;
        r0 = r0.f18711i;
        r0.mo8857b();
        goto L_0x0000;
    L_0x0113:
        r1 = r0.f4903d;	 Catch:{ all -> 0x00e5 }
        r3.mo6813a(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r10.f4905a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f18708f;	 Catch:{ all -> 0x00e5 }
        r3.mo6810a(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r3.mo6807a();	 Catch:{ all -> 0x00e5 }
        r3 = new iuy;	 Catch:{ all -> 0x00e5 }
        r4 = r0.f4900a;	 Catch:{ all -> 0x00e5 }
        r4 = r4.f5387b;	 Catch:{ all -> 0x00e5 }
        r3.<init>(r4);	 Catch:{ all -> 0x00e5 }
        r4 = r10.f4905a;	 Catch:{ all -> 0x00e5 }
        r4 = r4.f18711i;	 Catch:{ all -> 0x00e5 }
        r5 = "submit";
        r4.mo8856a(r5);	 Catch:{ all -> 0x00e5 }
        r4 = r0.mo6878a();	 Catch:{ all -> 0x01a6 }
        r3 = r2.mo13264a(r4, r3);	 Catch:{ all -> 0x01a6 }
        r3.mo14900h();	 Catch:{ all -> 0x01af }
        r4 = r10.f4905a;	 Catch:{ all -> 0x01af }
        r4 = r4.f18706d;	 Catch:{ all -> 0x01af }
        r4.mo6802a(r1);	 Catch:{ all -> 0x01af }
        r1 = r10.f4905a;	 Catch:{ all -> 0x01af }
        r1.mo13279d();	 Catch:{ all -> 0x01af }
        r1 = r10.f4905a;	 Catch:{ all -> 0x01af }
        r1 = r1.f18710h;	 Catch:{ all -> 0x01af }
        r4 = r0.mo6878a();	 Catch:{ all -> 0x01af }
        r6 = r3.mo13744f();	 Catch:{ all -> 0x01af }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01af }
        r9 = 88;
        r8.<init>(r9);	 Catch:{ all -> 0x01af }
        r9 = "Reprocessing started for request ";
        r8.append(r9);	 Catch:{ all -> 0x01af }
        r8.append(r4);	 Catch:{ all -> 0x01af }
        r4 = " with image at ";
        r8.append(r4);	 Catch:{ all -> 0x01af }
        r8.append(r6);	 Catch:{ all -> 0x01af }
        r4 = r8.toString();	 Catch:{ all -> 0x01af }
        r1.mo8836d(r4);	 Catch:{ all -> 0x01af }
        if (r3 == 0) goto L_0x017b;
    L_0x0178:
        r3.close();	 Catch:{ all -> 0x01a6 }
    L_0x017b:
        r1 = r10.f4905a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f18711i;	 Catch:{ all -> 0x00e5 }
        r1.mo8857b();	 Catch:{ all -> 0x00e5 }
        r2.close();
        r0 = r10.f4905a;
        r0 = r0.f18711i;
        r0.mo8857b();
        goto L_0x0000;
    L_0x018e:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r2 = 0;
        r0.f18715m = r2;	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        goto L_0x0019;
    L_0x0196:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        throw r0;
    L_0x0199:
        r0 = r10.f4905a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f18708f;	 Catch:{ all -> 0x0196 }
        r2 = 1;
        r0 = r0.mo14894b(r2);	 Catch:{ all -> 0x0196 }
        if (r0 == 0) goto L_0x0013;
    L_0x01a4:
        goto L_0x004d;
    L_0x01a6:
        r1 = move-exception;
        r3 = r10.f4905a;	 Catch:{ all -> 0x00e5 }
        r3 = r3.f18711i;	 Catch:{ all -> 0x00e5 }
        r3.mo8857b();	 Catch:{ all -> 0x00e5 }
        throw r1;	 Catch:{ all -> 0x00e5 }
    L_0x01af:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x01b1 }
    L_0x01b1:
        r4 = move-exception;
        if (r3 == 0) goto L_0x01b7;
    L_0x01b4:
        r3.close();	 Catch:{ all -> 0x01c4 }
    L_0x01b7:
        throw r4;	 Catch:{ all -> 0x01a6 }
    L_0x01b8:
        r0 = move-exception;
        r2.close();
        r1 = r10.f4905a;
        r1 = r1.f18711i;
        r1.mo8857b();
        throw r0;
    L_0x01c4:
        r3 = move-exception;
        p000.kqg.m5105a(r1, r3);	 Catch:{ all -> 0x01a6 }
        goto L_0x01b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: frr.run():void");
    }
}
