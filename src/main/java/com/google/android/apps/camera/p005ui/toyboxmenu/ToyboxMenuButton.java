package com.google.android.apps.camera.p005ui.toyboxmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import p000.hdl;
import p000.hdr;
import p000.hds;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton */
public class ToyboxMenuButton extends ImageView {
    /* renamed from: a */
    public hdl f2612a;

    public ToyboxMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, null);
        getResources();
        this.f2612a = new hdl(context, (byte) 0);
        setImageDrawable(this.f2612a);
    }

    /* renamed from: a */
    public final void mo2736a(boolean z) {
        ViewPropertyAnimator duration = animate().alpha((float) z).setDuration(200);
        duration.withEndAction(new hdr(this, z));
        if (z) {
            duration.withStartAction(new hds(this));
        }
        setClickable(false);
        duration.start();
    }
}
