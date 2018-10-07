package p000;

import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: itg */
public final class itg {
    /* renamed from: b */
    private static final double f7819b = Math.log(2.0d);
    /* renamed from: c */
    private static final Long f7820c = Long.valueOf(1000);
    /* renamed from: a */
    public final ExifInterface f7821a;

    public itg(ExifInterface exifInterface) {
        this.f7821a = exifInterface;
    }

    /* renamed from: a */
    private final void m4256a(int i, Object obj) {
        if (obj != null) {
            ExifInterface exifInterface = this.f7821a;
            exifInterface.mo12669a(exifInterface.mo12668a(i, obj));
        }
    }

    /* renamed from: a */
    public final void mo8999a(Location location) {
        Object obj;
        ExifInterface exifInterface = this.f7821a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        ite a = exifInterface.mo12668a(ExifInterface.f12917E, ExifInterface.m8587a(latitude));
        ite a2 = exifInterface.mo12668a(ExifInterface.f12919G, ExifInterface.m8587a(longitude));
        int i = ExifInterface.f12916D;
        if (latitude >= 0.0d) {
            obj = "N";
        } else {
            obj = "S";
        }
        ite a3 = exifInterface.mo12668a(i, obj);
        int i2 = ExifInterface.f12918F;
        if (longitude >= 0.0d) {
            obj = "E";
        } else {
            obj = "W";
        }
        ite a4 = exifInterface.mo12668a(i2, obj);
        if (!(a == null || a2 == null || a3 == null || a4 == null)) {
            exifInterface.mo12669a(a);
            exifInterface.mo12669a(a2);
            exifInterface.mo12669a(a3);
            exifInterface.mo12669a(a4);
        }
        ExifInterface exifInterface2 = this.f7821a;
        long time = location.getTime();
        ite a5 = exifInterface2.mo12668a(ExifInterface.f12925M, exifInterface2.f13039Q.format(Long.valueOf(time)));
        if (a5 != null) {
            exifInterface2.mo12669a(a5);
            exifInterface2.f13040R.setTimeInMillis(time);
            a5 = exifInterface2.mo12668a(ExifInterface.f12922J, new iqn[]{new iqn((long) exifInterface2.f13040R.get(11), 1), new iqn((long) exifInterface2.f13040R.get(12), 1), new iqn((long) exifInterface2.f13040R.get(13), 1)});
            if (a5 != null) {
                exifInterface2.mo12669a(a5);
            }
        }
        if (location.hasAltitude()) {
            byte b;
            exifInterface = this.f7821a;
            latitude = location.getAltitude();
            ite a6 = exifInterface.mo12668a(ExifInterface.f12921I, new iqn((long) ((int) (Math.abs(latitude) * ((double) ExifInterface.f12926O.longValue()))), ExifInterface.f12926O.longValue()));
            if (latitude >= 0.0d) {
                b = (byte) 0;
            } else {
                b = (byte) 1;
            }
            a4 = exifInterface.mo12668a(ExifInterface.f12920H, Byte.valueOf(b));
            if (a6 != null && a4 != null) {
                exifInterface.mo12669a(a6);
                exifInterface.mo12669a(a4);
            }
        }
    }

    /* renamed from: a */
    public static itg m4255a() {
        return new itg(new ExifInterface());
    }

    /* renamed from: a */
    public static ExifInterface m4252a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.mo12673a(bArr);
        } catch (Throwable e) {
            Log.w("CAM_CameraExif", "Failed to read EXIF data", e);
        }
        return exifInterface;
    }

    /* renamed from: a */
    public final void mo8998a(int i, int i2, iqm iqm, kbg kbg) {
        m4256a(ExifInterface.f13014d, Build.MANUFACTURER);
        m4256a(ExifInterface.f13015e, Build.MODEL);
        ExifInterface exifInterface = this.f7821a;
        int i3 = ExifInterface.f13034x;
        Object valueOf = Integer.valueOf(i);
        exifInterface.mo12669a(exifInterface.mo12668a(i3, valueOf));
        exifInterface = this.f7821a;
        i3 = ExifInterface.f13035y;
        Object valueOf2 = Integer.valueOf(i2);
        exifInterface.mo12669a(exifInterface.mo12668a(i3, valueOf2));
        exifInterface = this.f7821a;
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f12935a, valueOf));
        exifInterface = this.f7821a;
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f12988b, valueOf2));
        exifInterface = this.f7821a;
        exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13017g, Short.valueOf(isx.m4218a(iqm).f7774b)));
        if (kbg.mo9709b()) {
            iwp iwp = (iwp) kbg.mo9706a();
            Long valueOf3 = Long.valueOf(1000000000);
            Long valueOf4 = Long.valueOf(100);
            Long valueOf5 = Long.valueOf(1000);
            Long l = (Long) iwp.mo13730a(CaptureResult.SENSOR_EXPOSURE_TIME);
            int i4 = ExifInterface.f13024n;
            if (l != null) {
                valueOf = new iqn(l.longValue(), valueOf3.longValue());
            } else {
                valueOf = null;
            }
            m4256a(i4, valueOf);
            if (l != null) {
                m4256a(ExifInterface.f13027q, itg.m4253a(Double.valueOf(Math.log(Double.valueOf(((double) l.longValue()) / ((double) valueOf3.longValue())).doubleValue()) / f7819b), valueOf4));
            }
            Object obj = (Integer) iwp.mo13730a(CaptureResult.SENSOR_SENSITIVITY);
            if (obj != null) {
                Integer num = (Integer) iwp.mo13730a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                if (num != null) {
                    obj = Integer.valueOf(obj.intValue() * (num.intValue() / 100));
                }
                m4256a(ExifInterface.f13026p, obj);
            }
            Float f = (Float) iwp.mo13730a(CaptureResult.LENS_APERTURE);
            m4256a(ExifInterface.f13025o, itg.m4254a(f, valueOf4));
            if (f != null) {
                if (f != null) {
                    obj = Double.valueOf(Math.log((double) f.floatValue()) / f7819b);
                } else {
                    obj = null;
                }
                double doubleValue = ((Double) jri.m13404b(obj)).doubleValue();
                m4256a(ExifInterface.f13028r, itg.m4253a(Double.valueOf(doubleValue + doubleValue), valueOf4));
            }
            m4256a(ExifInterface.f13032v, itg.m4254a((Float) iwp.mo13730a(CaptureResult.LENS_FOCAL_LENGTH), valueOf5));
            Integer num2 = (Integer) iwp.mo13730a(CaptureResult.FLASH_STATE);
            if (num2 == null || num2.intValue() != 3) {
                m4256a(ExifInterface.f13031u, Short.valueOf((short) 0));
            } else {
                m4256a(ExifInterface.f13031u, Short.valueOf((short) 1));
            }
            Float f2 = (Float) iwp.mo13730a(CaptureResult.LENS_FOCUS_DISTANCE);
            if (f2 != null) {
                short s;
                if (f2.floatValue() > 1.0E-6f) {
                    float floatValue = 1.0f / f2.floatValue();
                    obj = itg.m4254a(Float.valueOf(floatValue), f7820c);
                    s = floatValue >= 1.0f ? floatValue >= 3.0f ? (short) 3 : (short) 2 : (short) 1;
                } else if (f2.floatValue() >= 0.0f) {
                    obj = new iqn(-1, 1);
                    s = (short) 3;
                } else {
                    obj = new iqn(0, 1);
                    s = (short) 0;
                }
                m4256a(ExifInterface.f13030t, obj);
                m4256a(ExifInterface.f12915C, Short.valueOf(s));
            }
        }
    }

    /* renamed from: a */
    private static iqn m4253a(Double d, Long l) {
        return (d == null || l == null) ? null : new iqn((long) (d.doubleValue() * ((double) l.longValue())), l.longValue());
    }

    /* renamed from: a */
    private static iqn m4254a(Float f, Long l) {
        return (f == null || l == null) ? null : new iqn((long) (f.floatValue() * ((float) l.longValue())), l.longValue());
    }
}
