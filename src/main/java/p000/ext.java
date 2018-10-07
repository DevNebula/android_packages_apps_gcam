package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ext */
public final class ext implements kwk {
    /* renamed from: a */
    private final kwk f17982a;
    /* renamed from: b */
    private final kwk f17983b;

    private ext(kwk kwk, kwk kwk2) {
        this.f17982a = kwk;
        this.f17983b = kwk2;
    }

    /* renamed from: a */
    public static ext m10232a(kwk kwk, kwk kwk2) {
        return new ext(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17982a;
        ikb ikb = (ikb) kwk.mo10566a();
        this.f17983b.mo10566a();
        return (Handler) ktm.m14219a(ijy.m3846a(ikb, "MicrovideoQSharedStartup"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
