package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fe */
public final class C0225fe {
    /* renamed from: a */
    public static C0219ex f4722a = new C0678fh((byte) 0);
    /* renamed from: b */
    public static ArrayList f4723b = new ArrayList();
    /* renamed from: c */
    private static ThreadLocal f4724c = new ThreadLocal();

    /* renamed from: a */
    static C0691ih m2316a() {
        C0691ih c0691ih;
        WeakReference weakReference = (WeakReference) f4724c.get();
        if (weakReference != null) {
            c0691ih = (C0691ih) weakReference.get();
            if (c0691ih != null) {
                return c0691ih;
            }
        }
        c0691ih = new C0691ih();
        f4724c.set(new WeakReference(c0691ih));
        return c0691ih;
    }

    /* renamed from: a */
    static void m2317a(ViewGroup viewGroup, C0219ex c0219ex) {
        if (c0219ex != null && viewGroup != null) {
            Object c0226ff = new C0226ff(c0219ex, viewGroup);
            viewGroup.addOnAttachStateChangeListener(c0226ff);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(c0226ff);
        }
    }
}
