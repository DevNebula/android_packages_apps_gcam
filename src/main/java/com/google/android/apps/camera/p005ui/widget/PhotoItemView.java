package com.google.android.apps.camera.p005ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.widget.PhotoItemView */
public class PhotoItemView extends FrameLayout {
    /* renamed from: a */
    public ImageView f2629a = null;
    /* renamed from: b */
    private ImageView f2630b = null;

    public PhotoItemView(Context context) {
        super(context);
    }

    public PhotoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final ImageView mo2747a() {
        if (this.f2630b == null) {
            this.f2630b = (ImageView) findViewById(R.id.photo_view);
        }
        return this.f2630b;
    }
}
