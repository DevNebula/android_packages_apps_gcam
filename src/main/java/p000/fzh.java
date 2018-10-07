package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.view.ViewMagnet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fzh */
public final class fzh extends LinearLayout {
    /* renamed from: a */
    public final fzl f5068a;
    /* renamed from: b */
    public final Map f5069b;
    /* renamed from: c */
    public final Map f5070c;
    /* renamed from: d */
    public final Map f5071d;
    /* renamed from: e */
    public final ViewMagnet f5072e;
    /* renamed from: f */
    public final LayoutParams f5073f;
    /* renamed from: g */
    public final Animator f5074g;
    /* renamed from: h */
    public final Animator f5075h;
    /* renamed from: i */
    public ImageButton f5076i;
    /* renamed from: j */
    public AnimatedVectorDrawable f5077j;
    /* renamed from: k */
    public VectorDrawable f5078k;
    /* renamed from: l */
    public boolean f5079l = false;
    /* renamed from: m */
    private final View f5080m;
    /* renamed from: n */
    private final hil f5081n;
    /* renamed from: o */
    private boolean f5082o = false;

    public fzh(Context context, fzl fzl) {
        super(context);
        this.f5068a = fzl;
        this.f5069b = new HashMap();
        this.f5070c = new HashMap();
        this.f5071d = new HashMap();
        this.f5074g = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_in_animator);
        this.f5075h = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_out_animator);
        this.f5073f = fzh.m2476a(context);
        View view = new View(context, null, 0, R.style.options_bar_left_placeholder);
        view.setLayoutParams(fzh.m2476a(context));
        this.f5080m = view;
        this.f5072e = new ViewMagnet(this.f5080m);
        this.f5081n = new hil(this, this.f5072e);
        setBackgroundColor(context.getResources().getColor(R.color.optionsbar_background_closed, null));
        mo6956a();
    }

    /* renamed from: a */
    final void mo6956a() {
        addView(this.f5080m, 0);
        this.f5072e.setPositioned();
    }

    /* renamed from: a */
    public final void mo6957a(View view, boolean z) {
        if (z) {
            addView(view, 0);
        } else {
            addView(view);
        }
    }

    /* renamed from: b */
    public final void mo6960b() {
        if (!(this.f5078k == null || this.f5077j == null)) {
            mo6961c();
        }
        this.f5082o = false;
        this.f5076i = null;
        this.f5077j = null;
        this.f5078k = null;
    }

    /* renamed from: a */
    private static LayoutParams m2476a(Context context) {
        return new LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.optionsbar_category_width), context.getResources().getDimensionPixelSize(R.dimen.optionsbar_category_height), 0.0f);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5081n.f6598a = getDisplay().getRotation();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5081n.mo7884b();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5072e.setPositioned();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (fzg a : this.f5069b.values()) {
            a.mo13314a(z);
        }
    }

    /* renamed from: a */
    public final void mo6959a(ImageButton imageButton, int i) {
        if (this.f5082o) {
            ((LayerDrawable) imageButton.getDrawable()).getDrawable(0).setAlpha(i);
        } else {
            imageButton.setAlpha(i);
        }
    }

    /* renamed from: a */
    public final void mo6958a(ImageButton imageButton) {
        this.f5082o = true;
        this.f5076i = imageButton;
        this.f5077j = (AnimatedVectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(0);
        this.f5078k = (VectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(1);
        if (!this.f5079l) {
            this.f5078k.setAlpha(0);
        }
    }

    /* renamed from: c */
    public final void mo6961c() {
        if (this.f5076i != null && this.f5079l) {
            this.f5074g.cancel();
            this.f5075h.setTarget(this.f5078k);
            this.f5075h.start();
            this.f5079l = false;
        }
    }
}
