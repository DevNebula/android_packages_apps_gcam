package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.util.Log;

/* compiled from: PG */
/* renamed from: jft */
public final class jft extends Callback {
    /* renamed from: a */
    public final /* synthetic */ jfw f8142a;

    jft(jfw jfw) {
        this.f8142a = jfw;
    }

    /* renamed from: a */
    public final void mo9385a(BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            this.f8142a.f8147a.flush();
            this.f8142a.f8151e.clear();
            this.f8142a.f8148b.set(3);
            if (this.f8142a.f8154h.get()) {
                this.f8142a.f8158l.mo9408a(C0252go.f5871bQ);
            } else {
                this.f8142a.f8158l.mo9408a(C0252go.f5870bP);
            }
            if (this.f8142a.f8154h.getAndSet(false)) {
                this.f8142a.mo9392b();
            }
        }
    }

    public final void onError(MediaCodec mediaCodec, CodecException codecException) {
        String valueOf = String.valueOf(codecException);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
        stringBuilder.append("Error occurred while processing data: ");
        stringBuilder.append(valueOf);
        Log.w("AsynchMediaCodec", stringBuilder.toString());
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (this.f8142a.f8153g.getAndSet(false)) {
            this.f8142a.mo9391a(i);
        } else {
            this.f8142a.f8151e.addLast(Integer.valueOf(i));
        }
        jfw jfw = this.f8142a;
        jfw.f8158l.mo9411a(jfw);
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        boolean z = this.f8142a.f8155i.get();
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.size = 0;
        }
        if (bufferInfo.size <= 0 || z) {
            mediaCodec.releaseOutputBuffer(i, false);
            mo9385a(bufferInfo);
            return;
        }
        this.f8142a.f8158l.mo9410a(bufferInfo);
        this.f8142a.f8157k.mo9436a(new jho(this, mediaCodec, mediaCodec.getOutputBuffer(i), bufferInfo, i));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f8142a.f8157k.mo9435a(mediaFormat);
    }
}
