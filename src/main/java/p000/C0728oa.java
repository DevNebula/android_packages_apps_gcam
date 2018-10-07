package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p001v4.app.ActionBarDrawerToggle;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: oa */
public final class C0728oa implements C0266hg {
    /* renamed from: a */
    private final int f22138a;
    /* renamed from: b */
    private CharSequence f22139b;
    /* renamed from: c */
    private CharSequence f22140c;
    /* renamed from: d */
    private Intent f22141d;
    /* renamed from: e */
    private char f22142e;
    /* renamed from: f */
    private int f22143f = 4096;
    /* renamed from: g */
    private char f22144g;
    /* renamed from: h */
    private int f22145h = 4096;
    /* renamed from: i */
    private Drawable f22146i;
    /* renamed from: j */
    private Context f22147j;
    /* renamed from: k */
    private CharSequence f22148k;
    /* renamed from: l */
    private CharSequence f22149l;
    /* renamed from: m */
    private ColorStateList f22150m = null;
    /* renamed from: n */
    private Mode f22151n = null;
    /* renamed from: o */
    private boolean f22152o = false;
    /* renamed from: p */
    private boolean f22153p = false;
    /* renamed from: q */
    private int f22154q = 16;

    public C0728oa(Context context, CharSequence charSequence) {
        this.f22147j = context;
        this.f22138a = ActionBarDrawerToggle.ID_HOME;
        this.f22139b = charSequence;
    }

    /* renamed from: b */
    private final void m14462b() {
        Drawable drawable = this.f22146i;
        if (drawable == null) {
            return;
        }
        if (this.f22152o || this.f22153p) {
            this.f22146i = drawable;
            this.f22146i = this.f22146i.mutate();
            if (this.f22152o) {
                this.f22146i.setTintList(this.f22150m);
            }
            if (this.f22153p) {
                this.f22146i.setTintMode(this.f22151n);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f22145h;
    }

    public final char getAlphabeticShortcut() {
        return this.f22144g;
    }

    public final CharSequence getContentDescription() {
        return this.f22148k;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f22146i;
    }

    public final ColorStateList getIconTintList() {
        return this.f22150m;
    }

    public final Mode getIconTintMode() {
        return this.f22151n;
    }

    public final Intent getIntent() {
        return this.f22141d;
    }

    public final int getItemId() {
        return this.f22138a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f22143f;
    }

    public final char getNumericShortcut() {
        return this.f22142e;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    /* renamed from: a */
    public final C0308jf mo7845a() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f22139b;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22140c;
        return charSequence == null ? this.f22139b : charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.f22149l;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return this.f22154q & 1;
    }

    public final boolean isChecked() {
        return (this.f22154q & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f22154q & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f22154q & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f22144g = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f22144g = Character.toLowerCase(c);
        this.f22145h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f22154q = (this.f22154q & -2) | z;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f22154q & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f22154q = i | i2;
        return this;
    }

    /* renamed from: a */
    public final C0266hg mo7843a(CharSequence charSequence) {
        this.f22148k = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f22148k = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f22154q & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f22154q = i | i2;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f22146i = C0242ge.getDrawable(this.f22147j, i);
        m14462b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f22146i = drawable;
        m14462b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22150m = colorStateList;
        this.f22152o = true;
        m14462b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f22151n = mode;
        this.f22153p = true;
        m14462b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f22141d = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f22142e = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f22142e = c;
        this.f22143f = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f22142e = c;
        this.f22144g = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f22142e = c;
        this.f22143f = KeyEvent.normalizeMetaState(i);
        this.f22144g = Character.toLowerCase(c2);
        this.f22145h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final C0266hg mo7844a(C0308jf c0308jf) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setTitle(int i) {
        this.f22139b = this.f22147j.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22139b = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22140c = charSequence;
        return this;
    }

    /* renamed from: b */
    public final C0266hg mo7846b(CharSequence charSequence) {
        this.f22149l = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f22149l = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f22154q & 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f22154q = i | i2;
        return this;
    }
}
