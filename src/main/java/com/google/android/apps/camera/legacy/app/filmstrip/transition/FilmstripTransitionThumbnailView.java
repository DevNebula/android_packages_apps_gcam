package com.google.android.apps.camera.legacy.app.filmstrip.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import p000.bli;

/* compiled from: PG */
public class FilmstripTransitionThumbnailView extends View {
    /* renamed from: a */
    public final Object f2515a = new Object();
    /* renamed from: b */
    public Bitmap f2516b;
    /* renamed from: c */
    public Paint f2517c;
    /* renamed from: d */
    private float f2518d = -1.0f;

    static {
        bli.m887a("FsTransThumbnail");
    }

    public FilmstripTransitionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final Bitmap mo2622a() {
        Bitmap bitmap;
        synchronized (this.f2515a) {
            bitmap = this.f2516b;
        }
        return bitmap;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2518d >= 0.0f) {
            synchronized (this.f2515a) {
                canvas.drawCircle((float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), this.f2518d, this.f2517c);
            }
        }
    }

    /* renamed from: a */
    public final void mo2623a(float f) {
        this.f2518d = f;
        invalidate();
    }
}
