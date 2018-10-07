package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gsm */
public final class gsm implements gsl {
    /* renamed from: a */
    private static final Object f19561a = new Object();

    gsm() {
    }

    /* renamed from: a */
    public final void mo7395a(File file) {
        kiz.m5029a(file);
    }

    /* renamed from: b */
    public final void mo7397b(File file) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo7397b(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        String valueOf = String.valueOf(file2.getAbsolutePath());
                        String str = "Failed to delete file: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            valueOf = str.concat(valueOf);
                        }
                        throw new IOException(valueOf);
                    }
                }
                file.delete();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo7398c(File file) {
        boolean z = true;
        synchronized (f19561a) {
            if (!(file.isDirectory() || file.mkdirs())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo7396a(File file, File file2) {
        if (!file.equals(file2) && !file.renameTo(file2)) {
            kiz.m5030a(file, file2);
        }
    }

    /* renamed from: d */
    public final byte[] mo7399d(File file) {
        return kiz.m5031b(file);
    }

    /* renamed from: e */
    public final void mo7400e(File file) {
        kiz.m5032c(file);
    }
}
