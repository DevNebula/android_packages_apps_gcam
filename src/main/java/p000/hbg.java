package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbg */
public final class hbg extends ViewOutlineProvider {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f6271a;

    public hbg(ShutterButton shutterButton) {
        this.f6271a = shutterButton;
    }

    public final void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        this.f6271a.buttonRect.round(rect);
        outline.setRoundRect(rect, (float) this.f6271a.currentSpec.mo7712h());
    }
}
