package p000;

import android.graphics.Rect;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: fo */
final class C0231fo {
    /* renamed from: a */
    public static final C0235fu f4868a = new C0843ft();
    /* renamed from: b */
    public static final Property f4869b = new C0233fp(Float.class, "translationAlpha");
    /* renamed from: c */
    private static Field f4870c;
    /* renamed from: d */
    private static boolean f4871d;

    static {
        C0234fq c0234fq = new C0234fq(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m2403a() {
    }

    /* renamed from: a */
    static C0240ga m2402a(View view) {
        return new C0238fz(view);
    }

    /* renamed from: b */
    static void m2407b() {
    }

    /* renamed from: a */
    static void m2406a(View view, int i, int i2, int i3, int i4) {
        f4868a.mo6909a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m2404a(View view, float f) {
        f4868a.mo6908a(view, f);
    }

    /* renamed from: a */
    static void m2405a(View view, int i) {
        if (!f4871d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4870c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f4871d = true;
        }
        if (f4870c != null) {
            try {
                f4870c.setInt(view, (f4870c.getInt(view) & -13) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }
}
