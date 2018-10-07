package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jgy */
final class jgy {
    /* renamed from: a */
    public final ByteBuffer f8184a;
    /* renamed from: b */
    public final BufferInfo f8185b;

    jgy(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f8184a = byteBuffer;
        this.f8185b = bufferInfo;
    }

    /* renamed from: a */
    public final boolean mo9417a() {
        BufferInfo bufferInfo = this.f8185b;
        return bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0;
    }

    /* renamed from: a */
    public static jgy m4536a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        BufferInfo bufferInfo2 = new BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(bufferInfo.offset);
        duplicate.limit(bufferInfo.size + bufferInfo.offset);
        return new jgy(duplicate, bufferInfo2);
    }
}
