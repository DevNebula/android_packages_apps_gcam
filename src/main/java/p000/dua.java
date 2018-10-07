package p000;

/* compiled from: PG */
/* renamed from: dua */
public final class dua implements duc {
    /* renamed from: a */
    private static final String f16788a = bli.m887a("BrightnessMtrMetric");
    /* renamed from: b */
    private final int f16789b;
    /* renamed from: c */
    private int f16790c;
    /* renamed from: d */
    private final gjk f16791d;
    /* renamed from: e */
    private float f16792e = -1.0f;

    public dua(int i, gjk gjk) {
        this.f16789b = i;
        this.f16791d = gjk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A:{Catch:{ NullPointerException -> 0x00f7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A:{Catch:{ NullPointerException -> 0x00f7 }} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A:{Catch:{ NullPointerException -> 0x00f7 }} */
    /* renamed from: a */
    public final float mo6060a(p000.iwp r9) {
        /*
        r8 = this;
        r2 = 0;
        r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Integer) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.intValue();	 Catch:{ NullPointerException -> 0x00f7 }
        if (r0 == 0) goto L_0x001c;
    L_0x000f:
        r1 = 5;
        if (r0 == r1) goto L_0x001c;
    L_0x0012:
        r0 = r8.f16791d;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.f19239c;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.isDone();	 Catch:{ NullPointerException -> 0x00f7 }
        if (r0 != 0) goto L_0x001f;
    L_0x001c:
        r0 = r8.f16792e;	 Catch:{ NullPointerException -> 0x00f7 }
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Long) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r1 = r8.f16791d;	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r1 = r1.f19239c;	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r1 = r1.get();	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r1 = (p000.gkc) r1;	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r4 = r1.f5518a;	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ InterruptedException -> 0x0118, ExecutionException -> 0x0123 }
        r2 = r8.f16790c;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r2 = (float) r2;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r3 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 < 0) goto L_0x00fc;
    L_0x0040:
        r2 = f16788a;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r3 = r8.f16790c;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r4 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r5 = 41;
        r4.<init>(r5);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r5 = "Timeout after skipping ";
        r4.append(r5);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r4.append(r3);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r3 = " frames";
        r4.append(r3);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r3 = r4.toString();	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        p000.bli.m888a(r2, r3);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r2 = r8.f16791d;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r2 = r2.f19239c;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r3 = 0;
        r2.cancel(r3);	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
    L_0x0067:
        r2 = r8.f16790c;	 Catch:{ NullPointerException -> 0x00f7 }
        if (r2 <= 0) goto L_0x00ae;
    L_0x006b:
        r2 = f16788a;	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = r8.f16790c;	 Catch:{ NullPointerException -> 0x00f7 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = r4.length();	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = r4 + 60;
        r5 = java.lang.String.valueOf(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r5 = r5.length();	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00f7 }
        r5.<init>(r4);	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = "skipped ";
        r5.append(r4);	 Catch:{ NullPointerException -> 0x00f7 }
        r5.append(r3);	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = ", selfie flash off time: ";
        r5.append(r3);	 Catch:{ NullPointerException -> 0x00f7 }
        r5.append(r1);	 Catch:{ NullPointerException -> 0x00f7 }
        r1 = ", current time: ";
        r5.append(r1);	 Catch:{ NullPointerException -> 0x00f7 }
        r5.append(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r5.toString();	 Catch:{ NullPointerException -> 0x00f7 }
        p000.bli.m888a(r2, r0);	 Catch:{ NullPointerException -> 0x00f7 }
    L_0x00ae:
        r0 = 0;
        r8.f16790c = r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Long) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.longValue();	 Catch:{ NullPointerException -> 0x00f7 }
        r1 = (float) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Integer) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.intValue();	 Catch:{ NullPointerException -> 0x00f7 }
        r2 = (float) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Integer) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.intValue();	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (float) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r0 = r0 / r3;
        r2 = r2 * r0;
        r0 = android.hardware.camera2.CaptureResult.LENS_APERTURE;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r9.mo13730a(r0);	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = (java.lang.Float) r0;	 Catch:{ NullPointerException -> 0x00f7 }
        r0 = r0.floatValue();	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = r8.f16789b;	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = (float) r3;	 Catch:{ NullPointerException -> 0x00f7 }
        r4 = 1322685349; // 0x4ed693a5 float:1.80000013E9 double:6.53493391E-315;
        r3 = r3 * r4;
        r3 = r3 * r0;
        r0 = r0 * r3;
        r1 = r1 * r2;
        r0 = r0 / r1;
        r8.f16792e = r0;	 Catch:{ NullPointerException -> 0x00f7 }
        goto L_0x001e;
    L_0x00f7:
        r0 = move-exception;
        r0 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        goto L_0x001e;
    L_0x00fc:
        if (r0 == 0) goto L_0x0067;
    L_0x00fe:
        r2 = r0.longValue();	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r4 = r1.longValue();	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r6 = 500000000; // 0x1dcd6500 float:5.436748E-21 double:2.47032823E-315;
        r4 = r4 + r6;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0067;
    L_0x010e:
        r2 = r8.f16790c;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r2 = r2 + 1;
        r8.f16790c = r2;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        r0 = r8.f16792e;	 Catch:{ InterruptedException -> 0x0130, ExecutionException -> 0x012e }
        goto L_0x001e;
    L_0x0118:
        r1 = move-exception;
        r1 = r2;
    L_0x011a:
        r2 = f16788a;	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = "Selfie flash off future interrupted, continuing to compute BMM";
        p000.bli.m891b(r2, r3);	 Catch:{ NullPointerException -> 0x00f7 }
        goto L_0x0067;
    L_0x0123:
        r1 = move-exception;
        r1 = r2;
    L_0x0125:
        r2 = f16788a;	 Catch:{ NullPointerException -> 0x00f7 }
        r3 = "Selfie flash off future interrupted, continuing to compute BMM";
        p000.bli.m891b(r2, r3);	 Catch:{ NullPointerException -> 0x00f7 }
        goto L_0x0067;
    L_0x012e:
        r2 = move-exception;
        goto L_0x0125;
    L_0x0130:
        r2 = move-exception;
        goto L_0x011a;
        */
        throw new UnsupportedOperationException("Method not decompiled: dua.a(iwp):float");
    }
}
