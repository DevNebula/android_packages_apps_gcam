package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: hzj */
public final class hzj {
    /* renamed from: a */
    public static final huh f7205a = new huh("Help.API", f7208d, f7207c);
    /* renamed from: b */
    public static final hzh f7206b = new hyn();
    /* renamed from: c */
    private static final hum f7207c = new hum((byte) 0);
    /* renamed from: d */
    private static final huk f7208d = new hzk();
    /* renamed from: e */
    private static final Executor f7209e = Executors.newSingleThreadExecutor();

    @TargetApi(11)
    /* renamed from: a */
    public static void m3649a(huq huq, hzn hzn) {
        new hzl(huq, hzn).executeOnExecutor(f7209e, new Void[0]);
    }
}
