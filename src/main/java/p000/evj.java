package p000;

import android.media.MediaCodec.BufferInfo;

/* compiled from: PG */
/* renamed from: evj */
final class evj implements jgk {
    /* renamed from: a */
    public final /* synthetic */ evb f17867a;

    evj(evb evb) {
        this.f17867a = evb;
    }

    /* renamed from: a */
    public final void mo9411a(jfw jfw) {
        this.f17867a.f17857d.post(new evk(this));
    }

    /* renamed from: a */
    public final void mo9409a(long j) {
        eto.m2163c();
        eto.m2162b();
    }

    /* renamed from: a */
    public final void mo9410a(BufferInfo bufferInfo) {
        evm evm = this.f17867a.f17856c;
        if (evm != null) {
            evm.f4502a.f17868a.mo6690a(bufferInfo.presentationTimeUs, new evq(bufferInfo));
        }
    }

    /* renamed from: a */
    public final void mo9407a() {
    }

    /* renamed from: a */
    public final void mo9408a(int i) {
    }
}
