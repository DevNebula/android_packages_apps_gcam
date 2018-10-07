package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggr */
public abstract class ggr implements Runnable {
    /* renamed from: c */
    public final gfv f5401c;
    /* renamed from: d */
    public final Executor f5402d;
    /* renamed from: e */
    public final long f5403e;
    /* renamed from: f */
    public final int f5404f;
    /* renamed from: g */
    public final gfw f5405g;
    /* renamed from: h */
    public final get f5406h;

    static {
        bli.m887a("TaskImgContain");
    }

    public ggr(gfw gfw, Executor executor, gfv gfv, int i, get get) {
        this.f5405g = gfw;
        this.f5403e = this.f5405g.f5387b.mo13744f();
        this.f5402d = executor;
        this.f5401c = gfv;
        this.f5404f = i;
        this.f5406h = get;
    }

    public ggr(ggr ggr, int i) {
        this.f5403e = ggr.f5403e;
        this.f5402d = ggr.f5402d;
        this.f5401c = ggr.f5401c;
        this.f5404f = i;
        this.f5406h = ggr.f5406h;
        this.f5405g = null;
    }

    /* renamed from: a */
    public static Rect m2595a(int i, int i2, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, i, i2);
        }
        Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, i), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, i2), rect2.top);
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m2597a(iwz iwz, Rect rect) {
        return ggr.m2595a(iwz.mo13745g(), iwz.mo13742d(), rect);
    }

    /* renamed from: a */
    public final void mo7122a(long j, ggt ggt, int i) {
        this.f5401c.mo7118b().mo7112a(new ggu(j, ggt, i));
    }

    /* renamed from: a */
    protected static Rect m2596a(Rect rect, iqm iqm) {
        if (iqm == iqm.CLOCKWISE_0 || iqm == iqm.CLOCKWISE_180) {
            return new Rect(rect);
        }
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }
}
