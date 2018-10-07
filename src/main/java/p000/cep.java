package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import com.google.common.logging.nano.eventprotos$LaunchReport;
import java.util.List;

/* compiled from: PG */
/* renamed from: cep */
public final class cep extends bcs implements eoj, eok, eol {
    /* renamed from: d */
    private final awr f23042d;
    /* renamed from: e */
    private final CameraActivitySession f23043e;
    /* renamed from: f */
    private final irs f23044f;
    /* renamed from: g */
    private final Instrumentation f23045g;
    /* renamed from: h */
    private final cbu f23046h;
    /* renamed from: i */
    private final iya f23047i;
    /* renamed from: j */
    private final ilp f23048j;
    /* renamed from: k */
    private boolean f23049k = true;
    /* renamed from: l */
    private long f23050l;
    /* renamed from: m */
    private long f23051m;

    static {
        bli.m887a("CamActLfclLogBhvr");
    }

    public cep(awr awr, CameraActivitySession cameraActivitySession, irs irs, gsd gsd, Instrumentation instrumentation, cbu cbu, iya iya, ilp ilp) {
        super(null);
        this.f23042d = (awr) jri.m13404b((Object) awr);
        this.f23043e = (CameraActivitySession) jri.m13404b((Object) cameraActivitySession);
        this.f23044f = (irs) jri.m13404b((Object) irs);
        jri.m13404b((Object) gsd);
        this.f23045g = (Instrumentation) jri.m13404b((Object) instrumentation);
        this.f23046h = (cbu) jri.m13404b((Object) cbu);
        this.f23047i = (iya) jri.m13404b((Object) iya);
        this.f23048j = (ilp) jri.m13404b((Object) ilp);
    }

    /* renamed from: d */
    private final int m15186d() {
        switch (((hhx) this.f23048j.mo13673b()).ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 8;
            case 3:
                return 11;
            case 4:
                return 22;
            case 5:
                return 5;
            case 6:
                return 0;
            case 7:
                return 6;
            case 8:
                return 21;
            case 9:
                return 19;
            case 10:
                return 20;
            case 11:
                return 0;
            case 12:
                return 0;
            case 13:
                return 12;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    protected final void mo12354c() {
        this.f23049k = true;
    }

    /* renamed from: i */
    public final void mo6372i() {
        /*
        r14 = this;
        r0 = 2;
        r3 = 1;
        r4 = 0;
        r2 = 6;
        r12 = 0;
        r6 = android.os.SystemClock.elapsedRealtime();
        r8 = r14.f23050l;
        r8 = r6 - r8;
        r10 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 >= 0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r1 = r14.f23049k;
        if (r1 != 0) goto L_0x0034;
    L_0x0019:
        r1 = r14.f23043e;
        r5 = com.google.android.apps.camera.stats.CameraActivitySession.f12850a;
        r8 = "Session reset.";
        p000.bli.m888a(r5, r8);
        r1.f12851b = r12;
        r1.f12852c = r12;
        r1.f12853d = r12;
        r1.f12854e = r12;
        r1.f12855f = r12;
        r1.f12856g = r12;
        r1.f12857h = r12;
        r1.f12858i = r12;
        r1.f12859j = r12;
    L_0x0034:
        r14.f23050l = r6;
        r1 = r14.f23044f;
        r1.mo8921k();
        r1 = r14.f23042d;
        r1 = r1.f1017a;
        r1 = r1.getIntent();
        r1 = r1.getAction();
        if (r1 == 0) goto L_0x0121;
    L_0x0049:
        r5 = r1.hashCode();
        switch(r5) {
            case -1960745709: goto L_0x0116;
            case -1658348509: goto L_0x010b;
            case -1173447682: goto L_0x0100;
            case 464109999: goto L_0x00f5;
            case 485955591: goto L_0x00ea;
            case 701083699: goto L_0x00df;
            case 1130890360: goto L_0x00d4;
            default: goto L_0x0050;
        };
    L_0x0050:
        r1 = -1;
    L_0x0051:
        switch(r1) {
            case 0: goto L_0x00d0;
            case 1: goto L_0x00d2;
            case 2: goto L_0x00c4;
            case 3: goto L_0x00ce;
            case 4: goto L_0x00cb;
            case 5: goto L_0x00c9;
            case 6: goto L_0x00c7;
            default: goto L_0x0054;
        };
    L_0x0054:
        r1 = r4;
    L_0x0055:
        r5 = 9;
        if (r1 != r5) goto L_0x00b4;
    L_0x0059:
        r4 = r14.f23042d;
        r4 = r4.f1017a;
        r4 = r4.getIntent();
        r4 = r4.getExtras();
        if (r4 == 0) goto L_0x008e;
    L_0x0067:
        r5 = "com.android.systemui.camera_launch_source";
        r5 = r4.containsKey(r5);
        if (r5 == 0) goto L_0x008e;
    L_0x006f:
        r5 = "com.android.systemui.camera_launch_source";
        r4 = r4.getString(r5);
        r5 = "power_double_tap";
        r5 = r5.equals(r4);
        if (r5 != 0) goto L_0x00b2;
    L_0x007d:
        r3 = "lockscreen_affordance";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00b0;
    L_0x0085:
        r0 = "lift_to_launch_ml";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x008e;
    L_0x008d:
        r2 = 7;
    L_0x008e:
        r0 = r14.f23046h;
        r0 = r0.f1865a;
        r3 = "keyguard";
        r0 = p000.cbu.m1124a(r0, r3);
        r5 = r0;
        r5 = (android.app.KeyguardManager) r5;
        r0 = r14.f23044f;
        r3 = r14.m15186d();
        r4 = r5.isKeyguardLocked();
        r5 = r5.isKeyguardSecure();
        r6 = r14.f23049k;
        r0.mo8881a(r1, r2, r3, r4, r5, r6);
        goto L_0x0014;
    L_0x00b0:
        r2 = r0;
        goto L_0x008e;
    L_0x00b2:
        r2 = r3;
        goto L_0x008e;
    L_0x00b4:
        if (r1 == r3) goto L_0x00bc;
    L_0x00b6:
        if (r1 == 0) goto L_0x00ba;
    L_0x00b8:
        r2 = 5;
        goto L_0x008e;
    L_0x00ba:
        r2 = r4;
        goto L_0x008e;
    L_0x00bc:
        r0 = r14.f23049k;
        if (r0 == 0) goto L_0x00c2;
    L_0x00c0:
        r2 = 3;
        goto L_0x008e;
    L_0x00c2:
        r2 = 4;
        goto L_0x008e;
    L_0x00c4:
        r1 = 8;
        goto L_0x0055;
    L_0x00c7:
        r1 = r3;
        goto L_0x0055;
    L_0x00c9:
        r1 = r0;
        goto L_0x0055;
    L_0x00cb:
        r1 = 9;
        goto L_0x0055;
    L_0x00ce:
        r1 = r2;
        goto L_0x0055;
    L_0x00d0:
        r1 = 5;
        goto L_0x0055;
    L_0x00d2:
        r1 = 7;
        goto L_0x0055;
    L_0x00d4:
        r5 = "android.media.action.VIDEO_CAMERA";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x00dc:
        r1 = r0;
        goto L_0x0051;
    L_0x00df:
        r5 = "android.media.action.VIDEO_CAPTURE";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x00e7:
        r1 = 3;
        goto L_0x0051;
    L_0x00ea:
        r5 = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x00f2:
        r1 = 4;
        goto L_0x0051;
    L_0x00f5:
        r5 = "android.media.action.STILL_IMAGE_CAMERA";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x00fd:
        r1 = r3;
        goto L_0x0051;
    L_0x0100:
        r5 = "android.intent.action.MAIN";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x0108:
        r1 = r2;
        goto L_0x0051;
    L_0x010b:
        r5 = "android.media.action.IMAGE_CAPTURE_SECURE";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x0113:
        r1 = 5;
        goto L_0x0051;
    L_0x0116:
        r5 = "android.media.action.IMAGE_CAPTURE";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0050;
    L_0x011e:
        r1 = r4;
        goto L_0x0051;
    L_0x0121:
        r1 = r4;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: cep.i():void");
    }

    /* renamed from: j */
    public final void mo6373j() {
        boolean z = false;
        this.f23049k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f23051m >= ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS) {
            this.f23051m = elapsedRealtime;
            try {
                epf a = epf.m1992a();
                if (a.f4235f == 0 || a.f4234e == 0) {
                    throw new IllegalStateException("Incomplete session. shutterButtonFirstEnabled has not been set.");
                }
                klq[] klqArr;
                eventprotos$LaunchReport eventprotos_launchreport = new eventprotos$LaunchReport();
                if (a.f4236g.f4255a) {
                    elapsedRealtime = a.f4230a;
                } else {
                    elapsedRealtime = a.f4231b;
                }
                eventprotos_launchreport.controlNanoTime = elapsedRealtime;
                eventprotos_launchreport.previewFrameNanoTime = a.f4233d;
                eventprotos_launchreport.cameraActivityInitializedNanoTime = a.f4232c;
                eventprotos_launchreport.shutterButtonFirstDrawNanoTime = a.f4234e;
                eventprotos_launchreport.shutterButtonFirstEnabledNanoTime = a.f4235f;
                irs irs = this.f23044f;
                int d = m15186d();
                List sessionList = this.f23045g.jankStats().getSessionList();
                if (sessionList != null) {
                    klq[] klqArr2 = new klq[sessionList.size()];
                    while (true) {
                        boolean z2 = z;
                        if (z2 >= sessionList.size()) {
                            break;
                        }
                        ViewfinderJankSession viewfinderJankSession = (ViewfinderJankSession) sessionList.get(z2);
                        klq klq = new klq();
                        klq.f25283e = viewfinderJankSession.f12882d;
                        klq.f25284f = viewfinderJankSession.f12883e;
                        klq.f25285g = viewfinderJankSession.f12884f;
                        List list = viewfinderJankSession.f12881c;
                        klq.f25282d = (kke[]) list.toArray(new kke[list.size()]);
                        list = viewfinderJankSession.f12880b;
                        klq.f25281c = (kke[]) list.toArray(new kke[list.size()]);
                        klq.f25279a = viewfinderJankSession.f12885g;
                        klq.f25280b = viewfinderJankSession.f12886h;
                        klqArr2[z2] = klq;
                        z = z2 + 1;
                    }
                    klqArr = klqArr2;
                } else {
                    klqArr = null;
                }
                irs.mo8888a(d, klqArr, eventprotos_launchreport);
            } catch (IllegalStateException e) {
            }
        }
    }
}
