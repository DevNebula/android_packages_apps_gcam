package com.google.android.apps.camera.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import java.util.Map;
import p000.ijg;
import p000.ijh;
import p000.irs;
import p000.kgi;
import p000.khb;

/* compiled from: PG */
public class CameraBackupAgent extends ijh {
    /* renamed from: a */
    public static irs f12767a;

    /* renamed from: a */
    protected final Map mo8553a() {
        khb.m4952b(PreferenceManager.getDefaultSharedPreferencesName(this), new ijg());
        return kgi.m13758a(1, new Object[]{r0, r1});
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        irs irs = f12767a;
        if (irs != null) {
            irs.mo8911c();
        }
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        irs irs = f12767a;
        if (irs != null) {
            irs.mo8914d();
        }
    }
}
