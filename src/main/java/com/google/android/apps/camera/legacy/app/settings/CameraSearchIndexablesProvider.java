package com.google.android.apps.camera.legacy.app.settings;

import android.app.Application;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.preference.Preference;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import com.google.android.GoogleCamera.R;
import p000.bli;
import p000.cbw;
import p000.dzt;
import p000.dzw;

/* compiled from: PG */
public class CameraSearchIndexablesProvider extends SearchIndexablesProvider {
    /* renamed from: a */
    private static final String f2552a = bli.m887a(CameraSearchIndexablesProvider.class.getSimpleName());
    /* renamed from: b */
    private dzt f2553b;
    /* renamed from: c */
    private String f2554c;

    /* renamed from: a */
    private final Object[] m1312a(String str, String str2, String str3) {
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
        objArr[12] = str3;
        objArr[1] = str;
        objArr[2] = str2;
        objArr[8] = Integer.valueOf(R.drawable.ic_camera);
        objArr[9] = "com.android.settings.action.EXTRA_SETTINGS";
        objArr[10] = this.f2554c;
        objArr[11] = CameraSettingsActivity.class.getName();
        return objArr;
    }

    public boolean onCreate() {
        bli.m898e(f2552a, "Called onCreate");
        this.f2553b = dzw.m9737b().mo6150a(cbw.m1127a((Application) getContext().getApplicationContext())).mo6149a().mo6148a();
        this.f2553b.mo6146a(getContext());
        this.f2554c = getContext().getApplicationInfo().packageName;
        return true;
    }

    public Cursor queryNonIndexableKeys(String[] strArr) {
        bli.m898e(f2552a, "Called queryNonIndexableKeys");
        Cursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        for (String str : this.f2553b.mo6145a()) {
            Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
            objArr[0] = str;
            matrixCursor.addRow(objArr);
            String str2 = f2552a;
            String str3 = String.valueOf(str3);
            String str4 = "Removing key: ";
            if (str3.length() == 0) {
                str3 = new String(str4);
            } else {
                str3 = str4.concat(str3);
            }
            bli.m888a(str2, str3);
        }
        return matrixCursor;
    }

    public Cursor queryRawData(String[] strArr) {
        bli.m898e(f2552a, "Called queryRawData");
        String string = getContext().getString(R.string.app_name);
        Cursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        matrixCursor.addRow(m1312a(string, getContext().getString(R.string.mode_settings), "camera_settings"));
        for (Preference preference : this.f2553b.mo6147b().mo9932o()) {
            matrixCursor.addRow(m1312a(preference.getTitle().toString(), preference.getSummary().toString(), preference.getKey()));
            String str = f2552a;
            String valueOf = String.valueOf(preference.getTitle());
            String valueOf2 = String.valueOf(preference.getSummary());
            string = preference.getKey();
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 21) + String.valueOf(valueOf2).length()) + String.valueOf(string).length());
            stringBuilder.append("Indexing Preference");
            stringBuilder.append(valueOf);
            stringBuilder.append("/");
            stringBuilder.append(valueOf2);
            stringBuilder.append("/");
            stringBuilder.append(string);
            bli.m888a(str, stringBuilder.toString());
        }
        return matrixCursor;
    }

    public Cursor queryXmlResources(String[] strArr) {
        bli.m898e(f2552a, "Called queryXmlResources");
        Cursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS.length];
        objArr[0] = Integer.valueOf(1);
        objArr[1] = Integer.valueOf(R.xml.camera_preferences);
        objArr[2] = null;
        objArr[3] = Integer.valueOf(0);
        objArr[4] = "android.intent.action.MAIN";
        objArr[5] = this.f2554c;
        objArr[6] = CameraSettingsActivity.class.getName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
