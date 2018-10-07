package p000;

import android.support.p001v4.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* renamed from: iaq */
public final class iaq {
    /* renamed from: a */
    public static final huk f7241a = new iar();
    /* renamed from: b */
    public static final huh f7242b = new huh("SignIn.API", f7241a, f7243c);
    /* renamed from: c */
    private static final hum f7243c = new hum((byte) 0);
    /* renamed from: d */
    private static final hum f7244d = new hum((byte) 0);
    /* renamed from: e */
    private static final huk f7245e = new ias();

    static {
        Scope scope = new Scope("profile");
        scope = new Scope(NotificationCompat.CATEGORY_EMAIL);
        huh huh = new huh("SignIn.INTERNAL_API", f7245e, f7244d);
    }
}
