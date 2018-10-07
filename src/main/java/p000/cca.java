package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* renamed from: cca */
public final class cca implements kwk {
    /* renamed from: a */
    private final kwk f12138a;

    private cca(kwk kwk) {
        this.f12138a = kwk;
    }

    /* renamed from: a */
    public static cca m8078a(kwk kwk) {
        return new cca(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (SharedPreferences) ktm.m14219a(PreferenceManager.getDefaultSharedPreferences((Context) this.f12138a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
