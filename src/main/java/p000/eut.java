package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: eut */
final class eut implements jhf {
    /* renamed from: a */
    private final /* synthetic */ jhf f17848a;
    /* renamed from: b */
    private final /* synthetic */ jhe f17849b;
    /* renamed from: c */
    private final /* synthetic */ eus f17850c;

    eut(eus eus, jhf jhf, jhe jhe) {
        this.f17850c = eus;
        this.f17848a = jhf;
        this.f17849b = jhe;
    }

    public final void close() {
        euv euv = new euv(this.f17849b);
        this.f17848a.close();
    }

    /* renamed from: a */
    public final void mo9430a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        this.f17848a.mo9430a(byteBuffer, bufferInfo);
        MediaFormat mediaFormat = this.f17849b.f8199b;
        euu euu = new euu(bufferInfo, mediaFormat);
        if (mediaFormat.getString("mime").startsWith("video/")) {
            synchronized (this.f17850c.f17846a) {
                euw euw = this.f17850c.f17846a;
                int i = euw.f4485a;
                if (i == 0) {
                    euw.f4486b = Long.MAX_VALUE;
                }
                euw.f4485a = i + 1;
                euw.f4486b = Math.min(bufferInfo.presentationTimeUs, euw.f4486b);
                euw = this.f17850c.f17846a;
                euw.f4487c = Math.max(bufferInfo.presentationTimeUs, euw.f4487c);
            }
        }
    }
}
