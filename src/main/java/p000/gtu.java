package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import java.io.File;

@TargetApi(8)
/* compiled from: PG */
/* renamed from: gtu */
public final class gtu {
    static {
        bli.m887a("StorageModule");
    }

    /* renamed from: a */
    public static kbg m2876a(Context context) {
        return kbg.m4803b(context.getExternalCacheDir());
    }

    /* renamed from: a */
    public static gsx m2875a() {
        return new gsy(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
    }
}
