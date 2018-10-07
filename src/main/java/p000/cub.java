package p000;

import android.app.ActionBar;
import android.content.res.Resources;
import android.view.Window;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cub */
public class cub extends gqj {
    /* renamed from: a */
    public static final String f23685a = bli.m887a("FilmstripUiState");
    /* renamed from: b */
    public crw f23686b;
    /* renamed from: c */
    public crt f23687c;
    /* renamed from: d */
    public ctw f23688d;
    /* renamed from: e */
    public ActionBar f23689e;
    /* renamed from: f */
    public gui f23690f;
    /* renamed from: g */
    private csl f23691g;
    /* renamed from: h */
    private Resources f23692h;
    /* renamed from: i */
    private Window f23693i;

    public cub() {
        super(0);
    }

    /* renamed from: a */
    public void mo7343a() {
        bli.m894c(f23685a, "Filmstrip Ui Enter");
        this.f23688d.f2942i.setVisibility(0);
        this.f23693i.setNavigationBarColor(this.f23692h.getColor(R.color.filmstrip_system_ui_background));
        this.f23693i.setStatusBarColor(this.f23692h.getColor(R.color.filmstrip_system_ui_background));
        this.f23693i.clearFlags(1024);
    }

    /* renamed from: b */
    public void mo7344b() {
        bli.m894c(f23685a, "Filmstrip Ui Exit");
        this.f23690f.mo7458a(1797);
        this.f23688d.f2942i.setVisibility(4);
        csl csl = this.f23691g;
        if (csl.f13234c.getVisibility() == 0) {
            csl.mo12900a(false);
            csl.mo12901b(false);
        }
        this.f23693i.setNavigationBarColor(this.f23692h.getColor(R.color.default_system_ui_background));
        this.f23693i.setStatusBarColor(this.f23692h.getColor(R.color.default_system_ui_background));
        this.f23693i.addFlags(1024);
    }

    /* renamed from: a */
    public void mo14829a(csh csh, crw crw, crt crt, csl csl, csp csp, ctw ctw, ActionBar actionBar, Resources resources, Window window, gui gui) {
        this.f23686b = crw;
        this.f23687c = crt;
        this.f23691g = csl;
        this.f23688d = ctw;
        this.f23689e = actionBar;
        this.f23692h = resources;
        this.f23693i = window;
        this.f23690f = gui;
    }
}
