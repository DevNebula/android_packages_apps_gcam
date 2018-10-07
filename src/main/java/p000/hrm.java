package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hrm */
public final class hrm extends hdz {
    /* renamed from: a */
    public ImageView f20785a;
    /* renamed from: b */
    public int f20786b = 0;
    /* renamed from: i */
    public final hrt[] f20787i = new hrt[]{new hrt(R.string.refocus_tutorial_title_slide_1, R.id.slide_1, R.string.refocus_tutorial_next, this.f20795q), new hrt(R.string.refocus_tutorial_title_slide_2, R.id.slide_2, R.string.refocus_tutorial_next, null), new hrt(R.string.refocus_tutorial_title_slide_3, R.id.slide_3, R.string.refocus_tutorial_ok_got_it, this.f20796r)};
    /* renamed from: j */
    private View f20788j;
    /* renamed from: k */
    private TextView f20789k;
    /* renamed from: l */
    private Button f20790l;
    /* renamed from: m */
    private Button f20791m;
    /* renamed from: n */
    private final int f20792n;
    /* renamed from: o */
    private final Matrix f20793o = new Matrix();
    /* renamed from: p */
    private ImageView f20794p;
    /* renamed from: q */
    private final AnimatorSet f20795q = new AnimatorSet();
    /* renamed from: r */
    private final AnimatorSet f20796r = new AnimatorSet();

    public hrm(hea hea, Context context) {
        super(context, R.layout.refocus_tutorial, hea);
        this.f20792n = context.getResources().getDimensionPixelSize(R.dimen.refocus_tutorial_viewfinder_size);
    }

    /* renamed from: a */
    private static void m12206a(AnimatorSet animatorSet) {
        animatorSet.removeAllListeners();
        animatorSet.addListener(new hrs(animatorSet));
    }

    /* renamed from: a */
    final void mo13559a(int i) {
        int i2 = 8;
        hrt hrt = this.f20787i[this.f20786b];
        this.f20788j.findViewById(hrt.f6885b).setVisibility(8);
        AnimatorSet animatorSet = hrt.f6887d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hrt = this.f20787i[i];
        this.f20788j.findViewById(hrt.f6885b).setVisibility(0);
        this.f20789k.setText(hrt.f6884a);
        this.f20790l.setText(hrt.f6886c);
        this.f20786b = i;
        animatorSet = hrt.f6887d;
        if (animatorSet != null) {
            animatorSet.start();
        }
        int length = this.f20787i.length;
        Button button = this.f20791m;
        if (i != length - 1) {
            i2 = 0;
        }
        button.setVisibility(i2);
    }

    /* renamed from: a */
    protected final void mo7756a(View view) {
        this.f20788j = view;
        this.f20789k = (TextView) this.f20788j.findViewById(R.id.refocus_tutorial_title);
        this.f20790l = (Button) this.f20788j.findViewById(R.id.next_button);
        this.f20791m = (Button) this.f20788j.findViewById(R.id.skip_link);
        this.f20794p = (ImageView) this.f20788j.findViewById(R.id.slide_1_photo_front);
        this.f20785a = (ImageView) this.f20788j.findViewById(R.id.slide_3_viewfinder_graphic);
        ImageView imageView = (ImageView) this.f20788j.findViewById(R.id.distance_graphic);
        imageView.addOnLayoutChangeListener(new hrn(this, imageView));
        mo13560a(imageView, -10.0f);
        ObjectAnimator.ofFloat(this.f20794p, "alpha", new float[]{1.0f, 0.0f}).setDuration(200).setStartDelay(200);
        ObjectAnimator.ofFloat(this.f20794p, "alpha", new float[]{0.0f, 1.0f}).setDuration(200).setStartDelay(200);
        this.f20795q.playSequentially(new Animator[]{r0, r1});
        hrm.m12206a(this.f20795q);
        Animator duration = ObjectAnimator.ofFloat(this.f20785a, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        duration.addListener(new hro(this));
        duration.setStartDelay(100);
        ValueAnimator.ofFloat(new float[]{-10.0f, -30.0f}).setDuration(1000).addUpdateListener(new hrp(this));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f20785a, "alpha", new float[]{1.0f, 0.0f}).setDuration(200);
        this.f20796r.playSequentially(new Animator[]{duration, r1, duration2});
        hrm.m12206a(this.f20796r);
        this.f20790l.setOnClickListener(new hrq(this));
        this.f20791m.setOnClickListener(new hrr(this));
        mo13559a(0);
    }

    /* renamed from: a */
    final void mo13560a(ImageView imageView, float f) {
        this.f20793o.reset();
        this.f20793o.postRotate(f, (float) (-(imageView.getWidth() / 4)), (float) (imageView.getHeight() / 4));
        this.f20793o.postTranslate((float) (this.f20792n / 4), (float) (imageView.getHeight() - this.f20792n));
        imageView.setImageMatrix(this.f20793o);
    }

    /* renamed from: c */
    public final void mo7758c() {
        for (hrt hrt : this.f20787i) {
            AnimatorSet animatorSet = hrt.f6887d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        super.mo7758c();
    }
}
