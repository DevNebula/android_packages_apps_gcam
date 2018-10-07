package p000;

import android.media.Image;

/* compiled from: PG */
/* renamed from: jfs */
public final class jfs implements jfx {
    /* renamed from: a */
    private kbg f21452a = kau.f21835a;
    /* renamed from: b */
    private final /* synthetic */ Image f21453b;
    /* renamed from: c */
    private final /* synthetic */ int f21454c;
    /* renamed from: d */
    private final /* synthetic */ int f21455d;
    /* renamed from: e */
    private final /* synthetic */ jfw f21456e;

    public jfs(jfw jfw, Image image, int i, int i2) {
        this.f21456e = jfw;
        this.f21453b = image;
        this.f21454c = i;
        this.f21455d = i2;
    }

    public final void close() {
        int i;
        if (this.f21452a.mo9709b()) {
            i = this.f21454c;
        } else {
            i = 0;
        }
        this.f21456e.f8147a.queueInputBuffer(this.f21455d, 0, i, ((Long) this.f21452a.mo9707a(Long.valueOf(0))).longValue(), 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9393a() {
        return this.f21453b;
    }

    /* renamed from: a */
    public final void mo9394a(long j) {
        this.f21452a = kbg.m4804c(Long.valueOf(j));
    }
}
