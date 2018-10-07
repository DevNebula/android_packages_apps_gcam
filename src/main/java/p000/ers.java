package p000;

import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: ers */
public final class ers {
    /* renamed from: a */
    public final EnumSet f4362a;

    static {
        new exb().mo13194d();
    }

    public ers(EnumSet enumSet) {
        this.f4362a = enumSet;
    }

    /* renamed from: a */
    public final boolean mo6548a() {
        return this.f4362a.contains(ert.CAN_DELETE);
    }

    /* renamed from: b */
    public final boolean mo6549b() {
        return this.f4362a.contains(ert.CAN_SHARE);
    }

    /* renamed from: c */
    public final boolean mo6550c() {
        return this.f4362a.contains(ert.CAN_SWIPE_AWAY);
    }

    /* renamed from: d */
    public final boolean mo6551d() {
        return this.f4362a.contains(ert.CAN_ZOOM_IN_PLACE);
    }

    /* renamed from: e */
    public final boolean mo6552e() {
        return this.f4362a.contains(ert.IS_RENDERING);
    }
}
