package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* renamed from: akn */
public final class akn implements akb {
    /* renamed from: a */
    private final Resources f10366a;

    public akn(Resources resources) {
        this.f10366a = resources;
    }

    /* renamed from: a */
    public final ajz mo345a(akh akh) {
        return new akl(this.f10366a, akh.mo349a(Uri.class, ParcelFileDescriptor.class));
    }
}
