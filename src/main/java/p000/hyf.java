package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyf */
public final class hyf implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f7183a;
    /* renamed from: b */
    private final /* synthetic */ String f7184b;
    /* renamed from: c */
    private final /* synthetic */ String f7185c;

    public hyf(SharedPreferences sharedPreferences, String str, String str2) {
        this.f7183a = sharedPreferences;
        this.f7184b = str;
        this.f7185c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f7183a.getString(this.f7184b, this.f7185c);
    }
}
