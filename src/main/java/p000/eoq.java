package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: eoq */
public class eoq extends Activity {
    /* renamed from: a */
    private final eon f4218a = new eon();
    /* renamed from: b */
    private int f4219b;
    /* renamed from: t */
    public final ena f4220t = new ena();

    /* renamed from: a */
    private final void mo12456a() {
        int i = this.f4219b;
        this.f4219b = i + 1;
        if (i == 0) {
            ena ena = this.f4220t;
            i = 0;
            while (true) {
                int i2 = i;
                if (i2 < ena.f4209e.size()) {
                    eol eol = (eol) ena.f4209e.get(i2);
                    if (eol instanceof emz) {
                        ((emz) eol).mo6346a();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f4220t;
        for (int i = 0; i < ena.f4209e.size(); i++) {
            eol eol = (eol) ena.f4209e.get(i);
            if ((eol instanceof emg) && ((emg) eol).mo6327a()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj = null;
        ena ena = this.f4220t;
        for (int i = 0; i < ena.f4209e.size(); i++) {
            eol eol = (eol) ena.f4209e.get(i);
            if ((eol instanceof emh) && ((emh) eol).mo6328a(motionEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private final void mo12457b() {
        this.f4219b--;
    }

    public void finish() {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emi) {
                    ((emi) eol).mo6329a();
                }
                i = i2 + 1;
            } else {
                super.finish();
                return;
            }
        }
    }

    public void onActionModeFinished(ActionMode actionMode) {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emj) {
                    ((emj) eol).mo6330a();
                }
                i = i2 + 1;
            } else {
                super.onActionModeFinished(actionMode);
                return;
            }
        }
    }

    public void onActionModeStarted(ActionMode actionMode) {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emk) {
                    ((emk) eol).mo6331a();
                }
                i = i2 + 1;
            } else {
                super.onActionModeStarted(actionMode);
                return;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        enr enr = this.f4220t;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < enr.f4209e.size()) {
                eol eol = (eol) enr.f4209e.get(i4);
                if (eol instanceof enx) {
                    ((enx) eol).mo6360a();
                }
                i3 = i4 + 1;
            } else {
                super.onActivityResult(i, i2, intent);
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        ena ena = this.f4220t;
        ena.f17555d = ena.mo6354a(new ene());
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        Object obj = null;
        ena ena = this.f4220t;
        for (int i = 0; i < ena.f4209e.size(); i++) {
            eol eol = (eol) ena.f4209e.get(i);
            if ((eol instanceof emm) && ((emm) eol).mo6333J()) {
                obj = 1;
                break;
            }
        }
        if (obj == null) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emn) {
                    ((emn) eol).mo6334a(configuration);
                }
                i = i2 + 1;
            } else {
                super.onConfigurationChanged(configuration);
                return;
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        boolean z = false;
        for (eol eol : this.f4220t.f4209e) {
            if (eol instanceof eny) {
                z = ((eny) eol).mo6361a(menuItem) | z;
            }
        }
        return z;
    }

    public void onCreate(Bundle bundle) {
        this.f4218a.mo6376b();
        enr enr = this.f4220t;
        enr.f4210f = enr.mo6354a(new ens(enr, bundle));
        super.onCreate(bundle);
        this.f4218a.mo6375a();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        for (eol eol : this.f4220t.f4209e) {
            if (eol instanceof eoa) {
                ((eoa) eol).mo6363a(contextMenu);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int i = 0;
        for (eol eol : this.f4220t.f4209e) {
            if (eol instanceof eob) {
                i = ((eob) eol).mo6364a(menu) | i;
            }
        }
        if (i != 0) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.f4218a.mo6378d();
        this.f4220t.mo6356a();
        super.onDestroy();
        this.f4218a.mo6377c();
    }

    public void onDetachedFromWindow() {
        ena ena = this.f4220t;
        ena.mo6358b(ena.f17555d);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emo) {
                    ((emo) eol).mo6335a();
                }
                i = i2 + 1;
            } else {
                super.onDetachedFromWindow();
                return;
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f4220t;
        for (int i2 = 0; i2 < ena.f4209e.size(); i2++) {
            eol eol = (eol) ena.f4209e.get(i2);
            if ((eol instanceof emp) && ((emp) eol).mo6336a(i, keyEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object obj = null;
        ena ena = this.f4220t;
        for (int i2 = 0; i2 < ena.f4209e.size(); i2++) {
            eol eol = (eol) ena.f4209e.get(i2);
            if ((eol instanceof emq) && ((emq) eol).mo6337b(i, keyEvent)) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onLowMemory() {
        for (eol eol : this.f4220t.f4209e) {
            if (eol instanceof eod) {
                ((eod) eol).mo6366a();
            }
        }
        super.onLowMemory();
    }

    protected void onNewIntent(Intent intent) {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emr) {
                    ((emr) eol).mo6338c(intent);
                }
                i = i2 + 1;
            } else {
                super.onNewIntent(intent);
                return;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object obj;
        for (eol eol : this.f4220t.f4209e) {
            if ((eol instanceof eoe) && ((eoe) eol).mo6367b(menuItem)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        this.f4218a.mo6380f();
        this.f4220t.mo6357b();
        super.onPause();
        this.f4218a.mo6379e();
    }

    protected void onPostCreate(Bundle bundle) {
        ena ena = this.f4220t;
        ena.f17552a = ena.mo6354a(new enb(ena, bundle));
        super.onPostCreate(bundle);
    }

    protected void onPostResume() {
        ena ena = this.f4220t;
        ena.f17554c = ena.mo6354a(new end());
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int i = 0;
        for (eol eol : this.f4220t.f4209e) {
            if (eol instanceof eog) {
                i = ((eog) eol).mo6369L() | i;
            }
        }
        if (i != 0) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ena ena = this.f4220t;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i3);
                if (eol instanceof emu) {
                    ((emu) eol).mo6341a(i, strArr, iArr);
                }
                i2 = i3 + 1;
            } else {
                super.onRequestPermissionsResult(i, strArr, iArr);
                return;
            }
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        ena ena = this.f4220t;
        ena.f17553b = ena.mo6354a(new enc(ena, bundle));
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        this.f4218a.mo6382h();
        enr enr = this.f4220t;
        enr.f4212h = enr.mo6354a(new enu());
        super.onResume();
        this.f4218a.mo6381g();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        enr enr = this.f4220t;
        enr.f4213i = enr.mo6354a(new env(enr, bundle));
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f4218a.mo6384j();
        enr enr = this.f4220t;
        enr.f4211g = enr.mo6354a(new ent());
        super.onStart();
        this.f4218a.mo6383i();
    }

    public void onStop() {
        this.f4218a.mo6386l();
        enr enr = this.f4220t;
        enr.mo6358b(enr.f4211g);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < enr.f4209e.size()) {
                eol eol = (eol) enr.f4209e.get(i2);
                if (eol instanceof eok) {
                    ((eok) eol).mo6373j();
                }
                i = i2 + 1;
            } else {
                super.onStop();
                this.f4218a.mo6385k();
                return;
            }
        }
    }

    public void onUserInteraction() {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emw) {
                    ((emw) eol).mo6343a();
                }
                i = i2 + 1;
            } else {
                super.onUserInteraction();
                return;
            }
        }
    }

    protected void onUserLeaveHint() {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emx) {
                    ((emx) eol).mo6344a();
                }
                i = i2 + 1;
            } else {
                super.onUserLeaveHint();
                return;
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ena ena = this.f4220t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < ena.f4209e.size()) {
                eol eol = (eol) ena.f4209e.get(i2);
                if (eol instanceof emy) {
                    ((emy) eol).mo6345a(z);
                }
                i = i2 + 1;
            } else {
                super.onWindowFocusChanged(z);
                return;
            }
        }
    }

    public void startActivity(Intent intent) {
        mo12456a();
        super.startActivity(intent);
        mo12457b();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        mo12456a();
        super.startActivity(intent, bundle);
        mo12457b();
    }

    public void startActivityForResult(Intent intent, int i) {
        mo12456a();
        super.startActivityForResult(intent, i);
        mo12457b();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        mo12456a();
        super.startActivityForResult(intent, i, bundle);
        mo12457b();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        mo12456a();
        super.startActivityFromFragment(fragment, intent, i);
        mo12457b();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        mo12456a();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        mo12457b();
    }
}
