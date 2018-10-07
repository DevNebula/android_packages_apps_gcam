package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import p000.C0375mt;
import p000.C0460rs;
import p000.C0461rt;
import p000.C0713mg;
import p000.C0734op;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ContentFrameLayout */
public class ContentFrameLayout extends FrameLayout {
    /* renamed from: a */
    public TypedValue f648a;
    /* renamed from: b */
    public TypedValue f649b;
    /* renamed from: c */
    public TypedValue f650c;
    /* renamed from: d */
    public TypedValue f651d;
    /* renamed from: e */
    public TypedValue f652e;
    /* renamed from: f */
    public TypedValue f653f;
    /* renamed from: g */
    public final Rect f654g;
    /* renamed from: h */
    public C0460rs f655h;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f654g = new Rect();
    }

    /* renamed from: a */
    public final void mo1107a(Rect rect) {
        fitSystemWindows(rect);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0460rs c0460rs = this.f655h;
        if (c0460rs != null) {
            C0713mg c0713mg = c0460rs.f9653a;
            C0461rt c0461rt = c0713mg.f22062e;
            if (c0461rt != null) {
                c0461rt.mo11056b();
            }
            if (c0713mg.f22065h != null) {
                c0713mg.f22060c.getDecorView().removeCallbacks(c0713mg.f22066i);
                if (c0713mg.f22065h.isShowing()) {
                    try {
                        c0713mg.f22065h.dismiss();
                    } catch (IllegalArgumentException e) {
                    }
                }
                c0713mg.f22065h = null;
            }
            c0713mg.mo14224l();
            C0375mt e2 = c0713mg.mo14222e(0);
            if (e2 != null) {
                C0734op c0734op = e2.f9209h;
                if (c0734op != null) {
                    c0734op.close();
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        TypedValue typedValue;
        Object obj;
        int dimension;
        Rect rect;
        Object obj2 = null;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f650c;
            } else {
                typedValue = this.f651d;
            }
            if (typedValue == null) {
                obj = null;
            } else if (typedValue.type != 0) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    rect = this.f654g;
                    i = MeasureSpec.makeMeasureSpec(Math.min(dimension - (rect.right + rect.left), MeasureSpec.getSize(i)), 1073741824);
                    obj = 1;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (mode2 == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f653f;
            } else {
                typedValue = this.f652e;
            }
            if (!(typedValue == null || typedValue.type == 0)) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    Rect rect2 = this.f654g;
                    i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (rect2.bottom + rect2.top), MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        mode2 = MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (obj != null) {
            dimension = mode2;
        } else if (mode == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f648a;
            } else {
                typedValue = this.f649b;
            }
            if (typedValue == null) {
                dimension = mode2;
            } else if (typedValue.type != 0) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    rect = this.f654g;
                    dimension -= rect.right + rect.left;
                }
                if (measuredWidth < dimension) {
                    dimension = MeasureSpec.makeMeasureSpec(dimension, 1073741824);
                    obj2 = 1;
                } else {
                    dimension = mode2;
                }
            } else {
                dimension = mode2;
            }
        } else {
            dimension = mode2;
        }
        if (obj2 != null) {
            super.onMeasure(dimension, i2);
        }
    }
}
