package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: aek */
public abstract class aek implements adw {
    /* renamed from: a */
    private final Uri f10157a;
    /* renamed from: b */
    private final ContentResolver f10158b;
    /* renamed from: c */
    private Object f10159c;

    public aek(ContentResolver contentResolver, Uri uri) {
        this.f10158b = contentResolver;
        this.f10157a = uri;
    }

    /* renamed from: a */
    protected abstract Object mo11623a(Uri uri, ContentResolver contentResolver);

    /* renamed from: a */
    protected abstract void mo11624a(Object obj);

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
        Object obj = this.f10159c;
        if (obj != null) {
            try {
                mo11624a(obj);
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
            this.f10159c = mo11623a(this.f10157a, this.f10158b);
            adx.mo192a(this.f10159c);
        } catch (Exception e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            adx.mo191a(e);
        }
    }
}
