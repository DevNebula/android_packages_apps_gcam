package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fqx */
public final class fqx implements fre, iqo {
    /* renamed from: a */
    public final Executor f18667a;
    /* renamed from: b */
    public final hju f18668b;
    /* renamed from: c */
    private final ghf f18669c;
    /* renamed from: d */
    private final fov f18670d;
    /* renamed from: e */
    private final ird f18671e;
    /* renamed from: f */
    private final ilp f18672f;
    /* renamed from: g */
    private final AtomicBoolean f18673g = new AtomicBoolean(false);

    public fqx(Executor executor, hju hju, ird ird) {
        jri.m13404b((Object) executor);
        this.f18667a = executor;
        this.f18672f = new ilb(Integer.valueOf(2));
        this.f18668b = hju;
        this.f18671e = ird;
        this.f18669c = new ghc();
        this.f18670d = new fov(2);
    }

    /* JADX WARNING: Missing block: B:11:?, code:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:28:0x00d2, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:29:0x00d3, code:
            p000.kqg.m5105a(r0, r2);
     */
    /* renamed from: a */
    final byte[] mo13272a(p000.gfw r8, int r9) {
        /*
        r7 = this;
        r0 = r7.f18671e;
        r1 = "allocateAndCompressJpeg";
        r0.mo8856a(r1);
        r0 = r8.f5391f;
        r0 = r0.width();
        r0 = r0 * 3;
        r1 = r8.f5391f;
        r1 = r1.height();
        r2 = r0 * r1;
        r3 = r2 / 2;
        r0 = r7.f18669c;
        r1 = java.lang.Integer.valueOf(r3);
        r4 = r0.mo7126c(r1);
        r0 = r4.mo13354a();	 Catch:{ all -> 0x0049 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x0050;
    L_0x002b:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r2 = 53;
        r1.<init>(r2);	 Catch:{ all -> 0x0049 }
        r2 = "Failed to allocate buffer for JPEG: ";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1.append(r3);	 Catch:{ all -> 0x0049 }
        r2 = " bytes";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1 = r1.toString();	 Catch:{ all -> 0x0049 }
        r0.<init>(r1);	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r1 = move-exception;
        r4.close();	 Catch:{ all -> 0x00d2 }
    L_0x004f:
        throw r1;
    L_0x0050:
        r1 = r8.f5387b;	 Catch:{ all -> 0x0049 }
        r5 = r8.f5391f;	 Catch:{ all -> 0x0049 }
        r1 = com.google.android.libraries.camera.jpegutil.JpegUtilNative.m1381a(r1, r0, r9, r5);	 Catch:{ all -> 0x0049 }
        if (r1 <= r3) goto L_0x00ce;
    L_0x005a:
        r4.close();	 Catch:{ all -> 0x0049 }
        r0 = r7.f18669c;	 Catch:{ all -> 0x0049 }
        r1 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0049 }
        r0.mo7126c(r1);	 Catch:{ all -> 0x0049 }
        r0 = r4.mo13354a();	 Catch:{ all -> 0x0049 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x008c;
    L_0x006e:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r3 = 53;
        r1.<init>(r3);	 Catch:{ all -> 0x0049 }
        r3 = "Failed to allocate buffer for JPEG: ";
        r1.append(r3);	 Catch:{ all -> 0x0049 }
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r2 = " bytes";
        r1.append(r2);	 Catch:{ all -> 0x0049 }
        r1 = r1.toString();	 Catch:{ all -> 0x0049 }
        r0.<init>(r1);	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x008c:
        r1 = r8.f5387b;	 Catch:{ all -> 0x0049 }
        r2 = r8.f5391f;	 Catch:{ all -> 0x0049 }
        r1 = com.google.android.libraries.camera.jpegutil.JpegUtilNative.m1381a(r1, r0, r9, r2);	 Catch:{ all -> 0x0049 }
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x0097:
        if (r0 > 0) goto L_0x00b2;
    L_0x0099:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0049 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r3 = 57;
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        r3 = "Error compressing jpeg: num bytes written was ";
        r2.append(r3);	 Catch:{ all -> 0x0049 }
        r2.append(r0);	 Catch:{ all -> 0x0049 }
        r0 = r2.toString();	 Catch:{ all -> 0x0049 }
        r1.<init>(r0);	 Catch:{ all -> 0x0049 }
        throw r1;	 Catch:{ all -> 0x0049 }
    L_0x00b2:
        r2 = 0;
        r1.position(r2);	 Catch:{ all -> 0x0049 }
        r1.limit(r0);	 Catch:{ all -> 0x0049 }
        r2 = java.nio.ByteOrder.nativeOrder();	 Catch:{ all -> 0x0049 }
        r1.order(r2);	 Catch:{ all -> 0x0049 }
        r0 = new byte[r0];	 Catch:{ all -> 0x0049 }
        r1.get(r0);	 Catch:{ all -> 0x0049 }
        r1 = r7.f18671e;	 Catch:{ all -> 0x0049 }
        r1.mo8857b();	 Catch:{ all -> 0x0049 }
        r4.close();
        return r0;
    L_0x00ce:
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0097;
    L_0x00d2:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fqx.a(gfw, int):byte[]");
    }

    public final void close() {
        if (this.f18673g.compareAndSet(false, true)) {
            this.f18670d.close();
            this.f18672f.mo8826a(Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public final ilp mo6873b() {
        return this.f18672f;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo6872a(Object obj) {
        gfw gfw = (gfw) obj;
        if (gfw.f5387b.mo13741c() == 35) {
            return this.f18670d.mo13265a(new fqy(this, gfw));
        }
        gfw.f5387b.close();
        return kow.m13874a(new isr("Only YUV_420_888 images are supported"));
    }
}
