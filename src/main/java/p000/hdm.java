package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxDrawerLayout;
import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxMenuButton;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hdm */
public final class hdm implements OnItemClickListener, C0347ld {
    /* renamed from: a */
    public final C0345kz f19934a;
    /* renamed from: b */
    public final gal f19935b;
    /* renamed from: c */
    public hdo f19936c;
    /* renamed from: d */
    public int f19937d = 0;
    /* renamed from: e */
    private final ListView f19938e;
    /* renamed from: f */
    private final View f19939f;
    /* renamed from: g */
    private final hdt f19940g;
    /* renamed from: h */
    private final ToyboxMenuButton f19941h;
    /* renamed from: i */
    private final BottomBarController f19942i;
    /* renamed from: j */
    private final bpt f19943j;
    /* renamed from: k */
    private boolean f19944k = false;
    /* renamed from: l */
    private final gzy f19945l;
    /* renamed from: m */
    private final ilp f19946m;

    public hdm(gzy gzy, ilp ilp, ToyboxDrawerLayout toyboxDrawerLayout, ListView listView, BottomBarController bottomBarController, bpt bpt, ToyboxMenuButton toyboxMenuButton, hdt hdt, View view, gal gal) {
        this.f19942i = bottomBarController;
        this.f19943j = bpt;
        this.f19938e = (ListView) jri.m13404b((Object) listView);
        this.f19940g = (hdt) jri.m13404b((Object) hdt);
        this.f19938e.setOnItemClickListener(this);
        this.f19939f = (View) jri.m13404b((Object) view);
        this.f19934a = (C0345kz) jri.m13404b((Object) toyboxDrawerLayout);
        C0345kz c0345kz = this.f19934a;
        c0345kz.f9120c = 0;
        c0345kz.invalidate();
        c0345kz = this.f19934a;
        if (c0345kz.f9125h == null) {
            c0345kz.f9125h = new ArrayList();
        }
        c0345kz.f9125h.add(this);
        this.f19934a.mo10580b(1);
        this.f19935b = gal;
        this.f19945l = gzy;
        this.f19946m = ilp;
        this.f19941h = (ToyboxMenuButton) jri.m13404b((Object) toyboxMenuButton);
        this.f19941h.setOnClickListener(new hdn(this));
    }

    /* renamed from: a */
    public final void mo13525a() {
        if (this.f19937d == 0) {
            this.f19934a.mo10571a();
        }
    }

    public final void onDrawerClosed(View view) {
        if (((Boolean) this.f19946m.mo13673b()).booleanValue()) {
            this.f19945l.mo13434af();
        }
        this.f19942i.setSwitchButtonClickEnabled(true);
        this.f19935b.f5222b.mo14609c();
    }

    public final void onDrawerOpened(View view) {
        this.f19945l.mo13413S();
        this.f19942i.setSwitchButtonClickEnabled(false);
        this.f19935b.f5222b.mo14607b();
    }

    public final void onDrawerSlide(View view, float f) {
        boolean z;
        BottomBarController bottomBarController = this.f19942i;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        bottomBarController.setSwitchButtonClickEnabled(z);
        this.f19935b.f5222b.setAlpha(1.0f - f);
        this.f19939f.setAlpha(0.6f * f);
        ToyboxMenuButton toyboxMenuButton = this.f19941h;
        hdl hdl = toyboxMenuButton.f2612a;
        if (hdl != null) {
            if (f == 0.0f) {
                hdl.mo7740a(false);
                toyboxMenuButton.setContentDescription(toyboxMenuButton.getResources().getString(R.string.hamburger_menu_open));
            } else if (f == 1.0f) {
                hdl.mo7740a(true);
                toyboxMenuButton.setContentDescription(toyboxMenuButton.getResources().getString(R.string.hamburger_menu_close));
            }
            hdl hdl2 = toyboxMenuButton.f2612a;
            if (hdl2.f6418a != f) {
                hdl2.f6418a = f;
                hdl2.invalidateSelf();
            }
        }
    }

    public final void onDrawerStateChanged(int i) {
        if (!this.f19944k) {
            this.f19938e.setAdapter(this.f19940g);
            this.f19944k = true;
        }
        if (i == 2) {
            if (this.f19934a.mo10582c()) {
                bpt bpt = this.f19943j;
                bpt.f1449e.cancel();
                if (((Integer) bpt.f1448d.mo13673b()).intValue() != 0) {
                    bpt.f1450f.setAlpha(1.0f);
                }
            } else {
                bpt bpt2 = this.f19943j;
                bpt2.f1449e.cancel();
                bpt2.f1450f.setAlpha(0.0f);
            }
        }
        this.f19937d = i;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f19937d == 0) {
            this.f19936c.mo7748a((hhx) adapterView.getAdapter().getItem(i));
        }
    }

    /* renamed from: a */
    public final void mo13526a(boolean z) {
        if (z) {
            this.f19934a.mo10580b(0);
        } else {
            this.f19934a.mo10580b(1);
        }
    }
}
