package p000;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: vc */
public final class C0534vc {
    /* renamed from: a */
    public Method f9911a;
    /* renamed from: b */
    private Method f9912b;
    /* renamed from: c */
    private Method f9913c;

    public C0534vc() {
        try {
            this.f9912b = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f9912b.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f9913c = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f9913c.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.f9911a = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f9911a.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
    }
}
