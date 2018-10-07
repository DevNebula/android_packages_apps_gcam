package p000;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ana */
final class ana implements amo {
    /* renamed from: a */
    private final amw f10407a;
    /* renamed from: b */
    private final arl f10408b;

    ana(amw amw, arl arl) {
        this.f10407a = amw;
        this.f10408b = arl;
    }

    /* renamed from: a */
    public final void mo372a(agw agw, Bitmap bitmap) {
        IOException iOException = this.f10408b.f941a;
        if (iOException != null) {
            if (bitmap != null) {
                agw.mo284a(bitmap);
            }
            throw iOException;
        }
    }

    /* renamed from: a */
    public final void mo371a() {
        this.f10407a.mo374a();
    }
}
