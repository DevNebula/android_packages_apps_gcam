package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bgp */
final class bgp implements bdz, bfe {
    /* renamed from: a */
    public static final String f22738a = bli.m887a("CdrDevFast");
    /* renamed from: b */
    public final inp f22739b;
    /* renamed from: c */
    public final Executor f22740c;
    /* renamed from: d */
    public final gtf f22741d;
    /* renamed from: e */
    public final ijx f22742e;
    /* renamed from: f */
    public final biq f22743f;
    /* renamed from: g */
    public final ilp f22744g;
    /* renamed from: h */
    public final ilp f22745h;
    /* renamed from: i */
    public kbg f22746i = kau.f21835a;
    /* renamed from: j */
    public bhy f22747j;
    /* renamed from: k */
    public final fcm f22748k;
    /* renamed from: l */
    public final ird f22749l;
    /* renamed from: m */
    public final Object f22750m = new Object();
    /* renamed from: n */
    public bdy f22751n;
    /* renamed from: o */
    public boolean f22752o = false;
    /* renamed from: p */
    private final inc f22753p;
    /* renamed from: q */
    private final iur f22754q;
    /* renamed from: r */
    private final Handler f22755r;
    /* renamed from: s */
    private final bjx f22756s;
    /* renamed from: t */
    private final bff f22757t;
    /* renamed from: u */
    private final bij f22758u;
    /* renamed from: v */
    private final kbg f22759v;
    /* renamed from: w */
    private biw f22760w;
    /* renamed from: x */
    private boolean f22761x = true;

    public bgp(inc inc, inp inp, iur iur, Executor executor, gtf gtf, Handler handler, ijx ijx, biq biq, ilp ilp, ilp ilp2, bjx bjx, bff bff, biw biw, bij bij, kbg kbg, ird ird) {
        this.f22753p = inc;
        this.f22739b = inp;
        this.f22754q = iur;
        this.f22740c = executor;
        this.f22741d = gtf;
        this.f22742e = ijx;
        this.f22743f = biq;
        this.f22744g = ilp;
        this.f22745h = ilp2;
        this.f22757t = bff;
        this.f22760w = biw;
        this.f22758u = bij;
        this.f22756s = bjx;
        this.f22755r = handler;
        this.f22759v = kbg;
        this.f22749l = ird;
        this.f22748k = new fcm();
    }

    public final void close() {
        synchronized (this.f22750m) {
            if (this.f22752o) {
                bli.m891b(f22738a, "close() is called twice");
                return;
            }
            bli.m894c(f22738a, "close()");
            this.f22752o = true;
            bdy bdy = this.f22751n;
            if (bdy != null) {
                bdy.close();
            }
            this.f22743f.close();
            if (this.f22746i.mo9709b()) {
                ((bjw) this.f22746i.mo9706a()).close();
            }
            bhy bhy = this.f22747j;
            if (bhy != null) {
                bhy.close();
            }
            this.f22757t.mo1937a(this.f22754q);
        }
    }

    /* JADX WARNING: Missing block: B:19:0x005e, code:
            if (r32.f22753p.mo8636c() == false) goto L_0x0295;
     */
    /* JADX WARNING: Missing block: B:20:0x0060, code:
            r0 = new p000.bho(r33, r32.f22742e);
     */
    /* JADX WARNING: Missing block: B:21:0x006d, code:
            r2 = new p000.ilb(new p000.fzd(r40.mo9075n(), -1.0f));
            r0 = new p000.ilb(p000.fdp.m10408a());
            r0 = new p000.ilb(p000.fdp.m10408a());
            r4 = new p000.fbu(r0, r2);
            r5 = new p000.fch(r0, r2);
            r2 = r40.mo9066e();
            r3 = f22738a;
            r6 = java.lang.String.valueOf(r2);
            r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 32);
            r8.append("available AE target FPS ranges: ");
            r8.append(r6);
            p000.bli.m896d(r3, r8.toString());
            p000.jri.m13405b(r2.isEmpty() ^ 1);
            r2 = r32.f22758u.mo1963a(r2);
            r6 = r32.f22758u.mo1964a(r40.mo9064c());
            r3 = java.lang.Integer.valueOf(r32.f22753p.f7508f);
            r7 = new android.util.Range(r3, r3);
     */
    /* JADX WARNING: Missing block: B:22:0x00fd, code:
            if (r32.f22753p.mo8636c() == false) goto L_0x028a;
     */
    /* JADX WARNING: Missing block: B:23:0x00ff, code:
            r3 = new p000.bgv(r7, r2, r6);
     */
    /* JADX WARNING: Missing block: B:24:0x0104, code:
            r11 = new p000.fze(r45, r40);
            r8 = new p000.ilb(java.lang.Boolean.TRUE);
            r2 = new p000.bhr(r3, r4, r5, r41, r42, r8, r44, r32.f22744g, r11, r47);
     */
    /* JADX WARNING: Missing block: B:25:0x012d, code:
            if (r32.f22753p.mo8636c() == false) goto L_0x0282;
     */
    /* JADX WARNING: Missing block: B:26:0x012f, code:
            r4 = new p000.bhw();
     */
    /* JADX WARNING: Missing block: B:27:0x0135, code:
            r32.f22747j = new p000.bhy(r2, r4, r32.f22742e);
     */
    /* JADX WARNING: Missing block: B:28:0x0142, code:
            if (r19 == null) goto L_0x027f;
     */
    /* JADX WARNING: Missing block: B:29:0x0144, code:
            r3 = true;
     */
    /* JADX WARNING: Missing block: B:30:0x0145, code:
            p000.jri.m13405b(r3);
            r5 = r19.mo1972d();
     */
    /* JADX WARNING: Missing block: B:31:0x0150, code:
            if (r46.mo9709b() == false) goto L_0x0181;
     */
    /* JADX WARNING: Missing block: B:32:0x0152, code:
            r32.f22746i = p000.kbg.m4804c(r32.f22756s.mo1989a(r2, r32.f22759v, r32.f22744g, r45, r37, (p000.iqp) r46.mo9706a(), r32.f22755r, r32.f22742e));
     */
    /* JADX WARNING: Missing block: B:33:0x0181, code:
            r3 = p000.kau.f21835a;
     */
    /* JADX WARNING: Missing block: B:34:0x018b, code:
            if (r32.f22746i.mo9709b() == false) goto L_0x019f;
     */
    /* JADX WARNING: Missing block: B:35:0x018d, code:
            r3 = p000.kbg.m4804c(((p000.bjw) r32.f22746i.mo9706a()).mo12387a());
     */
    /* JADX WARNING: Missing block: B:36:0x019f, code:
            r7 = new p000.fdu(new p000.fdw(r40.mo9076o()));
     */
    /* JADX WARNING: Missing block: B:37:0x01b1, code:
            if (r47.mo8612d() == false) goto L_0x0272;
     */
    /* JADX WARNING: Missing block: B:38:0x01b3, code:
            r0 = new p000.aue(r32.f22748k, r7);
     */
    /* JADX WARNING: Missing block: B:39:0x01be, code:
            r12 = new p000.bhs(r19.mo1972d(), r38, r30);
     */
    /* JADX WARNING: Missing block: B:41:?, code:
            r6 = r33.mo13718a(3);
     */
    /* JADX WARNING: Missing block: B:42:0x01d8, code:
            if (r2.f1190d.mo8609a() == false) goto L_0x0209;
     */
    /* JADX WARNING: Missing block: B:43:0x01da, code:
            r7 = r2.f1188b.mo1945b();
            r6.mo9134a(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, r7);
            r9 = p000.bhr.f1187a;
            r7 = java.lang.String.valueOf(r7);
            r11 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 28);
            r11.append("CONTROL_AE_TARGET_FPS_RANGE=");
            r11.append(r7);
            p000.bli.m896d(r9, r11.toString());
     */
    /* JADX WARNING: Missing block: B:44:0x0209, code:
            r32.f22749l.mo8856a(java.lang.String.valueOf(f22738a).concat("#createCameraCaptureSession"));
            r3 = r25.mo1951a(r39, r5, r3, p000.kbg.m4804c(r6.mo9133a()));
            r32.f22749l.mo8857b();
            r3 = p000.kny.m18476a(r3, new p000.bgq(r32, r39, r12), p000.kpq.f8776a);
            r31 = p000.kpw.m18486d();
            p000.kow.m13878a(r3, new p000.bgr(r32, r19, r12, r2, r4, r39, r40, r0, r0, r42, r47, r41, r43, r8, r48, r25, r34, r35, r36, r38, r30, r31), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:45:0x0272, code:
            r0 = new p000.auv(r32.f22748k, r7);
     */
    /* JADX WARNING: Missing block: B:46:0x027f, code:
            r3 = false;
     */
    /* JADX WARNING: Missing block: B:47:0x0282, code:
            r4 = new p000.bhv();
     */
    /* JADX WARNING: Missing block: B:48:0x028a, code:
            r3 = new p000.bgu(r32.f22739b);
     */
    /* JADX WARNING: Missing block: B:49:0x0295, code:
            r0 = new p000.bhm(r33, r32.f22742e);
     */
    /* JADX WARNING: Missing block: B:50:0x02a4, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:51:0x02a5, code:
            p000.bli.m892b(f22738a, "Unable to create session params", r2);
     */
    /* JADX WARNING: Missing block: B:53:?, code:
            return r31;
     */
    /* JADX WARNING: Missing block: B:54:?, code:
            return p000.kow.m13874a(r2);
     */
    /* renamed from: a */
    public final p000.kpk mo12362a(p000.iwl r33, p000.ilp r34, p000.ilp r35, p000.ilp r36, p000.ilp r37, p000.iqt r38, android.view.Surface r39, p000.ffc r40, p000.ilp r41, p000.ilp r42, p000.ilp r43, p000.ilp r44, p000.ilp r45, p000.kbg r46, p000.imw r47, p000.kwk r48) {
        /*
        r32 = this;
        r0 = r32;
        r3 = r0.f22750m;
        monitor-enter(r3);
        r2 = f22738a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice.createCaptureSession()";
        p000.bli.m894c(r2, r4);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f22752o;	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = f22738a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice has been closed.";
        p000.bli.m891b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f21835a;	 Catch:{ all -> 0x0036 }
        r31 = p000.kow.m13873a(r2);	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
    L_0x0020:
        return r31;
    L_0x0021:
        r0 = r32;
        r4 = r0.f22761x;	 Catch:{ all -> 0x0036 }
        if (r4 != 0) goto L_0x0039;
    L_0x0027:
        r2 = f22738a;	 Catch:{ all -> 0x0036 }
        r4 = "CamcorderDevice can only createCaptureSession() once.";
        p000.bli.m891b(r2, r4);	 Catch:{ all -> 0x0036 }
        r2 = p000.kau.f21835a;	 Catch:{ all -> 0x0036 }
        r31 = p000.kow.m13873a(r2);	 Catch:{ all -> 0x0036 }
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
        r2 = r0.f22761x;	 Catch:{ all -> 0x0036 }
        p000.jri.m13405b(r2);	 Catch:{ all -> 0x0036 }
        r2 = 0;
        r0 = r32;
        r0.f22761x = r2;	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r0 = r0.f22760w;	 Catch:{ all -> 0x0036 }
        r19 = r0;
        r2 = 0;
        r0 = r32;
        r0.f22760w = r2;	 Catch:{ all -> 0x0036 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        r0 = r32;
        r2 = r0.f22753p;
        r2 = r2.mo8636c();
        if (r2 == 0) goto L_0x0295;
    L_0x0060:
        r25 = new bho;
        r0 = r32;
        r2 = r0.f22742e;
        r0 = r25;
        r1 = r33;
        r0.<init>(r1, r2);
    L_0x006d:
        r2 = new ilb;
        r3 = new fzd;
        r4 = r40.mo9075n();
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3.<init>(r4, r5);
        r2.<init>(r3);
        r20 = new ilb;
        r3 = p000.fdp.m10408a();
        r0 = r20;
        r0.<init>(r3);
        r18 = new ilb;
        r3 = p000.fdp.m10408a();
        r0 = r18;
        r0.<init>(r3);
        r4 = new fbu;
        r0 = r20;
        r4.<init>(r0, r2);
        r5 = new fch;
        r0 = r18;
        r5.<init>(r0, r2);
        r2 = r40.mo9066e();
        r3 = f22738a;
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
        r3 = r0.f22758u;
        r2 = r3.mo1963a(r2);
        r0 = r32;
        r3 = r0.f22758u;
        r6 = r40.mo9064c();
        r6 = r3.mo1964a(r6);
        r7 = new android.util.Range;
        r0 = r32;
        r3 = r0.f22753p;
        r3 = r3.f7508f;
        r3 = java.lang.Integer.valueOf(r3);
        r7.<init>(r3, r3);
        r0 = r32;
        r3 = r0.f22753p;
        r3 = r3.mo8636c();
        if (r3 == 0) goto L_0x028a;
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
        r10 = r0.f22744g;
        r6 = r41;
        r7 = r42;
        r9 = r44;
        r12 = r47;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r32;
        r3 = r0.f22753p;
        r3 = r3.mo8636c();
        if (r3 == 0) goto L_0x0282;
    L_0x012f:
        r3 = new bhw;
        r3.<init>();
        r4 = r3;
    L_0x0135:
        r3 = new bhy;
        r0 = r32;
        r5 = r0.f22742e;
        r3.<init>(r2, r4, r5);
        r0 = r32;
        r0.f22747j = r3;
        if (r19 == 0) goto L_0x027f;
    L_0x0144:
        r3 = 1;
    L_0x0145:
        p000.jri.m13405b(r3);
        r5 = r19.mo1972d();
        r3 = r46.mo9709b();
        if (r3 == 0) goto L_0x0181;
    L_0x0152:
        r0 = r32;
        r9 = r0.f22756s;
        r0 = r32;
        r11 = r0.f22759v;
        r0 = r32;
        r12 = r0.f22744g;
        r15 = r46.mo9706a();
        r15 = (p000.iqp) r15;
        r0 = r32;
        r0 = r0.f22755r;
        r16 = r0;
        r0 = r32;
        r0 = r0.f22742e;
        r17 = r0;
        r10 = r2;
        r13 = r45;
        r14 = r37;
        r3 = r9.mo1989a(r10, r11, r12, r13, r14, r15, r16, r17);
        r3 = p000.kbg.m4804c(r3);
        r0 = r32;
        r0.f22746i = r3;
    L_0x0181:
        r3 = p000.kau.f21835a;
        r0 = r32;
        r6 = r0.f22746i;
        r6 = r6.mo9709b();
        if (r6 == 0) goto L_0x019f;
    L_0x018d:
        r0 = r32;
        r3 = r0.f22746i;
        r3 = r3.mo9706a();
        r3 = (p000.bjw) r3;
        r3 = r3.mo12387a();
        r3 = p000.kbg.m4804c(r3);
    L_0x019f:
        r6 = new fdw;
        r7 = r40.mo9076o();
        r6.<init>(r7);
        r7 = new fdu;
        r7.<init>(r6);
        r6 = r47.mo8612d();
        if (r6 == 0) goto L_0x0272;
    L_0x01b3:
        r30 = new aue;
        r0 = r32;
        r6 = r0.f22748k;
        r0 = r30;
        r0.<init>(r6, r7);
    L_0x01be:
        r12 = new bhs;
        r6 = r19.mo1972d();
        r0 = r38;
        r1 = r30;
        r12.<init>(r6, r0, r1);
        r6 = 3;
        r0 = r33;
        r6 = r0.mo13718a(r6);	 Catch:{ isr -> 0x02a4 }
        r7 = r2.f1190d;	 Catch:{ isr -> 0x02a4 }
        r7 = r7.mo8609a();	 Catch:{ isr -> 0x02a4 }
        if (r7 == 0) goto L_0x0209;
    L_0x01da:
        r7 = r2.f1188b;	 Catch:{ isr -> 0x02a4 }
        r7 = r7.mo1945b();	 Catch:{ isr -> 0x02a4 }
        r9 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;	 Catch:{ isr -> 0x02a4 }
        r6.mo9134a(r9, r7);	 Catch:{ isr -> 0x02a4 }
        r9 = p000.bhr.f1187a;	 Catch:{ isr -> 0x02a4 }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ isr -> 0x02a4 }
        r10 = java.lang.String.valueOf(r7);	 Catch:{ isr -> 0x02a4 }
        r10 = r10.length();	 Catch:{ isr -> 0x02a4 }
        r11 = new java.lang.StringBuilder;	 Catch:{ isr -> 0x02a4 }
        r10 = r10 + 28;
        r11.<init>(r10);	 Catch:{ isr -> 0x02a4 }
        r10 = "CONTROL_AE_TARGET_FPS_RANGE=";
        r11.append(r10);	 Catch:{ isr -> 0x02a4 }
        r11.append(r7);	 Catch:{ isr -> 0x02a4 }
        r7 = r11.toString();	 Catch:{ isr -> 0x02a4 }
        p000.bli.m896d(r9, r7);	 Catch:{ isr -> 0x02a4 }
    L_0x0209:
        r0 = r32;
        r7 = r0.f22749l;
        r9 = f22738a;
        r9 = java.lang.String.valueOf(r9);
        r10 = "#createCameraCaptureSession";
        r9 = r9.concat(r10);
        r7.mo8856a(r9);
        r6 = r6.mo9133a();
        r6 = p000.kbg.m4804c(r6);
        r0 = r25;
        r1 = r39;
        r3 = r0.mo1951a(r1, r5, r3, r6);
        r0 = r32;
        r5 = r0.f22749l;
        r5.mo8857b();
        r5 = new bgq;
        r0 = r32;
        r1 = r39;
        r5.<init>(r0, r1, r12);
        r6 = p000.kpq.f8776a;
        r3 = p000.kny.m18476a(r3, r5, r6);
        r31 = p000.kpw.m18486d();
        r9 = new bgr;
        r10 = r32;
        r11 = r19;
        r13 = r2;
        r14 = r4;
        r15 = r39;
        r16 = r40;
        r17 = r20;
        r19 = r42;
        r20 = r47;
        r21 = r41;
        r22 = r43;
        r23 = r8;
        r24 = r48;
        r26 = r34;
        r27 = r35;
        r28 = r36;
        r29 = r38;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r2 = p000.kpq.f8776a;
        p000.kow.m13878a(r3, r9, r2);
        goto L_0x0020;
    L_0x0272:
        r30 = new auv;
        r0 = r32;
        r6 = r0.f22748k;
        r0 = r30;
        r0.<init>(r6, r7);
        goto L_0x01be;
    L_0x027f:
        r3 = 0;
        goto L_0x0145;
    L_0x0282:
        r3 = new bhv;
        r3.<init>();
        r4 = r3;
        goto L_0x0135;
    L_0x028a:
        r3 = new bgu;
        r0 = r32;
        r2 = r0.f22739b;
        r3.<init>(r2);
        goto L_0x0104;
    L_0x0295:
        r25 = new bhm;
        r0 = r32;
        r2 = r0.f22742e;
        r0 = r25;
        r1 = r33;
        r0.<init>(r1, r2);
        goto L_0x006d;
    L_0x02a4:
        r2 = move-exception;
        r3 = f22738a;
        r4 = "Unable to create session params";
        p000.bli.m892b(r3, r4, r2);
        r31 = p000.kow.m13874a(r2);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgp.a(iwl, ilp, ilp, ilp, ilp, iqt, android.view.Surface, ffc, ilp, ilp, ilp, ilp, ilp, kbg, imw, kwk):kpk");
    }

    /* renamed from: b */
    public final ilp mo12363b() {
        fcm fcm = this.f22748k;
        if (fcm == null) {
            return ilq.m3876a(new fco(fcl.m2302a(), fcl.m2302a()));
        }
        return fcm.f18123a;
    }

    /* renamed from: a */
    final /* synthetic */ kpk mo14567a(Surface surface, bhs bhs, bhj bhj) {
        kpk a;
        synchronized (this.f22750m) {
            bli.m894c(f22738a, "CamcorderRequestProcessor-creation task is done successfully.");
            this.f22749l.mo8856a(String.valueOf(f22738a).concat("#startPreview"));
            a = this.f22747j.mo12381a(bhj, surface, bhs);
            this.f22749l.mo8857b();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo1928a() {
        synchronized (this.f22750m) {
            jri.m13404b(this.f22751n);
            this.f22751n = null;
        }
    }
}
