package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: hfu */
public final class hfu extends ImageView {
    /* renamed from: a */
    public static final String f6536a = bli.m887a("ZoomView");
    /* renamed from: b */
    public int f6537b = 0;
    /* renamed from: c */
    public int f6538c = 0;
    /* renamed from: d */
    public hfw f6539d;
    /* renamed from: e */
    public Uri f6540e;
    /* renamed from: f */
    public int f6541f;

    public hfu(Context context) {
        super(context);
        setScaleType(ScaleType.FIT_CENTER);
        addOnLayoutChangeListener(new hfv(this));
    }

    /* renamed from: a */
    public static RectF m3162a(RectF rectF, int i, int i2) {
        RectF rectF2 = new RectF(rectF);
        float f = (float) i;
        if (rectF2.width() < f) {
            f = ((float) (i / 2)) - ((rectF2.left + rectF2.right) / 2.0f);
        } else if (rectF2.left > 0.0f) {
            f = -rectF2.left;
        } else if (rectF2.right < f) {
            f -= rectF2.right;
        } else {
            f = 0.0f;
        }
        float f2 = (float) i2;
        if (rectF2.height() < f2) {
            f2 = ((float) (i2 / 2)) - ((rectF2.top + rectF2.bottom) / 2.0f);
        } else if (rectF2.top > 0.0f) {
            f2 = -rectF2.top;
        } else if (rectF2.bottom < f2) {
            f2 -= rectF2.bottom;
        } else {
            f2 = 0.0f;
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            rectF2.offset(f, f2);
        }
        return rectF2;
    }

    /* renamed from: a */
    public final void mo7803a() {
        hfw hfw = this.f6539d;
        if (hfw != null && !hfw.isCancelled()) {
            this.f6539d.cancel(true);
            setVisibility(8);
        }
    }

    /* renamed from: a */
    static Point m3161a(InputStream inputStream) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth > 0 && options.outHeight > 0) {
            return new Point(options.outWidth, options.outHeight);
        }
        bli.m891b(f6536a, "Bitmap dimension decoding failed");
        return null;
    }

    /* renamed from: b */
    final InputStream mo7804b() {
        try {
            return getContext().getContentResolver().openInputStream(this.f6540e);
        } catch (FileNotFoundException e) {
            String str = f6536a;
            String valueOf = String.valueOf(this.f6540e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("File not found at: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            return null;
        }
    }
}
