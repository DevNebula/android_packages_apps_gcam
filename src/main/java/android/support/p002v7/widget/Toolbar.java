package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;
import p000.C0315jm;
import p000.C0360lu;
import p000.C0382ni;
import p000.C0427qh;
import p000.C0440qv;
import p000.C0442qx;
import p000.C0455rn;
import p000.C0462ru;
import p000.C0533vb;
import p000.C0540vk;
import p000.C0541vl;
import p000.C0549vx;
import p000.C0734op;
import p000.C0736ot;
import p000.C0770vn;
import p000.C0771vo;
import p000.C0772vp;
import p000.C0836py;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {
    /* renamed from: A */
    private int f727A;
    /* renamed from: B */
    private int f728B;
    /* renamed from: C */
    private int f729C;
    /* renamed from: D */
    private int f730D;
    /* renamed from: E */
    private int f731E;
    /* renamed from: F */
    private boolean f732F;
    /* renamed from: G */
    private boolean f733G;
    /* renamed from: H */
    private final ArrayList f734H;
    /* renamed from: I */
    private final int[] f735I;
    /* renamed from: J */
    private C0462ru f736J;
    /* renamed from: K */
    private final Runnable f737K;
    /* renamed from: a */
    public ActionMenuView f738a;
    /* renamed from: b */
    public TextView f739b;
    /* renamed from: c */
    public TextView f740c;
    /* renamed from: d */
    public ImageButton f741d;
    /* renamed from: e */
    public Drawable f742e;
    /* renamed from: f */
    public CharSequence f743f;
    /* renamed from: g */
    public ImageButton f744g;
    /* renamed from: h */
    public View f745h;
    /* renamed from: i */
    public Context f746i;
    /* renamed from: j */
    public int f747j;
    /* renamed from: k */
    public int f748k;
    /* renamed from: l */
    public int f749l;
    /* renamed from: m */
    public int f750m;
    /* renamed from: n */
    public C0533vb f751n;
    /* renamed from: o */
    public CharSequence f752o;
    /* renamed from: p */
    public CharSequence f753p;
    /* renamed from: q */
    public final ArrayList f754q;
    /* renamed from: r */
    public C0836py f755r;
    /* renamed from: s */
    public C0770vn f756s;
    /* renamed from: t */
    public boolean f757t;
    /* renamed from: u */
    private ImageView f758u;
    /* renamed from: v */
    private int f759v;
    /* renamed from: w */
    private int f760w;
    /* renamed from: x */
    private int f761x;
    /* renamed from: y */
    private int f762y;
    /* renamed from: z */
    private int f763z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        TextView textView;
        super(context, attributeSet, i);
        this.f729C = 8388627;
        this.f734H = new ArrayList();
        this.f754q = new ArrayList();
        this.f735I = new int[2];
        C0427qh c0427qh = new C0427qh();
        this.f737K = new C0541vl(this);
        C0540vk a = C0540vk.m6109a(getContext(), attributeSet, C0382ni.f9386cc, i, 0);
        this.f748k = a.mo11399g(C0382ni.f9375cB, 0);
        this.f749l = a.mo11399g(C0382ni.f9402cs, 0);
        this.f729C = a.mo11395e(C0382ni.f9387cd, this.f729C);
        this.f750m = a.mo11395e(C0382ni.f9388ce, 48);
        int b = a.mo11389b(C0382ni.f9405cv, 0);
        if (a.mo11398f(C0382ni.f9374cA)) {
            b = a.mo11389b(C0382ni.f9374cA, b);
        }
        this.f763z = b;
        this.f762y = b;
        this.f761x = b;
        this.f760w = b;
        b = a.mo11389b(C0382ni.f9408cy, -1);
        if (b >= 0) {
            this.f760w = b;
        }
        b = a.mo11389b(C0382ni.f9407cx, -1);
        if (b >= 0) {
            this.f761x = b;
        }
        b = a.mo11389b(C0382ni.f9409cz, -1);
        if (b >= 0) {
            this.f762y = b;
        }
        b = a.mo11389b(C0382ni.f9406cw, -1);
        if (b >= 0) {
            this.f763z = b;
        }
        this.f759v = a.mo11391c(C0382ni.f9397cn, -1);
        b = a.mo11389b(C0382ni.f9393cj, kvl.UNSET_ENUM_VALUE);
        int b2 = a.mo11389b(C0382ni.f9391ch, kvl.UNSET_ENUM_VALUE);
        int c = a.mo11391c(7, 0);
        int c2 = a.mo11391c(8, 0);
        mo1200b();
        C0533vb c0533vb = this.f751n;
        c0533vb.f9910h = false;
        if (c != kvl.UNSET_ENUM_VALUE) {
            c0533vb.f9907e = c;
            c0533vb.f9903a = c;
        }
        if (c2 != kvl.UNSET_ENUM_VALUE) {
            c0533vb.f9908f = c2;
            c0533vb.f9904b = c2;
        }
        if (!(b == kvl.UNSET_ENUM_VALUE && b2 == kvl.UNSET_ENUM_VALUE)) {
            c0533vb.mo11380a(b, b2);
        }
        this.f727A = a.mo11389b(C0382ni.f9394ck, kvl.UNSET_ENUM_VALUE);
        this.f728B = a.mo11389b(C0382ni.f9392ci, kvl.UNSET_ENUM_VALUE);
        this.f742e = a.mo11390b(C0382ni.f9390cg);
        this.f743f = a.mo11396e(C0382ni.f9389cf);
        CharSequence e = a.mo11396e(C0382ni.f9404cu);
        if (!TextUtils.isEmpty(e)) {
            mo1204c(e);
        }
        e = a.mo11396e(C0382ni.f9401cr);
        if (!TextUtils.isEmpty(e)) {
            mo1202b(e);
        }
        this.f746i = getContext();
        mo1196a(a.mo11399g(C0382ni.f9400cq, 0));
        Drawable b3 = a.mo11390b(C0382ni.f9399cp);
        if (b3 != null) {
            mo1201b(b3);
        }
        e = a.mo11396e(C0382ni.f9398co);
        if (!TextUtils.isEmpty(e)) {
            mo1199a(e);
        }
        b3 = a.mo11390b(C0382ni.f9395cl);
        if (b3 != null) {
            mo1197a(b3);
        }
        e = a.mo11396e(C0382ni.f9396cm);
        if (!TextUtils.isEmpty(e)) {
            if (!TextUtils.isEmpty(e)) {
                m518j();
            }
            ImageView imageView = this.f758u;
            if (imageView != null) {
                imageView.setContentDescription(e);
            }
        }
        if (a.mo11398f(C0382ni.f9376cC)) {
            b = a.mo11386a(C0382ni.f9376cC, -1);
            this.f730D = b;
            textView = this.f739b;
            if (textView != null) {
                textView.setTextColor(b);
            }
        }
        if (a.mo11398f(C0382ni.f9403ct)) {
            b = a.mo11386a(C0382ni.f9403ct, -1);
            this.f731E = b;
            textView = this.f740c;
            if (textView != null) {
                textView.setTextColor(b);
            }
        }
        a.f9927b.recycle();
    }

    /* renamed from: a */
    private final void m511a(List list, int i) {
        int j = C0315jm.m4635j(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C0315jm.m4635j(this));
        list.clear();
        int i2;
        C0771vo c0771vo;
        if (j == 1) {
            for (i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                c0771vo = (C0771vo) childAt.getLayoutParams();
                if (c0771vo.f22350b == 0 && m517d(childAt) && m512b(c0771vo.f9176a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (i2 = 0; i2 < childCount; i2++) {
            View childAt2 = getChildAt(i2);
            c0771vo = (C0771vo) childAt2.getLayoutParams();
            if (c0771vo.f22350b == 0 && m517d(childAt2) && m512b(c0771vo.f9176a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    final void mo1198a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = Toolbar.m516d();
        } else if (checkLayoutParams(layoutParams)) {
            C0771vo c0771vo = (C0771vo) layoutParams;
        } else {
            layoutParams = Toolbar.m509a(layoutParams);
        }
        layoutParams.f22350b = 1;
        if (!z || this.f745h == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f754q.add(view);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0771vo);
    }

    /* renamed from: a */
    public final void mo1195a() {
        C0736ot c0736ot;
        C0770vn c0770vn = this.f756s;
        if (c0770vn != null) {
            c0736ot = c0770vn.f22347a;
        } else {
            c0736ot = null;
        }
        if (c0736ot != null) {
            c0736ot.collapseActionView();
        }
    }

    /* renamed from: b */
    public final void mo1200b() {
        if (this.f751n == null) {
            this.f751n = new C0533vb();
        }
    }

    /* renamed from: j */
    private final void m518j() {
        if (this.f758u == null) {
            this.f758u = new C0442qx(getContext());
        }
    }

    /* renamed from: c */
    public final void mo1203c() {
        if (this.f741d == null) {
            this.f741d = new C0440qv(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams d = Toolbar.m516d();
            d.f9176a = (this.f750m & 112) | 8388611;
            this.f741d.setLayoutParams(d);
        }
    }

    /* renamed from: d */
    public static C0771vo m516d() {
        return new C0771vo();
    }

    /* renamed from: a */
    private static C0771vo m509a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0771vo) {
            return new C0771vo((C0771vo) layoutParams);
        }
        if (layoutParams instanceof C0360lu) {
            return new C0771vo((C0360lu) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0771vo((MarginLayoutParams) layoutParams);
        }
        return new C0771vo(layoutParams);
    }

    /* renamed from: b */
    private final int m512b(int i) {
        int j = C0315jm.m4635j(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, j) & 7;
        switch (absoluteGravity) {
            case 1:
            case 3:
            case 5:
                return absoluteGravity;
            default:
                return j == 1 ? 5 : 3;
        }
    }

    /* renamed from: a */
    private final int m506a(View view, int i) {
        int i2;
        C0771vo c0771vo = (C0771vo) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = c0771vo.f9176a & 112;
        switch (i3) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i3 = this.f729C & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0771vo.bottomMargin) - i2;
            default:
                int i4;
                i3 = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - i3) - paddingBottom) - measuredHeight) / 2;
                if (i2 < c0771vo.topMargin) {
                    i4 = c0771vo.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - i3;
                    i4 = measuredHeight < c0771vo.bottomMargin ? Math.max(0, i2 - (c0771vo.bottomMargin - measuredHeight)) : i2;
                }
                return i4 + i3;
        }
    }

    /* renamed from: k */
    private final int m519k() {
        C0533vb c0533vb = this.f751n;
        if (c0533vb != null) {
            return !c0533vb.f9909g ? c0533vb.f9904b : c0533vb.f9903a;
        } else {
            return 0;
        }
    }

    /* renamed from: l */
    private final int m520l() {
        C0533vb c0533vb = this.f751n;
        if (c0533vb != null) {
            return !c0533vb.f9909g ? c0533vb.f9903a : c0533vb.f9904b;
        } else {
            return 0;
        }
    }

    /* renamed from: m */
    private final int m521m() {
        int i;
        ActionMenuView actionMenuView = this.f738a;
        if (actionMenuView == null) {
            i = 0;
        } else {
            C0734op c0734op = actionMenuView.f10580a;
            i = c0734op != null ? c0734op.hasVisibleItems() ? 1 : 0 : 0;
        }
        if (i != 0) {
            return Math.max(m519k(), Math.max(this.f728B, 0));
        }
        return m519k();
    }

    /* renamed from: n */
    private final int m522n() {
        if (mo1207f() != null) {
            return Math.max(m520l(), Math.max(this.f727A, 0));
        }
        return m520l();
    }

    /* renamed from: a */
    private static int m505a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: e */
    public final CharSequence mo1206e() {
        ImageButton imageButton = this.f741d;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    /* renamed from: f */
    public final Drawable mo1207f() {
        ImageButton imageButton = this.f741d;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    /* renamed from: b */
    private static int m513b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    /* renamed from: g */
    public final C0462ru mo1208g() {
        if (this.f736J == null) {
            this.f736J = new C0462ru(this);
        }
        return this.f736J;
    }

    /* renamed from: c */
    private final boolean m515c(View view) {
        return view.getParent() == this || this.f754q.contains(view);
    }

    /* renamed from: h */
    public final boolean mo1212h() {
        ActionMenuView actionMenuView = this.f738a;
        if (actionMenuView != null) {
            boolean z;
            C0836py c0836py = actionMenuView.f10582c;
            if (c0836py == null) {
                z = false;
            } else if (c0836py.mo15283e()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final int m508a(View view, int i, int[] iArr, int i2) {
        C0771vo c0771vo = (C0771vo) view.getLayoutParams();
        int i3 = c0771vo.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = m506a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (c0771vo.rightMargin + measuredWidth) + max;
    }

    /* renamed from: b */
    private final int m514b(View view, int i, int[] iArr, int i2) {
        C0771vo c0771vo = (C0771vo) view.getLayoutParams();
        int i3 = c0771vo.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = m506a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (c0771vo.leftMargin + measuredWidth);
    }

    /* renamed from: a */
    private final int m507a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(Toolbar.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), Toolbar.getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private final void m510a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = Toolbar.getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = Toolbar.getChildMeasureSpec(i3, ((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f737K);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f733G = false;
        }
        if (!this.f733G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f733G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f733G = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int obj2;
        int min;
        int i5;
        int m;
        int n;
        C0771vo c0771vo;
        int measuredHeight;
        C0771vo c0771vo2;
        int i6;
        if (C0315jm.m4635j(this) != 1) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = width - paddingRight;
        int[] iArr = this.f735I;
        iArr[1] = 0;
        iArr[0] = 0;
        int k = C0315jm.m4636k(this);
        if (k >= 0) {
            min = Math.min(k, i4 - i2);
        } else {
            min = 0;
        }
        if (!m517d(this.f741d)) {
            k = paddingLeft;
            i5 = i7;
        } else if (obj2 != null) {
            i5 = m514b(this.f741d, i7, iArr, min);
            k = paddingLeft;
        } else {
            k = m508a(this.f741d, paddingLeft, iArr, min);
            i5 = i7;
        }
        if (m517d(this.f744g)) {
            if (obj2 != null) {
                i5 = m514b(this.f744g, i5, iArr, min);
            } else {
                k = m508a(this.f744g, k, iArr, min);
            }
        }
        if (m517d(this.f738a)) {
            if (obj2 != null) {
                k = m508a(this.f738a, k, iArr, min);
            } else {
                i5 = m514b(this.f738a, i5, iArr, min);
            }
        }
        if (C0315jm.m4635j(this) == 1) {
            m = m521m();
        } else {
            m = m522n();
        }
        if (C0315jm.m4635j(this) == 1) {
            n = m522n();
        } else {
            n = m521m();
        }
        iArr[0] = Math.max(0, m - k);
        iArr[1] = Math.max(0, n - (i7 - i5));
        k = Math.max(k, m);
        i5 = Math.min(i5, i7 - n);
        if (m517d(this.f745h)) {
            if (obj2 != null) {
                i5 = m514b(this.f745h, i5, iArr, min);
            } else {
                k = m508a(this.f745h, k, iArr, min);
            }
        }
        if (!m517d(this.f758u)) {
            i7 = k;
            m = i5;
        } else if (obj2 != null) {
            i7 = k;
            m = m514b(this.f758u, i5, iArr, min);
        } else {
            i7 = m508a(this.f758u, k, iArr, min);
            m = i5;
        }
        boolean d = m517d(this.f739b);
        boolean d2 = m517d(this.f740c);
        if (d) {
            c0771vo = (C0771vo) this.f739b.getLayoutParams();
            i5 = (c0771vo.topMargin + this.f739b.getMeasuredHeight()) + c0771vo.bottomMargin;
        } else {
            i5 = 0;
        }
        if (d2) {
            c0771vo = (C0771vo) this.f740c.getLayoutParams();
            measuredHeight = (c0771vo.bottomMargin + (c0771vo.topMargin + this.f740c.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (d || d2) {
            View view;
            View view2;
            Object obj3;
            if (d) {
                view = this.f739b;
            } else {
                view = this.f740c;
            }
            if (d2) {
                view2 = this.f740c;
            } else {
                view2 = this.f739b;
            }
            c0771vo = (C0771vo) view.getLayoutParams();
            c0771vo2 = (C0771vo) view2.getLayoutParams();
            if (d && this.f739b.getMeasuredWidth() > 0) {
                obj3 = 1;
            } else if (!d2) {
                obj3 = null;
            } else if (this.f740c.getMeasuredWidth() <= 0) {
                obj3 = null;
            } else {
                obj3 = 1;
            }
            switch (this.f729C & 112) {
                case 48:
                    i5 = this.f762y + (c0771vo.topMargin + getPaddingTop());
                    break;
                case 80:
                    i5 = (((height - paddingBottom) - c0771vo2.bottomMargin) - this.f763z) - measuredHeight;
                    break;
                default:
                    i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                    int i8 = c0771vo.topMargin;
                    int i9 = this.f762y;
                    if (i6 < i8 + i9) {
                        k = c0771vo.topMargin + i9;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
                        k = c0771vo.bottomMargin;
                        height = this.f763z;
                        k = measuredHeight < k + height ? Math.max(0, i6 - ((c0771vo2.bottomMargin + height) - measuredHeight)) : i6;
                    }
                    i5 = paddingTop + k;
                    break;
            }
            if (obj2 != null) {
                if (obj3 != null) {
                    k = this.f760w;
                } else {
                    k = 0;
                }
                k -= iArr[1];
                m -= Math.max(0, k);
                iArr[1] = Math.max(0, -k);
                if (d) {
                    c0771vo = (C0771vo) this.f739b.getLayoutParams();
                    obj2 = m - this.f739b.getMeasuredWidth();
                    i6 = this.f739b.getMeasuredHeight() + i5;
                    this.f739b.layout(obj2, i5, m, i6);
                    obj2 -= this.f761x;
                    i5 = c0771vo.bottomMargin + i6;
                } else {
                    obj2 = m;
                }
                if (d2) {
                    c0771vo = (C0771vo) this.f740c.getLayoutParams();
                    i5 += c0771vo.topMargin;
                    this.f740c.layout(m - this.f740c.getMeasuredWidth(), i5, m, this.f740c.getMeasuredHeight() + i5);
                    i5 = m - this.f761x;
                    k = c0771vo.bottomMargin;
                    k = i5;
                } else {
                    k = m;
                }
                if (obj3 != null) {
                    m = Math.min(obj2, k);
                }
            } else {
                if (obj3 != null) {
                    k = this.f760w;
                } else {
                    k = 0;
                }
                k -= iArr[0];
                i7 += Math.max(0, k);
                iArr[0] = Math.max(0, -k);
                if (d) {
                    c0771vo = (C0771vo) this.f739b.getLayoutParams();
                    obj2 = this.f739b.getMeasuredWidth() + i7;
                    i6 = this.f739b.getMeasuredHeight() + i5;
                    this.f739b.layout(i7, i5, obj2, i6);
                    obj2 = this.f761x + obj2;
                    i5 = c0771vo.bottomMargin + i6;
                } else {
                    obj2 = i7;
                }
                if (d2) {
                    c0771vo = (C0771vo) this.f740c.getLayoutParams();
                    i5 += c0771vo.topMargin;
                    i6 = this.f740c.getMeasuredWidth() + i7;
                    this.f740c.layout(i7, i5, i6, this.f740c.getMeasuredHeight() + i5);
                    i5 = this.f761x + i6;
                    k = c0771vo.bottomMargin;
                    k = i5;
                } else {
                    k = i7;
                }
                if (obj3 != null) {
                    i7 = Math.max(obj2, k);
                }
            }
        }
        m511a(this.f734H, 3);
        n = this.f734H.size();
        obj2 = i7;
        for (i5 = 0; i5 < n; i5++) {
            obj2 = m508a((View) this.f734H.get(i5), obj2, iArr, min);
        }
        m511a(this.f734H, 5);
        i7 = this.f734H.size();
        i5 = 0;
        measuredHeight = m;
        while (i5 < i7) {
            m = m514b((View) this.f734H.get(i5), measuredHeight, iArr, min);
            i5++;
            measuredHeight = m;
        }
        m511a(this.f734H, 1);
        List list = this.f734H;
        i7 = iArr[0];
        m = iArr[1];
        paddingTop = list.size();
        n = i7;
        i6 = m;
        i7 = 0;
        m = 0;
        while (i7 < paddingTop) {
            View view3 = (View) list.get(i7);
            c0771vo2 = (C0771vo) view3.getLayoutParams();
            n = c0771vo2.leftMargin - n;
            i5 = c0771vo2.rightMargin - i6;
            paddingBottom = Math.max(0, n);
            int max = Math.max(0, i5);
            n = Math.max(0, -n);
            i6 = Math.max(0, -i5);
            i7++;
            m += (view3.getMeasuredWidth() + paddingBottom) + max;
        }
        k = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (m / 2);
        i5 = k + m;
        if (k < obj2) {
            k = obj2;
        } else if (i5 > measuredHeight) {
            k -= i5 - measuredHeight;
        }
        paddingLeft = this.f734H.size();
        obj2 = k;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            obj2 = m508a((View) this.f734H.get(i5), obj2, iArr, min);
        }
        this.f734H.clear();
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int i3;
        int[] iArr = this.f735I;
        boolean a = C0549vx.m6138a(this);
        int i4 = a ^ 1;
        if (m517d(this.f741d)) {
            m510a(this.f741d, i, 0, i2, this.f759v);
            measuredWidth = this.f741d.getMeasuredWidth() + Toolbar.m505a(this.f741d);
            max = Math.max(0, this.f741d.getMeasuredHeight() + Toolbar.m513b(this.f741d));
            combineMeasuredStates = View.combineMeasuredStates(0, this.f741d.getMeasuredState());
            i3 = max;
        } else {
            measuredWidth = 0;
            combineMeasuredStates = 0;
            i3 = 0;
        }
        if (m517d(this.f744g)) {
            m510a(this.f744g, i, 0, i2, this.f759v);
            measuredWidth = this.f744g.getMeasuredWidth() + Toolbar.m505a(this.f744g);
            i3 = Math.max(i3, this.f744g.getMeasuredHeight() + Toolbar.m513b(this.f744g));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f744g.getMeasuredState());
        }
        int n = m522n();
        int max2 = Math.max(n, measuredWidth);
        iArr[a] = Math.max(0, n - measuredWidth);
        if (m517d(this.f738a)) {
            m510a(this.f738a, i, max2, i2, this.f759v);
            measuredWidth = this.f738a.getMeasuredWidth() + Toolbar.m505a(this.f738a);
            i3 = Math.max(i3, this.f738a.getMeasuredHeight() + Toolbar.m513b(this.f738a));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f738a.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        n = m521m();
        max2 += Math.max(n, measuredWidth);
        iArr[i4] = Math.max(0, n - measuredWidth);
        if (m517d(this.f745h)) {
            max2 += m507a(this.f745h, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f745h.getMeasuredHeight() + Toolbar.m513b(this.f745h));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f745h.getMeasuredState());
        }
        if (m517d(this.f758u)) {
            max2 += m507a(this.f758u, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f758u.getMeasuredHeight() + Toolbar.m513b(this.f758u));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f758u.getMeasuredState());
        }
        int childCount = getChildCount();
        int i5 = combineMeasuredStates;
        int i6 = i3;
        combineMeasuredStates = 0;
        while (combineMeasuredStates < childCount) {
            View childAt = getChildAt(combineMeasuredStates);
            if (((C0771vo) childAt.getLayoutParams()).f22350b != 0) {
                measuredWidth = i5;
                n = i6;
            } else if (m517d(childAt)) {
                max2 += m507a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i6, childAt.getMeasuredHeight() + Toolbar.m513b(childAt));
                measuredWidth = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                n = max;
            } else {
                measuredWidth = i5;
                n = i6;
            }
            combineMeasuredStates++;
            i5 = measuredWidth;
            i6 = n;
        }
        int i7 = this.f762y + this.f763z;
        max = this.f760w + this.f761x;
        if (m517d(this.f739b)) {
            m507a(this.f739b, i, max2 + max, i2, i7, iArr);
            n = Toolbar.m505a(this.f739b) + this.f739b.getMeasuredWidth();
            measuredWidth = this.f739b.getMeasuredHeight() + Toolbar.m513b(this.f739b);
            i5 = View.combineMeasuredStates(i5, this.f739b.getMeasuredState());
        } else {
            n = 0;
            measuredWidth = 0;
        }
        if (m517d(this.f740c)) {
            n = Math.max(n, m507a(this.f740c, i, max2 + max, i2, i7 + measuredWidth, iArr));
            measuredWidth += this.f740c.getMeasuredHeight() + Toolbar.m513b(this.f740c);
            i5 = View.combineMeasuredStates(i5, this.f740c.getMeasuredState());
        }
        measuredWidth = Math.max(i6, measuredWidth);
        max = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max((n + max2) + (max + paddingRight), getSuggestedMinimumWidth()), i, -16777216 & i5), View.resolveSizeAndState(Math.max(measuredWidth + (paddingTop + paddingBottom), getSuggestedMinimumHeight()), i2, i5 << 16));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0772vp) {
            Menu menu;
            C0772vp c0772vp = (C0772vp) parcelable;
            super.onRestoreInstanceState(c0772vp.f7997e);
            ActionMenuView actionMenuView = this.f738a;
            if (actionMenuView == null) {
                menu = null;
            } else {
                menu = actionMenuView.f10580a;
            }
            int i = c0772vp.f22351a;
            if (!(i == 0 || this.f756s == null || menu == null)) {
                MenuItem findItem = menu.findItem(i);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (c0772vp.f22352b) {
                removeCallbacks(this.f737K);
                post(this.f737K);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        super.onRtlPropertiesChanged(i);
        mo1200b();
        C0533vb c0533vb = this.f751n;
        if (i != 1) {
            z = false;
        }
        if (z != c0533vb.f9909g) {
            c0533vb.f9909g = z;
            int i2;
            if (!c0533vb.f9910h) {
                c0533vb.f9903a = c0533vb.f9907e;
                c0533vb.f9904b = c0533vb.f9908f;
            } else if (z) {
                i2 = c0533vb.f9906d;
                if (i2 == kvl.UNSET_ENUM_VALUE) {
                    i2 = c0533vb.f9907e;
                }
                c0533vb.f9903a = i2;
                i2 = c0533vb.f9905c;
                if (i2 == kvl.UNSET_ENUM_VALUE) {
                    i2 = c0533vb.f9908f;
                }
                c0533vb.f9904b = i2;
            } else {
                i2 = c0533vb.f9905c;
                if (i2 == kvl.UNSET_ENUM_VALUE) {
                    i2 = c0533vb.f9907e;
                }
                c0533vb.f9903a = i2;
                i2 = c0533vb.f9906d;
                if (i2 == kvl.UNSET_ENUM_VALUE) {
                    i2 = c0533vb.f9908f;
                }
                c0533vb.f9904b = i2;
            }
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0772vp = new C0772vp(super.onSaveInstanceState());
        C0770vn c0770vn = this.f756s;
        if (c0770vn != null) {
            C0736ot c0736ot = c0770vn.f22347a;
            if (c0736ot != null) {
                c0772vp.f22351a = c0736ot.getItemId();
            }
        }
        c0772vp.f22352b = mo1212h();
        return c0772vp;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f732F = false;
        }
        if (!this.f732F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f732F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f732F = false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1197a(Drawable drawable) {
        if (drawable != null) {
            m518j();
            if (!m515c(this.f758u)) {
                mo1198a(this.f758u, true);
            }
        } else {
            View view = this.f758u;
            if (view != null && m515c(view)) {
                removeView(this.f758u);
                this.f754q.remove(this.f758u);
            }
        }
        ImageView imageView = this.f758u;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo1199a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1203c();
        }
        ImageButton imageButton = this.f741d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo1201b(Drawable drawable) {
        if (drawable != null) {
            mo1203c();
            if (!m515c(this.f741d)) {
                mo1198a(this.f741d, true);
            }
        } else {
            View view = this.f741d;
            if (view != null && m515c(view)) {
                removeView(this.f741d);
                this.f754q.remove(this.f741d);
            }
        }
        ImageButton imageButton = this.f741d;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo1196a(int i) {
        if (this.f747j != i) {
            this.f747j = i;
            if (i == 0) {
                this.f746i = getContext();
            } else {
                this.f746i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: b */
    public final void mo1202b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.f740c;
            if (view != null && m515c(view)) {
                removeView(this.f740c);
                this.f754q.remove(this.f740c);
            }
        } else {
            if (this.f740c == null) {
                Context context = getContext();
                this.f740c = new C0455rn(context);
                this.f740c.setSingleLine();
                this.f740c.setEllipsize(TruncateAt.END);
                int i = this.f749l;
                if (i != 0) {
                    this.f740c.setTextAppearance(context, i);
                }
                int i2 = this.f731E;
                if (i2 != 0) {
                    this.f740c.setTextColor(i2);
                }
            }
            if (!m515c(this.f740c)) {
                mo1198a(this.f740c, true);
            }
        }
        TextView textView = this.f740c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f753p = charSequence;
    }

    /* renamed from: c */
    public final void mo1204c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            View view = this.f739b;
            if (view != null && m515c(view)) {
                removeView(this.f739b);
                this.f754q.remove(this.f739b);
            }
        } else {
            if (this.f739b == null) {
                Context context = getContext();
                this.f739b = new C0455rn(context);
                this.f739b.setSingleLine();
                this.f739b.setEllipsize(TruncateAt.END);
                int i = this.f748k;
                if (i != 0) {
                    this.f739b.setTextAppearance(context, i);
                }
                int i2 = this.f730D;
                if (i2 != 0) {
                    this.f739b.setTextColor(i2);
                }
            }
            if (!m515c(this.f739b)) {
                mo1198a(this.f739b, true);
            }
        }
        TextView textView = this.f739b;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f752o = charSequence;
    }

    /* renamed from: d */
    private final boolean m517d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: i */
    public final boolean mo1213i() {
        ActionMenuView actionMenuView = this.f738a;
        if (actionMenuView != null) {
            boolean z;
            C0836py c0836py = actionMenuView.f10582c;
            if (c0836py == null) {
                z = false;
            } else if (c0836py.mo15284f()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
