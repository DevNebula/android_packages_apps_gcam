package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fqc */
public final class fqc implements fuw {
    /* renamed from: a */
    public final iqz f18627a;
    /* renamed from: b */
    public final ird f18628b;
    /* renamed from: c */
    public final gfa f18629c;
    /* renamed from: d */
    public final Executor f18630d = Executors.newCachedThreadPool(iel.m3779d("LuckyShotEx", 0));
    /* renamed from: e */
    public final Rect f18631e;
    /* renamed from: f */
    private final axm f18632f;
    /* renamed from: g */
    private final ggc f18633g;
    /* renamed from: h */
    private final fuw f18634h;

    fqc(ira ira, axm axm, gfa gfa, fyy fyy, ggc ggc, fuw fuw, ird ird) {
        this.f18627a = ira.mo8854a("LSRprcssngIS");
        this.f18628b = ird;
        this.f18632f = axm;
        this.f18634h = fuw;
        this.f18629c = gfa;
        this.f18631e = fyy.f5063e;
        this.f18633g = ggc;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return new fqd(this, fwa, (fux) jri.m13404b(this.f18634h.mo6915a(fwa)), this.f18632f, this.f18633g);
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return ilq.m3876a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return this.f18634h.mo6918b();
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        return new fqd(this, fwa, (fux) jri.m13404b(this.f18634h.mo6917b(fwa)), this.f18632f, this.f18633g);
    }
}
