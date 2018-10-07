package android.support.p002v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000.C0540vk;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ActivityChooserView */
public final class ActivityChooserView extends ViewGroup {

    /* compiled from: PG */
    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public class InnerLayout extends LinearLayout {
        /* renamed from: a */
        private static final int[] f645a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0540vk a = C0540vk.m6108a(context, attributeSet, f645a);
            setBackgroundDrawable(a.mo11390b(0));
            a.f9927b.recycle();
        }
    }

    protected final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    protected final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }
}
