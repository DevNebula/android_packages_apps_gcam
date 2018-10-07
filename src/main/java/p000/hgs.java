package p000;

import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import java.lang.ref.WeakReference;

/* renamed from: hgs */
final /* synthetic */ class hgs implements kbn {
    /* renamed from: a */
    private final WeakReference f20100a;
    /* renamed from: b */
    private final WeakReference f20101b;

    hgs(WeakReference weakReference, WeakReference weakReference2) {
        this.f20100a = weakReference;
        this.f20101b = weakReference2;
    }

    /* renamed from: b */
    public final Object mo9715b() {
        boolean z;
        WeakReference weakReference = this.f20100a;
        WeakReference weakReference2 = this.f20101b;
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
