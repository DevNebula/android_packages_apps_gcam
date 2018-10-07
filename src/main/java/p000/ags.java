package p000;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ags */
final class ags implements adx, afa, afb {
    /* renamed from: a */
    private final afc f10282a;
    /* renamed from: b */
    private final afb f10283b;
    /* renamed from: c */
    private int f10284c;
    /* renamed from: d */
    private aey f10285d;
    /* renamed from: e */
    private Object f10286e;
    /* renamed from: f */
    private volatile aka f10287f;
    /* renamed from: g */
    private aez f10288g;

    ags(afc afc, afb afb) {
        this.f10282a = afc;
        this.f10283b = afb;
    }

    /* renamed from: a */
    public final void mo213a() {
        aka aka = this.f10287f;
        if (aka != null) {
            aka.f508c.mo188b();
        }
    }

    /* renamed from: a */
    public final void mo215a(adl adl, Exception exception, adw adw, adf adf) {
        this.f10283b.mo215a(adl, exception, adw, this.f10287f.f508c.mo190d());
    }

    /* renamed from: a */
    public final void mo216a(adl adl, Object obj, adw adw, adf adf, adl adl2) {
        this.f10283b.mo216a(adl, obj, adw, this.f10287f.f508c.mo190d(), adl);
    }

    /* renamed from: a */
    public final void mo192a(Object obj) {
        afm afm = this.f10282a.f383p;
        if (obj == null || !afm.mo236a(this.f10287f.f508c.mo190d())) {
            this.f10283b.mo216a(this.f10287f.f506a, obj, this.f10287f.f508c, this.f10287f.f508c.mo190d(), this.f10288g);
            return;
        }
        this.f10286e = obj;
        this.f10283b.mo217c();
    }

    /* renamed from: a */
    public final void mo191a(Exception exception) {
        this.f10283b.mo215a(this.f10288g, exception, this.f10287f.f508c, this.f10287f.f508c.mo190d());
    }

    /* renamed from: c */
    public final void mo217c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean mo214b() {
        boolean z = false;
        Object obj = this.f10286e;
        if (obj != null) {
            this.f10286e = null;
            long a = arm.m655a();
            try {
                adi a2 = this.f10282a.f370c.f211d.f226a.mo1663a(obj.getClass());
                if (a2 == null) {
                    throw new aci(obj.getClass(), (byte) 0);
                }
                aho aho = new aho(a2, obj, this.f10282a.f376i);
                this.f10288g = new aez(this.f10287f.f506a, this.f10282a.f381n);
                this.f10282a.f375h.mo228a().mo300a(this.f10288g, aho);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    String valueOf = String.valueOf(this.f10288g);
                    String valueOf2 = String.valueOf(obj);
                    String valueOf3 = String.valueOf(a2);
                    double a3 = arm.m654a(a);
                    StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
                    stringBuilder.append("Finished encoding source to cache, key: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(", data: ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(", encoder: ");
                    stringBuilder.append(valueOf3);
                    stringBuilder.append(", duration: ");
                    stringBuilder.append(a3);
                    Log.v("SourceGenerator", stringBuilder.toString());
                }
                this.f10287f.f508c.mo189c();
                this.f10285d = new aey(Collections.singletonList(this.f10287f.f506a), this.f10282a, this);
            } catch (Throwable th) {
                this.f10287f.f508c.mo189c();
            }
        }
        aey aey = this.f10285d;
        if (aey != null && aey.mo214b()) {
            return true;
        }
        this.f10285d = null;
        this.f10287f = null;
        while (!z && this.f10284c < this.f10282a.mo222b().size()) {
            List b = this.f10282a.mo222b();
            int i = this.f10284c;
            this.f10284c = i + 1;
            this.f10287f = (aka) b.get(i);
            if (this.f10287f != null && (this.f10282a.f383p.mo236a(this.f10287f.f508c.mo190d()) || this.f10282a.mo223c(this.f10287f.f508c.mo186a()))) {
                this.f10287f.f508c.mo187a(this.f10282a.f382o, this);
                z = true;
            }
        }
        return z;
    }
}
