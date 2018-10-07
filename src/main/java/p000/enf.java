package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: enf */
public final class enf implements eof, eoh, eoj, eok, eol {
    /* renamed from: a */
    public final List f17558a = new ArrayList();
    /* renamed from: b */
    public enw f17559b;
    /* renamed from: c */
    private final List f17560c = new ArrayList();
    /* renamed from: d */
    private int f17561d = 0;
    /* renamed from: e */
    private int f17562e = 0;
    /* renamed from: f */
    private enw f17563f;
    /* renamed from: g */
    private enw f17564g;

    /* renamed from: a */
    public final enw mo13163a(enw enw) {
        for (eol a : this.f17558a) {
            enw.mo6359a(a);
        }
        this.f17560c.add(enw);
        return enw;
    }

    /* renamed from: a */
    public final eol mo13164a(eol eol) {
        this.f17558a.add(eol);
        for (enw a : this.f17560c) {
            a.mo6359a(eol);
        }
        return eol;
    }

    /* renamed from: g */
    public final void mo6368g() {
        boolean z;
        this.f17562e--;
        if (this.f17562e >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (this.f17562e == 0) {
            mo13165b(this.f17564g);
            for (eol eol : this.f17558a) {
                if (eol instanceof enk) {
                    ((enk) eol).mo6349a();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo6370h() {
        boolean z;
        this.f17562e++;
        if (this.f17562e > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (this.f17562e == 1) {
            this.f17564g = mo13163a(new eni());
        }
    }

    /* renamed from: i */
    public final void mo6372i() {
        boolean z;
        this.f17561d++;
        if (this.f17561d > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (this.f17561d == 1) {
            this.f17563f = mo13163a(new enh());
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        boolean z;
        this.f17561d--;
        if (this.f17561d >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (this.f17561d == 0) {
            mo13165b(this.f17563f);
            for (eol eol : this.f17558a) {
                if (eol instanceof enn) {
                    ((enn) eol).mo6352c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13165b(enw enw) {
        this.f17560c.remove(enw);
    }
}
