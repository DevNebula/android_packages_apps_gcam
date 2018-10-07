package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* compiled from: PG */
/* renamed from: hso */
public final class hso extends TextView implements gzk, hst {
    /* renamed from: a */
    private final int f20802a = getResources().getDimensionPixelSize(R.dimen.refocus_cling_bottom_triangle_height);
    /* renamed from: b */
    private final int f20803b = getResources().getDimensionPixelSize(R.dimen.refocus_cling_bottom_triangle_width);
    /* renamed from: c */
    private final Drawable f20804c = getResources().getDrawable(R.drawable.settings_cling, null);
    /* renamed from: d */
    private final Path f20805d = new Path();
    /* renamed from: e */
    private final Paint f20806e = new Paint();
    /* renamed from: f */
    private final int f20807f = getResources().getDimensionPixelSize(R.dimen.refocus_cling_text_padding);
    /* renamed from: g */
    private int f20808g = 0;
    /* renamed from: h */
    private boolean f20809h = true;
    /* renamed from: i */
    private final /* synthetic */ RGBZFocusControls f20810i;

    public hso(RGBZFocusControls rGBZFocusControls, Context context) {
        this.f20810i = rGBZFocusControls;
        super(context);
        setText(R.string.refocus_slider_cling_text);
        int i = this.f20807f;
        setPadding(i, i, i, this.f20802a + i);
        setTextAppearance(R.style.refocus_bokeh_control_bar_cling_text);
        this.f20806e.setColor(getResources().getColor(R.color.refocus_control_bar_cling_color, null));
        this.f20806e.setStyle(Style.FILL);
    }

    public final void onDraw(Canvas canvas) {
        if (!this.f20809h) {
            this.f20804c.draw(canvas);
            super.onDraw(canvas);
            canvas.drawPath(this.f20805d, this.f20806e);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.f20804c.setBounds(0, 0, i3 - i, i5 - this.f20802a);
        this.f20808g = i5;
    }

    /* renamed from: a */
    public final void mo8100a(int i) {
        RGBZFocusControls rGBZFocusControls = this.f20810i;
        if (rGBZFocusControls.f12907h) {
            setVisibility(8);
            invalidate();
            return;
        }
        this.f20809h = false;
        int i2 = rGBZFocusControls.f12902c / 2;
        setTranslationX((float) (hjg.m3255a(i, i2, rGBZFocusControls.f12903d - i2) - (this.f20810i.f12902c / 2)));
        int translationX = (int) (((float) i) - getTranslationX());
        this.f20805d.reset();
        float f = (float) translationX;
        this.f20805d.moveTo(f, (float) this.f20808g);
        this.f20805d.lineTo((float) (translationX - (this.f20803b / 2)), (float) (this.f20808g - this.f20802a));
        this.f20805d.lineTo((float) (translationX + (this.f20803b / 2)), (float) (this.f20808g - this.f20802a));
        this.f20805d.lineTo(f, (float) this.f20808g);
        invalidate();
        this.f20810i.f12907h = true;
    }
}
