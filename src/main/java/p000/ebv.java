package p000;

import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* renamed from: ebv */
final class ebv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f3724a;
    /* renamed from: b */
    private final /* synthetic */ RectF f3725b;

    ebv(List list, RectF rectF) {
        this.f3724a = list;
        this.f3725b = rectF;
    }

    public final void run() {
        for (ham a : this.f3724a) {
            a.mo7598a(this.f3725b);
        }
    }
}
