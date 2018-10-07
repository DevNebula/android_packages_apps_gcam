package p000;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* renamed from: cbw */
public class cbw {
    /* renamed from: a */
    public final Application f1866a;
    /* renamed from: b */
    public final Context f1867b;

    private cbw(Application application, Context context) {
        jri.m13404b((Object) application);
        jri.m13404b((Object) context);
        this.f1866a = application;
        this.f1867b = context;
    }

    /* renamed from: a */
    public static cbw m1127a(Application application) {
        return new cbw(application, application.getApplicationContext());
    }
}
