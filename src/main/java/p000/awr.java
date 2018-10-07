package p000;

import android.app.Activity;
import android.content.Intent;

@Deprecated
/* compiled from: PG */
/* renamed from: awr */
public final class awr {
    /* renamed from: a */
    public final Activity f1017a;

    public awr(Activity activity) {
        jri.m13404b((Object) activity);
        this.f1017a = activity;
    }

    /* renamed from: a */
    public final void mo1821a(Intent intent) {
        jri.m13404b((Object) intent);
        this.f1017a.setIntent(intent);
    }

    /* renamed from: b */
    public final void mo1823b(Intent intent) {
        jri.m13404b((Object) intent);
        this.f1017a.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo1822a(Intent intent, int i, int i2) {
        mo1823b(intent);
        this.f1017a.overridePendingTransition(i, i2);
    }
}
