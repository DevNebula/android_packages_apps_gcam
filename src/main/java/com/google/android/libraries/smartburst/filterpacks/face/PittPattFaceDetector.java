package com.google.android.libraries.smartburst.filterpacks.face;

import android.content.Context;
import com.google.android.vision.face.Detector;
import com.google.android.vision.face.Detector.ClassificationSettings;
import com.google.android.vision.face.Detector.DetectionSettings;
import com.google.android.vision.face.DetectorFactory;
import com.google.android.vision.face.ImmediateDetectorFuture;
import com.google.android.vision.face.ModelManager;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p000.jri;

/* compiled from: PG */
public class PittPattFaceDetector {
    public static final boolean DEBUG = false;
    public static final float FACE_DETECTION_CONFIDENCE_THRESHOLD = 0.75f;
    public static final String TAG = "PittPattFaceDetector";
    public final boolean mClassifyEyesOpen;
    public final boolean mClassifySmiling;
    public Detector mDetector = null;
    public final boolean mEnableTracking;
    public final int mFastDetectorAggressiveness;
    public int mImageHeight;
    public int mImageWidth;
    public final int mMinEyeDistance;

    public PittPattFaceDetector(boolean z, boolean z2, boolean z3, int i, int i2) {
        boolean z4 = false;
        if (i2 >= 0 && i2 <= 4) {
            z4 = true;
        }
        jri.m13395a(z4);
        this.mEnableTracking = z;
        this.mClassifyEyesOpen = z3;
        this.mClassifySmiling = z2;
        this.mMinEyeDistance = i;
        this.mFastDetectorAggressiveness = i2;
    }

    private Detector configureAndCreateDetector(Context context) {
        DetectorFactory detectorFactory = new DetectorFactory(context);
        detectorFactory.f2666b.getClassificationSettings().setClassifyEyesOpen(this.mClassifyEyesOpen);
        detectorFactory.f2666b.getClassificationSettings().setClassifySmiling(this.mClassifySmiling);
        detectorFactory.f2666b.getTrackingSettings().setEnabled(this.mEnableTracking);
        detectorFactory = detectorFactory.mo3668a();
        detectorFactory.f2666b.getDetectionSettings().setMinEyeDistancePixels(this.mMinEyeDistance);
        detectorFactory.f2666b.getDetectionSettings().setFastDetectorAggressiveness(this.mFastDetectorAggressiveness);
        detectorFactory.f2666b.setModelFilesLocation(1);
        ClassificationSettings classificationSettings = detectorFactory.f2666b.getClassificationSettings();
        boolean classifyingEyesOpen = classificationSettings.classifyingEyesOpen();
        boolean classifyingSmiling = classificationSettings.classifyingSmiling();
        DetectionSettings detectionSettings = detectorFactory.f2666b.getDetectionSettings();
        int landmarkDetectorType = detectionSettings.getLandmarkDetectorType();
        if (!classifyingEyesOpen || classifyingSmiling) {
            if (classifyingSmiling && (landmarkDetectorType == 0 || landmarkDetectorType == 2)) {
                detectionSettings.setLandmarkDetectorType(1);
            }
        } else if (landmarkDetectorType == 0) {
            detectionSettings.setLandmarkDetectorType(2);
        }
        if (ModelManager.areApkModelsInstalled(detectorFactory.f2665a, detectorFactory.f2666b)) {
            return (Detector) new ImmediateDetectorFuture(new Detector(detectorFactory.f2665a, detectorFactory.f2666b)).get();
        }
        throw new IllegalStateException("APK lacks required face model files.  Execute the 'setup_project' script from the SDK to add model files to your app.");
    }

    public List detectFaces(Context context, ByteBuffer byteBuffer, int i, int i2) {
        reinitializeDetectorIfSizeChanged(context, i, i2);
        Detector detector = this.mDetector;
        if (detector != null) {
            return detector.detectFaces(byteBuffer, this.mImageWidth, this.mImageHeight);
        }
        return Collections.emptyList();
    }

    public synchronized void dispose() {
        Detector detector = this.mDetector;
        if (detector != null) {
            detector.release();
            this.mDetector = null;
        }
    }

    private synchronized void reinitializeDetectorIfSizeChanged(Context context, int i, int i2) {
        Throwable e;
        if (!(this.mImageWidth == i && this.mImageHeight == i2)) {
            Detector detector = this.mDetector;
            if (detector != null) {
                detector.release();
            }
            try {
                this.mDetector = configureAndCreateDetector(context.getApplicationContext());
                this.mImageWidth = i;
                this.mImageHeight = i2;
            } catch (ExecutionException e2) {
                e = e2;
                throw new RuntimeException("Could not initialize face detector!", e);
            } catch (InterruptedException e3) {
                e = e3;
                throw new RuntimeException("Could not initialize face detector!", e);
            }
        }
    }
}
