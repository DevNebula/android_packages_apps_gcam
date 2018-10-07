package p000;

import android.content.Context;
import android.util.Size;
import android.view.SurfaceHolder;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hmp */
public final class hmp implements hmy {
    /* renamed from: a */
    private final Set f20196a;
    /* renamed from: b */
    private final ird f20197b;

    public hmp(Set set, bsn bsn, ird ird) {
        this.f20196a = set;
        this.f20197b = ird;
    }

    /* renamed from: a */
    public final /* synthetic */ hmx mo7969a(SurfaceHolder surfaceHolder, Size size) {
        hmu hmu = new hmu();
        hmu.getClass();
        iyc a = iye.m12920a(size, new iyd(hmu), this.f20197b, false);
        surfaceHolder.addCallback(new hmv(hmu));
        Set<hml> set = this.f20196a;
        hmx hmr = new hmr(set, a, surfaceHolder.getSurface(), hmu);
        hmr.mo14938b();
        for (hml a2 : set) {
            hmr.f24489a.add(a2.mo7957a().mo13672a(new hms(hmr), kpq.f8776a));
        }
        return hmr;
    }

    /* renamed from: a */
    public final hmz mo7970a(Context context) {
        return new hmq(context);
    }
}
