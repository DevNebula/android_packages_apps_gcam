package p000;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* renamed from: ago */
final class ago implements adx, afa {
    /* renamed from: a */
    private final afb f10263a;
    /* renamed from: b */
    private final afc f10264b;
    /* renamed from: c */
    private int f10265c;
    /* renamed from: d */
    private int f10266d = -1;
    /* renamed from: e */
    private adl f10267e;
    /* renamed from: f */
    private List f10268f;
    /* renamed from: g */
    private int f10269g;
    /* renamed from: h */
    private volatile aka f10270h;
    /* renamed from: i */
    private File f10271i;
    /* renamed from: j */
    private agp f10272j;

    ago(afc afc, afb afb) {
        this.f10264b = afc;
        this.f10263a = afb;
    }

    /* renamed from: a */
    public final void mo213a() {
        aka aka = this.f10270h;
        if (aka != null) {
            aka.f508c.mo188b();
        }
    }

    /* renamed from: c */
    private final boolean m6476c() {
        return this.f10269g < this.f10268f.size();
    }

    /* renamed from: a */
    public final void mo192a(Object obj) {
        this.f10263a.mo216a(this.f10267e, obj, this.f10270h.f508c, adf.RESOURCE_DISK_CACHE, this.f10272j);
    }

    /* renamed from: a */
    public final void mo191a(Exception exception) {
        this.f10263a.mo215a(this.f10272j, exception, this.f10270h.f508c, adf.RESOURCE_DISK_CACHE);
    }

    /* renamed from: b */
    public final boolean mo214b() {
        List a = this.f10264b.mo219a();
        if (a.isEmpty()) {
            return false;
        }
        afc afc = this.f10264b;
        List b = afc.f370c.f211d.mo122b(afc.f371d.getClass(), afc.f374g, afc.f378k);
        if (b.isEmpty() && File.class.equals(this.f10264b.f378k)) {
            return false;
        }
        while (true) {
            if (this.f10268f == null || !m6476c()) {
                this.f10266d++;
                if (this.f10266d >= b.size()) {
                    this.f10265c++;
                    if (this.f10265c >= a.size()) {
                        return false;
                    }
                    this.f10266d = 0;
                }
                adl adl = (adl) a.get(this.f10265c);
                Class cls = (Class) b.get(this.f10266d);
                ads b2 = this.f10264b.mo221b(cls);
                afc afc2 = this.f10264b;
                this.f10272j = new agp(afc2.f370c.f210c, adl, afc2.f381n, afc2.f372e, afc2.f373f, b2, cls, afc2.f376i);
                this.f10271i = this.f10264b.f375h.mo228a().mo299a(this.f10272j);
                File file = this.f10271i;
                if (file != null) {
                    this.f10267e = adl;
                    this.f10268f = this.f10264b.mo220a(file);
                    this.f10269g = 0;
                }
            } else {
                this.f10270h = null;
                int i = 0;
                while (i == 0 && m6476c()) {
                    List list = this.f10268f;
                    int i2 = this.f10269g;
                    this.f10269g = i2 + 1;
                    ajz ajz = (ajz) list.get(i2);
                    File file2 = this.f10271i;
                    afc afc3 = this.f10264b;
                    this.f10270h = ajz.mo343a(file2, afc3.f372e, afc3.f373f, afc3.f376i);
                    if (this.f10270h != null && this.f10264b.mo223c(this.f10270h.f508c.mo186a())) {
                        this.f10270h.f508c.mo187a(this.f10264b.f382o, this);
                        i = 1;
                    }
                }
                return i;
            }
        }
    }
}
