package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import java.util.List;

/* compiled from: PG */
/* renamed from: mp */
final class C0717mp extends C0396nz {
    /* renamed from: a */
    private final /* synthetic */ C0713mg f22087a;

    C0717mp(C0713mg c0713mg, Callback callback) {
        this.f22087a = c0713mg;
        super(callback);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f22087a.mo14218a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            boolean z;
            C0713mg c0713mg = this.f22087a;
            int keyCode = keyEvent.getKeyCode();
            C0359lt c = c0713mg.mo10680c();
            if (c == null || !c.mo10645a(keyCode, keyEvent)) {
                C0375mt c0375mt = c0713mg.f22070m;
                if (c0375mt != null && c0713mg.mo14219a(c0375mt, keyEvent.getKeyCode(), keyEvent)) {
                    C0375mt c0375mt2 = c0713mg.f22070m;
                    if (c0375mt2 != null) {
                        c0375mt2.f9213l = true;
                        z = true;
                    } else {
                        z = true;
                    }
                } else if (c0713mg.f22070m == null) {
                    c0375mt = c0713mg.mo14222e(0);
                    c0713mg.mo14220a(c0375mt, keyEvent);
                    z = c0713mg.mo14219a(c0375mt, keyEvent.getKeyCode(), keyEvent);
                    c0375mt.f9212k = false;
                    if (z) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C0734op)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        C0713mg c0713mg = this.f22087a;
        if (i == 108) {
            C0359lt c = c0713mg.mo10680c();
            if (c != null) {
                c.mo10643a(true);
            }
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        C0713mg c0713mg = this.f22087a;
        if (i == 108) {
            C0359lt c = c0713mg.mo10680c();
            if (c != null) {
                c.mo10643a(false);
            }
        } else if (i == 0) {
            C0375mt e = c0713mg.mo14222e(i);
            if (e.f9214m) {
                c0713mg.mo14216a(e, false);
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C0734op c0734op;
        if (menu instanceof C0734op) {
            c0734op = (C0734op) menu;
        } else {
            c0734op = null;
        }
        if (i == 0 && c0734op == null) {
            return false;
        }
        if (c0734op != null) {
            c0734op.f22185j = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (c0734op == null) {
            return onPreparePanel;
        }
        c0734op.f22185j = false;
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0375mt e = this.f22087a.mo14222e(0);
        if (e != null) {
            Menu menu2 = e.f9209h;
            if (menu2 != null) {
                super.onProvideKeyboardShortcuts(list, menu2, i);
                return;
            }
        }
        super.onProvideKeyboardShortcuts(list, menu, i);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        C0713mg c0713mg = this.f22087a;
        if (c0713mg.f22068k) {
            switch (i) {
                case 0:
                    Object c0727nt = new C0727nt(c0713mg.f22059b, callback);
                    c0713mg = this.f22087a;
                    C0387nn c0387nn = c0713mg.f22063f;
                    if (c0387nn != null) {
                        c0387nn.mo10741b();
                    }
                    C0388no c0716mn = new C0716mn(c0713mg, c0727nt);
                    C0359lt c = c0713mg.mo10680c();
                    if (c != null) {
                        c0713mg.f22063f = c.mo10641a(c0716mn);
                        if (c0713mg.f22063f != null) {
                            C0369me c0369me = c0713mg.f22061d;
                            if (c0369me != null) {
                                c0369me.mo10668c();
                            }
                        }
                    }
                    if (c0713mg.f22063f == null) {
                        c0713mg.f22063f = c0713mg.mo14214a(c0716mn);
                    }
                    C0387nn c0387nn2 = c0713mg.f22063f;
                    return c0387nn2 != null ? c0727nt.mo14247b(c0387nn2) : null;
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
