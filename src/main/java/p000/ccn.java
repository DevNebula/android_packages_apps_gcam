package p000;

import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: ccn */
public final class ccn implements kwk {
    /* renamed from: a */
    private final kwk f12162a;

    private ccn(kwk kwk) {
        this.f12162a = kwk;
    }

    /* renamed from: a */
    public static ccn m8105a(kwk kwk) {
        return new ccn(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (StorageManager) ktm.m14219a((StorageManager) ((ccb) this.f12162a.mo10566a()).mo2252a("storage"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
