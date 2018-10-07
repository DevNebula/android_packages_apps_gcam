package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: iyr */
public final class iyr implements Callable {
    /* renamed from: a */
    private final izb f7926a;
    /* renamed from: b */
    private final izb f7927b;
    /* renamed from: c */
    private final izb f7928c;
    /* renamed from: d */
    private final izb f7929d;
    /* renamed from: e */
    private final izb f7930e;
    /* renamed from: f */
    private final int f7931f;
    /* renamed from: g */
    private final long f7932g;
    /* renamed from: h */
    private final AtomicBoolean f7933h = new AtomicBoolean(false);

    /* renamed from: a */
    private static /* synthetic */ void m4401a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
                return;
            } catch (Throwable th2) {
                kqg.m5105a(th, th2);
                return;
            }
        }
        autoCloseable.close();
    }

    iyr(izb izb, izb izb2, izb izb3, izb izb4, izb izb5, int i, long j) {
        this.f7926a = izb;
        this.f7927b = izb2;
        this.f7928c = izb3;
        this.f7929d = izb4;
        this.f7930e = izb5;
        this.f7931f = i;
        this.f7932g = j;
    }

    /* JADX WARNING: Missing block: B:22:0x0093, code:
            if (r9 != null) goto L_0x0095;
     */
    /* JADX WARNING: Missing block: B:24:?, code:
            p000.iyr.m4401a(r0, r9);
     */
    /* JADX WARNING: Missing block: B:30:0x009c, code:
            if (r8 != null) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:32:?, code:
            p000.iyr.m4401a(r0, r8);
     */
    /* JADX WARNING: Missing block: B:38:0x00a5, code:
            if (r7 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Missing block: B:40:?, code:
            p000.iyr.m4401a(r0, r7);
     */
    /* JADX WARNING: Missing block: B:46:0x00ae, code:
            if (r6 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Missing block: B:48:?, code:
            p000.iyr.m4401a(r0, r6);
     */
    /* JADX WARNING: Missing block: B:54:0x00b7, code:
            if (r5 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Missing block: B:55:0x00b9, code:
            p000.iyr.m4401a(r0, r5);
     */
    /* renamed from: a */
    private final java.lang.Void m4400a() {
        /*
        r14 = this;
        r1 = 1;
        r13 = 0;
        r0 = r14.f7933h;
        r0 = r0.getAndSet(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        r0 = new java.lang.IllegalStateException;
        r1 = "Executed command more than once. This is unexpected";
        r0.<init>(r1);
        throw r0;
    L_0x0012:
        r0 = r14.f7929d;
        r0 = r0.mo9210a();
        r0 = (p000.C0556wd) r0;
        r1 = r14.f7928c;
        r1 = r1.mo9210a();
        r1 = (java.lang.Integer) r1;
        r4 = r1.intValue();
        r5 = r14.f7926a;
        r6 = r14.f7927b;	 Catch:{ all -> 0x00b4 }
        r7 = r14.f7930e;	 Catch:{ all -> 0x00ab }
        r8 = r14.f7929d;	 Catch:{ all -> 0x00a2 }
        r9 = r14.f7928c;	 Catch:{ all -> 0x0099 }
        r1 = r14.f7931f;	 Catch:{ all -> 0x0090 }
        r2 = r14.f7932g;	 Catch:{ all -> 0x0090 }
        r10 = p000.C0557we.f9955a;	 Catch:{ all -> 0x0090 }
        r11 = "http://ns.google.com/photos/1.0/camera/";
        r12 = "GCamera";
        r10.mo11459a(r11, r12);	 Catch:{ all -> 0x0090 }
        r10 = "http://ns.google.com/photos/1.0/camera/";
        r11 = "MicroVideo";
        r12 = 1;
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0090 }
        r0.mo11442a(r10, r11, r12);	 Catch:{ all -> 0x0090 }
        r10 = "http://ns.google.com/photos/1.0/camera/";
        r11 = "MicroVideoVersion";
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0090 }
        r0.mo11442a(r10, r11, r1);	 Catch:{ all -> 0x0090 }
        r1 = "http://ns.google.com/photos/1.0/camera/";
        r10 = "MicroVideoOffset";
        r11 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0090 }
        r0.mo11442a(r1, r10, r11);	 Catch:{ all -> 0x0090 }
        r1 = "http://ns.google.com/photos/1.0/camera/";
        r10 = "MicroVideoPresentationTimestampUs";
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0090 }
        r0.mo11442a(r1, r10, r2);	 Catch:{ all -> 0x0090 }
        r1 = r14.f7927b;	 Catch:{ all -> 0x0090 }
        r1 = r1.mo9210a();	 Catch:{ all -> 0x0090 }
        r1 = (java.io.InputStream) r1;	 Catch:{ all -> 0x0090 }
        r2 = r14.f7926a;	 Catch:{ all -> 0x0090 }
        r2 = r2.mo9210a();	 Catch:{ all -> 0x0090 }
        r2 = (java.io.InputStream) r2;	 Catch:{ all -> 0x0090 }
        r3 = r14.f7930e;	 Catch:{ all -> 0x0090 }
        r3 = r3.mo9210a();	 Catch:{ all -> 0x0090 }
        r3 = (java.io.OutputStream) r3;	 Catch:{ all -> 0x0090 }
        r0 = p000.ion.m4013a(r2, r3, r0);	 Catch:{ all -> 0x0090 }
        if (r0 != 0) goto L_0x00bd;
    L_0x0088:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0090 }
        r1 = "Could not embed xmp into JPEG stream.";
        r0.<init>(r1);	 Catch:{ all -> 0x0090 }
        throw r0;	 Catch:{ all -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r1 = move-exception;
        if (r9 == 0) goto L_0x0098;
    L_0x0095:
        p000.iyr.m4401a(r0, r9);	 Catch:{ all -> 0x0099 }
    L_0x0098:
        throw r1;	 Catch:{ all -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009b }
    L_0x009b:
        r1 = move-exception;
        if (r8 == 0) goto L_0x00a1;
    L_0x009e:
        p000.iyr.m4401a(r0, r8);	 Catch:{ all -> 0x00a2 }
    L_0x00a1:
        throw r1;	 Catch:{ all -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a4 }
    L_0x00a4:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00aa;
    L_0x00a7:
        p000.iyr.m4401a(r0, r7);	 Catch:{ all -> 0x00ab }
    L_0x00aa:
        throw r1;	 Catch:{ all -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x00ad:
        r1 = move-exception;
        if (r6 == 0) goto L_0x00b3;
    L_0x00b0:
        p000.iyr.m4401a(r0, r6);	 Catch:{ all -> 0x00b4 }
    L_0x00b3:
        throw r1;	 Catch:{ all -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r1 = move-exception;
        if (r5 == 0) goto L_0x00bc;
    L_0x00b9:
        p000.iyr.m4401a(r0, r5);
    L_0x00bc:
        throw r1;
    L_0x00bd:
        r10 = (long) r4;
        r0 = com.google.common.p006io.ByteStreams.limit(r1, r10);	 Catch:{ all -> 0x0090 }
        com.google.common.p006io.ByteStreams.copy(r0, r3);	 Catch:{ all -> 0x0090 }
        r3.flush();	 Catch:{ all -> 0x0090 }
        if (r9 == 0) goto L_0x00ce;
    L_0x00ca:
        r0 = 0;
        p000.iyr.m4401a(r0, r9);	 Catch:{ all -> 0x0099 }
    L_0x00ce:
        if (r8 == 0) goto L_0x00d4;
    L_0x00d0:
        r0 = 0;
        p000.iyr.m4401a(r0, r8);	 Catch:{ all -> 0x00a2 }
    L_0x00d4:
        if (r7 == 0) goto L_0x00da;
    L_0x00d6:
        r0 = 0;
        p000.iyr.m4401a(r0, r7);	 Catch:{ all -> 0x00ab }
    L_0x00da:
        if (r6 == 0) goto L_0x00e0;
    L_0x00dc:
        r0 = 0;
        p000.iyr.m4401a(r0, r6);	 Catch:{ all -> 0x00b4 }
    L_0x00e0:
        if (r5 == 0) goto L_0x00e5;
    L_0x00e2:
        p000.iyr.m4401a(r13, r5);
    L_0x00e5:
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: iyr.a():java.lang.Void");
    }
}
