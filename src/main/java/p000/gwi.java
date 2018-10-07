package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwi */
public final class gwi implements kwk {
    /* renamed from: a */
    private final kwk f19726a;
    /* renamed from: b */
    private final kwk f19727b;
    /* renamed from: c */
    private final kwk f19728c;

    public gwi(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f19726a = kwk;
        this.f19727b = kwk2;
        this.f19728c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19726a;
        kwk kwk2 = this.f19727b;
        Executor executor = (Executor) kwk2.mo10566a();
        ira ira = (ira) this.f19728c.mo10566a();
        return (gst) ktm.m14219a(new gst((kpk) kwk.mo10566a(), "indicatorThumbnail", executor, new gsr(), new gly(ira)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
