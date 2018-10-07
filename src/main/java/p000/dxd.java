package p000;

import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.processing.EditingFinishedListener;

/* compiled from: PG */
/* renamed from: dxd */
public final class dxd implements EditingFinishedListener {
    /* renamed from: a */
    public final /* synthetic */ ViewerActivity f16926a;

    public dxd(ViewerActivity viewerActivity) {
        this.f16926a = viewerActivity;
    }

    public final void onDone() {
        this.f16926a.f23269h = false;
        new dxe(this).execute(new Void[0]);
    }
}
