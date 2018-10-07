package p000;

import android.media.MediaCodec.BufferInfo;
import java.util.Collections;

/* renamed from: ipb */
public final /* synthetic */ class ipb implements Runnable {
    /* renamed from: a */
    private final ioo f7638a;
    /* renamed from: b */
    private final BufferInfo f7639b;

    public ipb(ioo ioo, BufferInfo bufferInfo) {
        this.f7638a = ioo;
        this.f7639b = bufferInfo;
    }

    public final void run() {
        ioo ioo = this.f7638a;
        BufferInfo bufferInfo = this.f7639b;
        for (iop a : Collections.unmodifiableCollection(ioo.f21108d)) {
            a.mo8683a(bufferInfo.presentationTimeUs, (long) bufferInfo.size);
        }
    }
}
