package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p002v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pp */
public class C0417pp extends ViewGroup {
    /* renamed from: a */
    public final Context f9535a;
    /* renamed from: b */
    public ActionMenuView f9536b;
    /* renamed from: c */
    public C0836py f9537c;
    /* renamed from: d */
    public int f9538d;
    /* renamed from: e */
    public C0328kd f9539e;
    /* renamed from: f */
    private final C0742pq f9540f;
    /* renamed from: g */
    private boolean f9541g;
    /* renamed from: h */
    private boolean f9542h;

    C0417pp(Context context) {
        this(context, null);
    }

    C0417pp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0417pp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9540f = new C0742pq(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f9535a = context;
        } else {
            this.f9535a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    public static int m5754a(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(i, kvl.UNSET_ENUM_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: a */
    public static int m5753a(int i, int i2, boolean z) {
        return !z ? i + i2 : i - i2;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0382ni.f9267a, R.attr.actionBarStyle, 0);
        mo10868a(obtainStyledAttributes.getLayoutDimension(C0382ni.f9418l, 0));
        obtainStyledAttributes.recycle();
        C0836py c0836py = this.f9537c;
        if (c0836py != null) {
            c0836py.f25438i = C0386nm.m5683a(c0836py.f22157b).mo10735a();
            if (c0836py.f22158c != null) {
                c0836py.f22158c.mo14314b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9542h = false;
        }
        if (!this.f9542h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9542h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9542h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9541g = false;
        }
        if (!this.f9541g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9541g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9541g = false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m5755a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public void mo10868a(int i) {
        this.f9538d = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0328kd c0328kd = this.f9539e;
            if (c0328kd != null) {
                c0328kd.mo9762a();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final C0328kd mo10867a(int i, long j) {
        C0328kd c0328kd = this.f9539e;
        if (c0328kd != null) {
            c0328kd.mo9762a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            c0328kd = C0315jm.m4606a(this).mo9758a(1.0f);
            c0328kd.mo9759a(j);
            c0328kd.mo9760a(this.f9540f.mo14408a(c0328kd, i));
            return c0328kd;
        }
        c0328kd = C0315jm.m4606a(this).mo9758a(0.0f);
        c0328kd.mo9759a(j);
        c0328kd.mo9760a(this.f9540f.mo14408a(c0328kd, i));
        return c0328kd;
    }

    /* renamed from: a */
    public boolean mo10869a() {
        C0836py c0836py = this.f9537c;
        return c0836py != null ? c0836py.mo15284f() : false;
    }
}
