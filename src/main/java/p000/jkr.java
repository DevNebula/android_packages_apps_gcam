package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jkr */
public final class jkr implements jja {
    /* renamed from: a */
    public final long f21590a;
    /* renamed from: b */
    public final float f21591b;
    /* renamed from: c */
    public final boolean f21592c;
    /* renamed from: d */
    public final boolean f21593d;
    /* renamed from: e */
    private final int f21594e;

    public jkr(long j, int i, float f, boolean z, boolean z2) {
        this.f21590a = j;
        this.f21594e = i;
        this.f21591b = f;
        this.f21592c = z;
        this.f21593d = z2;
    }

    /* renamed from: b */
    private final jxp m13156b(jrg jrg) {
        return new jxp(GDepthUtil.MIME_JPEG, this.f21590a, this.f21594e, jrg.f21668a, jrg.f21669b);
    }

    /* renamed from: b */
    public final long mo9468b() {
        return this.f21590a;
    }

    /* renamed from: a */
    public final jaq mo9466a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        return jrg.mo13829b(this.f21590a).mo9275a(executor, new jks(jqo, jxo, m13156b(jrg)));
    }

    /* renamed from: a */
    public final jaq mo9465a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return jrg.mo13829b(this.f21590a).mo9275a(executor, jkm.m13148b(jqo, context));
    }
}
