package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: nj */
public final class C0383nj {
    static {
        ThreadLocal threadLocal = new ThreadLocal();
        WeakHashMap weakHashMap = new WeakHashMap(0);
        Object obj = new Object();
    }

    /* renamed from: a */
    public static ColorStateList m5681a(Context context, int i) {
        return context.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m5682b(Context context, int i) {
        return C0436qq.m5787a().mo10932a(context, i, false);
    }
}
