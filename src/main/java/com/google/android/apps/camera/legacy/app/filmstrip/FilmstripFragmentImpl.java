package com.google.android.apps.camera.legacy.app.filmstrip;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0252go;
import p000.acc;
import p000.acf;
import p000.arq;
import p000.bli;
import p000.bmb;
import p000.cbj;
import p000.cbm;
import p000.ccd;
import p000.cco;
import p000.cem;
import p000.cfd;
import p000.cfh;
import p000.cpx;
import p000.crq;
import p000.crt;
import p000.crw;
import p000.csg;
import p000.csh;
import p000.csl;
import p000.csp;
import p000.csq;
import p000.csr;
import p000.css;
import p000.csv;
import p000.csw;
import p000.ctf;
import p000.ctm;
import p000.ctt;
import p000.ctw;
import p000.ctx;
import p000.cub;
import p000.cue;
import p000.cun;
import p000.cuw;
import p000.cvn;
import p000.edb;
import p000.enr;
import p000.gui;
import p000.gvr;
import p000.hez;
import p000.hfu;
import p000.hfz;
import p000.hip;
import p000.hkg;
import p000.ikd;
import p000.jri;
import p000.kow;
import p000.kpk;
import p000.kpq;
import p000.ktm;

/* compiled from: PG */
public class FilmstripFragmentImpl extends Fragment implements csp {
    /* renamed from: a */
    private static final String f12774a = bli.m887a("FilmstripFrgmntImpl");
    /* renamed from: A */
    private gvr f12775A;
    /* renamed from: b */
    private boolean f12776b = false;
    /* renamed from: c */
    private AtomicBoolean f12777c = new AtomicBoolean(false);
    /* renamed from: d */
    private PeekableFilmstripLayout f12778d;
    /* renamed from: e */
    private FilmstripView f12779e;
    /* renamed from: f */
    private ctw f12780f;
    /* renamed from: g */
    private FrameLayout f12781g;
    /* renamed from: h */
    private FrameLayout f12782h;
    /* renamed from: i */
    private FilmstripTransitionLayout f12783i;
    /* renamed from: j */
    private RoundedThumbnailView f12784j;
    /* renamed from: k */
    private Bitmap f12785k;
    /* renamed from: l */
    private boolean f12786l;
    /* renamed from: m */
    private csw f12787m;
    /* renamed from: n */
    private crq f12788n;
    /* renamed from: o */
    private crw f12789o;
    /* renamed from: p */
    private crt f12790p;
    /* renamed from: q */
    private csh f12791q;
    /* renamed from: r */
    private csl f12792r;
    /* renamed from: s */
    private WindowManager f12793s;
    /* renamed from: t */
    private ikd f12794t;
    /* renamed from: u */
    private enr f12795u;
    /* renamed from: v */
    private bmb f12796v;
    /* renamed from: w */
    private edb f12797w;
    /* renamed from: x */
    private cue f12798x;
    /* renamed from: y */
    private cub f12799y;
    /* renamed from: z */
    private ctx f12800z;

    /* renamed from: a */
    public final crw mo5737a() {
        jri.m13404b(this.f12789o);
        return this.f12789o;
    }

    /* renamed from: b */
    public final crt mo5741b() {
        return (crt) jri.m13404b(this.f12790p);
    }

    /* renamed from: c */
    public final csg mo5742c() {
        return this.f12778d;
    }

    /* renamed from: d */
    public final csh mo5743d() {
        return (csh) jri.m13404b(this.f12791q);
    }

    /* renamed from: e */
    public final csw mo5744e() {
        return this.f12787m;
    }

    /* renamed from: f */
    public final WindowManager mo5745f() {
        return this.f12793s;
    }

    /* renamed from: g */
    public final void mo5746g() {
        this.f12778d.mo5725a();
        this.f12788n.mo5696a();
    }

    /* renamed from: h */
    public final void mo5748h() {
        m8490n();
        acc a = acc.m98a(this.f12791q.f2847d);
        acf acf = acf.HIGH;
        arq.m678a();
        a.f188b.mo306a(acf.f220c);
        a.f187a.mo282a(acf.f220c);
    }

    /* renamed from: n */
    private final void m8490n() {
        ikd.m12501a();
        if (!this.f12776b) {
            csq csq = new csq(((cfd) getContext()).mo2276d(), new csr(this, this.f12780f));
            this.f12789o = (crw) csq.f2864b.mo10566a();
            this.f12790p = (crt) csq.f2865c.mo10566a();
            this.f12791q = (csh) csq.f2867e.mo10566a();
            this.f12792r = (csl) csq.f2866d.mo10566a();
            this.f12793s = cco.m8107a(csq.f2868f.f2080e.f22920aK.f25774j.mo10566a());
            this.f12794t = (ikd) csq.f2868f.f2080e.f22920aK.f25777m.mo10566a();
            this.f12795u = cem.m8179a(csq.f2868f.f2080e.f22962b);
            this.f12796v = csq.f2868f.f2080e.f22920aK.mo15478c();
            this.f12797w = (edb) csq.f2868f.f2080e.f22956au.mo10566a();
            this.f12798x = new cue((cub) csq.f2868f.f2080e.f22959ax.mo10566a(), (ctx) csq.f2868f.f2080e.f22960ay.mo10566a(), (csh) csq.f2867e.mo10566a(), (crw) csq.f2864b.mo10566a(), (crt) csq.f2865c.mo10566a(), (csl) csq.f2866d.mo10566a(), (csp) ktm.m14219a(csq.f2863a.f2875a, "Cannot return null from a non-@Nullable @Provides method"), css.m8831a(csq.f2863a), hez.m12014a(csq.f2868f.f1919a), csv.m8840a(csq.f2863a), cbm.m8060a(csq.f2868f.f2080e.f22909a), (gui) csq.f2868f.f2080e.f22912aC.mo10566a(), cbj.m8055a(csq.f2868f.f2080e.f22909a));
            this.f12799y = (cub) csq.f2868f.f2080e.f22959ax.mo10566a();
            this.f12800z = (ctx) csq.f2868f.f2080e.f22960ay.mo10566a();
            this.f12775A = new gvr(ccd.m8082a(csq.f2868f.f2080e.f22920aK.f25774j.mo10566a()));
            this.f12786l = false;
            this.f12776b = true;
        }
    }

    /* renamed from: a */
    public final void mo5739a(cfh cfh, cpx cpx, hfz hfz, RoundedThumbnailView roundedThumbnailView) {
        m8490n();
        this.f12795u.mo6355a(this.f12792r);
        FilmstripView filmstripView = this.f12779e;
        csh csh = this.f12791q;
        cub cub = this.f12799y;
        bli.m888a(FilmstripView.f2524a, "FilmstripView.init");
        filmstripView.setWillNotDraw(false);
        filmstripView.f2530e = cpx;
        filmstripView.f2528c = this;
        filmstripView.f2529d = cub;
        filmstripView.f2527b = cfh;
        filmstripView.f2535j = 1.0f;
        filmstripView.f2536k = new cuw(filmstripView);
        filmstripView.f2542q = new DecelerateInterpolator();
        filmstripView.f2540o = new hfu(getContext());
        filmstripView.f2540o.setVisibility(8);
        filmstripView.addView(filmstripView.f2540o);
        if (csh.f2848e) {
            filmstripView.f2548w.mo15641a(Boolean.valueOf(true));
        }
        filmstripView.f2541p = (int) filmstripView.getContext().getResources().getDimension(R.dimen.pie_touch_slop);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mo5745f().getDefaultDisplay().getMetrics(displayMetrics);
        filmstripView.f2545t = ((float) displayMetrics.densityDpi) / 240.0f;
        if (filmstripView.f2545t < 1.0f) {
            filmstripView.f2545t = 1.0f;
        }
        filmstripView.setAccessibilityDelegate(new cun(filmstripView, this));
        if (this.f12796v.mo2020b()) {
            this.f12787m = new ctf(hfz);
        } else {
            this.f12787m = this.f12779e.f2536k;
        }
        this.f12787m.mo5760b(getResources().getDimensionPixelSize(R.dimen.camera_film_strip_gap));
        this.f12787m.mo5756a(hfz);
        this.f12784j = roundedThumbnailView;
        this.f12785k = roundedThumbnailView.getDefaultThumbnail(hip.PLACEHOLDER);
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12778d;
        ikd ikd = this.f12794t;
        edb edb = this.f12797w;
        ctx ctx = this.f12800z;
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12783i;
        peekableFilmstripLayout.f12807g = roundedThumbnailView;
        peekableFilmstripLayout.f12809i = ikd;
        peekableFilmstripLayout.f12810j = edb;
        peekableFilmstripLayout.f12811k = ctx;
        peekableFilmstripLayout.f12812l = this;
        peekableFilmstripLayout.f12806f = filmstripTransitionLayout;
        peekableFilmstripLayout.f12813m = new AtomicBoolean(false);
        this.f12795u.mo6355a(this.f12778d);
        this.f12788n = new crq(this.f12779e, this.f12778d);
        cue cue = this.f12798x;
        cue.f2945a.mo14829a(cue.f2947c, cue.f2948d, cue.f2949e, cue.f2950f, cue.f2951g, cue.f2952h, cue.f2953i, cue.f2954j, cue.f2955k, cue.f2956l);
        cue.f2946b.mo14828a(cue.f2951g, cue.f2957m);
    }

    /* renamed from: i */
    public final boolean mo5749i() {
        Activity activity = getActivity();
        return activity == null || activity.isFinishing();
    }

    /* renamed from: j */
    public final boolean mo5750j() {
        return this.f12777c.get();
    }

    /* renamed from: k */
    public final boolean mo5751k() {
        return this.f12778d.getVisibility() == 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f12781g = (FrameLayout) layoutInflater.inflate(R.layout.camera_filmstrip, viewGroup, false);
        hkg a = hkg.m3276a(this.f12781g);
        this.f12783i = (FilmstripTransitionLayout) a.mo7919a((int) R.id.filmstrip_transition_layout);
        this.f12778d = (PeekableFilmstripLayout) a.mo7919a((int) R.id.peekable_filmstrip_layout);
        this.f12779e = (FilmstripView) a.mo7919a((int) R.id.filmstrip_view);
        a.mo7919a((int) R.id.filmstrip_short_tall_bottom_bar_background);
        this.f12782h = (FrameLayout) a.mo7919a((int) R.id.filmstrip_controls_container);
        layoutInflater.inflate(R.layout.undo_bar, this.f12782h, true);
        this.f12780f = new ctw(hkg.m3276a(this.f12781g));
        return this.f12781g;
    }

    /* renamed from: a */
    public final void mo5738a(Bitmap bitmap) {
        this.f12785k = (Bitmap) jri.m13404b((Object) bitmap);
        this.f12783i.mo2615a(bitmap);
        this.f12779e.mo2631a(bitmap);
    }

    public void onPause() {
        super.onPause();
        this.f12777c.set(true);
        this.f12786l = true;
        ctm ctm = this.f12778d.f12805e;
        if (ctm.f13256c == C0252go.f5792R) {
            ctm.mo12907b();
        }
    }

    public void onResume() {
        ikd.m12501a();
        super.onResume();
        this.f12777c.set(false);
        if (this.f12786l && this.f12776b) {
            mo5743d().f2846c.mo7841f();
            this.f12786l = false;
        }
    }

    /* renamed from: l */
    public final void mo5752l() {
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12778d;
        Bitmap bitmap = this.f12785k;
        bli.m888a(PeekableFilmstripLayout.f12801a, "Attempting to show filmstrip.");
        kpk kpk = peekableFilmstripLayout.f12804d.f2548w;
        if (peekableFilmstripLayout.f12813m.get()) {
            bli.m888a(PeekableFilmstripLayout.f12801a, "Already have pending animation.");
        } else {
            Executor executor;
            peekableFilmstripLayout.f12813m.set(true);
            if (kpk.isDone()) {
                executor = kpq.f8776a;
            } else {
                executor = peekableFilmstripLayout.f12809i;
            }
            kow.m13878a(kpk, new cvn(peekableFilmstripLayout, bitmap), executor);
        }
        this.f12787m.mo5759b();
        if (this.f12788n == null) {
            return;
        }
        if (this.f12775A.mo7468a()) {
            crq crq = this.f12788n;
            crq.f2800b.setVisibility(0);
            crq.f2801c.setVisibility(0);
            return;
        }
        this.f12788n.mo5696a();
    }

    /* renamed from: m */
    public final void mo5753m() {
        mo5738a(this.f12784j.getDefaultThumbnail(hip.PLACEHOLDER));
    }

    /* renamed from: a */
    public final void mo5740a(ctt ctt) {
        if (this.f12777c.get()) {
            bli.m888a(f12774a, "Activity paused/finishing. Aborting filmstrip show animation.");
            return;
        }
        bli.m888a(f12774a, "Running filmstrip show animation.");
        this.f12783i.setVisibility(0);
        this.f12789o.mo5706a();
        this.f12783i.mo2617a(this.f12784j);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12783i;
        filmstripTransitionLayout.f2512j = false;
        filmstripTransitionLayout.mo2616a(this.f12785k, ctt);
    }
}
