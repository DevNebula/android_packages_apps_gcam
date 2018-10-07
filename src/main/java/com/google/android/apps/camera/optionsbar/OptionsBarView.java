package com.google.android.apps.camera.optionsbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.VectorDrawable;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0252go;
import p000.bli;
import p000.emn;
import p000.fzg;
import p000.fzh;
import p000.fzi;
import p000.fzj;
import p000.fzk;
import p000.fzl;
import p000.fzm;
import p000.fzn;
import p000.fzo;
import p000.fzp;
import p000.fzr;
import p000.fzs;
import p000.fzt;
import p000.fzw;
import p000.fzz;
import p000.gbj;
import p000.gbk;
import p000.gbl;
import p000.gbo;
import p000.gbp;
import p000.hft;
import p000.hgo;
import p000.hhf;
import p000.hhg;
import p000.hii;
import p000.hir;
import p000.jqk;

/* compiled from: PG */
public class OptionsBarView extends hft implements fzl {
    /* renamed from: i */
    private static final String f23286i = OptionsBarView.class.getSimpleName();
    /* renamed from: a */
    public final Map f23287a;
    /* renamed from: b */
    public final List f23288b;
    /* renamed from: c */
    public AnimatorSet f23289c;
    /* renamed from: d */
    public final fzh f23290d;
    /* renamed from: e */
    public fzw f23291e;
    /* renamed from: f */
    public Animator f23292f;
    /* renamed from: g */
    public FrameLayout f23293g;
    /* renamed from: h */
    public boolean f23294h;
    /* renamed from: j */
    private final Map f23295j;
    /* renamed from: k */
    private final hii f23296k;
    /* renamed from: l */
    private final fzz f23297l;
    /* renamed from: m */
    private final List f23298m;
    /* renamed from: n */
    private int f23299n;
    /* renamed from: o */
    private boolean f23300o;

    public OptionsBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23299n = C0252go.f5805aD;
        this.f23300o = false;
        this.f23294h = true;
        this.f23287a = new HashMap();
        this.f23288b = new ArrayList();
        this.f23295j = new HashMap();
        this.f23290d = new fzh(context, this);
        this.f23296k = new hii();
        ViewGroup viewGroup = this.f23290d;
        this.f23297l = new fzz(viewGroup, this, viewGroup.f5072e);
        this.f23298m = new ArrayList();
        this.f23289c = new AnimatorSet();
        m15342d();
    }

    public OptionsBarView(Context context, fzh fzh, hii hii) {
        super(context);
        this.f23299n = C0252go.f5805aD;
        this.f23300o = false;
        this.f23294h = true;
        this.f23287a = new HashMap();
        this.f23288b = new ArrayList();
        this.f23290d = fzh;
        this.f23295j = new HashMap();
        this.f23296k = hii;
        this.f23297l = new fzz(fzh, this, fzh.f5072e);
        this.f23298m = new ArrayList();
        this.f23289c = new AnimatorSet();
        m15342d();
    }

    /* renamed from: a */
    public final void mo14602a(fzm fzm, fzp fzp, fzt fzt) {
        synchronized (this.f23290d) {
            if (fzm.mo6969b(fzp)) {
                this.f23295j.put(fzm, fzp);
                fzh fzh = this.f23290d;
                boolean a = hii.m3228a(this.f23296k.f6594a);
                View space = new Space(fzh.getContext());
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                space.setLayoutParams(layoutParams);
                fzh.mo6957a(space, a);
                ImageButton fzg = new fzg(fzh.getContext());
                fzg.setLayoutParams(fzh.f5073f);
                fzg.setImageResource(fzm.mo6968a(fzp));
                fzg.setContentDescription(fzh.getContext().getResources().getString(fzm.f5086b));
                fzg.mo13314a(fzh.isEnabled());
                fzg.setOnClickListener(new fzk(fzh, fzm));
                fzh.f5069b.put(fzm.f5085a, fzg);
                fzh.mo6957a((View) fzg, a);
                if (fzp == fzp.SELECTED) {
                    a = true;
                } else {
                    a = false;
                }
                fzg.setSelected(a);
                fzg.f18923b.add(new fzi(fzh, fzm));
                fzg.f18922a.add(new fzj(fzh, fzm));
                if (fzt != null) {
                    fzt.mo6976a(fzg);
                }
                if (fzm.f5085a == fzo.MICROVIDEO && (fzp == fzp.MICROVIDEO_ON || fzp == fzp.MICROVIDEO_AUTO)) {
                    fzh.mo6958a(fzg);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14606a(fzs fzs) {
        this.f23298m.add(fzs);
    }

    /* renamed from: a */
    public final void mo14600a() {
        if (this.f23299n == C0252go.f5805aD) {
            Animator animator = this.f23292f;
            View view = this.f23291e;
            if (animator == null || view == null) {
                bli.m898e(f23286i, "closeOptionsBar called on a closed options bar");
                return;
            }
            this.f23291e = null;
            this.f23299n = C0252go.f5808aG;
            animator.addListener(new gbl(this, view));
            animator.start();
            for (gbj gbj : this.f23288b) {
                gbj.f5260a.f20087k.mo13319a(false);
            }
        } else if (this.f23299n == C0252go.f5806aE) {
            this.f23299n = C0252go.f5807aF;
        }
    }

    /* renamed from: a */
    public final void mo14603a(fzo fzo) {
        synchronized (this.f23290d) {
            fzh fzh = this.f23290d;
            ImageButton imageButton = (fzg) fzh.f5069b.get(fzo);
            if (imageButton != null) {
                imageButton.setEnabled(false);
                if (fzo == fzo.MICROVIDEO) {
                    fzh.mo6959a(imageButton, (int) ScriptIntrinsicBLAS.RsBlas_csyrk);
                } else {
                    imageButton.setImageAlpha(ScriptIntrinsicBLAS.RsBlas_csyrk);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo14607b() {
        synchronized (this.f23290d) {
            this.f23300o = true;
            setEnabled(false);
            this.f23290d.setEnabled(false);
        }
    }

    /* renamed from: b */
    public final void mo14608b(fzo fzo) {
        synchronized (this.f23290d) {
            fzh fzh = this.f23290d;
            ImageButton imageButton = (ImageButton) fzh.f5069b.get(fzo);
            if (imageButton != null) {
                imageButton.setEnabled(true);
                if (fzo == fzo.MICROVIDEO) {
                    fzh.mo6959a(imageButton, (int) Illuminant.kOther);
                } else {
                    imageButton.setImageAlpha(Illuminant.kOther);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo14609c() {
        synchronized (this.f23290d) {
            this.f23300o = false;
            setEnabled(true);
            this.f23290d.setEnabled(true);
        }
        ViewTreeObserver viewTreeObserver = this.f23290d.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.dispatchOnGlobalLayout();
        }
    }

    /* renamed from: a */
    public final AnimatorListenerAdapter mo14599a(boolean z) {
        return new gbp(this, z);
    }

    /* renamed from: d */
    private final void m15342d() {
        this.f23290d.setGravity(48);
        addView(this.f23290d, new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: a */
    public final void mo6967a(fzm fzm) {
        synchronized (this.f23290d) {
            if (this.f23299n != C0252go.f5805aD) {
                return;
            }
            fzo fzo = fzm.f5085a;
            View view = (View) this.f23290d.f5069b.get(fzo);
            if (view == null) {
                return;
            }
            for (fzs a : this.f23298m) {
                a.mo6975a(fzo);
            }
            if (fzm.f5087c.isEmpty()) {
                return;
            }
            fzp fzp = (fzp) this.f23295j.get(fzm);
            if (fzp == null) {
                String str = f23286i;
                String valueOf = String.valueOf(fzo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("Category ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" does not have a selected option available.");
                bli.m888a(str, stringBuilder.toString());
                return;
            }
            String str2 = f23286i;
            String valueOf2 = String.valueOf(fzo);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            stringBuilder2.append("Expanding options for category: ");
            stringBuilder2.append(valueOf2);
            bli.m888a(str2, stringBuilder2.toString());
            View fzw = new fzw(getContext(), fzm.f5087c, fzp, new gbk(this, fzm));
            LinearLayout[] linearLayoutArr = new LinearLayout[]{fzw};
            hii.m3227a(hir.PORTRAIT, this.f23296k.f6594a, linearLayoutArr);
            addView(fzw, new FrameLayout.LayoutParams(-1, -1));
            fzw.setAlpha(0.0f);
            this.f23299n = C0252go.f5806aE;
            fzz fzz = this.f23297l;
            Animator a2 = fzz.m2493a((View) jqk.m13354c(fzw));
            Animator animator = fzz.f5168c;
            View ironView = fzz.f5170e.getIronView();
            if (ironView != null) {
                animator = new AnimatorSet();
                animator.play(fzz.f5168c).with(fzz.m2495b(ironView));
            }
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(animator).before(a2).with(fzz.mo6982b(view, true)).with(fzz.mo6981a(view, true));
            fzz = this.f23297l;
            a2 = fzz.m2495b((View) jqk.m13354c(fzw));
            animator = fzz.f5169d;
            View ironView2 = fzz.f5170e.getIronView();
            if (ironView2 != null) {
                animator = new AnimatorSet();
                animator.play(fzz.f5169d).with(fzz.m2493a(ironView2));
            }
            Animator animatorSet2 = new AnimatorSet();
            animatorSet2.play(a2).before(animator).with(fzz.mo6982b(view, false)).with(fzz.mo6981a(view, false));
            this.f23292f = animatorSet2;
            animatorSet.addListener(new gbo(this));
            animatorSet.start();
            this.f23291e = fzw;
            for (gbj gbj : this.f23288b) {
                switch (fzo.ordinal()) {
                    case 2:
                        hgo hgo = gbj.f5260a;
                        if (!(hgo.f20081e || ((Boolean) hgo.f20082f.mo13673b()).booleanValue())) {
                            gbj.f5260a.f20087k.mo13318a(gbj.f5260a.f20077a.getResources().getString(R.string.raw_output_tutorial_title), gbj.f5260a.f20077a.getResources().getString(R.string.raw_output_tutorial_body), new hhg(gbj));
                            break;
                        }
                    case 5:
                        if (gbj.f5260a.f20079c.mo9709b() && !gbj.f5260a.mo13540d()) {
                            gbj.f5260a.f20087k.mo13318a(gbj.f5260a.f20077a.getResources().getString(R.string.micro_tutorial_title), gbj.f5260a.f20077a.getResources().getString(R.string.micro_tutorial_body), new hhf(gbj));
                            break;
                        }
                    default:
                        break;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f23300o || super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo14605a(fzo fzo, fzr fzr) {
        this.f23290d.f5070c.put(fzo, fzr);
    }

    /* renamed from: a */
    public final void mo14604a(fzo fzo, emn emn) {
        this.f23290d.f5071d.put(fzo, emn);
    }

    /* renamed from: a */
    public final void mo14601a(fzm fzm, fzp fzp) {
        boolean z = true;
        if (fzm.mo6969b(fzp)) {
            synchronized (this.f23290d) {
                this.f23295j.put(fzm, fzp);
                fzh fzh = this.f23290d;
                ImageButton imageButton = (ImageButton) fzh.f5069b.get(fzm.f5085a);
                if (imageButton != null) {
                    imageButton.setImageResource(fzm.mo6968a(fzp));
                    imageButton.setContentDescription(fzh.getContext().getResources().getString(fzm.f5086b));
                    if (fzp != fzp.SELECTED) {
                        z = false;
                    }
                    imageButton.setSelected(z);
                    if (fzm.f5085a == fzo.MICROVIDEO) {
                        if (fzp == fzp.MICROVIDEO_ON || fzp == fzp.MICROVIDEO_AUTO) {
                            fzh.mo6958a(imageButton);
                            if (fzh.f5079l) {
                                VectorDrawable vectorDrawable = fzh.f5078k;
                                if (vectorDrawable != null) {
                                    vectorDrawable.setAlpha(Illuminant.kOther);
                                }
                            }
                        } else {
                            fzh.mo6960b();
                        }
                    }
                }
                fzw fzw = this.f23291e;
                if (fzw != null) {
                    for (fzn fzn : fzw.f5146b.keySet()) {
                        View view = (View) fzw.f5146b.get(fzn);
                        if (view == null) {
                            break;
                        } else if (fzp == fzn.f5089a) {
                            view.setSelected(true);
                        } else {
                            view.setSelected(false);
                        }
                    }
                }
            }
            return;
        }
        String str = f23286i;
        String valueOf = String.valueOf(fzp);
        String valueOf2 = String.valueOf(fzm.f5085a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(valueOf2).length());
        stringBuilder.append("Attempted to set invalid value. ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" is not a valid option for category: ");
        stringBuilder.append(valueOf2);
        bli.m891b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo13535a(hir hir) {
        if (this.f23291e != null) {
            this.f23296k.mo7881a(hir, this.f23290d, r0);
        } else {
            this.f23296k.mo7881a(hir, this.f23290d);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23290d.getLayoutParams();
        switch (hir.ordinal()) {
            case 0:
            case 1:
                layoutParams.gravity = 8388659;
                return;
            case 2:
                layoutParams.gravity = 8388661;
                return;
            case 3:
                layoutParams.gravity = 8388691;
                return;
            default:
                return;
        }
    }
}
