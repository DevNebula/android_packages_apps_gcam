package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: irh */
public final class irh {
    /* renamed from: a */
    public final ire f7714a;
    /* renamed from: b */
    public final irq f7715b;
    /* renamed from: c */
    public final ise f7716c;
    /* renamed from: d */
    public final Object f7717d = new Object();
    /* renamed from: e */
    public final iqz f7718e;
    /* renamed from: f */
    public iur f7719f;
    /* renamed from: g */
    public isn f7720g;
    /* renamed from: h */
    public iur f7721h;
    /* renamed from: i */
    public irx f7722i;
    /* renamed from: j */
    public irl f7723j;
    /* renamed from: k */
    public boolean f7724k = false;
    /* renamed from: l */
    private final Handler f7725l;
    /* renamed from: m */
    private final isq f7726m;
    /* renamed from: n */
    private final ird f7727n;
    /* renamed from: o */
    private boolean f7728o = false;

    irh(irq irq, Handler handler, isq isq, ire ire, ise ise, ird ird, iqz iqz) {
        this.f7715b = irq;
        this.f7725l = handler;
        this.f7726m = isq;
        this.f7714a = ire;
        this.f7716c = ise;
        this.f7727n = ird;
        this.f7718e = iqz.mo8830a("CameraDeviceMgr");
    }

    /* renamed from: c */
    private final void m4136c() {
        synchronized (this.f7717d) {
            if (!this.f7728o) {
                this.f7728o = true;
                this.f7725l.post(new isj(this));
            }
        }
    }

    /* renamed from: a */
    final void mo8866a() {
        iqo iqo;
        iqo iqo2;
        synchronized (this.f7717d) {
            iqo = this.f7722i;
            iqo2 = this.f7723j;
            this.f7723j = null;
            this.f7722i = null;
            this.f7721h = null;
            this.f7728o = false;
        }
        if (iqo != null) {
            iqo.close();
        }
        if (iqo2 != null) {
            iqo2.close();
        }
    }

    /* renamed from: a */
    public final void mo8869a(boolean z) {
        iur iur;
        synchronized (this.f7717d) {
            iur = this.f7721h;
            this.f7719f = null;
            this.f7721h = null;
            iri iri = this.f7720g;
            if (iri != null) {
                irx irx = this.f7722i;
                if (irx != null) {
                    irx.mo13707b(iri);
                }
                m4135a(iri);
            }
        }
        iqz iqz;
        String str;
        StringBuilder stringBuilder;
        if (z) {
            if (iur != null) {
                iqz = this.f7718e;
                str = iur.f7848b;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
                stringBuilder.append("Disconnecting camera ");
                stringBuilder.append(str);
                stringBuilder.append(" synchronously.");
                iqz.mo8836d(stringBuilder.toString());
            }
            synchronized (this.f7717d) {
                if (!this.f7728o) {
                    this.f7728o = true;
                    mo8866a();
                    mo8870b();
                }
            }
            return;
        }
        if (iur != null) {
            iqz = this.f7718e;
            str = iur.f7848b;
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
            stringBuilder.append("Disconnecting camera ");
            stringBuilder.append(str);
            stringBuilder.append(" asynchronously.");
            iqz.mo8836d(stringBuilder.toString());
        }
        m4136c();
    }

    /* renamed from: a */
    private final void m4135a(iri iri) {
        Handler handler = this.f7725l;
        iri.getClass();
        handler.post(new ish(iri));
    }

    /* JADX WARNING: Missing block: B:33:0x00c5, code:
            mo8870b();
     */
    /* JADX WARNING: Missing block: B:42:?, code:
            return;
     */
    /* renamed from: a */
    final void mo8868a(p000.iur r6, boolean r7, int r8) {
        /*
        r5 = this;
        r1 = r5.f7717d;
        monitor-enter(r1);
        r0 = r5.f7721h;	 Catch:{ all -> 0x00c9 }
        r2 = r5.f7719f;	 Catch:{ all -> 0x00c9 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c9 }
        r5.mo8866a();
        r1 = r5.f7717d;
        monitor-enter(r1);
        r3 = r5.f7714a;	 Catch:{ all -> 0x008b }
        r3.mo8860a(r6);	 Catch:{ all -> 0x008b }
        r3 = r5.f7716c;	 Catch:{ all -> 0x008b }
        r3 = r3.mo8942c();	 Catch:{ all -> 0x008b }
        if (r3 != 0) goto L_0x00c4;
    L_0x001b:
        if (r0 == 0) goto L_0x00c4;
    L_0x001d:
        r0 = r0.equals(r6);	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x00c4;
    L_0x0023:
        if (r2 == 0) goto L_0x00c4;
    L_0x0025:
        r0 = r2.equals(r6);	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x00c4;
    L_0x002b:
        r0 = 0;
        r5.f7719f = r0;	 Catch:{ all -> 0x008b }
        r0 = 0;
        r5.f7720g = r0;	 Catch:{ all -> 0x008b }
        if (r7 == 0) goto L_0x008e;
    L_0x0033:
        r0 = -2;
        if (r8 != r0) goto L_0x005f;
    L_0x0036:
        r0 = r5.f7718e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7848b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " disconnected while open.";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo8838f(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
    L_0x005e:
        return;
    L_0x005f:
        r0 = -1;
        if (r8 != r0) goto L_0x008e;
    L_0x0062:
        r0 = r5.f7718e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7848b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 33;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " closed while open.";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo8838f(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        goto L_0x005e;
    L_0x008b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        throw r0;
    L_0x008e:
        r0 = r5.f7718e;	 Catch:{ all -> 0x008b }
        r2 = r6.f7848b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r3 = r3 + 54;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r4.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Camera device ";
        r4.append(r3);	 Catch:{ all -> 0x008b }
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r2 = " failed to open! Error code: ";
        r4.append(r2);	 Catch:{ all -> 0x008b }
        r4.append(r8);	 Catch:{ all -> 0x008b }
        r2 = r4.toString();	 Catch:{ all -> 0x008b }
        r0.mo8834c(r2);	 Catch:{ all -> 0x008b }
        r0 = r5.f7726m;	 Catch:{ all -> 0x008b }
        r2 = new isg;	 Catch:{ all -> 0x008b }
        r2.<init>(r8);	 Catch:{ all -> 0x008b }
        r0.mo8946a(r2);	 Catch:{ all -> 0x008b }
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        goto L_0x005e;
    L_0x00c4:
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        r5.mo8870b();
        goto L_0x005e;
    L_0x00c9:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c9 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: irh.a(iur, boolean, int):void");
    }

    /* JADX WARNING: Missing block: B:24:0x005d, code:
            r6.f7727n.mo8857b();
     */
    /* JADX WARNING: Missing block: B:39:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo8867a(p000.iur r7, p000.iri r8) {
        /*
        r6 = this;
        r0 = r6.f7727n;
        r1 = "CameraDeviceManager#open";
        r0.mo8856a(r1);
        r2 = r6.f7717d;	 Catch:{ all -> 0x00ac }
        monitor-enter(r2);	 Catch:{ all -> 0x00ac }
        r0 = r6.f7716c;	 Catch:{ all -> 0x00a9 }
        r0 = r0.mo8942c();	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = -2;
        r8.mo8872a(r0);	 Catch:{ all -> 0x00a9 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7727n;
        r0.mo8857b();
    L_0x001c:
        return;
    L_0x001d:
        r0 = r6.f7721h;	 Catch:{ all -> 0x00a9 }
        r1 = r6.f7720g;	 Catch:{ all -> 0x00a9 }
        r3 = new isn;	 Catch:{ all -> 0x00a9 }
        r3.<init>();	 Catch:{ all -> 0x00a9 }
        r6.f7720g = r3;	 Catch:{ all -> 0x00a9 }
        r3 = r6.f7720g;	 Catch:{ all -> 0x00a9 }
        r3.mo13706a(r8);	 Catch:{ all -> 0x00a9 }
        r6.f7719f = r7;	 Catch:{ all -> 0x00a9 }
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r3 = r6.f7722i;	 Catch:{ all -> 0x00a9 }
        if (r3 == 0) goto L_0x0038;
    L_0x0035:
        r3.mo13707b(r1);	 Catch:{ all -> 0x00a9 }
    L_0x0038:
        r6.m4135a(r1);	 Catch:{ all -> 0x00a9 }
    L_0x003b:
        if (r0 == 0) goto L_0x0041;
    L_0x003d:
        r1 = r6.f7722i;	 Catch:{ all -> 0x00a9 }
        if (r1 != 0) goto L_0x0068;
    L_0x0041:
        r1 = r6.f7718e;	 Catch:{ all -> 0x00a9 }
        r3 = "Opening camera ";
        r0 = r7.f7848b;	 Catch:{ all -> 0x00a9 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00a9 }
        r4 = r0.length();	 Catch:{ all -> 0x00a9 }
        if (r4 != 0) goto L_0x0063;
    L_0x0051:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00a9 }
        r0.<init>(r3);	 Catch:{ all -> 0x00a9 }
    L_0x0056:
        r1.mo8836d(r0);	 Catch:{ all -> 0x00a9 }
        r6.mo8870b();	 Catch:{ all -> 0x00a9 }
    L_0x005c:
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7727n;
        r0.mo8857b();
        goto L_0x001c;
    L_0x0063:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x00a9 }
        goto L_0x0056;
    L_0x0068:
        r1 = r0.equals(r7);	 Catch:{ all -> 0x00a9 }
        if (r1 == 0) goto L_0x00b3;
    L_0x006e:
        r0 = r6.f7718e;	 Catch:{ all -> 0x00a9 }
        r1 = r7.f7848b;	 Catch:{ all -> 0x00a9 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00a9 }
        r3 = r3.length();	 Catch:{ all -> 0x00a9 }
        r3 = r3 + 52;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r4.<init>(r3);	 Catch:{ all -> 0x00a9 }
        r3 = "Opening camera ";
        r4.append(r3);	 Catch:{ all -> 0x00a9 }
        r4.append(r1);	 Catch:{ all -> 0x00a9 }
        r1 = " and disconnectiong previous listener";
        r4.append(r1);	 Catch:{ all -> 0x00a9 }
        r1 = r4.toString();	 Catch:{ all -> 0x00a9 }
        r0.mo8836d(r1);	 Catch:{ all -> 0x00a9 }
        r0 = r6.f7722i;	 Catch:{ all -> 0x00a9 }
        r0 = p000.jri.m13404b(r0);	 Catch:{ all -> 0x00a9 }
        r0 = (p000.irx) r0;	 Catch:{ all -> 0x00a9 }
        r1 = r6.f7720g;	 Catch:{ all -> 0x00a9 }
        r1 = p000.jri.m13404b(r1);	 Catch:{ all -> 0x00a9 }
        r1 = (p000.iri) r1;	 Catch:{ all -> 0x00a9 }
        r0.mo13706a(r1);	 Catch:{ all -> 0x00a9 }
        goto L_0x005c;
    L_0x00a9:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        throw r0;	 Catch:{ all -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        r1 = r6.f7727n;
        r1.mo8857b();
        throw r0;
    L_0x00b3:
        r1 = r6.f7718e;	 Catch:{ all -> 0x00a9 }
        r3 = r7.f7848b;	 Catch:{ all -> 0x00a9 }
        r0 = r0.f7848b;	 Catch:{ all -> 0x00a9 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00a9 }
        r4 = r4.length();	 Catch:{ all -> 0x00a9 }
        r4 = r4 + 35;
        r5 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00a9 }
        r5 = r5.length();	 Catch:{ all -> 0x00a9 }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a9 }
        r5.<init>(r4);	 Catch:{ all -> 0x00a9 }
        r4 = "Opening camera ";
        r5.append(r4);	 Catch:{ all -> 0x00a9 }
        r5.append(r3);	 Catch:{ all -> 0x00a9 }
        r3 = " and closing camera ";
        r5.append(r3);	 Catch:{ all -> 0x00a9 }
        r5.append(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r5.toString();	 Catch:{ all -> 0x00a9 }
        r1.mo8836d(r0);	 Catch:{ all -> 0x00a9 }
        r6.m4136c();	 Catch:{ all -> 0x00a9 }
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: irh.a(iur, iri):void");
    }

    /* renamed from: b */
    final void mo8870b() {
        synchronized (this.f7717d) {
            if (!this.f7724k) {
                this.f7724k = true;
                this.f7725l.post(new isi(this));
            }
        }
    }
}
