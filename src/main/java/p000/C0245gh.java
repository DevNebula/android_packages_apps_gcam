package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: gh */
public final class C0245gh {
    /* renamed from: e */
    private static final Object f5422e = new Object();
    /* renamed from: f */
    private static C0245gh f5423f;
    /* renamed from: a */
    public final Context f5424a;
    /* renamed from: b */
    public final HashMap f5425b = new HashMap();
    /* renamed from: c */
    public final HashMap f5426c = new HashMap();
    /* renamed from: d */
    public final ArrayList f5427d = new ArrayList();

    private C0245gh(Context context) {
        this.f5424a = context;
        C0246gi c0246gi = new C0246gi(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static C0245gh m2599a(Context context) {
        C0245gh c0245gh;
        synchronized (f5422e) {
            if (f5423f == null) {
                f5423f = new C0245gh(context.getApplicationContext());
            }
            c0245gh = f5423f;
        }
        return c0245gh;
    }
}
