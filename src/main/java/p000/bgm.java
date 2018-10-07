package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgm */
final class bgm implements bdz, bfe {
    /* renamed from: a */
    public static final String f22714a = bli.m887a("CodecCdrDev");
    /* renamed from: b */
    public final inp f22715b;
    /* renamed from: c */
    public final Executor f22716c;
    /* renamed from: d */
    public final gtf f22717d;
    /* renamed from: e */
    public final ijx f22718e;
    /* renamed from: f */
    public final iou f22719f;
    /* renamed from: g */
    public final ilp f22720g;
    /* renamed from: h */
    public final ilp f22721h;
    /* renamed from: i */
    public kbg f22722i = kau.f21835a;
    /* renamed from: j */
    public bhy f22723j;
    /* renamed from: k */
    public final fcm f22724k;
    /* renamed from: l */
    public final ird f22725l;
    /* renamed from: m */
    public final Object f22726m = new Object();
    /* renamed from: n */
    public bdy f22727n;
    /* renamed from: o */
    public boolean f22728o = false;
    /* renamed from: p */
    private final inc f22729p;
    /* renamed from: q */
    private final iur f22730q;
    /* renamed from: r */
    private final Handler f22731r;
    /* renamed from: s */
    private final bjx f22732s;
    /* renamed from: t */
    private final bff f22733t;
    /* renamed from: u */
    private final bij f22734u;
    /* renamed from: v */
    private final kbg f22735v;
    /* renamed from: w */
    private ios f22736w;
    /* renamed from: x */
    private boolean f22737x = true;

    public bgm(inc inc, inp inp, iur iur, Executor executor, gtf gtf, Handler handler, ijx ijx, iou iou, ilp ilp, ilp ilp2, bjx bjx, bff bff, ios ios, bij bij, kbg kbg, ird ird) {
        this.f22729p = inc;
        this.f22715b = inp;
        this.f22730q = iur;
        this.f22716c = executor;
        this.f22717d = gtf;
        this.f22718e = ijx;
        this.f22719f = iou;
        this.f22720g = ilp;
        this.f22721h = ilp2;
        this.f22733t = bff;
        this.f22736w = ios;
        this.f22734u = bij;
        this.f22732s = bjx;
        this.f22731r = handler;
        this.f22735v = kbg;
        this.f22725l = ird;
        this.f22724k = new fcm();
    }

    public final void close() {
        synchronized (this.f22726m) {
            if (this.f22728o) {
                bli.m891b(f22714a, "close() is called twice");
                return;
            }
            bli.m894c(f22714a, "close()");
            this.f22728o = true;
            bdy bdy = this.f22727n;
            if (bdy != null) {
                bdy.close();
            }
            this.f22719f.close();
            ios ios = this.f22736w;
            if (ios != null) {
                ios.close();
            }
            if (this.f22722i.mo9709b()) {
                ((bjw) this.f22722i.mo9706a()).close();
            }
            bhy bhy = this.f22723j;
            if (bhy != null) {
                bhy.close();
            }
            this.f22733t.mo1937a(this.f22730q);
        }
    }

    /* JADX WARNING: Missing block: B:19:0x005e, code:
            if (r32.f22729p.mo8636c() == false) goto L_0x0269;
     */
    /* JADX WARNING: Missing block: B:20:0x0060, code:
            r0 = new p000.bho(r33, r32.f22718e);
     */
    /* JADX WARNING: Missing block: B:21:0x006d, code:
            r2 = new p000.ilb(new p000.fzd(r40.mo9075n(), -1.0f));
            r0 = new p000.ilb(p000.fdp.m10408a());
            r0 = new p000.ilb(p000.fdp.m10408a());
            r4 = new p000.fbu(r0, r2);
            r5 = new p000.fch(r0, r2);
            r2 = r40.mo9066e();
            r3 = f22714a;
            r6 = java.lang.String.valueOf(r2);
            r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 32);
            r8.append("available AE target FPS ranges: ");
            r8.append(r6);
            p000.bli.m896d(r3, r8.toString());
            p000.jri.m13405b(r2.isEmpty() ^ 1);
            r2 = r32.f22734u.mo1963a(r2);
            r6 = r32.f22734u.mo1964a(r40.mo9064c());
            r3 = java.lang.Integer.valueOf(r32.f22729p.f7508f);
            r7 = new android.util.Range(r3, r3);
     */
    /* JADX WARNING: Missing block: B:22:0x00fd, code:
            if (r32.f22729p.mo8636c() == false) goto L_0x025e;
     */
    /* JADX WARNING: Missing block: B:23:0x00ff, code:
            r3 = new p000.bgv(r7, r2, r6);
     */
    /* JADX WARNING: Missing block: B:24:0x0104, code:
            r11 = new p000.fze(r45, r40);
            r8 = new p000.ilb(java.lang.Boolean.TRUE);
            r2 = new p000.bhr(r3, r4, r5, r41, r42, r8, r44, r32.f22720g, r11, r47);
     */
    /* JADX WARNING: Missing block: B:25:0x012d, code:
            if (r32.f22729p.mo8636c() == false) goto L_0x0256;
     */
    /* JADX WARNING: Missing block: B:26:0x012f, code:
            r5 = new p000.bhw();
     */
    /* JADX WARNING: Missing block: B:27:0x0135, code:
            r32.f22723j = new p000.bhy(r2, r5, r32.f22718e);
     */
    /* JADX WARNING: Missing block: B:28:0x0142, code:
            if (r20 == null) goto L_0x0253;
     */
    /* JADX WARNING: Missing block: B:29:0x0144, code:
            r3 = true;
     */
    /* JADX WARNING: Missing block: B:30:0x0145, code:
            p000.jri.m13405b(r3);
            p000.jri.m13395a(r20.mo13690a().mo9709b());
            r3 = (android.view.Surface) r20.mo13690a().mo9706a();
     */
    /* JADX WARNING: Missing block: B:31:0x0161, code:
            if (r46.mo9709b() == false) goto L_0x0192;
     */
    /* JADX WARNING: Missing block: B:32:0x0163, code:
            r32.f22722i = p000.kbg.m4804c(r32.f22732s.mo1989a(r2, r32.f22735v, r32.f22720g, r45, r37, (p000.iqp) r46.mo9706a(), r32.f22731r, r32.f22718e));
     */
    /* JADX WARNING: Missing block: B:33:0x0192, code:
            r4 = p000.kau.f21835a;
     */
    /* JADX WARNING: Missing block: B:34:0x019c, code:
            if (r32.f22722i.mo9709b() == false) goto L_0x0250;
     */
    /* JADX WARNING: Missing block: B:35:0x019e, code:
            r6 = p000.kbg.m4804c(((p000.bjw) r32.f22722i.mo9706a()).mo12387a());
     */
    /* JADX WARNING: Missing block: B:36:0x01b1, code:
            r7 = new p000.fdu(new p000.fdw(r40.mo9076o()));
     */
    /* JADX WARNING: Missing block: B:37:0x01c3, code:
            if (r47.mo8612d() == false) goto L_0x0244;
     */
    /* JADX WARNING: Missing block: B:38:0x01c5, code:
            r0 = new p000.aue(r32.f22724k, r7);
     */
    /* JADX WARNING: Missing block: B:39:0x01d0, code:
            r13 = new p000.bhs((android.view.Surface) r20.mo13690a().mo9706a(), r38, r31);
            r32.f22725l.mo8856a(java.lang.String.valueOf(f22714a).concat("#createCameraCaptureSession"));
            r3 = r26.mo1951a(r39, r3, r6, p000.kau.f21835a);
            r32.f22725l.mo8857b();
            r3 = p000.kny.m18476a(r3, new p000.bgn(r32, r39, r13), p000.kpq.f8776a);
            r11 = p000.kpw.m18486d();
            p000.kow.m13878a(r3, new p000.bgo(r32, r11, r20, r13, r2, r5, r39, r40, r0, r0, r42, r47, r41, r43, r8, r48, r26, r34, r35, r36, r38, r31), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:40:0x0244, code:
            r0 = new p000.auv(r32.f22724k, r7);
     */
    /* JADX WARNING: Missing block: B:41:0x0250, code:
            r6 = r4;
     */
    /* JADX WARNING: Missing block: B:42:0x0253, code:
            r3 = false;
     */
    /* JADX WARNING: Missing block: B:43:0x0256, code:
            r5 = new p000.bhv();
     */
    /* JADX WARNING: Missing block: B:44:0x025e, code:
            r3 = new p000.bgu(r32.f22715b);
     */
    /* JADX WARNING: Missing block: B:45:0x0269, code:
            r0 = new p000.bhm(r33, r32.f22718e);
     */
    /* JADX WARNING: Missing block: B:47:?, code:
            return r11;
     */
    /* renamed from: a */
    public final p000.kpk mo12362a(p000.iwl r33, p000.ilp r34, p000.ilp r35, p000.ilp r36, p000.ilp r37, p000.iqt r38, android.view.Surface r39, p000.ffc r40, p000.ilp r41, p000.ilp r42, p000.ilp r43, p000.ilp r44, p000.ilp r45, p000.kbg r46, p000.imw r47, p000.kwk r48) {
        /*
        r32 = this;
        r0 = r32;
        r3 = r0.f22726m;
        monitor-enter(r3);
        r2 = f22714a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice.createCaptureSession()";
        p000.bli.m894c(r2, r4);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f22728o;	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = f22714a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice has been closed.";
        p000.bli.m891b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f21835a;	 Catch:{ all -> 0x0036 }
        r11 = p000.kow.m13873a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
    L_0x0020:
        return r11;
    L_0x0021:
        r0 = r32;
        r4 = r0.f22737x;	 Catch:{ all -> 0x0036 }
        if (r4 != 0) goto L_0x0039;
    L_0x0027:
        r2 = f22714a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice can only createCaptureSession() once.";
        p000.bli.m891b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f21835a;	 Catch:{ all -> 0x0036 }
        r11 = p000.kow.m13873a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        goto L_0x0020;
    L_0x0036:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        throw r2;
    L_0x0039:
        r2 = r2 ^ 1;
        p000.jri.m13405b(r2);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f22737x;	 Catch:{ all -> 0x0036 }
        p000.jri.m13405b(r2);	 Catch:{ all -> 0x0036 }
        r2 = 0;
        r0 = r32;
        r0.f22737x = r2;	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r0 = r0.f22736w;	 Catch:{ all -> 0x0036 }
        r20 = r0;
        r2 = 0;
        r0 = r32;
        r0.f22736w = r2;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f22729p;
        r2 = r2.mo8636c();
        if (r2 == 0) goto L_0x0269;
    L_0x0060:
        r26 = new bho;
        r0 = r32;
        r2 = r0.f22718e;
        r0 = r26;
        r1 = r33;
        r0.<init>(r1, r2);
    L_0x006d:
        r2 = new ilb;
        r3 = new fzd;
        r4 = r40.mo9075n();
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3.<init>(r4, r5);
        r2.<init>(r3);
        r18 = new ilb;
        r3 = p000.fdp.m10408a();
        r0 = r18;
        r0.<init>(r3);
        r19 = new ilb;
        r3 = p000.fdp.m10408a();
        r0 = r19;
        r0.<init>(r3);
        r4 = new fbu;
        r0 = r18;
        r4.<init>(r0, r2);
        r5 = new fch;
        r0 = r19;
        r5.<init>(r0, r2);
        r2 = r40.mo9066e();
        r3 = f22714a;
        r6 = java.lang.String.valueOf(r2);
        r7 = java.lang.String.valueOf(r6);
        r7 = r7.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 32;
        r8.<init>(r7);
        r7 = "available AE target FPS ranges: ";
        r8.append(r7);
        r8.append(r6);
        r6 = r8.toString();
        p000.bli.m896d(r3, r6);
        r3 = r2.isEmpty();
        r3 = r3 ^ 1;
        p000.jri.m13405b(r3);
        r0 = r32;
        r3 = r0.f22734u;
        r2 = r3.mo1963a(r2);
        r0 = r32;
        r3 = r0.f22734u;
        r6 = r40.mo9064c();
        r6 = r3.mo1964a(r6);
        r7 = new android.util.Range;
        r0 = r32;
        r3 = r0.f22729p;
        r3 = r3.f7508f;
        r3 = java.lang.Integer.valueOf(r3);
        r7.<init>(r3, r3);
        r0 = r32;
        r3 = r0.f22729p;
        r3 = r3.mo8636c();
        if (r3 == 0) goto L_0x025e;
    L_0x00ff:
        r3 = new bgv;
        r3.<init>(r7, r2, r6);
    L_0x0104:
        r11 = new fze;
        r0 = r45;
        r1 = r40;
        r11.<init>(r0, r1);
        r8 = new ilb;
        r2 = java.lang.Boolean.TRUE;
        r8.<init>(r2);
        r2 = new bhr;
        r0 = r32;
        r10 = r0.f22720g;
        r6 = r41;
        r7 = r42;
        r9 = r44;
        r12 = r47;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r32;
        r3 = r0.f22729p;
        r3 = r3.mo8636c();
        if (r3 == 0) goto L_0x0256;
    L_0x012f:
        r3 = new bhw;
        r3.<init>();
        r5 = r3;
    L_0x0135:
        r3 = new bhy;
        r0 = r32;
        r4 = r0.f22718e;
        r3.<init>(r2, r5, r4);
        r0 = r32;
        r0.f22723j = r3;
        if (r20 == 0) goto L_0x0253;
    L_0x0144:
        r3 = 1;
    L_0x0145:
        p000.jri.m13405b(r3);
        r3 = r20.mo13690a();
        r3 = r3.mo9709b();
        p000.jri.m13395a(r3);
        r3 = r20.mo13690a();
        r3 = r3.mo9706a();
        r3 = (android.view.Surface) r3;
        r4 = r46.mo9709b();
        if (r4 == 0) goto L_0x0192;
    L_0x0163:
        r0 = r32;
        r9 = r0.f22732s;
        r0 = r32;
        r11 = r0.f22735v;
        r0 = r32;
        r12 = r0.f22720g;
        r15 = r46.mo9706a();
        r15 = (p000.iqp) r15;
        r0 = r32;
        r0 = r0.f22731r;
        r16 = r0;
        r0 = r32;
        r0 = r0.f22718e;
        r17 = r0;
        r10 = r2;
        r13 = r45;
        r14 = r37;
        r4 = r9.mo1989a(r10, r11, r12, r13, r14, r15, r16, r17);
        r4 = p000.kbg.m4804c(r4);
        r0 = r32;
        r0.f22722i = r4;
    L_0x0192:
        r4 = p000.kau.f21835a;
        r0 = r32;
        r6 = r0.f22722i;
        r6 = r6.mo9709b();
        if (r6 == 0) goto L_0x0250;
    L_0x019e:
        r0 = r32;
        r4 = r0.f22722i;
        r4 = r4.mo9706a();
        r4 = (p000.bjw) r4;
        r4 = r4.mo12387a();
        r4 = p000.kbg.m4804c(r4);
        r6 = r4;
    L_0x01b1:
        r4 = new fdw;
        r7 = r40.mo9076o();
        r4.<init>(r7);
        r7 = new fdu;
        r7.<init>(r4);
        r4 = r47.mo8612d();
        if (r4 == 0) goto L_0x0244;
    L_0x01c5:
        r31 = new aue;
        r0 = r32;
        r4 = r0.f22724k;
        r0 = r31;
        r0.<init>(r4, r7);
    L_0x01d0:
        r13 = new bhs;
        r4 = r20.mo13690a();
        r4 = r4.mo9706a();
        r4 = (android.view.Surface) r4;
        r0 = r38;
        r1 = r31;
        r13.<init>(r4, r0, r1);
        r0 = r32;
        r4 = r0.f22725l;
        r7 = f22714a;
        r7 = java.lang.String.valueOf(r7);
        r9 = "#createCameraCaptureSession";
        r7 = r7.concat(r9);
        r4.mo8856a(r7);
        r4 = p000.kau.f21835a;
        r0 = r26;
        r1 = r39;
        r3 = r0.mo1951a(r1, r3, r6, r4);
        r0 = r32;
        r4 = r0.f22725l;
        r4.mo8857b();
        r4 = new bgn;
        r0 = r32;
        r1 = r39;
        r4.<init>(r0, r1, r13);
        r6 = p000.kpq.f8776a;
        r3 = p000.kny.m18476a(r3, r4, r6);
        r11 = p000.kpw.m18486d();
        r9 = new bgo;
        r10 = r32;
        r12 = r20;
        r14 = r2;
        r15 = r5;
        r16 = r39;
        r17 = r40;
        r20 = r42;
        r21 = r47;
        r22 = r41;
        r23 = r43;
        r24 = r8;
        r25 = r48;
        r27 = r34;
        r28 = r35;
        r29 = r36;
        r30 = r38;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r2 = p000.kpq.f8776a;
        p000.kow.m13878a(r3, r9, r2);
        goto L_0x0020;
    L_0x0244:
        r31 = new auv;
        r0 = r32;
        r4 = r0.f22724k;
        r0 = r31;
        r0.<init>(r4, r7);
        goto L_0x01d0;
    L_0x0250:
        r6 = r4;
        goto L_0x01b1;
    L_0x0253:
        r3 = 0;
        goto L_0x0145;
    L_0x0256:
        r3 = new bhv;
        r3.<init>();
        r5 = r3;
        goto L_0x0135;
    L_0x025e:
        r3 = new bgu;
        r0 = r32;
        r2 = r0.f22715b;
        r3.<init>(r2);
        goto L_0x0104;
    L_0x0269:
        r26 = new bhm;
        r0 = r32;
        r2 = r0.f22718e;
        r0 = r26;
        r1 = r33;
        r0.<init>(r1, r2);
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgm.a(iwl, ilp, ilp, ilp, ilp, iqt, android.view.Surface, ffc, ilp, ilp, ilp, ilp, ilp, kbg, imw, kwk):kpk");
    }

    /* renamed from: b */
    public final ilp mo12363b() {
        fcm fcm = this.f22724k;
        if (fcm == null) {
            return ilq.m3876a(new fco(fcl.m2302a(), fcl.m2302a()));
        }
        return fcm.f18123a;
    }

    /* renamed from: a */
    final /* synthetic */ kpk mo14566a(Surface surface, bhs bhs, bhj bhj) {
        kpk a;
        synchronized (this.f22726m) {
            bli.m894c(f22714a, "CamcorderRequestProcessor-creation task is done successfully.");
            this.f22725l.mo8856a(String.valueOf(f22714a).concat("#startPreview"));
            a = this.f22723j.mo12381a(bhj, surface, bhs);
            this.f22725l.mo8857b();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo1928a() {
        synchronized (this.f22726m) {
            jri.m13404b(this.f22727n);
            this.f22727n = null;
        }
    }
}
