package p000;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;

/* compiled from: PG */
/* renamed from: dwa */
public final class dwa implements kwk {
    /* renamed from: a */
    private final kwk f16887a;
    /* renamed from: b */
    private final kwk f16888b;
    /* renamed from: c */
    private final kwk f16889c;

    private dwa(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16887a = kwk;
        this.f16888b = kwk2;
        this.f16889c = kwk3;
    }

    /* renamed from: a */
    public static dwa m9646a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new dwa(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f16887a;
        kwk kwk2 = this.f16888b;
        kpk kpk = (kpk) kwk.mo10566a();
        iqp iqp = (iqp) kwk2.mo10566a();
        this.f16889c.mo10566a();
        if (iqp.mo8812a() <= 0) {
            String a2 = bli.m887a("ViewfinderModule");
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
            stringBuilder.append("Preview size is invalid (");
            stringBuilder.append(valueOf);
            stringBuilder.append("). using non-deferred config.");
            bli.m898e(a2, stringBuilder.toString());
            a = ivs.m4320a(kpk);
        } else {
            boolean z;
            Class cls = SurfaceTexture.class;
            if (iqp.mo8812a() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "Cannot create a deferred configuration if the size is null.");
            OutputConfiguration a3 = hsx.m3409a(ion.m3997a(iqp), cls);
            if (a3 != null) {
                Object iws = new iws(a3);
                a = new ivs(kow.m13873a(iws), kny.m18475a(kpk, new ivt(iws), kpq.f8776a));
            } else {
                a = ivs.m4320a(kpk);
            }
        }
        return (ivs) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
