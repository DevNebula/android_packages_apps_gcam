package p000;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fr */
class C0679fr extends C0235fu {
    /* renamed from: a */
    private static Method f18676a;
    /* renamed from: b */
    private static boolean f18677b;
    /* renamed from: c */
    private static Method f18678c;
    /* renamed from: d */
    private static boolean f18679d;

    C0679fr() {
    }

    /* renamed from: a */
    public final float mo6907a(View view) {
        if (!f18679d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f18678c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f18679d = true;
        }
        if (f18678c != null) {
            try {
                return ((Float) f18678c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.mo6907a(view);
    }

    /* renamed from: a */
    public final void mo6908a(View view, float f) {
        if (!f18677b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f18676a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f18677b = true;
        }
        if (f18676a != null) {
            try {
                f18676a.invoke(view, new Object[]{Float.valueOf(f)});
                return;
            } catch (IllegalAccessException e2) {
                return;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        view.setAlpha(f);
    }
}
