package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: ggh */
public final class ggh implements gfj {
    /* renamed from: a */
    private kpw f24350a = kpw.m18486d();
    /* renamed from: b */
    private gfw f24351b;

    public final void close() {
        Object obj = this.f24351b;
        if (obj == null) {
            this.f24350a.mo15641a(Collections.emptySet());
        } else {
            this.f24350a.mo15641a(keu.m13727a(obj));
        }
    }

    /* renamed from: a */
    public final kpk mo13340a() {
        return this.f24350a;
    }

    /* renamed from: a */
    public final void mo13341a(gfw gfw, get get) {
        gfw gfw2 = this.f24351b;
        if (gfw2 == null || gfw2.f5387b.mo13744f() < gfw.f5387b.mo13744f()) {
            gfw2 = this.f24351b;
            if (gfw2 != null) {
                gfw2.f5387b.close();
            }
            this.f24351b = gfw;
            return;
        }
        gfw.f5387b.close();
    }
}
