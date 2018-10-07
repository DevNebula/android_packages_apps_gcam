package p000;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpr */
public final class hpr {
    /* renamed from: a */
    public final float f6796a;
    /* renamed from: b */
    public final float f6797b;
    /* renamed from: c */
    public final float f6798c;
    /* renamed from: d */
    public final float f6799d;
    /* renamed from: e */
    public final float f6800e;
    /* renamed from: f */
    public final float f6801f;
    /* renamed from: g */
    public final Paint f6802g;
    /* renamed from: h */
    public final Paint f6803h;
    /* renamed from: i */
    public float f6804i;
    /* renamed from: j */
    public float f6805j = 1.0f;

    public hpr(Resources resources) {
        this.f6796a = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_width);
        this.f6797b = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_height);
        this.f6798c = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_triangle_height);
        this.f6799d = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_border_radius);
        this.f6800e = (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_text_size);
        this.f6801f = (float) (((resources.getDimensionPixelSize(R.dimen.zoom_button_size) + resources.getDimensionPixelSize(R.dimen.seekbar_padding)) + resources.getDimensionPixelSize(R.dimen.zoom_thumb_offset)) + resources.getDimensionPixelSize(R.dimen.seekbar_margin));
        Paint paint = new Paint();
        paint.setColor(resources.getColor(R.color.zoom_marker_color, null));
        paint.setStyle(Style.FILL_AND_STROKE);
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.zoom_marker_stroke_width));
        paint.setAntiAlias(true);
        paint.setShadowLayer((float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_radius), (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_offset_x), (float) resources.getDimensionPixelSize(R.dimen.zoom_marker_shadow_offset_y), resources.getColor(R.color.zoom_marker_shadow_color, null));
        this.f6802g = paint;
        paint = new Paint();
        paint.setColor(resources.getColor(R.color.zoom_marker_text_color, null));
        paint.setTextAlign(Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f6803h = paint;
    }
}
