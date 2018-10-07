package p000;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: all */
public final class all implements ajz {
    /* renamed from: a */
    private final Context f10388a;

    public all(Context context) {
        this.f10388a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Uri uri = (Uri) obj;
        if (aeh.m189a(i, i2)) {
            Object obj2;
            Long l = (Long) adp.mo11616a(anf.f10595a);
            if (l == null) {
                obj2 = null;
            } else if (l.longValue() != -1) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            if (obj2 != null) {
                adl arf = new arf(uri);
                Context context = this.f10388a;
                return new aka(arf, aeo.m6397a(context, uri, new aeq(context.getContentResolver())));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo344a(Object obj) {
        Uri uri = (Uri) obj;
        return aeh.m190a(uri) && aeh.m191b(uri);
    }
}
