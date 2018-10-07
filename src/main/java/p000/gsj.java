package p000;

import android.annotation.TargetApi;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gsj */
public final class gsj implements gsi {
    /* renamed from: a */
    private static final String f19559a = bli.m887a("CameraFileUtil");

    gsj() {
    }

    /* renamed from: a */
    public final boolean mo7393a(File file) {
        return file.delete();
    }

    /* renamed from: a */
    private static long m11694a(File file, long j) {
        String name;
        StringBuilder stringBuilder;
        if (j > 0) {
            String str = f19559a;
            name = file.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 36);
            stringBuilder.append("Wrote ");
            stringBuilder.append(j);
            stringBuilder.append(" bytes to ");
            stringBuilder.append(name);
            bli.m894c(str, stringBuilder.toString());
            return j;
        }
        name = String.valueOf(file);
        stringBuilder = new StringBuilder(String.valueOf(name).length() + 52);
        stringBuilder.append("Failed to write ");
        stringBuilder.append(j);
        stringBuilder.append(" bytes to  file ");
        stringBuilder.append(name);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final OutputStream mo7394b(File file) {
        return new FileOutputStream(file);
    }

    /* JADX WARNING: Missing block: B:16:?, code:
            r0.close();
     */
    /* renamed from: a */
    public final long mo7391a(java.io.File r5, java.io.InputStream r6) {
        /*
        r4 = this;
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0011 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x0011 }
        r2 = com.google.common.p006io.ByteStreams.copy(r6, r0);	 Catch:{ all -> 0x001a }
        r0.close();	 Catch:{ IOException -> 0x0011 }
        r0 = p000.gsj.m11694a(r5, r2);
        return r0;
    L_0x0011:
        r0 = move-exception;
        r1 = f19559a;
        r2 = "Failed to write file.";
        p000.bli.m892b(r1, r2, r0);
        throw r0;
    L_0x001a:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x001c }
    L_0x001c:
        r2 = move-exception;
        r0.close();	 Catch:{ all -> 0x0021 }
    L_0x0020:
        throw r2;	 Catch:{ IOException -> 0x0011 }
    L_0x0021:
        r0 = move-exception;
        p000.kqg.m5105a(r1, r0);	 Catch:{ IOException -> 0x0011 }
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: gsj.a(java.io.File, java.io.InputStream):long");
    }

    /* renamed from: a */
    private static long m11695a(File file, InputStream inputStream, ExifInterface exifInterface) {
        try {
            String absolutePath = file.getAbsolutePath();
            if (inputStream == null || absolutePath == null) {
                throw new IllegalArgumentException("Argument is null");
            }
            OutputStream a = exifInterface.mo12671a(absolutePath);
            ExifInterface.m8584a(inputStream, a);
            a.flush();
            a.close();
            return gsj.m11694a(file, file.length());
        } catch (Throwable e) {
            bli.m892b(f19559a, "Failed to write file.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final long mo7392a(File file, InputStream inputStream, kbg kbg) {
        if (kbg.mo9709b()) {
            return gsj.m11695a(file, inputStream, (ExifInterface) kbg.mo9706a());
        }
        return mo7391a(file, inputStream);
    }
}
