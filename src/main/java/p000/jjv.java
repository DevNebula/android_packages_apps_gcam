package p000;

/* compiled from: PG */
/* renamed from: jjv */
public final class jjv extends jjq {
    /* renamed from: c */
    private final jxm f24760c;
    /* renamed from: d */
    private final jiv[] f24761d;
    /* renamed from: e */
    private final jtv f24762e;

    public jjv(String str, int i, jiv[] jivArr, jxm jxm, jtv jtv) {
        super(str, i);
        jri.m13404b((Object) jivArr);
        jri.m13404b((Object) jxm);
        this.f24761d = jivArr;
        this.f24760c = jxm;
        this.f24762e = jtv;
    }

    /* JADX WARNING: Missing block: B:91:0x03cc, code:
            r4 = r15;
            r5 = r16;
     */
    /* renamed from: a */
    public final p000.jaq mo9461a(p000.juh r35, java.util.concurrent.Executor r36) {
        /*
        r34 = this;
        p000.jri.m13404b(r35);
        r4 = r35.mo9565d();
        if (r4 <= 0) goto L_0x03f3;
    L_0x0009:
        r4 = 1;
    L_0x000a:
        p000.jri.m13395a(r4);
        r0 = r34;
        r4 = r0.f24760c;
        r6 = r35.mo9561a();
        r4 = r4.mo9599a(r6);
        r5 = p000.jxa.f8411b;
        r4 = r4.mo9589a(r5);
        r4 = (p000.jzp) r4;
        r5 = r4.f8515a;
        r6 = r4.f8516b;
        p000.jri.m13404b(r35);
        r4 = r35.mo9565d();
        if (r4 <= 0) goto L_0x03f0;
    L_0x002e:
        r4 = 1;
    L_0x002f:
        p000.jri.m13395a(r4);
        if (r5 >= r6) goto L_0x03eb;
    L_0x0034:
        r4 = p000.jiw.PORTRAIT;
        r11 = r4;
    L_0x0037:
        r4 = (float) r5;
        r5 = (float) r6;
        r18 = r4 / r5;
        r6 = new java.util.ArrayList;
        r4 = r35.mo9565d();
        r6.<init>(r4);
        r0 = r35;
        r4 = r0.f8350a;
        r7 = p000.ken.m13713a(r4);
        r4 = 0;
        r5 = r4;
    L_0x004e:
        r4 = r35.mo9565d();
        if (r5 >= r4) goto L_0x0076;
    L_0x0054:
        r4 = r7.get(r5);
        r4 = (java.lang.Long) r4;
        r8 = r4.longValue();
        r0 = r34;
        r4 = r0.f24762e;
        r4 = r4.mo9554a(r8);
        r4 = r4.mo9629a();
        r8 = new jjx;
        r8.<init>(r4, r5);
        r6.add(r8);
        r4 = r5 + 1;
        r5 = r4;
        goto L_0x004e;
    L_0x0076:
        java.util.Collections.sort(r6);
        r19 = new java.util.ArrayList;
        r4 = r35.mo9565d();
        r0 = r19;
        r0.<init>(r4);
        r7 = r6.size();
        r4 = 0;
    L_0x0089:
        if (r4 >= r7) goto L_0x00a0;
    L_0x008b:
        r5 = r4 + 1;
        r4 = r6.get(r4);
        r4 = (p000.jjx) r4;
        r4 = r4.f8254a;
        r4 = java.lang.Integer.valueOf(r4);
        r0 = r19;
        r0.add(r4);
        r4 = r5;
        goto L_0x0089;
    L_0x00a0:
        r4 = 0;
        r0 = r19;
        r4 = r0.get(r4);
        r4 = (java.lang.Integer) r4;
        r20 = r4.intValue();
        r0 = r34;
        r0 = r0.f24761d;
        r21 = r0;
        r0 = r21;
        r0 = r0.length;
        r22 = r0;
        r5 = 0;
        r4 = 0;
        r13 = r4;
        r4 = r5;
    L_0x00bc:
        r0 = r22;
        if (r13 >= r0) goto L_0x03e3;
    L_0x00c0:
        r12 = r21[r13];
        r6 = r35.mo9565d();
        r5 = 5;
        if (r6 > r5) goto L_0x03e0;
    L_0x00c9:
        r5 = 1;
    L_0x00ca:
        p000.jri.m13395a(r5);
        r5 = r12.f8228f;
        r5 = r5.size();
        if (r5 != r6) goto L_0x03dd;
    L_0x00d5:
        r5 = r12.f8226d;
        if (r5 != r11) goto L_0x03da;
    L_0x00d9:
        r5 = r12.f8227e;
        r6 = java.lang.Integer.valueOf(r20);
        r5 = r5.contains(r6);
        if (r5 == 0) goto L_0x03d7;
    L_0x00e5:
        r5 = 1;
    L_0x00e6:
        if (r5 != 0) goto L_0x00ec;
    L_0x00e8:
        r5 = r13 + 1;
        r13 = r5;
        goto L_0x00bc;
    L_0x00ec:
        r4 = r12.f8228f;
        r4 = r4.size();
        if (r4 <= 0) goto L_0x03d4;
    L_0x00f4:
        r4 = 1;
    L_0x00f5:
        p000.jri.m13395a(r4);
        r6 = r12.f8228f;
        r7 = new java.util.TreeMap;
        r4 = java.util.Collections.reverseOrder();
        r7.<init>(r4);
        r4 = 0;
        r5 = r4;
    L_0x0105:
        r4 = r6.size();
        if (r5 >= r4) goto L_0x0135;
    L_0x010b:
        r4 = r6.get(r5);
        r4 = (p000.jix) r4;
        r8 = r4.f8234c;
        r4 = r4.f8235d;
        r4 = r4 * r8;
        r8 = java.lang.Integer.valueOf(r4);
        r4 = r7.get(r8);
        r4 = (java.util.List) r4;
        if (r4 != 0) goto L_0x012a;
    L_0x0122:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r7.put(r8, r4);
    L_0x012a:
        r8 = java.lang.Integer.valueOf(r5);
        r4.add(r8);
        r4 = r5 + 1;
        r5 = r4;
        goto L_0x0105;
    L_0x0135:
        r23 = new java.util.ArrayList;
        r4 = r7.size();
        r0 = r23;
        r0.<init>(r4);
        r4 = r7.entrySet();
        r5 = r4.iterator();
    L_0x0148:
        r4 = r5.hasNext();
        if (r4 == 0) goto L_0x0160;
    L_0x014e:
        r4 = r5.next();
        r4 = (java.util.Map.Entry) r4;
        r4 = r4.getValue();
        r4 = (java.util.List) r4;
        r0 = r23;
        r0.add(r4);
        goto L_0x0148;
    L_0x0160:
        r14 = new java.util.ArrayList;
        r4 = r35.mo9565d();
        r14.<init>(r4);
        r24 = r23.size();
        r5 = 0;
        r4 = 0;
    L_0x016f:
        r0 = r24;
        if (r4 >= r0) goto L_0x03d1;
    L_0x0173:
        r15 = r4 + 1;
        r0 = r23;
        r4 = r0.get(r4);
        r10 = r4;
        r10 = (java.util.List) r10;
        r25 = r10.size();
        r26 = new java.util.ArrayList;
        r0 = r26;
        r1 = r25;
        r0.<init>(r1);
        r4 = 0;
        r16 = r5;
        r5 = r4;
    L_0x018f:
        r0 = r25;
        if (r5 >= r0) goto L_0x01aa;
    L_0x0193:
        r6 = r16 + 1;
        r0 = r19;
        r1 = r16;
        r4 = r0.get(r1);
        r4 = (java.lang.Integer) r4;
        r0 = r26;
        r0.add(r4);
        r4 = r5 + 1;
        r5 = r4;
        r16 = r6;
        goto L_0x018f;
    L_0x01aa:
        java.util.Collections.sort(r26);
        r4 = 0;
        r17 = r4;
    L_0x01b0:
        r0 = r17;
        r1 = r25;
        if (r0 >= r1) goto L_0x03cc;
    L_0x01b6:
        r0 = r17;
        r4 = r10.get(r0);
        r4 = (java.lang.Integer) r4;
        r5 = r4.intValue();
        r0 = r26;
        r1 = r17;
        r4 = r0.get(r1);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r0 = r35;
        r6 = r0.f8350a;
        r6 = p000.ken.m13713a(r6);
        r4 = r6.get(r4);
        r4 = (java.lang.Long) r4;
        r6 = r4.longValue();
        r4 = r12.f8228f;
        r4 = r4.get(r5);
        r4 = (p000.jix) r4;
        r5 = r4.f8234c;
        r5 = (float) r5;
        r8 = r4.f8235d;
        r8 = (float) r8;
        r9 = r5 / r8;
        r5 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1));
        if (r5 <= 0) goto L_0x03af;
    L_0x01f6:
        r5 = r18 - r9;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r8;
        r8 = r5 / r18;
        r5 = new android.graphics.RectF;
        r27 = 0;
        r28 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r28 = r28 - r8;
        r29 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r5.<init>(r8, r0, r1, r2);
        r8 = r5;
    L_0x0211:
        r0 = r34;
        r5 = r0.f24760c;
        r5 = r5.mo9599a(r6);
        r27 = p000.jxa.f8425p;
        r0 = r27;
        r27 = r5.mo9592b(r0);
        if (r27 == 0) goto L_0x02de;
    L_0x0223:
        r27 = -1079334229; // 0xffffffffbfaaaaab float:-1.3333334 double:NaN;
        r9 = r9 + r27;
        r9 = java.lang.Math.abs(r9);
        r27 = 897988541; // 0x358637bd float:1.0E-6 double:4.436652885E-315;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 <= 0) goto L_0x02de;
    L_0x0233:
        r9 = p000.jxa.f8425p;
        r5 = r5.mo9589a(r9);
        r5 = (android.graphics.RectF) r5;
        r9 = r8.left;
        r0 = r5.left;
        r27 = r0;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 <= 0) goto L_0x025f;
    L_0x0245:
        r9 = r8.left;
        r0 = r5.left;
        r27 = r0;
        r9 = r9 - r27;
        r0 = r8.left;
        r27 = r0;
        r27 = r27 - r9;
        r0 = r27;
        r8.left = r0;
        r0 = r8.right;
        r27 = r0;
        r9 = r27 - r9;
        r8.right = r9;
    L_0x025f:
        r9 = r8.right;
        r0 = r5.right;
        r27 = r0;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 >= 0) goto L_0x0283;
    L_0x0269:
        r9 = r5.right;
        r0 = r8.right;
        r27 = r0;
        r9 = r9 - r27;
        r0 = r8.left;
        r27 = r0;
        r27 = r27 + r9;
        r0 = r27;
        r8.left = r0;
        r0 = r8.right;
        r27 = r0;
        r9 = r9 + r27;
        r8.right = r9;
    L_0x0283:
        r9 = r8.top;
        r0 = r5.top;
        r27 = r0;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 <= 0) goto L_0x02a7;
    L_0x028d:
        r9 = r8.top;
        r0 = r5.top;
        r27 = r0;
        r9 = r9 - r27;
        r0 = r8.top;
        r27 = r0;
        r27 = r27 - r9;
        r0 = r27;
        r8.top = r0;
        r0 = r8.bottom;
        r27 = r0;
        r9 = r27 - r9;
        r8.bottom = r9;
    L_0x02a7:
        r9 = r8.bottom;
        r0 = r5.bottom;
        r27 = r0;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 >= 0) goto L_0x02cb;
    L_0x02b1:
        r9 = r5.bottom;
        r0 = r8.bottom;
        r27 = r0;
        r9 = r9 - r27;
        r0 = r8.top;
        r27 = r0;
        r27 = r27 + r9;
        r0 = r27;
        r8.top = r0;
        r0 = r8.bottom;
        r27 = r0;
        r9 = r9 + r27;
        r8.bottom = r9;
    L_0x02cb:
        r9 = r8.left;
        r0 = r5.left;
        r27 = r0;
        r9 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1));
        if (r9 > 0) goto L_0x03ac;
    L_0x02d5:
        r9 = r8.top;
        r5 = r5.top;
        r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x02de;
    L_0x02dd:
        r8 = 0;
    L_0x02de:
        if (r8 == 0) goto L_0x0339;
    L_0x02e0:
        r5 = r4.f8232a;
        r9 = r12.f8225c;
        r9 = (float) r9;
        r5 = (float) r5;
        r5 = r5 + r9;
        r0 = r12.f8223a;
        r27 = r0;
        r0 = r27;
        r0 = (float) r0;
        r27 = r0;
        r0 = r4.f8233b;
        r28 = r0;
        r0 = r28;
        r0 = (float) r0;
        r28 = r0;
        r28 = r28 + r9;
        r9 = r12.f8224b;
        r0 = (float) r9;
        r29 = r0;
        r0 = r4.f8234c;
        r30 = r0;
        r4 = r4.f8235d;
        r9 = new android.graphics.RectF;
        r31 = r5 / r27;
        r32 = r28 / r29;
        r0 = r30;
        r0 = (float) r0;
        r30 = r0;
        r5 = r5 + r30;
        r5 = r5 / r27;
        r4 = (float) r4;
        r4 = r4 + r28;
        r4 = r4 / r29;
        r0 = r31;
        r1 = r32;
        r9.<init>(r0, r1, r5, r4);
        r4 = new jkq;
        r5 = r12.f8228f;
        r0 = r17;
        r5 = r5.get(r0);
        r5 = (p000.jix) r5;
        r4.<init>(r5, r6, r8, r9);
        r14.add(r4);
        r4 = r17 + 1;
        r17 = r4;
        goto L_0x01b0;
    L_0x0339:
        r4 = 0;
    L_0x033a:
        if (r4 == 0) goto L_0x00e8;
    L_0x033c:
        r5 = r4;
        r4 = r12;
    L_0x033e:
        if (r4 != 0) goto L_0x038d;
    L_0x0340:
        r0 = r34;
        r4 = r0.f21555a;
        r5 = r35.mo9565d();
        r6 = java.lang.String.valueOf(r11);
        r7 = java.lang.String.valueOf(r4);
        r7 = r7.length();
        r8 = java.lang.String.valueOf(r6);
        r8 = r8.length();
        r9 = new java.lang.StringBuilder;
        r7 = r7 + 84;
        r7 = r7 + r8;
        r9.<init>(r7);
        r7 = "No matching collage layout found! Type = ";
        r9.append(r7);
        r9.append(r4);
        r4 = " Num of frames = ";
        r9.append(r4);
        r9.append(r5);
        r4 = " Orientation = ";
        r9.append(r4);
        r9.append(r6);
        r4 = "CollageArtifactRenderer";
        r5 = r9.toString();
        android.util.Log.e(r4, r5);
        r4 = new java.lang.IllegalStateException;
        r5 = "There should always be a valid layout.";
        r4.<init>(r5);
        throw r4;
    L_0x038d:
        r7 = new jjw;
        r7.<init>(r4, r5);
        r5 = new jjr;
        r6 = r7.f8252a;
        r7 = r7.f8253b;
        r0 = r34;
        r8 = r0.f21555a;
        r0 = r34;
        r9 = r0.f21556b;
        r10 = r35.mo9564c();
        r5.<init>(r6, r7, r8, r9, r10);
        r4 = p000.jli.m13199b(r5);
        return r4;
    L_0x03ac:
        r8 = 0;
        goto L_0x02de;
    L_0x03af:
        r5 = r9 - r18;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r8;
        r8 = r5 / r9;
        r5 = new android.graphics.RectF;
        r27 = 0;
        r28 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r29 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r29 = r29 - r8;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r5.<init>(r0, r8, r1, r2);
        r8 = r5;
        goto L_0x0211;
    L_0x03cc:
        r4 = r15;
        r5 = r16;
        goto L_0x016f;
    L_0x03d1:
        r4 = r14;
        goto L_0x033a;
    L_0x03d4:
        r4 = 0;
        goto L_0x00f5;
    L_0x03d7:
        r5 = 0;
        goto L_0x00e6;
    L_0x03da:
        r5 = 0;
        goto L_0x00e6;
    L_0x03dd:
        r5 = 0;
        goto L_0x00e6;
    L_0x03e0:
        r5 = 0;
        goto L_0x00ca;
    L_0x03e3:
        r5 = 0;
        r33 = r5;
        r5 = r4;
        r4 = r33;
        goto L_0x033e;
    L_0x03eb:
        r4 = p000.jiw.LANDSCAPE;
        r11 = r4;
        goto L_0x0037;
    L_0x03f0:
        r4 = 0;
        goto L_0x002f;
    L_0x03f3:
        r4 = 0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: jjv.a(juh, java.util.concurrent.Executor):jaq");
    }
}
