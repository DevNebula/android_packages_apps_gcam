package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: ala */
public final class ala implements akb, alb {
    /* renamed from: a */
    private final ContentResolver f10377a;

    public ala(ContentResolver contentResolver) {
        this.f10377a = contentResolver;
    }

    /* renamed from: a */
    public final adw mo360a(Uri uri) {
        return new aef(this.f10377a, uri);
    }

    /* renamed from: a */
    public final ajz mo345a(akh akh) {
        return new aky(this);
    }
}
