package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddu */
public final class ddu extends dbx {
    /* renamed from: c */
    public final iqo f23844c;
    /* renamed from: d */
    public Bitmap f23845d;
    /* renamed from: e */
    public final boolean f23846e;
    /* renamed from: f */
    public kbg f23847f;
    /* renamed from: g */
    public boolean f23848g;
    /* renamed from: h */
    private final glq f23849h = new ddw(this);

    public ddu(dbx dbx, Bitmap bitmap, kbg kbg, boolean z, bco bco) {
        super((bug) dbx);
        this.f23845d = bitmap;
        this.f23847f = kbg;
        this.f23846e = z;
        this.f23844c = bco;
        this.f23848g = false;
        mo2149a(dbd.class, new ddv());
        mo2149a(dbe.class, new ddx(this));
        mo2149a(dbf.class, new ddy(this));
        mo2149a(dbi.class, new ddz(this));
        mo2149a(dbh.class, new dea(this));
        mo2149a(dba.class, new dec(this));
        mo2149a(dbb.class, new dee(this));
        mo2149a(dau.class, new def(this));
    }

    /* renamed from: e */
    public final dbx mo2150b() {
        ((dbu) mo2152d()).mo12987Q().mo7250a(this.f23849h);
        mo14843a(this.f23845d);
        return null;
    }

    /* renamed from: c */
    public final void mo2151c() {
        ((dbu) mo2152d()).mo12987Q().mo7252b(this.f23849h);
    }

    /* renamed from: a */
    final void mo14843a(Bitmap bitmap) {
        this.f23845d = bitmap;
        ((dbu) mo2152d()).mo12977G().execute(new deg(this));
    }
}
