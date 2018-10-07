package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: pi */
public class C0833pi extends C0731oe implements Menu {
    public C0833pi(Context context, C0265hf c0265hf) {
        super(context, c0265hf);
    }

    public MenuItem add(int i) {
        return mo14288a(((C0265hf) this.f9502d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo14288a(((C0265hf) this.f9502d).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo14288a(((C0265hf) this.f9502d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo14288a(((C0265hf) this.f9502d).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((C0265hf) this.f9502d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo14288a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo14289a(((C0265hf) this.f9502d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo14289a(((C0265hf) this.f9502d).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo14289a(((C0265hf) this.f9502d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo14289a(((C0265hf) this.f9502d).addSubMenu(charSequence));
    }

    public void clear() {
        Map map = this.f22165b;
        if (map != null) {
            map.clear();
        }
        map = this.f22166c;
        if (map != null) {
            map.clear();
        }
        ((C0265hf) this.f9502d).clear();
    }

    public void close() {
        ((C0265hf) this.f9502d).close();
    }

    public MenuItem findItem(int i) {
        return mo14288a(((C0265hf) this.f9502d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo14288a(((C0265hf) this.f9502d).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0265hf) this.f9502d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0265hf) this.f9502d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0265hf) this.f9502d).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0265hf) this.f9502d).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        Map map = this.f22165b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C0265hf) this.f9502d).removeGroup(i);
    }

    public void removeItem(int i) {
        Map map = this.f22165b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((C0265hf) this.f9502d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0265hf) this.f9502d).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0265hf) this.f9502d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0265hf) this.f9502d).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0265hf) this.f9502d).setQwertyMode(z);
    }

    public int size() {
        return ((C0265hf) this.f9502d).size();
    }
}
