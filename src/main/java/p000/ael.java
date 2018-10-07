package p000;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ael */
public final class ael extends adu {
    public ael(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo11622a(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: a */
    public final Class mo186a() {
        return InputStream.class;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo11621a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
