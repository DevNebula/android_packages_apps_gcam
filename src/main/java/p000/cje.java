package p000;

import android.graphics.SurfaceTexture;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cje */
public final class cje implements kwk {
    /* renamed from: a */
    private final kwk f12611a;
    /* renamed from: b */
    private final kwk f12612b;
    /* renamed from: c */
    private final kwk f12613c;
    /* renamed from: d */
    private final kwk f12614d;
    /* renamed from: e */
    private final kwk f12615e;
    /* renamed from: f */
    private final kwk f12616f;

    private cje(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f12611a = kwk;
        this.f12612b = kwk2;
        this.f12613c = kwk3;
        this.f12614d = kwk4;
        this.f12615e = kwk5;
        this.f12616f = kwk6;
    }

    /* renamed from: a */
    public static cje m8355a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new cje(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f12611a;
        kwk kwk2 = this.f12612b;
        kwk kwk3 = this.f12613c;
        kwk kwk4 = this.f12614d;
        kwk kwk5 = this.f12615e;
        kwk kwk6 = this.f12616f;
        chu chu = (chu) kwk.mo10566a();
        ffc ffc = (ffc) kwk2.mo10566a();
        bkw bkw = (bkw) kwk3.mo10566a();
        kwk4.mo10566a();
        bmb bmb = (bmb) kwk5.mo10566a();
        fyy fyy = (fyy) kwk6.mo10566a();
        if (bmb.mo2022d() || bmb.mo2021c() || bmb.mo2019a()) {
            obj = kgn.f24941a;
        } else {
            if (bkw.mo2005h()) {
                chu.mo2301a(new SurfaceTexture(0), ffc.mo9063b(35), fyy);
                if (chu.mo2298a() != null) {
                    obj = keu.m13727a(chu.mo2298a());
                }
            }
            obj = Collections.emptySet();
        }
        return (Set) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
