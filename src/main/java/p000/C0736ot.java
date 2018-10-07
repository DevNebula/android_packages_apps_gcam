package p000;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;

/* compiled from: PG */
/* renamed from: ot */
public final class C0736ot implements C0266hg {
    /* renamed from: A */
    private View f22203A;
    /* renamed from: B */
    private OnActionExpandListener f22204B;
    /* renamed from: C */
    private boolean f22205C = false;
    /* renamed from: a */
    public final int f22206a;
    /* renamed from: b */
    public int f22207b = 4096;
    /* renamed from: c */
    public int f22208c = 4096;
    /* renamed from: d */
    public C0734op f22209d;
    /* renamed from: e */
    public int f22210e = 0;
    /* renamed from: f */
    public C0308jf f22211f;
    /* renamed from: g */
    private final int f22212g;
    /* renamed from: h */
    private final int f22213h;
    /* renamed from: i */
    private final int f22214i;
    /* renamed from: j */
    private CharSequence f22215j;
    /* renamed from: k */
    private CharSequence f22216k;
    /* renamed from: l */
    private Intent f22217l;
    /* renamed from: m */
    private char f22218m;
    /* renamed from: n */
    private char f22219n;
    /* renamed from: o */
    private Drawable f22220o;
    /* renamed from: p */
    private int f22221p = 0;
    /* renamed from: q */
    private C0835pn f22222q;
    /* renamed from: r */
    private OnMenuItemClickListener f22223r;
    /* renamed from: s */
    private CharSequence f22224s;
    /* renamed from: t */
    private CharSequence f22225t;
    /* renamed from: u */
    private ColorStateList f22226u = null;
    /* renamed from: v */
    private Mode f22227v = null;
    /* renamed from: w */
    private boolean f22228w = false;
    /* renamed from: x */
    private boolean f22229x = false;
    /* renamed from: y */
    private boolean f22230y = false;
    /* renamed from: z */
    private int f22231z = 16;

    C0736ot(C0734op c0734op, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f22209d = c0734op;
        this.f22212g = i2;
        this.f22213h = i;
        this.f22214i = i3;
        this.f22206a = i4;
        this.f22215j = charSequence;
        this.f22210e = i5;
    }

    /* renamed from: a */
    public static void m14528a(StringBuilder stringBuilder, int i, int i2, String str) {
        if ((i & i2) == i2) {
            stringBuilder.append(str);
        }
    }

    /* renamed from: a */
    private final Drawable m14526a(Drawable drawable) {
        if (drawable != null && this.f22230y && (this.f22228w || this.f22229x)) {
            drawable = drawable.mutate();
            if (this.f22228w) {
                drawable.setTintList(this.f22226u);
            }
            if (this.f22229x) {
                drawable.setTintMode(this.f22227v);
            }
            this.f22230y = false;
        }
        return drawable;
    }

    public final boolean collapseActionView() {
        if ((this.f22210e & 8) == 0) {
            return false;
        }
        if (this.f22203A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f22204B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f22209d.mo14301a(this);
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!mo14352c()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f22204B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f22209d.mo14315b(this);
        }
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f22203A;
        if (view != null) {
            return view;
        }
        C0308jf c0308jf = this.f22211f;
        if (c0308jf == null) {
            return null;
        }
        this.f22203A = c0308jf.mo9365a((MenuItem) this);
        return this.f22203A;
    }

    public final int getAlphabeticModifiers() {
        return this.f22208c;
    }

    public final char getAlphabeticShortcut() {
        return this.f22219n;
    }

    public final CharSequence getContentDescription() {
        return this.f22224s;
    }

    public final int getGroupId() {
        return this.f22213h;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f22220o;
        if (drawable != null) {
            return m14526a(drawable);
        }
        int i = this.f22221p;
        if (i == 0) {
            return null;
        }
        drawable = C0383nj.m5682b(this.f22209d.f22176a, i);
        this.f22221p = 0;
        this.f22220o = drawable;
        return m14526a(drawable);
    }

    public final ColorStateList getIconTintList() {
        return this.f22226u;
    }

    public final Mode getIconTintMode() {
        return this.f22227v;
    }

    public final Intent getIntent() {
        return this.f22217l;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f22212g;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f22207b;
    }

    public final char getNumericShortcut() {
        return this.f22218m;
    }

    public final int getOrder() {
        return this.f22214i;
    }

    /* renamed from: b */
    public final char mo14349b() {
        return !this.f22209d.mo14324g() ? this.f22218m : this.f22219n;
    }

    public final SubMenu getSubMenu() {
        return this.f22222q;
    }

    /* renamed from: a */
    public final C0308jf mo7845a() {
        return this.f22211f;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f22215j;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22216k;
        if (charSequence == null) {
            return this.f22215j;
        }
        return charSequence;
    }

    /* renamed from: a */
    public final CharSequence mo14346a(C0413ph c0413ph) {
        if (c0413ph == null || !c0413ph.mo10859b()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f22225t;
    }

    /* renamed from: c */
    public final boolean mo14352c() {
        if ((this.f22210e & 8) == 0) {
            return false;
        }
        if (this.f22203A == null) {
            C0308jf c0308jf = this.f22211f;
            if (c0308jf != null) {
                this.f22203A = c0308jf.mo9365a((MenuItem) this);
            }
        }
        if (this.f22203A != null) {
            return true;
        }
        return false;
    }

    public final boolean hasSubMenu() {
        return this.f22222q != null;
    }

    /* renamed from: d */
    public final boolean mo14353d() {
        OnMenuItemClickListener onMenuItemClickListener = this.f22223r;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0734op c0734op = this.f22209d;
        if (c0734op.mo14300a(c0734op, (MenuItem) this)) {
            return true;
        }
        Intent intent = this.f22217l;
        if (intent != null) {
            try {
                this.f22209d.f22176a.startActivity(intent);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0308jf c0308jf = this.f22211f;
        if (c0308jf == null || !c0308jf.mo9371d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo14355e() {
        return (this.f22231z & 32) == 32;
    }

    public final boolean isActionViewExpanded() {
        return this.f22205C;
    }

    public final boolean isCheckable() {
        return this.f22231z & 1;
    }

    public final boolean isChecked() {
        return (this.f22231z & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f22231z & 16) != 0;
    }

    /* renamed from: f */
    public final boolean mo14356f() {
        return (this.f22231z & 4) != 0;
    }

    public final boolean isVisible() {
        C0308jf c0308jf = this.f22211f;
        if (c0308jf == null || !c0308jf.mo9372e()) {
            if ((this.f22231z & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.f22231z & 8) == 0 && this.f22211f.mo9369b()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public final boolean mo14357g() {
        return (this.f22210e & 2) == 2;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* renamed from: a */
    private final C0266hg m14527a(View view) {
        this.f22203A = view;
        this.f22211f = null;
        if (view != null && view.getId() == -1) {
            int i = this.f22212g;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f22209d.mo14328i();
        return this;
    }

    /* renamed from: a */
    public final void mo14348a(boolean z) {
        this.f22205C = z;
        this.f22209d.mo14314b(false);
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f22219n != c) {
            this.f22219n = Character.toLowerCase(c);
            this.f22209d.mo14314b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (!(this.f22219n == c && this.f22208c == i)) {
            this.f22219n = Character.toLowerCase(c);
            this.f22208c = KeyEvent.normalizeMetaState(i);
            this.f22209d.mo14314b(false);
        }
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f22231z;
        this.f22231z = (i & -2) | z;
        if (i != this.f22231z) {
            this.f22209d.mo14314b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f22231z & 4) != 0) {
            C0734op c0734op = this.f22209d;
            int groupId = getGroupId();
            int size = c0734op.f22178c.size();
            c0734op.mo14332l();
            for (int i = 0; i < size; i++) {
                C0736ot c0736ot = (C0736ot) c0734op.f22178c.get(i);
                if (c0736ot.getGroupId() == groupId && c0736ot.mo14356f() && c0736ot.isCheckable()) {
                    boolean z2;
                    if (c0736ot == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0736ot.m14529e(z2);
                }
            }
            c0734op.mo14331k();
        } else {
            m14529e(z);
        }
        return this;
    }

    /* renamed from: e */
    private final void m14529e(boolean z) {
        int i;
        int i2 = this.f22231z;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f22231z = i | i3;
        if (i2 != this.f22231z) {
            this.f22209d.mo14314b(false);
        }
    }

    /* renamed from: a */
    public final C0266hg setContentDescription(CharSequence charSequence) {
        this.f22224s = charSequence;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f22231z |= 16;
        } else {
            this.f22231z &= -17;
        }
        this.f22209d.mo14314b(false);
        return this;
    }

    /* renamed from: b */
    public final void mo14350b(boolean z) {
        int i;
        int i2 = this.f22231z & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f22231z = i | i2;
    }

    public final MenuItem setIcon(int i) {
        this.f22220o = null;
        this.f22221p = i;
        this.f22230y = true;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f22221p = 0;
        this.f22220o = drawable;
        this.f22230y = true;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22226u = colorStateList;
        this.f22228w = true;
        this.f22230y = true;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f22227v = mode;
        this.f22229x = true;
        this.f22230y = true;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f22217l = intent;
        return this;
    }

    /* renamed from: c */
    public final void mo14351c(boolean z) {
        if (z) {
            this.f22231z |= 32;
        } else {
            this.f22231z &= -33;
        }
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f22218m != c) {
            this.f22218m = c;
            this.f22209d.mo14314b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (!(this.f22218m == c && this.f22207b == i)) {
            this.f22218m = c;
            this.f22207b = KeyEvent.normalizeMetaState(i);
            this.f22209d.mo14314b(false);
        }
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f22204B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f22223r = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f22218m = c;
        this.f22219n = Character.toLowerCase(c2);
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f22218m = c;
        this.f22207b = KeyEvent.normalizeMetaState(i);
        this.f22219n = Character.toLowerCase(c2);
        this.f22208c = KeyEvent.normalizeMetaState(i2);
        this.f22209d.mo14314b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f22210e = i;
                this.f22209d.mo14328i();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final void mo14347a(C0835pn c0835pn) {
        this.f22222q = c0835pn;
        c0835pn.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final C0266hg mo7844a(C0308jf c0308jf) {
        C0308jf c0308jf2 = this.f22211f;
        if (c0308jf2 != null) {
            c0308jf2.f8119a = null;
        }
        this.f22203A = null;
        this.f22211f = c0308jf;
        this.f22209d.mo14314b(true);
        c0308jf2 = this.f22211f;
        if (c0308jf2 != null) {
            c0308jf2.mo9367a(new C0309jg(this));
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.f22209d.f22176a.getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22215j = charSequence;
        this.f22209d.mo14314b(false);
        C0835pn c0835pn = this.f22222q;
        if (c0835pn != null) {
            c0835pn.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22216k = charSequence;
        this.f22209d.mo14314b(false);
        return this;
    }

    /* renamed from: b */
    public final C0266hg setTooltipText(CharSequence charSequence) {
        this.f22225t = charSequence;
        this.f22209d.mo14314b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo14354d(z)) {
            this.f22209d.mo14330j();
        }
        return this;
    }

    /* renamed from: d */
    final boolean mo14354d(boolean z) {
        int i;
        int i2 = this.f22231z;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f22231z = i | i3;
        if (i2 != this.f22231z) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo14370h() {
        return this.f22209d.mo14326h() && mo14349b() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.f22215j;
        return charSequence != null ? charSequence.toString() : null;
    }
}
