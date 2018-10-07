package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* renamed from: nw */
final class C0394nw {
    /* renamed from: A */
    public C0308jf f9460A;
    /* renamed from: B */
    public CharSequence f9461B;
    /* renamed from: C */
    public CharSequence f9462C;
    /* renamed from: D */
    public ColorStateList f9463D = null;
    /* renamed from: E */
    public Mode f9464E = null;
    /* renamed from: F */
    public final /* synthetic */ C0392nu f9465F;
    /* renamed from: a */
    public Menu f9466a;
    /* renamed from: b */
    public int f9467b;
    /* renamed from: c */
    public int f9468c;
    /* renamed from: d */
    public int f9469d;
    /* renamed from: e */
    public int f9470e;
    /* renamed from: f */
    public boolean f9471f;
    /* renamed from: g */
    public boolean f9472g;
    /* renamed from: h */
    public boolean f9473h;
    /* renamed from: i */
    public int f9474i;
    /* renamed from: j */
    public int f9475j;
    /* renamed from: k */
    public CharSequence f9476k;
    /* renamed from: l */
    public CharSequence f9477l;
    /* renamed from: m */
    public int f9478m;
    /* renamed from: n */
    public char f9479n;
    /* renamed from: o */
    public int f9480o;
    /* renamed from: p */
    public char f9481p;
    /* renamed from: q */
    public int f9482q;
    /* renamed from: r */
    public int f9483r;
    /* renamed from: s */
    public boolean f9484s;
    /* renamed from: t */
    public boolean f9485t;
    /* renamed from: u */
    public boolean f9486u;
    /* renamed from: v */
    public int f9487v;
    /* renamed from: w */
    public int f9488w;
    /* renamed from: x */
    public String f9489x;
    /* renamed from: y */
    public String f9490y;
    /* renamed from: z */
    public String f9491z;

    public C0394nw(C0392nu c0392nu, Menu menu) {
        this.f9465F = c0392nu;
        this.f9466a = menu;
        mo10784b();
    }

    /* renamed from: a */
    public final SubMenu mo10781a() {
        this.f9473h = true;
        SubMenu addSubMenu = this.f9466a.addSubMenu(this.f9467b, this.f9474i, this.f9475j, this.f9476k);
        mo10783a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: a */
    static char m5709a(String str) {
        if (str == null) {
            return 0;
        }
        return str.charAt(0);
    }

    /* renamed from: a */
    final Object mo10782a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = this.f9465F.f9454c.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot instantiate class: ");
            stringBuilder.append(str);
            Log.w("SupportMenuInflater", stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo10784b() {
        this.f9467b = 0;
        this.f9468c = 0;
        this.f9469d = 0;
        this.f9470e = 0;
        this.f9471f = true;
        this.f9472g = true;
    }

    /* renamed from: a */
    final void mo10783a(MenuItem menuItem) {
        boolean z;
        boolean z2 = true;
        MenuItem enabled = menuItem.setChecked(this.f9484s).setVisible(this.f9485t).setEnabled(this.f9486u);
        if (this.f9483r > 0) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.f9477l).setIcon(this.f9478m);
        int i = this.f9487v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f9491z != null) {
            if (this.f9465F.f9454c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            C0392nu c0392nu = this.f9465F;
            if (c0392nu.f9455d == null) {
                c0392nu.f9455d = C0392nu.m5707a(c0392nu.f9454c);
            }
            menuItem.setOnMenuItemClickListener(new C0393nv(c0392nu.f9455d, this.f9491z));
        }
        z = menuItem instanceof C0736ot;
        if (this.f9483r >= 2) {
            if (z) {
                ((C0736ot) menuItem).mo14350b(true);
            } else if (menuItem instanceof C0830ou) {
                C0830ou c0830ou = (C0830ou) menuItem;
                try {
                    if (c0830ou.f25409e == null) {
                        c0830ou.f25409e = ((C0266hg) c0830ou.f9502d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    c0830ou.f25409e.invoke(c0830ou.f9502d, new Object[]{Boolean.valueOf(true)});
                } catch (Throwable e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f9489x;
        if (str != null) {
            menuItem.setActionView((View) mo10782a(str, C0392nu.f9451a, this.f9465F.f9453b));
        } else {
            z2 = false;
        }
        i = this.f9488w;
        if (i > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i);
            }
        }
        C0308jf c0308jf = this.f9460A;
        if (c0308jf != null) {
            if (menuItem instanceof C0266hg) {
                ((C0266hg) menuItem).mo7844a(c0308jf);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f9461B;
        z2 = menuItem instanceof C0266hg;
        if (z2) {
            ((C0266hg) menuItem).mo7843a(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        charSequence = this.f9462C;
        if (z2) {
            ((C0266hg) menuItem).mo7846b(charSequence);
        } else {
            menuItem.setTooltipText(charSequence);
        }
        char c = this.f9479n;
        int i2 = this.f9480o;
        if (z2) {
            ((C0266hg) menuItem).setAlphabeticShortcut(c, i2);
        } else {
            menuItem.setAlphabeticShortcut(c, i2);
        }
        c = this.f9481p;
        i2 = this.f9482q;
        if (z2) {
            ((C0266hg) menuItem).setNumericShortcut(c, i2);
        } else {
            menuItem.setNumericShortcut(c, i2);
        }
        Mode mode = this.f9464E;
        if (mode != null) {
            if (z2) {
                ((C0266hg) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f9463D;
        if (colorStateList == null) {
            return;
        }
        if (z2) {
            ((C0266hg) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
