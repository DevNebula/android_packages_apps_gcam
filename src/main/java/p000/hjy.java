package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* compiled from: PG */
/* renamed from: hjy */
public final class hjy {
    /* renamed from: a */
    private final Context f6649a;

    public hjy(Context context) {
        this.f6649a = context;
    }

    /* renamed from: a */
    public final boolean mo7918a(String str) {
        jri.m13404b((Object) str);
        try {
            PackageInfo packageInfo = this.f6649a.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0);
            if (packageInfo == null) {
                return false;
            }
            String str2 = packageInfo.versionName;
            if (str2.equals("DEVELOPMENT")) {
                return true;
            }
            return hjy.m3269a(str2, str);
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m3269a(String str, String str2) {
        try {
            if (new hjx(str).compareTo(new hjx(str2)) >= 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(str2).length());
            stringBuilder.append("Fail to check the version between ");
            stringBuilder.append(str);
            stringBuilder.append(" and ");
            stringBuilder.append(str2);
            bli.m891b("PhotosPkgDtr", stringBuilder.toString());
            return false;
        }
    }
}
