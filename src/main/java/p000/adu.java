package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: adu */
public abstract class adu implements adw {
    /* renamed from: a */
    private final String f10145a;
    /* renamed from: b */
    private final AssetManager f10146b;
    /* renamed from: c */
    private Object f10147c;

    public adu(AssetManager assetManager, String str) {
        this.f10146b = assetManager;
        this.f10145a = str;
    }

    /* renamed from: a */
    protected abstract Object mo11621a(AssetManager assetManager, String str);

    /* renamed from: a */
    protected abstract void mo11622a(Object obj);

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
        Object obj = this.f10147c;
        if (obj != null) {
            try {
                mo11622a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        try {
            this.f10147c = mo11621a(this.f10146b, this.f10145a);
            adx.mo192a(this.f10147c);
        } catch (Exception e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            adx.mo191a(e);
        }
    }
}
