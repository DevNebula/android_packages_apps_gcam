package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p001v4.app.ActionBarDrawerToggle;
import android.support.p001v4.app.ActivityCompat;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.NavUtils;
import android.support.p001v4.app.TaskStackBuilder;
import android.support.p001v4.app.TaskStackBuilder.SupportParentable;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
/* renamed from: md */
public class C0845md extends FragmentActivity implements SupportParentable, C0369me {
    /* renamed from: a */
    private C0370mf f26611a;
    /* renamed from: b */
    private int f26612b = 0;

    public void addContentView(View view, LayoutParams layoutParams) {
        mo15675a().mo10673a(view, layoutParams);
    }

    public void closeOptionsMenu() {
        C0359lt c = mo15675a().mo10680c();
        if (getWindow().hasFeature(0)) {
            if (c != null) {
                c.mo10644a();
            }
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0359lt c = mo15675a().mo10680c();
        if (keyCode == 82 && c != null) {
            c.mo10656h();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public View findViewById(int i) {
        return mo15675a().mo10670a(i);
    }

    /* renamed from: a */
    public final C0370mf mo15675a() {
        if (this.f26611a == null) {
            this.f26611a = new C0713mg(this, getWindow(), this);
        }
        return this.f26611a;
    }

    public MenuInflater getMenuInflater() {
        return mo15675a().mo10676b();
    }

    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    public void invalidateOptionsMenu() {
        mo15675a().mo10683e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo15675a().mo10684f();
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        C0370mf a = mo15675a();
        a.mo10682d();
        a.mo10671a(bundle);
        if (a.mo10675a() && this.f26612b != 0) {
            onApplyThemeResource(getTheme(), this.f26612b, false);
        }
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        mo15675a().mo10685g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0359lt c = mo15675a().mo10680c();
        return (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME || c == null || (c.mo10649c() & 4) == 0) ? false : m18218e();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo15675a().mo10686h();
    }

    protected void onPostResume() {
        super.onPostResume();
        mo15675a().mo10687i();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo15675a().mo10677b(bundle);
    }

    protected void onStart() {
        super.onStart();
        mo15675a().mo10688j();
    }

    protected void onStop() {
        super.onStop();
        mo15675a().mo10689k();
    }

    /* renamed from: b */
    public final void mo10667b() {
    }

    /* renamed from: c */
    public final void mo10668c() {
    }

    /* renamed from: e */
    private final boolean m18218e() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (NavUtils.shouldUpRecreateTask(this, supportParentActivityIntent)) {
            TaskStackBuilder create = TaskStackBuilder.create(this);
            create.addParentStack((Activity) this);
            create.startActivities();
            try {
                ActivityCompat.finishAffinity(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            NavUtils.navigateUpTo(this, supportParentActivityIntent);
        }
        return true;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo15675a().mo10674a(charSequence);
    }

    /* renamed from: d */
    public final C0387nn mo10669d() {
        return null;
    }

    public void openOptionsMenu() {
        C0359lt c = mo15675a().mo10680c();
        if (getWindow().hasFeature(0)) {
            if (c != null) {
                c.mo10657i();
            }
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo15675a().mo10681c(i);
    }

    public void setContentView(View view) {
        mo15675a().mo10672a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo15675a().mo10678b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f26612b = i;
    }

    public void supportInvalidateOptionsMenu() {
        mo15675a().mo10683e();
    }
}
