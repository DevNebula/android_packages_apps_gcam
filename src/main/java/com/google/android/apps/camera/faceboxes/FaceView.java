package com.google.android.apps.camera.faceboxes;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.HashMap;
import java.util.Map;
import p000.bli;
import p000.brq;
import p000.fvk;
import p000.hdy;
import p000.iqm;

/* compiled from: PG */
public class FaceView extends View {
    /* renamed from: a */
    public int f2475a;
    /* renamed from: b */
    public boolean f2476b;
    /* renamed from: c */
    public Matrix f2477c = new Matrix();
    /* renamed from: d */
    public Face[] f2478d;
    /* renamed from: e */
    public RectF f2479e;
    /* renamed from: f */
    public int f2480f;
    /* renamed from: g */
    public int f2481g;
    /* renamed from: h */
    private iqm f2482h;
    /* renamed from: i */
    private Paint f2483i;
    /* renamed from: j */
    private int f2484j = 0;
    /* renamed from: k */
    private final RectF f2485k = new RectF();
    /* renamed from: l */
    private final Map f2486l;

    static {
        bli.m887a("FaceView");
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f2483i = new Paint();
        this.f2483i.setAntiAlias(true);
        this.f2483i.setStyle(Style.STROKE);
        this.f2483i.setStrokeWidth(resources.getDimension(R.dimen.face_rectangle_stroke));
        this.f2483i.setColor(resources.getColor(R.color.face_rectangle_color));
        this.f2486l = new HashMap();
    }

    /* renamed from: a */
    public final void mo2592a() {
        this.f2478d = null;
        this.f2486l.clear();
        mo2593b();
    }

    /* renamed from: d */
    private final int m1258d() {
        Face[] faceArr = this.f2478d;
        return faceArr != null ? faceArr.length : 0;
    }

    /* renamed from: b */
    public final void mo2593b() {
        int d = m1258d();
        if (d > 0 || this.f2484j > 0) {
            this.f2484j = m1258d();
            if (d > 0) {
                for (Face face : this.f2478d) {
                    if (face != null && face.getScore() >= 50) {
                        int id = face.getId();
                        if (id >= 0) {
                            Map map = this.f2486l;
                            Integer valueOf = Integer.valueOf(id);
                            brq brq = (brq) map.get(valueOf);
                            if (brq == null) {
                                brq = new brq(face, this.f2477c);
                                this.f2486l.put(valueOf, brq);
                                brq.mo2097a();
                            } else {
                                brq.mo2098a(face);
                            }
                        }
                    }
                }
            }
            invalidate();
            if (d == 0) {
                this.f2486l.clear();
            }
        }
    }

    public void layout(int i, int i2, int i3, int i4) {
        iqm b;
        super.layout(i, i2, i3, i4);
        this.f2485k.set((float) i, (float) i2, (float) i3, (float) i4);
        switch (hdy.m3139b(getContext())) {
            case 1:
                b = iqm.m4097b(90);
                break;
            case 2:
                b = iqm.m4097b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.m4097b(0);
                break;
        }
        this.f2482h = b;
        mo2594c();
    }

    protected void onDraw(Canvas canvas) {
        if (m1258d() > 0) {
            if (this.f2486l.isEmpty()) {
                for (Face bounds : this.f2478d) {
                    RectF rectF = new RectF(bounds.getBounds());
                    this.f2477c.mapRect(rectF);
                    canvas.drawRect(rectF, this.f2483i);
                }
            } else {
                for (brq brq : this.f2486l.values()) {
                    Paint paint = this.f2483i;
                    int i = brq.f1521f;
                    if (i > 0) {
                        paint.setAlpha(i);
                        canvas.drawCircle(brq.f1516a.f6640a, brq.f1517b.f6640a, brq.f1520e, paint);
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: c */
    public final void mo2594c() {
        RectF rectF = this.f2479e;
        if (rectF != null) {
            int i = this.f2480f;
            if (i > 0) {
                int i2 = this.f2481g;
                if (i2 > 0) {
                    iqm iqm = this.f2482h;
                    if (iqm != null) {
                        RectF rectF2 = this.f2485k;
                        if (rectF2 != null) {
                            this.f2477c = fvk.m2453a(rectF, i, i2, this.f2475a, iqm, this.f2476b, rectF2.width(), this.f2485k.height());
                        }
                    }
                }
            }
        }
    }
}
