package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: euj */
public final class euj implements eux {
    /* renamed from: a */
    public final evo f17824a;
    /* renamed from: b */
    public volatile jga f17825b;
    /* renamed from: c */
    public final Executor f17826c;
    /* renamed from: d */
    private final MediaFormat f17827d;
    /* renamed from: e */
    private final kpk f17828e;
    /* renamed from: f */
    private eva f17829f;

    public euj(MediaFormat mediaFormat, evo evo, kpk kpk, Executor executor) {
        this.f17827d = mediaFormat;
        this.f17824a = evo;
        this.f17828e = kpk;
        this.f17826c = executor;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final void mo6605a(jgd jgd, euz euz, eva eva) {
        this.f17829f = eva;
        if (this.f17828e.isDone() && ((Boolean) kow.m13881c(this.f17828e)).booleanValue()) {
            jga jfz = new jfz(jgd.f8163b.mo9414a(jhe.m4548a(this.f17827d)));
            jgd.f8162a.add(jfz);
            this.f17825b = jfz;
        }
    }

    /* renamed from: b */
    public final void mo6606b() {
    }

    /* renamed from: c */
    public final void mo6607c() {
        this.f17829f.mo6611a();
    }
}
