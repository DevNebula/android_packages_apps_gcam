package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import p000.bsy;
import p000.bsz;
import p000.bta;
import p000.hdy;
import p000.hir;
import p000.iqm;

/* compiled from: PG */
public class FocusIndicatorRingView extends View {
    /* renamed from: a */
    public final bsz f2487a;
    /* renamed from: b */
    public final bta f2488b;
    /* renamed from: c */
    private PointF f2489c;
    /* renamed from: d */
    private hir f2490d;
    /* renamed from: e */
    private boolean f2491e;

    public FocusIndicatorRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2487a = new bsz(new bsy());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Style.FILL);
        this.f2488b = new bta(shapeDrawable);
    }

    FocusIndicatorRingView(Context context, bsz bsz, bta bta) {
        super(context);
        this.f2487a = bsz;
        this.f2488b = bta;
    }

    /* renamed from: a */
    public final void mo2597a(PointF pointF) {
        this.f2489c = pointF;
        setX(pointF.x - ((float) (getWidth() / 2)));
        setY(pointF.y - ((float) (getHeight() / 2)));
    }

    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        bsz bsz = this.f2487a;
        Drawable drawable = bsz.f1540a;
        if (drawable != null) {
            f = bsz.f1541b;
            if (f > 0.0f) {
                bsy.m981a(canvas, drawable, f);
            }
        }
        bta bta = this.f2488b;
        drawable = bta.f1545a;
        if (drawable != null) {
            f = bta.f1546b;
            if (f > 0.0f) {
                bsy.m981a(canvas, drawable, f);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = (View) getParent();
        hir hir = this.f2490d;
        Context context = getContext();
        this.f2490d = hir.m3236a(hdy.m3139b(context), hdy.m3140c(context), view.getMeasuredWidth(), view.getMeasuredHeight());
        if (this.f2491e) {
            iqm iqm;
            hir hir2 = this.f2490d;
            PointF pointF = this.f2489c;
            int width = view.getWidth();
            int height = view.getHeight();
            switch (m1262a(hir2) - m1262a(hir)) {
                case -270:
                case 90:
                    iqm = iqm.CLOCKWISE_270;
                    break;
                case -180:
                case MediaDecoder.ROTATE_180 /*180*/:
                    iqm = iqm.CLOCKWISE_180;
                    break;
                case -90:
                case MediaDecoder.ROTATE_90_LEFT /*270*/:
                    iqm = iqm.CLOCKWISE_90;
                    break;
                case 0:
                    iqm = iqm.CLOCKWISE_0;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (pointF != null) {
                PointF pointF2 = new PointF();
                switch (iqm.ordinal()) {
                    case 1:
                        pointF2.set(((float) width) - pointF.y, pointF.x);
                        break;
                    case 2:
                        pointF2.set(((float) width) - pointF.x, ((float) height) - pointF.y);
                        break;
                    case 3:
                        pointF2.set(pointF.y, ((float) height) - pointF.x);
                        break;
                    default:
                        pointF2.set(pointF.x, pointF.y);
                        break;
                }
                mo2597a(pointF2);
            }
        }
        this.f2491e = true;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2487a.f1540a.setBounds(0, 0, i, i2);
        this.f2488b.f1545a.setBounds(0, 0, i, i2);
    }

    /* renamed from: a */
    private static int m1262a(hir hir) {
        switch (hir.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return MediaDecoder.ROTATE_90_LEFT;
            case 3:
                return MediaDecoder.ROTATE_180;
            default:
                throw new IllegalArgumentException();
        }
    }
}
