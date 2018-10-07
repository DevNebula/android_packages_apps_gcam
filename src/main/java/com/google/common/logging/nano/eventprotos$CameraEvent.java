package com.google.common.logging.nano;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import p000.kje;
import p000.kji;
import p000.kjl;
import p000.kjo;
import p000.kjp;
import p000.kjq;
import p000.kjr;
import p000.kjs;
import p000.kjt;
import p000.kju;
import p000.kjv;
import p000.kjx;
import p000.kjy;
import p000.kkd;
import p000.kkl;
import p000.kkw;
import p000.klc;
import p000.kld;
import p000.kle;
import p000.klh;
import p000.kli;
import p000.klm;
import p000.klo;
import p000.klp;
import p000.kmc;
import p000.kvc;
import p000.kvd;
import p000.kve;
import p000.kvf;
import p000.kvj;
import p000.kvl;

/* compiled from: PG */
public final class eventprotos$CameraEvent extends kvf {
    public static volatile eventprotos$CameraEvent[] _emptyArray;
    public kje adviceShown;
    public String appVersionName;
    public eventprotos$BackgroundEvent backgroundEvent;
    public kji blockShotEvent;
    public int buildSource;
    public kjl cameraContentProviderEvent;
    public kjo cameraFailure;
    public kjp cameraPrewarmEvent;
    public kjq captureComputeEvent;
    public eventprotos$CaptureDone captureDoneEvent;
    public kjr captureProfileAbortedEvent;
    public kjs captureProfileDeletedEvent;
    public eventprotos$CaptureProfileEvent captureProfileEvent;
    public kjt captureProfileFailedEvent;
    public kju captureProfileStartCommittedEvent;
    public kjv captureProfileStartEvent;
    public kjx changeCameraEvent;
    public long clientFirstUseMillis;
    public kjy controlEvent;
    public int counter;
    public int eventType;
    public kkd foregroundEvent;
    public boolean googler;
    public klc interaction;
    public kkl irisEvent;
    public boolean isTestDevice;
    public kkw launchPhotosReviewEvent;
    public kld memoryReport;
    public kle memoryWindowStats;
    public klh navigationChange;
    public kli openDeviceRetryEvent;
    public klm photoVideoModeChangeEvent;
    public klo preferenceChangeEvent;
    public klp preferencesEvent;
    public int runId;
    public long sessionId;
    public kmc storageWarning;
    public String timezone;

    public eventprotos$CameraEvent() {
        clear();
    }

    public static int checkBuildSourceOrThrow(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum BuildSource");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkBuildSourceOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkBuildSourceOrThrow : iArr2) {
            checkBuildSourceOrThrow(checkBuildSourceOrThrow);
        }
        return iArr2;
    }

    public static int checkEventTypeOrThrow(int i) {
        if ((i >= 0 && i <= 1) || ((i >= 3 && i <= 7) || (i >= 12 && i <= 34))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum EventType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkEventTypeOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkEventTypeOrThrow : iArr2) {
            checkEventTypeOrThrow(checkEventTypeOrThrow);
        }
        return iArr2;
    }

    public final eventprotos$CameraEvent clear() {
        this.eventType = 0;
        this.googler = false;
        this.timezone = "";
        this.navigationChange = null;
        this.captureDoneEvent = null;
        this.interaction = null;
        this.foregroundEvent = null;
        this.cameraFailure = null;
        this.controlEvent = null;
        this.captureComputeEvent = null;
        this.memoryReport = null;
        this.memoryWindowStats = null;
        this.storageWarning = null;
        this.backgroundEvent = null;
        this.captureProfileStartEvent = null;
        this.captureProfileEvent = null;
        this.captureProfileAbortedEvent = null;
        this.cameraPrewarmEvent = null;
        this.openDeviceRetryEvent = null;
        this.changeCameraEvent = null;
        this.blockShotEvent = null;
        this.captureProfileFailedEvent = null;
        this.captureProfileStartCommittedEvent = null;
        this.captureProfileDeletedEvent = null;
        this.clientFirstUseMillis = 0;
        this.runId = 0;
        this.counter = 0;
        this.sessionId = 0;
        this.buildSource = 0;
        this.isTestDevice = false;
        this.preferencesEvent = null;
        this.cameraContentProviderEvent = null;
        this.launchPhotosReviewEvent = null;
        this.photoVideoModeChangeEvent = null;
        this.appVersionName = "";
        this.adviceShown = null;
        this.preferenceChangeEvent = null;
        this.irisEvent = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.eventType;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        if (this.googler) {
            computeSerializedSize += kvd.m5484b(16) + 1;
        }
        String str = this.timezone;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(3, this.timezone);
        }
        kvl kvl = this.navigationChange;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(4, kvl);
        }
        kvl = this.captureDoneEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(6, kvl);
        }
        kvl = this.interaction;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(7, kvl);
        }
        kvl = this.foregroundEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(8, kvl);
        }
        kvl = this.cameraFailure;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(9, kvl);
        }
        kvl = this.controlEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(12, kvl);
        }
        kvl = this.captureComputeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(13, kvl);
        }
        kvl = this.memoryReport;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(14, kvl);
        }
        kvl = this.memoryWindowStats;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(15, kvl);
        }
        kvl = this.storageWarning;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(16, kvl);
        }
        kvl = this.backgroundEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(17, kvl);
        }
        kvl = this.captureProfileStartEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(18, kvl);
        }
        kvl = this.captureProfileEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(19, kvl);
        }
        kvl = this.captureProfileAbortedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(20, kvl);
        }
        kvl = this.cameraPrewarmEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(21, kvl);
        }
        kvl = this.openDeviceRetryEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(22, kvl);
        }
        kvl = this.changeCameraEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(23, kvl);
        }
        kvl = this.blockShotEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(24, kvl);
        }
        kvl = this.captureProfileFailedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(25, kvl);
        }
        kvl = this.captureProfileStartCommittedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(26, kvl);
        }
        kvl = this.captureProfileDeletedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(27, kvl);
        }
        long j = this.clientFirstUseMillis;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(30, j);
        }
        if (this.runId != 0) {
            computeSerializedSize += kvd.m5484b(248) + 4;
        }
        i = this.counter;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(32, i);
        }
        if (this.sessionId != 0) {
            computeSerializedSize += kvd.m5484b(264) + 8;
        }
        i = this.buildSource;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(34, i);
        }
        if (this.isTestDevice) {
            computeSerializedSize += kvd.m5484b(280) + 1;
        }
        kvl = this.preferencesEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(36, kvl);
        }
        kvl = this.cameraContentProviderEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(37, kvl);
        }
        kvl = this.launchPhotosReviewEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(38, kvl);
        }
        kvl = this.photoVideoModeChangeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(39, kvl);
        }
        str = this.appVersionName;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(40, this.appVersionName);
        }
        kvl = this.adviceShown;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(41, kvl);
        }
        kvl = this.preferenceChangeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(42, kvl);
        }
        kvl = this.irisEvent;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(43, kvl);
        }
        return computeSerializedSize;
    }

    public static eventprotos$CameraEvent[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f9023b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CameraEvent[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CameraEvent mergeFrom(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.mo10488i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.mo10476b();
                    try {
                        this.eventType = checkEventTypeOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    this.googler = kvc.mo10480c();
                    continue;
                case 26:
                    this.timezone = kvc.mo10487h();
                    continue;
                case 34:
                    if (this.navigationChange == null) {
                        this.navigationChange = new klh();
                    }
                    kvc.mo10474a(this.navigationChange);
                    continue;
                case 50:
                    if (this.captureDoneEvent == null) {
                        this.captureDoneEvent = new eventprotos$CaptureDone();
                    }
                    kvc.mo10474a(this.captureDoneEvent);
                    continue;
                case 58:
                    if (this.interaction == null) {
                        this.interaction = new klc();
                    }
                    kvc.mo10474a(this.interaction);
                    continue;
                case 66:
                    if (this.foregroundEvent == null) {
                        this.foregroundEvent = new kkd();
                    }
                    kvc.mo10474a(this.foregroundEvent);
                    continue;
                case 74:
                    if (this.cameraFailure == null) {
                        this.cameraFailure = new kjo();
                    }
                    kvc.mo10474a(this.cameraFailure);
                    continue;
                case 98:
                    if (this.controlEvent == null) {
                        this.controlEvent = new kjy();
                    }
                    kvc.mo10474a(this.controlEvent);
                    continue;
                case 106:
                    if (this.captureComputeEvent == null) {
                        this.captureComputeEvent = new kjq();
                    }
                    kvc.mo10474a(this.captureComputeEvent);
                    continue;
                case 114:
                    if (this.memoryReport == null) {
                        this.memoryReport = new kld();
                    }
                    kvc.mo10474a(this.memoryReport);
                    continue;
                case 122:
                    if (this.memoryWindowStats == null) {
                        this.memoryWindowStats = new kle();
                    }
                    kvc.mo10474a(this.memoryWindowStats);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    if (this.storageWarning == null) {
                        this.storageWarning = new kmc();
                    }
                    kvc.mo10474a(this.storageWarning);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_cherk /*138*/:
                    if (this.backgroundEvent == null) {
                        this.backgroundEvent = new eventprotos$BackgroundEvent();
                    }
                    kvc.mo10474a(this.backgroundEvent);
                    continue;
                case 146:
                    if (this.captureProfileStartEvent == null) {
                        this.captureProfileStartEvent = new kjv();
                    }
                    kvc.mo10474a(this.captureProfileStartEvent);
                    continue;
                case 154:
                    if (this.captureProfileEvent == null) {
                        this.captureProfileEvent = new eventprotos$CaptureProfileEvent();
                    }
                    kvc.mo10474a(this.captureProfileEvent);
                    continue;
                case 162:
                    if (this.captureProfileAbortedEvent == null) {
                        this.captureProfileAbortedEvent = new kjr();
                    }
                    kvc.mo10474a(this.captureProfileAbortedEvent);
                    continue;
                case 170:
                    if (this.cameraPrewarmEvent == null) {
                        this.cameraPrewarmEvent = new kjp();
                    }
                    kvc.mo10474a(this.cameraPrewarmEvent);
                    continue;
                case 178:
                    if (this.openDeviceRetryEvent == null) {
                        this.openDeviceRetryEvent = new kli();
                    }
                    kvc.mo10474a(this.openDeviceRetryEvent);
                    continue;
                case 186:
                    if (this.changeCameraEvent == null) {
                        this.changeCameraEvent = new kjx();
                    }
                    kvc.mo10474a(this.changeCameraEvent);
                    continue;
                case 194:
                    if (this.blockShotEvent == null) {
                        this.blockShotEvent = new kji();
                    }
                    kvc.mo10474a(this.blockShotEvent);
                    continue;
                case 202:
                    if (this.captureProfileFailedEvent == null) {
                        this.captureProfileFailedEvent = new kjt();
                    }
                    kvc.mo10474a(this.captureProfileFailedEvent);
                    continue;
                case 210:
                    if (this.captureProfileStartCommittedEvent == null) {
                        this.captureProfileStartCommittedEvent = new kju();
                    }
                    kvc.mo10474a(this.captureProfileStartCommittedEvent);
                    continue;
                case XmpUtil.M_SOS /*218*/:
                    if (this.captureProfileDeletedEvent == null) {
                        this.captureProfileDeletedEvent = new kjs();
                    }
                    kvc.mo10474a(this.captureProfileDeletedEvent);
                    continue;
                case 240:
                    this.clientFirstUseMillis = kvc.mo10486g();
                    continue;
                case 253:
                    this.runId = kvc.mo10481d();
                    continue;
                case 256:
                    this.counter = kvc.mo10485f();
                    continue;
                case 265:
                    this.sessionId = kvc.mo10483e();
                    continue;
                case 272:
                    b = kvc.mo10476b();
                    try {
                        this.buildSource = checkBuildSourceOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.mo10482d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 280:
                    this.isTestDevice = kvc.mo10480c();
                    continue;
                case 290:
                    if (this.preferencesEvent == null) {
                        this.preferencesEvent = new klp();
                    }
                    kvc.mo10474a(this.preferencesEvent);
                    continue;
                case 298:
                    if (this.cameraContentProviderEvent == null) {
                        this.cameraContentProviderEvent = new kjl();
                    }
                    kvc.mo10474a(this.cameraContentProviderEvent);
                    continue;
                case 306:
                    if (this.launchPhotosReviewEvent == null) {
                        this.launchPhotosReviewEvent = new kkw();
                    }
                    kvc.mo10474a(this.launchPhotosReviewEvent);
                    continue;
                case 314:
                    if (this.photoVideoModeChangeEvent == null) {
                        this.photoVideoModeChangeEvent = new klm();
                    }
                    kvc.mo10474a(this.photoVideoModeChangeEvent);
                    continue;
                case 322:
                    this.appVersionName = kvc.mo10487h();
                    continue;
                case 330:
                    if (this.adviceShown == null) {
                        this.adviceShown = new kje();
                    }
                    kvc.mo10474a(this.adviceShown);
                    continue;
                case 338:
                    if (this.preferenceChangeEvent == null) {
                        this.preferenceChangeEvent = new klo();
                    }
                    kvc.mo10474a(this.preferenceChangeEvent);
                    continue;
                case 346:
                    if (this.irisEvent == null) {
                        this.irisEvent = new kkl();
                    }
                    kvc.mo10474a(this.irisEvent);
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

    public static eventprotos$CameraEvent parseFrom(kvc kvc) {
        return new eventprotos$CameraEvent().mergeFrom(kvc);
    }

    public static eventprotos$CameraEvent parseFrom(byte[] bArr) {
        return (eventprotos$CameraEvent) kvl.mergeFrom(new eventprotos$CameraEvent(), bArr);
    }

    public final void writeTo(kvd kvd) {
        int i = this.eventType;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        boolean z = this.googler;
        if (z) {
            kvd.mo10491a(2, z);
        }
        String str = this.timezone;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(3, this.timezone);
        }
        kvl kvl = this.navigationChange;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        kvl = this.captureDoneEvent;
        if (kvl != null) {
            kvd.mo10496b(6, kvl);
        }
        kvl = this.interaction;
        if (kvl != null) {
            kvd.mo10496b(7, kvl);
        }
        kvl = this.foregroundEvent;
        if (kvl != null) {
            kvd.mo10496b(8, kvl);
        }
        kvl = this.cameraFailure;
        if (kvl != null) {
            kvd.mo10496b(9, kvl);
        }
        kvl = this.controlEvent;
        if (kvl != null) {
            kvd.mo10496b(12, kvl);
        }
        kvl = this.captureComputeEvent;
        if (kvl != null) {
            kvd.mo10496b(13, kvl);
        }
        kvl = this.memoryReport;
        if (kvl != null) {
            kvd.mo10496b(14, kvl);
        }
        kvl = this.memoryWindowStats;
        if (kvl != null) {
            kvd.mo10496b(15, kvl);
        }
        kvl = this.storageWarning;
        if (kvl != null) {
            kvd.mo10496b(16, kvl);
        }
        kvl = this.backgroundEvent;
        if (kvl != null) {
            kvd.mo10496b(17, kvl);
        }
        kvl = this.captureProfileStartEvent;
        if (kvl != null) {
            kvd.mo10496b(18, kvl);
        }
        kvl = this.captureProfileEvent;
        if (kvl != null) {
            kvd.mo10496b(19, kvl);
        }
        kvl = this.captureProfileAbortedEvent;
        if (kvl != null) {
            kvd.mo10496b(20, kvl);
        }
        kvl = this.cameraPrewarmEvent;
        if (kvl != null) {
            kvd.mo10496b(21, kvl);
        }
        kvl = this.openDeviceRetryEvent;
        if (kvl != null) {
            kvd.mo10496b(22, kvl);
        }
        kvl = this.changeCameraEvent;
        if (kvl != null) {
            kvd.mo10496b(23, kvl);
        }
        kvl = this.blockShotEvent;
        if (kvl != null) {
            kvd.mo10496b(24, kvl);
        }
        kvl = this.captureProfileFailedEvent;
        if (kvl != null) {
            kvd.mo10496b(25, kvl);
        }
        kvl = this.captureProfileStartCommittedEvent;
        if (kvl != null) {
            kvd.mo10496b(26, kvl);
        }
        kvl = this.captureProfileDeletedEvent;
        if (kvl != null) {
            kvd.mo10496b(27, kvl);
        }
        long j = this.clientFirstUseMillis;
        if (j != 0) {
            kvd.mo10494b(30, j);
        }
        i = this.runId;
        if (i != 0) {
            kvd.mo10498c(31, 5);
            kvd.mo10500d(i);
        }
        i = this.counter;
        if (i != 0) {
            kvd.mo10493b(32, i);
        }
        j = this.sessionId;
        if (j != 0) {
            kvd.mo10498c(33, 1);
            if (kvd.f9011a.remaining() < 8) {
                throw new kve(kvd.f9011a.position(), kvd.f9011a.limit());
            }
            kvd.f9011a.putLong(j);
        }
        i = this.buildSource;
        if (i != 0) {
            kvd.mo10493b(34, i);
        }
        z = this.isTestDevice;
        if (z) {
            kvd.mo10491a(35, z);
        }
        kvl = this.preferencesEvent;
        if (kvl != null) {
            kvd.mo10496b(36, kvl);
        }
        kvl = this.cameraContentProviderEvent;
        if (kvl != null) {
            kvd.mo10496b(37, kvl);
        }
        kvl = this.launchPhotosReviewEvent;
        if (kvl != null) {
            kvd.mo10496b(38, kvl);
        }
        kvl = this.photoVideoModeChangeEvent;
        if (kvl != null) {
            kvd.mo10496b(39, kvl);
        }
        str = this.appVersionName;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(40, this.appVersionName);
        }
        kvl = this.adviceShown;
        if (kvl != null) {
            kvd.mo10496b(41, kvl);
        }
        kvl = this.preferenceChangeEvent;
        if (kvl != null) {
            kvd.mo10496b(42, kvl);
        }
        kvl = this.irisEvent;
        if (kvl != null) {
            kvd.mo10496b(43, kvl);
        }
        super.writeTo(kvd);
    }
}
