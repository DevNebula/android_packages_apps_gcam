package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyd */
public final class hyd implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f7177a;
    /* renamed from: b */
    private final /* synthetic */ String f7178b;
    /* renamed from: c */
    private final /* synthetic */ Integer f7179c;

    public hyd(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f7177a = sharedPreferences;
        this.f7178b = str;
        this.f7179c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f7177a.getInt(this.f7178b, this.f7179c.intValue()));
    }
}
