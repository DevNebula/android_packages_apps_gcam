package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: mz */
public final class C0722mz implements C0411pf {
    /* renamed from: a */
    private boolean f22091a;
    /* renamed from: b */
    private final /* synthetic */ WeakReference f22092b;
    /* renamed from: c */
    private final /* synthetic */ C0454rm f22093c;

    public C0722mz(C0454rm c0454rm, WeakReference weakReference) {
        this.f22093c = c0454rm;
        this.f22092b = weakReference;
        this();
    }

    /* renamed from: a */
    public final void mo14242a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0257gt(this));
    }

    /* renamed from: a */
    public final void mo14244a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0256gs(this, typeface));
    }

    /* renamed from: a */
    public final void mo10854a(C0734op c0734op, boolean z) {
        if (!this.f22091a) {
            this.f22091a = true;
            C0462ru c0462ru = null;
            c0462ru.mo11063a();
            this.f22091a = false;
        }
    }

    /* renamed from: a */
    public final void mo14243a(Typeface typeface) {
        C0454rm c0454rm = this.f22093c;
        WeakReference weakReference = this.f22092b;
        if (c0454rm.f9627c) {
            c0454rm.f9626b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, c0454rm.f9625a);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10855a(C0734op c0734op) {
        return false;
    }
}
