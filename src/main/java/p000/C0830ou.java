package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ou */
public class C0830ou extends C0731oe implements MenuItem {
    /* renamed from: e */
    public Method f25409e;

    C0830ou(Context context, C0266hg c0266hg) {
        super(context, c0266hg);
    }

    public boolean collapseActionView() {
        return ((C0266hg) this.f9502d).collapseActionView();
    }

    /* renamed from: a */
    C0737ov mo15190a(ActionProvider actionProvider) {
        return new C0737ov(this, actionProvider);
    }

    public boolean expandActionView() {
        return ((C0266hg) this.f9502d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0308jf a = ((C0266hg) this.f9502d).mo7845a();
        return a instanceof C0737ov ? ((C0737ov) a).f22232b : null;
    }

    public View getActionView() {
        View actionView = ((C0266hg) this.f9502d).getActionView();
        if (actionView instanceof C0738ow) {
            return (View) ((C0738ow) actionView).f22234a;
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0266hg) this.f9502d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0266hg) this.f9502d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0266hg) this.f9502d).getContentDescription();
    }

    public int getGroupId() {
        return ((C0266hg) this.f9502d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0266hg) this.f9502d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0266hg) this.f9502d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0266hg) this.f9502d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0266hg) this.f9502d).getIntent();
    }

    public int getItemId() {
        return ((C0266hg) this.f9502d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0266hg) this.f9502d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0266hg) this.f9502d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0266hg) this.f9502d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0266hg) this.f9502d).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo14289a(((C0266hg) this.f9502d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0266hg) this.f9502d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0266hg) this.f9502d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0266hg) this.f9502d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0266hg) this.f9502d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0266hg) this.f9502d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0266hg) this.f9502d).isCheckable();
    }

    public boolean isChecked() {
        return ((C0266hg) this.f9502d).isChecked();
    }

    public boolean isEnabled() {
        return ((C0266hg) this.f9502d).isEnabled();
    }

    public boolean isVisible() {
        return ((C0266hg) this.f9502d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0308jf c0308jf;
        C0266hg c0266hg = (C0266hg) this.f9502d;
        if (actionProvider == null) {
            c0308jf = null;
        } else {
            c0308jf = mo15190a(actionProvider);
        }
        c0266hg.mo7844a(c0308jf);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0266hg) this.f9502d).setActionView(i);
        View actionView = ((C0266hg) this.f9502d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0266hg) this.f9502d).setActionView(new C0738ow(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0738ow(view);
        }
        ((C0266hg) this.f9502d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0266hg) this.f9502d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0266hg) this.f9502d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0266hg) this.f9502d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0266hg) this.f9502d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0266hg) this.f9502d).mo7843a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0266hg) this.f9502d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0266hg) this.f9502d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0266hg) this.f9502d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0266hg) this.f9502d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0266hg) this.f9502d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0266hg) this.f9502d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0266hg) this.f9502d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0266hg) this.f9502d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        OnActionExpandListener c0739ox;
        C0266hg c0266hg = (C0266hg) this.f9502d;
        if (onActionExpandListener != null) {
            c0739ox = new C0739ox(this, onActionExpandListener);
        } else {
            c0739ox = null;
        }
        c0266hg.setOnActionExpandListener(c0739ox);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        OnMenuItemClickListener c0740oy;
        C0266hg c0266hg = (C0266hg) this.f9502d;
        if (onMenuItemClickListener != null) {
            c0740oy = new C0740oy(this, onMenuItemClickListener);
        } else {
            c0740oy = null;
        }
        c0266hg.setOnMenuItemClickListener(c0740oy);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0266hg) this.f9502d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0266hg) this.f9502d).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0266hg) this.f9502d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0266hg) this.f9502d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0266hg) this.f9502d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0266hg) this.f9502d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0266hg) this.f9502d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0266hg) this.f9502d).mo7846b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0266hg) this.f9502d).setVisible(z);
    }
}
