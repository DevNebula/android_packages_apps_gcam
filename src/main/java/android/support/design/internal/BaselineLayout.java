package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public class BaselineLayout extends ViewGroup {
    /* renamed from: a */
    private int f553a = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getBaseline() {
        return this.f553a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = paddingLeft + ((paddingRight - measuredWidth) / 2);
                if (this.f553a == -1) {
                    i6 = paddingTop;
                } else if (childAt.getBaseline() != -1) {
                    i6 = (this.f553a + paddingTop) - childAt.getBaseline();
                } else {
                    i6 = paddingTop;
                }
                childAt.layout(i7, i6, measuredWidth + i7, measuredHeight + i6);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        int childCount = getChildCount();
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i5 = Math.max(i5, baseline);
                    i4 = Math.max(i4, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        if (i5 != -1) {
            i6 = Math.max(i6, Math.max(i4, getPaddingBottom()) + i5);
            this.f553a = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i, i3), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i2, i3 << 16));
    }
}
