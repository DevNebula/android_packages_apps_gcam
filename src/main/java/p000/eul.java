package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: eul */
public final class eul implements kov {
    /* renamed from: a */
    private final /* synthetic */ euj f17831a;

    public eul(euj euj) {
        this.f17831a = euj;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m899e("MotionTrackSampler", "Failed to fetch gyro packet.", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Pair pair = (Pair) obj;
        jga jga = this.f17831a.f17825b;
        if (pair != null && jga != null) {
            jga.mo13793a((ByteBuffer) pair.first, (BufferInfo) pair.second);
        }
    }
}
