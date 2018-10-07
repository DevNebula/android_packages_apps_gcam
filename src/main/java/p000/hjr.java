package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: hjr */
public final class hjr implements kwk {
    /* renamed from: a */
    private final kwk f20172a;
    /* renamed from: b */
    private final kwk f20173b;

    private hjr(kwk kwk, kwk kwk2) {
        this.f20172a = kwk;
        this.f20173b = kwk2;
    }

    /* renamed from: a */
    public static hjr m12096a(kwk kwk, kwk kwk2) {
        return new hjr(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (PackageInfo) ktm.m14219a(hhz.m3209a((PackageManager) this.f20172a.mo10566a(), (Context) this.f20173b.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
