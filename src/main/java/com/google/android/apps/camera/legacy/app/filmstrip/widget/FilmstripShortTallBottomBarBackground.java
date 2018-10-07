package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import p000.hkg;

/* compiled from: PG */
public class FilmstripShortTallBottomBarBackground extends FrameLayout {
    /* renamed from: a */
    private View f2522a;
    /* renamed from: b */
    private View f2523b;

    public FilmstripShortTallBottomBarBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        switch (configuration.orientation) {
            case 1:
                m1280a();
                return;
            case 2:
                this.f2522a.setVisibility(0);
                this.f2523b.setVisibility(8);
                return;
            default:
                m1280a();
                return;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        hkg a = hkg.m3276a((View) this);
        this.f2522a = (View) a.mo7919a((int) R.id.filmstrip_short_bottom_bar_gradient);
        this.f2523b = (View) a.mo7919a((int) R.id.filmstrip_tall_bottom_bar_gradient);
    }

    /* renamed from: a */
    private final void m1280a() {
        this.f2522a.setVisibility(8);
        this.f2523b.setVisibility(0);
    }
}
