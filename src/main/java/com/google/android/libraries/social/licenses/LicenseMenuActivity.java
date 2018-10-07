package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.ActionBarDrawerToggle;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.view.MenuItem;
import com.google.android.GoogleCamera.R;
import p000.C0845md;
import p000.kaj;
import p000.kan;
import p000.kap;

/* compiled from: PG */
public final class LicenseMenuActivity extends C0845md implements kap {
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_menu_activity);
        if (mo15675a().mo10680c() != null) {
            mo15675a().mo10680c().mo10650c(true);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!(supportFragmentManager.findFragmentById(R.id.license_menu_fragment_container) instanceof kan)) {
            Fragment kan = new kan();
            if (getIntent().hasExtra("pluginLicensePaths")) {
                kan.setArguments(getIntent().getBundleExtra("pluginLicensePaths"));
            }
            supportFragmentManager.beginTransaction().add((int) R.id.license_menu_fragment_container, kan).commitNow();
        }
    }

    /* renamed from: a */
    public final void mo9687a(kaj kaj) {
        Intent intent = new Intent(this, LicenseActivity.class);
        intent.putExtra("license", kaj);
        startActivity(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
