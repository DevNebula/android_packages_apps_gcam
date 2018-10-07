package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: dll */
public final class dll implements kwk {
    /* renamed from: a */
    private final kwk f14202a;
    /* renamed from: b */
    private final kwk f14203b;
    /* renamed from: c */
    private final kwk f14204c;
    /* renamed from: d */
    private final kwk f14205d;
    /* renamed from: e */
    private final kwk f14206e;
    /* renamed from: f */
    private final kwk f14207f;
    /* renamed from: g */
    private final kwk f14208g;

    public dll(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f14202a = kwk;
        this.f14203b = kwk2;
        this.f14204c = kwk3;
        this.f14205d = kwk4;
        this.f14206e = kwk5;
        this.f14207f = kwk6;
        this.f14208g = kwk7;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f14202a;
        kwk kwk2 = this.f14203b;
        kwk kwk3 = this.f14204c;
        kwk kwk4 = this.f14205d;
        kwk kwk5 = this.f14206e;
        kwk kwk6 = this.f14207f;
        kbg kbg = (kbg) kwk.mo10566a();
        Object obj = (dgb) kwk2.mo10566a();
        bag bag = (bag) kwk3.mo10566a();
        bah bah = (bah) kwk4.mo10566a();
        BottomBarController bottomBarController = (BottomBarController) kwk5.mo10566a();
        hcd hcd = (hcd) kwk6.mo10566a();
        this.f14208g.mo10566a();
        if (kbg.mo9709b()) {
            obj = new cvt(bag, bah, (ezx) kbg.mo9706a(), bottomBarController, hcd);
        }
        return (kpk) ktm.m14219a(kow.m13873a(obj), "Cannot return null from a non-@Nullable @Provides method");
    }
}
