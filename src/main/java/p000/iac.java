package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: iac */
public final class iac {
    /* renamed from: a */
    public final Context f7236a;

    public iac(Context context) {
        this.f7236a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo mo8298a(String str, int i) {
        return this.f7236a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public final PackageInfo mo8299b(String str, int i) {
        return this.f7236a.getPackageManager().getPackageInfo(str, i);
    }
}
