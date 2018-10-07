package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: hjs */
public final class hjs implements kwk {
    /* renamed from: a */
    private final kwk f20174a;

    private hjs(kwk kwk) {
        this.f20174a = kwk;
    }

    /* renamed from: a */
    public static hjs m12098a(kwk kwk) {
        return new hjs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (PackageManager) ktm.m14219a(((Context) this.f20174a.mo10566a()).getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
