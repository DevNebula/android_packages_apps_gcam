package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jqp */
public class jqp {
    /* renamed from: a */
    private static volatile Matrix f8303a;

    private jqp() {
    }

    /* renamed from: a */
    private static void m4672a(Bitmap bitmap, jqr jqr) {
        if (jqr.mo9674e() != bitmap) {
            String valueOf = String.valueOf(jqr.mo9674e());
            String valueOf2 = String.valueOf(bitmap);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length());
            stringBuilder.append("Expected: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", Got: ");
            stringBuilder.append(valueOf2);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static void m4674a(jqr jqr, Config config) {
        Config config2 = ((Bitmap) jqr.mo9674e()).getConfig();
        if (config2 != config) {
            ((Bitmap) jqr.mo9674e()).recycle();
            String valueOf = String.valueOf(config2);
            String valueOf2 = String.valueOf(config);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(valueOf2).length());
            stringBuilder.append("Config of bitmap (");
            stringBuilder.append(valueOf);
            stringBuilder.append(") does not match expected config (");
            stringBuilder.append(valueOf2);
            stringBuilder.append(")");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static void m4673a(jqr jqr, int i, int i2) {
        int width = ((Bitmap) jqr.mo9674e()).getWidth();
        int height = ((Bitmap) jqr.mo9674e()).getHeight();
        if (width != i || height != i2) {
            ((Bitmap) jqr.mo9674e()).recycle();
            StringBuilder stringBuilder = new StringBuilder(95);
            stringBuilder.append("Size of bitmap (");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            stringBuilder.append(") does not match expected size (");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append(")");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static jqr m4664a(jqo jqo, String str, Bitmap bitmap) {
        return jqp.m4666a(jqo, str, bitmap, bitmap.getWidth(), bitmap.getHeight(), null, false);
    }

    /* renamed from: a */
    private static jqr m4666a(jqo jqo, String str, Bitmap bitmap, int i, int i2, Matrix matrix, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("width must be > 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        } else if (i > bitmap.getWidth()) {
            throw new IllegalArgumentException("x + width must be <= bitmap.width()");
        } else if (i2 > bitmap.getHeight()) {
            throw new IllegalArgumentException("y + height must be <= bitmap.height()");
        } else {
            jqr jqr;
            Paint paint;
            Canvas canvas = new Canvas();
            Rect rect = new Rect(0, 0, i, i2);
            RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
            Config config = Config.ARGB_8888;
            Config config2 = bitmap.getConfig();
            if (config2 != null) {
                switch (jqq.f8304a[config2.ordinal()]) {
                    case 1:
                        config = Config.RGB_565;
                        break;
                    case 2:
                        config = Config.ALPHA_8;
                        break;
                    default:
                        config = Config.ARGB_8888;
                        break;
                }
            }
            jqr a;
            if (matrix == null || matrix.isIdentity()) {
                a = jqo.mo9529a(str, i, i2, config);
                canvas.setBitmap((Bitmap) a.mo9674e());
                jqr = a;
                paint = null;
            } else {
                int rectStaysRect = matrix.rectStaysRect() ^ 1;
                RectF rectF2 = new RectF();
                matrix.mapRect(rectF2, rectF);
                int round = Math.round(rectF2.width());
                int round2 = Math.round(rectF2.height());
                if (rectStaysRect != 0) {
                    config = Config.ARGB_8888;
                }
                a = jqo.mo9529a(str, round, round2, config);
                canvas.setBitmap((Bitmap) a.mo9674e());
                canvas.translate(-rectF2.left, -rectF2.top);
                canvas.concat(matrix);
                Paint paint2 = new Paint();
                paint2.setFilterBitmap(z);
                if (rectStaysRect != 0) {
                    paint2.setAntiAlias(true);
                    jqr = a;
                    paint = paint2;
                } else {
                    jqr = a;
                    paint = paint2;
                }
            }
            ((Bitmap) jqr.mo9674e()).setDensity(bitmap.getDensity());
            ((Bitmap) jqr.mo9674e()).setHasAlpha(bitmap.hasAlpha());
            ((Bitmap) jqr.mo9674e()).setPremultiplied(bitmap.isPremultiplied());
            canvas.drawBitmap(bitmap, rect, rectF, paint);
            canvas.setBitmap(null);
            return jqr;
        }
    }

    /* renamed from: a */
    public static jqr m4669a(jqo jqo, String str, ByteBuffer byteBuffer, int i, int i2) {
        jqr a = jqo.mo9529a(str, i, i2, Config.ARGB_8888);
        ((Bitmap) a.mo9674e()).copyPixelsFromBuffer(byteBuffer);
        return a;
    }

    /* renamed from: a */
    public static jqr m4671a(jqo jqo, jzp jzp, String str) {
        jqr a = jqo.mo9529a(str, jzp.f8515a, jzp.f8516b, Config.ARGB_8888);
        if (!((Bitmap) a.mo9674e()).isPremultiplied() && ((Bitmap) a.mo9674e()).hasAlpha()) {
            ((Bitmap) a.mo9674e()).setPremultiplied(true);
        }
        new Canvas((Bitmap) a.mo9674e()).drawARGB(Illuminant.kOther, Illuminant.kOther, Illuminant.kOther, Illuminant.kOther);
        return a;
    }

    /* renamed from: a */
    public static jqr m4665a(jqo jqo, String str, Bitmap bitmap, int i, int i2) {
        Matrix matrix;
        synchronized (jqp.class) {
            matrix = f8303a;
            f8303a = null;
        }
        if (matrix == null) {
            matrix = new Matrix();
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
        stringBuilder.append(str);
        stringBuilder.append(":scaled:");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        String stringBuilder2 = stringBuilder.toString();
        matrix.setScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        jqr a = jqp.m4666a(jqo, stringBuilder2, bitmap, width, height, matrix, true);
        synchronized (jqp.class) {
            if (f8303a == null) {
                f8303a = matrix;
            }
        }
        return a;
    }

    /* renamed from: a */
    public static jqr m4670a(jqo jqo, String str, jqr jqr, int i, int i2) {
        return jqp.m4665a(jqo, str, (Bitmap) jqr.mo9674e(), i, i2);
    }

    /* renamed from: a */
    public static jqr m4667a(jqo jqo, String str, Options options) {
        String valueOf;
        String str2;
        if (options.inJustDecodeBounds) {
            valueOf = String.valueOf(str);
            str2 = "file:";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            return jqo.mo9530a(valueOf, BitmapFactory.decodeFile(str, options));
        }
        jqr a;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        int i2 = options.outHeight;
        Config config = options.inPreferredConfig;
        valueOf = String.valueOf(str);
        str2 = "file:";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        if (options.inBitmap != null) {
            Log.w("BitmapAllocators", "decodeFile called with existing bitmap, taking ownership");
            a = jqo.mo9530a(valueOf, options.inBitmap);
        } else {
            jqr a2 = jqo.mo9529a(valueOf, i, i2, config);
            options.inBitmap = (Bitmap) a2.mo9674e();
            a = a2;
        }
        jqp.m4672a(BitmapFactory.decodeFile(str, options), a);
        jqp.m4673a(a, i, i2);
        jqp.m4674a(a, config);
        return a;
    }

    /* renamed from: a */
    public static jqr m4668a(jqo jqo, String str, Rect rect) {
        Options options = new Options();
        Config config = options.inPreferredConfig;
        String valueOf = String.valueOf(rect);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 6) + String.valueOf(valueOf).length());
        stringBuilder.append("file:");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(valueOf);
        jqr a = jqo.mo9529a(stringBuilder.toString(), rect.width(), rect.height(), config);
        options.inBitmap = (Bitmap) a.mo9674e();
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(str, true);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, options);
            newInstance.recycle();
            jqp.m4672a(decodeRegion, a);
            jqp.m4673a(a, rect.width(), rect.height());
            jqp.m4674a(a, config);
            return a;
        } catch (IOException e) {
            String valueOf2 = String.valueOf(rect);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            stringBuilder2.append("Could not decoded bitmap region ");
            stringBuilder2.append(valueOf2);
            throw new RuntimeException(stringBuilder2.toString());
        }
    }
}
