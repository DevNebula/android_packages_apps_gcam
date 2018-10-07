package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtk */
public final class dtk implements fwl {
    /* renamed from: a */
    public final bym f16711a;
    /* renamed from: b */
    private final iqz f16712b;
    /* renamed from: c */
    private final ird f16713c;
    /* renamed from: d */
    private final ffc f16714d;
    /* renamed from: e */
    private final fmg f16715e;
    /* renamed from: f */
    private final kbg f16716f;
    /* renamed from: g */
    private final duf f16717g;
    /* renamed from: h */
    private final fhg f16718h;
    /* renamed from: i */
    private final fde f16719i;
    /* renamed from: j */
    private final kpk f16720j;
    /* renamed from: k */
    private final int f16721k;
    /* renamed from: l */
    private final int f16722l;
    /* renamed from: m */
    private final dtd f16723m;
    /* renamed from: n */
    private final bzd f16724n;
    /* renamed from: o */
    private final fel f16725o;
    /* renamed from: p */
    private final cdo f16726p;
    /* renamed from: q */
    private final ccy f16727q;
    /* renamed from: r */
    private final bzt f16728r;
    /* renamed from: s */
    private final ilp f16729s;
    /* renamed from: t */
    private final grk f16730t;
    /* renamed from: u */
    private final boolean f16731u;

    public dtk(ird ird, ira ira, ffc ffc, fmg fmg, kbg kbg, duf duf, fhg fhg, kpk kpk, fde fde, bym bym, dtd dtd, bzd bzd, fel fel, gjk gjk, cdo cdo, ccy ccy, bzt bzt, ilp ilp, grk grk) {
        boolean z;
        this.f16713c = ird;
        this.f16714d = ffc;
        this.f16715e = fmg;
        this.f16716f = kbg;
        this.f16717g = duf;
        this.f16718h = fhg;
        this.f16719i = fde;
        this.f16720j = kpk;
        this.f16711a = bym;
        this.f16723m = dtd;
        this.f16724n = bzd;
        this.f16726p = cdo;
        this.f16727q = ccy;
        this.f16728r = bzt;
        this.f16729s = ilp;
        this.f16730t = grk;
        if (ffc.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        this.f16731u = z;
        if (this.f16731u) {
            Object fel2 = gjk;
        }
        this.f16725o = fel2;
        this.f16712b = ira.mo8854a("HdrPTImgCapCmd");
        this.f16712b.mo8837e("Creating HdrPlusTorchImageCaptureCommand.");
        this.f16721k = bym.mo2219a().getMax_full_metering_sweep_frames();
        this.f16722l = bym.mo2219a().getMax_payload_frames();
        if (fmg.mo6852b() >= this.f16721k) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (fmg.mo6852b() >= this.f16722l) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16729s;
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        if (hsy.f6966a != null) {
            return ilq.m3876a(fds.m10415a(new fin(hsy.f6966a, Integer.valueOf(0))));
        }
        return ilq.m3876a(fds.m10411a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1 A:{Catch:{ isr -> 0x0395, all -> 0x038a }} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1 A:{Catch:{ isr -> 0x0395, all -> 0x038a }} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Missing block: B:36:0x00e5, code:
            if (r15 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Missing block: B:38:?, code:
            p000.dtk.m9524a(r2, r15);
     */
    /* JADX WARNING: Missing block: B:45:?, code:
            p000.dtk.m9527a(r2, r14);
     */
    /* JADX WARNING: Missing block: B:51:0x00f5, code:
            if (r13 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Missing block: B:53:?, code:
            p000.dtk.m9525a(r2, r13);
     */
    /* JADX WARNING: Missing block: B:59:0x00fe, code:
            if (r9 != null) goto L_0x0100;
     */
    /* JADX WARNING: Missing block: B:61:?, code:
            p000.dtk.m9526a(r2, r9);
     */
    /* renamed from: a */
    public final void mo6937a(p000.fwm r19, p000.fwa r20) {
        /*
        r18 = this;
        r2 = p000.fdh.ANY;
        r3 = new fdg;
        r3.<init>(r2, r2, r2);
        r2 = p000.fdh.CONVERGED;
        r2 = r3.mo6756b(r2);
        r3 = p000.fdh.LOCKED;
        r2 = r2.mo6755a(r3);
        r3 = p000.fdh.CONVERGED;
        r5 = r2.mo6757c(r3);
        r0 = r18;
        r2 = r0.f16720j;
        r2 = p000.isr.m4201a(r2);
        r2 = (p000.ffw) r2;
        r2 = r2.mo13673b();
        r2 = (p000.fim) r2;
        r0 = r18;
        r3 = r0.f16714d;
        r3 = p000.bya.m1072b(r3);
        r0 = r18;
        r4 = r0.f16711a;
        r3 = r4.mo2226c(r3);
        if (r3 < 0) goto L_0x0387;
    L_0x003b:
        r4 = 1;
    L_0x003c:
        p000.jri.m13395a(r4);
        r0 = r18;
        r4 = r0.f16712b;
        r6 = "Executing HdrPlus torch capture command.";
        r4.mo8836d(r6);
        r0 = r18;
        r4 = r0.f16713c;
        r6 = "HdrPlusTorchCapture";
        r4.mo8856a(r6);
        r0 = r18;
        r4 = r0.f16713c;
        r6 = "SessionAndTorchLock";
        r4.mo8856a(r6);
        r0 = r18;
        r4 = r0.f16718h;	 Catch:{ all -> 0x0104 }
        r9 = r4.mo6790a();	 Catch:{ all -> 0x0104 }
        r0 = r18;
        r4 = r0.f16725o;	 Catch:{ all -> 0x00fb }
        r13 = r4.mo6765a(r9, r2);	 Catch:{ all -> 0x00fb }
        r14 = new ikb;	 Catch:{ all -> 0x00f2 }
        r14.<init>();	 Catch:{ all -> 0x00f2 }
        r2 = r13.mo13234a(r2);	 Catch:{ all -> 0x00eb }
        r0 = r18;
        r4 = r0.f16713c;	 Catch:{ all -> 0x00eb }
        r6 = "3AConvergence";
        r4.mo8858b(r6);	 Catch:{ all -> 0x00eb }
        r0 = r18;
        r4 = r0.f16719i;	 Catch:{ all -> 0x00eb }
        r15 = r4.mo6751a(r9, r5, r2);	 Catch:{ all -> 0x00eb }
        r6 = r15.mo6752a();	 Catch:{ all -> 0x00e2 }
        r11 = new fio;	 Catch:{ all -> 0x00e2 }
        r2 = r15.mo6753a(r2);	 Catch:{ all -> 0x00e2 }
        r11.<init>(r2);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f16713c;	 Catch:{ all -> 0x038a }
        r4 = "Metering";
        r2.mo8858b(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16717g;	 Catch:{ all -> 0x038a }
        r5 = r2.mo6062b();	 Catch:{ all -> 0x038a }
        r2 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x038a }
        if (r5 == r2) goto L_0x037c;
    L_0x00a6:
        r0 = r18;
        r2 = r0.f16713c;	 Catch:{ all -> 0x038a }
        r4 = "SmartMetering";
        r2.mo8856a(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16717g;	 Catch:{ isr -> 0x0395 }
        r4 = r2.mo6061a(r9, r11, r6);	 Catch:{ isr -> 0x0395 }
        r14.mo8557a(r4);	 Catch:{ isr -> 0x03b5 }
        r2 = r4.f16798a;	 Catch:{ isr -> 0x03b5 }
        r6 = r4.f16799b;	 Catch:{ isr -> 0x03ff }
        r16 = r5;
        r5 = r2;
        r2 = r16;
        r17 = r6;
        r6 = r4;
        r4 = r17;
    L_0x00c8:
        r0 = r18;
        r7 = r0.f16713c;	 Catch:{ all -> 0x038a }
        r7.mo8857b();	 Catch:{ all -> 0x038a }
        if (r4 != 0) goto L_0x0127;
    L_0x00d1:
        r0 = r18;
        r2 = r0.f16712b;	 Catch:{ all -> 0x038a }
        r3 = "Metering metadata is not available, aborting shot.";
        r2.mo8834c(r3);	 Catch:{ all -> 0x038a }
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x00e2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r3 = move-exception;
        if (r15 == 0) goto L_0x00ea;
    L_0x00e7:
        p000.dtk.m9524a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x00ea:
        throw r3;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00ed }
    L_0x00ed:
        r3 = move-exception;
        p000.dtk.m9527a(r2, r14);	 Catch:{ all -> 0x00f2 }
        throw r3;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00f4 }
    L_0x00f4:
        r3 = move-exception;
        if (r13 == 0) goto L_0x00fa;
    L_0x00f7:
        p000.dtk.m9525a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x00fa:
        throw r3;	 Catch:{ all -> 0x00fb }
    L_0x00fb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00fd }
    L_0x00fd:
        r3 = move-exception;
        if (r9 == 0) goto L_0x0103;
    L_0x0100:
        p000.dtk.m9526a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0103:
        throw r3;	 Catch:{ all -> 0x0104 }
    L_0x0104:
        r2 = move-exception;
        r0 = r18;
        r3 = r0.f16712b;
        r4 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r3.mo8836d(r4);
        r19.close();
        r0 = r18;
        r3 = r0.f16725o;
        r3.mo6766c();
        r0 = r18;
        r3 = r0.f16713c;
        r3.mo8857b();
        r0 = r18;
        r3 = r0.f16713c;
        r3.mo8857b();
        throw r2;
    L_0x0127:
        r10 = r2;
        r8 = r4;
        r7 = r5;
        r12 = r6;
    L_0x012b:
        r0 = r18;
        r2 = r0.f16713c;	 Catch:{ all -> 0x038a }
        r4 = "Shot";
        r2.mo8858b(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16713c;	 Catch:{ all -> 0x038a }
        r4 = "StartShotCapture";
        r2.mo8856a(r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16726p;	 Catch:{ all -> 0x038a }
        r5 = r2.mo12455b();	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16728r;	 Catch:{ all -> 0x038a }
        r2 = r2.mo2233a(r8, r3);	 Catch:{ all -> 0x038a }
        r0 = r20;
        r4 = r0.f4981a;	 Catch:{ all -> 0x038a }
        r4 = r4.f4674a;	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f16714d;	 Catch:{ all -> 0x038a }
        r4 = p000.axm.m759a(r4, r6);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f16727q;	 Catch:{ all -> 0x038a }
        r0 = r20;
        r4 = r6.mo12453a(r0, r2, r5, r4);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16711a;	 Catch:{ all -> 0x038a }
        r6 = r5.f1712e;	 Catch:{ all -> 0x038a }
        r5 = r20;
        r3 = r2.mo2214a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x038a }
        r0 = r18;
        r2 = r0.f16713c;	 Catch:{ all -> 0x0369 }
        r2.mo8857b();	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x01ce;
    L_0x017a:
        r0 = r18;
        r2 = r0.f16712b;	 Catch:{ all -> 0x0369 }
        r4 = "startShotCapture returned null. Payload failed.";
        r2.mo8834c(r4);	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x018d;
    L_0x0185:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x018d:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r3 = r0.f16711a;	 Catch:{ all -> 0x00e2 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00e2 }
        if (r15 == 0) goto L_0x019c;
    L_0x0198:
        r2 = 0;
        p000.dtk.m9524a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x019c:
        r2 = 0;
        p000.dtk.m9527a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x01a6;
    L_0x01a2:
        r2 = 0;
        p000.dtk.m9525a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x01a6:
        if (r9 == 0) goto L_0x01ac;
    L_0x01a8:
        r2 = 0;
        p000.dtk.m9526a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x01ac:
        r0 = r18;
        r2 = r0.f16712b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo8836d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f16725o;
        r2.mo6766c();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
    L_0x01cd:
        return;
    L_0x01ce:
        r0 = r18;
        r2 = r0.f16717g;	 Catch:{ all -> 0x0369 }
        r4 = r2.mo6063c();	 Catch:{ all -> 0x0369 }
        r2 = p000.C0252go.f5829ab;	 Catch:{ all -> 0x0369 }
        if (r10 != r2) goto L_0x0379;
    L_0x01da:
        r2 = r4.mo9709b();	 Catch:{ all -> 0x0369 }
        if (r2 == 0) goto L_0x0375;
    L_0x01e0:
        r0 = r18;
        r5 = r0.f16711a;	 Catch:{ all -> 0x0369 }
        r2 = r4.mo9706a();	 Catch:{ all -> 0x0369 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x0369 }
        r7 = r5.mo2216a(r3, r8, r2);	 Catch:{ all -> 0x0369 }
        r2 = r4.mo9706a();	 Catch:{ all -> 0x0369 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x0369 }
        r14.mo8557a(r2);	 Catch:{ all -> 0x0369 }
        r2 = r10;
    L_0x01f8:
        r19.close();	 Catch:{ all -> 0x0369 }
        r0 = r20;
        r5 = r0.f4983c;	 Catch:{ all -> 0x0369 }
        r4 = 2;
        r11.f4802a = r4;	 Catch:{ all -> 0x0369 }
        r11.mo6815c();	 Catch:{ all -> 0x0369 }
        r4 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x0369 }
        if (r2 == r4) goto L_0x0372;
    L_0x0209:
        r0 = r18;
        r4 = r0.f16711a;	 Catch:{ all -> 0x0369 }
        r4 = r4.mo2218a(r3, r7);	 Catch:{ all -> 0x0369 }
    L_0x0211:
        r6 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x0369 }
        if (r2 == r6) goto L_0x021f;
    L_0x0215:
        r2 = r4.getFrame_requests();	 Catch:{ all -> 0x0369 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0369 }
        if (r2 == 0) goto L_0x035e;
    L_0x021f:
        r0 = r18;
        r2 = r0.f16712b;	 Catch:{ all -> 0x0369 }
        r4 = "Smart metering failed or inactive, falling back to metering burst.";
        r2.mo8832b(r4);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f16723m;	 Catch:{ all -> 0x0369 }
        r4 = new fio;	 Catch:{ all -> 0x0369 }
        r4.<init>(r11);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r6 = r0.f16715e;	 Catch:{ all -> 0x0369 }
        r4 = r2.mo6056a(r3, r4, r6, r9);	 Catch:{ all -> 0x0369 }
    L_0x0239:
        if (r4 != 0) goto L_0x0299;
    L_0x023b:
        r0 = r18;
        r2 = r0.f16712b;	 Catch:{ all -> 0x0369 }
        r4 = "payloadBurstSpec is null. Payload failed.";
        r2.mo8834c(r4);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f16711a;	 Catch:{ all -> 0x0369 }
        r4 = r3.f1746a;	 Catch:{ all -> 0x0369 }
        r2.mo2223a(r4);	 Catch:{ all -> 0x0369 }
        if (r3 != 0) goto L_0x0257;
    L_0x024f:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x0257:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r3 = r0.f16711a;	 Catch:{ all -> 0x00e2 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00e2 }
        if (r15 == 0) goto L_0x0266;
    L_0x0262:
        r2 = 0;
        p000.dtk.m9524a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x0266:
        r2 = 0;
        p000.dtk.m9527a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x0270;
    L_0x026c:
        r2 = 0;
        p000.dtk.m9525a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x0270:
        if (r9 == 0) goto L_0x0276;
    L_0x0272:
        r2 = 0;
        p000.dtk.m9526a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0276:
        r0 = r18;
        r2 = r0.f16712b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo8836d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f16725o;
        r2.mo6766c();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
        goto L_0x01cd;
    L_0x0299:
        r10 = new dtl;	 Catch:{ all -> 0x0369 }
        r10.<init>(r15, r13, r9, r12);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r2 = r0.f16723m;	 Catch:{ all -> 0x0369 }
        r6 = new fio;	 Catch:{ all -> 0x0369 }
        r6.<init>(r11);	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r7 = r0.f16715e;	 Catch:{ all -> 0x0369 }
        r0 = r18;
        r8 = r0.f16716f;	 Catch:{ all -> 0x0369 }
        r0 = r20;
        r11 = r0.f4982b;	 Catch:{ all -> 0x0369 }
        r11 = r11.mo7077h();	 Catch:{ all -> 0x0369 }
        r4 = r2.mo6057a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0369 }
        if (r4 != 0) goto L_0x02d5;
    L_0x02bd:
        r2 = new isr;	 Catch:{ all -> 0x02c5 }
        r5 = "HDR+ torch shot didn't succeed";
        r2.<init>(r5);	 Catch:{ all -> 0x02c5 }
        throw r2;	 Catch:{ all -> 0x02c5 }
    L_0x02c5:
        r2 = move-exception;
        r16 = r4;
        r4 = r2;
        r2 = r16;
    L_0x02cb:
        if (r3 != 0) goto L_0x03b8;
    L_0x02cd:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x02d5:
        if (r3 != 0) goto L_0x02df;
    L_0x02d7:
        r2 = new isr;	 Catch:{ all -> 0x00e2 }
        r3 = "HDR+ torch shot didn't succeed";
        r2.<init>(r3);	 Catch:{ all -> 0x00e2 }
        throw r2;	 Catch:{ all -> 0x00e2 }
    L_0x02df:
        r2 = r3.f1746a;	 Catch:{ all -> 0x00e2 }
        if (r4 != 0) goto L_0x0323;
    L_0x02e3:
        r0 = r18;
        r3 = r0.f16711a;	 Catch:{ all -> 0x00e2 }
        r3.mo2223a(r2);	 Catch:{ all -> 0x00e2 }
    L_0x02ea:
        if (r15 == 0) goto L_0x02f0;
    L_0x02ec:
        r2 = 0;
        p000.dtk.m9524a(r2, r15);	 Catch:{ all -> 0x00eb }
    L_0x02f0:
        r2 = 0;
        p000.dtk.m9527a(r2, r14);	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x02fa;
    L_0x02f6:
        r2 = 0;
        p000.dtk.m9525a(r2, r13);	 Catch:{ all -> 0x00fb }
    L_0x02fa:
        if (r9 == 0) goto L_0x0300;
    L_0x02fc:
        r2 = 0;
        p000.dtk.m9526a(r2, r9);	 Catch:{ all -> 0x0104 }
    L_0x0300:
        r0 = r18;
        r2 = r0.f16712b;
        r3 = "Finalizing HdrPlusTorchImageCaptureCommand.";
        r2.mo8836d(r3);
        r19.close();
        r0 = r18;
        r2 = r0.f16725o;
        r2.mo6766c();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
        r0 = r18;
        r2 = r0.f16713c;
        r2.mo8857b();
        goto L_0x01cd;
    L_0x0323:
        r0 = r20;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo7077h();	 Catch:{ all -> 0x00e2 }
        r4 = 1;
        r3.mo7375a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4981a;	 Catch:{ all -> 0x00e2 }
        r3 = r3.f4681h;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r4 = r0.f16731u;	 Catch:{ all -> 0x00e2 }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ all -> 0x00e2 }
        r3.mo8826a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r4 = new dtm;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r4.<init>(r0, r2);	 Catch:{ all -> 0x00e2 }
        r3.mo13369a(r4);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f16730t;	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo7077h();	 Catch:{ all -> 0x00e2 }
        r2.mo7380a(r3);	 Catch:{ all -> 0x00e2 }
        goto L_0x02ea;
    L_0x035e:
        r0 = r18;
        r2 = r0.f16712b;	 Catch:{ all -> 0x0369 }
        r6 = "Smart metering succeeded, skipping metering burst.";
        r2.mo8832b(r6);	 Catch:{ all -> 0x0369 }
        goto L_0x0239;
    L_0x0369:
        r2 = move-exception;
        r4 = 0;
        r16 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02cb;
    L_0x0372:
        r4 = 0;
        goto L_0x0211;
    L_0x0375:
        r2 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x0369 }
        goto L_0x01f8;
    L_0x0379:
        r2 = r10;
        goto L_0x01f8;
    L_0x037c:
        r0 = r18;
        r2 = r0.f16724n;	 Catch:{ all -> 0x038a }
        r8 = r2.f12033a;	 Catch:{ all -> 0x038a }
        r12 = 0;
        r7 = 0;
        r10 = r5;
        goto L_0x012b;
    L_0x0387:
        r4 = 0;
        goto L_0x003c;
    L_0x038a:
        r2 = move-exception;
        r4 = 0;
        r3 = 0;
        r16 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r16;
        goto L_0x02cb;
    L_0x0395:
        r2 = move-exception;
        r4 = 0;
        r2 = 0;
    L_0x0398:
        r0 = r18;
        r5 = r0.f16712b;	 Catch:{ all -> 0x038a }
        r6 = "SmartMetering failed, switching it off.";
        r5.mo8838f(r6);	 Catch:{ all -> 0x038a }
        r5 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x038a }
        r0 = r18;
        r6 = r0.f16724n;	 Catch:{ all -> 0x038a }
        r6 = r6.f12033a;	 Catch:{ all -> 0x038a }
        r16 = r5;
        r5 = r2;
        r2 = r16;
        r17 = r6;
        r6 = r4;
        r4 = r17;
        goto L_0x00c8;
    L_0x03b5:
        r2 = move-exception;
        r2 = 0;
        goto L_0x0398;
    L_0x03b8:
        r3 = r3.f1746a;	 Catch:{ all -> 0x00e2 }
        if (r2 != 0) goto L_0x03c4;
    L_0x03bc:
        r0 = r18;
        r2 = r0.f16711a;	 Catch:{ all -> 0x00e2 }
        r2.mo2223a(r3);	 Catch:{ all -> 0x00e2 }
    L_0x03c3:
        throw r4;	 Catch:{ all -> 0x00e2 }
    L_0x03c4:
        r0 = r20;
        r2 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r2 = r2.mo7077h();	 Catch:{ all -> 0x00e2 }
        r5 = 1;
        r2.mo7375a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r2 = r0.f4981a;	 Catch:{ all -> 0x00e2 }
        r2 = r2.f4681h;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r5 = r0.f16731u;	 Catch:{ all -> 0x00e2 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x00e2 }
        r2.mo8826a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r2 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r5 = new dtm;	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r5.<init>(r0, r3);	 Catch:{ all -> 0x00e2 }
        r2.mo13369a(r5);	 Catch:{ all -> 0x00e2 }
        r0 = r18;
        r2 = r0.f16730t;	 Catch:{ all -> 0x00e2 }
        r0 = r20;
        r3 = r0.f4982b;	 Catch:{ all -> 0x00e2 }
        r3 = r3.mo7077h();	 Catch:{ all -> 0x00e2 }
        r2.mo7380a(r3);	 Catch:{ all -> 0x00e2 }
        goto L_0x03c3;
    L_0x03ff:
        r5 = move-exception;
        goto L_0x0398;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtk.a(fwm, fwa):void");
    }
}
