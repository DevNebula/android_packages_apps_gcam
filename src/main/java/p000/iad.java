package p000;

import android.content.Context;

/* renamed from: iad */
public final class iad {
    /* renamed from: a */
    public static iad f7237a = new iad();
    /* renamed from: b */
    private iac f7238b = null;

    /* renamed from: a */
    public final synchronized iac mo8300a(Context context) {
        if (this.f7238b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f7238b = new iac(context);
        }
        return this.f7238b;
    }
}
