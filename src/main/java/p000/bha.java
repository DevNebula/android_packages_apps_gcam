package p000;

import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: bha */
final class bha implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f1168a;
    /* renamed from: b */
    private final /* synthetic */ kpw f1169b;
    /* renamed from: c */
    private final /* synthetic */ bhj f1170c;
    /* renamed from: d */
    private final /* synthetic */ iwn f1171d;
    /* renamed from: e */
    private final /* synthetic */ bhs f1172e;
    /* renamed from: f */
    private final /* synthetic */ iwn f1173f;
    /* renamed from: g */
    private final /* synthetic */ bgx f1174g;

    bha(bgx bgx, List list, kpw kpw, bhj bhj, iwn iwn, bhs bhs, iwn iwn2) {
        this.f1174g = bgx;
        this.f1168a = list;
        this.f1169b = kpw;
        this.f1170c = bhj;
        this.f1171d = iwn;
        this.f1172e = bhs;
        this.f1173f = iwn2;
    }

    public final void run() {
        for (Surface isValid : this.f1168a) {
            if (!isValid.isValid()) {
                bli.m891b(bgx.f11345a, "Surface is not valid anymore, skipped");
                this.f1169b.mo15641a(aua.m720b());
                return;
            }
        }
        try {
            this.f1170c.mo12379a(fiv.REPEATING, this.f1171d, this.f1174g.f11346b, this.f1172e);
            this.f1170c.mo12379a(fiv.NON_REPEATING, this.f1173f, this.f1174g.f11346b, this.f1172e);
        } catch (Throwable e) {
            this.f1169b.mo15642a(e);
        }
    }
}
