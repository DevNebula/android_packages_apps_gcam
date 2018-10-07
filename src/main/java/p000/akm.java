package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: akm */
public final class akm implements akb {
    /* renamed from: a */
    private final Resources f10365a;

    public akm(Resources resources) {
        this.f10365a = resources;
    }

    /* renamed from: a */
    public final ajz mo345a(akh akh) {
        return new akl(this.f10365a, akh.mo349a(Uri.class, AssetFileDescriptor.class));
    }
}
