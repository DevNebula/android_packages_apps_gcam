package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cey */
public final class cey implements ijk {
    /* renamed from: a */
    private final ikq f12279a;
    /* renamed from: b */
    private final kwk f12280b;
    /* renamed from: c */
    private final kwk f12281c;
    /* renamed from: d */
    private final kwk f12282d;
    /* renamed from: e */
    private final kwk f12283e;
    /* renamed from: f */
    private final kwk f12284f;
    /* renamed from: g */
    private final Executor f12285g;
    /* renamed from: h */
    private final AtomicBoolean f12286h = new AtomicBoolean(false);
    /* renamed from: i */
    private final iks f12287i;
    /* renamed from: j */
    private final ird f12288j;
    /* renamed from: k */
    private final iqz f12289k;
    /* renamed from: l */
    private kpk f12290l;

    cey(ikq ikq, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, Executor executor, ira ira, iks iks, ird ird) {
        this.f12279a = ikq;
        this.f12280b = kwk;
        this.f12281c = kwk2;
        this.f12282d = kwk3;
        this.f12284f = kwk5;
        this.f12283e = kwk4;
        this.f12285g = executor;
        this.f12287i = iks;
        this.f12288j = ird;
        this.f12289k = ira.mo8854a("ActivityStartup");
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        if (this.f12286h.getAndSet(true)) {
            return this.f12290l;
        }
        this.f12288j.mo8856a("ActivityStartup");
        this.f12279a.mo13670a();
        bax a = bax.m805a(this.f12285g);
        a.f1082d = this.f12287i;
        a.f1080b = this.f12288j;
        a.f1081c = this.f12289k;
        this.f12290l = a.mo1889a(this.f12281c, "PermissionsStartup").mo1889a(this.f12282d, "DcimFolderStart").mo1889a(this.f12280b, "WaitForCameraDevices").mo1891b(this.f12283e, "ActivityBehaviors").mo1889a(this.f12284f, "ModeStartup").mo1890a();
        this.f12288j.mo8857b();
        return this.f12290l;
    }
}
