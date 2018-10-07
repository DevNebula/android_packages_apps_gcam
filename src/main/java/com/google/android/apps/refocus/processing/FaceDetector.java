package com.google.android.apps.refocus.processing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.vision.face.Face;
import p000.bkw;
import p000.bli;

/* compiled from: PG */
public class FaceDetector {
    public static final boolean DEBUG = false;
    public static final int MAX_IMAGE_DIMENSION = 640;
    public static final String TAG = bli.m887a("FaceDetector");
    public final Context context;
    public final bkw gservicesHelper;

    public FaceDetector(Context context, bkw bkw) {
        this.context = context;
        this.gservicesHelper = bkw;
    }

    boolean computeFaceFocus(RGBZ rgbz, FocusSettings focusSettings) {
        bkw bkw = this.gservicesHelper;
        if (!bkw.mo1998a(bkw.f1283a, "camera:refocus_face_enabled", true)) {
            bli.m888a(TAG, "Refocus face detection is disabled.");
            return false;
        } else if (rgbz.hasDepthmap()) {
            Bitmap scaleDown = scaleDown(rgbz.getBitmap(), 640);
            Face findLargestFace = findLargestFace(scaleDown);
            if (findLargestFace == null) {
                return false;
            }
            PointF position = findLargestFace.getPosition();
            focusSettings.focalPointX = position.x / ((float) scaleDown.getWidth());
            focusSettings.focalPointY = position.y / ((float) scaleDown.getHeight());
            focusSettings.focalDistance = rgbz.getDepth((int) (((float) rgbz.getWidth()) * focusSettings.focalPointX), (int) (((float) rgbz.getHeight()) * focusSettings.focalPointY));
            return true;
        } else {
            bli.m898e(TAG, "No depthmap set for supplied rgbz");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    private com.google.android.vision.face.Face findLargestFace(android.graphics.Bitmap r10) {
        /*
        r9 = this;
        r7 = 2;
        r6 = 0;
        r1 = 0;
        r0 = new com.google.android.vision.face.DetectorFactory;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r9.context;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0.<init>(r2);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.getDetectionSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = 0;
        r2.setDetectorType(r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.getDetectionSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = 0;
        r2.setLandmarkDetectorType(r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.getDetectionSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r2.setProportionalMinFaceSize(r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.getDetectionSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = 1;
        r2.setMaxNumFaces(r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0 = r0.mo3668a();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = 1;
        r2.setModelFilesLocation(r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.getClassificationSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = r2.classifyingEyesOpen();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r2.classifyingSmiling();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r4 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r4 = r4.getDetectionSettings();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r5 = r4.getLandmarkDetectorType();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        if (r3 == 0) goto L_0x00b5;
    L_0x0058:
        if (r2 != 0) goto L_0x00b5;
    L_0x005a:
        if (r5 != 0) goto L_0x0060;
    L_0x005c:
        r2 = 2;
        r4.setLandmarkDetectorType(r2);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
    L_0x0060:
        r2 = r0.f2665a;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = com.google.android.vision.face.ModelManager.areApkModelsInstalled(r2, r3);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        if (r2 != 0) goto L_0x0082;
    L_0x006a:
        r0 = new java.lang.IllegalStateException;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = "APK lacks required face model files.  Execute the 'setup_project' script from the SDK to add model files to your app.";
        r0.<init>(r2);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        throw r0;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
    L_0x0072:
        r0 = move-exception;
        r2 = r1;
    L_0x0074:
        r3 = TAG;	 Catch:{ all -> 0x00f9 }
        r4 = "Face detection interrupted.  Skipping face detection.";
        p000.bli.m889a(r3, r4, r0);	 Catch:{ all -> 0x00f9 }
        if (r2 == 0) goto L_0x0080;
    L_0x007d:
        r2.release();
    L_0x0080:
        r0 = r1;
    L_0x0081:
        return r0;
    L_0x0082:
        r2 = new com.google.android.vision.face.Detector;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r3 = r0.f2665a;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0 = r0.f2666b;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2.<init>(r3, r0);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0 = new com.google.android.vision.face.ImmediateDetectorFuture;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0.<init>(r2);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r0 = (com.google.android.vision.face.Detector) r0;	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        r2 = r0.detectFaces(r10);	 Catch:{ InterruptedException -> 0x00ea, ExecutionException -> 0x00ef, IllegalStateException -> 0x00f4, all -> 0x0105 }
        if (r0 == 0) goto L_0x009f;
    L_0x009c:
        r0.release();
    L_0x009f:
        r0 = r2.isEmpty();
        if (r0 == 0) goto L_0x00ae;
    L_0x00a5:
        r0 = TAG;
        r2 = "No face detected.";
        p000.bli.m888a(r0, r2);
        r0 = r1;
        goto L_0x0081;
    L_0x00ae:
        r0 = r2.get(r6);
        r0 = (com.google.android.vision.face.Face) r0;
        goto L_0x0081;
    L_0x00b5:
        if (r2 == 0) goto L_0x0060;
    L_0x00b7:
        if (r5 == 0) goto L_0x00bb;
    L_0x00b9:
        if (r5 != r7) goto L_0x0060;
    L_0x00bb:
        r2 = 1;
        r4.setLandmarkDetectorType(r2);	 Catch:{ InterruptedException -> 0x0072, ExecutionException -> 0x00c0, IllegalStateException -> 0x00d0, all -> 0x00e0 }
        goto L_0x0060;
    L_0x00c0:
        r0 = move-exception;
        r2 = r1;
    L_0x00c2:
        r3 = TAG;	 Catch:{ all -> 0x00fd }
        r4 = "Face detection execution failed.  Skipping face detection.";
        p000.bli.m889a(r3, r4, r0);	 Catch:{ all -> 0x00fd }
        if (r2 == 0) goto L_0x00ce;
    L_0x00cb:
        r2.release();
    L_0x00ce:
        r0 = r1;
        goto L_0x0081;
    L_0x00d0:
        r0 = move-exception;
        r2 = r1;
    L_0x00d2:
        r3 = TAG;	 Catch:{ all -> 0x0101 }
        r4 = "Face models missing.  Skipping face detection.";
        p000.bli.m889a(r3, r4, r0);	 Catch:{ all -> 0x0101 }
        if (r2 == 0) goto L_0x00de;
    L_0x00db:
        r2.release();
    L_0x00de:
        r0 = r1;
        goto L_0x0081;
    L_0x00e0:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
    L_0x00e4:
        if (r0 == 0) goto L_0x00e9;
    L_0x00e6:
        r0.release();
    L_0x00e9:
        throw r1;
    L_0x00ea:
        r2 = move-exception;
        r8 = r0;
        r0 = r2;
        r2 = r8;
        goto L_0x0074;
    L_0x00ef:
        r2 = move-exception;
        r8 = r0;
        r0 = r2;
        r2 = r8;
        goto L_0x00c2;
    L_0x00f4:
        r2 = move-exception;
        r8 = r0;
        r0 = r2;
        r2 = r8;
        goto L_0x00d2;
    L_0x00f9:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00e4;
    L_0x00fd:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00e4;
    L_0x0101:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00e4;
    L_0x0105:
        r1 = move-exception;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.refocus.processing.FaceDetector.findLargestFace(android.graphics.Bitmap):com.google.android.vision.face.Face");
    }

    private Bitmap scaleDown(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (Math.max(width, height) <= i) {
            return bitmap;
        }
        if (width > height) {
            int i2 = (height * i) / width;
            width = i;
            i = i2;
        } else {
            width = (width * i) / height;
        }
        return Bitmap.createScaledBitmap(bitmap, width, i, false);
    }
}
