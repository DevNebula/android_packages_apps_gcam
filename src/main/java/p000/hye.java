package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hye */
public final class hye implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f7180a;
    /* renamed from: b */
    private final /* synthetic */ String f7181b;
    /* renamed from: c */
    private final /* synthetic */ Long f7182c;

    public hye(SharedPreferences sharedPreferences, String str, Long l) {
        this.f7180a = sharedPreferences;
        this.f7181b = str;
        this.f7182c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f7180a.getLong(this.f7181b, this.f7182c.longValue()));
    }
}
