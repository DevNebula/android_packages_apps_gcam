package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ym */
public final class C0794ym extends aaz {
    /* renamed from: x */
    private static aby f22434x = new aby("AndCam2Capabs");

    C0794ym(CameraCharacteristics cameraCharacteristics) {
        super(new abe());
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        for (Range range : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) {
            this.f48b.add(new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()});
        }
        this.f49c.addAll(abw.m83a(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class))));
        for (int valueOf : streamConfigurationMap.getOutputFormats()) {
            this.f50d.add(Integer.valueOf(valueOf));
        }
        this.f51e.addAll(abw.m83a(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class))));
        this.f52f.addAll(abw.m83a(Arrays.asList(streamConfigurationMap.getOutputSizes(256))));
        this.f53g.addAll(this.f50d);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr != null) {
            for (int b : iArr) {
                abd b2 = C0794ym.m14827b(b);
                if (b2 != null) {
                    this.f54h.add(b2);
                }
            }
        }
        this.f55i.add(abb.OFF);
        if (((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue()) {
            this.f55i.add(abb.AUTO);
            this.f55i.add(abb.ON);
            this.f55i.add(abb.TORCH);
            for (int b3 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                if (b3 == 4) {
                    this.f55i.add(abb.RED_EYE);
                }
            }
        }
        iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int b32 : iArr) {
                abc a = C0794ym.m14826a(b32);
                if (a != null) {
                    this.f56j.add(a);
                }
            }
        }
        iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            for (int c : iArr) {
                abf c2 = C0794ym.m14828c(c);
                if (c2 != null) {
                    this.f57k.add(c2);
                }
            }
        }
        Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.f60n = ((Integer) range2.getLower()).intValue();
        this.f61o = ((Integer) range2.getUpper()).intValue();
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        this.f62p = ((float) rational.getNumerator()) / ((float) rational.getDenominator());
        this.f63q = ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
        this.f65s = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
        this.f66t = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        if (mo48a(abc.AUTO)) {
            this.f64r = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            if (this.f64r > 0) {
                this.f58l.add(aba.FOCUS_AREA);
            }
        }
        if (this.f65s > 0) {
            this.f58l.add(aba.METERING_AREA);
        }
        if (this.f66t > 1.0f) {
            this.f58l.add(aba.ZOOM);
        }
    }

    /* renamed from: a */
    public static abc m14826a(int i) {
        switch (i) {
            case 0:
                return abc.FIXED;
            case 1:
                return abc.AUTO;
            case 2:
                return abc.MACRO;
            case 3:
                return abc.CONTINUOUS_VIDEO;
            case 4:
                return abc.CONTINUOUS_PICTURE;
            case 5:
                return abc.EXTENDED_DOF;
            default:
                aby aby = f22434x;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert from API 2 focus mode: ");
                stringBuilder.append(i);
                abx.m91e(aby, stringBuilder.toString());
                return null;
        }
    }

    /* renamed from: b */
    public static abd m14827b(int i) {
        switch (i) {
            case 0:
                return abd.AUTO;
            case 2:
                return abd.ACTION;
            case 3:
                return abd.PORTRAIT;
            case 4:
                return abd.LANDSCAPE;
            case 5:
                return abd.NIGHT;
            case 7:
                return abd.THEATRE;
            case 8:
                return abd.BEACH;
            case 9:
                return abd.SNOW;
            case 10:
                return abd.SUNSET;
            case 11:
                return abd.STEADYPHOTO;
            case 12:
                return abd.FIREWORKS;
            case 13:
                return abd.SPORTS;
            case 14:
                return abd.PARTY;
            case 15:
                return abd.CANDLELIGHT;
            case 16:
                return abd.BARCODE;
            default:
                if (i == abv.f177a) {
                    return abd.HDR;
                }
                aby aby = f22434x;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert from API 2 scene mode: ");
                stringBuilder.append(i);
                abx.m91e(aby, stringBuilder.toString());
                return null;
        }
    }

    /* renamed from: c */
    public static abf m14828c(int i) {
        switch (i) {
            case 1:
                return abf.AUTO;
            case 2:
                return abf.INCANDESCENT;
            case 3:
                return abf.FLUORESCENT;
            case 4:
                return abf.WARM_FLUORESCENT;
            case 5:
                return abf.DAYLIGHT;
            case 6:
                return abf.CLOUDY_DAYLIGHT;
            case 7:
                return abf.TWILIGHT;
            case 8:
                return abf.SHADE;
            default:
                aby aby = f22434x;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert from API 2 white balance: ");
                stringBuilder.append(i);
                abx.m91e(aby, stringBuilder.toString());
                return null;
        }
    }
}
