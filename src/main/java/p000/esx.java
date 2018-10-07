package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: esx */
public final class esx implements gqd {
    /* renamed from: a */
    private static final String f17758a = bli.m887a("ScanResumeBehav");
    /* renamed from: b */
    private final gsp f17759b;
    /* renamed from: c */
    private final gtf f17760c;
    /* renamed from: d */
    private final Context f17761d;
    /* renamed from: e */
    private final AtomicBoolean f17762e = new AtomicBoolean(false);

    public esx(gsp gsp, gtf gtf, Context context) {
        this.f17759b = gsp;
        this.f17760c = gtf;
        this.f17761d = context;
    }

    public final void run() {
        String str;
        String valueOf;
        try {
            if (!this.f17762e.getAndSet(true)) {
                File parentFile = this.f17760c.mo7435a("arbitrary").getParentFile();
                File parentFile2 = this.f17760c.mo7436a("arbitrary", ixx.JPEG).getParentFile();
                if (parentFile != null && parentFile.exists() && parentFile2 != null) {
                    File[] listFiles = parentFile.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (file.getName().endsWith(".jpg.tmp")) {
                                parentFile = new File(parentFile2, file.getName().replace(".tmp", ""));
                                str = f17758a;
                                valueOf = String.valueOf(file);
                                String valueOf2 = String.valueOf(parentFile);
                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
                                stringBuilder.append("Restoring JPEG ");
                                stringBuilder.append(valueOf);
                                stringBuilder.append(" to ");
                                stringBuilder.append(valueOf2);
                                bli.m888a(str, stringBuilder.toString());
                                kiz.m5030a(file, parentFile);
                                this.f17759b.mo7402a(this.f17761d, parentFile.getAbsolutePath());
                            } else if (!file.getName().equals(".nomedia")) {
                                str = f17758a;
                                valueOf = "Unknown file found in failsafe dir: ";
                                String valueOf3 = String.valueOf(file.getAbsolutePath());
                                if (valueOf3.length() == 0) {
                                    valueOf3 = new String(valueOf);
                                } else {
                                    valueOf3 = valueOf.concat(valueOf3);
                                }
                                bli.m898e(str, valueOf3);
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            str = f17758a;
            valueOf = "Failed to recover file ";
            String valueOf4 = String.valueOf(file.getAbsolutePath());
            if (valueOf4.length() == 0) {
                valueOf4 = new String(valueOf);
            } else {
                valueOf4 = valueOf.concat(valueOf4);
            }
            bli.m892b(str, valueOf4, e);
        } catch (Throwable e2) {
            bli.m892b(f17758a, "Failed to restore JPEG files", e2);
        }
    }
}
