package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.widget.Cling;
import java.util.HashMap;
import java.util.Map;
import p000.bli;
import p000.cum;

/* compiled from: PG */
public class ExternalViewerButton extends ImageButton {
    /* renamed from: a */
    public static final String f2519a = bli.m887a("ExtViewerButton");
    /* renamed from: b */
    public cum f2520b = cum.INVISIBLE;
    /* renamed from: c */
    public final Map f2521c = new HashMap();

    public ExternalViewerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2625a();
    }

    /* renamed from: a */
    public static int m1278a(cum cum) {
        if (cum == cum.REFOCUS) {
            return R.drawable.ic_refocus;
        }
        if (cum == cum.PHOTO_SPHERE) {
            return R.drawable.ic_photosphere_normal;
        }
        if (cum == cum.BURST) {
            return R.drawable.ic_view_burst;
        }
        return R.drawable.ic_control_play;
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo2625a();
    }

    /* renamed from: a */
    public final void mo2625a() {
        Cling cling;
        for (Cling cling2 : this.f2521c.values()) {
            cling2.setVisibility(4);
        }
        if (isShown()) {
            cling2 = (Cling) this.f2521c.get(this.f2520b);
            if (cling2 != null) {
                cling2.mo2744a();
                cling2.setVisibility(0);
            }
        }
    }
}
