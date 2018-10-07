package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fgu */
public final class fgu {
    /* renamed from: a */
    public final iqp f4776a;
    /* renamed from: b */
    public final List f4777b;

    fgu(ffc ffc, fyy fyy) {
        iqp iqp;
        this.f4777b = ffc.mo9062b();
        jri.m13405b(this.f4777b.contains(new iqp(0, 0)));
        if (fyy.f5061c.mo9709b() && ((ive) fyy.f5061c.mo9706a()).f7860a == 256) {
            iqp = ((ive) fyy.f5061c.mo9706a()).f7861b;
        } else {
            ive ive = fyy.f5059a;
            if (ive.f7860a != 256) {
                iqp = null;
            } else {
                iqp = ive.f7861b;
            }
        }
        this.f4776a = iqp;
    }
}
