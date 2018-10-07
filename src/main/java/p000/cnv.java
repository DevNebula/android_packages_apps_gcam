package p000;

import android.content.ContentResolver;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cnv */
final class cnv {
    /* renamed from: a */
    public final jip f2401a;
    /* renamed from: b */
    public final /* synthetic */ cnq f2402b;
    /* renamed from: c */
    private final Context f2403c;

    public cnv(cnq cnq, Context context, jip jip) {
        this.f2402b = cnq;
        jri.m13404b((Object) context);
        jri.m13404b((Object) jip);
        this.f2403c = context;
        this.f2401a = jip;
    }

    /* renamed from: a */
    public final jaq mo2412a(jrg jrg, File file, gkr gkr) {
        this.f2402b.f23229c.mo8856a("ArtifactRasterizer#rasterizeArtifactHighRes");
        try {
            jip jip = this.f2401a;
            Executor executor = this.f2402b.f13050g;
            Context context = this.f2403c;
            Object jwy = new jwy();
            jxo bdc = new bdc(jwy, this.f2402b.f13058o);
            jaq a = jli.m13187a(jip.mo9466a(jrg, bdc, executor, this.f2402b.f13053j), cnz.m1236a(this.f2401a, file, executor)).mo9277a(executor, new jkm(gkr, jwy.f21792a));
            ContentResolver contentResolver = context.getContentResolver();
            jiy a2 = jiy.m4574a(jip.f21537a);
            String name = this.f2402b.f13052i.getName();
            cnq cnq = this.f2402b;
            jaq a3 = a.mo9275a(executor, new grq(contentResolver, false, a2, name, cnq.f23228b, cnq.f23235t));
            return a3;
        } finally {
            this.f2402b.f23229c.mo8857b();
        }
    }

    /* renamed from: a */
    public final gkr mo2411a(jrg jrg, long j) {
        this.f2402b.f23229c.mo8856a("ArtifactRasterizer#rasterizeArtifactPreview");
        try {
            Context context = this.f2403c;
            Object obj = this.f2401a;
            Executor executor = this.f2402b.f13050g;
            jri.m13404b(obj);
            gkr a = this.f2402b.f23230d.mo7187a(coc.m1240a(obj, this.f2402b.f13048e.mo13383l()), j, kau.f21835a);
            jli.m13202c(obj.mo9465a(jrg, context, executor, this.f2402b.f13053j).mo9275a(executor, new cnw(this, a)));
            return a;
        } finally {
            this.f2402b.f23229c.mo8857b();
        }
    }
}
