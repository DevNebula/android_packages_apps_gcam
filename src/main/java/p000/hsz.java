package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult.Key;
import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: hsz */
public final class hsz {
    /* renamed from: A */
    public static final Integer f6970A;
    /* renamed from: B */
    public static final Key f6971B;
    /* renamed from: C */
    private static final boolean f6972C = hsx.m3413a(hsx.f6964a, 2);
    /* renamed from: a */
    public static final CameraCharacteristics.Key f6973a;
    /* renamed from: b */
    public static final CaptureRequest.Key f6974b;
    /* renamed from: c */
    public static final CaptureRequest.Key f6975c;
    /* renamed from: d */
    public static final Byte f6976d;
    /* renamed from: e */
    public static final Byte f6977e;
    /* renamed from: f */
    public static final Byte f6978f = Byte.valueOf((byte) 2);
    /* renamed from: g */
    public static final Key f6979g;
    /* renamed from: h */
    public static final Key f6980h;
    /* renamed from: i */
    public static final Key f6981i;
    @Deprecated
    /* renamed from: j */
    public static final Key f6982j;
    @Deprecated
    /* renamed from: k */
    public static final Key f6983k;
    /* renamed from: l */
    public static final Key f6984l;
    /* renamed from: m */
    public static final Key f6985m;
    /* renamed from: n */
    public static final Key f6986n;
    /* renamed from: o */
    public static final Key f6987o;
    /* renamed from: p */
    public static final CaptureRequest.Key f6988p;
    /* renamed from: q */
    public static final Integer f6989q;
    /* renamed from: r */
    public static final Key f6990r;
    /* renamed from: s */
    public static final Key f6991s;
    /* renamed from: t */
    public static final CaptureRequest.Key f6992t;
    /* renamed from: u */
    public static final CaptureRequest.Key f6993u;
    /* renamed from: v */
    public static final CameraCharacteristics.Key f6994v;
    /* renamed from: w */
    public static final CameraCharacteristics.Key f6995w;
    /* renamed from: x */
    public static final CameraCharacteristics.Key f6996x;
    /* renamed from: y */
    public static final CameraCharacteristics.Key f6997y;
    /* renamed from: z */
    public static final CaptureRequest.Key f6998z;

    static {
        CameraCharacteristics.Key key;
        CaptureRequest.Key key2;
        Key key3;
        Key key4 = null;
        Byte valueOf = Byte.valueOf((byte) 0);
        Byte valueOf2 = Byte.valueOf((byte) 1);
        if (f6972C) {
            key = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION;
        } else {
            key = null;
        }
        f6973a = key;
        if (f6972C) {
            hsz.m3421g();
        }
        if (!f6972C) {
            key2 = null;
        } else if (hsz.m3421g()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE;
        } else {
            key2 = null;
        }
        f6974b = key2;
        if (f6972C) {
            key2 = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        } else {
            key2 = null;
        }
        f6975c = key2;
        f6976d = valueOf;
        f6977e = valueOf2;
        if (f6972C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        } else {
            key3 = null;
        }
        f6979g = key3;
        if (f6972C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME;
        } else {
            key3 = null;
        }
        f6980h = key3;
        if (f6972C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME;
        } else {
            key3 = null;
        }
        f6981i = key3;
        if (f6972C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X;
        } else {
            key3 = null;
        }
        f6982j = key3;
        if (f6972C) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y;
        } else {
            key3 = null;
        }
        f6983k = key3;
        if (!f6972C) {
            key3 = null;
        } else if (hsz.m3419e()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X;
        } else {
            key3 = null;
        }
        f6984l = key3;
        if (!f6972C) {
            key3 = null;
        } else if (hsz.m3419e()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y;
        } else {
            key3 = null;
        }
        f6985m = key3;
        if (!f6972C) {
            key3 = null;
        } else if (hsz.m3415a()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST;
        } else {
            key3 = null;
        }
        f6986n = key3;
        if (hsz.m3417c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        } else {
            key3 = null;
        }
        f6987o = key3;
        if (hsz.m3417c()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        } else {
            key2 = null;
        }
        f6988p = key2;
        Integer valueOf3 = Integer.valueOf(1);
        f6989q = valueOf3;
        if (hsz.m3417c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        } else {
            key3 = null;
        }
        f6990r = key3;
        if (hsz.m3417c()) {
            key3 = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        } else {
            key3 = null;
        }
        f6991s = key3;
        if (hsz.m3417c()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE;
        } else {
            key2 = null;
        }
        f6992t = key2;
        if (hsz.m3416b()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        } else {
            key2 = null;
        }
        f6993u = key2;
        hsz.m3422h();
        if (f6972C) {
            hsz.m3420f();
        }
        if (f6972C) {
            hsz.m3420f();
        }
        if (f6972C) {
            hsz.m3420f();
        }
        if (!f6972C) {
            key = null;
        } else if (hsz.m3423i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS;
        } else {
            key = null;
        }
        f6994v = key;
        if (!f6972C) {
            key = null;
        } else if (hsz.m3423i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        } else {
            key = null;
        }
        f6995w = key;
        if (!f6972C) {
            key = null;
        } else if (hsz.m3423i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        } else {
            key = null;
        }
        f6996x = key;
        if (!f6972C) {
            key = null;
        } else if (hsz.m3423i()) {
            key = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        } else {
            key = null;
        }
        f6997y = key;
        if (!f6972C) {
            key2 = null;
        } else if (hsz.m3418d()) {
            key2 = ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        } else {
            key2 = null;
        }
        f6998z = key2;
        f6970A = valueOf3;
        if (f6972C) {
            hsz.m3418d();
        }
        if (f6972C) {
            hsz.m3418d();
        }
        if (f6972C && hsz.m3418d()) {
            key4 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        }
        f6971B = key4;
    }

    /* renamed from: a */
    private static boolean m3415a() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 2) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m3416b() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 5) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m3417c() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 4) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m3418d() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 9) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m3419e() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 3) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m3420f() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 7) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m3421g() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() > 0) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m3422h() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 6) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m3423i() {
        if (f6972C) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 10) {
                    return true;
                }
            } catch (NoSuchFieldError e) {
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }
}
