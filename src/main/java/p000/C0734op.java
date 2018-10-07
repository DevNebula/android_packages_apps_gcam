package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: op */
public class C0734op implements C0265hf {
    /* renamed from: k */
    private static final int[] f22175k = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: a */
    public final Context f22176a;
    /* renamed from: b */
    public C0406oq f22177b;
    /* renamed from: c */
    public ArrayList f22178c;
    /* renamed from: d */
    public ArrayList f22179d;
    /* renamed from: e */
    public int f22180e = 1;
    /* renamed from: f */
    public CharSequence f22181f;
    /* renamed from: g */
    public Drawable f22182g;
    /* renamed from: h */
    public View f22183h;
    /* renamed from: i */
    public C0736ot f22184i;
    /* renamed from: j */
    public boolean f22185j;
    /* renamed from: l */
    private final Resources f22186l;
    /* renamed from: m */
    private boolean f22187m;
    /* renamed from: n */
    private boolean f22188n;
    /* renamed from: o */
    private ArrayList f22189o;
    /* renamed from: p */
    private boolean f22190p;
    /* renamed from: q */
    private ArrayList f22191q;
    /* renamed from: r */
    private boolean f22192r;
    /* renamed from: s */
    private boolean f22193s = false;
    /* renamed from: t */
    private boolean f22194t = false;
    /* renamed from: u */
    private boolean f22195u = false;
    /* renamed from: v */
    private boolean f22196v = false;
    /* renamed from: w */
    private ArrayList f22197w = new ArrayList();
    /* renamed from: x */
    private CopyOnWriteArrayList f22198x = new CopyOnWriteArrayList();
    /* renamed from: y */
    private boolean f22199y = false;

    public C0734op(Context context) {
        boolean z = true;
        this.f22176a = context;
        this.f22186l = context.getResources();
        this.f22178c = new ArrayList();
        this.f22189o = new ArrayList();
        this.f22190p = true;
        this.f22179d = new ArrayList();
        this.f22191q = new ArrayList();
        this.f22192r = true;
        if (this.f22186l.getConfiguration().keyboard == 1) {
            z = false;
        } else if (!ViewConfiguration.get(this.f22176a).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = false;
        }
        this.f22188n = z;
    }

    public MenuItem add(int i) {
        return m14495a(0, 0, 0, this.f22186l.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m14495a(i, i2, i3, this.f22186l.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m14495a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m14495a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int size;
        int i5;
        PackageManager packageManager = this.f22176a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        } else {
            size = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
            i5 = 0;
        } else {
            i5 = 0;
        }
        while (i5 < size) {
            Intent intent2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex >= 0) {
                intent2 = intentArr[resolveInfo.specificIndex];
            } else {
                intent2 = intent;
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
            i5++;
        }
        return size;
    }

    /* renamed from: a */
    private final MenuItem m14495a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 < 0 || i4 >= f22175k.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5;
        int i6 = (f22175k[i4] << 16) | ((char) i3);
        MenuItem c0736ot = new C0736ot(this, i, i2, i3, i6, charSequence, this.f22180e);
        ArrayList arrayList = this.f22178c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0736ot) arrayList.get(size)).f22206a <= i6) {
                i5 = size + 1;
                break;
            }
        }
        i5 = 0;
        arrayList.add(i5, c0736ot);
        mo14314b(true);
        return c0736ot;
    }

    /* renamed from: a */
    public final void mo14296a(C0410pe c0410pe) {
        mo14297a(c0410pe, this.f22176a);
    }

    /* renamed from: a */
    public final void mo14297a(C0410pe c0410pe, Context context) {
        this.f22198x.add(new WeakReference(c0410pe));
        c0410pe.mo10846a(context, this);
        this.f22192r = true;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f22186l.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f22186l.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0736ot c0736ot = (C0736ot) m14495a(i, i2, i3, charSequence);
        C0835pn c0835pn = new C0835pn(this.f22176a, this, c0736ot);
        c0736ot.mo14347a(c0835pn);
        return c0835pn;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clear() {
        C0736ot c0736ot = this.f22184i;
        if (c0736ot != null) {
            mo14301a(c0736ot);
        }
        this.f22178c.clear();
        mo14314b(true);
    }

    public void clearHeader() {
        this.f22182g = null;
        this.f22181f = null;
        this.f22183h = null;
        mo14314b(false);
    }

    public void close() {
        mo14298a(true);
    }

    /* renamed from: a */
    public final void mo14298a(boolean z) {
        if (!this.f22196v) {
            this.f22196v = true;
            Iterator it = this.f22198x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0410pe c0410pe = (C0410pe) weakReference.get();
                if (c0410pe == null) {
                    this.f22198x.remove(weakReference);
                } else {
                    c0410pe.mo10847a(this, z);
                }
            }
            this.f22196v = false;
        }
    }

    /* renamed from: a */
    public boolean mo14301a(C0736ot c0736ot) {
        boolean z = false;
        if (!this.f22198x.isEmpty() && this.f22184i == c0736ot) {
            mo14332l();
            Iterator it = this.f22198x.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                C0410pe c0410pe = (C0410pe) weakReference.get();
                if (c0410pe == null) {
                    this.f22198x.remove(weakReference);
                    z = z2;
                } else {
                    z = c0410pe.mo10851a(c0736ot);
                    if (z) {
                        break;
                    }
                }
            }
            mo14331k();
            if (z) {
                this.f22184i = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    boolean mo14300a(C0734op c0734op, MenuItem menuItem) {
        C0406oq c0406oq = this.f22177b;
        return c0406oq != null && c0406oq.mo10834a(c0734op, menuItem);
    }

    /* renamed from: b */
    public boolean mo14315b(C0736ot c0736ot) {
        boolean z = false;
        if (!this.f22198x.isEmpty()) {
            mo14332l();
            Iterator it = this.f22198x.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                C0410pe c0410pe = (C0410pe) weakReference.get();
                if (c0410pe == null) {
                    this.f22198x.remove(weakReference);
                    z = z2;
                } else {
                    z = c0410pe.mo10853b(c0736ot);
                    if (z) {
                        break;
                    }
                }
            }
            mo14331k();
            if (z) {
                this.f22184i = c0736ot;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0736ot c0736ot = (C0736ot) this.f22178c.get(i2);
            if (c0736ot.getItemId() == i) {
                return c0736ot;
            }
            if (c0736ot.hasSubMenu()) {
                MenuItem findItem = c0736ot.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C0736ot m14496a(int i, KeyEvent keyEvent) {
        List list = this.f22197w;
        list.clear();
        m14498a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0736ot) list.get(0);
        }
        boolean g = mo14324g();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            C0736ot c0736ot = (C0736ot) list.get(i2);
            if (g) {
                alphabeticShortcut = c0736ot.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = c0736ot.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0736ot;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0736ot;
            }
            if (g && alphabeticShortcut == 8 && i == 67) {
                return c0736ot;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m14498a(List list, int i, KeyEvent keyEvent) {
        boolean g = mo14324g();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f22178c.size();
            for (int i2 = 0; i2 < size; i2++) {
                int alphabeticModifiers;
                C0736ot c0736ot = (C0736ot) this.f22178c.get(i2);
                if (c0736ot.hasSubMenu()) {
                    ((C0734op) c0736ot.getSubMenu()).m14498a(list, i, keyEvent);
                }
                char alphabeticShortcut;
                if (g) {
                    alphabeticShortcut = c0736ot.getAlphabeticShortcut();
                } else {
                    alphabeticShortcut = c0736ot.getNumericShortcut();
                }
                if (g) {
                    alphabeticModifiers = c0736ot.getAlphabeticModifiers();
                } else {
                    alphabeticModifiers = c0736ot.getNumericModifiers();
                }
                if ((modifiers & 69647) == (alphabeticModifiers & 69647) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (g && alphabeticShortcut == 8 && i == 67)) && c0736ot.isEnabled())) {
                    list.add(c0736ot);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14292a() {
        ArrayList e = mo14321e();
        if (this.f22192r) {
            Iterator it = this.f22198x.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0410pe c0410pe = (C0410pe) weakReference.get();
                if (c0410pe == null) {
                    this.f22198x.remove(weakReference);
                } else {
                    i = c0410pe.mo10850a() | i;
                }
            }
            if (i != 0) {
                this.f22179d.clear();
                this.f22191q.clear();
                i = e.size();
                for (int i2 = 0; i2 < i; i2++) {
                    C0736ot c0736ot = (C0736ot) e.get(i2);
                    if (c0736ot.mo14355e()) {
                        this.f22179d.add(c0736ot);
                    } else {
                        this.f22191q.add(c0736ot);
                    }
                }
            } else {
                this.f22179d.clear();
                this.f22191q.clear();
                this.f22191q.addAll(mo14321e());
            }
            this.f22192r = false;
        }
    }

    /* renamed from: b */
    protected String mo14311b() {
        return "android:menu:actionviewstates";
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f22178c.get(i);
    }

    /* renamed from: c */
    public final ArrayList mo14316c() {
        mo14292a();
        return this.f22191q;
    }

    /* renamed from: d */
    public C0734op mo14320d() {
        return this;
    }

    /* renamed from: e */
    public final ArrayList mo14321e() {
        if (!this.f22190p) {
            return this.f22189o;
        }
        this.f22189o.clear();
        int size = this.f22178c.size();
        for (int i = 0; i < size; i++) {
            C0736ot c0736ot = (C0736ot) this.f22178c.get(i);
            if (c0736ot.isVisible()) {
                this.f22189o.add(c0736ot);
            }
        }
        this.f22190p = false;
        this.f22192r = true;
        return this.f22189o;
    }

    public boolean hasVisibleItems() {
        if (this.f22185j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0736ot) this.f22178c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo14322f() {
        return this.f22199y;
    }

    /* renamed from: g */
    public boolean mo14324g() {
        return this.f22187m;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m14496a(i, keyEvent) != null;
    }

    /* renamed from: h */
    public boolean mo14326h() {
        return this.f22188n;
    }

    /* renamed from: i */
    final void mo14328i() {
        this.f22192r = true;
        mo14314b(true);
    }

    /* renamed from: j */
    public final void mo14330j() {
        this.f22190p = true;
        mo14314b(true);
    }

    /* renamed from: b */
    public final void mo14314b(boolean z) {
        if (this.f22193s) {
            this.f22194t = true;
            if (z) {
                this.f22195u = true;
                return;
            }
            return;
        }
        if (z) {
            this.f22190p = true;
            this.f22192r = true;
        }
        if (!this.f22198x.isEmpty()) {
            mo14332l();
            Iterator it = this.f22198x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0410pe c0410pe = (C0410pe) weakReference.get();
                if (c0410pe == null) {
                    this.f22198x.remove(weakReference);
                } else {
                    c0410pe.mo10849a(z);
                }
            }
            mo14331k();
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo14299a(findItem(i), null, i2);
    }

    /* renamed from: a */
    public final boolean mo14299a(MenuItem menuItem, C0410pe c0410pe, int i) {
        boolean z = false;
        C0736ot c0736ot = (C0736ot) menuItem;
        if (c0736ot == null || !c0736ot.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean d = c0736ot.mo14353d();
        C0308jf c0308jf = c0736ot.f22211f;
        if (c0308jf == null) {
            z2 = false;
        } else if (c0308jf.mo9368a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean expandActionView;
        if (c0736ot.mo14352c()) {
            expandActionView = c0736ot.expandActionView() | d;
            if (!expandActionView) {
                return expandActionView;
            }
            mo14298a(true);
            return expandActionView;
        } else if (c0736ot.hasSubMenu() || z2) {
            int i2;
            if ((i & 4) == 0) {
                mo14298a(false);
            }
            if (!c0736ot.hasSubMenu()) {
                c0736ot.mo14347a(new C0835pn(this.f22176a, this, c0736ot));
            }
            C0835pn c0835pn = (C0835pn) c0736ot.getSubMenu();
            if (z2) {
                c0308jf.mo9366a((SubMenu) c0835pn);
            }
            if (this.f22198x.isEmpty()) {
                i2 = 0;
            } else {
                if (c0410pe != null) {
                    z = c0410pe.mo10852a(c0835pn);
                }
                Iterator it = this.f22198x.iterator();
                i2 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0410pe c0410pe2 = (C0410pe) weakReference.get();
                    if (c0410pe2 == null) {
                        this.f22198x.remove(weakReference);
                    } else if (i2 == 0) {
                        i2 = c0410pe2.mo10852a(c0835pn);
                    }
                }
            }
            expandActionView = d | i2;
            if (expandActionView) {
                return expandActionView;
            }
            mo14298a(true);
            return expandActionView;
        } else if ((i & 1) != 0) {
            return d;
        } else {
            mo14298a(true);
            return d;
        }
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean a;
        MenuItem a2 = m14496a(i, keyEvent);
        if (a2 != null) {
            a = mo14299a(a2, null, i2);
        } else {
            a = false;
        }
        if ((i2 & 2) != 0) {
            mo14298a(true);
        }
        return a;
    }

    public void removeGroup(int i) {
        int i2;
        int size = size();
        for (i2 = 0; i2 < size; i2++) {
            if (((C0736ot) this.f22178c.get(i2)).getGroupId() == i) {
                size = i2;
                break;
            }
        }
        size = -1;
        if (size >= 0) {
            int size2 = this.f22178c.size() - size;
            int i3 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i3 >= size2 || ((C0736ot) this.f22178c.get(size)).getGroupId() != i) {
                    mo14314b(true);
                } else {
                    m14497a(size, false);
                    i3 = i2;
                }
            }
            mo14314b(true);
        }
    }

    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C0736ot) this.f22178c.get(i3)).getItemId() == i) {
                i2 = i3;
                break;
            }
        }
        i2 = -1;
        m14497a(i2, true);
    }

    /* renamed from: a */
    private final void m14497a(int i, boolean z) {
        if (i >= 0 && i < this.f22178c.size()) {
            this.f22178c.remove(i);
            if (z) {
                mo14314b(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo14313b(C0410pe c0410pe) {
        Iterator it = this.f22198x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0410pe c0410pe2 = (C0410pe) weakReference.get();
            if (c0410pe2 == null || c0410pe2 == c0410pe) {
                this.f22198x.remove(weakReference);
            }
        }
    }

    /* renamed from: a */
    public final void mo14294a(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo14311b());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0835pn) item.getSubMenu()).mo14294a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    item.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo14312b(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            SparseArray sparseArray2;
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView == null) {
                sparseArray2 = sparseArray;
            } else if (actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                    sparseArray2 = sparseArray;
                } else {
                    sparseArray2 = sparseArray;
                }
            } else {
                sparseArray2 = sparseArray;
            }
            if (item.hasSubMenu()) {
                ((C0835pn) item.getSubMenu()).mo14312b(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo14311b(), sparseArray);
        }
    }

    /* renamed from: a */
    public void mo14295a(C0406oq c0406oq) {
        this.f22177b = c0406oq;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f22178c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0736ot c0736ot = (C0736ot) this.f22178c.get(i2);
            if (c0736ot.getGroupId() == i) {
                c0736ot.mo14350b(z2);
                c0736ot.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f22199y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f22178c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0736ot c0736ot = (C0736ot) this.f22178c.get(i2);
            if (c0736ot.getGroupId() == i) {
                c0736ot.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f22178c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0736ot c0736ot = (C0736ot) this.f22178c.get(i2);
            boolean z3 = c0736ot.getGroupId() == i ? c0736ot.mo14354d(z) ? true : z2 : z2;
            i2++;
            z2 = z3;
        }
        if (z2) {
            mo14314b(true);
        }
    }

    /* renamed from: a */
    final void mo14293a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f22186l;
        if (view != null) {
            this.f22183h = view;
            this.f22181f = null;
            this.f22182g = null;
        } else {
            if (i > 0) {
                this.f22181f = resources.getText(i);
            } else if (charSequence != null) {
                this.f22181f = charSequence;
            }
            if (i2 > 0) {
                this.f22182g = C0242ge.getDrawable(this.f22176a, i2);
            } else if (drawable != null) {
                this.f22182g = drawable;
            }
            this.f22183h = null;
        }
        mo14314b(false);
    }

    public void setQwertyMode(boolean z) {
        this.f22187m = z;
        mo14314b(false);
    }

    public int size() {
        return this.f22178c.size();
    }

    /* renamed from: k */
    public final void mo14331k() {
        this.f22193s = false;
        if (this.f22194t) {
            this.f22194t = false;
            mo14314b(this.f22195u);
        }
    }

    /* renamed from: l */
    public final void mo14332l() {
        if (!this.f22193s) {
            this.f22193s = true;
            this.f22194t = false;
            this.f22195u = false;
        }
    }
}
