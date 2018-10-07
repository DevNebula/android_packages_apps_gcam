package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qb */
final class C0745qb extends C0442qx implements C0426qf {
    /* renamed from: a */
    public final /* synthetic */ C0836py f22242a;

    public C0745qb(C0836py c0836py, Context context) {
        this.f22242a = c0836py;
        super(context, null, R.attr.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new C0746qc(this, this));
    }

    /* renamed from: d */
    public final boolean mo10890d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo10891e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f22242a.mo15284f();
        }
        return true;
    }

    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C0261ha.m3021a(background, width - max, height - max, width + max, height + max);
        }
        return frame;
    }
}
