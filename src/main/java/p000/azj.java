package p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.GoogleCamera.R;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: azj */
public final class azj implements ays {
    /* renamed from: a */
    public final ayp f22532a;
    /* renamed from: b */
    public boolean f22533b;
    /* renamed from: c */
    public ayv f22534c;
    /* renamed from: d */
    private final azr f22535d;
    /* renamed from: e */
    private final ilp f22536e;
    /* renamed from: f */
    private final Handler f22537f;
    /* renamed from: g */
    private final Runnable f22538g;
    /* renamed from: h */
    private final irs f22539h;
    /* renamed from: i */
    private final ivw f22540i;
    /* renamed from: j */
    private final axs f22541j = new azm(this);
    /* renamed from: k */
    private final axp f22542k;
    /* renamed from: l */
    private int f22543l;
    /* renamed from: m */
    private ilp f22544m;
    /* renamed from: n */
    private int f22545n;
    /* renamed from: o */
    private long f22546o;
    /* renamed from: p */
    private ayx f22547p;

    static {
        bli.m887a("DirtyLensPlugin");
    }

    public azj(azh azh, ayp ayp, azr azr, azb azb, Resources resources, ilp ilp, irs irs, bsn bsn, ivw ivw, CameraManager cameraManager) {
        jri.m13404b((Object) azh);
        this.f22535d = (azr) jri.m13404b((Object) azr);
        this.f22532a = (ayp) jri.m13404b((Object) ayp);
        jri.m13404b((Object) azb);
        this.f22536e = ilp;
        this.f22539h = irs;
        this.f22540i = ivw;
        this.f22546o = 5000;
        this.f22537f = new Handler(Looper.getMainLooper());
        this.f22538g = new azk(this, ayp);
        this.f22543l = C0252go.f5950v;
        this.f22544m = ayp.f1058a;
        this.f22545n = 0;
        ivw.mo9110b().mo8557a(this.f22536e.mo13672a(new azn(cameraManager, ayp, azr), kpq.f8776a));
        axq axq = new axq();
        axq.f1048a = resources.getString(R.string.advice_dirty_lens);
        axq.f1049b = resources.getString(R.string.advice_dirty_lens_popup_text);
        axq.f1051d = 7000;
        axq.f1052e = 268435455;
        axq.f1050c = this.f22541j;
        jri.m13404b(axq.f1048a);
        jri.m13404b(axq.f1049b);
        jri.m13404b(axq.f1050c);
        String str = axq.f1048a;
        String str2 = axq.f1049b;
        this.f22542k = new axp(str, axq.f1050c, axq.f1051d, axq.f1052e);
    }

    /* renamed from: d */
    final void mo14553d() {
        this.f22533b = false;
        this.f22537f.removeCallbacks(this.f22538g);
        ayp ayp = this.f22532a;
        ayp.f1059b.mo8826a(Boolean.valueOf(false));
        ayp.f1058a.mo8826a(Integer.valueOf(0));
    }

    /* renamed from: a */
    public final void mo1851a() {
        if (m14965f()) {
            mo14553d();
            ayv ayv = this.f22534c;
            if (ayv != null) {
                ayv.mo1857a();
            }
        }
    }

    /* renamed from: e */
    public final void mo14554e() {
        this.f22537f.removeCallbacks(this.f22538g);
        this.f22537f.postDelayed(this.f22538g, this.f22546o);
    }

    /* renamed from: b */
    public final ayp mo1854b() {
        return this.f22532a;
    }

    /* renamed from: f */
    private final boolean m14965f() {
        boolean z = false;
        ayv ayv = this.f22534c;
        if (ayv != null) {
            if (ayv.mo1858b() == C0252go.f5945q) {
                z = true;
            } else if (this.f22534c.mo1858b() == C0252go.f5946r) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1853a(iur iur) {
        azx azx;
        azr azr = this.f22535d;
        azr.f1067c = this.f22532a.mo1856a(iur);
        azv azv = azr.f1065a;
        azw azw = (azw) azr.f1067c.mo13673b();
        if (azw instanceof azx) {
            azx = (azx) azw;
        } else {
            azx azx2 = new azx();
            for (int i = 0; ((long) i) < azw.mo1869a(); i++) {
                azx2.mo1870a(azw.mo1868a(i));
            }
            azx = azx2;
        }
        azv.f1068a.setRaw_score_history_(azx.f11097a);
        bsn bsn = azr.f1066b;
        this.f22543l = C0252go.f5950v;
        this.f22545n = 0;
        this.f22544m.mo8826a(Integer.valueOf(15));
        mo14554e();
    }

    /* JADX WARNING: Missing block: B:78:0x01cb, code:
            if (r16 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Missing block: B:80:?, code:
            r16.close();
     */
    /* JADX WARNING: Missing block: B:101:0x0216, code:
            r4 = move-exception;
     */
    /* JADX WARNING: Missing block: B:102:0x0217, code:
            p000.kqg.m5105a(r2, r4);
     */
    /* renamed from: a */
    public final boolean mo12339a(p000.gfw r20) {
        /*
        r19 = this;
        r0 = r19;
        r2 = r0.f22536e;
        r2 = r2.mo13673b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x0019;
    L_0x0010:
        r0 = r20;
        r2 = r0.f5387b;
        r2.close();
        r2 = 0;
    L_0x0018:
        return r2;
    L_0x0019:
        r0 = r20;
        r0 = r0.f5387b;
        r16 = r0;
        r0 = r19;
        r2 = r0.f22545n;	 Catch:{ all -> 0x01c8 }
        r2 = r2 + 1;
        r0 = r19;
        r0.f22545n = r2;	 Catch:{ all -> 0x01c8 }
        r2 = r16.mo13741c();	 Catch:{ all -> 0x01c8 }
        r3 = 35;
        if (r2 != r3) goto L_0x020e;
    L_0x0031:
        r17 = r16.mo13745g();	 Catch:{ all -> 0x01c8 }
        r18 = r16.mo13742d();	 Catch:{ all -> 0x01c8 }
        r0 = r17;
        r2 = r0 / 640;
        r0 = r18;
        r3 = r0 / 480;
        r15 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x01c8 }
        if (r15 <= 0) goto L_0x0057;
    L_0x0047:
        r2 = 1;
        if (r15 <= r2) goto L_0x0058;
    L_0x004a:
        r0 = r17;
        r1 = r18;
        r2 = p000.azb.m784a(r0, r1, r15);	 Catch:{ all -> 0x01c8 }
        if (r2 != 0) goto L_0x0058;
    L_0x0054:
        r15 = r15 + -1;
        goto L_0x0047;
    L_0x0057:
        r15 = -1;
    L_0x0058:
        if (r15 > 0) goto L_0x0062;
    L_0x005a:
        r2 = r17 * r18;
        r3 = 307200; // 0x4b000 float:4.30479E-40 double:1.51777E-318;
        if (r2 < r3) goto L_0x0062;
    L_0x0061:
        r15 = 1;
    L_0x0062:
        if (r15 > 0) goto L_0x006b;
    L_0x0064:
        if (r16 == 0) goto L_0x0069;
    L_0x0066:
        r16.close();
    L_0x0069:
        r2 = 0;
        goto L_0x0018;
    L_0x006b:
        p000.jri.m13404b(r16);	 Catch:{ all -> 0x01c8 }
        r2 = r16.mo13741c();	 Catch:{ all -> 0x01c8 }
        r3 = 35;
        if (r2 != r3) goto L_0x020b;
    L_0x0076:
        r2 = r16.mo13745g();	 Catch:{ all -> 0x01c8 }
        r3 = r16.mo13742d();	 Catch:{ all -> 0x01c8 }
        if (r15 <= 0) goto L_0x0208;
    L_0x0080:
        r4 = p000.azb.m784a(r2, r3, r15);	 Catch:{ all -> 0x01c8 }
        if (r4 == 0) goto L_0x0205;
    L_0x0086:
        r4 = r2 / r15;
        r5 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        if (r4 < r5) goto L_0x0202;
    L_0x008c:
        r4 = r3 / r15;
        r5 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r4 < r5) goto L_0x01ff;
    L_0x0092:
        r4 = 1;
    L_0x0093:
        if (r4 == 0) goto L_0x01fc;
    L_0x0095:
        r5 = r16.mo13743e();	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r6 = r0;
        r4 = 1;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r9 = r0;
        r4 = 2;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r12 = r0;
        r4 = r2 * r3;
        r5 = r15 * r15;
        r4 = r4 / r5;
        r13 = java.nio.ByteBuffer.allocateDirect(r4);	 Catch:{ all -> 0x01c8 }
        r4 = r4 / 2;
        r14 = java.nio.ByteBuffer.allocateDirect(r4);	 Catch:{ all -> 0x01c8 }
        r4 = r6.mo9144a();	 Catch:{ all -> 0x01c8 }
        r5 = r6.mo9145b();	 Catch:{ all -> 0x01c8 }
        r6 = r6.mo9146c();	 Catch:{ all -> 0x01c8 }
        r7 = r9.mo9144a();	 Catch:{ all -> 0x01c8 }
        r8 = r9.mo9145b();	 Catch:{ all -> 0x01c8 }
        r9 = r9.mo9146c();	 Catch:{ all -> 0x01c8 }
        r10 = r12.mo9144a();	 Catch:{ all -> 0x01c8 }
        r11 = r12.mo9145b();	 Catch:{ all -> 0x01c8 }
        r12 = r12.mo9146c();	 Catch:{ all -> 0x01c8 }
        r2 = com.google.android.libraries.camera.jni.yuv.YuvUtilNative.downsampleYUV_420_888toNV21Native(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01f9;
    L_0x00ed:
        r2 = 2;
        r2 = new java.nio.ByteBuffer[r2];	 Catch:{ all -> 0x01c8 }
        r3 = 0;
        r2[r3] = r13;	 Catch:{ all -> 0x01c8 }
        r3 = 1;
        r2[r3] = r14;	 Catch:{ all -> 0x01c8 }
    L_0x00f6:
        if (r2 != 0) goto L_0x0100;
    L_0x00f8:
        if (r16 == 0) goto L_0x00fd;
    L_0x00fa:
        r16.close();
    L_0x00fd:
        r2 = 0;
        goto L_0x0018;
    L_0x0100:
        r3 = r17 / r15;
        r4 = r18 / r15;
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x01c8 }
        r5 = 0;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13404b(r5);	 Catch:{ all -> 0x01c8 }
        r5 = 1;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13404b(r5);	 Catch:{ all -> 0x01c8 }
        r5 = 0;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        r6 = 1;
        r2 = r2[r6];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13404b(r5);	 Catch:{ all -> 0x01c8 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x01c8 }
        r6 = com.google.googlex.gcam.BufferUtils.getDirectBufferAddress(r5);	 Catch:{ all -> 0x01c8 }
        r8 = com.google.googlex.gcam.BufferUtils.getDirectBufferAddress(r2);	 Catch:{ all -> 0x01c8 }
        r6 = com.google.googlex.gcam.BufferUtils.wrapNativePointerWithSwigUnsignedChar(r6);	 Catch:{ all -> 0x01c8 }
        r10 = com.google.googlex.gcam.BufferUtils.wrapNativePointerWithSwigUnsignedChar(r8);	 Catch:{ all -> 0x01c8 }
        r2 = new com.google.googlex.gcam.YuvReadView;	 Catch:{ all -> 0x01c8 }
        r7 = r3 / 2;
        r8 = r4 / 2;
        r11 = 2;
        r5 = r3;
        r9 = r3;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x01c8 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x01c8 }
        r3 = 1;
        r3 = new float[r3];	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        r5 = 0;
        r3[r4] = r5;	 Catch:{ all -> 0x01c8 }
        r2 = com.google.googlex.gcam.GcamModule.GetDirtyLensRawScore(r2, r3);	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01f5;
    L_0x014b:
        r2 = 0;
        r2 = r3[r2];	 Catch:{ all -> 0x01c8 }
    L_0x014e:
        r0 = r19;
        r3 = r0.f22535d;	 Catch:{ all -> 0x01c8 }
        r4 = r3.f1067c;	 Catch:{ all -> 0x01c8 }
        if (r4 != 0) goto L_0x01e0;
    L_0x0156:
        r2 = 0;
    L_0x0157:
        if (r2 == 0) goto L_0x01db;
    L_0x0159:
        r2 = p000.C0252go.f5949u;	 Catch:{ all -> 0x01c8 }
        r3 = r2;
    L_0x015c:
        r0 = r19;
        r2 = r0.f22533b;	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d9;
    L_0x0162:
        r0 = r19;
        r2 = r0.f22543l;	 Catch:{ all -> 0x01c8 }
        if (r3 == r2) goto L_0x01d7;
    L_0x0168:
        r2 = r3 + -1;
        switch(r2) {
            case 0: goto L_0x0182;
            default: goto L_0x016d;
        };	 Catch:{ all -> 0x01c8 }
    L_0x016d:
        r2 = 0;
    L_0x016e:
        r0 = r19;
        r0.f22543l = r3;	 Catch:{ all -> 0x01c8 }
    L_0x0172:
        r0 = r19;
        r3 = r0.f22545n;	 Catch:{ all -> 0x01c8 }
        if (r3 <= 0) goto L_0x017b;
    L_0x0178:
        r19.mo14553d();	 Catch:{ all -> 0x01c8 }
    L_0x017b:
        if (r16 == 0) goto L_0x0018;
    L_0x017d:
        r16.close();
        goto L_0x0018;
    L_0x0182:
        r0 = r19;
        r2 = r0.f22536e;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo13673b();	 Catch:{ all -> 0x01c8 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x01c8 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d5;
    L_0x0192:
        r2 = r19.m14965f();	 Catch:{ all -> 0x01c8 }
        if (r2 != 0) goto L_0x01d3;
    L_0x0198:
        r0 = r19;
        r2 = r0.f22547p;	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d1;
    L_0x019e:
        r0 = r19;
        r4 = r0.f22542k;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo1861a(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r0.f22534c = r2;	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r2 = r0.f22539h;	 Catch:{ all -> 0x01c8 }
        r2.mo8916f();	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r2 = r0.f22540i;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo9111c();	 Catch:{ all -> 0x01c8 }
        r4 = new azl;	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r4.<init>(r0);	 Catch:{ all -> 0x01c8 }
        r2.mo8557a(r4);	 Catch:{ all -> 0x01c8 }
        r2 = 1;
    L_0x01c4:
        r19.mo14553d();	 Catch:{ all -> 0x01c8 }
        goto L_0x016e;
    L_0x01c8:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01ca }
    L_0x01ca:
        r3 = move-exception;
        if (r16 == 0) goto L_0x01d0;
    L_0x01cd:
        r16.close();	 Catch:{ all -> 0x0216 }
    L_0x01d0:
        throw r3;
    L_0x01d1:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d3:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d5:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d7:
        r2 = 0;
        goto L_0x0172;
    L_0x01d9:
        r2 = 0;
        goto L_0x0172;
    L_0x01db:
        r2 = p000.C0252go.f5950v;	 Catch:{ all -> 0x01c8 }
        r3 = r2;
        goto L_0x015c;
    L_0x01e0:
        r5 = r3.f1065a;	 Catch:{ all -> 0x01c8 }
        r5 = r5.f1068a;	 Catch:{ all -> 0x01c8 }
        r2 = r5.AddRawScore(r2);	 Catch:{ all -> 0x01c8 }
        r5 = r3.f1065a;	 Catch:{ all -> 0x01c8 }
        r5 = r5.mo1867a();	 Catch:{ all -> 0x01c8 }
        r4.mo8826a(r5);	 Catch:{ all -> 0x01c8 }
        r3 = r3.f1066b;	 Catch:{ all -> 0x01c8 }
        goto L_0x0157;
    L_0x01f5:
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        goto L_0x014e;
    L_0x01f9:
        r2 = 0;
        goto L_0x00f6;
    L_0x01fc:
        r2 = 0;
        goto L_0x00f6;
    L_0x01ff:
        r4 = 0;
        goto L_0x0093;
    L_0x0202:
        r4 = 0;
        goto L_0x0093;
    L_0x0205:
        r2 = 0;
        goto L_0x00f6;
    L_0x0208:
        r2 = 0;
        goto L_0x00f6;
    L_0x020b:
        r2 = 0;
        goto L_0x00f6;
    L_0x020e:
        if (r16 == 0) goto L_0x0213;
    L_0x0210:
        r16.close();
    L_0x0213:
        r2 = 0;
        goto L_0x0018;
    L_0x0216:
        r4 = move-exception;
        p000.kqg.m5105a(r2, r4);
        goto L_0x01d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: azj.a(gfw):boolean");
    }

    /* renamed from: a */
    public final void mo1852a(ayx ayx) {
        this.f22547p = ayx;
    }

    /* renamed from: c */
    public final void mo1855c() {
    }
}
