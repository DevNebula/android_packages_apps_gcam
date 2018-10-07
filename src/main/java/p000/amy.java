package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: amy */
public final class amy implements adq {
    /* renamed from: a */
    private final ans f10403a;
    /* renamed from: b */
    private final agw f10404b;

    public amy(ans ans, agw agw) {
        this.f10403a = ans;
        this.f10404b = agw;
    }

    /* renamed from: a */
    public final /* synthetic */ agn mo179a(Object obj, int i, int i2, adp adp) {
        agn a = this.f10403a.mo179a((Uri) obj);
        if (a == null) {
            return null;
        }
        return amp.m354a(this.f10404b, (Drawable) a.mo262b(), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo180a(Object obj, adp adp) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
