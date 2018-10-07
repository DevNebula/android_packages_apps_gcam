package com.google.android.apps.camera.p005ui.gridlines;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;
import java.util.Map;
import p000.gxi;
import p000.gxj;
import p000.gxk;
import p000.gxl;
import p000.gyf;
import p000.kes;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.gridlines.GridLinesUi */
public class GridLinesUi extends View {
    /* renamed from: c */
    private static final gxj f2600c = new gxi();
    /* renamed from: d */
    private static final gxj f2601d = new gxl(new float[]{0.0f, 1.0f}, false, true);
    /* renamed from: e */
    private static final gxj f2602e = new gxl(new float[]{0.33333334f, 0.6666666f}, false, false);
    /* renamed from: f */
    private static final gxj f2603f = new gxl(new float[]{0.25f, 0.5f, 0.75f}, true, false);
    /* renamed from: g */
    private static final gxj f2604g = new gxl(new float[]{0.38196602f, 0.618034f}, false, false);
    /* renamed from: a */
    public final Map f2605a = kes.m4865a(gxk.f6126a, f2601d, gxk.f6127b, f2602e, gxk.f6128c, f2603f, gxk.f6129d, f2604g);
    /* renamed from: b */
    public final gyf f2606b;
    /* renamed from: h */
    private final Paint f2607h = new Paint();
    /* renamed from: i */
    private final Paint f2608i = new Paint();

    public GridLinesUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2607h.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        this.f2607h.setColor(context.getResources().getColor(R.color.grid_line, null));
        this.f2608i.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        this.f2608i.setColor(context.getResources().getColor(R.color.grid_line, null));
        this.f2606b = new gyf(this, this.f2607h, this.f2608i);
        this.f2606b.mo7540a(f2600c);
    }

    public void onDraw(Canvas canvas) {
        gyf gyf = this.f2606b;
        if (!gyf.f6158b.f6123g) {
            gyf.f6160d.mo7538a(canvas, gyf.f6157a);
            gyf.f6161e.mo7538a(canvas, gyf.f6157a);
            gyf.f6162f.mo7538a(canvas, gyf.f6157a);
            gyf.f6163g.mo7538a(canvas, gyf.f6157a);
            gyf.f6164h.mo7538a(canvas, gyf.f6157a);
            gyf.f6165i.mo7538a(canvas, gyf.f6157a);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gyf gyf = this.f2606b;
        gyf.f6157a.set((float) i, (float) i2, (float) i3, (float) i4);
        gyf.mo7539a();
        gyf.f6159c.invalidate();
    }
}
