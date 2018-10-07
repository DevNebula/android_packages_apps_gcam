package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hil */
public final class hil {
    /* renamed from: a */
    public int f6598a;
    /* renamed from: b */
    private final Animator f6599b;
    /* renamed from: c */
    private final Animator f6600c;
    /* renamed from: d */
    private final View f6601d;

    public hil(View view) {
        this(view, view);
    }

    public hil(View view, Object obj) {
        this.f6598a = -1;
        this.f6601d = view;
        this.f6599b = AnimatorInflater.loadAnimator(view.getContext(), R.animator.return_to_zero_rotation_clockwise);
        this.f6599b.setTarget(obj);
        this.f6600c = AnimatorInflater.loadAnimator(view.getContext(), R.animator.return_to_zero_rotation_ccw);
        this.f6600c.setTarget(obj);
    }

    /* renamed from: a */
    public final void mo7883a() {
        this.f6598a = this.f6601d.getDisplay().getRotation();
    }

    /* renamed from: b */
    public final void mo7884b() {
        if (this.f6598a == -1) {
            throw new RuntimeException("onAttachedToWindow not called yet; current rotation unknown.");
        }
        int b = hdy.m3139b(this.f6601d.getContext());
        int i = this.f6598a;
        if (b == (i + 1) % 4) {
            this.f6599b.start();
        } else if (b == (i + 3) % 4) {
            this.f6600c.start();
        }
        this.f6598a = b;
    }
}
