package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyc */
public final class hyc implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f7174a;
    /* renamed from: b */
    private final /* synthetic */ String f7175b;
    /* renamed from: c */
    private final /* synthetic */ Boolean f7176c;

    public hyc(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f7174a = sharedPreferences;
        this.f7175b = str;
        this.f7176c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f7174a.getBoolean(this.f7175b, this.f7176c.booleanValue()));
    }
}
