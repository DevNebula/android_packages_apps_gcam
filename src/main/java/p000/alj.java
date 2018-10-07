package p000;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: alj */
public final class alj implements ajz {
    /* renamed from: a */
    private final Context f10386a;

    public alj(Context context) {
        this.f10386a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        if (!aeh.m189a(i, i2)) {
            return null;
        }
        adl arf = new arf(uri);
        Context context = this.f10386a;
        return new aka(arf, aeo.m6397a(context, uri, new aep(context.getContentResolver())));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        Uri uri = (Uri) obj;
        return aeh.m190a(uri) && !aeh.m191b(uri);
    }
}
