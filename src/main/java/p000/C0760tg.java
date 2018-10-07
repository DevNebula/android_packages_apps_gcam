package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: tg */
public class C0760tg implements C0414pj {
    /* renamed from: a */
    private static Method f22307a;
    /* renamed from: b */
    private static Method f22308b;
    /* renamed from: c */
    private static Method f22309c;
    /* renamed from: A */
    private final C0495tj f22310A;
    /* renamed from: B */
    private final Rect f22311B;
    /* renamed from: d */
    private Context f22312d;
    /* renamed from: e */
    public C0475sh f22313e;
    /* renamed from: f */
    public int f22314f;
    /* renamed from: g */
    public int f22315g;
    /* renamed from: h */
    public boolean f22316h;
    /* renamed from: i */
    public boolean f22317i;
    /* renamed from: j */
    public int f22318j;
    /* renamed from: k */
    public int f22319k;
    /* renamed from: l */
    public View f22320l;
    /* renamed from: m */
    public OnItemClickListener f22321m;
    /* renamed from: n */
    public final C0499tn f22322n;
    /* renamed from: o */
    public final Handler f22323o;
    /* renamed from: p */
    public Rect f22324p;
    /* renamed from: q */
    public boolean f22325q;
    /* renamed from: r */
    public PopupWindow f22326r;
    /* renamed from: s */
    private ListAdapter f22327s;
    /* renamed from: t */
    private int f22328t;
    /* renamed from: u */
    private int f22329u;
    /* renamed from: v */
    private int f22330v;
    /* renamed from: w */
    private boolean f22331w;
    /* renamed from: x */
    private DataSetObserver f22332x;
    /* renamed from: y */
    private final C0498tm f22333y;
    /* renamed from: z */
    private final C0497tl f22334z;

    static {
        try {
            f22307a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f22308b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f22309c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0760tg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0760tg(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f22328t = -2;
        this.f22314f = -2;
        this.f22330v = 1002;
        this.f22318j = 0;
        this.f22319k = LfuScheduler.MAX_PRIORITY;
        this.f22322n = new C0499tn(this);
        this.f22333y = new C0498tm(this);
        this.f22334z = new C0497tl(this);
        this.f22310A = new C0495tj(this);
        this.f22311B = new Rect();
        this.f22312d = context;
        this.f22323o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9288aU, i, i2);
        this.f22315g = obtainStyledAttributes.getDimensionPixelOffset(C0382ni.f9289aV, 0);
        this.f22329u = obtainStyledAttributes.getDimensionPixelOffset(C0382ni.f9290aW, 0);
        if (this.f22329u != 0) {
            this.f22331w = true;
        }
        obtainStyledAttributes.recycle();
        this.f22326r = new C0444qz(context, attributeSet, i, i2);
        this.f22326r.setInputMethodMode(1);
    }

    /* renamed from: b */
    public final void mo14431b() {
        C0475sh c0475sh = this.f22313e;
        if (c0475sh != null) {
            c0475sh.f9709a = true;
            c0475sh.requestLayout();
        }
    }

    /* renamed from: a */
    C0475sh mo14426a(Context context, boolean z) {
        return new C0475sh(context, z);
    }

    /* renamed from: c */
    public final void mo10860c() {
        this.f22326r.dismiss();
        this.f22326r.setContentView(null);
        this.f22313e = null;
        this.f22323o.removeCallbacks(this.f22322n);
    }

    /* renamed from: d */
    public final ListView mo10861d() {
        return this.f22313e;
    }

    /* renamed from: a */
    private final int m14666a(View view, int i, boolean z) {
        if (f22308b != null) {
            try {
                return ((Integer) f22308b.invoke(this.f22326r, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f22326r.getMaxAvailableHeight(view, i);
    }

    /* renamed from: g */
    public final int mo14433g() {
        if (this.f22331w) {
            return this.f22329u;
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo14434h() {
        return this.f22326r.getInputMethodMode() == 2;
    }

    /* renamed from: e */
    public final boolean mo10862e() {
        return this.f22326r.isShowing();
    }

    /* renamed from: a */
    public void mo14429a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f22332x;
        if (dataSetObserver == null) {
            this.f22332x = new C0496tk(this);
        } else {
            ListAdapter listAdapter2 = this.f22327s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22327s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f22332x);
        }
        C0475sh c0475sh = this.f22313e;
        if (c0475sh != null) {
            c0475sh.setAdapter(this.f22327s);
        }
    }

    /* renamed from: a */
    public final void mo14428a(Drawable drawable) {
        this.f22326r.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo14427a(int i) {
        Drawable background = this.f22326r.getBackground();
        if (background != null) {
            background.getPadding(this.f22311B);
            Rect rect = this.f22311B;
            this.f22314f = (rect.right + rect.left) + i;
            return;
        }
        this.f22314f = i;
    }

    /* renamed from: i */
    public final void mo14435i() {
        this.f22326r.setInputMethodMode(2);
    }

    /* renamed from: j */
    public final void mo14436j() {
        this.f22325q = true;
        this.f22326r.setFocusable(true);
    }

    /* renamed from: a */
    public final void mo14430a(OnDismissListener onDismissListener) {
        this.f22326r.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    public final void mo14432b(int i) {
        this.f22329u = i;
        this.f22331w = true;
    }

    /* renamed from: f */
    public void m17118a() {
        Rect rect;
        int i;
        int i2;
        boolean z;
        int makeMeasureSpec;
        int i3 = 0;
        if (this.f22313e == null) {
            Context context = this.f22312d;
            C0493th c0493th = new C0493th(this);
            this.f22313e = mo14426a(context, this.f22325q ^ 1);
            this.f22313e.setAdapter(this.f22327s);
            this.f22313e.setOnItemClickListener(this.f22321m);
            this.f22313e.setFocusable(true);
            this.f22313e.setFocusableInTouchMode(true);
            this.f22313e.setOnItemSelectedListener(new C0494ti(this));
            this.f22313e.setOnScrollListener(this.f22334z);
            this.f22326r.setContentView(this.f22313e);
        } else {
            this.f22326r.getContentView();
        }
        Drawable background = this.f22326r.getBackground();
        if (background != null) {
            background.getPadding(this.f22311B);
            rect = this.f22311B;
            i = rect.top + rect.bottom;
            if (this.f22331w) {
                i2 = i;
            } else {
                this.f22329u = -rect.top;
                i2 = i;
            }
        } else {
            this.f22311B.setEmpty();
            i2 = 0;
        }
        if (this.f22326r.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m14666a(this.f22320l, this.f22329u, z);
        if (this.f22328t == -1) {
            i = a + i2;
        } else {
            i = this.f22314f;
            switch (i) {
                case -2:
                    i = this.f22312d.getResources().getDisplayMetrics().widthPixels;
                    rect = this.f22311B;
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i - (rect.right + rect.left), kvl.UNSET_ENUM_VALUE);
                    break;
                case -1:
                    i = this.f22312d.getResources().getDisplayMetrics().widthPixels;
                    rect = this.f22311B;
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i - (rect.right + rect.left), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, 1073741824);
                    break;
            }
            makeMeasureSpec = this.f22313e.mo11086a(makeMeasureSpec, 0, -1, a, -1);
            if (makeMeasureSpec > 0) {
                i = (this.f22313e.getPaddingTop() + this.f22313e.getPaddingBottom()) + i2;
            } else {
                i = 0;
            }
            i += makeMeasureSpec;
        }
        boolean h = mo14434h();
        this.f22326r.setWindowLayoutType(this.f22330v);
        if (!this.f22326r.isShowing()) {
            makeMeasureSpec = this.f22314f;
            if (makeMeasureSpec == -1) {
                makeMeasureSpec = -1;
            } else if (makeMeasureSpec == -2) {
                makeMeasureSpec = this.f22320l.getWidth();
            }
            i3 = this.f22328t;
            if (i3 == -1) {
                i = -1;
            } else if (i3 != -2) {
                i = i3;
            }
            this.f22326r.setWidth(makeMeasureSpec);
            this.f22326r.setHeight(i);
            if (f22307a != null) {
                try {
                    f22307a.invoke(this.f22326r, new Object[]{Boolean.valueOf(true)});
                } catch (Exception e) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
            this.f22326r.setOutsideTouchable(true);
            this.f22326r.setTouchInterceptor(this.f22333y);
            if (this.f22317i) {
                this.f22326r.setOverlapAnchor(this.f22316h);
            }
            if (f22309c != null) {
                try {
                    f22309c.invoke(this.f22326r, new Object[]{this.f22324p});
                } catch (Throwable e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
            this.f22326r.showAsDropDown(this.f22320l, this.f22315g, this.f22329u, this.f22318j);
            this.f22313e.setSelection(-1);
            if (!this.f22325q || this.f22313e.isInTouchMode()) {
                mo14431b();
            }
            if (!this.f22325q) {
                this.f22323o.post(this.f22310A);
            }
        } else if (C0315jm.m4648w(this.f22320l)) {
            PopupWindow popupWindow;
            makeMeasureSpec = this.f22314f;
            a = makeMeasureSpec != -1 ? makeMeasureSpec != -2 ? makeMeasureSpec : this.f22320l.getWidth() : -1;
            int i4 = this.f22328t;
            if (i4 == -1) {
                if (h) {
                    i4 = i;
                } else {
                    i4 = -1;
                }
                if (h) {
                    PopupWindow popupWindow2 = this.f22326r;
                    if (this.f22314f == -1) {
                        i = -1;
                    } else {
                        i = 0;
                    }
                    popupWindow2.setWidth(i);
                    this.f22326r.setHeight(0);
                } else {
                    popupWindow = this.f22326r;
                    if (this.f22314f == -1) {
                        i3 = -1;
                    }
                    popupWindow.setWidth(i3);
                    this.f22326r.setHeight(-1);
                }
            } else if (i4 == -2) {
                i4 = i;
            }
            this.f22326r.setOutsideTouchable(true);
            popupWindow = this.f22326r;
            View view = this.f22320l;
            i3 = this.f22315g;
            int i5 = this.f22329u;
            if (a < 0) {
                a = -1;
            }
            if (i4 < 0) {
                i4 = -1;
            }
            popupWindow.update(view, i3, i5, a, i4);
        }
    }
}
