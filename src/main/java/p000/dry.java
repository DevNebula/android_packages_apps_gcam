package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dry */
public final class dry extends dtx {
    /* renamed from: a */
    public final bym f24059a;
    /* renamed from: e */
    private final iqz f24060e;
    /* renamed from: f */
    private final ffc f24061f;
    /* renamed from: g */
    private final cdo f24062g;
    /* renamed from: h */
    private final grk f24063h;
    /* renamed from: i */
    private final int f24064i;
    /* renamed from: j */
    private final ccy f24065j;
    /* renamed from: k */
    private final bzt f24066k;

    public dry(ira ira, ird ird, ffr ffr, dqo dqo, fwl fwl, dty dty, fgr fgr, bxg bxg, long j, Set set, ffc ffc, bym bym, cdo cdo, ccy ccy, bzt bzt, grk grk, int i) {
        boolean z;
        super(ira, ird, ffr, dqo, fwl, dty, fgr, bxg.f1720g, bxg.f1722i, j, set, null);
        this.f24065j = ccy;
        this.f24066k = bzt;
        if (bxg.f1721h >= bxg.f1720g) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f24061f = ffc;
        this.f24059a = bym;
        this.f24062g = cdo;
        this.f24063h = grk;
        this.f24064i = i;
        this.f24060e = ira.mo8854a("HdrZslImgCptrCmd");
    }

    /* renamed from: c */
    protected final List mo13050c() {
        return this.f16777c.mo13254d();
    }

    /* renamed from: d */
    protected final bbo mo13051d() {
        if (this.f16778d != null) {
            return new bbo(new ArrayList(this.f16778d.mo13254d()));
        }
        return new bbo();
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        if (this.f16778d != null) {
            return ilq.m3876a(fds.m10418a(fds.m10414a(this.f16777c), fds.m10414a(this.f16778d), fds.m10417a(khb.m4955c(this.f16776b))));
        }
        return ilq.m3876a(fds.m10418a(fds.m10414a(this.f16777c), fds.m10417a(khb.m4955c(this.f16776b))));
    }

    public final String toString() {
        return "HdrPlusZslCaptureCommand";
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x022d A:{LOOP_END, Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }, LOOP:3: B:63:0x0227->B:65:0x022d} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ca A:{Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019c A:{SYNTHETIC, Splitter: B:41:0x019c} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ca A:{Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019c A:{SYNTHETIC, Splitter: B:41:0x019c} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ca A:{Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }} */
    /* renamed from: a */
    protected final boolean mo13049a(p000.fwm r18, p000.fwa r19, java.util.List r20, java.util.List r21) {
        /*
        r17 = this;
        r2 = 0;
        r0 = r20;
        r2 = r0.get(r2);	 Catch:{ ExecutionException -> 0x0292 }
        r2 = (p000.fjj) r2;	 Catch:{ ExecutionException -> 0x0292 }
        r2 = r2.mo13250d();	 Catch:{ ExecutionException -> 0x0292 }
        r7 = r2.get();	 Catch:{ ExecutionException -> 0x0292 }
        r7 = (p000.iwp) r7;	 Catch:{ ExecutionException -> 0x0292 }
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x0292 }
        r3 = "Acquired metadata from the first frame.";
        r2.mo8832b(r3);	 Catch:{ ExecutionException -> 0x0292 }
        r0 = r17;
        r2 = r0.f24061f;
        r2 = p000.bya.m1072b(r2);
        r0 = r17;
        r3 = r0.f24059a;
        r3 = r3.mo2226c(r2);
        if (r3 < 0) goto L_0x028f;
    L_0x002e:
        r2 = 1;
    L_0x002f:
        p000.jri.m13395a(r2);
        r0 = r17;
        r2 = r0.f24062g;
        r5 = r2.mo12455b();
        r0 = r17;
        r2 = r0.f24066k;
        r2 = r2.mo2233a(r7, r3);
        r0 = r19;
        r4 = r0.f4981a;
        r4 = r4.f4674a;
        r0 = r17;
        r6 = r0.f24061f;
        r4 = p000.axm.m759a(r4, r6);
        r0 = r17;
        r6 = r0.f24065j;
        r0 = r19;
        r4 = r6.mo12453a(r0, r2, r5, r4);
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = "Starting HdrPlus#ZslShotCapture.";
        r2.mo8836d(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r2 = r0.f24059a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = r5.f1712e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r5 = r19;
        r3 = r2.mo2215a(r3, r4, r5, r6, r7);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r3 != 0) goto L_0x007c;
    L_0x0071:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = "Failed to initiate HDR plus shot capture.";
        r2.mo8838f(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2 = 0;
    L_0x007b:
        return r2;
    L_0x007c:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = "Flashing shot capture indicator and releasing image capture lock.";
        r2.mo8836d(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        p000.dtx.m9547a(r19);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r18.close();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r2 = r0.f24059a;	 Catch:{ all -> 0x029f }
        r4 = new com.google.googlex.gcam.BurstSpec;	 Catch:{ all -> 0x029f }
        r4.<init>();	 Catch:{ all -> 0x029f }
        r2.mo2222a(r3, r4);	 Catch:{ all -> 0x029f }
        r11 = r20.iterator();	 Catch:{ all -> 0x029f }
        r8 = 0;
        r7 = 0;
        r4 = 0;
    L_0x009e:
        r2 = r11.hasNext();	 Catch:{ all -> 0x02aa }
        if (r2 == 0) goto L_0x01fd;
    L_0x00a4:
        r2 = r11.next();	 Catch:{ all -> 0x02aa }
        r2 = (p000.fjj) r2;	 Catch:{ all -> 0x02aa }
        r5 = r2.mo13250d();	 Catch:{ all -> 0x02aa }
        r5 = r5.get();	 Catch:{ all -> 0x02aa }
        r5 = (p000.iwp) r5;	 Catch:{ all -> 0x02aa }
        r6 = 3;
        r6 = new int[r6];	 Catch:{ all -> 0x02aa }
        r9 = 0;
        r10 = 37;
        r6[r9] = r10;	 Catch:{ all -> 0x02aa }
        r9 = 1;
        r10 = 38;
        r6[r9] = r10;	 Catch:{ all -> 0x02aa }
        r9 = 2;
        r10 = 32;
        r6[r9] = r10;	 Catch:{ all -> 0x02aa }
        r6 = p000.fds.m10424a(r2, r6);	 Catch:{ all -> 0x02aa }
        r12 = r2.mo13251e();	 Catch:{ all -> 0x02aa }
        if (r6 == 0) goto L_0x01fa;
    L_0x00d0:
        r2 = 1;
    L_0x00d1:
        r10 = r8 | r2;
        r8 = r21.iterator();	 Catch:{ all -> 0x02b0 }
    L_0x00d7:
        r2 = r8.hasNext();	 Catch:{ all -> 0x02b0 }
        if (r2 == 0) goto L_0x01f7;
    L_0x00dd:
        r2 = r8.next();	 Catch:{ all -> 0x02b0 }
        r2 = (p000.fjj) r2;	 Catch:{ all -> 0x02b0 }
        r14 = r2.mo13251e();	 Catch:{ all -> 0x02b0 }
        r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r9 != 0) goto L_0x00d7;
    L_0x00eb:
        r0 = r21;
        r0.remove(r2);	 Catch:{ all -> 0x02b0 }
        if (r2 == 0) goto L_0x01d8;
    L_0x00f2:
        r0 = r17;
        r8 = r0.f24060e;	 Catch:{ all -> 0x02b0 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02b0 }
        r14 = 39;
        r9.<init>(r14);	 Catch:{ all -> 0x02b0 }
        r14 = "PD frame found for ";
        r9.append(r14);	 Catch:{ all -> 0x02b0 }
        r9.append(r12);	 Catch:{ all -> 0x02b0 }
        r9 = r9.toString();	 Catch:{ all -> 0x02b0 }
        r8.mo8836d(r9);	 Catch:{ all -> 0x02b0 }
        r8 = 1;
        r8 = new int[r8];	 Catch:{ all -> 0x02b0 }
        r0 = r17;
        r9 = r0.f24064i;	 Catch:{ all -> 0x02b0 }
        r14 = 0;
        r8[r14] = r9;	 Catch:{ all -> 0x02b0 }
        r7 = p000.fds.m10424a(r2, r8);	 Catch:{ all -> 0x02b0 }
        r9 = 1;
    L_0x011b:
        r0 = r17;
        r2 = r0.f24059a;	 Catch:{ all -> 0x0196 }
        r8 = 0;
        r2.mo2221a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0196 }
        if (r6 == 0) goto L_0x0160;
    L_0x0125:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ all -> 0x0196 }
        r5 = "Acquired frame %d of %d for shot %d at time %d.";
        r6 = 4;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0196 }
        r7 = r4 + 1;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 0;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = r20.size();	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 1;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = r3.f1746a;	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 2;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0196 }
        r8 = 3;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = 0;
        r5 = java.lang.String.format(r7, r5, r6);	 Catch:{ all -> 0x0196 }
        r2.mo8836d(r5);	 Catch:{ all -> 0x0196 }
    L_0x015a:
        r4 = r4 + 1;
        r7 = r9;
        r8 = r10;
        goto L_0x009e;
    L_0x0160:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ all -> 0x0196 }
        r5 = "Ignoring missing raw frame %d of %d for shot %d at time %d.";
        r6 = 4;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0196 }
        r7 = r4 + 1;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 0;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = r20.size();	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 1;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = r3.f1746a;	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0196 }
        r8 = 2;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0196 }
        r8 = 3;
        r6[r8] = r7;	 Catch:{ all -> 0x0196 }
        r7 = 0;
        r5 = java.lang.String.format(r7, r5, r6);	 Catch:{ all -> 0x0196 }
        r2.mo8838f(r5);	 Catch:{ all -> 0x0196 }
        goto L_0x015a;
    L_0x0196:
        r2 = move-exception;
        r4 = r10;
        r5 = r2;
        r2 = r9;
    L_0x019a:
        if (r4 == 0) goto L_0x01a6;
    L_0x019c:
        r0 = r17;
        r4 = r0.f24059a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = r4.mo2227c(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r4 != 0) goto L_0x02b6;
    L_0x01a6:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = "ZSL payload for shot %d failed.";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r7 = 0;
        r6[r7] = r3;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = 0;
        r3 = java.lang.String.format(r3, r4, r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo8834c(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
    L_0x01c0:
        r3 = r21.iterator();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
    L_0x01c4:
        r2 = r3.hasNext();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r2 == 0) goto L_0x02cb;
    L_0x01ca:
        r2 = r3.next();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2 = (p000.fjj) r2;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo1896a();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x01c4;
    L_0x01d4:
        r2 = move-exception;
    L_0x01d5:
        r2 = 0;
        goto L_0x007b;
    L_0x01d8:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ all -> 0x02b0 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02b0 }
        r9 = 43;
        r8.<init>(r9);	 Catch:{ all -> 0x02b0 }
        r9 = "PD frame NOT found for ";
        r8.append(r9);	 Catch:{ all -> 0x02b0 }
        r8.append(r12);	 Catch:{ all -> 0x02b0 }
        r8 = r8.toString();	 Catch:{ all -> 0x02b0 }
        r2.mo8836d(r8);	 Catch:{ all -> 0x02b0 }
        r2 = 0;
        r9 = r7;
        r7 = r2;
        goto L_0x011b;
    L_0x01f7:
        r2 = 0;
        goto L_0x00eb;
    L_0x01fa:
        r2 = 0;
        goto L_0x00d1;
    L_0x01fd:
        if (r8 == 0) goto L_0x0209;
    L_0x01ff:
        r0 = r17;
        r2 = r0.f24059a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2 = r2.mo2227c(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r2 != 0) goto L_0x023c;
    L_0x0209:
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = "ZSL payload for shot %d failed.";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = 0;
        r5[r6] = r3;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r3 = 0;
        r3 = java.lang.String.format(r3, r4, r5);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo8834c(r3);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
    L_0x0223:
        r3 = r21.iterator();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
    L_0x0227:
        r2 = r3.hasNext();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r2 == 0) goto L_0x0239;
    L_0x022d:
        r2 = r3.next();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2 = (p000.fjj) r2;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo1896a();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x0227;
    L_0x0237:
        r2 = move-exception;
        goto L_0x01d5;
    L_0x0239:
        r2 = 1;
        goto L_0x007b;
    L_0x023c:
        r2 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r4 = r0.f24059a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = r4.mo2225b(r2);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r4 != 0) goto L_0x0250;
    L_0x0248:
        if (r7 != 0) goto L_0x0223;
    L_0x024a:
        r2 = r3.f1747b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo2229a();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x0223;
    L_0x0250:
        r0 = r19;
        r4 = r0.f4982b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r5 = new drz;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r5.<init>(r0, r2);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4.mo13369a(r5);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r2 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r5 = new java.lang.StringBuilder;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = 44;
        r5.<init>(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = "ZSL payload for burst ";
        r5.append(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r5.append(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = " succeeded.";
        r5.append(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = r5.toString();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo8836d(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r2 = r0.f24063h;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r19;
        r4 = r0.f4982b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4 = r4.mo7077h();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo7380a(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x0248;
    L_0x028f:
        r2 = 0;
        goto L_0x002f;
    L_0x0292:
        r2 = move-exception;
        r0 = r17;
        r2 = r0.f24060e;
        r3 = "Failed to acquire metadata from the first frame.";
        r2.mo8834c(r3);
        r2 = 0;
        goto L_0x007b;
    L_0x029f:
        r2 = move-exception;
        r5 = 0;
        r4 = 0;
        r16 = r4;
        r4 = r5;
        r5 = r2;
        r2 = r16;
        goto L_0x019a;
    L_0x02aa:
        r2 = move-exception;
        r4 = r8;
        r5 = r2;
        r2 = r7;
        goto L_0x019a;
    L_0x02b0:
        r2 = move-exception;
        r4 = r10;
        r5 = r2;
        r2 = r7;
        goto L_0x019a;
    L_0x02b6:
        r4 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r6 = r0.f24059a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = r6.mo2225b(r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        if (r6 != 0) goto L_0x02cc;
    L_0x02c2:
        if (r2 != 0) goto L_0x01c0;
    L_0x02c4:
        r2 = r3.f1747b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r2.mo2229a();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x01c0;
    L_0x02cb:
        throw r5;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
    L_0x02cc:
        r0 = r19;
        r6 = r0.f4982b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r7 = new drz;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r7.<init>(r0, r4);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6.mo13369a(r7);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r4 = r0.f24060e;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = r3.f1746a;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r8 = 44;
        r7.<init>(r8);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r8 = "ZSL payload for burst ";
        r7.append(r8);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r7.append(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = " succeeded.";
        r7.append(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = r7.toString();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4.mo8836d(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r17;
        r4 = r0.f24063h;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r0 = r19;
        r6 = r0.f4982b;	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r6 = r6.mo7077h();	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        r4.mo7380a(r6);	 Catch:{ ExecutionException -> 0x01d4, isr -> 0x0237 }
        goto L_0x02c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: dry.a(fwm, fwa, java.util.List, java.util.List):boolean");
    }
}
