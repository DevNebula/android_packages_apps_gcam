package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jfm */
public final class jfm extends jfl {
    /* renamed from: d */
    private final /* synthetic */ int f21446d = 2;
    /* renamed from: e */
    private final /* synthetic */ float[] f21447e;

    public jfm(int i, jcg jcg, float[] fArr) {
        this.f21447e = fArr;
        super(i, jcg, 2);
    }

    public final String toString() {
        int i = this.f8128a;
        int i2 = this.f21446d;
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("GLVertexData{vertexCount=");
        stringBuilder.append(i);
        stringBuilder.append(", type=");
        stringBuilder.append(i2);
        stringBuilder.append("D float32");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo9381a(int i, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (true) {
            int i3 = this.f21446d;
            if (i2 < i3) {
                byteBuffer.putFloat(this.f21447e[(i3 * i) + i2]);
                i2++;
            } else {
                return;
            }
        }
    }
}
