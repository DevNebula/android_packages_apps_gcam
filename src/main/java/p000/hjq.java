package p000;

import java.text.NumberFormat;

/* compiled from: PG */
/* renamed from: hjq */
public final class hjq implements kwk {
    /* renamed from: a */
    public static final hjq f20171a = new hjq();

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMinimumFractionDigits(1);
        instance.setMaximumFractionDigits(1);
        return (NumberFormat) ktm.m14219a(instance, "Cannot return null from a non-@Nullable @Provides method");
    }
}
