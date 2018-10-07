package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: alc */
public final class alc implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f10378a;

    public alc(ContentResolver contentResolver) {
        this.f10378a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo360a(Uri uri) {
        return new aem(this.f10378a, uri);
    }

    /* renamed from: a */
    public final ajz mo345a(akh akh) {
        return new aky(this);
    }
}
