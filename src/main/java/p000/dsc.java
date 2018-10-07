package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dsc */
final class dsc implements fwl {
    /* renamed from: a */
    private final fwl f16602a;
    /* renamed from: b */
    private final kbg f16603b;
    /* renamed from: c */
    private final kbg f16604c;
    /* renamed from: d */
    private ilp f16605d;
    /* renamed from: e */
    private final ffc f16606e;

    dsc(fwl fwl, ffc ffc, kbg kbg, kbg kbg2, ilp ilp) {
        this.f16602a = fwl;
        this.f16606e = ffc;
        this.f16603b = kbg;
        this.f16604c = kbg2;
        this.f16605d = ilp;
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16602a.mo9689a();
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return this.f16602a.mo9689a();
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        Object obj;
        eyh eyh = null;
        if (!this.f16603b.mo9709b()) {
            obj = null;
        } else if (!((etc) this.f16603b.mo9706a()).mo6585a()) {
            obj = null;
        } else if (((etc) this.f16603b.mo9706a()).mo6588b()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (!(obj == null || ((Boolean) this.f16605d.mo13673b()).booleanValue())) {
            kpk kpk;
            gkr gkr = fwa.f4982b;
            int a = axm.m759a(fwa.f4981a.f4674a, this.f16606e);
            if (this.f16604c.mo9709b()) {
                eyh = ((eyg) this.f16604c.mo9706a()).mo6677a(fwa.f4982b.mo13383l());
            }
            etc etc = (etc) this.f16603b.mo9706a();
            Uri o = gkr.mo13386o();
            if (eyh != null) {
                kpk = eyh.f4579b;
            } else {
                kpk = kow.m13873a(kau.f21835a);
            }
            etc.mo6580a(o, a, kpk);
        }
        this.f16602a.mo6937a(fwm, fwa);
        if (eyh != null) {
            synchronized (eyh.f4584g) {
                jri.m13405b(eyh.f4584g.f4577c.containsKey(Long.valueOf(eyh.f4583f)));
                if (!eyh.f4580c) {
                    eyh.f4579b.mo15641a(kau.f21835a);
                }
                eyh.f4584g.f4577c.remove(Long.valueOf(eyh.f4583f));
            }
        }
    }
}
