package p000;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btd */
public class btd {
    /* renamed from: a */
    public final Context f1565a;
    /* renamed from: b */
    public final Resources f1566b;
    /* renamed from: c */
    public final FocusIndicatorRingView f1567c;
    /* renamed from: d */
    public final TextView f1568d;
    /* renamed from: e */
    public final FocusIndicatorView f1569e;

    public btd(Context context, FocusIndicatorView focusIndicatorView) {
        this.f1565a = context;
        this.f1569e = focusIndicatorView;
        this.f1566b = context.getResources();
        this.f1567c = (FocusIndicatorRingView) focusIndicatorView.findViewById(R.id.focus_indicator_ring);
        this.f1568d = (TextView) focusIndicatorView.findViewById(R.id.focus_indicator_debug_hud);
    }
}
