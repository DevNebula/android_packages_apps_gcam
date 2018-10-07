package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hij */
public final class hij {
    /* renamed from: a */
    public final View f6595a;
    /* renamed from: b */
    public final Animator f6596b;
    /* renamed from: c */
    public int f6597c = -1;

    public hij(View view) {
        this.f6595a = view;
        this.f6596b = AnimatorInflater.loadAnimator(view.getContext(), R.animator.layout_change_fade_in);
        this.f6596b.setTarget(view);
    }
}
