package p000;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: cbx */
public final class cbx implements kwk {
    /* renamed from: a */
    private final cbw f12134a;

    private cbx(cbw cbw) {
        this.f12134a = cbw;
    }

    /* renamed from: a */
    public static cbx m8070a(cbw cbw) {
        return new cbx(cbw);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return cbx.m8071b(this.f12134a);
    }

    /* renamed from: b */
    public static ContentResolver m8071b(cbw cbw) {
        return (ContentResolver) ktm.m14219a(cbw.f1866a.getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
