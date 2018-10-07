package p000;

import android.view.WindowManager;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekf */
final class ekf implements aaf {
    /* renamed from: a */
    public final /* synthetic */ ejy f17487a;

    ekf(ejy ejy) {
        this.f17487a = ejy;
    }

    /* renamed from: a */
    public final void mo6a(byte[] bArr) {
        ejy ejy;
        emc emc;
        ejy ejy2 = this.f17487a;
        ejy2.f3949t = false;
        eje eje = ejy2.f3932c;
        WindowManager a = ejy2.f3947r.mo2249a();
        ejy ejy3 = this.f17487a;
        if (eje.mo6233a(a, ejy3.f3946q, ejy3.f3925L, false, 0) != null) {
            this.f17487a.mo6272f();
            ejy = this.f17487a;
            ejy.f3951v = false;
            ejy.f3932c.f3862b.mo13a(ejy.f3924K, new ekg(this));
        }
        ejy3 = this.f17487a;
        float[] a2 = eld.m1903a(ejy3.f3937h.mo6301b());
        String str = new String();
        float f = 0.0f;
        for (int i = 0; i < 9; i++) {
            float f2 = a2[i];
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
            stringBuilder.append(str);
            stringBuilder.append(f2);
            stringBuilder.append(" ");
            str = stringBuilder.toString();
            f += a2[i];
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 16);
        stringBuilder2.append(str);
        stringBuilder2.append(f);
        stringBuilder2.append("\n");
        try {
            ejy3.f3945p.write(stringBuilder2.toString());
            ejy3.f3945p.flush();
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        ejy = this.f17487a;
        ejy.f3915B.post(new ekh(ejy, bArr));
        if (LightCycle.m1335f() == LightCycle.m1336g()) {
            ejy = this.f17487a;
            ejy.f3931b.f4027s = false;
            if (ejy.f3914A == null || LightCycle.m1336g() != 1) {
                emc = this.f17487a.f3955z;
                if (emc != null) {
                    emc.mo6325a(null);
                }
            } else {
                this.f17487a.f3914A.mo6325a(null);
            }
        }
        emc = this.f17487a.f3918E;
        if (emc != null) {
            emc.mo6325a(null);
        }
    }
}
