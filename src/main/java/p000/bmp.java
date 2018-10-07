package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bmp */
public final class bmp {
    /* renamed from: a */
    public final Object f1347a = new Object();
    /* renamed from: b */
    public kpw f1348b;
    /* renamed from: c */
    private final CameraManager f1349c;
    /* renamed from: d */
    private final irs f1350d;
    /* renamed from: e */
    private final Executor f1351e;

    public bmp(CameraManager cameraManager, irs irs, Executor executor) {
        this.f1349c = cameraManager;
        this.f1350d = irs;
        this.f1351e = executor;
    }

    /* renamed from: a */
    public final kpk mo2029a() {
        try {
            String[] cameraIdList = this.f1349c.getCameraIdList();
            if (cameraIdList != null && cameraIdList.length > 0) {
                return kow.m13873a(Boolean.valueOf(true));
            }
        } catch (CameraAccessException e) {
        }
        return m914c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* renamed from: b */
    final boolean mo2030b() {
        /*
        r9 = this;
        r1 = 0;
        r2 = 0;
        r0 = "CamDeviceVerify";
        r3 = "Attempting to reconnect to the camera service with a 7000ms timeout in 200ms increments.";
        android.util.Log.w(r0, r3);
        r3 = new java.util.concurrent.atomic.AtomicBoolean;
        r3.<init>(r2);
        r4 = new ikb;	 Catch:{ CameraAccessException -> 0x00d7, InterruptedException -> 0x00d5, all -> 0x00a6 }
        r4.<init>();	 Catch:{ CameraAccessException -> 0x00d7, InterruptedException -> 0x00d5, all -> 0x00a6 }
        r0 = new bmr;	 Catch:{ all -> 0x00b2 }
        r0.<init>(r3);	 Catch:{ all -> 0x00b2 }
        r1 = r9.f1349c;	 Catch:{ all -> 0x00d3 }
        r5 = "PollUntilReconnect";
        r5 = p000.ijy.m3846a(r4, r5);	 Catch:{ all -> 0x00d3 }
        r1.registerAvailabilityCallback(r0, r5);	 Catch:{ all -> 0x00d3 }
        r1 = r2;
    L_0x0024:
        r5 = 35;
        if (r1 >= r5) goto L_0x0074;
    L_0x0028:
        r5 = r9.f1349c;	 Catch:{ all -> 0x00d3 }
        r5 = r5.getCameraIdList();	 Catch:{ all -> 0x00d3 }
        if (r5 == 0) goto L_0x006b;
    L_0x0030:
        r5 = r5.length;	 Catch:{ all -> 0x00d3 }
        if (r5 <= 0) goto L_0x006b;
    L_0x0033:
        r5 = r3.get();	 Catch:{ all -> 0x00d3 }
        if (r5 == 0) goto L_0x006b;
    L_0x0039:
        r3 = "CamDeviceVerify";
        r1 = r1 + 1;
        r1 = r1 * 200;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d3 }
        r6 = 69;
        r5.<init>(r6);	 Catch:{ all -> 0x00d3 }
        r6 = "Camera Manager reconnect attempted and succeeded after ~";
        r5.append(r6);	 Catch:{ all -> 0x00d3 }
        r5.append(r1);	 Catch:{ all -> 0x00d3 }
        r1 = "ms";
        r5.append(r1);	 Catch:{ all -> 0x00d3 }
        r1 = r5.toString();	 Catch:{ all -> 0x00d3 }
        android.util.Log.w(r3, r1);	 Catch:{ all -> 0x00d3 }
        r1 = r9.f1350d;	 Catch:{ all -> 0x00d3 }
        r3 = p000.irt.SUCCESS;	 Catch:{ all -> 0x00d3 }
        r1.mo8894a(r3);	 Catch:{ all -> 0x00d3 }
        r4.close();	 Catch:{ CameraAccessException -> 0x00d1, InterruptedException -> 0x008c, all -> 0x00cf }
        r1 = r9.f1349c;
        r1.unregisterAvailabilityCallback(r0);
        r0 = 1;
    L_0x006a:
        return r0;
    L_0x006b:
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r5 = 0;
        java.lang.Thread.sleep(r6, r5);	 Catch:{ all -> 0x00d3 }
        r1 = r1 + 1;
        goto L_0x0024;
    L_0x0074:
        r1 = "CamDeviceVerify";
        r3 = "Camera Manager reconnect failed, or there are no cameras on this device.";
        android.util.Log.e(r1, r3);	 Catch:{ all -> 0x00d3 }
        r1 = r9.f1350d;	 Catch:{ all -> 0x00d3 }
        r3 = p000.irt.FAIL_TIMEOUT;	 Catch:{ all -> 0x00d3 }
        r1.mo8894a(r3);	 Catch:{ all -> 0x00d3 }
        r4.close();	 Catch:{ CameraAccessException -> 0x00d1, InterruptedException -> 0x008c, all -> 0x00cf }
        r1 = r9.f1349c;
        r1.unregisterAvailabilityCallback(r0);
    L_0x008a:
        r0 = r2;
        goto L_0x006a;
    L_0x008c:
        r1 = move-exception;
    L_0x008d:
        r8 = r0;
        r0 = r1;
        r1 = r8;
    L_0x0090:
        r3 = "CamDeviceVerify";
        r4 = "Camera Manager reconnect failed, or there are no cameras on this device.";
        android.util.Log.e(r3, r4, r0);	 Catch:{ all -> 0x00c1 }
        r0 = r9.f1350d;	 Catch:{ all -> 0x00c1 }
        r3 = p000.irt.FAIL_EXCEPTION;	 Catch:{ all -> 0x00c1 }
        r0.mo8894a(r3);	 Catch:{ all -> 0x00c1 }
        if (r1 == 0) goto L_0x008a;
    L_0x00a0:
        r0 = r9.f1349c;
        r0.unregisterAvailabilityCallback(r1);
        goto L_0x008a;
    L_0x00a6:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x00aa:
        if (r0 == 0) goto L_0x00b1;
    L_0x00ac:
        r2 = r9.f1349c;
        r2.unregisterAvailabilityCallback(r0);
    L_0x00b1:
        throw r1;
    L_0x00b2:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x00b6:
        throw r1;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r3 = move-exception;
        r4.close();	 Catch:{ all -> 0x00c6 }
    L_0x00bb:
        throw r3;	 Catch:{ CameraAccessException -> 0x00bc, InterruptedException -> 0x00cb, all -> 0x00cd }
    L_0x00bc:
        r1 = move-exception;
    L_0x00bd:
        r8 = r0;
        r0 = r1;
        r1 = r8;
        goto L_0x0090;
    L_0x00c1:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x00aa;
    L_0x00c6:
        r4 = move-exception;
        p000.kqg.m5105a(r1, r4);	 Catch:{ CameraAccessException -> 0x00bc, InterruptedException -> 0x00cb, all -> 0x00cd }
        goto L_0x00bb;
    L_0x00cb:
        r1 = move-exception;
        goto L_0x00bd;
    L_0x00cd:
        r1 = move-exception;
        goto L_0x00aa;
    L_0x00cf:
        r1 = move-exception;
        goto L_0x00aa;
    L_0x00d1:
        r1 = move-exception;
        goto L_0x008d;
    L_0x00d3:
        r1 = move-exception;
        goto L_0x00b6;
    L_0x00d5:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00d7:
        r0 = move-exception;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: bmp.b():boolean");
    }

    /* renamed from: c */
    private final kpk m914c() {
        Object obj;
        kpk kpk;
        synchronized (this.f1347a) {
            if (this.f1348b == null) {
                this.f1348b = kpw.m18486d();
                obj = 1;
            } else {
                obj = null;
            }
            kpk = this.f1348b;
        }
        if (obj != null) {
            this.f1351e.execute(new bmq(this));
        }
        return kpk;
    }
}
