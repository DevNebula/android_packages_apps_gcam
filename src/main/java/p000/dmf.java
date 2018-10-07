package p000;

/* compiled from: PG */
/* renamed from: dmf */
public final class dmf extends doc {
    /* renamed from: c */
    public static final String f23992c = bli.m887a("VidIntStOpenCamera");
    /* renamed from: d */
    public final iut f23993d;
    /* renamed from: e */
    public final iur f23994e;
    /* renamed from: f */
    public final ffc f23995f;
    /* renamed from: g */
    public boolean f23996g;
    /* renamed from: h */
    public djz f23997h;
    /* renamed from: i */
    public kpk f23998i;
    /* renamed from: j */
    public bfe f23999j;
    /* renamed from: k */
    private final ipv f24000k = new dmg(this);
    /* renamed from: l */
    private boolean f24001l;

    public dmf(doc doc, iut iut, iur iur, ffc ffc) {
        super((bug) doc);
        this.f23993d = iut;
        this.f23994e = iur;
        this.f23995f = ffc;
        this.f23996g = false;
        mo2149a(dbd.class, new dmh(this));
        mo2149a(dlo.class, new dmi(this));
        mo2149a(dav.class, new dmk(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0186  */
    /* renamed from: e */
    public final p000.doc mo2150b() {
        /*
        r14 = this;
        r13 = 0;
        r9 = 1;
        r10 = 0;
        r0 = r14.f23995f;
        if (r0 != 0) goto L_0x0014;
    L_0x0007:
        r0 = f23992c;
        r1 = "mOneCameraCharacteristics is null";
        p000.bli.m891b(r0, r1);
        r13 = new dlz;
        r13.<init>(r14);
    L_0x0013:
        return r13;
    L_0x0014:
        r0 = r14.mo2152d();
        r0 = (p000.doa) r0;
        r0 = r0.f14234a;
        r1 = r0.getExtras();
        r0 = r14.mo2152d();
        r0 = (p000.doa) r0;
        r2 = r0.f14234a;
        r5 = p000.kau.f21835a;
        r12 = p000.kau.f21835a;
        if (r1 == 0) goto L_0x0077;
    L_0x002e:
        r0 = "output";
        r0 = r1.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        if (r0 == 0) goto L_0x0077;
    L_0x0038:
        r1 = r14.mo2152d();	 Catch:{ FileNotFoundException -> 0x0229 }
        r1 = (p000.doa) r1;	 Catch:{ FileNotFoundException -> 0x0229 }
        r1 = r1.f14248o;	 Catch:{ FileNotFoundException -> 0x0229 }
        r3 = "rw";
        r1 = r1.openFileDescriptor(r0, r3);	 Catch:{ FileNotFoundException -> 0x0229 }
        r5 = p000.kbg.m4804c(r1);	 Catch:{ FileNotFoundException -> 0x0229 }
        r1 = f23992c;	 Catch:{ FileNotFoundException -> 0x021d }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ FileNotFoundException -> 0x021d }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ FileNotFoundException -> 0x021d }
        r4 = r4.length();	 Catch:{ FileNotFoundException -> 0x021d }
        r4 = r4 + 14;
        r6 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x021d }
        r6.<init>(r4);	 Catch:{ FileNotFoundException -> 0x021d }
        r4 = "Input uri is: ";
        r6.append(r4);	 Catch:{ FileNotFoundException -> 0x021d }
        r6.append(r3);	 Catch:{ FileNotFoundException -> 0x021d }
        r3 = r6.toString();	 Catch:{ FileNotFoundException -> 0x021d }
        p000.bli.m894c(r1, r3);	 Catch:{ FileNotFoundException -> 0x021d }
        r1 = r14.mo2152d();	 Catch:{ FileNotFoundException -> 0x021d }
        r1 = (p000.doa) r1;	 Catch:{ FileNotFoundException -> 0x021d }
        r1.mo13044a(r0);	 Catch:{ FileNotFoundException -> 0x021d }
    L_0x0077:
        r0 = "android.intent.extra.videoQuality";
        r0 = r2.hasExtra(r0);
        if (r0 == 0) goto L_0x021a;
    L_0x007f:
        r0 = "android.intent.extra.videoQuality";
        r0 = r2.getIntExtra(r0, r10);
        if (r0 != 0) goto L_0x0217;
    L_0x0087:
        r4 = r9;
    L_0x0088:
        r0 = "android.intent.extra.durationLimit";
        r0 = r2.hasExtra(r0);
        if (r0 == 0) goto L_0x0214;
    L_0x0090:
        r0 = "android.intent.extra.durationLimit";
        r0 = r2.getIntExtra(r0, r10);
        r0 = java.lang.Integer.valueOf(r0);
        r7 = r0;
    L_0x009b:
        r0 = "android.intent.extra.sizeLimit";
        r0 = r2.hasExtra(r0);
        if (r0 == 0) goto L_0x00da;
    L_0x00a3:
        r0 = "android.intent.extra.sizeLimit";
        r0 = r2.getIntExtra(r0, r10);
        r0 = (long) r0;
        r0 = java.lang.Long.valueOf(r0);
        r12 = p000.kbg.m4804c(r0);
        r0 = f23992c;
        r1 = r12.mo9706a();
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 14;
        r3.<init>(r2);
        r2 = "SIZE LIMTI IS ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        p000.bli.m894c(r0, r1);
    L_0x00da:
        r0 = r14.mo2152d();
        r0 = (p000.doa) r0;
        r0 = r0.f14251r;
        r1 = p000.inc.FPS_30;
        r2 = r14.f23994e;
        r2 = r0.mo12367b(r2);
        r2 = r2.mo9706a();
        r2 = (p000.bez) r2;
        r3 = r14.mo2152d();
        r3 = (p000.doa) r3;
        r6 = r3.f14243j;
        r3 = r14.mo2152d();
        r3 = (p000.doa) r3;
        r3 = r3.f14241h;
        r3 = r3.mo6123a();
        r3 = r6.mo5997a(r3, r2, r1, r4);
        r6 = new irg;
        r4 = r14.f23994e;
        r6.<init>(r4);
        r4 = r14.mo2152d();
        r4 = (p000.doa) r4;
        r4 = r4.f14250q;
        r8 = r14.f23994e;
        r4.mo8867a(r8, r6);
        r4 = r14.mo2152d();
        r4 = (p000.doa) r4;
        r4 = r4.f14243j;
        r2 = r2.mo1932a();
        r2 = r4.mo6002b(r1, r3, r2);
        r14.f24001l = r2;
        r2 = r14.f24001l;
        if (r2 == 0) goto L_0x0209;
    L_0x0132:
        r6 = new dmm;
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14255v;
        r6.<init>(r14, r2);
    L_0x013f:
        r4 = new djz;
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14241h;
        r8 = r2.mo6123a();
        r11 = r14.f23995f;
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14240g;
        r4.<init>(r8, r11, r2);
        r14.f23997h = r4;
        r8 = p000.kau.f21835a;
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14243j;
        r2 = r2.mo6003c();
        if (r2 == 0) goto L_0x0178;
    L_0x016c:
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14239f;
        r8 = p000.kbg.m4804c(r2);
    L_0x0178:
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14243j;
        r11 = r2.mo5996a(r1, r3);
        if (r7 == 0) goto L_0x018a;
    L_0x0186:
        r11 = r7.intValue();
    L_0x018a:
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14243j;
        r2 = r2.mo6000b(r1, r3);
        if (r7 == 0) goto L_0x01a1;
    L_0x0198:
        r4 = r7.intValue();
        if (r4 >= r2) goto L_0x01a1;
    L_0x019e:
        r7.intValue();
    L_0x01a1:
        r2 = r14.mo2152d();
        r2 = (p000.doa) r2;
        r2 = r2.f14223B;
        r4 = r14.f23993d;
        r2.mo14869a(r4);
        r2 = r14.f24000k;
        r4 = r14.f23994e;
        r7 = r14.f23997h;
        r7 = r7.f14125a;
        r14.mo2152d();
        r0 = r0.mo12366a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r14.f23998i = r0;
        r0 = r14.mo2152d();
        r0 = (p000.doa) r0;
        r1 = r0.f14250q;
        r2 = p000.kpw.m18486d();
        r0 = com.google.android.apps.camera.stats.Instrumentation.instance();
        r0 = r0.cameraDevice();
        r0 = r0.create();
        r0 = (com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession) r0;
        r0.mo12625b();
        r4 = r14.f23994e;
        r5 = new dmn;
        r5.<init>(r14, r0, r2);
        r1.mo8867a(r4, r5);
        r0 = r14.f23998i;
        r1 = new ijv;
        r1.<init>(r14, r3);
        r3 = new java.util.ArrayList;
        r4 = 2;
        r3.<init>(r4);
        r3.add(r0);
        r3.add(r2);
        r0 = p000.kow.m13872a(r3);
        r2 = new ijs;
        r2.<init>(r1);
        r1 = p000.kpq.f8776a;
        p000.kow.m13878a(r0, r2, r1);
        goto L_0x0013;
    L_0x0209:
        r6 = new ilb;
        r2 = java.lang.Boolean.valueOf(r10);
        r6.<init>(r2);
        goto L_0x013f;
    L_0x0214:
        r7 = r13;
        goto L_0x009b;
    L_0x0217:
        r4 = r10;
        goto L_0x0088;
    L_0x021a:
        r4 = r10;
        goto L_0x0088;
    L_0x021d:
        r0 = move-exception;
    L_0x021e:
        r1 = f23992c;
        r0 = r0.toString();
        p000.bli.m891b(r1, r0);
        goto L_0x0077;
    L_0x0229:
        r0 = move-exception;
        goto L_0x021e;
        */
        throw new UnsupportedOperationException("Method not decompiled: dmf.e():doc");
    }
}
