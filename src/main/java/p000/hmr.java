package p000;

import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hmr */
final class hmr implements hmx {
    /* renamed from: a */
    public final List f24489a = new ArrayList();
    /* renamed from: b */
    private final Set f24490b;
    /* renamed from: c */
    private final iyc f24491c;
    /* renamed from: d */
    private final Surface f24492d;
    /* renamed from: e */
    private final hmu f24493e;

    hmr(Set set, iyc iyc, Surface surface, hmu hmu) {
        this.f24490b = set;
        this.f24491c = iyc;
        this.f24493e = hmu;
        this.f24492d = surface;
    }

    public final void close() {
        try {
            for (iqo close : this.f24489a) {
                close.close();
            }
            this.f24491c.close();
            this.f24492d.release();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final kpk mo13545a() {
        return this.f24491c.mo9171a();
    }

    /* renamed from: a */
    public final void mo13546a(Size size) {
        this.f24491c.mo9172a(this.f24492d, size);
    }

    /* renamed from: b */
    public final void mo14938b() {
        iyc iyc = this.f24491c;
        ArrayList arrayList = new ArrayList(this.f24490b);
        Collections.sort(arrayList, hmt.f6737a);
        List arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            hml hml = (hml) arrayList.get(i);
            if (((Boolean) hml.mo7957a().mo13673b()).booleanValue()) {
                arrayList2.add(hml.mo7958b().mo7960a());
                i = i2;
            } else {
                i = i2;
            }
        }
        iyc.mo9174a(arrayList2);
    }

    /* renamed from: a */
    public final void mo13547a(iqm iqm) {
        this.f24491c.mo9173a(iqm);
        this.f24493e.mo7962a(iqm);
    }
}
