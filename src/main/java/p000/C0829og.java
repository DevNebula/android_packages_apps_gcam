package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: og */
final class C0829og extends C0741pb implements OnKeyListener, OnDismissListener, C0410pe {
    /* renamed from: h */
    private static final int f25382h = R.layout.abc_cascading_menu_item_layout;
    /* renamed from: A */
    private C0411pf f25383A;
    /* renamed from: B */
    private OnDismissListener f25384B;
    /* renamed from: a */
    public final Handler f25385a;
    /* renamed from: b */
    public final List f25386b = new ArrayList();
    /* renamed from: c */
    public final OnGlobalLayoutListener f25387c = new C0400oh(this);
    /* renamed from: d */
    public View f25388d;
    /* renamed from: e */
    public ViewTreeObserver f25389e;
    /* renamed from: f */
    public boolean f25390f;
    /* renamed from: i */
    private final Context f25391i;
    /* renamed from: j */
    private final int f25392j;
    /* renamed from: k */
    private final int f25393k;
    /* renamed from: l */
    private final int f25394l;
    /* renamed from: m */
    private final boolean f25395m;
    /* renamed from: n */
    private final List f25396n = new ArrayList();
    /* renamed from: o */
    private final OnAttachStateChangeListener f25397o = new C0401oi(this);
    /* renamed from: p */
    private final C0500to f25398p = new C0732oj(this);
    /* renamed from: q */
    private int f25399q = 0;
    /* renamed from: r */
    private int f25400r = 0;
    /* renamed from: s */
    private View f25401s;
    /* renamed from: t */
    private int f25402t;
    /* renamed from: u */
    private boolean f25403u;
    /* renamed from: v */
    private boolean f25404v;
    /* renamed from: w */
    private int f25405w;
    /* renamed from: x */
    private int f25406x;
    /* renamed from: y */
    private boolean f25407y;
    /* renamed from: z */
    private boolean f25408z;

    public C0829og(Context context, View view, int i, int i2, boolean z) {
        this.f25391i = context;
        this.f25401s = view;
        this.f25393k = i;
        this.f25394l = i2;
        this.f25395m = z;
        this.f25407y = false;
        this.f25402t = m17051g();
        Resources resources = context.getResources();
        this.f25392j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f25385a = new Handler();
    }

    /* renamed from: a */
    public final void mo14401a(C0734op c0734op) {
        c0734op.mo14297a((C0410pe) this, this.f25391i);
        if (mo10862e()) {
            m17050c(c0734op);
        } else {
            this.f25396n.add(c0734op);
        }
    }

    /* renamed from: b */
    protected final boolean mo14404b() {
        return false;
    }

    /* renamed from: c */
    public final void mo10860c() {
        int size = this.f25386b.size();
        if (size > 0) {
            C0403ol[] c0403olArr = (C0403ol[]) this.f25386b.toArray(new C0403ol[size]);
            for (size--; size >= 0; size--) {
                C0403ol c0403ol = c0403olArr[size];
                if (c0403ol.f9509a.f22326r.isShowing()) {
                    c0403ol.f9509a.mo10860c();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10850a() {
        return false;
    }

    /* renamed from: g */
    private final int m17051g() {
        if (C0315jm.m4635j(this.f25401s) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    public final ListView mo10861d() {
        if (this.f25386b.isEmpty()) {
            return null;
        }
        List list = this.f25386b;
        return ((C0403ol) list.get(list.size() - 1)).f9509a.f22313e;
    }

    /* renamed from: e */
    public final boolean mo10862e() {
        return this.f25386b.size() > 0 && ((C0403ol) this.f25386b.get(0)).f9509a.f22326r.isShowing();
    }

    /* renamed from: a */
    public final void mo10847a(C0734op c0734op, boolean z) {
        int size = this.f25386b.size();
        int i = 0;
        while (i < size) {
            if (c0734op == ((C0403ol) this.f25386b.get(i)).f9510b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f25386b.size()) {
                ((C0403ol) this.f25386b.get(i2)).f9510b.mo14298a(false);
            }
            C0403ol c0403ol = (C0403ol) this.f25386b.remove(i);
            c0403ol.f9510b.mo14313b((C0410pe) this);
            if (this.f25390f) {
                c0403ol.f9509a.f22326r.setExitTransition(null);
                c0403ol.f9509a.f22326r.setAnimationStyle(0);
            }
            c0403ol.f9509a.mo10860c();
            i = this.f25386b.size();
            if (i > 0) {
                this.f25402t = ((C0403ol) this.f25386b.get(i - 1)).f9511c;
            } else {
                this.f25402t = m17051g();
            }
            if (i == 0) {
                mo10860c();
                C0411pf c0411pf = this.f25383A;
                if (c0411pf != null) {
                    c0411pf.mo10854a(c0734op, true);
                }
                ViewTreeObserver viewTreeObserver = this.f25389e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f25389e.removeGlobalOnLayoutListener(this.f25387c);
                    }
                    this.f25389e = null;
                }
                this.f25388d.removeOnAttachStateChangeListener(this.f25397o);
                this.f25384B.onDismiss();
            } else if (z) {
                ((C0403ol) this.f25386b.get(0)).f9510b.mo14298a(false);
            }
        }
    }

    public final void onDismiss() {
        C0403ol c0403ol;
        int size = this.f25386b.size();
        for (int i = 0; i < size; i++) {
            c0403ol = (C0403ol) this.f25386b.get(i);
            if (!c0403ol.f9509a.f22326r.isShowing()) {
                break;
            }
        }
        c0403ol = null;
        if (c0403ol != null) {
            c0403ol.f9510b.mo14298a(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo10860c();
        return true;
    }

    /* renamed from: a */
    public final boolean mo10852a(C0835pn c0835pn) {
        for (C0403ol c0403ol : this.f25386b) {
            if (c0835pn == c0403ol.f9510b) {
                c0403ol.f9509a.f22313e.requestFocus();
                return true;
            }
        }
        if (!c0835pn.hasVisibleItems()) {
            return false;
        }
        mo14401a((C0734op) c0835pn);
        C0411pf c0411pf = this.f25383A;
        if (c0411pf != null) {
            c0411pf.mo10855a(c0835pn);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo14399a(View view) {
        if (this.f25401s != view) {
            this.f25401s = view;
            this.f25400r = Gravity.getAbsoluteGravity(this.f25399q, C0315jm.m4635j(this.f25401s));
        }
    }

    /* renamed from: a */
    public final void mo10848a(C0411pf c0411pf) {
        this.f25383A = c0411pf;
    }

    /* renamed from: b */
    public final void mo14403b(boolean z) {
        this.f25407y = z;
    }

    /* renamed from: a */
    public final void mo14398a(int i) {
        if (this.f25399q != i) {
            this.f25399q = i;
            this.f25400r = Gravity.getAbsoluteGravity(i, C0315jm.m4635j(this.f25401s));
        }
    }

    /* renamed from: b */
    public final void mo14402b(int i) {
        this.f25403u = true;
        this.f25405w = i;
    }

    /* renamed from: a */
    public final void mo14400a(OnDismissListener onDismissListener) {
        this.f25384B = onDismissListener;
    }

    /* renamed from: c */
    public final void mo14406c(boolean z) {
        this.f25408z = z;
    }

    /* renamed from: c */
    public final void mo14405c(int i) {
        this.f25404v = true;
        this.f25406x = i;
    }

    /* renamed from: f */
    public final void mo10863f() {
        if (!mo10862e()) {
            for (C0734op c : this.f25396n) {
                m17050c(c);
            }
            this.f25396n.clear();
            this.f25388d = this.f25401s;
            View view = this.f25388d;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.f25389e;
                this.f25389e = view.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    this.f25389e.addOnGlobalLayoutListener(this.f25387c);
                }
                this.f25388d.addOnAttachStateChangeListener(this.f25397o);
            }
        }
    }

    /* renamed from: c */
    private final void m17050c(C0734op c0734op) {
        List list;
        View view;
        C0403ol c0403ol;
        LayoutInflater from = LayoutInflater.from(this.f25391i);
        ListAdapter c0405oo = new C0405oo(c0734op, from, this.f25395m, f25382h);
        if (!mo10862e() && this.f25407y) {
            c0405oo.f9515b = true;
        } else if (mo10862e()) {
            c0405oo.f9515b = C0741pb.m14555b(c0734op);
        }
        int a = C0741pb.m14553a(c0405oo, null, this.f25391i, this.f25392j);
        C0760tg c0841tp = new C0841tp(this.f25391i, this.f25393k, this.f25394l);
        c0841tp.f25475b = this.f25398p;
        c0841tp.f22321m = this;
        c0841tp.mo14430a((OnDismissListener) this);
        c0841tp.f22320l = this.f25401s;
        c0841tp.f22318j = this.f25400r;
        c0841tp.mo14436j();
        c0841tp.mo14435i();
        c0841tp.mo14429a(c0405oo);
        c0841tp.mo14427a(a);
        c0841tp.f22318j = this.f25400r;
        if (this.f25386b.size() > 0) {
            int i;
            MenuItem menuItem;
            list = this.f25386b;
            C0403ol c0403ol2 = (C0403ol) list.get(list.size() - 1);
            C0734op c0734op2 = c0403ol2.f9510b;
            int size = c0734op2.size();
            for (i = 0; i < size; i++) {
                MenuItem item = c0734op2.getItem(i);
                if (item.hasSubMenu() && c0734op == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view = null;
            } else {
                C0405oo c0405oo2;
                int i2;
                ListView listView = c0403ol2.f9509a.f22313e;
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0405oo2 = (C0405oo) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0405oo2 = (C0405oo) adapter;
                    i = 0;
                }
                int count = c0405oo2.getCount();
                for (size = 0; size < count; size++) {
                    if (menuItem == c0405oo2.getItem(size)) {
                        i2 = size;
                        break;
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                    i2 = (i2 + i) - listView.getFirstVisiblePosition();
                    view = i2 >= 0 ? i2 < listView.getChildCount() ? listView.getChildAt(i2) : null : null;
                } else {
                    view = null;
                }
            }
            c0403ol = c0403ol2;
        } else {
            view = null;
            c0403ol = null;
        }
        if (view == null) {
            if (this.f25403u) {
                c0841tp.f22315g = this.f25405w;
            }
            if (this.f25404v) {
                c0841tp.mo14432b(this.f25406x);
            }
            c0841tp.f22324p = this.f22237g;
        } else {
            int i3;
            if (C0841tp.f25474a != null) {
                try {
                    C0841tp.f25474a.invoke(c0841tp.f22326r, new Object[]{Boolean.valueOf(false)});
                } catch (Exception e) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
            c0841tp.f22326r.setEnterTransition(null);
            list = this.f25386b;
            ListView listView2 = ((C0403ol) list.get(list.size() - 1)).f9509a.f22313e;
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f25388d.getWindowVisibleDisplayFrame(rect);
            if (this.f25402t == 1) {
                if ((listView2.getWidth() + iArr[0]) + a <= rect.right) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            } else if (iArr[0] - a < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f25402t = i3;
            c0841tp.f22320l = view;
            if ((this.f25400r & 5) == 5) {
                if (i3 != 0) {
                    i3 = a;
                } else {
                    i3 = -view.getWidth();
                }
            } else if (i3 != 0) {
                i3 = view.getWidth();
            } else {
                i3 = -a;
            }
            c0841tp.f22315g = i3;
            c0841tp.f22317i = true;
            c0841tp.f22316h = true;
            c0841tp.mo14432b(0);
        }
        this.f25386b.add(new C0403ol(c0841tp, c0734op, this.f25402t));
        c0841tp.m17118a();
        ViewGroup viewGroup = c0841tp.f22313e;
        viewGroup.setOnKeyListener(this);
        if (c0403ol == null && this.f25408z && c0734op.f22181f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, viewGroup, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c0734op.f22181f);
            viewGroup.addHeaderView(frameLayout, null, false);
            c0841tp.m17118a();
        }
    }

    /* renamed from: a */
    public final void mo10849a(boolean z) {
        for (C0403ol c0403ol : this.f25386b) {
            C0741pb.m14554a(c0403ol.f9509a.f22313e.getAdapter()).notifyDataSetChanged();
        }
    }
}
