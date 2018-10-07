package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.io.File;

/* compiled from: PG */
/* renamed from: dgd */
public final class dgd implements kwk {
    /* renamed from: a */
    private final kwk f13739a;
    /* renamed from: b */
    private final kwk f13740b;
    /* renamed from: c */
    private final kwk f13741c;
    /* renamed from: d */
    private final kwk f13742d;
    /* renamed from: e */
    private final kwk f13743e;
    /* renamed from: f */
    private final kwk f13744f;
    /* renamed from: g */
    private final kwk f13745g;
    /* renamed from: h */
    private final kwk f13746h;
    /* renamed from: i */
    private final kwk f13747i;
    /* renamed from: j */
    private final kwk f13748j;
    /* renamed from: k */
    private final kwk f13749k;
    /* renamed from: l */
    private final kwk f13750l;
    /* renamed from: m */
    private final kwk f13751m;
    /* renamed from: n */
    private final kwk f13752n;
    /* renamed from: o */
    private final kwk f13753o;
    /* renamed from: p */
    private final kwk f13754p;
    /* renamed from: q */
    private final kwk f13755q;
    /* renamed from: r */
    private final kwk f13756r;
    /* renamed from: s */
    private final kwk f13757s;
    /* renamed from: t */
    private final kwk f13758t;
    /* renamed from: u */
    private final kwk f13759u;
    /* renamed from: v */
    private final kwk f13760v;
    /* renamed from: w */
    private final kwk f13761w;

    public dgd(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13, kwk kwk14, kwk kwk15, kwk kwk16, kwk kwk17, kwk kwk18, kwk kwk19, kwk kwk20, kwk kwk21, kwk kwk22, kwk kwk23) {
        this.f13739a = kwk;
        this.f13740b = kwk2;
        this.f13741c = kwk3;
        this.f13742d = kwk4;
        this.f13743e = kwk5;
        this.f13744f = kwk6;
        this.f13745g = kwk7;
        this.f13746h = kwk8;
        this.f13747i = kwk9;
        this.f13748j = kwk10;
        this.f13749k = kwk11;
        this.f13750l = kwk12;
        this.f13751m = kwk13;
        this.f13752n = kwk14;
        this.f13753o = kwk15;
        this.f13754p = kwk16;
        this.f13755q = kwk17;
        this.f13756r = kwk18;
        this.f13757s = kwk19;
        this.f13758t = kwk20;
        this.f13759u = kwk21;
        this.f13760v = kwk22;
        this.f13761w = kwk23;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new dgb((bag) this.f13739a.mo10566a(), (bah) this.f13740b.mo10566a(), (gtf) this.f13741c.mo10566a(), (gpn) this.f13742d.mo10566a(), (bkw) this.f13743e.mo10566a(), (gey) this.f13744f.mo10566a(), (gev) this.f13745g.mo10566a(), (ilp) this.f13746h.mo10566a(), (aws) this.f13747i.mo10566a(), (ikd) this.f13748j.mo10566a(), (hny) this.f13749k.mo10566a(), (ehp) this.f13750l.mo10566a(), (gtl) this.f13751m.mo10566a(), (BottomBarController) this.f13752n.mo10566a(), (hcd) this.f13753o.mo10566a(), (irs) this.f13754p.mo10566a(), (bvm) this.f13755q.mo10566a(), (bus) this.f13756r.mo10566a(), ((Boolean) this.f13757s.mo10566a()).booleanValue(), (gmn) this.f13758t.mo10566a(), (gnu) this.f13759u.mo10566a(), (gci) this.f13760v.mo10566a(), (ilp) this.f13761w.mo10566a());
    }

    /* renamed from: a */
    public static boolean m9185a(erj erj, err err) {
        File file = new File(err.mo6541g().f4383g);
        boolean e = jxr.m4737a().mo9613e(file);
        if (!e && file.isDirectory()) {
            for (File e2 : file.listFiles()) {
                e = jxr.m4737a().mo9613e(e2);
                if (e) {
                    break;
                }
            }
        }
        erj.f4357n = e;
        return e;
    }
}
