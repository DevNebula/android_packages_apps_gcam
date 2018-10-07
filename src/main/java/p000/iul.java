package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iul */
final class iul implements iun {
    /* renamed from: e */
    private final Object f21282e;
    /* renamed from: f */
    private final CameraCharacteristics f21283f;
    /* renamed from: g */
    private final iur f21284g;
    /* renamed from: h */
    private final ivx f21285h;
    /* renamed from: i */
    private final ird f21286i;
    /* renamed from: j */
    private final iqz f21287j;
    /* renamed from: k */
    private StreamConfigurationMap f21288k = null;

    iul(iur iur, CameraCharacteristics cameraCharacteristics, ivx ivx, ird ird, iqz iqz) {
        jri.m13404b((Object) cameraCharacteristics);
        this.f21284g = iur;
        this.f21283f = cameraCharacteristics;
        this.f21285h = ivx;
        this.f21286i = ird;
        this.f21287j = iqz.mo8830a("Characteristics");
        this.f21282e = new Object();
    }

    /* renamed from: a */
    public final Object mo9056a(Key key) {
        return this.f21283f.get(key);
    }

    /* renamed from: a */
    public final Object mo9057a(Key key, Object obj) {
        Object obj2 = this.f21283f.get(key);
        return obj2 == null ? obj : obj2;
    }

    /* renamed from: a */
    public final List mo9058a() {
        float[] fArr = (float[]) mo9057a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS, f7844b);
        if (fArr.length == 0) {
            return Collections.emptyList();
        }
        return new kmi(fArr);
    }

    /* renamed from: b */
    public final List mo9062b() {
        return ion.m4006a((Size[]) mo9057a(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES, f7845c));
    }

    /* renamed from: c */
    public final iut mo9064c() {
        int intValue = ((Integer) mo9061b(CameraCharacteristics.LENS_FACING)).intValue();
        if (intValue == 1) {
            return iut.BACK;
        }
        if (intValue == 0) {
            return iut.FRONT;
        }
        return iut.EXTERNAL;
    }

    /* renamed from: d */
    public final iur mo9065d() {
        return this.f21284g;
    }

    /* renamed from: b */
    public final Object mo9061b(Key key) {
        return jri.m13404b(this.f21283f.get(key));
    }

    /* renamed from: e */
    public final List mo9066e() {
        return Arrays.asList((Range[]) mo9061b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: f */
    public final float mo9067f() {
        if (!mo9081t()) {
            return -1.0f;
        }
        Rational rational = (Rational) mo9057a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, Rational.ZERO);
        return ((float) rational.getNumerator()) / ((float) rational.getDenominator());
    }

    /* renamed from: g */
    public final List mo9068g() {
        Object obj = (float[]) this.f21283f.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        jri.m13404b(obj);
        Arrays.sort(obj);
        List b = khb.m4945b();
        for (float valueOf : obj) {
            b.add(Float.valueOf(valueOf));
        }
        return b;
    }

    /* renamed from: a_ */
    public final List mo9060a_(iqp iqp) {
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return Collections.emptyList();
        }
        Range[] highSpeedVideoFpsRangesFor = B.getHighSpeedVideoFpsRangesFor(ion.m3997a(iqp));
        if (highSpeedVideoFpsRangesFor == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(highSpeedVideoFpsRangesFor);
    }

    /* renamed from: h */
    public final List mo9069h() {
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return Collections.emptyList();
        }
        Size[] highSpeedVideoSizes = B.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return Collections.emptyList();
        }
        List a = ion.m4006a(highSpeedVideoSizes);
        return Arrays.asList((iqp[]) a.toArray(new iqp[a.size()]));
    }

    /* renamed from: i */
    public final ius mo9070i() {
        List arrayList = new ArrayList(r3);
        for (int a : (int[]) mo9057a(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES, f7843a)) {
            arrayList.add(ius.m4315a(a));
        }
        if (arrayList.contains(ius.FULL)) {
            return ius.FULL;
        }
        if (arrayList.contains(ius.SIMPLE)) {
            return ius.SIMPLE;
        }
        return ius.NONE;
    }

    /* renamed from: j */
    public final int mo9071j() {
        if (mo9081t()) {
            return ((Integer) ((Range) mo9061b(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue();
        }
        return -1;
    }

    /* renamed from: k */
    public final float mo9072k() {
        return ((Float) mo9057a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
    }

    /* renamed from: l */
    public final int mo9073l() {
        if (mo9081t()) {
            return ((Integer) ((Range) mo9061b(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower()).intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo9055a(int i, iqp iqp) {
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return 0;
        }
        return B.getOutputMinFrameDuration(i, ion.m3997a(iqp));
    }

    /* renamed from: m */
    public final byte[] mo9074m() {
        byte[] bArr = f7846d;
        if (hsz.f6973a != null) {
            return (byte[]) mo9057a(hsz.f6973a, f7846d);
        }
        return bArr;
    }

    /* renamed from: n */
    public final Rect mo9075n() {
        return (Rect) mo9061b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    /* renamed from: o */
    public final int mo9076o() {
        return ((Integer) mo9061b(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    /* renamed from: B */
    private final StreamConfigurationMap m12711B() {
        StreamConfigurationMap streamConfigurationMap;
        synchronized (this.f21282e) {
            if (this.f21288k == null) {
                String str;
                try {
                    ird ird = this.f21286i;
                    str = this.f21284g.f7848b;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
                    stringBuilder.append("StreamConfigurationMap(");
                    stringBuilder.append(str);
                    stringBuilder.append(")#create");
                    ird.mo8856a(stringBuilder.toString());
                    this.f21288k = (StreamConfigurationMap) mo9056a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                } catch (Throwable e) {
                    iqz iqz = this.f21287j;
                    String str2 = "Unable to obtain StreamConfigurationMap for camera ";
                    str = String.valueOf(this.f21284g.f7848b);
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    iqz.mo8833b(str, e);
                    return null;
                } finally {
                    this.f21286i.mo8857b();
                }
            }
            streamConfigurationMap = this.f21288k;
        }
        return streamConfigurationMap;
    }

    /* renamed from: p */
    public final int mo9077p() {
        return C0252go.m2700a(((Integer) mo9061b(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue());
    }

    /* renamed from: a */
    public final List mo9059a(int i) {
        if (!this.f21285h.f7866a) {
            return Collections.emptyList();
        }
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m4006a(B.getInputSizes(i));
    }

    /* renamed from: b */
    public final List mo9063b(int i) {
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m4006a(B.getOutputSizes(i));
    }

    /* renamed from: q */
    public final List mo9078q() {
        StreamConfigurationMap B = m12711B();
        if (B == null) {
            return Collections.emptyList();
        }
        return ion.m4006a(B.getOutputSizes(SurfaceTexture.class));
    }

    /* renamed from: r */
    public final boolean mo9079r() {
        Integer num = (Integer) mo9056a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return num != null && num.intValue() > 0;
    }

    /* renamed from: s */
    public final boolean mo9080s() {
        Integer num = (Integer) mo9056a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Float f = (Float) mo9056a(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (num != null && num.intValue() > 0 && f != null && f.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo9081t() {
        boolean z;
        Range range = (Range) mo9056a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null) {
            z = false;
        } else if (range.getLower() != null && ((Integer) range.getLower()).intValue() != 0) {
            z = true;
        } else if (range.getUpper() == null) {
            z = false;
        } else if (((Integer) range.getUpper()).intValue() != 0) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    public final boolean mo9082u() {
        return mo9083v() || mo9064c() == iut.FRONT;
    }

    /* renamed from: v */
    public final boolean mo9083v() {
        return ((Boolean) mo9057a(CameraCharacteristics.FLASH_INFO_AVAILABLE, Boolean.valueOf(false))).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo9084w() {
        try {
            return this.f21283f.getAvailableCaptureRequestKeys().contains(CaptureRequest.CONTROL_ENABLE_ZSL);
        } catch (NoSuchFieldError e) {
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo9085x() {
        for (int i : (int[]) mo9057a(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES, f7843a)) {
            if (i == 18) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo9086y() {
        for (int i : (int[]) mo9057a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, f7843a)) {
            if (i == 9) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo9087z() {
        for (int i : (int[]) this.f21283f.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public final boolean mo9054A() {
        for (int i : (int[]) mo9057a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, f7843a)) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
