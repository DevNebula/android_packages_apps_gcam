package p000;

import com.google.googlex.gcam.SimpleCallback;

/* compiled from: PG */
/* renamed from: bza */
final class bza extends SimpleCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f12030a;

    bza(byy byy) {
        this.f12030a = byy;
    }

    public final void Run() {
        if (!this.f12030a.f1750c.isEmpty()) {
            bli.m891b(byy.f1748a, String.format(null, "HDR+ is idle, but we have %d shots in flight", new Object[]{Integer.valueOf(this.f12030a.f1750c.size())}));
        }
    }
}
