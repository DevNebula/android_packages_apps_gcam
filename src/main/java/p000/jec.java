package p000;

/* compiled from: PG */
/* renamed from: jec */
final class jec extends izy {
    /* renamed from: a */
    private final /* synthetic */ jdz f24734a;

    jec(jdz jdz) {
        this.f24734a = jdz;
    }

    /* JADX WARNING: Missing block: B:49:0x015d, code:
            if (r8 != null) goto L_0x015f;
     */
    /* JADX WARNING: Missing block: B:51:?, code:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:77:0x01c7, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:78:0x01c8, code:
            p000.kqg.m5105a(r0, r2);
     */
    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(java.lang.Object r16) {
        /*
        r15 = this;
        r16 = (p000.jeu) r16;
        r16.mo15570g();
        r0 = r15.f24734a;
        r0 = r0.f8098d;
        r0 = r0.mo15035c();
        r0 = (p000.jfc) r0;
        r1 = 35725; // 0x8b8d float:5.0061E-41 double:1.76505E-319;
        r1 = p000.jeh.m4489a(r1);
        r2 = r0.f26563e;
        if (r1 == r2) goto L_0x001f;
    L_0x001a:
        r1 = r0.f26563e;
        android.opengl.GLES20.glUseProgram(r1);
    L_0x001f:
        r1 = r15.f24734a;
        r1 = r1.f8099e;
        r1 = r1.values();
        r2 = r1.iterator();
    L_0x002b:
        r1 = r2.hasNext();
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r1 = r2.next();
        r1 = (p000.jeg) r1;
        r1.mo9354a(r0);
        goto L_0x002b;
    L_0x003b:
        r1 = r15.f24734a;
        r1 = r1.f8101g;
        r1 = r1.entrySet();
        r4 = r1.iterator();
        r1 = 0;
        r3 = r1;
    L_0x0049:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x007c;
    L_0x004f:
        r1 = r4.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (java.lang.String) r2;
        r5 = 33984; // 0x84c0 float:4.7622E-41 double:1.67903E-319;
        r5 = r5 + r3;
        android.opengl.GLES20.glActiveTexture(r5);
        r1 = r1.getValue();
        r1 = (p000.jdu) r1;
        r1 = r1.mo15035c();
        r1 = (p000.jfb) r1;
        r1.mo15576c();
        r1 = r0.mo15717a(r2);
        android.opengl.GLES20.glUniform1i(r1, r3);
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x0049;
    L_0x007c:
        r1 = r15.f24734a;
        r1 = r1.f8096b;
        r1 = r1.f24735a;
        r1 = r1.mo15035c();
        r1 = (p000.jet) r1;
        r1.mo15715b();
        r1 = r15.f24734a;
        r1 = r1.f8100f;
        r1 = r1.size();
        r8 = p000.ion.m4001a(r1);
        r9 = r0.f26563e;	 Catch:{ all -> 0x015a }
        r0 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r0 = r0.f8100f;	 Catch:{ all -> 0x015a }
        r0 = r0.entrySet();	 Catch:{ all -> 0x015a }
        r10 = r0.iterator();	 Catch:{ all -> 0x015a }
    L_0x00a5:
        r0 = r10.hasNext();	 Catch:{ all -> 0x015a }
        if (r0 == 0) goto L_0x01a2;
    L_0x00ab:
        r0 = r10.next();	 Catch:{ all -> 0x015a }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x015a }
        r1 = r0.getKey();	 Catch:{ all -> 0x015a }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x015a }
        r0 = r0.getValue();	 Catch:{ all -> 0x015a }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x015a }
        r11 = r0.intValue();	 Catch:{ all -> 0x015a }
        r0 = android.opengl.GLES20.glGetAttribLocation(r9, r1);	 Catch:{ all -> 0x015a }
        r1 = -1;
        if (r0 == r1) goto L_0x00a5;
    L_0x00c8:
        r1 = new jee;	 Catch:{ all -> 0x015a }
        r1.<init>(r0);	 Catch:{ all -> 0x015a }
        r8.add(r1);	 Catch:{ all -> 0x015a }
        android.opengl.GLES20.glEnableVertexAttribArray(r0);	 Catch:{ all -> 0x015a }
        r1 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r1 = r1.f8096b;	 Catch:{ all -> 0x015a }
        r1 = r1.f24736b;	 Catch:{ all -> 0x015a }
        r1 = r1[r11];	 Catch:{ all -> 0x015a }
        r1 = r1.mo9321b();	 Catch:{ all -> 0x015a }
        r2 = 4;
        if (r1 != r2) goto L_0x019f;
    L_0x00e2:
        r3 = 1;
    L_0x00e3:
        r1 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r1 = r1.f8096b;	 Catch:{ all -> 0x015a }
        r1 = r1.f24735a;	 Catch:{ all -> 0x015a }
        r1 = r1.mo15035c();	 Catch:{ all -> 0x015a }
        r1 = (p000.jet) r1;	 Catch:{ all -> 0x015a }
        r2 = r1.f26729d;	 Catch:{ all -> 0x015a }
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x0109;
    L_0x00f5:
        r2 = r1.f26726a;	 Catch:{ all -> 0x015a }
        r4 = p000.jfj.f8125c;	 Catch:{ all -> 0x015a }
        r2 = r2.mo9376b(r4);	 Catch:{ all -> 0x015a }
        if (r2 == 0) goto L_0x0103;
    L_0x00ff:
        r2 = 1;
        android.opengl.GLES31.glMemoryBarrier(r2);	 Catch:{ all -> 0x015a }
    L_0x0103:
        r2 = r1.f26729d;	 Catch:{ all -> 0x015a }
        r2 = r2 & -2;
        r1.f26729d = r2;	 Catch:{ all -> 0x015a }
    L_0x0109:
        r1 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r2 = r1.f8096b;	 Catch:{ all -> 0x015a }
        r1 = r2.f24737c;	 Catch:{ all -> 0x015a }
        r1 = r1[r11];	 Catch:{ all -> 0x015a }
        r2 = r2.f24736b;	 Catch:{ all -> 0x015a }
        r2 = r2[r11];	 Catch:{ all -> 0x015a }
        r4 = p000.jci.f8067a;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x019c;
    L_0x0119:
        r4 = p000.jci.f8070d;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x0199;
    L_0x011d:
        r4 = p000.jci.f8068b;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x0196;
    L_0x0121:
        r4 = p000.jci.f8071e;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x0193;
    L_0x0125:
        r4 = p000.jci.f8069c;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x0190;
    L_0x0129:
        r4 = p000.jci.f8072f;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x018d;
    L_0x012d:
        r4 = p000.jci.f8074h;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x018a;
    L_0x0131:
        r4 = p000.jci.f8075i;	 Catch:{ all -> 0x015a }
        if (r2 == r4) goto L_0x0163;
    L_0x0135:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x015a }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x015a }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x015a }
        r2 = r2.length();	 Catch:{ all -> 0x015a }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015a }
        r2 = r2 + 30;
        r3.<init>(r2);	 Catch:{ all -> 0x015a }
        r2 = "No Gl type for attribute type ";
        r3.append(r2);	 Catch:{ all -> 0x015a }
        r3.append(r1);	 Catch:{ all -> 0x015a }
        r1 = r3.toString();	 Catch:{ all -> 0x015a }
        r0.<init>(r1);	 Catch:{ all -> 0x015a }
        throw r0;	 Catch:{ all -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x015c }
    L_0x015c:
        r1 = move-exception;
        if (r8 == 0) goto L_0x0162;
    L_0x015f:
        r8.close();	 Catch:{ all -> 0x01c7 }
    L_0x0162:
        throw r1;
    L_0x0163:
        r2 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
    L_0x0165:
        r4 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r4 = r4.f8096b;	 Catch:{ all -> 0x015a }
        r4 = r4.mo15039a(r11);	 Catch:{ all -> 0x015a }
        r5 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r12 = r5.f8096b;	 Catch:{ all -> 0x015a }
        r6 = 0;
        r5 = 0;
        r14 = r5;
        r5 = r6;
        r6 = r14;
    L_0x0176:
        if (r6 >= r11) goto L_0x0185;
    L_0x0178:
        r7 = r12.mo15039a(r6);	 Catch:{ all -> 0x015a }
        r13 = r12.f24738d;	 Catch:{ all -> 0x015a }
        r7 = r7 * r13;
        r7 = r7 + r5;
        r5 = r6 + 1;
        r6 = r5;
        r5 = r7;
        goto L_0x0176;
    L_0x0185:
        android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x015a }
        goto L_0x00a5;
    L_0x018a:
        r2 = 5131; // 0x140b float:7.19E-42 double:2.535E-320;
        goto L_0x0165;
    L_0x018d:
        r2 = 5125; // 0x1405 float:7.182E-42 double:2.532E-320;
        goto L_0x0165;
    L_0x0190:
        r2 = 5124; // 0x1404 float:7.18E-42 double:2.5316E-320;
        goto L_0x0165;
    L_0x0193:
        r2 = 5123; // 0x1403 float:7.179E-42 double:2.531E-320;
        goto L_0x0165;
    L_0x0196:
        r2 = 5122; // 0x1402 float:7.177E-42 double:2.5306E-320;
        goto L_0x0165;
    L_0x0199:
        r2 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;
        goto L_0x0165;
    L_0x019c:
        r2 = 5120; // 0x1400 float:7.175E-42 double:2.5296E-320;
        goto L_0x0165;
    L_0x019f:
        r3 = 0;
        goto L_0x00e3;
    L_0x01a2:
        r0 = r15.f24734a;	 Catch:{ all -> 0x015a }
        r1 = r0.f8097c;	 Catch:{ all -> 0x015a }
        if (r1 == 0) goto L_0x01ae;
    L_0x01a8:
        r0 = new java.lang.NoSuchMethodError;	 Catch:{ all -> 0x015a }
        r0.<init>();	 Catch:{ all -> 0x015a }
        throw r0;	 Catch:{ all -> 0x015a }
    L_0x01ae:
        r1 = r0.f8095a;	 Catch:{ all -> 0x015a }
        r0 = r0.f8096b;	 Catch:{ all -> 0x015a }
        r0 = r0.f24738d;	 Catch:{ all -> 0x015a }
        r2 = 0;
        android.opengl.GLES20.glDrawArrays(r1, r2, r0);	 Catch:{ all -> 0x015a }
        if (r8 == 0) goto L_0x01bd;
    L_0x01ba:
        r8.close();
    L_0x01bd:
        r0 = r15.f24734a;
        r0 = r0.f8102h;
        if (r0 == 0) goto L_0x01c6;
    L_0x01c3:
        r16.mo13769a_();
    L_0x01c6:
        return;
    L_0x01c7:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);
        goto L_0x0162;
        */
        throw new UnsupportedOperationException("Method not decompiled: jec.a_(java.lang.Object):void");
    }

    public final String toString() {
        return "drawbuilder-draw-on-canvas";
    }
}
