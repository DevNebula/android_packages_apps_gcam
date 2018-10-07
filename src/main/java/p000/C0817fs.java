package p000;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fs */
class C0817fs extends C0679fr {
    /* renamed from: a */
    private static Method f24304a;
    /* renamed from: b */
    private static boolean f24305b;
    /* renamed from: c */
    private static Method f24306c;
    /* renamed from: d */
    private static boolean f24307d;

    C0817fs() {
    }

    /* renamed from: a */
    public final void mo6910a(View view, Matrix matrix) {
        if (!f24305b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f24304a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f24305b = true;
        }
        if (f24304a != null) {
            try {
                f24304a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    /* renamed from: b */
    public final void mo6911b(View view, Matrix matrix) {
        if (!f24307d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f24306c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f24307d = true;
        }
        if (f24306c != null) {
            try {
                f24306c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
