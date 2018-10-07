package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: dyy */
public final class dyy implements kwk {
    /* renamed from: a */
    private final kwk f17000a;
    /* renamed from: b */
    private final kwk f17001b;
    /* renamed from: c */
    private final kwk f17002c;

    private dyy(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17000a = kwk;
        this.f17001b = kwk2;
        this.f17002c = kwk3;
    }

    /* renamed from: a */
    public static dyy m9722a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new dyy(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (gos) ktm.m14219a(new got((Context) this.f17000a.mo10566a(), (SharedPreferences) this.f17001b.mo10566a(), (irs) this.f17002c.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
