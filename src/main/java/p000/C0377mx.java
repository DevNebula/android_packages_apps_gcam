package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: mx */
final class C0377mx implements OnClickListener {
    /* renamed from: a */
    private final View f9224a;
    /* renamed from: b */
    private final String f9225b;
    /* renamed from: c */
    private Method f9226c;
    /* renamed from: d */
    private Context f9227d;

    public C0377mx(View view, String str) {
        this.f9224a = view;
        this.f9225b = str;
    }

    public final void onClick(View view) {
        if (this.f9226c == null) {
            String stringBuilder;
            Context context = this.f9224a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f9225b, new Class[]{View.class});
                        if (method != null) {
                            this.f9226c = method;
                            this.f9227d = context;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f9224a.getId();
            if (id != -1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(" with id '");
                stringBuilder2.append(this.f9224a.getContext().getResources().getResourceEntryName(id));
                stringBuilder2.append("'");
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = "";
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Could not find method ");
            stringBuilder3.append(this.f9225b);
            stringBuilder3.append("(View) in a parent or ancestor Context for android:onClick ");
            stringBuilder3.append("attribute defined on view ");
            stringBuilder3.append(this.f9224a.getClass());
            stringBuilder3.append(stringBuilder);
            throw new IllegalStateException(stringBuilder3.toString());
        }
        try {
            this.f9226c.invoke(this.f9227d, new Object[]{view});
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (Throwable e22) {
            throw new IllegalStateException("Could not execute method for android:onClick", e22);
        }
    }
}
