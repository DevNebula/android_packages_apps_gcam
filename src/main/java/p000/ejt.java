package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ejt */
public class ejt extends ejn {
    /* renamed from: f */
    public static final String f17471f = bli.m887a("Sprite");
    /* renamed from: g */
    public Point f17472g = new Point();
    /* renamed from: h */
    public float f17473h;
    /* renamed from: i */
    public float f17474i;
    /* renamed from: j */
    public float[] f17475j = new float[16];
    /* renamed from: k */
    public int f17476k;
    /* renamed from: l */
    public boolean f17477l = false;
    /* renamed from: m */
    private float f17478m = 4.0f;
    /* renamed from: n */
    private float[] f17479n = new float[16];
    /* renamed from: o */
    private int f17480o;
    /* renamed from: p */
    private ArrayList f17481p = new ArrayList();

    /* renamed from: b */
    public final void mo6255b(float[] fArr) {
    }

    /* renamed from: a */
    public final void mo13153a(float[] fArr, float f, float f2, float f3) {
        if (!this.f17477l) {
            bli.m891b(f17471f, "Sprite not initialized.");
        } else if (this.f3890e != null) {
            GLES20.glUseProgram(this.f3890e.f3898d);
            this.f3886a.position(0);
            this.f3887b.position(0);
            this.f3890e.mo6260b(this.f3886a);
            this.f3890e.mo6258a(this.f3887b);
            Matrix.translateM(this.f17475j, 0, fArr, 0, f, f2, 0.0f);
            Matrix.rotateM(this.f17475j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            if (f3 != 1.0f) {
                Matrix.scaleM(this.f17475j, 0, f3, f3, f3);
            }
            this.f3890e.mo6259a(this.f17475j);
            if (this.f3889d.size() != 0) {
                ((ejo) this.f3889d.get(0)).mo6256a();
                this.f3888c.position(0);
                GLES20.glDrawElements(4, this.f17476k, 5123, this.f3888c);
            }
        }
    }

    /* renamed from: a */
    public final void mo6252a() {
        ArrayList arrayList = this.f17481p;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ejo ejo = (ejo) arrayList.get(i);
                if (ejo != null) {
                    ejo.mo6257d();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f17481p.clear();
        }
    }

    /* renamed from: a */
    public final boolean mo13154a(Context context, int i, float f) {
        int i2 = 0;
        if (!m9884a(context, i)) {
            return false;
        }
        this.f17478m = f;
        float[] fArr = new float[12];
        float f2 = this.f17473h;
        float f3 = -f2;
        fArr[0] = f3;
        float f4 = this.f17474i;
        fArr[1] = f4;
        float f5 = this.f17478m;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f4;
        fArr[5] = f5;
        fArr[6] = f2;
        f2 = -f4;
        fArr[7] = f2;
        fArr[8] = f5;
        fArr[9] = f3;
        fArr[10] = f2;
        fArr[11] = f5;
        while (i2 < 12) {
            this.f3886a.put(i2, fArr[i2]);
            i2++;
        }
        this.f17477l = true;
        return true;
    }

    /* renamed from: a */
    private final boolean m9884a(Context context, int i) {
        ejo ejo = new ejo();
        this.f3889d.add(0, ejo);
        this.f17481p.add(ejo);
        Options options = new Options();
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
        if (decodeResource == null) {
            return false;
        }
        this.f17472g.set(decodeResource.getWidth(), decodeResource.getHeight());
        try {
            ejo = (ejo) this.f3889d.get(0);
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            ejo.f3893a = iArr[0];
            GLES20.glBindTexture(3553, ejo.f3893a);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, WrapAxes.f2676S, WrapModes.CLAMP_TO_EDGE);
            GLES20.glTexParameteri(3553, WrapAxes.f2677T, WrapModes.CLAMP_TO_EDGE);
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            ejp.m1849a("Texture : loadBitmap");
            decodeResource.recycle();
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        decodeResource.recycle();
        this.f17476k = 6;
        this.f17480o = 4;
        this.f3886a = ByteBuffer.allocateDirect((this.f17480o * 3) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i2 = this.f17480o;
        this.f3887b = ByteBuffer.allocateDirect((i2 + i2) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        i2 = this.f17476k;
        this.f3888c = ByteBuffer.allocateDirect(i2 + i2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f3886a.clear();
        this.f3887b.clear();
        this.f3888c.clear();
        Point point = this.f17472g;
        this.f17473h = ((float) point.x) / 2.0f;
        this.f17474i = ((float) point.y) / 2.0f;
        float[] fArr = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        for (i2 = 0; i2 < 8; i2++) {
            this.f3887b.put(i2, fArr[i2]);
        }
        short[] sArr = new short[]{(short) 0, (short) 1, (short) 2, (short) 0, (short) 2, (short) 3};
        for (i2 = 0; i2 < 6; i2++) {
            this.f3888c.put(i2, sArr[i2]);
        }
        Matrix.setIdentityM(this.f17479n, 0);
        return true;
    }
}
