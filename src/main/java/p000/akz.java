package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: akz */
public final class akz implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f10376a;

    public akz(ContentResolver contentResolver) {
        this.f10376a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo360a(Uri uri) {
        return new adt(this.f10376a, uri);
    }

    /* renamed from: a */
    public final ajz mo345a(akh akh) {
        return new aky(this);
    }
}
