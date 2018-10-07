package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.Trace;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: hfw */
public final class hfw extends AsyncTask {
    /* renamed from: a */
    private BitmapRegionDecoder f6543a;
    /* renamed from: b */
    private final /* synthetic */ hfu f6544b;

    public hfw(hfu hfu) {
        this.f6544b = hfu;
    }

    /* renamed from: a */
    private final Bitmap m3165a(RectF... rectFArr) {
        int i = 1;
        Trace.beginSection("ZoomView#DecodePartialBitmap#doInBackground");
        RectF rectF = rectFArr[0];
        InputStream b = this.f6544b.mo7804b();
        if (b == null) {
            return null;
        }
        Point a = hfu.m3161a(b);
        try {
            b.close();
        } catch (Throwable e) {
            bli.m892b(hfu.f6536a, "exception closing dimensions inputstream", e);
        }
        if (a == null) {
            return null;
        }
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) (a.x - 1), (float) (a.y - 1));
        Matrix matrix = new Matrix();
        matrix.setRotate((float) this.f6544b.f6541f, 0.0f, 0.0f);
        matrix.mapRect(rectF2);
        matrix.postTranslate(-rectF2.left, -rectF2.top);
        matrix.mapRect(rectF2, new RectF(0.0f, 0.0f, (float) (a.x - 1), (float) (a.y - 1)));
        RectF rectF3 = new RectF(rectF);
        hfu hfu = this.f6544b;
        rectF3.intersect(0.0f, 0.0f, (float) (hfu.f6537b - 1), (float) (hfu.f6538c - 1));
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
        rectF = new RectF();
        matrix2.mapRect(rectF, rectF3);
        rectF2 = new RectF();
        Matrix matrix3 = new Matrix();
        matrix.invert(matrix3);
        matrix3.mapRect(rectF2, rectF);
        Rect rect = new Rect();
        rectF2.round(rect);
        rect.intersect(0, 0, a.x - 1, a.y - 1);
        if (rect.width() == 0 || rect.height() == 0) {
            String str = hfu.f6536a;
            String valueOf = String.valueOf(rect.toString());
            String str2 = "Invalid size for partial region. Region: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m891b(str, valueOf);
            return null;
        } else if (isCancelled()) {
            return null;
        } else {
            Options options = new Options();
            hfu hfu2 = this.f6544b;
            int width;
            int min;
            if ((hfu2.f6541f + 360) % MediaDecoder.ROTATE_180 == 0) {
                width = rect.width();
                min = (int) (1.0f / Math.min(((float) hfu2.f6538c) / ((float) rect.height()), ((float) hfu2.f6537b) / ((float) width)));
                if (min > 1) {
                    for (width = 0; width < 32; width++) {
                        if ((1 << (width + 1)) > min) {
                            min = 1 << width;
                            break;
                        }
                    }
                } else {
                    min = 1;
                }
                options.inSampleSize = min;
            } else {
                width = rect.height();
                min = (int) (1.0f / Math.min(((float) hfu2.f6538c) / ((float) rect.width()), ((float) hfu2.f6537b) / ((float) width)));
                if (min > 1) {
                    for (width = 0; width < 32; width++) {
                        if ((1 << (width + 1)) > min) {
                            i = 1 << width;
                            break;
                        }
                    }
                    i = min;
                }
                options.inSampleSize = i;
            }
            if (this.f6543a == null) {
                InputStream b2 = this.f6544b.mo7804b();
                if (b2 == null) {
                    return null;
                }
                try {
                    this.f6543a = BitmapRegionDecoder.newInstance(b2, false);
                    b2.close();
                } catch (IOException e2) {
                    bli.m891b(hfu.f6536a, "Failed to instantiate region decoder");
                }
            }
            BitmapRegionDecoder bitmapRegionDecoder = this.f6543a;
            if (bitmapRegionDecoder == null) {
                return null;
            }
            Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion(rect, options);
            if (isCancelled()) {
                return null;
            }
            Matrix matrix4 = new Matrix();
            matrix4.setRotate((float) this.f6544b.f6541f);
            decodeRegion = Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix4, false);
            Trace.endSection();
            return decodeRegion;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.f6544b.f6539d = null;
        BitmapRegionDecoder bitmapRegionDecoder = this.f6543a;
        if (!(bitmapRegionDecoder == null || bitmapRegionDecoder == null)) {
            bitmapRegionDecoder.recycle();
        }
        if (bitmap != null) {
            this.f6544b.setImageBitmap(bitmap);
            this.f6544b.setVisibility(0);
        }
    }

    protected final void onPreExecute() {
        this.f6543a = null;
    }
}
