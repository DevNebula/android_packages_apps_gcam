package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jfz */
public class jfz implements jga {
    /* renamed from: a */
    private jhf f24739a;
    /* renamed from: b */
    private volatile boolean f24740b = false;

    public jfz(jhf jhf) {
        this.f24739a = jhf;
    }

    /* renamed from: a */
    public final kpk mo9402a() {
        this.f24739a.close();
        return kow.m13873a((Object) jfz.class);
    }

    /* renamed from: b */
    public final void mo9403b() {
    }

    /* renamed from: a */
    public final void mo13793a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        boolean z = this.f24740b;
        this.f24739a.mo9430a(byteBuffer, bufferInfo);
    }
}
