package p000;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: dzk */
public final class dzk implements OnPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ irs f3596a;
    /* renamed from: b */
    private final /* synthetic */ Object f3597b;

    public dzk(irs irs, Object obj) {
        this.f3596a = irs;
        this.f3597b = obj;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f3596a.mo8899a(preference.getKey(), this.f3597b, obj);
        return true;
    }
}
