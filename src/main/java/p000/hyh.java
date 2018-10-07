package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: hyh */
final class hyh implements Callable {
    /* renamed from: a */
    private final /* synthetic */ Context f7187a;

    hyh(Context context) {
        this.f7187a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f7187a.getSharedPreferences("google_sdk_flags", 1);
    }
}
