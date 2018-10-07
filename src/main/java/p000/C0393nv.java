package p000;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: nv */
final class C0393nv implements OnMenuItemClickListener {
    /* renamed from: a */
    private static final Class[] f9457a = new Class[]{MenuItem.class};
    /* renamed from: b */
    private Object f9458b;
    /* renamed from: c */
    private Method f9459c;

    public C0393nv(Object obj, String str) {
        this.f9458b = obj;
        Class cls = obj.getClass();
        try {
            this.f9459c = cls.getMethod(str, f9457a);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't resolve menu item onClick handler ");
            stringBuilder.append(str);
            stringBuilder.append(" in class ");
            stringBuilder.append(cls.getName());
            InflateException inflateException = new InflateException(stringBuilder.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f9459c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f9459c.invoke(this.f9458b, new Object[]{menuItem})).booleanValue();
            }
            this.f9459c.invoke(this.f9458b, new Object[]{menuItem});
            return true;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
