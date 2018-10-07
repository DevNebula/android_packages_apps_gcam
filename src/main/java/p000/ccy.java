package p000;

/* compiled from: PG */
/* renamed from: ccy */
public final class ccy implements kwk {
    /* renamed from: a */
    public final bzo f12189a;
    /* renamed from: b */
    public final kbg f12190b;
    /* renamed from: c */
    public final kbg f12191c;
    /* renamed from: d */
    public final kbg f12192d;
    /* renamed from: e */
    public final kbg f12193e;
    /* renamed from: f */
    public final etj f12194f;
    /* renamed from: g */
    public fyy f12195g;
    /* renamed from: h */
    public final iqz f12196h;
    /* renamed from: i */
    public final kbg f12197i;
    /* renamed from: j */
    private final kbg f12198j;

    public ccy(bzo bzo, kwa kwa, kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kbg kbg5, etj etj, fyy fyy, iqz iqz) {
        this.f12189a = bzo;
        this.f12198j = (kbg) kwa.mo10562a();
        this.f12190b = kbg;
        this.f12191c = kbg2;
        this.f12192d = kbg3;
        this.f12193e = kbg4;
        this.f12197i = kbg5;
        this.f12194f = etj;
        this.f12195g = fyy;
        this.f12196h = iqz;
    }

    /* JADX WARNING: Missing block: B:17:?, code:
            r10.close();
     */
    /* JADX WARNING: Missing block: B:19:0x00ab, code:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00ac, code:
            p000.kqg.m5105a(r1, r3);
     */
    /* renamed from: a */
    public static /* synthetic */ void m8127a(p000.ccy r15, p000.fwa r16, p000.kbn r17, p000.kpw r18, p000.iwz r19, com.google.googlex.gcam.ExifMetadata r20, boolean r21, int r22) {
        /*
        r1 = r18.isDone();
        r2 = "Base frame metadata not available in YUV callback";
        p000.jri.m13406b(r1, r2);
        r1 = p000.kow.m13881c(r18);
        r4 = r1;
        r4 = (p000.iwp) r4;
        r1 = r19.mo13745g();
        r2 = r19.mo13742d();
        r0 = r20;
        r6 = p000.bxe.m1057a(r1, r2, r0);
        r10 = new iuz;
        r1 = 1;
        r0 = r19;
        r10.<init>(r0, r1);
        r11 = r15.f12189a;	 Catch:{ all -> 0x00a4 }
        r0 = r16;
        r1 = r0.f4981a;	 Catch:{ all -> 0x00a4 }
        r8 = r1.f4680g;	 Catch:{ all -> 0x00a4 }
        r1 = r15.f12191c;	 Catch:{ all -> 0x00a4 }
        r2 = r10.mo15556h();	 Catch:{ all -> 0x00a4 }
        r2 = p000.jri.m13404b(r2);	 Catch:{ all -> 0x00a4 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x00a4 }
        r3 = r1.mo9709b();	 Catch:{ all -> 0x00a4 }
        if (r3 != 0) goto L_0x0061;
    L_0x0040:
        r2.close();	 Catch:{ all -> 0x00a4 }
    L_0x0043:
        r1 = r15.f12190b;	 Catch:{ all -> 0x00a4 }
        r1 = r1.mo9709b();	 Catch:{ all -> 0x00a4 }
        if (r1 == 0) goto L_0x005d;
    L_0x004b:
        r1 = r15.f12190b;	 Catch:{ all -> 0x00a4 }
        r1 = r1.mo9706a();	 Catch:{ all -> 0x00a4 }
        r1 = (p000.faj) r1;	 Catch:{ all -> 0x00a4 }
        r2 = r10.mo15556h();	 Catch:{ all -> 0x00a4 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x00a4 }
        r1.mo6701a();	 Catch:{ all -> 0x00a4 }
    L_0x005d:
        r10.close();
        return;
    L_0x0061:
        r1 = r1.mo9706a();	 Catch:{ all -> 0x00a4 }
        r0 = r1;
        r0 = (p000.fph) r0;	 Catch:{ all -> 0x00a4 }
        r9 = r0;
        r1 = new gfw;	 Catch:{ all -> 0x00a4 }
        r3 = p000.iqm.m4095a(r22);	 Catch:{ all -> 0x00a4 }
        r4 = p000.kow.m13873a(r4);	 Catch:{ all -> 0x00a4 }
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00a4 }
        r7 = r2.mo13745g();	 Catch:{ all -> 0x00a4 }
        r12 = r2.mo13742d();	 Catch:{ all -> 0x00a4 }
        r13 = 0;
        r14 = 0;
        r5.<init>(r13, r14, r7, r12);	 Catch:{ all -> 0x00a4 }
        r0 = r16;
        r7 = r0.f4982b;	 Catch:{ all -> 0x00a4 }
        r7 = r7.mo7077h();	 Catch:{ all -> 0x00a4 }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00a4 }
        r0 = r21;
        r1 = r9.mo6868a(r1, r0);	 Catch:{ all -> 0x00a4 }
        r3 = new bzp;	 Catch:{ all -> 0x00a4 }
        r4 = r11;
        r5 = r2;
        r7 = r16;
        r9 = r17;
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00a4 }
        r2 = p000.kpq.f8776a;	 Catch:{ all -> 0x00a4 }
        p000.kow.m13878a(r1, r3, r2);	 Catch:{ all -> 0x00a4 }
        goto L_0x0043;
    L_0x00a4:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00a6 }
    L_0x00a6:
        r2 = move-exception;
        r10.close();	 Catch:{ all -> 0x00ab }
    L_0x00aa:
        throw r2;
    L_0x00ab:
        r3 = move-exception;
        p000.kqg.m5105a(r1, r3);
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: ccy.a(ccy, fwa, kbn, kpw, iwz, com.google.googlex.gcam.ExifMetadata, boolean, int):void");
    }

    /* renamed from: a */
    public final bzx mo12453a(fwa fwa, bzs bzs, bxc bxc, int i) {
        kbg b;
        caa caa = new caa((byte) 0);
        kpw d = kpw.m18486d();
        kpw d2 = kpw.m18486d();
        kpw d3 = kpw.m18486d();
        if (this.f12198j.mo9709b()) {
            b = ((eyg) this.f12198j.mo9706a()).mo6678b(fwa.f4982b.mo13383l());
        } else {
            b = kau.f21835a;
        }
        if (b.mo9709b()) {
            eyh eyh = (eyh) b.mo9706a();
            synchronized (eyh.f4584g) {
                eyh.f4580c = true;
            }
        }
        bxa bxa = new bxa(this, fwa, bxc.f1709b);
        caa.f1801a = kbg.m4804c(new caf(this, fwa));
        caa.f1802b = kbg.m4804c(new bzy(this, b, fwa, i, d, d2, d3));
        if (bxc.f1711d.contains(bxh.POSTVIEW)) {
            caa.f1804d = kbg.m4804c(new bzz(b, i, fwa));
        }
        if (bxc.f1711d.contains(bxh.JPEG)) {
            caa.f1809i = kbg.m4804c(new cad(this, fwa, bxa));
        }
        kpw d4 = kpw.m18486d();
        caa.f1803c = kbg.m4804c(new cab(d4));
        if (bxc.f1711d.contains(bxh.YUV)) {
            caa.f1807g = kbg.m4804c(new cai(this, d4, d3, d2, fwa, bxa, bxc, i));
        }
        knk d5 = kpw.m18486d();
        if (bxc.f1711d.contains(bxh.MERGED_PD)) {
            caa.f1806f = kbg.m4804c(new cae(d5));
        } else {
            d5.cancel(false);
        }
        if (bxc.f1711d.contains(bxh.RGB)) {
            caa.f1808h = kbg.m4804c(new cah(this, d3, d, d2, d4, bxc, fwa, bxa, i, bzs, d5));
        }
        if (bxc.f1711d.contains(bxh.MERGED_DNG)) {
            caa.f1805e = kbg.m4804c(new cag(this, fwa, bxa, i));
        }
        caa.f1810j = kbg.m4804c(new cac(this, fwa));
        return new bwz(caa.f1801a, caa.f1802b, caa.f1803c, caa.f1804d, caa.f1805e, caa.f1806f, caa.f1807g, caa.f1808h, caa.f1809i, caa.f1810j);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }
}
