package p000;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ebu */
public final class ebu implements SurfaceTextureListener, OnLayoutChangeListener, han {
    /* renamed from: a */
    private static final String f17237a = bli.m887a("TexViewHelper");
    /* renamed from: b */
    private final FrameLayout f17238b;
    /* renamed from: c */
    private final TextureView f17239c;
    /* renamed from: d */
    private final WindowManager f17240d;
    /* renamed from: e */
    private final SurfaceTextureListener f17241e;
    /* renamed from: f */
    private final ArrayList f17242f = new ArrayList();
    /* renamed from: g */
    private final ArrayList f17243g = new ArrayList();
    /* renamed from: h */
    private final cwd f17244h;
    /* renamed from: i */
    private int f17245i = 0;
    /* renamed from: j */
    private int f17246j = 0;
    /* renamed from: k */
    private boolean f17247k;
    /* renamed from: l */
    private RectF f17248l = new RectF();
    /* renamed from: m */
    private float f17249m = 0.0f;
    /* renamed from: n */
    private OnLayoutChangeListener f17250n = null;
    /* renamed from: o */
    private gyi f17251o = null;
    /* renamed from: p */
    private int f17252p = -1;

    private ebu(FrameLayout frameLayout, gyi gyi, WindowManager windowManager, SurfaceTextureListener surfaceTextureListener, cwd cwd) {
        this.f17238b = frameLayout;
        this.f17238b.addOnLayoutChangeListener(this);
        this.f17239c = (TextureView) hhz.m3217d(new TextureView(frameLayout.getContext()));
        this.f17239c.setSurfaceTextureListener(this);
        this.f17240d = windowManager;
        this.f17251o = gyi;
        this.f17241e = surfaceTextureListener;
        this.f17244h = cwd;
    }

    /* renamed from: a */
    public final void mo7603a(ham ham) {
        if (ham != null && !this.f17243g.contains(ham)) {
            this.f17243g.add(ham);
            if (this.f17248l.width() == 0.0f || this.f17248l.height() == 0.0f) {
                ham.mo7598a(new RectF(0.0f, 0.0f, (float) this.f17245i, (float) this.f17246j));
            } else {
                ham.mo7598a(new RectF(this.f17248l));
            }
        }
    }

    /* renamed from: a */
    public final void mo7599a() {
        this.f17239c.setTransform(new Matrix());
        this.f17248l.set(0.0f, 0.0f, (float) this.f17245i, (float) this.f17246j);
        m9806a(this.f17248l);
        int i = this.f17245i;
        if (i > 0) {
            int i2 = this.f17246j;
            if (i2 > 0) {
                this.f17251o.mo13503a(i, i2, true);
            }
        }
        m9807b(0.0f);
    }

    /* renamed from: a */
    public static han m9805a(View view, SurfaceTextureListener surfaceTextureListener, WindowManager windowManager, gyi gyi, cwd cwd) {
        return new hao("TextureViewLegacy --", new ebu((FrameLayout) view.findViewById(R.id.activity_root_view), gyi, windowManager, surfaceTextureListener, cwd));
    }

    /* renamed from: b */
    public final int mo7604b() {
        return this.f17239c.getHeight();
    }

    /* renamed from: c */
    public final int mo7606c() {
        return this.f17239c.getWidth();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f17239c.getParent() != null) {
            iqm b;
            int i9 = i3 - i;
            int i10 = i4 - i2;
            String str = f17237a;
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("onLayoutChange: ");
            stringBuilder.append(i9);
            stringBuilder.append("x");
            stringBuilder.append(i10);
            bli.m896d(str, stringBuilder.toString());
            boolean isInMultiWindowMode = this.f17251o.f19825a.isInMultiWindowMode();
            switch (this.f17240d.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4097b(0);
                    break;
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
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            int a = b.mo8806a();
            if (!(this.f17245i == i9 && this.f17246j == i10 && this.f17252p == a && this.f17247k == isInMultiWindowMode)) {
                this.f17245i = i9;
                this.f17246j = i10;
                this.f17252p = a;
                m9809g();
                this.f17247k = isInMultiWindowMode;
            }
            OnLayoutChangeListener onLayoutChangeListener = this.f17250n;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        }
    }

    /* renamed from: d */
    public final kpk mo7607d() {
        this.f17238b.addView(this.f17239c, 0);
        return kow.m13873a(null);
    }

    /* renamed from: e */
    public final kpk mo7608e() {
        jri.m13406b(true, (Object) "Last Create Synchronization has not finished yet.");
        this.f17238b.removeView(this.f17239c);
        return kow.m13873a(null);
    }

    /* renamed from: a */
    private final void m9806a(RectF rectF) {
        this.f17239c.post(new ebv(new ArrayList(this.f17243g), rectF));
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        if (!(this.f17245i == 0 || this.f17246j == 0)) {
            m9809g();
        }
        this.f17241e.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f17241e.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17241e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f17241e.onSurfaceTextureUpdated(surfaceTexture);
    }

    /* renamed from: b */
    public final void mo7605b(ham ham) {
        if (ham != null && this.f17243g.contains(ham)) {
            this.f17243g.remove(ham);
        }
    }

    /* renamed from: f */
    public final void mo7609f() {
        this.f17239c.requestLayout();
    }

    /* renamed from: b */
    private final void m9807b(float f) {
        String str = f17237a;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("setAspectRatio: ");
        stringBuilder.append(f);
        bli.m896d(str, stringBuilder.toString());
        if (this.f17249m != f) {
            str = f17237a;
            float f2 = this.f17249m;
            StringBuilder stringBuilder2 = new StringBuilder(42);
            stringBuilder2.append("aspect ratio changed from: ");
            stringBuilder2.append(f2);
            bli.m896d(str, stringBuilder2.toString());
            this.f17249m = f;
            ArrayList arrayList = this.f17242f;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((har) arrayList.get(i)).mo7615a();
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo7602a(OnLayoutChangeListener onLayoutChangeListener) {
        this.f17250n = onLayoutChangeListener;
    }

    /* renamed from: a */
    public final void mo7600a(float f) {
        String str = f17237a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("updateAspectRatio ");
        stringBuilder.append(f);
        bli.m896d(str, stringBuilder.toString());
        if (f <= 0.0f) {
            str = f17237a;
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid aspect ratio: ");
            stringBuilder.append(f);
            bli.m888a(str, stringBuilder.toString());
            return;
        }
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        m9807b(f);
        m9809g();
    }

    /* renamed from: b */
    private final void m9808b(Matrix matrix) {
        this.f17248l.set(0.0f, 0.0f, (float) this.f17245i, (float) this.f17246j);
        if (!this.f17251o.f19825a.isInMultiWindowMode()) {
            matrix.mapRect(this.f17248l);
        }
        m9806a(this.f17248l);
    }

    /* renamed from: g */
    private final boolean m9809g() {
        bli.m896d(f17237a, "updateTransform");
        float f = this.f17249m;
        if (!(f == 0.0f || f < 0.0f || this.f17245i == 0 || this.f17246j == 0)) {
            iqm b;
            Matrix matrix;
            switch (this.f17240d.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4097b(0);
                    break;
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
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f17252p = b.mo8806a();
            if (!this.f17251o.f19825a.isInMultiWindowMode()) {
                int i = this.f17252p;
                RectF rectF = new RectF(0.0f, 0.0f, (float) this.f17245i, (float) this.f17246j);
                RectF a = this.f17251o.mo7882a();
                if (!rectF.equals(a)) {
                    matrix = new Matrix();
                    matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                    RectF rectF2 = new RectF((rectF.width() / 2.0f) - (rectF.height() / 2.0f), (rectF.height() / 2.0f) - (rectF.width() / 2.0f), (rectF.width() / 2.0f) + (rectF.height() / 2.0f), (rectF.height() / 2.0f) + (rectF.width() / 2.0f));
                    switch (iqm.m4095a(i).ordinal()) {
                        case 1:
                            matrix.setRectToRect(rectF2, a, ScaleToFit.FILL);
                            matrix.preRotate(270.0f, (float) (this.f17245i / 2), (float) (this.f17246j / 2));
                            break;
                        case 2:
                            matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                            matrix.preRotate(180.0f, (float) (this.f17245i / 2), (float) (this.f17246j / 2));
                            break;
                        case 3:
                            matrix.setRectToRect(rectF2, a, ScaleToFit.FILL);
                            matrix.preRotate(90.0f, (float) (this.f17245i / 2), (float) (this.f17246j / 2));
                            break;
                        default:
                            matrix.setRectToRect(rectF, a, ScaleToFit.FILL);
                            break;
                    }
                }
                matrix = new Matrix();
            } else {
                cwd cwd = this.f17244h;
                iqp iqp = new iqp(this.f17245i, this.f17246j);
                iqp iqp2 = cwd.f3026a;
                matrix = iqp2 != null ? cwd.mo5875a(iqp, iqp2) : new Matrix();
            }
            this.f17239c.setTransform(matrix);
            m9808b(matrix);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7601a(Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f17245i, (float) this.f17246j);
        matrix.mapRect(rectF);
        float width = rectF.width();
        float height = rectF.height();
        if (height == 0.0f || width == 0.0f) {
            String str = f17237a;
            StringBuilder stringBuilder = new StringBuilder(55);
            stringBuilder.append("Invalid preview size: ");
            stringBuilder.append(width);
            stringBuilder.append(" x ");
            stringBuilder.append(height);
            bli.m888a(str, stringBuilder.toString());
            return;
        }
        float f = width / height;
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        if (f != this.f17249m) {
            m9807b(f);
            this.f17251o.mo13503a((int) width, (int) height, false);
        }
        RectF a = this.f17251o.mo7882a();
        Matrix matrix2 = new Matrix();
        if (!this.f17251o.f19825a.isInMultiWindowMode()) {
            matrix2.setRectToRect(rectF, a, ScaleToFit.CENTER);
            matrix.postConcat(matrix2);
        }
        this.f17239c.setTransform(matrix);
        m9808b(matrix);
    }
}
