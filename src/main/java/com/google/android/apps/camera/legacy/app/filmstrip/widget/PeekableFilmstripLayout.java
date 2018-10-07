package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bli;
import p000.cfk;
import p000.csg;
import p000.csp;
import p000.cst;
import p000.cti;
import p000.ctm;
import p000.ctn;
import p000.ctx;
import p000.cve;
import p000.cvl;
import p000.cvm;
import p000.cvp;
import p000.edb;
import p000.eof;
import p000.eoh;
import p000.eok;
import p000.eol;
import p000.err;
import p000.hid;
import p000.hkg;
import p000.ikd;
import p000.jri;
import p000.kow;
import p000.kpq;

@TargetApi(23)
/* compiled from: PG */
public class PeekableFilmstripLayout extends FrameLayout implements csg, cve, eof, eoh, eok, eol {
    /* renamed from: a */
    public static final String f12801a = bli.m887a("PeekFilmstripLayout");
    /* renamed from: b */
    public cst f12802b;
    /* renamed from: c */
    public FrameLayout f12803c;
    /* renamed from: d */
    public FilmstripView f12804d;
    /* renamed from: e */
    public ctm f12805e;
    /* renamed from: f */
    public FilmstripTransitionLayout f12806f;
    /* renamed from: g */
    public RoundedThumbnailView f12807g;
    /* renamed from: h */
    public boolean f12808h;
    /* renamed from: i */
    public ikd f12809i;
    /* renamed from: j */
    public edb f12810j;
    /* renamed from: k */
    public ctx f12811k;
    /* renamed from: l */
    public csp f12812l;
    /* renamed from: m */
    public AtomicBoolean f12813m;
    /* renamed from: n */
    private ctn f12814n = new ctn(this);

    public PeekableFilmstripLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12805e = new ctm(this.f12814n, new cti(context), TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics()));
    }

    /* renamed from: a */
    public final void mo5845a(err err) {
        kow.m13878a(err.mo6543i(), new cvp(this), kpq.f8776a);
    }

    /* renamed from: a */
    public static Bitmap m8507a(ImageView imageView) {
        return hid.m3223a(imageView.getDrawable());
    }

    /* renamed from: a */
    public final void mo5725a() {
        this.f12802b.mo12906e();
        mo12579c();
        mo12580d();
    }

    /* renamed from: b */
    public final boolean mo5727b() {
        if (!this.f12808h) {
            return false;
        }
        bli.m888a(f12801a, "Begin filmstrip hide animation.");
        this.f12802b.mo12906e();
        mo12579c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12806f;
        filmstripTransitionLayout.f2511i = new cvm(this);
        filmstripTransitionLayout.mo2618b();
        filmstripTransitionLayout.f2505c.start();
        return true;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        bli.m888a(f12801a, "onFinishInflate");
        hkg a = hkg.m3276a((View) this);
        this.f12803c = (FrameLayout) a.mo7919a((int) R.id.camera_filmstrip_content_layout);
        this.f12804d = (FilmstripView) a.mo7919a((int) R.id.filmstrip_view);
        FilmstripView filmstripView = this.f12804d;
        filmstripView.f2550y = this;
        ctm ctm = this.f12805e;
        jri.m13404b(filmstripView.f2531f);
        ctm.f13255b = filmstripView.f2531f;
        TextView textView = (TextView) a.mo7919a((int) R.id.no_photos_text);
        FilmstripView filmstripView2 = this.f12804d;
        filmstripView2.f2549x = textView;
        filmstripView2.f2549x.setAlpha(0.0f);
        this.f12804d.setOnTouchListener(new cvl(this));
    }

    /* renamed from: c */
    public final void mo12579c() {
        if (this.f12808h) {
            this.f12808h = false;
            this.f12803c.setTranslationX((float) getMeasuredWidth());
            setBackgroundColor(getResources().getColor(17170445, null));
            cst cst = this.f12802b;
            bli.m888a(cfk.f23052a, "onFilmstripHidden");
            cfk cfk = cst.f13242a;
            cfk.f23076X = false;
            cfk.f23069Q.mo8879a(cst.f13242a.mo14580H(), 4);
            cfk cfk2 = cst.f13242a;
            cfk2.f23072T = false;
            cfk2.mo14584Q();
            this.f12811k.mo13441j();
        }
    }

    /* renamed from: d */
    public final void mo12580d() {
        this.f12810j.mo13454v();
        setVisibility(4);
        this.f12806f.setVisibility(4);
    }

    /* renamed from: g */
    public final void mo6368g() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12806f;
        bli.m888a(FilmstripTransitionLayout.f2503a, "pauseAnimations");
        if (filmstripTransitionLayout.f2505c.isStarted()) {
            filmstripTransitionLayout.f2505c.pause();
        }
        if (filmstripTransitionLayout.f2504b.isStarted()) {
            filmstripTransitionLayout.f2504b.pause();
        }
    }

    /* renamed from: h */
    public final void mo6370h() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12806f;
        bli.m888a(FilmstripTransitionLayout.f2503a, "resumeAnimations");
        if (filmstripTransitionLayout.f2505c.isPaused()) {
            filmstripTransitionLayout.f2505c.resume();
        }
        if (filmstripTransitionLayout.f2504b.isPaused()) {
            filmstripTransitionLayout.f2504b.resume();
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12806f;
        bli.m888a(FilmstripTransitionLayout.f2503a, "cancelAnimations");
        if (filmstripTransitionLayout.f2505c.isStarted()) {
            filmstripTransitionLayout.f2507e = true;
            filmstripTransitionLayout.f2505c.cancel();
        }
        if (filmstripTransitionLayout.f2504b.isStarted()) {
            filmstripTransitionLayout.f2506d = true;
            filmstripTransitionLayout.f2504b.cancel();
        }
    }

    /* renamed from: a */
    public final void mo5726a(cst cst) {
        this.f12802b = cst;
        this.f12804d.f2536k.mo5755a(cst);
    }
}
