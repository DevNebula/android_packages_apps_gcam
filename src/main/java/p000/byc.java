package p000;

import android.system.ErrnoException;
import android.system.Os;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamSwigLoader;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.JniUtilsJniLoader;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.HalideRuntime;
import com.google.googlex.gcam.image.ImageJniLoader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: byc */
public final class byc {
    /* renamed from: a */
    private static final String f1745a = bli.m887a("HdrPlusModule");

    static {
        GcamSwigLoader.initialize();
        JniUtilsJniLoader.initialize();
        ImageJniLoader.initialize();
    }

    /* renamed from: a */
    public static brx m1080a() {
        return bxg.f1718f;
    }

    /* renamed from: b */
    public static brx m1083b() {
        return bxg.f1715c;
    }

    /* renamed from: c */
    public static brx m1084c() {
        return bxg.f1714b;
    }

    /* renamed from: d */
    public static brx m1085d() {
        return bxg.f1716d;
    }

    /* renamed from: e */
    public static brx m1086e() {
        return bxg.f1717e;
    }

    /* renamed from: a */
    public static byy m1081a(bkw bkw, era era, bxg bxg, fgw fgw, bku bku) {
        return new byy(bkw, era, bxg, fgw, bku);
    }

    /* renamed from: a */
    public static Gcam m1082a(fbn fbn, fhc fhc, byy byy, ird ird, cbd cbd, fgw fgw, kbg kbg) {
        iqz iqz;
        StringBuilder stringBuilder;
        ird.mo8856a("Gcam#provide");
        if (HalideRuntime.checkGcamHalideRuntime()) {
            bli.m894c(f1745a, "HalideRuntime.checkGcamHalideRuntime -> OK");
        } else {
            bli.m891b(f1745a, "HalideRuntime.checkGcamHalideRuntime -> Failed");
        }
        InitParams initParams = byy.f1749b;
        StaticMetadataVector staticMetadataVector = new StaticMetadataVector();
        iut[] iutArr = new iut[]{iut.BACK, iut.FRONT};
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                break;
            }
            iut iut = iutArr[i2];
            if (fhc.f4781a != C0252go.f5849av) {
                for (iur iur : fbn.mo9089a(iut)) {
                    if (!(iur == null || iur.f7848b == null)) {
                        staticMetadataVector.add(bya.m1069a(fbn.mo13218b(iur)));
                    }
                }
            }
            i = i2 + 1;
        }
        DebugParams a = bxe.m1058a(fgw, false);
        i = initParams.getExecute_finish_on();
        if (i != 1) {
            Object obj;
            if (i == 4) {
                obj = 1;
            } else if (i == 6) {
                obj = 1;
            } else if (i == 3) {
                obj = 1;
            } else if (i != 5) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null && kbg.mo9709b()) {
                ((gco) kbg.mo9706a()).mo7044a();
            }
        } else {
            String valueOf;
            try {
                cbd.f1860a.mo8836d("Will attempt to load libadsprpc.so from the system partition");
                cbd.f1860a.mo8836d("Loading libhalide_hexagon_host.so from the app");
                System.loadLibrary("halide_hexagon_host_app");
                try {
                    String str = cbd.f1861b.getApplicationInfo().dataDir;
                    cbd.f1862c.mo8856a("HexagonEnvironment#copyHexagonRemoteToDisk");
                    String concat = String.valueOf(str).concat("/libhalide_hexagon_remote_skel.so");
                    iqz iqz2 = cbd.f1860a;
                    valueOf = String.valueOf(concat);
                    String str2 = "Writing libhalide_hexagon_remote_skel.so to ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    iqz2.mo8836d(valueOf);
                    InputStream openRawResource = cbd.f1861b.getResources().openRawResource(R.raw.libhalide_hexagon_remote_skel);
                    OutputStream fileOutputStream = new FileOutputStream(concat);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openRawResource.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    openRawResource.close();
                    fileOutputStream.close();
                    cbd.f1862c.mo8857b();
                    str = String.valueOf(str).concat(";/dsp");
                    try {
                        iqz iqz3 = cbd.f1860a;
                        String str3 = "ADSP_LIBRARY_PATH=";
                        valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str3);
                        } else {
                            valueOf = str3.concat(valueOf);
                        }
                        iqz3.mo8836d(valueOf);
                        Os.setenv("ADSP_LIBRARY_PATH", str, true);
                    } catch (ErrnoException e) {
                        iqz = cbd.f1860a;
                        valueOf = String.valueOf(e);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        stringBuilder.append("Failed to set ADSP_LIBRARY_PATH: ");
                        stringBuilder.append(valueOf);
                        iqz.mo8838f(stringBuilder.toString());
                    }
                } catch (Exception e2) {
                    iqz = cbd.f1860a;
                    valueOf = String.valueOf(e2);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    stringBuilder.append("Error initializing Hexagon: ");
                    stringBuilder.append(valueOf);
                    iqz.mo8838f(stringBuilder.toString());
                }
            } catch (UnsatisfiedLinkError e3) {
                iqz = cbd.f1860a;
                valueOf = String.valueOf(e3);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                stringBuilder.append("Failed to load Hexagon library: ");
                stringBuilder.append(valueOf);
                iqz.mo8838f(stringBuilder.toString());
            }
        }
        Gcam Create = Gcam.Create(initParams, staticMetadataVector, a);
        ird.mo8857b();
        return Create;
    }
}
