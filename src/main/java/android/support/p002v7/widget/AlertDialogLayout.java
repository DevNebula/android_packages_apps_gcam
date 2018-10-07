package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import p000.C0315jm;
import p000.C0486sy;
import p000.C0487sz;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends C0486sy {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        i5 = getMeasuredHeight();
        int childCount = getChildCount();
        int i6 = this.f9749e;
        int i7 = i6 & 8388615;
        switch (i6 & 112) {
            case 16:
                i5 = (((i4 - i2) - i5) / 2) + getPaddingTop();
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - i5;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        Drawable drawable = this.f9750f;
        if (drawable != null) {
            i6 = drawable.getIntrinsicHeight();
        } else {
            i6 = 0;
        }
        int i8 = i5;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C0487sz c0487sz = (C0487sz) childAt.getLayoutParams();
                int i10 = c0487sz.f9761h;
                if (i10 < 0) {
                    i10 = i7;
                }
                switch (Gravity.getAbsoluteGravity(i10, C0315jm.m4635j(this)) & 7) {
                    case 1:
                        i10 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + c0487sz.leftMargin) - c0487sz.rightMargin;
                        break;
                    case 5:
                        i10 = (paddingRight - measuredWidth) - c0487sz.rightMargin;
                        break;
                    default:
                        i10 = c0487sz.leftMargin + paddingLeft;
                        break;
                }
                if (mo11120b(i9)) {
                    i8 += i6;
                }
                i8 += c0487sz.topMargin;
                childAt.layout(i10, i8, measuredWidth + i10, i8 + measuredHeight);
                i8 += c0487sz.bottomMargin + measuredHeight;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        View childAt;
        int id;
        Object obj;
        int k;
        int i3;
        int combineMeasuredStates;
        int i4;
        int i5;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        int i6 = 0;
        View view3 = null;
        while (i6 < childCount) {
            childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                childAt = view;
                view = view2;
            } else {
                id = childAt.getId();
                if (id == R.id.topPanel) {
                    view3 = childAt;
                    childAt = view;
                    view = view2;
                } else if (id != R.id.buttonPanel) {
                    if (id == R.id.contentPanel || id == R.id.customPanel) {
                        if (view2 != null) {
                            obj = null;
                            break;
                        }
                        View view4 = view;
                        view = childAt;
                        childAt = view4;
                    } else {
                        obj = null;
                        break;
                    }
                } else {
                    view = view2;
                }
            }
            i6++;
            view2 = view;
            view = childAt;
        }
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i);
        i6 = getPaddingBottom() + getPaddingTop();
        if (view3 != null) {
            view3.measure(i, 0);
            i6 += view3.getMeasuredHeight();
            id = View.combineMeasuredStates(0, view3.getMeasuredState());
        } else {
            id = 0;
        }
        if (view != null) {
            view.measure(i, 0);
            view3 = view;
            while (true) {
                k = C0315jm.m4636k(view3);
                if (k <= 0) {
                    if (!(view3 instanceof ViewGroup)) {
                        i3 = 0;
                        break;
                    }
                    ViewGroup viewGroup = (ViewGroup) view3;
                    if (viewGroup.getChildCount() != 1) {
                        i3 = 0;
                        break;
                    }
                    view3 = viewGroup.getChildAt(0);
                } else {
                    i3 = k;
                    break;
                }
            }
            k = view.getMeasuredHeight() - i3;
            i6 += i3;
            combineMeasuredStates = View.combineMeasuredStates(id, view.getMeasuredState());
            id = i6;
            i6 = k;
            k = i3;
        } else {
            k = 0;
            combineMeasuredStates = id;
            id = i6;
            i6 = 0;
        }
        if (view2 != null) {
            if (mode != 0) {
                i3 = MeasureSpec.makeMeasureSpec(Math.max(0, size - id), mode);
            } else {
                i3 = 0;
            }
            view2.measure(i, i3);
            i3 = view2.getMeasuredHeight();
            id += i3;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
            i4 = i3;
        } else {
            i4 = 0;
        }
        i3 = size - id;
        if (view != null) {
            id -= k;
            i6 = Math.min(i3, i6);
            if (i6 > 0) {
                i3 -= i6;
                k += i6;
            }
            view.measure(i, MeasureSpec.makeMeasureSpec(k, 1073741824));
            int i7 = i3;
            i3 = view.getMeasuredHeight() + id;
            k = View.combineMeasuredStates(combineMeasuredStates, view.getMeasuredState());
            i5 = i7;
        } else {
            i5 = i3;
            k = combineMeasuredStates;
            i3 = id;
        }
        if (view2 != null && i5 > 0) {
            view2.measure(i, MeasureSpec.makeMeasureSpec(i5 + i4, mode));
            i3 = (i3 - i4) + view2.getMeasuredHeight();
            k = View.combineMeasuredStates(k, view2.getMeasuredState());
        }
        i5 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                i5 = Math.max(i5, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i5 + (getPaddingLeft() + getPaddingRight()), i, k), View.resolveSizeAndState(i3, i2, 0));
        if (mode2 != 1073741824) {
            i5 = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (i4 = 0; i4 < childCount; i4++) {
                childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8) {
                    C0487sz c0487sz = (C0487sz) childAt.getLayoutParams();
                    if (c0487sz.width == -1) {
                        mode = c0487sz.height;
                        c0487sz.height = childAt.getMeasuredHeight();
                        measureChildWithMargins(childAt, i5, 0, i2, 0);
                        c0487sz.height = mode;
                    }
                }
            }
            obj = 1;
        } else {
            obj = 1;
        }
        if (obj == null) {
            super.onMeasure(i, i2);
        }
    }
}
