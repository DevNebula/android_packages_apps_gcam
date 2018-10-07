package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* renamed from: als */
public final class als implements adr {
    /* renamed from: a */
    private final agw f22481a;
    /* renamed from: b */
    private final adr f22482b;

    public als(agw agw, adr adr) {
        this.f22481a = agw;
        this.f22482b = adr;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo168a(Object obj, File file, adp adp) {
        return this.f22482b.mo168a(new alv(((BitmapDrawable) ((agn) obj).mo262b()).getBitmap(), this.f22481a), file, adp);
    }

    /* renamed from: a */
    public final adh mo11619a(adp adp) {
        return this.f22482b.mo11619a(adp);
    }
}
