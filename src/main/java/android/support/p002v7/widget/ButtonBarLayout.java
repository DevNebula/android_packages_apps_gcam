package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import p000.C0315jm;
import p000.C0382ni;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {
    /* renamed from: a */
    private boolean f646a;
    /* renamed from: b */
    private int f647b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9316aw);
        this.f646a = obtainStyledAttributes.getBoolean(C0382ni.f9317ax, true);
        obtainStyledAttributes.recycle();
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* renamed from: a */
    private final int m436a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final boolean m438a() {
        return getOrientation() == 1;
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        if (this.f646a) {
            if (size > this.f647b && m438a()) {
                m437a(false);
            }
            this.f647b = size;
        }
        if (m438a()) {
            size = i;
            z = false;
        } else if (MeasureSpec.getMode(i) == 1073741824) {
            size = MeasureSpec.makeMeasureSpec(size, kvl.UNSET_ENUM_VALUE);
            z = true;
        } else {
            size = i;
            z = false;
        }
        super.onMeasure(size, i2);
        if (this.f646a && !m438a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            m437a(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m436a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            i3 = ((childAt.getMeasuredHeight() + getPaddingTop()) + layoutParams.topMargin) + layoutParams.bottomMargin;
            if (m438a()) {
                size = m436a(a + 1);
                if (size >= 0) {
                    i3 += getChildAt(size).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i3 += getPaddingBottom();
            }
        }
        if (C0315jm.m4636k(this) != i3) {
            setMinimumHeight(i3);
        }
    }

    /* renamed from: a */
    private final void m437a(boolean z) {
        int i;
        setOrientation(z);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
        for (i = getChildCount() - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
    }
}
