package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: etr */
final class etr implements jhf {
    /* renamed from: a */
    private final jhf f17791a;
    /* renamed from: b */
    private final kpw f17792b;

    public etr(jhf jhf, kpw kpw) {
        this.f17791a = jhf;
        this.f17792b = kpw;
    }

    public final void close() {
        try {
            this.f17791a.close();
        } catch (Throwable th) {
            this.f17792b.cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo9430a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        try {
            this.f17791a.mo9430a(byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f17792b.mo15641a(Long.valueOf(bufferInfo.presentationTimeUs));
            }
        } catch (Throwable th) {
            this.f17792b.cancel(false);
        }
    }
}
