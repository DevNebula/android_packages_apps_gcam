package android.support.p002v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.C0315jm;
import p000.C0382ni;
import p000.C0387nn;
import p000.C0417pp;
import p000.C0419ps;
import p000.C0540vk;
import p000.C0549vx;
import p000.C0734op;
import p000.C0836py;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0417pp {
    /* renamed from: f */
    public CharSequence f10541f;
    /* renamed from: g */
    public CharSequence f10542g;
    /* renamed from: h */
    public View f10543h;
    /* renamed from: i */
    public boolean f10544i;
    /* renamed from: j */
    private View f10545j;
    /* renamed from: k */
    private LinearLayout f10546k;
    /* renamed from: l */
    private TextView f10547l;
    /* renamed from: m */
    private TextView f10548m;
    /* renamed from: n */
    private int f10549n;
    /* renamed from: o */
    private int f10550o;
    /* renamed from: p */
    private int f10551p;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0540vk a = C0540vk.m6109a(context, attributeSet, C0382ni.f9430x, i, 0);
        C0315jm.m4614a((View) this, a.mo11390b(C0382ni.f9431y));
        this.f10549n = a.mo11399g(C0382ni.f9243C, 0);
        this.f10550o = a.mo11399g(C0382ni.f9242B, 0);
        this.f9538d = a.mo11397f(C0382ni.f9241A, 0);
        this.f10551p = a.mo11399g(C0382ni.f9432z, R.layout.abc_action_mode_close_item_material);
        a.f9927b.recycle();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final void mo12097a(C0387nn c0387nn) {
        View view = this.f10543h;
        if (view == null) {
            this.f10543h = LayoutInflater.from(getContext()).inflate(this.f10551p, this, false);
            addView(this.f10543h);
        } else if (view.getParent() == null) {
            addView(this.f10543h);
        }
        this.f10543h.findViewById(R.id.action_mode_close_button).setOnClickListener(new C0419ps(c0387nn));
        C0734op c0734op = (C0734op) c0387nn.mo10745d();
        if (this.f9537c != null) {
            this.f9537c.mo15280b();
        }
        this.f9537c = new C0836py(getContext());
        C0836py c0836py = this.f9537c;
        c0836py.f25436g = true;
        c0836py.f25437h = true;
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        c0734op.mo14297a(this.f9537c, this.f9535a);
        this.f9536b = (ActionMenuView) this.f9537c.mo14284a((ViewGroup) this);
        C0315jm.m4614a(this.f9536b, null);
        addView(this.f9536b, layoutParams);
    }

    /* renamed from: c */
    private final void m6848c() {
        int i;
        int i2 = 0;
        if (this.f10546k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.f10546k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10547l = (TextView) this.f10546k.findViewById(R.id.action_bar_title);
            this.f10548m = (TextView) this.f10546k.findViewById(R.id.action_bar_subtitle);
            if (this.f10549n != 0) {
                this.f10547l.setTextAppearance(getContext(), this.f10549n);
            }
            if (this.f10550o != 0) {
                this.f10548m.setTextAppearance(getContext(), this.f10550o);
            }
        }
        this.f10547l.setText(this.f10541f);
        this.f10548m.setText(this.f10542g);
        int isEmpty = TextUtils.isEmpty(this.f10541f) ^ 1;
        boolean isEmpty2 = TextUtils.isEmpty(this.f10542g);
        int i3 = isEmpty2 ^ 1;
        TextView textView = this.f10548m;
        if (isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f10546k;
        if (isEmpty == 0 && i3 == 0) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.f10546k.getParent() == null) {
            addView(this.f10546k);
        }
    }

    /* renamed from: b */
    public final void mo12099b() {
        removeAllViews();
        this.f10545j = null;
        this.f9536b = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9537c != null) {
            this.f9537c.mo15281c();
            this.f9537c.mo15282d();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f10541f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingRight;
        int i5;
        boolean a = C0549vx.m6138a(this);
        if (a) {
            paddingRight = (i3 - i) - getPaddingRight();
        } else {
            paddingRight = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f10543h;
        if (view == null) {
            i5 = paddingRight;
        } else if (view.getVisibility() != 8) {
            int i6;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10543h.getLayoutParams();
            if (a) {
                i6 = marginLayoutParams.rightMargin;
            } else {
                i6 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.rightMargin;
            }
            paddingRight = C0417pp.m5753a(paddingRight, i6, a);
            i5 = C0417pp.m5753a(paddingRight + C0417pp.m5755a(this.f10543h, paddingRight, paddingTop, paddingTop2, a), i5, a);
        } else {
            i5 = paddingRight;
        }
        LinearLayout linearLayout = this.f10546k;
        if (!(linearLayout == null || this.f10545j != null || linearLayout.getVisibility() == 8)) {
            i5 += C0417pp.m5755a(this.f10546k, i5, paddingTop, paddingTop2, a);
        }
        View view2 = this.f10545j;
        if (view2 != null) {
            C0417pp.m5755a(view2, i5, paddingTop, paddingTop2, a);
        }
        if (a) {
            i5 = getPaddingLeft();
        } else {
            i5 = (i3 - i) - getPaddingRight();
        }
        if (this.f9536b != null) {
            C0417pp.m5755a(this.f9536b, i5, paddingTop, paddingTop2, a ^ 1);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        StringBuilder stringBuilder;
        if (MeasureSpec.getMode(i) != 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (MeasureSpec.getMode(i2) == 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            int i4;
            int a;
            int size = MeasureSpec.getSize(i);
            if (this.f9538d > 0) {
                i4 = this.f9538d;
            } else {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, kvl.UNSET_ENUM_VALUE);
            View view = this.f10543h;
            if (view != null) {
                a = C0417pp.m5754a(view, paddingLeft, makeMeasureSpec);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10543h.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.f9536b == null) {
                a = paddingLeft;
            } else if (this.f9536b.getParent() == this) {
                a = C0417pp.m5754a(this.f9536b, paddingLeft, makeMeasureSpec);
            } else {
                a = paddingLeft;
            }
            View view2 = this.f10546k;
            if (view2 != null && this.f10545j == null) {
                if (this.f10544i) {
                    this.f10546k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.f10546k.getMeasuredWidth();
                    if (makeMeasureSpec <= a) {
                        paddingLeft = a - makeMeasureSpec;
                    } else {
                        paddingLeft = a;
                    }
                    LinearLayout linearLayout = this.f10546k;
                    if (makeMeasureSpec <= a) {
                        a = 0;
                    } else {
                        a = 8;
                    }
                    linearLayout.setVisibility(a);
                    a = paddingLeft;
                } else {
                    a = C0417pp.m5754a(view2, a, makeMeasureSpec);
                }
            }
            view2 = this.f10545j;
            if (view2 != null) {
                int min;
                LayoutParams layoutParams = view2.getLayoutParams();
                makeMeasureSpec = layoutParams.width != -2 ? 1073741824 : kvl.UNSET_ENUM_VALUE;
                if (layoutParams.width >= 0) {
                    min = Math.min(layoutParams.width, a);
                } else {
                    min = a;
                }
                paddingLeft = layoutParams.height != -2 ? 1073741824 : kvl.UNSET_ENUM_VALUE;
                if (layoutParams.height >= 0) {
                    a = Math.min(layoutParams.height, i5);
                } else {
                    a = i5;
                }
                this.f10545j.measure(MeasureSpec.makeMeasureSpec(min, makeMeasureSpec), MeasureSpec.makeMeasureSpec(a, paddingLeft));
            }
            if (this.f9538d <= 0) {
                a = getChildCount();
                i4 = 0;
                while (i3 < a) {
                    paddingLeft = getChildAt(i3).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= i4) {
                        paddingLeft = i4;
                    }
                    i3++;
                    i4 = paddingLeft;
                }
                setMeasuredDimension(size, i4);
                return;
            }
            setMeasuredDimension(size, i4);
        }
    }

    /* renamed from: a */
    public final void mo10868a(int i) {
        this.f9538d = i;
    }

    /* renamed from: a */
    public final void mo12095a(View view) {
        View view2 = this.f10545j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f10545j = view;
        if (view != null) {
            view2 = this.f10546k;
            if (view2 != null) {
                removeView(view2);
                this.f10546k = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void mo12096a(CharSequence charSequence) {
        this.f10542g = charSequence;
        m6848c();
    }

    /* renamed from: b */
    public final void mo12100b(CharSequence charSequence) {
        this.f10541f = charSequence;
        m6848c();
    }

    /* renamed from: a */
    public final void mo12098a(boolean z) {
        if (z != this.f10544i) {
            requestLayout();
        }
        this.f10544i = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo10869a() {
        return this.f9537c != null ? this.f9537c.mo15284f() : false;
    }
}
