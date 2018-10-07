package p000;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: aey */
final class aey implements adx, afa {
    /* renamed from: a */
    private final List f10167a;
    /* renamed from: b */
    private final afc f10168b;
    /* renamed from: c */
    private final afb f10169c;
    /* renamed from: d */
    private int f10170d;
    /* renamed from: e */
    private adl f10171e;
    /* renamed from: f */
    private List f10172f;
    /* renamed from: g */
    private int f10173g;
    /* renamed from: h */
    private volatile aka f10174h;
    /* renamed from: i */
    private File f10175i;

    aey(afc afc, afb afb) {
        this(afc.mo219a(), afc, afb);
    }

    aey(List list, afc afc, afb afb) {
        this.f10170d = -1;
        this.f10167a = list;
        this.f10168b = afc;
        this.f10169c = afb;
    }

    /* renamed from: a */
    public final void mo213a() {
        aka aka = this.f10174h;
        if (aka != null) {
            aka.f508c.mo188b();
        }
    }

    /* renamed from: c */
    private final boolean m6405c() {
        return this.f10173g < this.f10172f.size();
    }

    /* renamed from: a */
    public final void mo192a(Object obj) {
        this.f10169c.mo216a(this.f10171e, obj, this.f10174h.f508c, adf.DATA_DISK_CACHE, this.f10171e);
    }

    /* renamed from: a */
    public final void mo191a(Exception exception) {
        this.f10169c.mo215a(this.f10171e, exception, this.f10174h.f508c, adf.DATA_DISK_CACHE);
    }

    /* renamed from: b */
    public final boolean mo214b() {
        int i = 0;
        while (true) {
            File file;
            if (this.f10172f == null || !m6405c()) {
                this.f10170d++;
                if (this.f10170d >= this.f10167a.size()) {
                    return false;
                }
                adl adl = (adl) this.f10167a.get(this.f10170d);
                this.f10175i = this.f10168b.f375h.mo228a().mo299a(new aez(adl, this.f10168b.f381n));
                file = this.f10175i;
                if (file != null) {
                    this.f10171e = adl;
                    this.f10172f = this.f10168b.mo220a(file);
                    this.f10173g = 0;
                }
            } else {
                this.f10174h = null;
                while (i == 0 && m6405c()) {
                    List list = this.f10172f;
                    int i2 = this.f10173g;
                    this.f10173g = i2 + 1;
                    ajz ajz = (ajz) list.get(i2);
                    file = this.f10175i;
                    afc afc = this.f10168b;
                    this.f10174h = ajz.mo343a(file, afc.f372e, afc.f373f, afc.f376i);
                    if (this.f10174h != null && this.f10168b.mo223c(this.f10174h.f508c.mo186a())) {
                        this.f10174h.f508c.mo187a(this.f10168b.f382o, this);
                        i = 1;
                    }
                }
                return i;
            }
        }
    }
}
