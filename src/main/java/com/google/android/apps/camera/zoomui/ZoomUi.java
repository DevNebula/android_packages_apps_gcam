package com.google.android.apps.camera.zoomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class ZoomUi extends FrameLayout {
    public ZoomUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final ZoomMarkerView mo2759a() {
        return (ZoomMarkerView) findViewById(R.id.zoom_marker_view);
    }

    /* renamed from: b */
    public final SeekBar mo2760b() {
        return (SeekBar) findViewById(R.id.zoom_marker_progress);
    }

    /* renamed from: c */
    public final LinearLayout mo2761c() {
        return (LinearLayout) findViewById(R.id.zoom_ui_internal);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.zoom_ui_layout, this);
        mo2760b().setMax(100000);
        setLayerType(1, null);
    }
}
