package com.google.android.apps.camera.p005ui.tutorialoverlay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.tutorialoverlay.TutorialOverlayWrapper */
public class TutorialOverlayWrapper extends FrameLayout {
    /* renamed from: a */
    public int f2613a = 8;

    public TutorialOverlayWrapper(Context context) {
        super(context);
    }

    public TutorialOverlayWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TutorialOverlayWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TutorialOverlayWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo2737a() {
        removeAllViews();
        setVisibility(8);
        this.f2613a = 8;
    }
}
