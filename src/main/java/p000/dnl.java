package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: dnl */
public final class dnl extends doc {
    /* renamed from: c */
    public static final String f24028c = bli.m887a("StateReviewVid");
    /* renamed from: d */
    public bgl f24029d;
    /* renamed from: e */
    public kbg f24030e;
    /* renamed from: f */
    private djo f24031f = ((doa) mo2152d()).f14252s;

    public dnl(doc doc, bgl bgl) {
        super((bug) doc);
        this.f24029d = bgl;
        mo2149a(dbd.class, new dnm());
        mo2149a(dbe.class, new dnn(this));
        mo2149a(dls.class, new dno(this));
        mo2149a(dbi.class, new dnp(this));
        mo2149a(dlr.class, new dnq(this));
        mo2149a(dbc.class, new dns(this));
    }

    /* renamed from: e */
    public final doc mo2150b() {
        this.f24030e = ((doa) mo2152d()).f14230I;
        if (!this.f24030e.mo9709b()) {
            djo djo = this.f24031f;
            bgl bgl = this.f24029d;
            eqt a = new eqt(djo.f3310b).mo6514a(bgl.f1161a.getName());
            a.f4318a = bgl.f1161a;
            a = a.mo6515b(bgl.f1166f).mo6511a(bgl.f1165e).mo6513a(bgl.mo1943b()).mo6512a(bgl.f1162b.mo8649g().mo8639c());
            a.f4319b = bgl.f1163c;
            epv a2 = a.mo6510a();
            this.f24030e = kbg.m4803b(djo.f3309a.insert(Uri.parse("content://media/external/video/media"), a2.f4295a));
            ((doa) mo2152d()).mo13044a((Uri) this.f24030e.mo9706a());
        }
        mo14865f();
        ((doa) mo2152d()).f14235b.f3329c.f23982a.setVisibility(0);
        irs irs = ((doa) mo2152d()).f14226E;
        String name = this.f24029d.f1161a.getName();
        iut a3 = ((doa) mo2152d()).f14241h.mo6123a();
        iqp c = this.f24029d.f1162b.mo8649g().mo8639c();
        bgl bgl2 = this.f24029d;
        irs.mo8904a(true, name, a3, c, bgl2.f1165e, bgl2.f1161a.length(), (float) this.f24029d.mo1942a(), this.f24029d.f1164d, ((doa) mo2152d()).f14243j.mo5998a(), ((doa) mo2152d()).f14243j.mo6001b(), this.f24029d.f1167g);
        return null;
    }

    /* renamed from: c */
    public final void mo2151c() {
        ((doa) mo2152d()).f14240g.mo7042g();
    }

    /* renamed from: f */
    final void mo14865f() {
        Throwable e;
        try {
            Bitmap a = aqe.m603a(((doa) mo2152d()).f14248o.openFileDescriptor((Uri) this.f24030e.mo9706a(), "r").getFileDescriptor(), this.f24029d.f1162b.mo8649g().mo8639c().f7695a);
            dlj dlj = ((doa) mo2152d()).f14235b.f3329c;
            dlj.f23982a.setImageBitmap(a);
            dlj.f23982a.setVisibility(0);
            return;
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        bli.m892b(f24028c, "Error showing review image", e);
    }
}
