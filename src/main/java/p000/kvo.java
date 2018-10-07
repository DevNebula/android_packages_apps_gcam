package p000;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: kvo */
public class kvo {
    /* renamed from: a */
    public static final String f9035a = kvo.class.getSimpleName();
    /* renamed from: b */
    public final PackageManager f9036b;

    public kvo(PackageManager packageManager) {
        jri.m13404b((Object) packageManager);
        this.f9036b = packageManager;
    }

    /* renamed from: a */
    public final String mo10529a(String str, String str2) {
        String str3 = null;
        try {
            Resources resourcesForApplication = this.f9036b.getResourcesForApplication(str);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(str2, "string", str));
        } catch (NameNotFoundException e) {
            Log.w(f9035a, String.format("Application package name '%s' not found.", new Object[]{str}));
            return str3;
        } catch (NotFoundException e2) {
            Log.w(f9035a, String.format("String resource name '%s' not found in package '%s'.", new Object[]{str2, str}));
            return str3;
        }
    }
}
