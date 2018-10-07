package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.googlex.gcam.hdrplus.MetadataConverter;

/* compiled from: PG */
/* renamed from: ra */
class C0445ra {
    /* renamed from: b */
    private static final int[] f9603b = new int[]{16843067, 16843068};
    /* renamed from: a */
    public Bitmap f9604a;
    /* renamed from: c */
    private final ProgressBar f9605c;

    C0445ra(ProgressBar progressBar) {
        this.f9605c = progressBar;
    }

    /* renamed from: a */
    void mo10968a(AttributeSet attributeSet, int i) {
        C0540vk a = C0540vk.m6109a(this.f9605c.getContext(), attributeSet, f9603b, i, 0);
        Drawable c = a.mo11392c(0);
        if (c != null) {
            ProgressBar progressBar = this.f9605c;
            if (c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                Drawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m5808a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR);
                c = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c);
        }
        c = a.mo11392c(1);
        if (c != null) {
            this.f9605c.setProgressDrawable(m5808a(c, false));
        }
        a.f9927b.recycle();
    }

    /* renamed from: a */
    private final Drawable m5808a(Drawable drawable, boolean z) {
        int i = 0;
        Drawable layerDrawable;
        if (drawable instanceof C0264he) {
            C0264he c0264he = (C0264he) drawable;
            Drawable a = c0264he.mo7759a();
            if (a == null) {
                return drawable;
            }
            m5808a(a, z);
            c0264he.mo7760b();
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable2.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable2.getId(i2);
                Drawable drawable2 = layerDrawable2.getDrawable(i2);
                if (id == 16908301) {
                    z2 = true;
                } else if (id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i2] = m5808a(drawable2, z2);
            }
            layerDrawable = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                layerDrawable.setId(i, layerDrawable2.getId(i));
                i++;
            }
            return layerDrawable;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f9604a == null) {
                this.f9604a = bitmap;
            }
            layerDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            layerDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            layerDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(layerDrawable, 3, 1) : layerDrawable;
        }
    }
}
