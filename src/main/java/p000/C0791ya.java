package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ya */
final class C0791ya extends C0596yl {
    /* renamed from: a */
    public final /* synthetic */ aas f22402a;
    /* renamed from: b */
    public final /* synthetic */ aaf f22403b;
    /* renamed from: c */
    public final /* synthetic */ C0788xt f22404c;
    /* renamed from: d */
    private final /* synthetic */ Handler f22405d;

    C0791ya(C0788xt c0788xt, aas aas, Handler handler, aaf aaf) {
        this.f22404c = c0788xt;
        this.f22402a = aas;
        this.f22405d = handler;
        this.f22403b = aaf;
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.f22402a != null) {
            this.f22405d.post(new C0588yb(this));
        }
    }

    /* JADX WARNING: Missing block: B:11:0x002f, code:
            if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:13:?, code:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:15:0x0035, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:16:0x0036, code:
            p000.kqg.m5105a(r0, r1);
     */
    public final void onImageAvailable(android.media.ImageReader r5) {
        /*
        r4 = this;
        r1 = r5.acquireNextImage();
        r0 = r4.f22403b;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0026;
    L_0x0008:
        r0 = r1.getPlanes();	 Catch:{ all -> 0x002c }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ all -> 0x002c }
        r0 = r0.getBuffer();	 Catch:{ all -> 0x002c }
        r2 = r0.remaining();	 Catch:{ all -> 0x002c }
        r2 = new byte[r2];	 Catch:{ all -> 0x002c }
        r0.get(r2);	 Catch:{ all -> 0x002c }
        r0 = r4.f22405d;	 Catch:{ all -> 0x002c }
        r3 = new yc;	 Catch:{ all -> 0x002c }
        r3.<init>(r4, r2);	 Catch:{ all -> 0x002c }
        r0.post(r3);	 Catch:{ all -> 0x002c }
    L_0x0026:
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r1.close();
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        r1.close();	 Catch:{ all -> 0x0035 }
    L_0x0034:
        throw r2;
    L_0x0035:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.onImageAvailable(android.media.ImageReader):void");
    }
}
