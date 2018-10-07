package com.google.common.logging.nano;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import p000.kjd;
import p000.kjf;
import p000.kka;
import p000.kkb;
import p000.kkc;
import p000.kkf;
import p000.kkg;
import p000.kky;
import p000.kla;
import p000.klf;
import p000.klg;
import p000.klh;
import p000.klj;
import p000.klk;
import p000.kln;
import p000.kls;
import p000.klw;
import p000.klx;
import p000.kme;
import p000.kmf;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class eventprotos$CaptureDone extends kvf {
    public static volatile eventprotos$CaptureDone[] _emptyArray;
    public kjd adviceMeta;
    public kjf authorStats;
    public int captureFailure;
    public eventprotos$CaptureTiming captureTiming;
    public kka exif;
    public kkb[] face;
    public kkc faceretouchingMeta;
    public String fileNameHash;
    public int flashSetting;
    public boolean frontCamera;
    public kkf gcamMeta;
    public boolean gridLines;
    public int hdrPlusSetting;
    public kkg imaxMetadata;
    public kky lensBlurMeta;
    public kla luckyShotMeta;
    public klf meteringData;
    public klg microvideoMeta;
    public int mode;
    public kls orientation;
    public klj panoMeta;
    public klk photoMeta;
    public int photosInFlight;
    public kln portraitMetadata;
    public float processingTime;
    public klx smartBurstMeta;
    public klw smartburstCreationMeta;
    public float timerSeconds;
    public kme touchCoord;
    public kmf videoMeta;
    public boolean volumeButtonShutter;
    public float zoomValue;

    public eventprotos$CaptureDone() {
        clear();
    }

    public static int checkCaptureFailureOrThrow(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureFailure");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkCaptureFailureOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkCaptureFailureOrThrow : iArr2) {
            checkCaptureFailureOrThrow(checkCaptureFailureOrThrow);
        }
        return iArr2;
    }

    public static int checkTriStateSettingOrThrow(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum TriStateSetting");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkTriStateSettingOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkTriStateSettingOrThrow : iArr2) {
            checkTriStateSettingOrThrow(checkTriStateSettingOrThrow);
        }
        return iArr2;
    }

    public final eventprotos$CaptureDone clear() {
        this.fileNameHash = "";
        this.mode = 0;
        this.frontCamera = false;
        this.zoomValue = 0.0f;
        this.processingTime = 0.0f;
        this.exif = null;
        this.gridLines = false;
        this.timerSeconds = 0.0f;
        this.flashSetting = 0;
        this.volumeButtonShutter = false;
        this.touchCoord = null;
        this.face = kkb.m16921a();
        this.orientation = null;
        this.photoMeta = null;
        this.videoMeta = null;
        this.gcamMeta = null;
        this.lensBlurMeta = null;
        this.panoMeta = null;
        this.authorStats = null;
        this.smartBurstMeta = null;
        this.captureTiming = null;
        this.adviceMeta = null;
        this.luckyShotMeta = null;
        this.smartburstCreationMeta = null;
        this.meteringData = null;
        this.hdrPlusSetting = 0;
        this.photosInFlight = 0;
        this.captureFailure = 0;
        this.microvideoMeta = null;
        this.faceretouchingMeta = null;
        this.portraitMetadata = null;
        this.imaxMetadata = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.fileNameHash;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.fileNameHash);
        }
        int i = this.mode;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        if (this.frontCamera) {
            computeSerializedSize += kvd.m5484b(48) + 1;
        }
        if (Float.floatToIntBits(this.zoomValue) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(56) + 4;
        }
        if (Float.floatToIntBits(this.processingTime) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(64) + 4;
        }
        kvl kvl = this.exif;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(9, kvl);
        }
        if (this.gridLines) {
            computeSerializedSize += kvd.m5484b(80) + 1;
        }
        if (Float.floatToIntBits(this.timerSeconds) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(88) + 4;
        }
        i = this.flashSetting;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(12, i);
        }
        if (this.volumeButtonShutter) {
            computeSerializedSize += kvd.m5484b(104) + 1;
        }
        kvl = this.touchCoord;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(14, kvl);
        }
        kkb[] kkbArr = this.face;
        if (kkbArr != null && kkbArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkb[] kkbArr2 = this.face;
                if (computeSerializedSize >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5479a(15, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.orientation;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(16, kvl);
        }
        kvl = this.photoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(20, kvl);
        }
        kvl = this.videoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(21, kvl);
        }
        kvl = this.gcamMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(22, kvl);
        }
        kvl = this.lensBlurMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(23, kvl);
        }
        kvl = this.panoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(24, kvl);
        }
        kvl = this.authorStats;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(25, kvl);
        }
        kvl = this.smartBurstMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(27, kvl);
        }
        kvl = this.captureTiming;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(29, kvl);
        }
        kvl = this.adviceMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(30, kvl);
        }
        kvl = this.luckyShotMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(31, kvl);
        }
        kvl = this.smartburstCreationMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(32, kvl);
        }
        kvl = this.meteringData;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(33, kvl);
        }
        i = this.hdrPlusSetting;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(34, i);
        }
        i = this.photosInFlight;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(35, i);
        }
        i = this.captureFailure;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(36, i);
        }
        kvl = this.microvideoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(37, kvl);
        }
        kvl = this.faceretouchingMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(38, kvl);
        }
        kvl = this.portraitMetadata;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(39, kvl);
        }
        kvl = this.imaxMetadata;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(40, kvl);
        }
        return computeSerializedSize;
    }

    public static eventprotos$CaptureDone[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f9023b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CaptureDone[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CaptureDone mergeFrom(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.fileNameHash = kvc.mo10487h();
                    continue;
                case 24:
                    b = kvc.mo10476b();
                    try {
                        this.mode = klh.m16941b(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 48:
                    this.frontCamera = kvc.mo10480c();
                    continue;
                case 61:
                    this.zoomValue = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 69:
                    this.processingTime = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 74:
                    if (this.exif == null) {
                        this.exif = new kka();
                    }
                    kvc.mo10474a(this.exif);
                    continue;
                case 80:
                    this.gridLines = kvc.mo10480c();
                    continue;
                case 93:
                    this.timerSeconds = Float.intBitsToFloat(kvc.mo10481d());
                    continue;
                case 96:
                    b = kvc.mo10476b();
                    try {
                        this.flashSetting = checkTriStateSettingOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 104:
                    this.volumeButtonShutter = kvc.mo10480c();
                    continue;
                case 114:
                    if (this.touchCoord == null) {
                        this.touchCoord = new kme();
                    }
                    kvc.mo10474a(this.touchCoord);
                    continue;
                case 122:
                    b = kvn.m5518a(kvc, 122);
                    Object obj = this.face;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kkb[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kkb();
                        kvc.mo10474a(obj2[i]);
                        kvc.mo10488i();
                        i++;
                    }
                    obj2[i] = new kkb();
                    kvc.mo10474a(obj2[i]);
                    this.face = obj2;
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    if (this.orientation == null) {
                        this.orientation = new kls();
                    }
                    kvc.mo10474a(this.orientation);
                    continue;
                case 162:
                    if (this.photoMeta == null) {
                        this.photoMeta = new klk();
                    }
                    kvc.mo10474a(this.photoMeta);
                    continue;
                case 170:
                    if (this.videoMeta == null) {
                        this.videoMeta = new kmf();
                    }
                    kvc.mo10474a(this.videoMeta);
                    continue;
                case 178:
                    if (this.gcamMeta == null) {
                        this.gcamMeta = new kkf();
                    }
                    kvc.mo10474a(this.gcamMeta);
                    continue;
                case 186:
                    if (this.lensBlurMeta == null) {
                        this.lensBlurMeta = new kky();
                    }
                    kvc.mo10474a(this.lensBlurMeta);
                    continue;
                case 194:
                    if (this.panoMeta == null) {
                        this.panoMeta = new klj();
                    }
                    kvc.mo10474a(this.panoMeta);
                    continue;
                case 202:
                    if (this.authorStats == null) {
                        this.authorStats = new kjf();
                    }
                    kvc.mo10474a(this.authorStats);
                    continue;
                case XmpUtil.M_SOS /*218*/:
                    if (this.smartBurstMeta == null) {
                        this.smartBurstMeta = new klx();
                    }
                    kvc.mo10474a(this.smartBurstMeta);
                    continue;
                case 234:
                    if (this.captureTiming == null) {
                        this.captureTiming = new eventprotos$CaptureTiming();
                    }
                    kvc.mo10474a(this.captureTiming);
                    continue;
                case 242:
                    if (this.adviceMeta == null) {
                        this.adviceMeta = new kjd();
                    }
                    kvc.mo10474a(this.adviceMeta);
                    continue;
                case ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS /*250*/:
                    if (this.luckyShotMeta == null) {
                        this.luckyShotMeta = new kla();
                    }
                    kvc.mo10474a(this.luckyShotMeta);
                    continue;
                case 258:
                    if (this.smartburstCreationMeta == null) {
                        this.smartburstCreationMeta = new klw();
                    }
                    kvc.mo10474a(this.smartburstCreationMeta);
                    continue;
                case 266:
                    if (this.meteringData == null) {
                        this.meteringData = new klf();
                    }
                    kvc.mo10474a(this.meteringData);
                    continue;
                case 272:
                    b = kvc.mo10476b();
                    try {
                        this.hdrPlusSetting = checkTriStateSettingOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 280:
                    this.photosInFlight = kvc.mo10485f();
                    continue;
                case 288:
                    b = kvc.mo10476b();
                    try {
                        this.captureFailure = checkCaptureFailureOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e4) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 298:
                    if (this.microvideoMeta == null) {
                        this.microvideoMeta = new klg();
                    }
                    kvc.mo10474a(this.microvideoMeta);
                    continue;
                case 306:
                    if (this.faceretouchingMeta == null) {
                        this.faceretouchingMeta = new kkc();
                    }
                    kvc.mo10474a(this.faceretouchingMeta);
                    continue;
                case 314:
                    if (this.portraitMetadata == null) {
                        this.portraitMetadata = new kln();
                    }
                    kvc.mo10474a(this.portraitMetadata);
                    continue;
                case 322:
                    if (this.imaxMetadata == null) {
                        this.imaxMetadata = new kkg();
                    }
                    kvc.mo10474a(this.imaxMetadata);
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }

    public static eventprotos$CaptureDone parseFrom(kvc kvc) {
        return new eventprotos$CaptureDone().mergeFrom(kvc);
    }

    public static eventprotos$CaptureDone parseFrom(byte[] bArr) {
        return (eventprotos$CaptureDone) kvl.mergeFrom(new eventprotos$CaptureDone(), bArr);
    }

    public final void writeTo(kvd kvd) {
        String str = this.fileNameHash;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.fileNameHash);
        }
        int i = this.mode;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        boolean z = this.frontCamera;
        if (z) {
            kvd.mo10491a(6, z);
        }
        if (Float.floatToIntBits(this.zoomValue) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(7, this.zoomValue);
        }
        if (Float.floatToIntBits(this.processingTime) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(8, this.processingTime);
        }
        kvl kvl = this.exif;
        if (kvl != null) {
            kvd.mo10496b(9, kvl);
        }
        z = this.gridLines;
        if (z) {
            kvd.mo10491a(10, z);
        }
        if (Float.floatToIntBits(this.timerSeconds) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(11, this.timerSeconds);
        }
        i = this.flashSetting;
        if (i != 0) {
            kvd.mo10493b(12, i);
        }
        z = this.volumeButtonShutter;
        if (z) {
            kvd.mo10491a(13, z);
        }
        kvl = this.touchCoord;
        if (kvl != null) {
            kvd.mo10496b(14, kvl);
        }
        kkb[] kkbArr = this.face;
        if (kkbArr != null && kkbArr.length > 0) {
            i = 0;
            while (true) {
                kkb[] kkbArr2 = this.face;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[i];
                if (kvl2 != null) {
                    kvd.mo10496b(15, kvl2);
                }
                i++;
            }
        }
        kvl = this.orientation;
        if (kvl != null) {
            kvd.mo10496b(16, kvl);
        }
        kvl = this.photoMeta;
        if (kvl != null) {
            kvd.mo10496b(20, kvl);
        }
        kvl = this.videoMeta;
        if (kvl != null) {
            kvd.mo10496b(21, kvl);
        }
        kvl = this.gcamMeta;
        if (kvl != null) {
            kvd.mo10496b(22, kvl);
        }
        kvl = this.lensBlurMeta;
        if (kvl != null) {
            kvd.mo10496b(23, kvl);
        }
        kvl = this.panoMeta;
        if (kvl != null) {
            kvd.mo10496b(24, kvl);
        }
        kvl = this.authorStats;
        if (kvl != null) {
            kvd.mo10496b(25, kvl);
        }
        kvl = this.smartBurstMeta;
        if (kvl != null) {
            kvd.mo10496b(27, kvl);
        }
        kvl = this.captureTiming;
        if (kvl != null) {
            kvd.mo10496b(29, kvl);
        }
        kvl = this.adviceMeta;
        if (kvl != null) {
            kvd.mo10496b(30, kvl);
        }
        kvl = this.luckyShotMeta;
        if (kvl != null) {
            kvd.mo10496b(31, kvl);
        }
        kvl = this.smartburstCreationMeta;
        if (kvl != null) {
            kvd.mo10496b(32, kvl);
        }
        kvl = this.meteringData;
        if (kvl != null) {
            kvd.mo10496b(33, kvl);
        }
        i = this.hdrPlusSetting;
        if (i != 0) {
            kvd.mo10493b(34, i);
        }
        i = this.photosInFlight;
        if (i != 0) {
            kvd.mo10493b(35, i);
        }
        i = this.captureFailure;
        if (i != 0) {
            kvd.mo10493b(36, i);
        }
        kvl = this.microvideoMeta;
        if (kvl != null) {
            kvd.mo10496b(37, kvl);
        }
        kvl = this.faceretouchingMeta;
        if (kvl != null) {
            kvd.mo10496b(38, kvl);
        }
        kvl = this.portraitMetadata;
        if (kvl != null) {
            kvd.mo10496b(39, kvl);
        }
        kvl = this.imaxMetadata;
        if (kvl != null) {
            kvd.mo10496b(40, kvl);
        }
        super.writeTo(kvd);
    }
}
