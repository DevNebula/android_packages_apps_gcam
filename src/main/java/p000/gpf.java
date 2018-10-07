package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gpf */
public final class gpf extends imt {
    /* renamed from: a */
    private final kcx f26441a;

    public gpf(Resources resources, ilp ilp) {
        super(ilp);
        this.f26441a = kee.m13694a(gpe.SHUTTER, resources.getString(R.string.preference_volume_key_shutter), gpe.ZOOM, resources.getString(R.string.preference_volume_key_zoom), gpe.NOOP, resources.getString(R.string.preference_volume_key_do_nothing));
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15011b(Object obj) {
        gpe gpe = (gpe) this.f26441a.mo9757a().get((String) obj);
        if (gpe != null) {
            return gpe;
        }
        return gpe.SHUTTER;
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo15012c(Object obj) {
        return (String) jqk.m13354c((String) this.f26441a.get((gpe) obj));
    }
}
