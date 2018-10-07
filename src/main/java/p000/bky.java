package p000;

import android.content.ContentResolver;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: bky */
public final class bky implements kwk {
    /* renamed from: a */
    private final kwk f11507a;
    /* renamed from: b */
    private final kwk f11508b;
    /* renamed from: c */
    private final kwk f11509c;

    private bky(bkx bkx, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11507a = kwk;
        this.f11508b = kwk2;
        this.f11509c = kwk3;
    }

    /* renamed from: a */
    public static bky m7597a(bkx bkx, kwk kwk, kwk kwk2, kwk kwk3) {
        return new bky(bkx, kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (bkw) ktm.m14219a(new bkw((ContentResolver) this.f11507a.mo10566a(), (hjf) this.f11508b.mo10566a(), (SharedPreferences) this.f11509c.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
