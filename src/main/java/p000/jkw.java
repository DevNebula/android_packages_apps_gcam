package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: jkw */
public final class jkw implements jla {
    /* renamed from: a */
    private final jlc f21598a = new jlc();
    /* renamed from: b */
    private final jwa f21599b;
    /* renamed from: c */
    private final jqt f21600c;
    /* renamed from: d */
    private final int f21601d;

    public jkw(jwa jwa, jqt jqt, int i) {
        boolean z;
        jri.m13404b((Object) jwa);
        jri.m13404b((Object) jqt);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Invalid max size.");
        this.f21599b = jwa;
        this.f21600c = jqt;
        this.f21601d = i;
    }

    /* renamed from: a */
    public final void mo9507a() {
        this.f21598a.mo13815a(this.f21599b.mo13879a(), new HashSet(this.f21598a.mo13818d()), this.f21600c);
        this.f21598a.mo13817c();
    }

    /* renamed from: a */
    private final synchronized void m13165a(FrameImage2D frameImage2D) {
        jri.m13404b((Object) frameImage2D);
        long timestamp = frameImage2D.getTimestamp();
        jlc jlc = this.f21598a;
        jlc.mo13816b();
        if (jlc.f21618a.indexOfKey(timestamp) >= 0) {
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("Encountered duplicate frame with timestamp, ignoring:");
            stringBuilder.append(timestamp);
            Log.w("BurstAcquisitionBuffer", stringBuilder.toString());
        } else {
            jlc = this.f21598a;
            jlc.mo13816b();
            int size = jlc.f21618a.size();
            int i = this.f21601d;
            if (size == i) {
                long d = this.f21599b.mo13882d();
                if (d != timestamp) {
                    this.f21598a.mo13813a(d);
                    this.f21599b.mo9575a(d);
                }
            } else if (size > i) {
                throw new IllegalStateException("Store has more frames than inserted!");
            }
            this.f21598a.mo9508a(frameImage2D);
            this.f21599b.mo9576b(timestamp);
        }
    }
}
