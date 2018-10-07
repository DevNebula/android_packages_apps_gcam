package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtg */
public final class dtg implements fwl {
    /* renamed from: a */
    public final bym f16672a;
    /* renamed from: b */
    private final iqz f16673b;
    /* renamed from: c */
    private final ird f16674c;
    /* renamed from: d */
    private final ffc f16675d;
    /* renamed from: e */
    private final fmg f16676e;
    /* renamed from: f */
    private final kbg f16677f;
    /* renamed from: g */
    private final duf f16678g;
    /* renamed from: h */
    private final fhg f16679h;
    /* renamed from: i */
    private final fde f16680i;
    /* renamed from: j */
    private final kpk f16681j;
    /* renamed from: k */
    private final int f16682k;
    /* renamed from: l */
    private final int f16683l;
    /* renamed from: m */
    private final dtd f16684m;
    /* renamed from: n */
    private final bzd f16685n;
    /* renamed from: o */
    private final cdo f16686o;
    /* renamed from: p */
    private final ccy f16687p;
    /* renamed from: q */
    private final bzt f16688q;
    /* renamed from: r */
    private final ilp f16689r;
    /* renamed from: s */
    private final grk f16690s;

    public dtg(ird ird, ira ira, ffc ffc, fmg fmg, kbg kbg, duf duf, fhg fhg, kpk kpk, fde fde, bym bym, dtd dtd, bzd bzd, cdo cdo, ccy ccy, bzt bzt, ilp ilp, grk grk) {
        boolean z;
        this.f16674c = ird;
        this.f16675d = ffc;
        this.f16676e = fmg;
        this.f16677f = kbg;
        this.f16678g = duf;
        this.f16679h = fhg;
        this.f16680i = fde;
        this.f16681j = kpk;
        this.f16672a = bym;
        this.f16684m = dtd;
        this.f16685n = bzd;
        this.f16686o = cdo;
        this.f16687p = ccy;
        this.f16688q = bzt;
        this.f16689r = ilp;
        this.f16690s = grk;
        this.f16673b = ira.mo8854a("HdrPImgCapCmd");
        this.f16673b.mo8837e("Creating HdrPlusImageCaptureCommand.");
        this.f16682k = bym.mo2219a().getMax_full_metering_sweep_frames();
        this.f16683l = bym.mo2219a().getMax_payload_frames();
        if (fmg.mo6852b() >= this.f16682k) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (fmg.mo6852b() >= this.f16683l) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16689r;
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        if (hsy.f6966a != null) {
            return ilq.m3876a(fds.m10415a(new fin(hsy.f6966a, Integer.valueOf(0))));
        }
        return ilq.m3876a(fds.m10411a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5 A:{Catch:{ isr -> 0x030a, all -> 0x0301 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5 A:{Catch:{ isr -> 0x030a, all -> 0x0301 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARNING: Missing block: B:38:?, code:
            p000.dtg.m9518a(r2, r14);
     */
    /* JADX WARNING: Missing block: B:44:0x00e0, code:
            if (r13 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Missing block: B:46:?, code:
            p000.dtg.m9516a(r2, r13);
     */
    /* JADX WARNING: Missing block: B:52:0x00e9, code:
            if (r9 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Missing block: B:54:?, code:
            p000.dtg.m9517a(r2, r9);
     */
    /* renamed from: a */
    public final void mo6937a(p000.fwm r18, p000.fwa r19) {
        /*
        r17 = this;
        r0 = r17;
        r2 = r0.f16689r;
        r2 = r2.mo13673b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x0019;
    L_0x0010:
        r0 = r17;
        r2 = r0.f16673b;
        r3 = "WARNING: HdrPlusImageCaptureCommand was executed, but the command is not available. This may result in deadlocks or other unintended behavior.";
        r2.mo8834c(r3);
    L_0x0019:
        r2 = p000.fdh.LOCKED;
        r5 = new fdg;
        r3 = p000.fdh.ANY;
        r4 = p000.fdh.ANY;
        r5.<init>(r3, r2, r4);
        r0 = r17;
        r2 = r0.f16681j;
        r2 = p000.isr.m4201a(r2);
        r2 = (p000.ffw) r2;
        r2 = r2.mo13673b();
        r2 = (p000.fim) r2;
        r0 = r17;
        r3 = r0.f16675d;
        r3 = p000.bya.m1072b(r3);
        r0 = r17;
        r4 = r0.f16672a;
        r3 = r4.mo2226c(r3);
        if (r3 < 0) goto L_0x02fe;
    L_0x0046:
        r4 = 1;
    L_0x0047:
        p000.jri.m13395a(r4);
        r0 = r17;
        r4 = r0.f16673b;
        r6 = "Executing HdrPlus capture command.";
        r4.mo8836d(r6);
        r0 = r17;
        r4 = r0.f16674c;
        r6 = "HdrPlusCapture";
        r4.mo8856a(r6);
        r0 = r17;
        r4 = r0.f16674c;
        r6 = "SessionAnd3AConvergence";
        r4.mo8856a(r6);
        r0 = r17;
        r4 = r0.f16679h;	 Catch:{ all -> 0x00ef }
        r9 = r4.mo6790a();	 Catch:{ all -> 0x00ef }
        r0 = r17;
        r4 = r0.f16680i;	 Catch:{ all -> 0x00e6 }
        r13 = r4.mo6751a(r9, r5, r2);	 Catch:{ all -> 0x00e6 }
        r14 = new ikb;	 Catch:{ all -> 0x00dd }
        r14.<init>();	 Catch:{ all -> 0x00dd }
        r6 = r13.mo6752a();	 Catch:{ all -> 0x00d6 }
        r11 = new fio;	 Catch:{ all -> 0x00d6 }
        r2 = r13.mo6753a(r2);	 Catch:{ all -> 0x00d6 }
        r11.<init>(r2);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f16674c;	 Catch:{ all -> 0x00d6 }
        r4 = "Metering";
        r2.mo8858b(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f16678g;	 Catch:{ all -> 0x0301 }
        r5 = r2.mo6062b();	 Catch:{ all -> 0x0301 }
        r2 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x0301 }
        if (r5 == r2) goto L_0x02f3;
    L_0x009c:
        r0 = r17;
        r2 = r0.f16674c;	 Catch:{ all -> 0x0301 }
        r4 = "SmartMetering";
        r2.mo8856a(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16678g;	 Catch:{ isr -> 0x030a }
        r4 = r2.mo6061a(r9, r11, r6);	 Catch:{ isr -> 0x030a }
        r14.mo8557a(r4);	 Catch:{ isr -> 0x0328 }
        r2 = r4.f16798a;	 Catch:{ isr -> 0x0328 }
        r6 = r4.f16799b;	 Catch:{ isr -> 0x0355 }
        r15 = r5;
        r5 = r2;
        r2 = r15;
        r16 = r6;
        r6 = r4;
        r4 = r16;
    L_0x00bc:
        r0 = r17;
        r7 = r0.f16674c;	 Catch:{ all -> 0x0301 }
        r7.mo8857b();	 Catch:{ all -> 0x0301 }
        if (r4 != 0) goto L_0x0102;
    L_0x00c5:
        r0 = r17;
        r2 = r0.f16673b;	 Catch:{ all -> 0x0301 }
        r3 = "Metering metadata is not available, aborting shot.";
        r2.mo8834c(r3);	 Catch:{ all -> 0x0301 }
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x00d6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00d8 }
    L_0x00d8:
        r3 = move-exception;
        p000.dtg.m9518a(r2, r14);	 Catch:{ all -> 0x00dd }
        throw r3;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00df }
    L_0x00df:
        r3 = move-exception;
        if (r13 == 0) goto L_0x00e5;
    L_0x00e2:
        p000.dtg.m9516a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x00e5:
        throw r3;	 Catch:{ all -> 0x00e6 }
    L_0x00e6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00e8 }
    L_0x00e8:
        r3 = move-exception;
        if (r9 == 0) goto L_0x00ee;
    L_0x00eb:
        p000.dtg.m9517a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x00ee:
        throw r3;	 Catch:{ all -> 0x00ef }
    L_0x00ef:
        r2 = move-exception;
        r18.close();
        r0 = r17;
        r3 = r0.f16674c;
        r3.mo8857b();
        r0 = r17;
        r3 = r0.f16674c;
        r3.mo8857b();
        throw r2;
    L_0x0102:
        r10 = r2;
        r8 = r4;
        r7 = r5;
        r12 = r6;
    L_0x0106:
        r0 = r17;
        r2 = r0.f16674c;	 Catch:{ all -> 0x0301 }
        r4 = "Shot";
        r2.mo8858b(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16674c;	 Catch:{ all -> 0x0301 }
        r4 = "StartShotCapture";
        r2.mo8856a(r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16686o;	 Catch:{ all -> 0x0301 }
        r5 = r2.mo12455b();	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16688q;	 Catch:{ all -> 0x0301 }
        r2 = r2.mo2233a(r8, r3);	 Catch:{ all -> 0x0301 }
        r0 = r19;
        r4 = r0.f4981a;	 Catch:{ all -> 0x0301 }
        r4 = r4.f4674a;	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f16675d;	 Catch:{ all -> 0x0301 }
        r4 = p000.axm.m759a(r4, r6);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f16687p;	 Catch:{ all -> 0x0301 }
        r0 = r19;
        r4 = r6.mo12453a(r0, r2, r5, r4);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16672a;	 Catch:{ all -> 0x0301 }
        r6 = r5.f1712e;	 Catch:{ all -> 0x0301 }
        r5 = r19;
        r3 = r2.mo2214a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r2 = r0.f16674c;	 Catch:{ all -> 0x02e3 }
        r2.mo8857b();	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x0193;
    L_0x0155:
        r0 = r17;
        r2 = r0.f16673b;	 Catch:{ all -> 0x02e3 }
        r4 = "startShotCapture returned null. Payload failed.";
        r2.mo8834c(r4);	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x0168;
    L_0x0160:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x0168:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r3 = r0.f16672a;	 Catch:{ all -> 0x00d6 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00d6 }
        r2 = 0;
        p000.dtg.m9518a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x017b;
    L_0x0177:
        r2 = 0;
        p000.dtg.m9516a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x017b:
        if (r9 == 0) goto L_0x0181;
    L_0x017d:
        r2 = 0;
        p000.dtg.m9517a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x0181:
        r18.close();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
    L_0x0192:
        return;
    L_0x0193:
        r0 = r17;
        r2 = r0.f16678g;	 Catch:{ all -> 0x02e3 }
        r4 = r2.mo6063c();	 Catch:{ all -> 0x02e3 }
        r2 = p000.C0252go.f5829ab;	 Catch:{ all -> 0x02e3 }
        if (r10 != r2) goto L_0x02f0;
    L_0x019f:
        r2 = r4.mo9709b();	 Catch:{ all -> 0x02e3 }
        if (r2 == 0) goto L_0x02ec;
    L_0x01a5:
        r0 = r17;
        r5 = r0.f16672a;	 Catch:{ all -> 0x02e3 }
        r2 = r4.mo9706a();	 Catch:{ all -> 0x02e3 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x02e3 }
        r7 = r5.mo2216a(r3, r8, r2);	 Catch:{ all -> 0x02e3 }
        r2 = r4.mo9706a();	 Catch:{ all -> 0x02e3 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x02e3 }
        r14.mo8557a(r2);	 Catch:{ all -> 0x02e3 }
        r2 = r10;
    L_0x01bd:
        r18.close();	 Catch:{ all -> 0x02e3 }
        r0 = r19;
        r5 = r0.f4983c;	 Catch:{ all -> 0x02e3 }
        r4 = 2;
        r11.f4802a = r4;	 Catch:{ all -> 0x02e3 }
        r11.mo6815c();	 Catch:{ all -> 0x02e3 }
        r4 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x02e3 }
        if (r2 == r4) goto L_0x02e9;
    L_0x01ce:
        r0 = r17;
        r4 = r0.f16672a;	 Catch:{ all -> 0x02e3 }
        r4 = r4.mo2218a(r3, r7);	 Catch:{ all -> 0x02e3 }
    L_0x01d6:
        r6 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x02e3 }
        if (r2 == r6) goto L_0x01e4;
    L_0x01da:
        r2 = r4.getFrame_requests();	 Catch:{ all -> 0x02e3 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x02e3 }
        if (r2 == 0) goto L_0x02d8;
    L_0x01e4:
        r0 = r17;
        r2 = r0.f16673b;	 Catch:{ all -> 0x02e3 }
        r4 = "Smart metering failed or inactive, falling back to metering burst.";
        r2.mo8832b(r4);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f16684m;	 Catch:{ all -> 0x02e3 }
        r4 = new fio;	 Catch:{ all -> 0x02e3 }
        r4.<init>(r11);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r6 = r0.f16676e;	 Catch:{ all -> 0x02e3 }
        r4 = r2.mo6056a(r3, r4, r6, r9);	 Catch:{ all -> 0x02e3 }
    L_0x01fe:
        if (r4 != 0) goto L_0x0248;
    L_0x0200:
        r0 = r17;
        r2 = r0.f16673b;	 Catch:{ all -> 0x02e3 }
        r4 = "payloadBurstSpec is null. Payload failed.";
        r2.mo8834c(r4);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f16672a;	 Catch:{ all -> 0x02e3 }
        r4 = r3.f1746a;	 Catch:{ all -> 0x02e3 }
        r2.mo2223a(r4);	 Catch:{ all -> 0x02e3 }
        if (r3 != 0) goto L_0x021c;
    L_0x0214:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x021c:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r3 = r0.f16672a;	 Catch:{ all -> 0x00d6 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00d6 }
        r2 = 0;
        p000.dtg.m9518a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x022f;
    L_0x022b:
        r2 = 0;
        p000.dtg.m9516a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x022f:
        if (r9 == 0) goto L_0x0235;
    L_0x0231:
        r2 = 0;
        p000.dtg.m9517a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x0235:
        r18.close();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
        goto L_0x0192;
    L_0x0248:
        r10 = new dth;	 Catch:{ all -> 0x02e3 }
        r10.<init>(r13, r9, r12);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r2 = r0.f16684m;	 Catch:{ all -> 0x02e3 }
        r6 = new fio;	 Catch:{ all -> 0x02e3 }
        r6.<init>(r11);	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r7 = r0.f16676e;	 Catch:{ all -> 0x02e3 }
        r0 = r17;
        r8 = r0.f16677f;	 Catch:{ all -> 0x02e3 }
        r0 = r19;
        r11 = r0.f4982b;	 Catch:{ all -> 0x02e3 }
        r11 = r11.mo7077h();	 Catch:{ all -> 0x02e3 }
        r4 = r2.mo6057a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x02e3 }
        if (r4 != 0) goto L_0x0282;
    L_0x026c:
        r2 = new isr;	 Catch:{ all -> 0x0274 }
        r5 = "HDR+ shot didn't succeed";
        r2.<init>(r5);	 Catch:{ all -> 0x0274 }
        throw r2;	 Catch:{ all -> 0x0274 }
    L_0x0274:
        r2 = move-exception;
        r15 = r4;
        r4 = r2;
        r2 = r15;
    L_0x0278:
        if (r3 != 0) goto L_0x032b;
    L_0x027a:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x0282:
        if (r3 != 0) goto L_0x028c;
    L_0x0284:
        r2 = new isr;	 Catch:{ all -> 0x00d6 }
        r3 = "HDR+ shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;	 Catch:{ all -> 0x00d6 }
    L_0x028c:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00d6 }
        if (r4 != 0) goto L_0x02ba;
    L_0x0290:
        r0 = r17;
        r3 = r0.f16672a;	 Catch:{ all -> 0x00d6 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00d6 }
    L_0x0297:
        r2 = 0;
        p000.dtg.m9518a(r2, r14);	 Catch:{ all -> 0x00dd }
        if (r13 == 0) goto L_0x02a1;
    L_0x029d:
        r2 = 0;
        p000.dtg.m9516a(r2, r13);	 Catch:{ all -> 0x00e6 }
    L_0x02a1:
        if (r9 == 0) goto L_0x02a7;
    L_0x02a3:
        r2 = 0;
        p000.dtg.m9517a(r2, r9);	 Catch:{ all -> 0x00ef }
    L_0x02a7:
        r18.close();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
        r0 = r17;
        r2 = r0.f16674c;
        r2.mo8857b();
        goto L_0x0192;
    L_0x02ba:
        r0 = r19;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00d6 }
        r4 = new dti;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r4.<init>(r0, r2);	 Catch:{ all -> 0x00d6 }
        r3.mo13369a(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f16690s;	 Catch:{ all -> 0x00d6 }
        r0 = r19;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00d6 }
        r3 = r3.mo7077h();	 Catch:{ all -> 0x00d6 }
        r2.mo7380a(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x0297;
    L_0x02d8:
        r0 = r17;
        r2 = r0.f16673b;	 Catch:{ all -> 0x02e3 }
        r6 = "Smart metering succeeded, skipping metering burst.";
        r2.mo8832b(r6);	 Catch:{ all -> 0x02e3 }
        goto L_0x01fe;
    L_0x02e3:
        r2 = move-exception;
        r4 = 0;
        r15 = r4;
        r4 = r2;
        r2 = r15;
        goto L_0x0278;
    L_0x02e9:
        r4 = 0;
        goto L_0x01d6;
    L_0x02ec:
        r2 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x02e3 }
        goto L_0x01bd;
    L_0x02f0:
        r2 = r10;
        goto L_0x01bd;
    L_0x02f3:
        r0 = r17;
        r2 = r0.f16685n;	 Catch:{ all -> 0x0301 }
        r8 = r2.f12033a;	 Catch:{ all -> 0x0301 }
        r12 = 0;
        r7 = 0;
        r10 = r5;
        goto L_0x0106;
    L_0x02fe:
        r4 = 0;
        goto L_0x0047;
    L_0x0301:
        r2 = move-exception;
        r4 = 0;
        r3 = 0;
        r15 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r15;
        goto L_0x0278;
    L_0x030a:
        r2 = move-exception;
        r4 = 0;
        r2 = 0;
    L_0x030d:
        r0 = r17;
        r5 = r0.f16673b;	 Catch:{ all -> 0x0301 }
        r6 = "SmartMetering failed, switching it off.";
        r5.mo8838f(r6);	 Catch:{ all -> 0x0301 }
        r5 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x0301 }
        r0 = r17;
        r6 = r0.f16685n;	 Catch:{ all -> 0x0301 }
        r6 = r6.f12033a;	 Catch:{ all -> 0x0301 }
        r15 = r5;
        r5 = r2;
        r2 = r15;
        r16 = r6;
        r6 = r4;
        r4 = r16;
        goto L_0x00bc;
    L_0x0328:
        r2 = move-exception;
        r2 = 0;
        goto L_0x030d;
    L_0x032b:
        r3 = r3.f1746a;	 Catch:{ all -> 0x00d6 }
        if (r2 != 0) goto L_0x0337;
    L_0x032f:
        r0 = r17;
        r2 = r0.f16672a;	 Catch:{ all -> 0x00d6 }
        r2.mo2223a(r3);	 Catch:{ all -> 0x00d6 }
    L_0x0336:
        throw r4;	 Catch:{ all -> 0x00d6 }
    L_0x0337:
        r0 = r19;
        r2 = r0.f4982b;	 Catch:{ all -> 0x00d6 }
        r5 = new dti;	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r5.<init>(r0, r3);	 Catch:{ all -> 0x00d6 }
        r2.mo13369a(r5);	 Catch:{ all -> 0x00d6 }
        r0 = r17;
        r2 = r0.f16690s;	 Catch:{ all -> 0x00d6 }
        r0 = r19;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00d6 }
        r3 = r3.mo7077h();	 Catch:{ all -> 0x00d6 }
        r2.mo7380a(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x0336;
    L_0x0355:
        r5 = move-exception;
        goto L_0x030d;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtg.a(fwm, fwa):void");
    }
}
