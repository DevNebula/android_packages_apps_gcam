package p000;

import android.annotation.TargetApi;
import com.google.googlex.gcam.AeResults;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: duh */
final class duh implements duf, ijk, iqo {
    /* renamed from: a */
    public final Object f16802a = new Object();
    /* renamed from: b */
    public int f16803b = 0;
    /* renamed from: c */
    private final dva f16804c;
    /* renamed from: d */
    private final dui f16805d;
    /* renamed from: e */
    private final Object f16806e = new Object();
    /* renamed from: f */
    private boolean f16807f = false;
    /* renamed from: g */
    private int f16808g;
    /* renamed from: h */
    private int f16809h;
    /* renamed from: i */
    private AeResults f16810i = null;
    /* renamed from: j */
    private iwp f16811j = null;
    /* renamed from: k */
    private dva f16812k = null;
    /* renamed from: l */
    private ikb f16813l = null;
    /* renamed from: m */
    private kpk f16814m = null;

    static {
        bli.m887a("SMManager");
    }

    duh(dva dva, dui dui, int i) {
        this.f16809h = i;
        this.f16805d = dui;
        this.f16804c = dva;
    }

    public final void close() {
        ikb ikb;
        synchronized (this.f16802a) {
            this.f16807f = true;
            ikb = this.f16813l;
            this.f16813l = null;
            this.f16814m = null;
            this.f16809h = C0252go.f5828aa;
        }
        if (ikb != null) {
            ikb.close();
        }
    }

    /* renamed from: b */
    public final int mo6062b() {
        int i;
        synchronized (this.f16802a) {
            i = this.f16809h;
        }
        return i;
    }

    /* renamed from: c */
    public final kbg mo6063c() {
        kbg a;
        synchronized (this.f16806e) {
            a = this.f16812k.mo13056a();
        }
        return a;
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        synchronized (this.f16802a) {
            synchronized (this.f16802a) {
                if (this.f16807f) {
                } else {
                    this.f16808g = C0252go.f5829ab;
                    if (this.f16803b > 0) {
                        boolean z;
                        if (this.f16813l == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jri.m13395a(z);
                    } else {
                        ikb ikb = this.f16813l;
                        if (ikb == null || this.f16809h != this.f16808g) {
                            if (ikb != null) {
                                mo13054e();
                            }
                            this.f16809h = this.f16808g;
                            if (this.f16809h == C0252go.f5828aa) {
                            } else {
                                mo13053d();
                            }
                        }
                    }
                }
            }
        }
        return kow.m13873a(Boolean.valueOf(true));
    }

    /* JADX WARNING: Missing block: B:31:0x0051, code:
            r3 = r13.f16806e;
     */
    /* JADX WARNING: Missing block: B:32:0x0053, code:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:34:?, code:
            p000.jri.m13391a(r13.f16812k, (java.lang.Object) "Must start loop before invoking startCapture.");
            r4 = r13.f16805d;
            r5 = r13.f16812k;
            r6 = r4.f3514a.mo6850a(1);
     */
    /* JADX WARNING: Missing block: B:35:0x0065, code:
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:61:?, code:
            r6.close();
     */
    /* JADX WARNING: Missing block: B:109:0x017e, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:111:?, code:
            p000.kqg.m5105a(r0, r2);
     */
    /* renamed from: a */
    public final p000.dug mo6061a(p000.fip r14, p000.fio r15, long r16) {
        /*
        r13 = this;
        r1 = r13.f16802a;
        monitor-enter(r1);
        r13.m9565f();	 Catch:{ all -> 0x0154 }
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        r1 = r13.f16802a;
        monitor-enter(r1);
        r0 = r13.f16813l;	 Catch:{ all -> 0x0157 }
        r2 = r13.f16814m;	 Catch:{ all -> 0x0157 }
        r3 = 0;
        r13.f16813l = r3;	 Catch:{ all -> 0x0157 }
        r3 = 0;
        r13.f16814m = r3;	 Catch:{ all -> 0x0157 }
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0.close();
        if (r2 == 0) goto L_0x001f;
    L_0x001c:
        r2.get();	 Catch:{ ExecutionException -> 0x015a }
    L_0x001f:
        r1 = r13.f16802a;
        monitor-enter(r1);
        r13.m9565f();	 Catch:{ all -> 0x004d }
        r0 = r13.f16809h;	 Catch:{ all -> 0x004d }
        r2 = p000.C0252go.f5828aa;	 Catch:{ all -> 0x004d }
        if (r0 != r2) goto L_0x003a;
    L_0x002b:
        r0 = r13.f16803b;	 Catch:{ all -> 0x004d }
        r0 = r0 + 1;
        r13.f16803b = r0;	 Catch:{ all -> 0x004d }
        r0 = new dug;	 Catch:{ all -> 0x004d }
        r2 = 0;
        r3 = 0;
        r0.<init>(r13, r2, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = r13.f16803b;	 Catch:{ all -> 0x004d }
        if (r0 <= 0) goto L_0x0050;
    L_0x003e:
        r0 = r0 + 1;
        r13.f16803b = r0;	 Catch:{ all -> 0x004d }
        r0 = new dug;	 Catch:{ all -> 0x004d }
        r2 = r13.f16810i;	 Catch:{ all -> 0x004d }
        r3 = r13.f16811j;	 Catch:{ all -> 0x004d }
        r0.<init>(r13, r2, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        goto L_0x0039;
    L_0x004d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        throw r0;
    L_0x0050:
        monitor-exit(r1);	 Catch:{ all -> 0x004d }
        r3 = r13.f16806e;
        monitor-enter(r3);
        r0 = r13.f16812k;	 Catch:{ all -> 0x0106 }
        r1 = "Must start loop before invoking startCapture.";
        p000.jri.m13391a(r0, r1);	 Catch:{ all -> 0x0106 }
        r4 = r13.f16805d;	 Catch:{ all -> 0x0106 }
        r5 = r13.f16812k;	 Catch:{ all -> 0x0106 }
        r0 = r4.f3514a;	 Catch:{ all -> 0x0106 }
        r1 = 1;
        r6 = r0.mo6850a(r1);	 Catch:{ all -> 0x0106 }
        r2 = 0;
        r0 = r2;
    L_0x0068:
        r1 = 10;
        if (r0 >= r1) goto L_0x00f3;
    L_0x006c:
        r2 = r0 + 1;
        r1 = new fwn;	 Catch:{ all -> 0x00ff }
        r1.<init>();	 Catch:{ all -> 0x00ff }
        r0 = new fio;	 Catch:{ all -> 0x00ff }
        r0.<init>(r15);	 Catch:{ all -> 0x00ff }
        r0.mo6810a(r6);	 Catch:{ all -> 0x00ff }
        r0.mo6813a(r1);	 Catch:{ all -> 0x00ff }
        r0 = r0.mo6807a();	 Catch:{ all -> 0x00ff }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ all -> 0x00ff }
        r7 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x00ff }
        r14.mo6816a(r0, r7);	 Catch:{ all -> 0x00ff }
        r0 = r6.mo12344a();	 Catch:{ all -> 0x00ff }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x00ff }
        r1 = r1.f18837a;	 Catch:{ ExecutionException -> 0x0161 }
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x0161 }
        r1 = (p000.iwp) r1;	 Catch:{ ExecutionException -> 0x0161 }
        if (r0 == 0) goto L_0x00e1;
    L_0x009b:
        r8 = r0.mo13744f();	 Catch:{ ExecutionException -> 0x0161 }
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r1.mo13730a(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r7 = p000.kbf.m16778b(r7, r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r0.mo13744f();	 Catch:{ ExecutionException -> 0x0161 }
        r10 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;	 Catch:{ ExecutionException -> 0x0161 }
        r10 = r1.mo13730a(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = java.lang.String.valueOf(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = r11.length();	 Catch:{ ExecutionException -> 0x0161 }
        r11 = r11 + 105;
        r12 = new java.lang.StringBuilder;	 Catch:{ ExecutionException -> 0x0161 }
        r12.<init>(r11);	 Catch:{ ExecutionException -> 0x0161 }
        r11 = "Raw smart metering image and metadata have differenttimestamps: image = ";
        r12.append(r11);	 Catch:{ ExecutionException -> 0x0161 }
        r12.append(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = ", metadata = ";
        r12.append(r8);	 Catch:{ ExecutionException -> 0x0161 }
        r12.append(r10);	 Catch:{ ExecutionException -> 0x0161 }
        r8 = r12.toString();	 Catch:{ ExecutionException -> 0x0161 }
        p000.jri.m13406b(r7, r8);	 Catch:{ ExecutionException -> 0x0161 }
    L_0x00e1:
        r8 = r1.mo13731b();	 Catch:{ ExecutionException -> 0x0161 }
        r7 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r7 <= 0) goto L_0x0142;
    L_0x00e9:
        r7 = p000.fxq.m2465a(r1);	 Catch:{ ExecutionException -> 0x0161 }
        if (r7 == 0) goto L_0x0142;
    L_0x00ef:
        r5.mo13057a(r0, r1);	 Catch:{ ExecutionException -> 0x0161 }
        r0 = r2;
    L_0x00f3:
        r1 = 10;
        if (r0 < r1) goto L_0x0109;
    L_0x00f7:
        r0 = new isr;	 Catch:{ all -> 0x00ff }
        r1 = "Unable to acquire a valid frame after 10 attempts!!!";
        r0.<init>(r1);	 Catch:{ all -> 0x00ff }
        throw r0;	 Catch:{ all -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
    L_0x0101:
        r1 = move-exception;
        r6.close();	 Catch:{ all -> 0x017e }
    L_0x0105:
        throw r1;	 Catch:{ all -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0106 }
        throw r0;
    L_0x0109:
        r6.close();	 Catch:{ all -> 0x0106 }
        r0 = r13.f16812k;	 Catch:{ all -> 0x0106 }
        r0 = r0.mo13058c();	 Catch:{ all -> 0x0106 }
        r0 = r0.mo9715b();	 Catch:{ all -> 0x0106 }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x0106 }
        monitor-exit(r3);	 Catch:{ all -> 0x0106 }
        r3 = r13.f16802a;
        monitor-enter(r3);
        r13.m9565f();	 Catch:{ all -> 0x0178 }
        r1 = r13.f16803b;	 Catch:{ all -> 0x0178 }
        r1 = r1 + 1;
        r13.f16803b = r1;	 Catch:{ all -> 0x0178 }
        r1 = r0.first;	 Catch:{ all -> 0x0178 }
        r1 = (com.google.googlex.gcam.AeResults) r1;	 Catch:{ all -> 0x0178 }
        r13.f16810i = r1;	 Catch:{ all -> 0x0178 }
        r1 = r0.second;	 Catch:{ all -> 0x0178 }
        r1 = (p000.iwp) r1;	 Catch:{ all -> 0x0178 }
        r13.f16811j = r1;	 Catch:{ all -> 0x0178 }
        r2 = new dug;	 Catch:{ all -> 0x0178 }
        r1 = r0.first;	 Catch:{ all -> 0x0178 }
        r1 = (com.google.googlex.gcam.AeResults) r1;	 Catch:{ all -> 0x0178 }
        r0 = r0.second;	 Catch:{ all -> 0x0178 }
        r0 = (p000.iwp) r0;	 Catch:{ all -> 0x0178 }
        r2.<init>(r13, r1, r0);	 Catch:{ all -> 0x0178 }
        monitor-exit(r3);	 Catch:{ all -> 0x0178 }
        r0 = r2;
        goto L_0x0039;
    L_0x0142:
        r1 = r4.f3518e;	 Catch:{ ExecutionException -> 0x0161 }
        r7 = "skipping smart metering frame due to touch to expose / focus";
        r1.mo8837e(r7);	 Catch:{ ExecutionException -> 0x0161 }
        if (r0 == 0) goto L_0x0151;
    L_0x014b:
        r0.close();	 Catch:{ all -> 0x00ff }
        r0 = r2;
        goto L_0x0068;
    L_0x0151:
        r0 = r2;
        goto L_0x0068;
    L_0x0154:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        throw r0;
    L_0x0157:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        throw r0;
    L_0x015a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0161:
        r1 = move-exception;
        r1 = r4.f3518e;	 Catch:{ all -> 0x0171 }
        r7 = "Metadata never arrived for metering frame";
        r1.mo8838f(r7);	 Catch:{ all -> 0x0171 }
        if (r0 == 0) goto L_0x017b;
    L_0x016b:
        r0.close();	 Catch:{ all -> 0x00ff }
        r0 = r2;
        goto L_0x0068;
    L_0x0171:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0177;
    L_0x0174:
        r0.close();	 Catch:{ all -> 0x00ff }
    L_0x0177:
        throw r1;	 Catch:{ all -> 0x00ff }
    L_0x0178:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0178 }
        throw r0;
    L_0x017b:
        r0 = r2;
        goto L_0x0068;
    L_0x017e:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);	 Catch:{ all -> 0x0106 }
        goto L_0x0105;
        */
        throw new UnsupportedOperationException("Method not decompiled: duh.a(fip, fio, long):dug");
    }

    /* renamed from: d */
    final void mo13053d() {
        kpk a;
        ikb ikb = new ikb();
        synchronized (this.f16806e) {
            this.f16812k = this.f16804c;
            dui dui = this.f16805d;
            Object duk = new duk(dui, this.f16812k);
            ikb.mo8557a(new duj(dui.f3519f.mo6772a(duk)));
            a = kow.m13876a(duk.f16816a);
        }
        synchronized (this.f16802a) {
            if (this.f16807f) {
                ikb.close();
                return;
            }
            this.f16813l = ikb;
            this.f16814m = a;
        }
    }

    /* JADX WARNING: Missing block: B:14:?, code:
            return;
     */
    /* renamed from: e */
    final void mo13054e() {
        /*
        r2 = this;
        r1 = r2.f16802a;
        monitor-enter(r1);
        r0 = r2.f16807f;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f16813l;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
    L_0x000d:
        r0.close();	 Catch:{ all -> 0x0018 }
        r0 = 0;
        r2.f16813l = r0;	 Catch:{ all -> 0x0018 }
        r0 = 0;
        r2.f16814m = r0;	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x0008;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: duh.e():void");
    }

    /* renamed from: f */
    private final void m9565f() {
        if (this.f16807f) {
            throw new isr("SmartMeteringController already closed");
        }
    }
}
