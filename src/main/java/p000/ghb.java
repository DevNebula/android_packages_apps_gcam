package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ghb */
public final class ghb extends ggq {
    /* renamed from: b */
    private final ggr f24361b;
    /* renamed from: i */
    private final ird f24362i;

    public ghb(gfw gfw, Executor executor, gfv gfv, get get, iqp iqp, kbg kbg, ird ird) {
        super(gfw, executor, gfv, C0252go.f5822aU, get, iqp, C0252go.f5819aR, ird);
        this.f24362i = ird;
        if (kbg.mo9709b()) {
            this.f24361b = (ggr) kbg.mo9706a();
            gfw gfw2 = this.f24361b.f5405g;
            boolean z = gfw2 != null ? gfw2 == this.f5405g : true;
            jri.m13395a(z);
            if (this.f24361b.f5401c == this.f5401c) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            return;
        }
        this.f24361b = null;
    }

    /* renamed from: a */
    public final void mo13347a(String str) {
    }

    public final void run() {
        this.f24362i.mo8856a("PreviewChained");
        gfw gfw = (gfw) jri.m13404b(this.f5405g);
        Rect a = ggr.m2597a(gfw.f5387b, gfw.f5391f);
        ggq.m11272a(gfw);
        int a2 = fzb.m11105a(new iqp(a.width(), a.height()), this.f19162a);
        ggt a3 = mo13345a(gfw, a2);
        try {
            mo7122a(this.f5403e, a3, C0252go.f5824aW);
            int g = gfw.f5387b.mo13745g() / a2;
            int d = gfw.f5387b.mo13742d() / a2;
            StringBuilder stringBuilder = new StringBuilder(102);
            stringBuilder.append("TIMER_END Rendering preview YUV buffer available, w=");
            stringBuilder.append(g);
            stringBuilder.append(" h=");
            stringBuilder.append(d);
            stringBuilder.append(" of subsample ");
            stringBuilder.append(a2);
            mo13346a(a3, mo13348a(gfw.f5387b, a, a2), C0252go.f5824aW);
            ggr ggr = this.f24361b;
            if (ggr != null) {
                this.f5401c.mo7117a((ggr) this, ggr);
            }
            this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
            this.f24362i.mo8857b();
        } catch (Throwable th) {
            this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
        }
    }
}
