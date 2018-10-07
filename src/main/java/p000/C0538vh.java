package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: vh */
public final class C0538vh extends ContextWrapper {
    static {
        Object obj = new Object();
    }

    public final AssetManager getAssets() {
        throw new NoSuchMethodError();
    }

    public final Resources getResources() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m6106a(Context context) {
        if (!((context instanceof C0538vh) || (context.getResources() instanceof C0769vj))) {
            context.getResources();
        }
        return context;
    }
}
