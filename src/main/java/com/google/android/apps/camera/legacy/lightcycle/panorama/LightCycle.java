package com.google.android.apps.camera.legacy.lightcycle.panorama;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class LightCycle {
    /* renamed from: a */
    public static Object f2562a = new Object();
    /* renamed from: b */
    public static Boolean f2563b = Boolean.valueOf(false);
    /* renamed from: c */
    public static Map f2564c = new HashMap();
    /* renamed from: d */
    public static LightCycleProgressCallback f2565d = new LightCycleProgressCallback();

    /* compiled from: PG */
    public class LightCycleProgressCallback {
        /* JADX WARNING: Missing block: B:11:0x003b, code:
            r0.f4050c.mo13158a();
     */
        /* JADX WARNING: Missing block: B:19:?, code:
            return;
     */
        public static void onProgress(int r6, int r7) {
            /*
            r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2564c;
            r1 = java.lang.Integer.valueOf(r6);
            r0 = r0.containsKey(r1);
            if (r0 == 0) goto L_0x0024;
        L_0x000c:
            r0 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2564c;
            r0 = r0.get(r1);
            r0 = (p000.ekq) r0;
            r1 = r0.f4050c;
            r1 = r1.f17511b;
            monitor-enter(r1);
            r2 = r0.f4050c;	 Catch:{ all -> 0x004d }
            r2 = r2.f17511b;	 Catch:{ all -> 0x004d }
            r2 = r2.get();	 Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0025;
        L_0x0023:
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
        L_0x0024:
            return;
        L_0x0025:
            r2 = r0.f4050c;	 Catch:{ all -> 0x004d }
            r2 = r2.f17510a;	 Catch:{ all -> 0x004d }
            r2 = r2.f4165b;	 Catch:{ all -> 0x004d }
            r2.mo13374b(r7);	 Catch:{ all -> 0x004d }
            r2 = r0.f4049b;	 Catch:{ all -> 0x004d }
            r2 = r2.length();	 Catch:{ all -> 0x004d }
            r4 = r0.f4048a;	 Catch:{ all -> 0x004d }
            r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r4 != 0) goto L_0x0041;
        L_0x003a:
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
            r0 = r0.f4050c;
            r0.mo13158a();
            goto L_0x0024;
        L_0x0041:
            r4 = r0.f4050c;	 Catch:{ all -> 0x004d }
            r4 = r4.f17510a;	 Catch:{ all -> 0x004d }
            r4 = r4.f4165b;	 Catch:{ all -> 0x004d }
            r4.mo13387p();	 Catch:{ all -> 0x004d }
            r0.f4048a = r2;	 Catch:{ all -> 0x004d }
            goto L_0x003a;
        L_0x004d:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x004d }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.LightCycleProgressCallback.onProgress(int, int):void");
        }
    }

    /* renamed from: a */
    public static String m1317a(float[] fArr) {
        String AddImage;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                AddImage = LightCycleNative.AddImage(fArr);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return AddImage;
    }

    /* renamed from: a */
    public static void m1318a() {
        LightCycleNative.AlignNextImage();
    }

    /* renamed from: a */
    public static float m1316a(String str) {
        return LightCycleNative.CalibrateFieldOfViewDeg(str);
    }

    /* renamed from: b */
    public static boolean m1327b() {
        return LightCycleNative.CanUndo();
    }

    /* renamed from: a */
    public static void m1320a(int i) {
        LightCycleNative.CreateFrameTexture(i);
    }

    /* renamed from: c */
    public static int m1330c() {
        return LightCycleNative.CreateNewStitchingSession();
    }

    /* renamed from: d */
    public static int m1333d() {
        int DeviceOrientationStatus;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                DeviceOrientationStatus = LightCycleNative.DeviceOrientationStatus();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return DeviceOrientationStatus;
    }

    /* renamed from: a */
    public static float[] m1325a(float[] fArr, int i, int i2) {
        return LightCycleNative.EndGyroCalibration(fArr, i, i2);
    }

    /* renamed from: e */
    public static float[] m1334e() {
        float[] GetFrameGeometry;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                GetFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return GetFrameGeometry;
    }

    /* renamed from: f */
    public static int m1335f() {
        return LightCycleNative.GetNumCapturedTargets();
    }

    /* renamed from: g */
    public static int m1336g() {
        return LightCycleNative.GetNumTotalTargets();
    }

    /* renamed from: h */
    public static int m1337h() {
        return LightCycleNative.GetTargetInRange();
    }

    /* renamed from: i */
    public static NewTarget[] m1338i() {
        NewTarget[] GetTargets;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                GetTargets = LightCycleNative.GetTargets();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return GetTargets;
    }

    /* renamed from: a */
    public static void m1321a(int i, int i2, int i3) {
        LightCycleNative.InitFrameTexture(i, i2, i3);
    }

    /* renamed from: b */
    public static NewTarget[] m1329b(float[] fArr) {
        NewTarget[] InitTargets;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                InitTargets = LightCycleNative.InitTargets(fArr);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return InitTargets;
    }

    /* renamed from: j */
    public static boolean m1339j() {
        boolean booleanValue;
        synchronized (f2562a) {
            booleanValue = f2563b.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: k */
    public static boolean m1340k() {
        return LightCycleNative.MovingTooFast();
    }

    /* renamed from: l */
    public static boolean m1341l() {
        return LightCycleNative.PhotoSkippedTooFast();
    }

    /* renamed from: a */
    public static float[] m1324a(byte[] bArr, int i, int i2, boolean z) {
        float[] ProcessFrame;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                ProcessFrame = LightCycleNative.ProcessFrame(bArr, i, i2, z);
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return ProcessFrame;
    }

    /* renamed from: b */
    public static boolean m1328b(int i) {
        return LightCycleNative.RenderNextSession(i);
    }

    /* renamed from: a */
    public static void m1322a(String str, float f) {
        synchronized (f2562a) {
            LightCycleNative.ResetForPhotoSphereCapture(str, f);
            f2563b = Boolean.valueOf(true);
        }
    }

    /* renamed from: m */
    public static void m1342m() {
        LightCycleNative.ResetTargets();
    }

    /* renamed from: b */
    public static void m1326b(String str) {
        LightCycleNative.SetAppVersion(str);
    }

    /* renamed from: c */
    public static void m1332c(float[] fArr) {
        LightCycleNative.SetFilteredRotation(fArr);
    }

    /* renamed from: n */
    public static void m1343n() {
        LightCycleNative.SetOutputResolutionLarge();
    }

    /* renamed from: o */
    public static void m1344o() {
        LightCycleNative.SetOutputResolutionLarge();
    }

    /* renamed from: p */
    public static void m1345p() {
        LightCycleNative.SetOutputResolutionSmall();
    }

    /* renamed from: a */
    public static void m1323a(boolean z) {
        LightCycleNative.SetSensorMovementTooFast(z);
    }

    /* renamed from: a */
    public static void m1319a(float f) {
        LightCycleNative.StartGyroCalibration(f);
    }

    /* renamed from: q */
    public static boolean m1346q() {
        return LightCycleNative.TakeNewPhoto();
    }

    /* renamed from: r */
    public static boolean m1347r() {
        return LightCycleNative.TargetHit();
    }

    /* renamed from: s */
    public static boolean m1348s() {
        boolean UndoAddImage;
        synchronized (f2562a) {
            if (f2563b.booleanValue()) {
                UndoAddImage = LightCycleNative.UndoAddImage();
            } else {
                throw new IllegalStateException("State is not ready.");
            }
        }
        return UndoAddImage;
    }

    /* renamed from: c */
    public static void m1331c(int i) {
        LightCycleNative.UpdateFrameTexture(i);
    }
}
