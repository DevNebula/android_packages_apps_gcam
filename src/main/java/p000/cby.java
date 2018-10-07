package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cby */
public final class cby implements kwk {
    /* renamed from: a */
    private final cbw f12135a;

    private cby(cbw cbw) {
        this.f12135a = cbw;
    }

    /* renamed from: a */
    public static cby m8073a(cbw cbw) {
        return new cby(cbw);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return cby.m8074b(this.f12135a);
    }

    /* renamed from: b */
    public static Context m8074b(cbw cbw) {
        return (Context) ktm.m14219a(cbw.f1867b, "Cannot return null from a non-@Nullable @Provides method");
    }
}
