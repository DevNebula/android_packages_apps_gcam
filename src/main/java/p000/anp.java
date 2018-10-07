package p000;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: anp */
public final class anp {
    /* renamed from: a */
    private static volatile boolean f822a = true;

    /* renamed from: a */
    public static Drawable m540a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f822a) {
                Context c0390nq;
                if (theme != null) {
                    c0390nq = new C0390nq(context2, theme);
                } else {
                    c0390nq = context2;
                }
                return C0383nj.m5682b(c0390nq, i);
            }
        } catch (NoClassDefFoundError e) {
            f822a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0242ge.getDrawable(context2, i);
            }
            throw e2;
        } catch (NotFoundException e3) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i, theme);
    }
}
