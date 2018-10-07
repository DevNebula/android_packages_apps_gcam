package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rd */
public final class C0448rd extends SeekBar {
    /* renamed from: a */
    private final C0751re f9609a;

    public C0448rd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0448rd(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.seekBarStyle);
        this.f9609a = new C0751re(this);
        this.f9609a.mo10968a(attributeSet, R.attr.seekBarStyle);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0751re c0751re = this.f9609a;
        Drawable drawable = c0751re.f22253c;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0751re.f22252b.getDrawableState())) {
            c0751re.f22252b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9609a.f22253c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected final synchronized void onDraw(Canvas canvas) {
        int i = 1;
        synchronized (this) {
            super.onDraw(canvas);
            C0751re c0751re = this.f9609a;
            if (c0751re.f22253c != null) {
                int max = c0751re.f22252b.getMax();
                if (max > 1) {
                    int intrinsicWidth = c0751re.f22253c.getIntrinsicWidth();
                    int intrinsicHeight = c0751re.f22253c.getIntrinsicHeight();
                    if (intrinsicWidth >= 0) {
                        intrinsicWidth /= 2;
                    } else {
                        intrinsicWidth = 1;
                    }
                    if (intrinsicHeight >= 0) {
                        i = intrinsicHeight / 2;
                    }
                    c0751re.f22253c.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                    float width = ((float) ((c0751re.f22252b.getWidth() - c0751re.f22252b.getPaddingLeft()) - c0751re.f22252b.getPaddingRight())) / ((float) max);
                    intrinsicHeight = canvas.save();
                    canvas.translate((float) c0751re.f22252b.getPaddingLeft(), (float) (c0751re.f22252b.getHeight() / 2));
                    for (i = 0; i <= max; i++) {
                        c0751re.f22253c.draw(canvas);
                        canvas.translate(width, 0.0f);
                    }
                    canvas.restoreToCount(intrinsicHeight);
                }
            }
        }
    }
}
