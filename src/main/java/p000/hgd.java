package p000;

import android.content.Context;
import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.uiutils.ReplaceableView;

/* compiled from: PG */
/* renamed from: hgd */
public final class hgd implements hhj {
    /* renamed from: a */
    private final kbg f20011a;
    /* renamed from: b */
    private final kbg f20012b;
    /* renamed from: c */
    private final kbg f20013c;
    /* renamed from: d */
    private final kbg f20014d;
    /* renamed from: e */
    private final kwk f20015e;
    /* renamed from: f */
    private final kwk f20016f;
    /* renamed from: g */
    private final kwk f20017g;
    /* renamed from: h */
    private final kwk f20018h;
    /* renamed from: i */
    private final kwk f20019i;
    /* renamed from: j */
    private final kwk f20020j;
    /* renamed from: k */
    private final kwk f20021k;
    /* renamed from: l */
    private final ilp f20022l;
    /* renamed from: m */
    private final ilp f20023m;
    /* renamed from: n */
    private final ilp f20024n;
    /* renamed from: o */
    private final aws f20025o;
    /* renamed from: p */
    private final enr f20026p;
    /* renamed from: q */
    private final Context f20027q;
    /* renamed from: r */
    private final ird f20028r;

    public hgd(kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, aws aws, ilp ilp, ilp ilp2, ilp ilp3, enr enr, Context context, ird ird) {
        this.f20011a = kbg;
        this.f20012b = kbg2;
        this.f20013c = kbg3;
        this.f20014d = kbg4;
        this.f20016f = kwk2;
        this.f20017g = kwk3;
        this.f20023m = ilp2;
        this.f20024n = ilp3;
        this.f20018h = kwk4;
        this.f20015e = kwk;
        this.f20019i = kwk5;
        this.f20020j = kwk6;
        this.f20021k = kwk7;
        this.f20022l = ilp;
        this.f20026p = enr;
        this.f20025o = aws;
        this.f20027q = context;
        this.f20028r = ird;
    }

    /* renamed from: a */
    public final void mo7877a() {
        hkg hkg = ((hes) this.f20015e.mo10566a()).f6486j;
        ((gkb) this.f20017g.mo10566a()).mo7160a(this.f20025o.mo1824a(), (ReplaceableView) hkg.mo7919a((int) R.id.fullscreen_selfie_flash), (BottomBarController) this.f20018h.mo10566a(), new gkd((gal) this.f20016f.mo10566a(), (BottomBarController) this.f20018h.mo10566a(), (hes) this.f20015e.mo10566a(), (Window) this.f20019i.mo10566a()), (his) this.f20021k.mo10566a(), (gui) this.f20020j.mo10566a(), this.f20022l, this.f20024n, this.f20023m, this.f20014d);
        this.f20028r.mo8856a("WireSmarts");
        if (this.f20012b.mo9709b()) {
            hkg.mo7919a((int) R.id.smarts_ui_replaceableview);
            hkg.mo7919a((int) R.id.smarts_ui_overlay);
            hkg.mo7919a((int) R.id.smarts_preview_overlay);
            this.f20028r.mo8856a("SmartsInit");
            ((gpk) this.f20012b.mo9706a()).mo13391b();
            this.f20028r.mo8858b("addObserver");
            this.f20026p.mo6355a((gpk) this.f20012b.mo9706a());
            this.f20028r.mo8857b();
        } else if (this.f20011a.mo9709b()) {
            ((hes) this.f20015e.mo10566a()).f6486j.mo7919a((int) R.id.iris_overlay);
            this.f20028r.mo8856a("IrisController#get");
            ((cdd) this.f20011a.mo9706a()).mo14578c_();
            this.f20028r.mo8858b("addObserver");
            this.f20026p.mo6355a((cdd) this.f20011a.mo9706a());
            this.f20028r.mo8857b();
        }
        this.f20028r.mo8858b("WireMicro");
        if (this.f20013c.mo9709b()) {
            this.f20026p.mo6355a((eth) this.f20013c.mo9706a());
        }
        this.f20028r.mo8858b("WireBottomBar");
        ((BottomBarController) this.f20018h.mo10566a()).wireListeners();
        this.f20028r.mo8857b();
        if (this.f20014d.mo9709b()) {
            ((fbg) this.f20014d.mo9706a()).mo6718a(this.f20027q, (ReplaceableView) hkg.mo7919a((int) R.id.notification_chip));
        }
    }
}
