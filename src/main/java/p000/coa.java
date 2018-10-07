package p000;

import android.location.Location;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: coa */
final class coa implements Callable {
    /* renamed from: a */
    private final /* synthetic */ File f2409a;

    coa(File file) {
        this.f2409a = file;
    }

    /* renamed from: a */
    private final kbg m1238a() {
        File[] f = jxr.m4737a().mo9614f(this.f2409a);
        int length = f.length;
        int i = 0;
        while (i < length) {
            File file = f[i];
            try {
                Location a = cnz.m1234a(cnz.m1235a(file));
                if (a != null) {
                    return kbg.m4804c(a);
                }
                i++;
            } catch (cob e) {
                String str = cnz.f2404a;
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("Failed to load EXIF from file ");
                stringBuilder.append(valueOf);
                bli.m899e(str, stringBuilder.toString(), e.getCause());
            }
        }
        return kau.f21835a;
    }
}
