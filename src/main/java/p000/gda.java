package p000;

import com.google.googlex.gcam.GoudaProgressCallback;

/* compiled from: PG */
/* renamed from: gda */
final class gda extends GoudaProgressCallback {
    /* renamed from: a */
    private final /* synthetic */ gdv f19061a;

    gda(gdv gdv) {
        this.f19061a = gdv;
    }

    public final void Run(long j, float f) {
        boolean z = false;
        String str = gcv.f19024a;
        StringBuilder stringBuilder = new StringBuilder(68);
        stringBuilder.append("Gouda progress: id = ");
        stringBuilder.append(j);
        stringBuilder.append(" progress = ");
        stringBuilder.append(f);
        bli.m888a(str, stringBuilder.toString());
        gdv gdv = this.f19061a;
        if (gdv != null) {
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            }
            jri.m13395a(z);
            if (f == 0.0f) {
                gdv.f5338b.f25527i = System.currentTimeMillis();
            }
            gdv.f5337a.mo13288a((f * 0.5f) + 0.5f);
        }
    }
}
