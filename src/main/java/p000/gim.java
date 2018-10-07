package p000;

import android.annotation.TargetApi;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gim */
public final class gim implements iqo {
    /* renamed from: a */
    public final fkp f19201a;
    /* renamed from: b */
    private final gnu f19202b;
    /* renamed from: c */
    private final gsl f19203c;

    /* renamed from: a */
    public static /* synthetic */ void m11306a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5105a(th, th2);
                return;
            }
        }
        outputStream.close();
    }

    public gim(fkp fkp, gsl gsl, gnu gnu) {
        this.f19201a = fkp;
        this.f19203c = gsl;
        this.f19202b = gnu;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final File mo13357a(fkp fkp) {
        Long l = (Long) fkp.mo15528a(fkr.f4834e);
        File file = new File(this.f19202b.mo7265a("burst"), String.format(Locale.US, "burst-%d", new Object[]{l}));
        if (this.f19203c.mo7398c(file)) {
            return new File(file, jxr.m4736a(fkp.mo13744f()));
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not create burst directory: ");
        stringBuilder.append(valueOf);
        throw new IOException(stringBuilder.toString());
    }
}
