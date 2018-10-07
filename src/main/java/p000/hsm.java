package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.refocus.processing.EditingFinishedListener;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;

/* renamed from: hsm */
final /* synthetic */ class hsm implements OnClickListener {
    /* renamed from: a */
    private final RGBZFocusControls f6950a;

    hsm(RGBZFocusControls rGBZFocusControls) {
        this.f6950a = rGBZFocusControls;
    }

    public final void onClick(View view) {
        EditingFinishedListener editingFinishedListener = this.f6950a.f12906g;
        if (editingFinishedListener != null) {
            editingFinishedListener.onDone();
        }
    }
}
