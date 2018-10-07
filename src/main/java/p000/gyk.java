package p000;

import android.content.Context;
import android.provider.Settings.Secure;

/* compiled from: PG */
/* renamed from: gyk */
public final class gyk {
    /* renamed from: a */
    private Context f6168a;

    public gyk(Context context) {
        this.f6168a = context;
    }

    /* renamed from: a */
    public final boolean mo7546a() {
        if (Secure.getInt(this.f6168a.getContentResolver(), "camera_double_twist_to_flip_enabled", 1) != 1) {
            return false;
        }
        return true;
    }
}
