package com.google.android.apps.camera.p005ui.toyboxmenu;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import p000.C0345kz;
import p000.hdy;
import p000.hij;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.toyboxmenu.ToyboxDrawerLayout */
public class ToyboxDrawerLayout extends C0345kz {
    /* renamed from: k */
    private hij f12890k = new hij(this);

    public ToyboxDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hij hij = this.f12890k;
        hij.f6597c = hdy.m3139b(hij.f6595a.getContext());
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hij hij = this.f12890k;
        if (hij.f6597c == -1) {
            throw new RuntimeException("onAttachedToWindow not called yet; current rotation unknown.");
        }
        int rotation = hij.f6595a.getDisplay().getRotation();
        if (rotation != hij.f6597c) {
            hij.f6596b.start();
        }
        hij.f6597c = rotation;
    }
}
