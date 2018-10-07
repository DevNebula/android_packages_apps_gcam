package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;

/* renamed from: euu */
final /* synthetic */ class euu implements kbn {
    /* renamed from: a */
    private final BufferInfo f17851a;
    /* renamed from: b */
    private final MediaFormat f17852b;

    euu(BufferInfo bufferInfo, MediaFormat mediaFormat) {
        this.f17851a = bufferInfo;
        this.f17852b = mediaFormat;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        BufferInfo bufferInfo = this.f17851a;
        MediaFormat mediaFormat = this.f17852b;
        return String.format("muxer writing <%d> %s", new Object[]{Long.valueOf(bufferInfo.presentationTimeUs), mediaFormat.getString("mime")});
    }
}
