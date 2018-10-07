package com.google.android.apps.refocus.processing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.CameraProfile;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.image.BitmapIO;
import com.google.android.apps.refocus.image.BitmapProcessing;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.ColorImageIO;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.image.RGBZ.Data;
import com.google.android.apps.refocus.processing.Renderer.Priority;
import com.google.android.apps.refocus.processing.TiledRenderer.Options;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bkw;
import p000.bli;
import p000.eqy;
import p000.era;
import p000.get;
import p000.geu;
import p000.gkr;
import p000.gln;
import p000.glw;
import p000.glx;
import p000.gnf;
import p000.gnu;
import p000.goe;
import p000.hci;
import p000.hri;
import p000.iel;
import p000.iqb;
import p000.irs;
import p000.isx;
import p000.itg;
import p000.jri;
import p000.kbg;
import p000.ken;

/* compiled from: PG */
public class DepthmapTask implements geu {
    public static final int DEPTH_PROCESSING_HR_MAX_SIZE_PX = 640;
    public static final int DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX = 1280;
    public static final int DEPTH_PROCESSING_LATTICE_LR_MAX_SIZE_PX = 640;
    public static final int DEPTH_PROCESSING_LR_MAX_SIZE_PX = 320;
    public static final int JPEG_QUALITY = CameraProfile.getJpegEncodingQualityParameter(2);
    public static final int MAX_REFERENCE_SIZE_HR_PX = 2048;
    public static final int MAX_REFERENCE_SIZE_LR_PX = 1024;
    public static final int MAX_REFERENCE_SIZE_UR_PX = 4096;
    public static final int MIN_MEMORY_HIGH_RES_BYTES = 183500800;
    public static final String TAG = bli.m887a("DepthmapTask");
    public static final boolean USE_GPU = true;
    public static final boolean USE_LATTICE = true;
    public final String author;
    public final hri dataset;
    public final List finishedCallback;
    public final int focalLength35mm;
    public final List frames;
    public final boolean frontFacingCamera;
    public final bkw gservicesHelper;
    public final Location location;
    public final eqy maxNativeMemory;
    public final era memoryManager;
    public final int orientation;
    public final ColorImage reference;
    public final gkr session;
    public final gln sessionManager;
    public final long startTimeMillis = System.currentTimeMillis();
    /* renamed from: usageStatistics$9HHMUR9FCTNMUPRCCKNM2RJ4E9NMIP1FC5O70SPFCDGMQPBIC4NMORR7CTKMSPPFALPM2PR5ADQ62T39EDQ6IORJ7C______0 */
    public final irs f12899x7606f8b1;

    public DepthmapTask(era era, hri hri, int i, int i2, boolean z, String str, Location location, gkr gkr, eqy eqy, bkw bkw, irs irs, gln gln) {
        this.memoryManager = era;
        this.dataset = hri;
        this.orientation = i;
        this.focalLength35mm = i2;
        this.frontFacingCamera = z;
        this.author = str;
        this.location = location;
        this.session = gkr;
        this.frames = null;
        this.reference = null;
        this.maxNativeMemory = eqy;
        this.gservicesHelper = bkw;
        this.f12899x7606f8b1 = irs;
        this.finishedCallback = new ArrayList();
        this.sessionManager = gln;
    }

    public DepthmapTask(era era, hri hri, List list, ColorImage colorImage, int i, int i2, boolean z, String str, Location location, gln gln, eqy eqy, bkw bkw, irs irs, gnu gnu, gnf gnf) {
        this.memoryManager = era;
        this.dataset = hri;
        this.frames = list;
        this.reference = colorImage;
        this.orientation = i;
        this.focalLength35mm = i2;
        this.frontFacingCamera = z;
        this.author = str;
        this.location = location;
        gnf gnf2 = gnf;
        this.session = gnf2.mo7241a(getName(), kbg.m4803b(getLocation()), this.startTimeMillis, new goe(gnu, "TEMP_SESSIONS", getName()));
        this.sessionManager = gln;
        this.maxNativeMemory = eqy;
        this.gservicesHelper = bkw;
        this.f12899x7606f8b1 = irs;
        this.finishedCallback = new ArrayList();
    }

    public void addFinishedCallback(iqb iqb) {
        jri.m13404b((Object) iqb);
        this.finishedCallback.add(iqb);
    }

    private RGBZ computeRGBZ(Context context, ProgressCallback progressCallback, boolean z) {
        if (!isValid()) {
            return null;
        }
        int numFrames = getNumFrames();
        if (numFrames <= 0) {
            return RGBZ.rotate(new RGBZ(getReferenceBitmap(true, true)), this.orientation);
        }
        Bitmap referenceBitmap = getReferenceBitmap(z, true);
        ColorImage frame = getFrame(0);
        if (referenceBitmap == null) {
            return null;
        }
        int width;
        RGBZ ComputeRGBZ;
        Bitmap enforceAspectRatio = enforceAspectRatio(referenceBitmap, frame);
        if (enforceAspectRatio.getWidth() * frame.getHeight() != enforceAspectRatio.getHeight() * frame.getWidth()) {
            bli.m891b(TAG, "Reference / frame aspect ratio mismatch");
            String str = TAG;
            width = enforceAspectRatio.getWidth();
            int height = enforceAspectRatio.getHeight();
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Reference size: ");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            bli.m891b(str, stringBuilder.toString());
            str = TAG;
            width = frame.getWidth();
            height = frame.getHeight();
            stringBuilder = new StringBuilder(35);
            stringBuilder.append("Frame size: ");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            bli.m891b(str, stringBuilder.toString());
        }
        progressCallback.setRange(0.0f, 0.5f);
        int width2 = frame.getWidth();
        width = frame.getHeight();
        ProcessingNative.Init(width2, width, (int) Math.max(Math.ceil(Math.log(((double) Math.max(width2, width)) / ((double) getDepthProcessingMaxSize(z, true))) / Math.log(2.0d)), 0.0d), this.focalLength35mm, true, progressCallback);
        ProcessingNative.AddFrame(frame, 0.0f);
        for (width2 = 1; width2 < numFrames; width2++) {
            ProcessingNative.AddFrame(getFrame(width2), ((float) width2) / ((float) numFrames));
        }
        try {
            ComputeRGBZ = ProcessingNative.ComputeRGBZ(enforceAspectRatio, true);
        } catch (Throwable e) {
            bli.m892b(TAG, "ComputeDepthmap segment faulted", e);
            ComputeRGBZ = null;
        }
        if (ComputeRGBZ == null) {
            ComputeRGBZ = new RGBZ(enforceAspectRatio);
        }
        ComputeRGBZ = RGBZ.rotate(ComputeRGBZ, this.orientation);
        this.session.mo13370a(hci.m11979a((int) R.string.processing_notification, new Object[0]));
        renderRGBZ(context, this.gservicesHelper, ComputeRGBZ, progressCallback);
        return ComputeRGBZ;
    }

    Bitmap enforceAspectRatio(Bitmap bitmap, ColorImage colorImage) {
        if (bitmap.getWidth() * colorImage.getHeight() == bitmap.getHeight() * colorImage.getWidth()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > (colorImage.getWidth() * height) / colorImage.getHeight()) {
            width = (colorImage.getWidth() * height) / colorImage.getHeight();
        } else {
            height = (colorImage.getHeight() * width) / colorImage.getWidth();
        }
        width -= width % 8;
        height -= height % 8;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        String str = TAG;
        int width3 = bitmap.getWidth();
        int height3 = bitmap.getHeight();
        StringBuilder stringBuilder = new StringBuilder(69);
        stringBuilder.append("Cropping image ");
        stringBuilder.append(width3);
        stringBuilder.append(" x ");
        stringBuilder.append(height3);
        stringBuilder.append(" -> ");
        stringBuilder.append(width);
        stringBuilder.append(" x ");
        stringBuilder.append(height);
        bli.m888a(str, stringBuilder.toString());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (width2 - width) / 2, (height2 - height) / 2, width, height);
        bitmap.recycle();
        return createBitmap;
    }

    private void failAndFinish() {
        bli.m896d(TAG, "Processing was successful: false");
        this.session.mo7076a(hci.m11979a((int) R.string.compute_error, new Object[0]), false, "Processing failed.");
    }

    private int getDepthProcessingMaxSize(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX;
            }
            return 640;
        } else if (z) {
            return 640;
        } else {
            return DEPTH_PROCESSING_LR_MAX_SIZE_PX;
        }
    }

    private ColorImage getFrame(int i) {
        List list = this.frames;
        if (list == null) {
            return ColorImageIO.fromBitmap(BitmapFactory.decodeFile(this.dataset.mo8055a(i)));
        }
        try {
            return ((SelectedFrame) list.get(i)).image;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    private int getImageMaxSize(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 4096;
            }
            return MAX_REFERENCE_SIZE_HR_PX;
        } else if (z) {
            return MAX_REFERENCE_SIZE_HR_PX;
        } else {
            return 1024;
        }
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.dataset.f6860b;
    }

    private int getNumFrames() {
        List list = this.frames;
        if (list != null) {
            return list.size();
        }
        int i = 0;
        while (new File(this.dataset.mo8055a(i)).exists()) {
            i++;
        }
        return i;
    }

    private Bitmap getReferenceBitmap(boolean z, boolean z2) {
        ColorImage colorImage = this.reference;
        Bitmap toBitmap = colorImage != null ? ColorImageIO.toBitmap(colorImage) : new File(this.dataset.mo8056b()).exists() ? BitmapFactory.decodeFile(this.dataset.mo8056b()) : null;
        if (toBitmap == null) {
            bli.m891b(TAG, "No valid reference Bitmap found");
            return null;
        }
        int width = toBitmap.getWidth();
        int height = toBitmap.getHeight();
        int imageMaxSize = getImageMaxSize(z, z2);
        Bitmap createBitmap;
        if (Math.max(width, height) <= imageMaxSize) {
            imageMaxSize = width % 8;
            if (imageMaxSize == 0 && height % 8 == 0) {
                return toBitmap;
            }
            int i = height % 8;
            createBitmap = Bitmap.createBitmap(toBitmap, imageMaxSize / 2, i / 2, width - imageMaxSize, height - i);
            toBitmap.recycle();
            return createBitmap;
        }
        if (width > height) {
            width = (height * imageMaxSize) / width;
        } else {
            int i2 = imageMaxSize;
            imageMaxSize = (width * imageMaxSize) / height;
            width = i2;
        }
        createBitmap = Bitmap.createScaledBitmap(toBitmap, imageMaxSize - (imageMaxSize % 8), width - (width % 8), true);
        toBitmap.recycle();
        return createBitmap;
    }

    public get getSession() {
        return this.session;
    }

    private boolean isHighResSupported(era era) {
        return this.maxNativeMemory.f4332a > 183500800;
    }

    private boolean isValid() {
        if (this.frames != null && this.reference != null) {
            return true;
        }
        hri hri = this.dataset;
        if (hri == null) {
            return false;
        }
        boolean z;
        if (hri.f6859a == null) {
            z = false;
        } else if (hri.f6860b == null) {
            z = false;
        } else if (new File(hri.mo8054a()).exists()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void process(Context context) {
        String str;
        int i = 0;
        String str2;
        String valueOf;
        StringBuilder stringBuilder;
        ken a;
        int size;
        int i2;
        try {
            processInternal(context, this.memoryManager, this.session);
            str2 = TAG;
            valueOf = String.valueOf(this);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("calling finished callback ");
            stringBuilder.append(valueOf);
            bli.m894c(str2, stringBuilder.toString());
            a = ken.m13713a(this.finishedCallback);
            size = a.size();
            while (i < size) {
                i2 = i + 1;
                ((iqb) a.get(i)).mo8765a(this);
                i = i2;
            }
        } catch (Exception e) {
            valueOf = TAG;
            str = "exception while processing ";
            str2 = String.valueOf(e.getMessage());
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            bli.m891b(valueOf, str2);
            str2 = TAG;
            valueOf = String.valueOf(this);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("calling finished callback ");
            stringBuilder.append(valueOf);
            bli.m894c(str2, stringBuilder.toString());
            a = ken.m13713a(this.finishedCallback);
            size = a.size();
            while (i < size) {
                i2 = i + 1;
                ((iqb) a.get(i)).mo8765a(this);
                i = i2;
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            str2 = TAG;
            str = String.valueOf(this);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 26);
            stringBuilder2.append("calling finished callback ");
            stringBuilder2.append(str);
            bli.m894c(str2, stringBuilder2.toString());
            a = ken.m13713a(this.finishedCallback);
            size = a.size();
            int i3 = 0;
            while (i3 < size) {
                i = i3 + 1;
                ((iqb) a.get(i3)).mo8765a(this);
                i3 = i;
            }
        }
    }

    private void processInternal(Context context, era era, gkr gkr) {
        RGBZ computeRGBZ = computeRGBZ(context, new ProgressCallbackImpl(gkr), isHighResSupported(era));
        if (computeRGBZ == null) {
            failAndFinish();
        } else {
            saveAndFinish(computeRGBZ);
        }
        removeTemporaryFiles();
    }

    private void readReferenceExifTags(ExifInterface exifInterface) {
        ColorImage colorImage = this.reference;
        if (colorImage != null) {
            if (colorImage.getFormat() == 256) {
                try {
                    exifInterface.mo12673a(this.reference.getBuffer());
                } catch (Exception e) {
                    bli.m891b(TAG, "Could not read exif tags from reference image");
                }
            }
        } else if (new File(this.dataset.mo8056b()).exists()) {
            try {
                exifInterface.readExif(this.dataset.mo8056b());
            } catch (Exception e2) {
                bli.m891b(TAG, "Could not read exif tags from reference image");
            }
        }
    }

    public void removeFinishedCallback(iqb iqb) {
        jri.m13404b((Object) iqb);
        this.finishedCallback.remove(iqb);
    }

    private void removeTemporaryFiles() {
        String valueOf;
        int numFrames = getNumFrames();
        for (int i = 0; i < numFrames; i++) {
            File file = new File(this.dataset.mo8055a(i));
            if (file.exists()) {
                String str = TAG;
                valueOf = String.valueOf(this.dataset.mo8055a(i));
                String str2 = "delete ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m894c(str, valueOf);
                file.delete();
            }
        }
        File file2 = new File(this.dataset.mo8056b());
        if (file2.exists()) {
            String str3 = TAG;
            valueOf = String.valueOf(this.dataset.mo8056b());
            String str4 = "delete ";
            if (valueOf.length() == 0) {
                valueOf = new String(str4);
            } else {
                valueOf = str4.concat(valueOf);
            }
            bli.m894c(str3, valueOf);
            file2.delete();
        }
    }

    private static void renderRGBZ(Context context, bkw bkw, RGBZ rgbz, ProgressCallback progressCallback) {
        if (rgbz.hasDepthmap()) {
            DepthOfFieldOptions depthOfFieldOptions = new DepthOfFieldOptions(rgbz);
            FocusSettings createDefault = FocusSettings.createDefault(new FaceDetector(context, bkw), depthOfFieldOptions.rgbz);
            depthOfFieldOptions.focalDepth = createDefault.focalDistance;
            depthOfFieldOptions.depthOfField = createDefault.depthOfField;
            depthOfFieldOptions.blurInfinity = createDefault.blurAtInfinity * ((float) Math.max(depthOfFieldOptions.rgbz.getWidth(), depthOfFieldOptions.rgbz.getHeight()));
            Options options = new Options();
            options.startProgress = 0.5f;
            options.endProgress = 1.0f;
            rgbz.setPreview(new TiledRenderer(options, new Renderer(context, Priority.LOW)).render(depthOfFieldOptions, progressCallback));
            rgbz.setFocusSettings(createDefault);
        }
    }

    public void resume() {
    }

    public DepthmapTask save() {
        int i;
        ExecutorService a = iel.m3772a("DepthmapEx", Runtime.getRuntime().availableProcessors());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (this.reference != null) {
            a.execute(new Runnable() {
                public void run() {
                    atomicBoolean.compareAndSet(true, ColorImageIO.saveToFile(DepthmapTask.this.reference, DepthmapTask.this.dataset.mo8056b()));
                }
            });
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.frames.size()) {
            final ColorImage colorImage = ((SelectedFrame) this.frames.get(i)).image;
            final String a2 = this.dataset.mo8055a(i);
            a.execute(new Runnable(this) {
                public void run() {
                    atomicBoolean.compareAndSet(true, ColorImageIO.saveToFile(colorImage, a2));
                }
            });
            i++;
        }
        a.shutdown();
        try {
            a.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            bli.m891b(TAG, e.getMessage());
            atomicBoolean.set(false);
        }
        if (atomicBoolean.get()) {
            return new DepthmapTask(this.memoryManager, this.dataset, this.orientation, this.focalLength35mm, this.frontFacingCamera, this.author, this.location, this.session, this.maxNativeMemory, this.gservicesHelper, this.f12899x7606f8b1, this.sessionManager);
        }
        return null;
    }

    private void saveAndFinish(RGBZ rgbz) {
        Data createRgbzFile = rgbz.createRgbzFile(JPEG_QUALITY);
        setExifTags(rgbz.getWidth(), rgbz.getHeight(), createRgbzFile.exif);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startTimeMillis;
        this.f12899x7606f8b1.mo8897a(String.valueOf(getName()).concat(".jpg"), createRgbzFile.exif, this.frontFacingCamera, ((float) (currentTimeMillis - j)) * 0.001f, rgbz.hasDepthmap());
        glx.m11389a(this.session, createRgbzFile.fileData, rgbz.getWidth(), rgbz.getHeight(), 0, createRgbzFile.exif);
    }

    public void savePhotoWithoutDepth() {
        if (isValid()) {
            saveAndFinish(RGBZ.rotate(new RGBZ(getReferenceBitmap(true, true)), this.orientation));
        }
    }

    private void setExifTags(int i, int i2, ExifInterface exifInterface) {
        readReferenceExifTags(exifInterface);
        exifInterface.f13038P.f7761b = null;
        if (this.location != null) {
            new itg(exifInterface).mo8999a(this.location);
        }
        if (this.author != null) {
            exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13033w, this.author));
        }
        int i3 = ExifInterface.f12935a;
        Object valueOf = Integer.valueOf(i);
        exifInterface.mo12669a(exifInterface.mo12668a(i3, valueOf));
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13034x, valueOf));
        i3 = ExifInterface.f12988b;
        valueOf = Integer.valueOf(i2);
        exifInterface.mo12669a(exifInterface.mo12668a(i3, valueOf));
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13035y, valueOf));
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f12914B, Integer.valueOf(this.focalLength35mm)));
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13017g, Short.valueOf(isx.TOP_LEFT.f7774b)));
    }

    public void startSession(boolean z) {
        boolean z2 = false;
        if (isValid()) {
            Bitmap rotate = BitmapProcessing.rotate(getReferenceBitmap(false, false), this.orientation);
            if (rotate == null) {
                String str = TAG;
                if (this.reference == null) {
                    z2 = true;
                }
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("No valid preview found, disk task = ");
                stringBuilder.append(z2);
                bli.m891b(str, stringBuilder.toString());
                return;
            }
            this.sessionManager.mo7199a(this.session);
            if (z) {
                this.session.mo13372a(BitmapIO.toByteArray(rotate, JPEG_QUALITY), hci.m11979a((int) R.string.processing_notification, new Object[0]), glw.LENS_BLUR);
                return;
            }
            bli.m888a(TAG, "Start the lens blur session without depth.");
            this.session.mo13372a(BitmapIO.toByteArray(rotate, JPEG_QUALITY), hci.m11979a((int) R.string.saving_reference, new Object[0]), glw.NORMAL);
        }
    }

    public void suspend() {
    }
}
