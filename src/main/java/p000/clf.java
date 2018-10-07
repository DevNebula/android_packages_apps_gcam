package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: clf */
final class clf implements izi {
    /* renamed from: a */
    private final Executor f12695a;
    /* renamed from: b */
    private final jqo f12696b;
    /* renamed from: c */
    private final /* synthetic */ ckx f12697c;

    public clf(ckx ckx, Executor executor, jqo jqo) {
        this.f12697c = ckx;
        this.f12695a = executor;
        this.f12696b = jqo;
    }

    /* renamed from: a */
    private final Pipeline m8439a() {
        if (!ckx.m8428a(this.f12697c.f12677c)) {
            return new cle();
        }
        try {
            FeatureTable a = jlf.m4590a(this.f12697c.f12677c);
            jxm a2 = jli.m13194a(this.f12697c.f12677c);
            jrg a3 = jqk.m13339a(this.f12697c.f12677c, jxr.m4738a(a2)).mo9536a();
            if (a3.mo13835e().isEmpty()) {
                return new cle();
            }
            ckx ckx = this.f12697c;
            return ckx.mo12519a(ckx.f12678d, a, a2, a3, this.f12695a, this.f12696b);
        } catch (Throwable e) {
            String str = ckx.f12675a;
            String valueOf = String.valueOf(this.f12697c.f12677c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("Failed to load feature files from ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            kqg.f8786a.mo10213b(e);
            return new cle();
        }
    }
}
