package p000;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jrb */
public class jrb implements jqt {
    /* renamed from: a */
    private final jaq f21662a;
    /* renamed from: b */
    private final jrj f21663b;
    /* renamed from: c */
    private Executor f21664c;

    public jrb(kpk kpk, jrj jrj) {
        jri.m13404b((Object) kpk);
        jri.m13404b((Object) jrj);
        this.f21662a = jli.m13191a(kpk);
        this.f21663b = jrj;
    }

    /* renamed from: b */
    private final synchronized Executor m13372b() {
        if (this.f21664c == null) {
            Executor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 250, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f21664c = threadPoolExecutor;
        }
        return this.f21664c;
    }

    /* renamed from: a */
    public final void mo9532a(long j, Bitmap bitmap, boolean z) {
        jaq a = this.f21662a.mo9275a(m13372b(), new jrc(j, bitmap));
        this.f21663b.mo9537a(j, a, bitmap.getWidth(), bitmap.getHeight(), z);
    }

    /* renamed from: a */
    public final void mo9531a() {
    }
}
