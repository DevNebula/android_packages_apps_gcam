package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* renamed from: akl */
public final class akl implements ajz {
    /* renamed from: a */
    private final ajz f10363a;
    /* renamed from: b */
    private final Resources f10364b;

    public akl(Resources resources, ajz ajz) {
        this.f10364b = resources;
        this.f10363a = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Uri a = m6624a((Integer) obj);
        return a != null ? this.f10363a.mo343a(a, i, i2, adp) : null;
    }

    /* renamed from: a */
    private final Uri m6624a(Integer num) {
        String resourceTypeName;
        try {
            String resourcePackageName = this.f10364b.getResourcePackageName(num.intValue());
            resourceTypeName = this.f10364b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.f10364b.getResourceEntryName(num.intValue());
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(resourcePackageName).length() + 21) + String.valueOf(resourceTypeName).length()) + String.valueOf(resourceEntryName).length());
            stringBuilder.append("android.resource://");
            stringBuilder.append(resourcePackageName);
            stringBuilder.append('/');
            stringBuilder.append(resourceTypeName);
            stringBuilder.append('/');
            stringBuilder.append(resourceEntryName);
            return Uri.parse(stringBuilder.toString());
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                resourceTypeName = String.valueOf(num);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(resourceTypeName).length() + 30);
                stringBuilder2.append("Received invalid resource id: ");
                stringBuilder2.append(resourceTypeName);
                Log.w("ResourceLoader", stringBuilder2.toString(), e);
            }
            return null;
        }
    }
}
