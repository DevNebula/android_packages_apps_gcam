package p000;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: ikl */
public final class ikl implements ThreadFactory {
    /* renamed from: a */
    private final /* synthetic */ int f7423a;
    /* renamed from: b */
    private final /* synthetic */ String f7424b;

    public ikl(int i, String str) {
        this.f7423a = i;
        this.f7424b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new ijj(this.f7423a, runnable, this.f7424b);
    }
}
