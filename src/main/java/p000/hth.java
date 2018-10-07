package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: hth */
public final class hth {
    @Deprecated
    /* renamed from: a */
    public static final huh f7006a = new huh("ClearcutLogger.API", f7008c, f7007b);
    /* renamed from: b */
    private static final hum f7007b = new hum((byte) 0);
    /* renamed from: c */
    private static final huk f7008c = new hti();
    /* renamed from: d */
    private final String f7009d;
    /* renamed from: e */
    private final int f7010e;
    /* renamed from: f */
    private String f7011f;
    /* renamed from: g */
    private int f7012g;
    /* renamed from: h */
    private String f7013h;
    /* renamed from: i */
    private final htm f7014i;
    /* renamed from: j */
    private final hwu f7015j;
    /* renamed from: k */
    private htl f7016k;
    /* renamed from: l */
    private final htj f7017l;

    public hth(Context context, String str) {
        this(context, str, new htn(context), hww.f20829a, new htu(context));
    }

    private hth(Context context, String str, htm htm, hwu hwu, htj htj) {
        this.f7012g = -1;
        this.f7009d = context.getPackageName();
        this.f7010e = hth.m3431a(context);
        this.f7012g = -1;
        this.f7011f = str;
        this.f7013h = null;
        this.f7014i = htm;
        this.f7015j = hwu;
        this.f7016k = new htl();
        this.f7017l = htj;
    }

    /* renamed from: a */
    private static int m3431a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }
}
