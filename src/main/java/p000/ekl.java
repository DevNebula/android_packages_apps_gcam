package p000;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: ekl */
public final class ekl extends ejn {
    /* renamed from: f */
    private int f17490f = 0;
    /* renamed from: g */
    private ejs f17491g;

    public ekl() {
        try {
            this.f17491g = new ejs();
            this.f17491g.mo13152b(ejd.f3859e);
            this.f3886a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f3888c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.f3887b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            float f = -5.1000004f;
            while (i3 < 35) {
                float f2 = -5.1000004f;
                int i4 = i;
                i = 0;
                int i5 = i2;
                while (i < 35) {
                    short s = (short) (i4 + 1);
                    mo6253a(i4, -0.030000001f + f, f2);
                    short s2 = (short) (s + 1);
                    mo6253a(s, 0.030000001f + f, f2);
                    s = (short) (s2 + 1);
                    mo6253a(s2, f, -0.030000001f + f2);
                    short s3 = (short) (s + 1);
                    mo6253a(s, f, 0.030000001f + f2);
                    s = (short) 0;
                    while (true) {
                        s2 = s;
                        if (s2 >= (short) 4) {
                            break;
                        }
                        s = (short) (i5 + 1);
                        this.f3888c.put(i5, (short) (i4 + s2));
                        i5 = s2 + 1;
                        i2 = i5;
                    }
                    i++;
                    f2 += 0.3f;
                    short i42 = s3;
                }
                i3++;
                i = i42;
                f += 0.3f;
                i2 = i5;
            }
            this.f17490f = i2;
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }

    /* renamed from: b */
    public final void mo6255b(float[] fArr) {
        GLES20.glUseProgram(this.f17491g.f3898d);
        this.f17491g.mo13152b(ejd.f3859e);
        this.f17491g.mo6260b(this.f3886a);
        this.f17491g.mo6258a(this.f3887b);
        this.f17491g.mo6259a(fArr);
        this.f3888c.position(0);
        GLES20.glDrawElements(1, this.f17490f, 5123, this.f3888c);
    }

    /* renamed from: a */
    public final void mo6252a() {
        GLES20.glDeleteProgram(this.f17491g.f3898d);
    }
}
