package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: vx */
public final class C0549vx {
    /* renamed from: a */
    private static Method f9944a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f9944a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f9944a.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m6137a(View view, Rect rect, Rect rect2) {
        if (f9944a != null) {
            try {
                f9944a.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m6138a(View view) {
        return C0315jm.m4635j(view) == 1;
    }

    /* renamed from: b */
    public static void m6139b(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException e) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (Throwable e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (Throwable e22) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e22);
        }
    }
}
