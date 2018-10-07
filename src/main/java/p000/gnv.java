package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

@TargetApi(9)
/* compiled from: PG */
/* renamed from: gnv */
public final class gnv implements gnu {
    /* renamed from: a */
    private static final String f19397a = bli.m887a("SesnStorageMgrImpl");
    /* renamed from: b */
    private final kbg f19398b;
    /* renamed from: c */
    private final kbg f19399c;
    /* renamed from: d */
    private final gsl f19400d;

    private gnv(File file, File file2, gsl gsl) {
        jri.m13404b((Object) gsl);
        this.f19398b = kbg.m4803b(file);
        this.f19399c = kbg.m4803b(file2);
        this.f19400d = gsl;
    }

    /* renamed from: a */
    private final void m11436a(File file) {
        File[] listFiles = file.listFiles(new gnw());
        if (listFiles != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file2 : listFiles) {
                String str = f19397a;
                String valueOf = String.valueOf(file2.getAbsolutePath());
                String str2 = "Check for potential clean-up: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m896d(str, valueOf);
                if (file2.lastModified() < -86400000 + currentTimeMillis) {
                    try {
                        this.f19400d.mo7397b(file2);
                    } catch (IOException e) {
                        str = f19397a;
                        valueOf = String.valueOf(file2.getAbsolutePath());
                        String str3 = "Could not clean up ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str3);
                        } else {
                            valueOf = str3.concat(valueOf);
                        }
                        bli.m898e(str, valueOf);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static gnu m11435a(Context context, gsl gsl) {
        File externalFilesDir;
        if (Environment.isExternalStorageEmulated()) {
            externalFilesDir = context.getExternalFilesDir(null);
        } else {
            externalFilesDir = context.getNoBackupFilesDir();
        }
        return new gnv(externalFilesDir, context.getExternalFilesDir(null), gsl);
    }

    /* renamed from: a */
    public final File mo7266a(String str, String str2) {
        File file = new File(new File(mo7265a(str), str2), String.valueOf(str2).concat(".jpg"));
        kiz.m5029a(file);
        if ((file.createNewFile() && file.canWrite()) || file.canWrite()) {
            return file;
        }
        throw new IOException("Temporary output file is not writeable.");
    }

    /* renamed from: a */
    public final File mo7265a(String str) {
        if (this.f19398b.mo9709b()) {
            File file = new File((File) this.f19398b.mo9706a(), str);
            String valueOf;
            StringBuilder stringBuilder;
            if (!this.f19400d.mo7398c(file)) {
                valueOf = String.valueOf(file);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Could not create session directory: ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            } else if (file.isDirectory()) {
                m11436a(file);
                m11436a(new File((File) this.f19399c.mo9706a(), str));
                return file;
            } else {
                valueOf = String.valueOf(file);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("Session directory is not a directory: ");
                stringBuilder.append(valueOf);
                throw new IOException(stringBuilder.toString());
            }
        }
        throw new IOException("Could retrieve baseDirectory.");
    }
}
