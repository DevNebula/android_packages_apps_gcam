package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jho */
public final class jho implements AutoCloseable {
    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f8205a;
    /* renamed from: b */
    public final /* synthetic */ BufferInfo f8206b;
    /* renamed from: c */
    private final /* synthetic */ MediaCodec f8207c;
    /* renamed from: d */
    private final /* synthetic */ int f8208d;
    /* renamed from: e */
    private final /* synthetic */ jft f8209e;

    public jho(jft jft, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i) {
        this.f8209e = jft;
        this.f8207c = mediaCodec;
        this.f8205a = byteBuffer;
        this.f8206b = bufferInfo;
        this.f8208d = i;
    }

    public final void close() {
        this.f8207c.releaseOutputBuffer(this.f8208d, false);
        this.f8209e.f8142a.f8158l.mo9409a(this.f8206b.presentationTimeUs);
        this.f8209e.mo9385a(this.f8206b);
    }
}
