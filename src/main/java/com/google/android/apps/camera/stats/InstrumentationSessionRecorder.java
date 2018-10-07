package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.List;
import p000.grp;
import p000.jri;
import p000.ken;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationSessionRecorder implements grp {
    /* renamed from: a */
    private final Object f12870a = new Object();
    /* renamed from: b */
    private final kwk f12871b;
    /* renamed from: c */
    private final List f12872c = new ArrayList();
    /* renamed from: d */
    private InstrumentationSession f12873d;

    @UsedByReflection
    public InstrumentationSessionRecorder(kwk kwk) {
        jri.m13404b((Object) kwk);
        this.f12871b = kwk;
    }

    @UsedByReflection
    public void clear() {
        synchronized (this.f12870a) {
            this.f12873d = null;
            this.f12872c.clear();
        }
    }

    @UsedByReflection
    public InstrumentationSession create() {
        InstrumentationSession a;
        synchronized (this.f12870a) {
            a = m8540a();
        }
        return a;
    }

    /* renamed from: a */
    private final InstrumentationSession m8540a() {
        Object obj = (InstrumentationSession) this.f12871b.mo10566a();
        obj.f2598l = this;
        jri.m13404b(obj);
        this.f12873d = obj;
        this.f12872c.add(obj);
        return obj;
    }

    @UsedByReflection
    public InstrumentationSession getCurrentSession() {
        InstrumentationSession instrumentationSession;
        synchronized (this.f12870a) {
            if (this.f12873d == null) {
                m8540a();
            }
            instrumentationSession = this.f12873d;
        }
        return instrumentationSession;
    }

    @UsedByReflection
    public List getSessionList() {
        List a;
        synchronized (this.f12870a) {
            a = ken.m13713a(this.f12872c);
        }
        return a;
    }

    @UsedByReflection
    public void handleClose(InstrumentationSession instrumentationSession) {
        synchronized (this.f12870a) {
            if (this.f12873d == instrumentationSession) {
                this.f12873d = null;
            }
            this.f12872c.remove(instrumentationSession);
        }
    }

    @UsedByReflection
    public boolean hasSessions() {
        boolean z;
        synchronized (this.f12870a) {
            z = this.f12872c.size() > 0;
        }
        return z;
    }
}
