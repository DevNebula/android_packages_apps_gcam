package p000;

import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.RgbzMetadataLoader;

/* compiled from: PG */
/* renamed from: cqf */
public final class cqf {
    /* renamed from: a */
    public static boolean m1454a(Context context, err err) {
        boolean z = false;
        erj erj = new erj();
        if (err.mo6540f().f4362a.contains(ert.IS_IMAGE)) {
            int i;
            int i2;
            ezk a = erz.m2143a(context, err.mo6541g().f4384h);
            if (a == null) {
                i = 0;
            } else if (a == erz.f4414a) {
                i = 0;
            } else {
                erj.f4349f = true;
                erj.f4350g = a.f4611b;
                erj.f4351h = a.f4610a;
                erj.f4358o = a.f4612c;
                i = 1;
            }
            i |= RgbzMetadataLoader.loadRgbzMetadata(context, err.mo6541g().f4384h, erj);
            String str = err.mo6541g().f4383g;
            String str2 = err.mo6541g().f4379c;
            if (err.mo6540f().f4362a.contains(ert.IS_ANIMATION) && str2.startsWith("Burst_Cover_GIF_Action_")) {
                erj.f4355l = true;
                i2 = 1;
            } else if (eio.m1805a(str) && str2.startsWith("Burst_Cover_Collage_")) {
                erj.f4356m = true;
                i2 = 1;
            }
            z = dgd.m9185a(erj, err) | (i | i2);
        } else if (err.mo6540f().f4362a.contains(ert.IS_VIDEO)) {
            z = erk.m2079a(erj, err.mo6541g().f4383g);
        } else if (err.mo6540f().f4362a.contains(ert.IS_BURST) && err.mo6539e() == C0252go.f5844aq) {
            erj.f4353j = true;
            erj.f4354k = ((cou) err).mo14825d();
            dgd.m9185a(erj, err);
            z = true;
        }
        erj.f4344a = true;
        err.mo6531a(erj.mo6522a());
        return z;
    }
}
