package android.support.design.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.C0182db;
import p000.C0315jm;

/* compiled from: PG */
public class SnackbarContentLayout extends LinearLayout {
    /* renamed from: a */
    private TextView f555a;
    /* renamed from: b */
    private Button f556b;
    /* renamed from: c */
    private int f557c;
    /* renamed from: d */
    private int f558d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0182db.f3124a);
        this.f557c = obtainStyledAttributes.getDimensionPixelSize(C0182db.f3125b, -1);
        this.f558d = obtainStyledAttributes.getDimensionPixelSize(C0182db.f3127d, -1);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f555a = (TextView) findViewById(R.id.snackbar_text);
        this.f556b = (Button) findViewById(R.id.snackbar_action);
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        if (this.f557c > 0) {
            measuredWidth = getMeasuredWidth();
            i3 = this.f557c;
            if (measuredWidth > i3) {
                i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        i3 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        measuredWidth = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        int lineCount = this.f555a.getLayout().getLineCount();
        if (lineCount <= 1 || this.f558d <= 0 || this.f556b.getMeasuredWidth() <= this.f558d) {
            if (lineCount > 1) {
                measuredWidth = i3;
            }
            if (m399a(0, measuredWidth, measuredWidth)) {
                measuredWidth = 1;
            } else {
                measuredWidth = 0;
            }
        } else if (m399a(1, i3, i3 - measuredWidth)) {
            measuredWidth = 1;
        } else {
            measuredWidth = 0;
        }
        if (measuredWidth != 0) {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m399a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f555a.getPaddingTop() == i2 && this.f555a.getPaddingBottom() == i3) {
            return z;
        }
        View view = this.f555a;
        if (C0315jm.m4651z(view)) {
            C0315jm.m4610a(view, C0315jm.m4639n(view), i2, C0315jm.m4638m(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
        return true;
    }
}
