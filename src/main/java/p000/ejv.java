package p000;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ejv */
public final class ejv {
    /* renamed from: a */
    public static final ejw f3903a;
    /* renamed from: b */
    private static final String f3904b = bli.m887a("DeviceManager");
    /* renamed from: c */
    private static final Map f3905c = new HashMap();

    static {
        ejv.m1860a("LGE", "hammerhead", new ejw(-1.0f, true));
        ejv.m1860a("LGE", "g3", new ejw(-1.0f, true));
        ejv.m1860a("LGE", "b1", new ejw(-1.0f, true));
        ejv.m1860a("LGE", "b1w", new ejw(-1.0f, true));
        ejv.m1860a("HTC", "m7", new ejw(56.69f, false));
        ejv.m1860a("HTC", "m7cdtu", new ejw(56.69f, false));
        ejv.m1860a("HTC", "m7cdug", new ejw(56.69f, false));
        ejv.m1860a("HTC", "m7cdwg", new ejw(56.69f, false));
        ejv.m1860a("HTC", "m7wls", new ejw(56.69f, false));
        ejv.m1860a("HTC", "m7wlv", new ejw(56.69f, false));
        ejv.m1860a("motorola", "ghost", new ejw(53.0f, false));
        ejv.m1860a("Default", "", new ejw(-1.0f, false));
        String str = Build.BRAND;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
        stringBuilder.append("Brand : '");
        stringBuilder.append(str);
        stringBuilder.append("' ");
        str = String.valueOf(stringBuilder.toString());
        String str2 = Build.MANUFACTURER;
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Manufacturer : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = String.valueOf(stringBuilder2.toString());
        str2 = Build.DEVICE;
        stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Device : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = String.valueOf(stringBuilder2.toString());
        str2 = Build.MODEL;
        stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Model : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = String.valueOf(stringBuilder2.toString());
        str2 = Build.HARDWARE;
        stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Hardware : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = String.valueOf(stringBuilder2.toString());
        str2 = Build.PRODUCT;
        stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Product : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = String.valueOf(stringBuilder2.toString());
        str2 = Build.BOARD;
        stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str2).length());
        stringBuilder2.append(str);
        stringBuilder2.append("Board : '");
        stringBuilder2.append(str2);
        stringBuilder2.append("' ");
        str = stringBuilder2.toString();
        str2 = f3904b;
        str = String.valueOf(str);
        String str3 = "Build : \n";
        if (str.length() == 0) {
            str = new String(str3);
        } else {
            str = str3.concat(str);
        }
        bli.m888a(str2, str);
        f3905c.containsKey(ejv.m1864c());
        ejw ejw = (ejw) f3905c.get(ejv.m1864c());
        if (ejw == null) {
            ejw = (ejw) f3905c.get("Default");
        }
        f3903a = ejw;
    }

    /* renamed from: a */
    private static void m1860a(String str, String str2, ejw ejw) {
        Object str3;
        Map map = f3905c;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        if (valueOf2.length() == 0) {
            str3 = new String(valueOf);
        } else {
            str3 = valueOf.concat(valueOf2);
        }
        map.put(str3, ejw);
    }

    /* renamed from: a */
    public static float m1859a(float f) {
        if (f3903a.f3906a > 0.0f) {
            return f3903a.f3906a;
        }
        if (f <= 160.0f) {
            return f;
        }
        String str = f3904b;
        StringBuilder stringBuilder = new StringBuilder(68);
        stringBuilder.append("Reported FOV is larger than the maximum allowed at : ");
        stringBuilder.append(f);
        bli.m898e(str, stringBuilder.toString());
        return 55.0f;
    }

    /* renamed from: c */
    private static String m1864c() {
        String valueOf = String.valueOf(Build.MANUFACTURER);
        String valueOf2 = String.valueOf(Build.DEVICE);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static boolean m1861a() {
        return Build.MODEL.startsWith("GalaxySZ");
    }

    /* renamed from: b */
    public static boolean m1863b() {
        return Build.MODEL.startsWith("Nexus 5");
    }

    /* renamed from: a */
    public static boolean m1862a(double d) {
        return Math.abs(d) > 8.0d;
    }
}
