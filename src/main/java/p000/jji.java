package p000;

/* compiled from: PG */
/* renamed from: jji */
final class jji extends izy {
    /* renamed from: a */
    private final jjl f24752a;
    /* renamed from: b */
    private final /* synthetic */ jjh f24753b;

    public jji(jjh jjh, jjl jjl) {
        this.f24753b = jjh;
        this.f24752a = jjl;
    }

    /* JADX WARNING: Missing block: B:17:0x00a0, code:
            if (r7 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Missing block: B:19:?, code:
            r7.mo15063a();
     */
    /* JADX WARNING: Missing block: B:21:0x00a6, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:22:0x00a7, code:
            p000.kqg.m5105a(r0, r2);
     */
    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(java.lang.Object r14) {
        /*
        r13 = this;
        r14 = (p000.jqs) r14;
        p000.jri.m13404b(r14);
        r0 = r13.f24753b;
        r1 = r0.f21543b;
        r0 = r0.f21545d;
        r2 = "all-smiles canvas";
        r2 = p000.jqp.m4671a(r1, r0, r2);
        r0 = r13.f24753b;
        r1 = r0.f21546e;
        r0 = r0.f21542a;
        r0 = r1.mo15045b(r0);
        r1 = r13.f24752a;
        r3 = r1.f8251c;
        r1 = r1.f8250b;
        r3 = com.google.android.libraries.smartburst.filterpacks.face.FaceEditor.getCroppedFaceData(r3, r1, r0);
        r4 = new android.graphics.Canvas;
        r0 = r2.mo9674e();
        r0 = (android.graphics.Bitmap) r0;
        r4.<init>(r0);
        r5 = new android.graphics.Paint;
        r5.<init>();
        r0 = r13.f24752a;
        r0 = r0.f8250b;
        r6 = r0.iterator();
    L_0x003d:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x008d;
    L_0x0043:
        r0 = r6.next();
        r0 = (android.util.Pair) r0;
        r1 = r0.first;
        r1 = (android.graphics.Rect) r1;
        r0 = r0.second;
        r0 = (android.graphics.Rect) r0;
        r7 = r13.f24753b;
        r7 = r7.f21543b;
        r7 = r14.mo13823a(r1, r7);
        r1 = r7.mo9674e();	 Catch:{ all -> 0x009d }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x009d }
        r1 = r1.isPremultiplied();	 Catch:{ all -> 0x009d }
        if (r1 != 0) goto L_0x006f;
    L_0x0065:
        r1 = r7.mo9674e();	 Catch:{ all -> 0x009d }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x009d }
        r8 = 1;
        r1.setPremultiplied(r8);	 Catch:{ all -> 0x009d }
    L_0x006f:
        r1 = r7.mo9674e();	 Catch:{ all -> 0x009d }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x009d }
        r8 = new android.graphics.Rect;	 Catch:{ all -> 0x009d }
        r9 = r0.width();	 Catch:{ all -> 0x009d }
        r10 = r0.height();	 Catch:{ all -> 0x009d }
        r11 = 0;
        r12 = 0;
        r8.<init>(r11, r12, r9, r10);	 Catch:{ all -> 0x009d }
        r4.drawBitmap(r1, r8, r0, r5);	 Catch:{ all -> 0x009d }
        if (r7 == 0) goto L_0x003d;
    L_0x0089:
        r7.mo15063a();
        goto L_0x003d;
    L_0x008d:
        r0 = 0;
        r4.setBitmap(r0);
        r0 = r13.f24753b;
        r0 = r0.f21544c;
        r1 = r13.f24752a;
        r4 = r1.f8249a;
        r0.addPhoto(r2, r3, r4);
        return;
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x009f:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00a5;
    L_0x00a2:
        r7.mo15063a();	 Catch:{ all -> 0x00a6 }
    L_0x00a5:
        throw r1;
    L_0x00a6:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.a_(java.lang.Object):void");
    }
}
