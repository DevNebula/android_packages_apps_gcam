package p000;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* renamed from: gbx */
final class gbx extends OrientationEventListener {
    /* renamed from: a */
    private final /* synthetic */ gbv f5286a;

    public gbx(gbv gbv, Context context) {
        this.f5286a = gbv;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        boolean z = false;
        if (i != -1) {
            iqm a;
            gbv gbv = this.f5286a;
            if (i >= 0 && i < 360) {
                z = true;
            }
            jri.m13395a(z);
            int abs = Math.abs(i - gbv.f5283e.f7692e);
            if (Math.min(abs, 360 - abs) >= 50) {
                a = iqm.m4095a((((i + 45) / 90) * 90) % 360);
            } else {
                a = gbv.f5283e;
            }
            gbv gbv2 = this.f5286a;
            iqm iqm = gbv2.f5283e;
            if (a != iqm) {
                iqz iqz = gbv2.f5284f;
                String valueOf = String.valueOf(iqm);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length());
                stringBuilder.append("DeviceOrientation changing (from:to) ");
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(valueOf2);
                iqz.mo8832b(stringBuilder.toString());
                gbv2 = this.f5286a;
                gbv2.f5283e = a;
                for (gbw gby : gbv2.f5279a) {
                    this.f5286a.f5281c.execute(new gby(gby, a));
                }
            }
        }
    }
}
