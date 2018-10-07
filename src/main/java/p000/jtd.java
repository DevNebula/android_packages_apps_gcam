package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.imageutils.Histograms;
import com.google.android.libraries.smartburst.filterfw.imageutils.RgbToHsvConverter;
import com.google.android.libraries.smartburst.utils.Feature;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: jtd */
public final class jtd implements jtf {
    /* renamed from: a */
    private final int f21718a = 6;
    /* renamed from: b */
    private final int f21719b = 3;
    /* renamed from: c */
    private final int f21720c = 26;
    /* renamed from: d */
    private final int f21721d = 51;
    /* renamed from: e */
    private final int f21722e;
    /* renamed from: f */
    private final FloatBuffer f21723f;
    /* renamed from: g */
    private final FloatBuffer f21724g;

    public jtd() {
        int i = this.f21718a;
        this.f21722e = i;
        this.f21723f = jtd.m13439a(i * this.f21719b);
        this.f21724g = jtd.m13439a(this.f21722e);
    }

    /* renamed from: a */
    private static FloatBuffer m13439a(int i) {
        return ByteBuffer.allocateDirect(i << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: a */
    public final synchronized List mo9546a(Bitmap bitmap) {
        List a;
        jri.m13404b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            FrameImage2D a2 = jqk.m13328a(bitmap);
            RgbToHsvConverter rgbToHsvConverter = new RgbToHsvConverter(false);
            FrameImage2D a3 = jqk.m13327a(bitmap.getWidth(), bitmap.getHeight());
            rgbToHsvConverter.convertImage(a2, a3);
            this.f21723f.rewind();
            this.f21724g.rewind();
            Histograms.extractHueSatValueHistogram(a3, this.f21718a, this.f21719b, this.f21722e, this.f21720c, this.f21721d, this.f21723f, this.f21724g);
            float[] a4 = jtd.m13440a(this.f21723f);
            float[] a5 = jtd.m13440a(this.f21724g);
            Feature feature = new Feature(jza.HUE_SAT_HISTOGRAM, a4);
            Feature feature2 = new Feature(jza.VALUE_HISTOGRAM, a5);
            a2.release();
            a3.release();
            a = khb.m4924a(feature, feature2);
            FrameManager.detachFromThread();
        } catch (Throwable th) {
            FrameManager.detachFromThread();
        }
        return a;
    }

    /* renamed from: a */
    private static float[] m13440a(FloatBuffer floatBuffer) {
        float[] fArr = new float[floatBuffer.remaining()];
        floatBuffer.get(fArr);
        return fArr;
    }
}
