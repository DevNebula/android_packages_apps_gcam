package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.geometry.MinDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterfw.imageutils.FastBoxBlur;
import com.google.android.libraries.smartburst.filterfw.imageutils.GridSharpness;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.libraries.smartburst.filterfw.imageutils.PerceptualSharpnessCalculator;

/* compiled from: PG */
/* renamed from: jrz */
public final class jrz implements jry {
    /* renamed from: a */
    private static final Scaler f21682a = new MinDimensionScaler(240);
    /* renamed from: b */
    private final ImageCropper f21683b;
    /* renamed from: c */
    private final int f21684c;
    /* renamed from: d */
    private final int f21685d;
    /* renamed from: e */
    private final int f21686e;
    /* renamed from: f */
    private final FastBoxBlur f21687f;
    /* renamed from: g */
    private final FastBoxBlur f21688g;

    public jrz() {
        this((byte) 0);
    }

    private jrz(byte b) {
        this.f21683b = new ImageCropper(false);
        this.f21684c = 7;
        this.f21685d = 5;
        this.f21686e = 5;
        this.f21687f = new FastBoxBlur(false, this.f21684c, 1);
        this.f21688g = new FastBoxBlur(false, 1, this.f21684c);
    }

    /* renamed from: a */
    public final jxa mo9540a(long j, Bitmap bitmap) {
        jri.m13404b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            jri.m13404b((Object) bitmap);
            FrameImage2D a = jqk.m13328a(bitmap);
            int width = a.getWidth();
            int height = a.getHeight();
            if (width > 240 && height > 240) {
                FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), f21682a.scale(width, height)).asFrameImage2D();
                this.f21683b.cropImage(a, Quad.unitQuad(), asFrameImage2D, false, false);
                a.release();
                a = asFrameImage2D;
            }
            FrameImage2D asFrameImage2D2 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), a.getDimensions()).asFrameImage2D();
            FrameImage2D asFrameImage2D3 = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), a.getDimensions()).asFrameImage2D();
            this.f21687f.computeBlur(a, asFrameImage2D2);
            this.f21688g.computeBlur(a, asFrameImage2D3);
            GridSharpness computeGridSharpness = PerceptualSharpnessCalculator.computeGridSharpness(a, asFrameImage2D2, asFrameImage2D3, this.f21685d, this.f21686e);
            asFrameImage2D2.release();
            asFrameImage2D3.release();
            jxa jxa = new jxa();
            jxa.mo9590a(jxa.f8429t, Float.valueOf(computeGridSharpness.getPerceptualSharpness()));
            jxa.mo9590a(jxa.f8430u, Float.valueOf(computeGridSharpness.getMaxGridPerceptualSharpness()));
            a.release();
            return jxa;
        } finally {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        int i = this.f21684c;
        int i2 = this.f21685d;
        int i3 = this.f21686e;
        StringBuilder stringBuilder = new StringBuilder(106);
        stringBuilder.append("ImageSharpnessMetadataExtractorboxFilterSize = ");
        stringBuilder.append(i);
        stringBuilder.append("numBlocksX = ");
        stringBuilder.append(i2);
        stringBuilder.append("numBlocksY = ");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
