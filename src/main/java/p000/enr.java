package p000;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: enr */
public class enr {
    /* renamed from: c */
    private static final Bundle f4206c = new Bundle();
    /* renamed from: a */
    private final List f4207a = new ArrayList();
    /* renamed from: b */
    private HashSet f4208b = new HashSet();
    /* renamed from: e */
    public final List f4209e = new ArrayList();
    /* renamed from: f */
    public enw f4210f;
    /* renamed from: g */
    public enw f4211g;
    /* renamed from: h */
    public enw f4212h;
    /* renamed from: i */
    public enw f4213i;

    /* renamed from: a */
    public final enw mo6354a(enw enw) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f4209e.size()) {
                enw.mo6359a((eol) this.f4209e.get(i2));
                i = i2 + 1;
            } else {
                this.f4207a.add(enw);
                return enw;
            }
        }
    }

    /* renamed from: a */
    public final eol mo6355a(eol eol) {
        int i = 0;
        jri.m13406b(Looper.getMainLooper().isCurrentThread(), (Object) "addObserver must be called on the main thread.");
        String b = enr.m1952b(eol);
        if (b != null) {
            if (this.f4208b.contains(b)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[]{b}));
            }
            this.f4208b.add(b);
        }
        this.f4209e.add(eol);
        while (true) {
            int i2 = i;
            if (i2 >= this.f4207a.size()) {
                return eol;
            }
            ((enw) this.f4207a.get(i2)).mo6359a(eol);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public static Bundle m1951a(eol eol, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String b = enr.m1952b(eol);
        if (b != null) {
            return bundle.getBundle(b);
        }
        return f4206c;
    }

    /* renamed from: b */
    static String m1952b(eol eol) {
        if (!(eol instanceof eoi)) {
            return null;
        }
        if (eol instanceof eom) {
            return ((eom) eol).mo6374a();
        }
        return eol.getClass().getName();
    }

    /* renamed from: a */
    public void mo6356a() {
        mo6358b(this.f4213i);
        mo6358b(this.f4210f);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f4209e.size()) {
                eol eol = (eol) this.f4209e.get(i2);
                if (eol instanceof eoc) {
                    ((eoc) eol).mo6365f();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo6357b() {
        mo6358b(this.f4212h);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f4209e.size()) {
                eol eol = (eol) this.f4209e.get(i2);
                if (eol instanceof eof) {
                    ((eof) eol).mo6368g();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo6358b(enw enw) {
        this.f4207a.remove(enw);
    }
}
