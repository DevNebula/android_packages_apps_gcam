package p000;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* renamed from: cpu */
public final class cpu implements kwk {
    /* renamed from: a */
    private final kwk f13123a;
    /* renamed from: b */
    private final kwk f13124b;
    /* renamed from: c */
    private final kwk f13125c;
    /* renamed from: d */
    private final kwk f13126d;
    /* renamed from: e */
    private final kwk f13127e;

    public cpu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f13123a = kwk;
        this.f13124b = kwk2;
        this.f13125c = kwk3;
        this.f13126d = kwk4;
        this.f13127e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f13123a;
        kwk kwk2 = this.f13124b;
        return (cqm) ktm.m14219a(new cqm((Context) kwk.mo10566a(), (cqb) this.f13125c.mo10566a(), (ContentResolver) kwk2.mo10566a(), (cqi) this.f13126d.mo10566a(), (gsp) this.f13127e.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
