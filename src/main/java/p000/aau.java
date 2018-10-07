package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: aau */
public final class aau implements aat {
    /* renamed from: a */
    public final aat f10110a;
    /* renamed from: b */
    private final Handler f10111b;

    aau(Handler handler, aat aat) {
        this.f10111b = handler;
        this.f10110a = aat;
    }

    /* renamed from: a */
    public final void mo42a() {
        this.f10111b.post(new aav(this));
    }
}
