package p000;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ijh */
public abstract class ijh extends BackupAgentHelper {
    /* renamed from: a */
    public abstract Map mo8553a();

    /* renamed from: b */
    private final void m3840b() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    /* renamed from: a */
    private static boolean m3839a(String str) {
        if (str.contains(File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) {
            return false;
        }
        return true;
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map a = mo8553a();
        Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Entry entry : a.entrySet()) {
            String str = (String) entry.getKey();
            entry.getValue();
            if (ijh.m3839a(str)) {
                for (Entry entry2 : getSharedPreferences(str, 0).getAll().entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
                    stringBuilder.append(str);
                    stringBuilder.append("/");
                    stringBuilder.append(str2);
                    ijh.m3838a(edit, stringBuilder.toString(), value);
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 43);
                stringBuilder2.append("Unsupported shared preferences file name \"");
                stringBuilder2.append(str);
                stringBuilder2.append("\"");
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        m3840b();
    }

    public void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, new String[]{"persistent_backup_agent_helper"}));
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        Editor editor;
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        Map hashMap = new HashMap();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            int indexOf = str.indexOf("/");
            if (indexOf < 0 || indexOf >= str.length() - 1) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 57);
                stringBuilder.append("Format of key \"");
                stringBuilder.append(str);
                stringBuilder.append("\" not understood, so skipping its restore.");
                Log.w("PersistentBackupAgentHe", stringBuilder.toString());
            } else {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                editor = (Editor) hashMap.get(substring);
                if (editor == null) {
                    if (ijh.m3839a(substring)) {
                        editor = getSharedPreferences(substring, 0).edit();
                        hashMap.put(substring, editor);
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(substring).length() + 52);
                        stringBuilder2.append("Skipping unsupported shared preferences file name \"");
                        stringBuilder2.append(substring);
                        stringBuilder2.append("\"");
                        Log.w("PersistentBackupAgentHe", stringBuilder2.toString());
                    }
                }
                ijh.m3838a(editor, substring2, value);
            }
        }
        for (Editor editor2 : hashMap.values()) {
            editor2.apply();
        }
        hashMap.keySet();
        m3840b();
    }

    /* renamed from: a */
    private static void m3838a(Editor editor, String str, Object obj) {
        Object obj2 = null;
        String valueOf;
        StringBuilder stringBuilder;
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Set) {
            for (Object obj3 : (Set) obj) {
                if (!(obj3 instanceof String)) {
                    Object obj4;
                    if (obj != null) {
                        obj4 = obj.getClass();
                    } else {
                        obj4 = null;
                    }
                    valueOf = String.valueOf(obj4);
                    stringBuilder = new StringBuilder((String.valueOf(str).length() + 82) + String.valueOf(valueOf).length());
                    stringBuilder.append("Skipping restore of key ");
                    stringBuilder.append(str);
                    stringBuilder.append(" because its value is a set containing an object of type ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(".");
                    Log.w("PersistentBackupAgentHe", stringBuilder.toString());
                    return;
                }
            }
            editor.putStringSet(str, (Set) obj);
        } else {
            if (obj != null) {
                obj2 = obj.getClass();
            }
            valueOf = String.valueOf(obj2);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 69) + String.valueOf(valueOf).length());
            stringBuilder.append("Skipping restore of key ");
            stringBuilder.append(str);
            stringBuilder.append(" because its value is the unrecognized type ");
            stringBuilder.append(valueOf);
            stringBuilder.append(".");
            Log.w("PersistentBackupAgentHe", stringBuilder.toString());
        }
    }
}
