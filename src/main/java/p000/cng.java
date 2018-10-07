package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cng */
public final class cng extends cnf {
    /* renamed from: x */
    private static int f23216x;
    /* renamed from: p */
    public final cno f23217p;
    /* renamed from: q */
    public Uri f23218q;
    /* renamed from: r */
    public cmg f23219r;
    /* renamed from: s */
    public final BurstImageView f23220s;
    /* renamed from: t */
    public acj f23221t;
    /* renamed from: u */
    private FrameLayout f23222u;
    /* renamed from: v */
    private final FrameLayout f23223v;
    /* renamed from: w */
    private ValueAnimator f23224w;

    public cng(cnk cnk, FrameLayout frameLayout, cne cne) {
        super(frameLayout);
        this.f23217p = cnk.f12737c;
        this.f23222u = frameLayout;
        this.f23220s = (BurstImageView) frameLayout.findViewById(R.id.burst_grid_image_view);
        this.f23223v = (FrameLayout) frameLayout.findViewById(R.id.selection_padding_frame_layout);
        this.f23220s.setOnClickListener(new cnh(this, cne));
        this.f23220s.setOnLongClickListener(new cni(this, cne));
        if (f23216x == 0) {
            f23216x = this.f23220s.getContext().getResources().getDimensionPixelOffset(R.dimen.burst_grid_select_matting);
        }
        this.f23224w = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f23224w.setDuration(250);
        this.f23224w.setInterpolator(axl.f1036a);
        this.f23224w.addUpdateListener(new cnj(this));
    }

    /* renamed from: b */
    public final void mo12543b(boolean z) {
        int i;
        boolean a = this.f23217p.mo2407a();
        boolean a2 = this.f23217p.mo2408a(this.f23218q);
        ImageView imageView = (ImageView) this.f23222u.findViewById(R.id.selection_circle);
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        a = imageView.isSelected();
        imageView.setSelected(a2);
        if (a == a2) {
            z = false;
        }
        if (a2) {
            if (z) {
                this.f23224w.setFloatValues(new float[]{0.0f, (float) f23216x});
                this.f23224w.start();
            } else {
                mo14595a((float) f23216x);
            }
        } else if (z) {
            this.f23224w.setFloatValues(new float[]{(float) f23216x, 0.0f});
            this.f23224w.start();
        } else {
            mo14595a(0.0f);
        }
        this.f23220s.invalidate();
    }

    /* renamed from: c */
    public final void mo14597c(boolean z) {
        BurstImageView burstImageView = this.f23220s;
        burstImageView.f2502a = z;
        burstImageView.postInvalidate();
    }

    /* renamed from: a */
    final void mo14595a(float f) {
        int i = (int) f;
        this.f23223v.setPadding(i, i, i, i);
        if (f > 0.0f) {
            this.f23223v.setBackgroundResource(R.color.burst_editor_selected_bg_color);
        } else {
            this.f23223v.setBackgroundColor(0);
        }
        this.f23223v.invalidate();
    }

    /* renamed from: a */
    public final void mo14596a(acm acm, cot cot) {
        acj a = acm.mo11609a(Drawable.class);
        aqg b = new aqg().mo1708d().mo1705b(256, 256);
        eru eru = cot.f13151c.f13139e;
        acj a2 = a.mo124a(b.mo1695a(new are(eru.f4380d, eru.f4382f.getTime(), 0)));
        Object acq = new acq(0);
        acq.f255a = (arc) aqe.m610a(new aqv(new aqw().f921a), "Argument must not be null");
        a2.f237b = (acq) aqe.m610a(acq, "Argument must not be null");
        a2.f239d = false;
        this.f23221t = a2.mo125a(this.f23218q);
        this.f23221t.mo128a(this.f23220s);
    }
}
