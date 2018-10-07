package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: exq */
public final class exq implements kwk {
    /* renamed from: a */
    private final kwk f17972a;
    /* renamed from: b */
    private final kwk f17973b;

    private exq(kwk kwk, kwk kwk2) {
        this.f17972a = kwk;
        this.f17973b = kwk2;
    }

    /* renamed from: a */
    public static exq m10226a(kwk kwk, kwk kwk2) {
        return new exq(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17972a;
        ikb ikb = (ikb) kwk.mo10566a();
        this.f17973b.mo10566a();
        return (Handler) ktm.m14219a(ijy.m3846a(ikb, "MicrovideoFrameQ"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
