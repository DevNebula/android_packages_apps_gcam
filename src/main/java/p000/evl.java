package p000;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: evl */
final class evl {
    /* renamed from: a */
    private final /* synthetic */ evb f4501a;

    evl(evb evb) {
        this.f4501a = evb;
    }

    /* renamed from: a */
    final jfx mo6619a() {
        jfx jfx;
        synchronized (this.f4501a.f17854a) {
            jri.m13406b(true, (Object) "Trying to use an available input buffer twice");
            jfw jfw = ((jgb) jri.m13404b(this.f4501a.f17859f)).f21462a;
            if (jfw.f8150d != null) {
                throw new AssertionError("MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
            }
            Object obj;
            int a = jfw.mo9390a();
            if (a < 0) {
                obj = null;
            } else {
                ByteBuffer inputBuffer = jfw.f8147a.getInputBuffer(a);
                if (inputBuffer == null) {
                    obj = null;
                } else {
                    int capacity = inputBuffer.capacity();
                    Image inputImage = jfw.f8147a.getInputImage(a);
                    if (inputImage == null) {
                        obj = null;
                    } else {
                        obj = new jfs(jfw, inputImage, capacity, a);
                    }
                }
            }
            jfx = (jfx) jri.m13391a(obj, (Object) "Couldn't fetch input buffer from codec even though we got a callback");
        }
        return jfx;
    }
}
