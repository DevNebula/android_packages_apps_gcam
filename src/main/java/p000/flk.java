package p000;

/* compiled from: PG */
/* renamed from: flk */
final class flk implements fjw {
    /* renamed from: a */
    private final int f18399a;
    /* renamed from: b */
    private final /* synthetic */ fli f18400b;

    /* renamed from: a */
    private static /* synthetic */ void m10671a(Throwable th, iqo iqo) {
        if (th != null) {
            try {
                iqo.close();
                return;
            } catch (Throwable th2) {
                kqg.m5105a(th, th2);
                return;
            }
        }
        iqo.close();
    }

    flk(fli fli, int i) {
        this.f18400b = fli;
        this.f18399a = i;
    }

    /* JADX WARNING: Missing block: B:45:?, code:
            p000.flk.m10671a(r0, r8);
     */
    /* JADX WARNING: Missing block: B:51:0x00c0, code:
            if (r7 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Missing block: B:52:0x00c2, code:
            p000.flk.m10671a(r0, r7);
     */
    /* renamed from: b */
    private final p000.kpk m10672b(p000.fkp r12) {
        /*
        r11 = this;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r0 = p000.fkr.f4831b;
        r0 = r12.mo15528a(r0);
        r0 = (p000.fhq) r0;
        r1 = r11.f18400b;
        r1 = r1.f18390a;
        r7 = r1.mo6948a();
        r1 = r11.f18400b;	 Catch:{ all -> 0x00bd }
        r1 = r1.f18394e;	 Catch:{ all -> 0x00bd }
        r8 = r1.mo15009a();	 Catch:{ all -> 0x00bd }
        r1 = r11.f18400b;	 Catch:{ all -> 0x00b6 }
        r9 = r1.f18395f;	 Catch:{ all -> 0x00b6 }
        monitor-enter(r9);	 Catch:{ all -> 0x00b6 }
        r1 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f18397h;	 Catch:{ all -> 0x0112 }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0112 }
        if (r1 != 0) goto L_0x00fc;
    L_0x002a:
        r1 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r1 = r1.mo13263a(r0);	 Catch:{ all -> 0x0112 }
        if (r1 != 0) goto L_0x00f2;
    L_0x0032:
        r1 = new flj;	 Catch:{ all -> 0x0112 }
        r5 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f18392c;	 Catch:{ all -> 0x0112 }
        r1.<init>(r5, r0);	 Catch:{ all -> 0x0112 }
        r5 = r11.f18399a;	 Catch:{ all -> 0x0112 }
        r1.mo6849a(r5, r12);	 Catch:{ all -> 0x0112 }
        r5 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f18397h;	 Catch:{ all -> 0x0112 }
        r5.put(r0, r1);	 Catch:{ all -> 0x0112 }
        r5 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f18397h;	 Catch:{ all -> 0x0112 }
        r5 = r5.size();	 Catch:{ all -> 0x0112 }
        r6 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r6 = r6.f18393d;	 Catch:{ all -> 0x0112 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0112 }
        r6.f24640b = r5;	 Catch:{ all -> 0x0112 }
        r1 = r1.f4843e;	 Catch:{ all -> 0x0112 }
        r12 = r4;
        r5 = r2;
        r6 = r1;
    L_0x005e:
        r1 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f18396g;	 Catch:{ all -> 0x0112 }
        r10 = r11.f18399a;	 Catch:{ all -> 0x0112 }
        r1 = r1.get(r10);	 Catch:{ all -> 0x0112 }
        r1 = (p000.fll) r1;	 Catch:{ all -> 0x0112 }
        r1 = r1.f4844a;	 Catch:{ all -> 0x0112 }
        r1.add(r0);	 Catch:{ all -> 0x0112 }
        monitor-exit(r9);	 Catch:{ all -> 0x0112 }
        r1 = r11.f18400b;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f18393d;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f24639a;	 Catch:{ all -> 0x00b6 }
        r1.m2973a();	 Catch:{ all -> 0x00b6 }
        if (r12 == 0) goto L_0x007e;
    L_0x007b:
        r12.close();	 Catch:{ all -> 0x00b6 }
    L_0x007e:
        if (r5 != 0) goto L_0x008a;
    L_0x0080:
        r0 = 0;
        p000.flk.m10671a(r0, r8);	 Catch:{ all -> 0x00bd }
        if (r7 == 0) goto L_0x0089;
    L_0x0086:
        p000.flk.m10671a(r4, r7);
    L_0x0089:
        return r6;
    L_0x008a:
        r1 = r11.f18400b;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f18390a;	 Catch:{ all -> 0x00b6 }
        r5 = r1.mo6950d();	 Catch:{ all -> 0x00b6 }
        r1 = r11.f18400b;	 Catch:{ all -> 0x00b6 }
        r9 = r1.f18395f;	 Catch:{ all -> 0x00b6 }
        monitor-enter(r9);	 Catch:{ all -> 0x00b6 }
        if (r5 == 0) goto L_0x00dd;
    L_0x0099:
        r1 = r11.f18400b;	 Catch:{ all -> 0x0115 }
        r1 = r1.f18397h;	 Catch:{ all -> 0x0115 }
        r0 = r1.get(r0);	 Catch:{ all -> 0x0115 }
        r0 = (p000.flj) r0;	 Catch:{ all -> 0x0115 }
        if (r0 != 0) goto L_0x00ce;
    L_0x00a5:
        r0 = r4;
        r1 = r5;
        r2 = r4;
    L_0x00a8:
        monitor-exit(r9);	 Catch:{ all -> 0x0115 }
        if (r0 != 0) goto L_0x00c6;
    L_0x00ab:
        if (r2 == 0) goto L_0x00b0;
    L_0x00ad:
        r2.mo6848a();	 Catch:{ all -> 0x00b6 }
    L_0x00b0:
        if (r1 == 0) goto L_0x0080;
    L_0x00b2:
        r1.close();	 Catch:{ all -> 0x00b6 }
        goto L_0x0080;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b8 }
    L_0x00b8:
        r1 = move-exception;
        p000.flk.m10671a(r0, r8);	 Catch:{ all -> 0x00bd }
        throw r1;	 Catch:{ all -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00bf }
    L_0x00bf:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00c5;
    L_0x00c2:
        p000.flk.m10671a(r0, r7);
    L_0x00c5:
        throw r1;
    L_0x00c6:
        r0 = r0.f4843e;	 Catch:{ all -> 0x00b6 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00b6 }
        r0.mo15641a(r3);	 Catch:{ all -> 0x00b6 }
        goto L_0x00ab;
    L_0x00ce:
        r1 = r0.f4842d;	 Catch:{ all -> 0x0115 }
        if (r1 != 0) goto L_0x00db;
    L_0x00d2:
        r1 = r2;
    L_0x00d3:
        p000.jri.m13405b(r1);	 Catch:{ all -> 0x0115 }
        r0.f4842d = r5;	 Catch:{ all -> 0x0115 }
        r1 = r4;
        r2 = r4;
        goto L_0x00a8;
    L_0x00db:
        r1 = r3;
        goto L_0x00d3;
    L_0x00dd:
        r1 = r11.f18400b;	 Catch:{ all -> 0x0115 }
        r1 = r1.f18397h;	 Catch:{ all -> 0x0115 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0115 }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x0115 }
        r2 = r11.f18400b;	 Catch:{ all -> 0x0115 }
        r2 = r2.f18397h;	 Catch:{ all -> 0x0115 }
        r2.remove(r0);	 Catch:{ all -> 0x0115 }
        r0 = r4;
        r2 = r1;
        r1 = r5;
        goto L_0x00a8;
    L_0x00f2:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0112 }
        r1 = p000.kow.m13873a(r1);	 Catch:{ all -> 0x0112 }
        r5 = r3;
        r6 = r1;
        goto L_0x005e;
    L_0x00fc:
        r1 = r11.f18400b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f18397h;	 Catch:{ all -> 0x0112 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0112 }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x0112 }
        r5 = r11.f18399a;	 Catch:{ all -> 0x0112 }
        r1.mo6849a(r5, r12);	 Catch:{ all -> 0x0112 }
        r1 = r1.f4843e;	 Catch:{ all -> 0x0112 }
        r12 = r4;
        r5 = r3;
        r6 = r1;
        goto L_0x005e;
    L_0x0112:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0112 }
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x0115:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0115 }
        throw r0;	 Catch:{ all -> 0x00b6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: flk.b(fkp):kpk");
    }

    /* JADX WARNING: Missing block: B:8:0x0017, code:
            r2 = m10672b(r13);
            r0 = (p000.fhq) r13.mo15528a(p000.fkr.f4831b);
            r5 = r12.f18400b.f18395f;
     */
    /* JADX WARNING: Missing block: B:9:0x0027, code:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:12:0x0030, code:
            if (r12.f18400b.f18397h.containsKey(r0) != false) goto L_0x00c3;
     */
    /* JADX WARNING: Missing block: B:13:0x0032, code:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:14:0x0033, code:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:15:0x0034, code:
            if (r0 == null) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code:
            r1 = r12.f18400b.f18390a.mo6948a();
     */
    /* JADX WARNING: Missing block: B:18:?, code:
            r3 = r12.f18400b.f18394e.mo15009a();
     */
    /* JADX WARNING: Missing block: B:20:?, code:
            r4 = r12.f18400b;
            r4.f18393d.f24640b = java.lang.Integer.valueOf(r4.f18397h.size());
            r12.f18400b.f18391b.mo8826a(r0);
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            p000.flk.m10671a(null, r3);
     */
    /* JADX WARNING: Missing block: B:24:0x0061, code:
            if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:25:0x0063, code:
            p000.flk.m10671a(null, r1);
     */
    /* JADX WARNING: Missing block: B:26:0x0067, code:
            r12.f18400b.f18393d.f24639a.m2973a();
            r1 = r12.f18400b;
            r4 = r1.f18395f;
     */
    /* JADX WARNING: Missing block: B:27:0x0074, code:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:29:?, code:
            r5 = r1.f18396g.iterator();
            r0 = com.google.android.libraries.smartburst.filterfw.GraphRunner.LfuScheduler.MAX_PRIORITY;
     */
    /* JADX WARNING: Missing block: B:30:0x007f, code:
            r3 = r0;
     */
    /* JADX WARNING: Missing block: B:31:0x0083, code:
            if (r5.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Missing block: B:32:0x0085, code:
            r0 = java.lang.Math.min(r3, ((p000.fll) r5.next()).f4844a.size());
     */
    /* JADX WARNING: Missing block: B:34:0x009a, code:
            if (r3 == com.google.android.libraries.smartburst.filterfw.GraphRunner.LfuScheduler.MAX_PRIORITY) goto L_0x00c1;
     */
    /* JADX WARNING: Missing block: B:35:0x009c, code:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:36:0x009d, code:
            p000.jri.m13405b(r0);
            r5 = r1.f18396g.iterator();
     */
    /* JADX WARNING: Missing block: B:38:0x00aa, code:
            if (r5.hasNext() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Missing block: B:39:0x00ac, code:
            r0 = (p000.fll) r5.next();
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:40:0x00b3, code:
            if (r1 >= r3) goto L_0x00a6;
     */
    /* JADX WARNING: Missing block: B:41:0x00b5, code:
            r0.f4844a.pollFirst();
            r1 = r1 + 1;
     */
    /* JADX WARNING: Missing block: B:42:0x00bd, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:44:0x00c1, code:
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:46:?, code:
            r1 = (p000.flj) r12.f18400b.f18397h.get(r0);
            r4 = 1;
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:48:0x00d1, code:
            if (r3 >= r1.f4839a) goto L_0x00e1;
     */
    /* JADX WARNING: Missing block: B:49:0x00d3, code:
            r4 = r4 & r1.f4841c.containsKey(java.lang.Integer.valueOf(r3));
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:51:0x00e3, code:
            if (r1.f4842d == null) goto L_0x0176;
     */
    /* JADX WARNING: Missing block: B:52:0x00e5, code:
            r3 = 1;
     */
    /* JADX WARNING: Missing block: B:54:0x00e7, code:
            if ((r3 & r4) != 0) goto L_0x00ec;
     */
    /* JADX WARNING: Missing block: B:55:0x00e9, code:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:56:0x00ec, code:
            r12.f18400b.f18397h.remove(r0);
            r6 = new java.util.ArrayList();
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:57:0x00fa, code:
            r3 = r0;
     */
    /* JADX WARNING: Missing block: B:58:0x00fc, code:
            if (r3 >= r1.f4839a) goto L_0x0142;
     */
    /* JADX WARNING: Missing block: B:59:0x00fe, code:
            r0 = (p000.fkp) r1.f4841c.get(java.lang.Integer.valueOf(r3));
            p000.jri.m13404b(r0);
            p000.jri.m13405b(r1.f4840b.equals(r0.mo15528a(p000.fkr.f4831b)));
     */
    /* JADX WARNING: Missing block: B:60:0x0126, code:
            if (r1.f4840b.f4791a != r0.mo13744f()) goto L_0x0140;
     */
    /* JADX WARNING: Missing block: B:61:0x0128, code:
            r4 = true;
     */
    /* JADX WARNING: Missing block: B:62:0x0129, code:
            p000.jri.m13405b(r4);
     */
    /* JADX WARNING: Missing block: B:63:0x0130, code:
            if (r0.mo15530i() == false) goto L_0x0139;
     */
    /* JADX WARNING: Missing block: B:64:0x0132, code:
            r6.add(r0);
     */
    /* JADX WARNING: Missing block: B:65:0x0135, code:
            r0 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:66:0x0139, code:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:70:0x0140, code:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:72:?, code:
            r0 = p000.fma.m17700a(new p000.fld(r1.f4840b.f4791a, (p000.kpk) p000.jri.m13404b(((p000.fkp) p000.jri.m13404b((p000.fkp) r1.f4841c.get(java.lang.Integer.valueOf(0)))).mo15529h()), r6), (p000.fyr) p000.jri.m13404b(r1.f4842d));
     */
    /* JADX WARNING: Missing block: B:73:0x0176, code:
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:82:0x017f, code:
            if (r1 != null) goto L_0x0181;
     */
    /* JADX WARNING: Missing block: B:83:0x0181, code:
            p000.flk.m10671a(r0, r1);
     */
    /* JADX WARNING: Missing block: B:90:?, code:
            p000.flk.m10671a(r0, r3);
     */
    /* JADX WARNING: Missing block: B:111:?, code:
            return r2;
     */
    /* renamed from: a */
    public final p000.kpk mo6838a(p000.fkp r13) {
        /*
        r12 = this;
        r0 = r12.f18400b;
        r1 = r0.f18395f;
        monitor-enter(r1);
        r0 = r12.f18400b;	 Catch:{ all -> 0x0179 }
        r0 = r0.f18398i;	 Catch:{ all -> 0x0179 }
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r13.close();	 Catch:{ all -> 0x0179 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0179 }
        r0 = p000.kow.m13873a(r0);	 Catch:{ all -> 0x0179 }
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
    L_0x0015:
        return r0;
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
        r2 = r12.m10672b(r13);
        r0 = p000.fkr.f4831b;
        r0 = r13.mo15528a(r0);
        r0 = (p000.fhq) r0;
        r1 = r12.f18400b;
        r5 = r1.f18395f;
        monitor-enter(r5);
        r1 = r12.f18400b;	 Catch:{ all -> 0x013d }
        r1 = r1.f18397h;	 Catch:{ all -> 0x013d }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x013d }
        if (r1 != 0) goto L_0x00c3;
    L_0x0032:
        r0 = 0;
    L_0x0033:
        monitor-exit(r5);	 Catch:{ all -> 0x013d }
        if (r0 == 0) goto L_0x0067;
    L_0x0036:
        r1 = r12.f18400b;
        r1 = r1.f18390a;
        r1 = r1.mo6948a();
        r3 = r12.f18400b;	 Catch:{ all -> 0x017c }
        r3 = r3.f18394e;	 Catch:{ all -> 0x017c }
        r3 = r3.mo15009a();	 Catch:{ all -> 0x017c }
        r4 = r12.f18400b;	 Catch:{ all -> 0x0185 }
        r5 = r4.f18393d;	 Catch:{ all -> 0x0185 }
        r4 = r4.f18397h;	 Catch:{ all -> 0x0185 }
        r4 = r4.size();	 Catch:{ all -> 0x0185 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0185 }
        r5.f24640b = r4;	 Catch:{ all -> 0x0185 }
        r4 = r12.f18400b;	 Catch:{ all -> 0x0185 }
        r4 = r4.f18391b;	 Catch:{ all -> 0x0185 }
        r4.mo8826a(r0);	 Catch:{ all -> 0x0185 }
        r0 = 0;
        p000.flk.m10671a(r0, r3);	 Catch:{ all -> 0x017c }
        if (r1 == 0) goto L_0x0067;
    L_0x0063:
        r0 = 0;
        p000.flk.m10671a(r0, r1);
    L_0x0067:
        r0 = r12.f18400b;
        r0 = r0.f18393d;
        r0 = r0.f24639a;
        r0.m2973a();
        r1 = r12.f18400b;
        r4 = r1.f18395f;
        monitor-enter(r4);
        r0 = r1.f18396g;	 Catch:{ all -> 0x018c }
        r5 = r0.iterator();	 Catch:{ all -> 0x018c }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r0;
    L_0x007f:
        r0 = r5.hasNext();	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x0097;
    L_0x0085:
        r0 = r5.next();	 Catch:{ all -> 0x018c }
        r0 = (p000.fll) r0;	 Catch:{ all -> 0x018c }
        r0 = r0.f4844a;	 Catch:{ all -> 0x018c }
        r0 = r0.size();	 Catch:{ all -> 0x018c }
        r0 = java.lang.Math.min(r3, r0);	 Catch:{ all -> 0x018c }
        r3 = r0;
        goto L_0x007f;
    L_0x0097:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r0) goto L_0x00c1;
    L_0x009c:
        r0 = 1;
    L_0x009d:
        p000.jri.m13405b(r0);	 Catch:{ all -> 0x018c }
        r0 = r1.f18396g;	 Catch:{ all -> 0x018c }
        r5 = r0.iterator();	 Catch:{ all -> 0x018c }
    L_0x00a6:
        r0 = r5.hasNext();	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x00bd;
    L_0x00ac:
        r0 = r5.next();	 Catch:{ all -> 0x018c }
        r0 = (p000.fll) r0;	 Catch:{ all -> 0x018c }
        r1 = 0;
    L_0x00b3:
        if (r1 >= r3) goto L_0x00a6;
    L_0x00b5:
        r6 = r0.f4844a;	 Catch:{ all -> 0x018c }
        r6.pollFirst();	 Catch:{ all -> 0x018c }
        r1 = r1 + 1;
        goto L_0x00b3;
    L_0x00bd:
        monitor-exit(r4);	 Catch:{ all -> 0x018c }
        r0 = r2;
        goto L_0x0015;
    L_0x00c1:
        r0 = 0;
        goto L_0x009d;
    L_0x00c3:
        r1 = r12.f18400b;	 Catch:{ all -> 0x013d }
        r1 = r1.f18397h;	 Catch:{ all -> 0x013d }
        r1 = r1.get(r0);	 Catch:{ all -> 0x013d }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x013d }
        r4 = 1;
        r3 = 0;
    L_0x00cf:
        r6 = r1.f4839a;	 Catch:{ all -> 0x013d }
        if (r3 >= r6) goto L_0x00e1;
    L_0x00d3:
        r6 = r1.f4841c;	 Catch:{ all -> 0x013d }
        r7 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x013d }
        r6 = r6.containsKey(r7);	 Catch:{ all -> 0x013d }
        r4 = r4 & r6;
        r3 = r3 + 1;
        goto L_0x00cf;
    L_0x00e1:
        r3 = r1.f4842d;	 Catch:{ all -> 0x013d }
        if (r3 == 0) goto L_0x0176;
    L_0x00e5:
        r3 = 1;
    L_0x00e6:
        r3 = r3 & r4;
        if (r3 != 0) goto L_0x00ec;
    L_0x00e9:
        r0 = 0;
        goto L_0x0033;
    L_0x00ec:
        r3 = r12.f18400b;	 Catch:{ all -> 0x013d }
        r3 = r3.f18397h;	 Catch:{ all -> 0x013d }
        r3.remove(r0);	 Catch:{ all -> 0x013d }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x013d }
        r6.<init>();	 Catch:{ all -> 0x013d }
        r0 = 0;
        r3 = r0;
    L_0x00fa:
        r0 = r1.f4839a;	 Catch:{ all -> 0x013d }
        if (r3 >= r0) goto L_0x0142;
    L_0x00fe:
        r0 = r1.f4841c;	 Catch:{ all -> 0x013d }
        r4 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x013d }
        r0 = r0.get(r4);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        p000.jri.m13404b(r0);	 Catch:{ all -> 0x013d }
        r4 = r1.f4840b;	 Catch:{ all -> 0x013d }
        r7 = p000.fkr.f4831b;	 Catch:{ all -> 0x013d }
        r7 = r0.mo15528a(r7);	 Catch:{ all -> 0x013d }
        r4 = r4.equals(r7);	 Catch:{ all -> 0x013d }
        p000.jri.m13405b(r4);	 Catch:{ all -> 0x013d }
        r4 = r1.f4840b;	 Catch:{ all -> 0x013d }
        r8 = r4.f4791a;	 Catch:{ all -> 0x013d }
        r10 = r0.mo13744f();	 Catch:{ all -> 0x013d }
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x0140;
    L_0x0128:
        r4 = 1;
    L_0x0129:
        p000.jri.m13405b(r4);	 Catch:{ all -> 0x013d }
        r4 = r0.mo15530i();	 Catch:{ all -> 0x013d }
        if (r4 == 0) goto L_0x0139;
    L_0x0132:
        r6.add(r0);	 Catch:{ all -> 0x013d }
    L_0x0135:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x00fa;
    L_0x0139:
        r0.close();	 Catch:{ all -> 0x013d }
        goto L_0x0135;
    L_0x013d:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x013d }
        throw r0;
    L_0x0140:
        r4 = 0;
        goto L_0x0129;
    L_0x0142:
        r3 = new fld;	 Catch:{ all -> 0x013d }
        r0 = r1.f4840b;	 Catch:{ all -> 0x013d }
        r8 = r0.f4791a;	 Catch:{ all -> 0x013d }
        r0 = r1.f4841c;	 Catch:{ all -> 0x013d }
        r4 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x013d }
        r0 = r0.get(r4);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13404b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        r0 = r0.mo15529h();	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13404b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.kpk) r0;	 Catch:{ all -> 0x013d }
        r3.<init>(r8, r0, r6);	 Catch:{ all -> 0x013d }
        r0 = r1.f4842d;	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13404b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x013d }
        r0 = p000.fma.m17700a(r3, r0);	 Catch:{ all -> 0x013d }
        goto L_0x0033;
    L_0x0176:
        r3 = 0;
        goto L_0x00e6;
    L_0x0179:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
        throw r0;
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x017e }
    L_0x017e:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0184;
    L_0x0181:
        p000.flk.m10671a(r0, r1);
    L_0x0184:
        throw r2;
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0187 }
    L_0x0187:
        r2 = move-exception;
        p000.flk.m10671a(r0, r3);	 Catch:{ all -> 0x017c }
        throw r2;	 Catch:{ all -> 0x017c }
    L_0x018c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x018c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: flk.a(fkp):kpk");
    }

    /* renamed from: a */
    public final boolean mo6839a() {
        return this.f18400b.f18391b.mo12347b();
    }
}
