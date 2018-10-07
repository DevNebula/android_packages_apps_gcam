package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aeo */
public final class aeo implements adw {
    /* renamed from: a */
    private final Uri f10160a;
    /* renamed from: b */
    private final aes f10161b;
    /* renamed from: c */
    private InputStream f10162c;

    private aeo(Uri uri, aes aes) {
        this.f10160a = uri;
        this.f10161b = aes;
    }

    /* renamed from: a */
    public static aeo m6397a(Context context, Uri uri, aer aer) {
        return new aeo(uri, new aes(acc.m98a(context).f190d.mo120a(), aer, acc.m98a(context).f191e, context.getContentResolver(), (byte) 0));
    }

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
        InputStream inputStream = this.f10162c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final Class mo186a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        try {
            int a;
            InputStream aed;
            InputStream b = this.f10161b.mo207b(this.f10160a);
            if (b != null) {
                a = this.f10161b.mo206a(this.f10160a);
            } else {
                a = -1;
            }
            if (a != -1) {
                aed = new aed(b, a);
            } else {
                aed = b;
            }
            this.f10162c = aed;
            adx.mo192a(this.f10162c);
        } catch (Exception e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            adx.mo191a(e);
        }
    }
}
