package p000;

import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.lang.ref.WeakReference;

/* renamed from: hgq */
final /* synthetic */ class hgq implements kbn {
    /* renamed from: a */
    private final WeakReference f20098a;
    /* renamed from: b */
    private final WeakReference f20099b;

    hgq(WeakReference weakReference, WeakReference weakReference2) {
        this.f20098a = weakReference;
        this.f20099b = weakReference2;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        boolean z;
        WeakReference weakReference = this.f20098a;
        WeakReference weakReference2 = this.f20099b;
        if (!((View) weakReference.get()).isEnabled()) {
            z = false;
        } else if (((OptionsBarView) weakReference2.get()).isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
