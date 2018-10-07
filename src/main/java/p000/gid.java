package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gid */
public final class gid implements iqo, Comparable {
    /* renamed from: a */
    public final long f19184a;
    /* renamed from: b */
    public final long f19185b;
    /* renamed from: c */
    public final long f19186c;
    /* renamed from: d */
    public final int f19187d;
    /* renamed from: e */
    public final float f19188e;
    /* renamed from: f */
    public final float f19189f;
    /* renamed from: g */
    public final int f19190g;
    /* renamed from: h */
    public final long f19191h;
    /* renamed from: i */
    public final Rect f19192i;
    /* renamed from: j */
    public final float f19193j;
    /* renamed from: k */
    private final iwp f19194k;
    /* renamed from: l */
    private final int f19195l;
    /* renamed from: m */
    private final int f19196m;
    /* renamed from: n */
    private final int f19197n;
    /* renamed from: o */
    private final gic[] f19198o;
    /* renamed from: p */
    private final int f19199p;
    /* renamed from: q */
    private final Rect f19200q;

    public gid(iwp iwp, int i, Rect rect) {
        int length;
        this.f19194k = iwp;
        Long l = (Long) this.f19194k.mo13730a(CaptureResult.SENSOR_TIMESTAMP);
        Long valueOf = Long.valueOf(0);
        if (l == null) {
            l = valueOf;
        }
        this.f19184a = l.longValue();
        l = (Long) this.f19194k.mo13730a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l == null) {
            l = valueOf;
        }
        this.f19185b = l.longValue();
        l = (Long) this.f19194k.mo13730a(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW);
        if (l == null) {
            l = valueOf;
        }
        this.f19186c = l.longValue();
        Integer num = (Integer) this.f19194k.mo13730a(CaptureResult.SENSOR_SENSITIVITY);
        Integer valueOf2 = Integer.valueOf(0);
        if (num == null) {
            num = valueOf2;
        }
        this.f19187d = num.intValue();
        Float f = (Float) this.f19194k.mo13730a(CaptureResult.LENS_FOCAL_LENGTH);
        Float valueOf3 = Float.valueOf(0.0f);
        if (f == null) {
            f = valueOf3;
        }
        this.f19188e = f.floatValue();
        f = (Float) this.f19194k.mo13730a(CaptureResult.LENS_FOCUS_DISTANCE);
        if (f != null) {
            valueOf3 = f;
        }
        this.f19189f = valueOf3.floatValue();
        num = (Integer) this.f19194k.mo13730a(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            num = valueOf2;
        }
        this.f19190g = num.intValue();
        num = (Integer) this.f19194k.mo13730a(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            num = valueOf2;
        }
        this.f19195l = num.intValue();
        num = (Integer) this.f19194k.mo13730a(CaptureResult.CONTROL_AWB_STATE);
        if (num != null) {
            valueOf2 = num;
        }
        this.f19196m = valueOf2.intValue();
        num = (Integer) this.f19194k.mo13730a(CaptureResult.LENS_STATE);
        valueOf2 = Integer.valueOf(1);
        if (num == null) {
            num = valueOf2;
        }
        this.f19197n = num.intValue();
        this.f19192i = (Rect) this.f19194k.mo13730a(CaptureResult.SCALER_CROP_REGION);
        if (hsz.f6980h != null) {
            l = (Long) this.f19194k.mo13730a(hsz.f6980h);
            if (l != null) {
                valueOf = l;
            }
            this.f19191h = valueOf.longValue();
        } else {
            this.f19191h = -1;
        }
        if (hsz.f6971B != null) {
            f = (Float) this.f19194k.mo13730a(hsz.f6971B);
            Float valueOf4 = Float.valueOf(1.0f);
            if (f == null) {
                f = valueOf4;
            }
            this.f19193j = f.floatValue();
        } else {
            this.f19193j = 1.0f;
        }
        this.f19199p = i;
        Rect rect2 = new Rect();
        if (rect == null) {
            rect = rect2;
        }
        this.f19200q = rect;
        Face[] faceArr = (Face[]) this.f19194k.mo13730a(CaptureResult.STATISTICS_FACES);
        if (faceArr != null) {
            length = faceArr.length;
        } else {
            length = 0;
        }
        this.f19198o = new gic[length];
        for (int i2 = 0; i2 < length; i2++) {
            Rect rect3;
            Point point;
            gic[] gicArr = this.f19198o;
            gic a = gic.m2614a(faceArr[i2]);
            Rect rect4 = a.f5440a;
            Point point2 = a.f5442c;
            Point point3 = a.f5443d;
            Point point4 = a.f5444e;
            if (rect4 != null) {
                rect3 = new Rect(m11303a(rect4.left), m11305b(rect4.top), m11303a(rect4.right), m11305b(rect4.bottom));
            } else {
                rect3 = null;
            }
            int i3 = a.f5441b;
            if (point2 == null) {
                point2 = null;
            } else {
                point2 = m11304a(a.f5442c);
            }
            if (point3 == null) {
                point3 = null;
            } else {
                point3 = m11304a(a.f5443d);
            }
            if (point4 == null) {
                point = null;
            } else {
                point = m11304a(a.f5444e);
            }
            gicArr[i2] = new gic(rect3, i3, point2, point3, point);
        }
    }

    public final void close() {
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return (this.f19184a > ((gid) obj).f19184a ? 1 : (this.f19184a == ((gid) obj).f19184a ? 0 : -1));
    }

    /* renamed from: a */
    private final Point m11304a(Point point) {
        return new Point(m11303a(point.x), m11305b(point.y));
    }

    /* renamed from: a */
    private final int m11303a(int i) {
        return ((i - this.f19192i.left) * this.f19200q.width()) / this.f19192i.width();
    }

    /* renamed from: b */
    private final int m11305b(int i) {
        return ((i - this.f19192i.top) * this.f19200q.height()) / this.f19192i.height();
    }

    public final String toString() {
        long j = this.f19184a;
        long j2 = this.f19185b;
        long j3 = this.f19186c;
        float f = this.f19188e;
        int i = this.f19187d;
        float f2 = this.f19189f;
        int i2 = this.f19190g;
        int i3 = this.f19195l;
        int i4 = this.f19196m;
        int i5 = this.f19197n;
        String valueOf = String.valueOf(this.f19192i);
        long j4 = this.f19191h;
        float f3 = this.f19193j;
        String arrays = Arrays.toString(this.f19198o);
        int i6 = this.f19199p;
        String valueOf2 = String.valueOf(this.f19200q);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 447) + String.valueOf(arrays).length()) + String.valueOf(valueOf2).length());
        stringBuilder.append("CameraMetadata{, timestampNs=");
        stringBuilder.append(j);
        stringBuilder.append(", exposureTime=");
        stringBuilder.append(j2);
        stringBuilder.append(", rollingShutterTime=");
        stringBuilder.append(j3);
        stringBuilder.append(", focalLength=");
        stringBuilder.append(f);
        stringBuilder.append(", sensorSensitivity=");
        stringBuilder.append(i);
        stringBuilder.append(", focusDistance=");
        stringBuilder.append(f2);
        stringBuilder.append(", aFStatus=");
        stringBuilder.append(i2);
        stringBuilder.append(", aEStatus=");
        stringBuilder.append(i3);
        stringBuilder.append(", aWBStatus=");
        stringBuilder.append(i4);
        stringBuilder.append(", lensStatus=");
        stringBuilder.append(i5);
        stringBuilder.append(", cropRegion=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mTimestampBootime=");
        stringBuilder.append(j4);
        stringBuilder.append(", subjectMotion=");
        stringBuilder.append(f3);
        stringBuilder.append(", faces=");
        stringBuilder.append(arrays);
        stringBuilder.append(", rotationDegrees=");
        stringBuilder.append(i6);
        stringBuilder.append(", activeArraySize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
