package p000;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: gwf */
public final class gwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Context f6084a;
    /* renamed from: b */
    private final /* synthetic */ kpw f6085b;

    public gwf(Context context, kpw kpw) {
        this.f6084a = context;
        this.f6085b = kpw;
    }

    public final void run() {
        try {
            this.f6085b.mo15641a(acr.m125a(new File(this.f6084a.getCacheDir(), "indicatorDiskCache"), 5000000));
        } catch (Throwable e) {
            this.f6085b.mo15642a(e);
        }
    }
}
