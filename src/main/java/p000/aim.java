package p000;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: aim */
public final class aim implements ajz {
    /* renamed from: a */
    private static final int f10321a = 22;
    /* renamed from: b */
    private final AssetManager f10322b;
    /* renamed from: c */
    private final ain f10323c;

    public aim(AssetManager assetManager, ain ain) {
        this.f10322b = assetManager;
        this.f10323c = ain;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        return new aka(new arf(uri), this.f10323c.mo329a(this.f10322b, uri.toString().substring(f10321a)));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
