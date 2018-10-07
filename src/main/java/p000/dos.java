package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* renamed from: dos */
final class dos implements kaw {
    /* renamed from: a */
    private final /* synthetic */ bkw f14279a;
    /* renamed from: b */
    private final /* synthetic */ hjf f14280b;

    dos(bkw bkw, hjf hjf) {
        this.f14279a = bkw;
        this.f14280b = hjf;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        ffc ffc = (ffc) obj;
        kbg a = dor.m1711a(ffc, this.f14279a);
        String str;
        String valueOf;
        if (a.mo9709b()) {
            str = dor.f3379a;
            valueOf = String.valueOf(((fhd) a.mo9706a()).name());
            String str2 = "Camera support level override: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m894c(str, valueOf);
            return (fhd) a.mo9706a();
        }
        hjf hjf = this.f14280b;
        ivy ivy = hjf.f6633b;
        if (ivy.f7874d || ivy.f7875e || hjf.mo7905c()) {
            return fhd.NEXUS_2015;
        }
        if (!this.f14280b.mo7906d()) {
            Integer num = (Integer) ffc.mo9056a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num == null) {
                bli.m891b(dor.f3379a, "Device does not report supported hardware level.");
                return fhd.LIMITED_JPEG;
            } else if (num.intValue() == 2) {
                return fhd.LEGACY_JPEG;
            } else {
                if (num.intValue() == 1) {
                    List b = ffc.mo9063b(35);
                    List a2 = ffc.mo9059a(35);
                    if (b.size() <= 0 || a2.size() <= 0) {
                        return fhd.ZSL;
                    }
                    return fhd.ZSL_REPROCESSING;
                } else if (num.intValue() == 0) {
                    return fhd.LIMITED_JPEG;
                } else {
                    String str3 = dor.f3379a;
                    valueOf = String.valueOf(num);
                    str = Build.DEVICE;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(str).length());
                    stringBuilder.append("Unknown device or support level: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" / ");
                    stringBuilder.append(str);
                    bli.m891b(str3, stringBuilder.toString());
                    return fhd.LIMITED_JPEG;
                }
            }
        } else if (ffc.mo9087z()) {
            return fhd.ZSL;
        } else {
            return fhd.NEXUS_2015;
        }
    }
}
