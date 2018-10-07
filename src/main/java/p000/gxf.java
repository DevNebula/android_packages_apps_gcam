package p000;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gxf */
public final class gxf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RectF f6113a;
    /* renamed from: b */
    private final /* synthetic */ gxc f6114b;

    public gxf(gxc gxc, RectF rectF) {
        this.f6114b = gxc;
        this.f6113a = rectF;
    }

    public final void run() {
        String str = gxc.f6103a;
        String valueOf = String.valueOf(this.f6113a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("configurePreviewDimensions(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        bli.m896d(str, stringBuilder.toString());
        this.f6114b.f6104b.mo7491a();
    }
}
