package p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: tp */
public final class C0841tp extends C0760tg implements C0500to {
    /* renamed from: a */
    public static Method f25474a;
    /* renamed from: b */
    public C0500to f25475b;

    static {
        try {
            f25474a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0841tp(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* renamed from: a */
    final C0475sh mo14426a(Context context, boolean z) {
        C0475sh c0761tq = new C0761tq(context, z);
        c0761tq.f22335c = this;
        return c0761tq;
    }

    /* renamed from: a */
    public final void mo11157a(C0734op c0734op, MenuItem menuItem) {
        C0500to c0500to = this.f25475b;
        if (c0500to != null) {
            c0500to.mo11157a(c0734op, menuItem);
        }
    }

    /* renamed from: b */
    public final void mo11158b(C0734op c0734op, MenuItem menuItem) {
        C0500to c0500to = this.f25475b;
        if (c0500to != null) {
            c0500to.mo11158b(c0734op, menuItem);
        }
    }
}
