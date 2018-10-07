package p000;

import android.content.Context;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ckx */
public final class ckx implements cop {
    /* renamed from: a */
    public static final String f12675a = bli.m887a("SBSingleCreationGen");
    /* renamed from: b */
    public final gln f12676b;
    /* renamed from: c */
    public final File f12677c;
    /* renamed from: d */
    public final Context f12678d;
    /* renamed from: e */
    public final gsp f12679e;
    /* renamed from: f */
    public final glj f12680f;
    /* renamed from: g */
    public jyt f12681g;
    /* renamed from: h */
    private final gev f12682h;
    /* renamed from: i */
    private final Object f12683i = new Object();
    /* renamed from: j */
    private jaq f12684j;
    /* renamed from: k */
    private final irs f12685k;

    public ckx(gev gev, gln gln, File file, Context context, gsp gsp, irs irs, glj glj) {
        this.f12682h = gev;
        this.f12676b = gln;
        this.f12677c = file;
        this.f12678d = context;
        this.f12679e = gsp;
        this.f12685k = irs;
        this.f12680f = glj;
    }

    /* renamed from: a */
    public final jaq mo5649a(jiy jiy) {
        jaq d = jbj.m13001d();
        synchronized (this.f12683i) {
            this.f12684j.mo9275a(jlk.f8281a, new clc(this, jiy, d)).mo9282a(izw.f21401a);
        }
        return d;
    }

    /* renamed from: a */
    public final kpk mo5650a() {
        kpk a;
        synchronized (this.f12683i) {
            a = this.f12684j.mo9275a(jlk.f8281a, new clb()).mo9281a();
        }
        return a;
    }

    /* renamed from: a */
    final jsb mo12519a(Context context, FeatureTable featureTable, jxm jxm, jrg jrg, Executor executor, jqo jqo) {
        jms jms = new jms();
        jqk.m13345a(jms, context, jmr.SMART_BURST, jiu.f8222a, executor, jqo);
        jms.mo9522b(jrg.class, "default").mo9524a(new cky(jrg));
        jms.mo9522b(jxm.class, "default").mo9524a(new ckz(jxm));
        jms.mo9522b(FeatureTable.class, "default").mo9524a(new cla(featureTable));
        synchronized (this.f12683i) {
            jyt jyt = this.f12681g;
            if (jyt != null) {
                jqk.m13346a(jms, jyt);
            }
        }
        return (jsb) jms.mo9518a(jsb.class, "default");
    }

    /* renamed from: a */
    static boolean m8428a(File file) {
        if (new File(file, "feature_table.bin").exists() && new File(file, "metadatastore.bin").exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo5651b() {
        Executor b = cht.m1156b();
        jqo jrd = new jrd();
        synchronized (this.f12683i) {
            if (jlo.m4600c()) {
                this.f12681g = new jyt(jlo.m4598a(), "camera_single_");
            }
            this.f12684j = jli.m13199b(izg.f7956a).mo9275a(b, new clf(this, b, jrd)).mo9277a(b, new clg()).mo9275a(b, new cld());
            this.f12684j.mo9282a(izw.f21401a);
        }
    }
}
