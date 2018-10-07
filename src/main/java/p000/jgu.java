package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jgu */
final class jgu implements jhf {
    /* renamed from: a */
    public final jhe f21472a;
    /* renamed from: b */
    public final Set f21473b = new LinkedHashSet();
    /* renamed from: c */
    public final Set f21474c = new HashSet();
    /* renamed from: d */
    public final kpw f21475d = kpw.m18486d();
    /* renamed from: e */
    private final /* synthetic */ jgp f21476e;

    jgu(jgp jgp, jhe jhe) {
        this.f21476e = jgp;
        this.f21472a = jhe;
    }

    public final void close() {
        this.f21475d.mo15644b(kny.m18475a(kow.m13873a((Object) this), new jgv(this), this.f21476e.f24743b));
    }

    /* renamed from: a */
    final /* synthetic */ Class mo13796a() {
        synchronized (this.f21476e.f24742a) {
            for (jhl jhl : this.f21474c) {
                ((jhf) jhl.f8201a).close();
            }
        }
        return jgp.class;
    }

    /* renamed from: a */
    public final void mo9430a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        jgy a = jgy.m4536a(byteBuffer, bufferInfo);
        synchronized (this.f21476e.f24742a) {
            this.f21473b.add(a);
            for (jhl a2 : this.f21474c) {
                this.f21476e.mo15041a(a2, a);
            }
        }
    }
}
