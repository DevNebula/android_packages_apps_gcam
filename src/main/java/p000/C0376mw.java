package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: PG */
/* renamed from: mw */
public class C0376mw {
    /* renamed from: a */
    private static final Class[] f9219a = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: b */
    private static final int[] f9220b = new int[]{16843375};
    /* renamed from: c */
    private static final String[] f9221c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    /* renamed from: d */
    private static final Map f9222d = new C0691ih();
    /* renamed from: e */
    private final Object[] f9223e = new Object[2];

    /* renamed from: a */
    static void m5657a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0315jm.m4645t(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9220b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0377mx(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    protected static C0430qk m5658b(Context context, AttributeSet attributeSet) {
        return new C0430qk(context, attributeSet);
    }

    /* renamed from: a */
    public C0432qm mo10696a(Context context, AttributeSet attributeSet) {
        return new C0432qm(context, attributeSet);
    }

    /* renamed from: c */
    protected static C0433qn m5659c(Context context, AttributeSet attributeSet) {
        return new C0433qn(context, attributeSet);
    }

    /* renamed from: d */
    protected static C0434qo m5660d(Context context, AttributeSet attributeSet) {
        return new C0434qo(context, attributeSet);
    }

    /* renamed from: e */
    protected static C0439qu m5661e(Context context, AttributeSet attributeSet) {
        return new C0439qu(context, attributeSet);
    }

    /* renamed from: f */
    protected static C0440qv m5662f(Context context, AttributeSet attributeSet) {
        return new C0440qv(context, attributeSet);
    }

    /* renamed from: g */
    protected static C0442qx m5663g(Context context, AttributeSet attributeSet) {
        return new C0442qx(context, attributeSet);
    }

    /* renamed from: h */
    protected static C0443qy m5664h(Context context, AttributeSet attributeSet) {
        return new C0443qy(context, attributeSet);
    }

    /* renamed from: i */
    protected static C0446rb m5665i(Context context, AttributeSet attributeSet) {
        return new C0446rb(context, attributeSet);
    }

    /* renamed from: j */
    protected static C0447rc m5666j(Context context, AttributeSet attributeSet) {
        return new C0447rc(context, attributeSet);
    }

    /* renamed from: k */
    protected static C0448rd m5667k(Context context, AttributeSet attributeSet) {
        return new C0448rd(context, attributeSet);
    }

    /* renamed from: l */
    protected static C0449rf m5668l(Context context, AttributeSet attributeSet) {
        return new C0449rf(context, attributeSet);
    }

    /* renamed from: m */
    protected static C0455rn m5669m(Context context, AttributeSet attributeSet) {
        return new C0455rn(context, attributeSet);
    }

    /* renamed from: a */
    private final View m5656a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f9222d.get(str);
        if (constructor == null) {
            try {
                String stringBuilder;
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(str);
                    stringBuilder = stringBuilder2.toString();
                } else {
                    stringBuilder = str;
                }
                constructor = classLoader.loadClass(stringBuilder).asSubclass(View.class).getConstructor(f9219a);
                f9222d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f9223e);
    }

    /* renamed from: a */
    final View mo10695a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        Object[] objArr;
        try {
            Object[] objArr2 = this.f9223e;
            objArr2[0] = context;
            objArr2[1] = attributeSet;
            View a;
            if (str.indexOf(46) == -1) {
                for (String a2 : f9221c) {
                    a = m5656a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                objArr2 = this.f9223e;
                objArr2[0] = null;
                objArr2[1] = null;
                return null;
            }
            a = m5656a(context, str, null);
            objArr = this.f9223e;
            objArr[0] = null;
            objArr[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            objArr = this.f9223e;
            objArr[0] = null;
            objArr[1] = null;
            return null;
        }
    }

    /* renamed from: n */
    static Context m5670n(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9377cD, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0382ni.f9383cJ, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return context;
        }
        if ((context instanceof C0390nq) && ((C0390nq) context).f9445a == resourceId) {
            return context;
        }
        return new C0390nq(context, resourceId);
    }

    /* renamed from: a */
    final void mo10697a(View view, String str) {
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" asked to inflate view for <");
            stringBuilder.append(str);
            stringBuilder.append(">, but returned null");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
