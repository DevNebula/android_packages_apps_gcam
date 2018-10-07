package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gmm */
final class gmm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gmi f5678a;

    gmm(gmi gmi) {
        this.f5678a = gmi;
    }

    public final void run() {
        String valueOf;
        try {
            gmi gmi = this.f5678a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(gmi.f26436c.mo7399d((File) jri.m13404b(gmi.f26435b.mo7273a()))));
            if (bitmapDrawable.getBitmap() == null) {
                gmi gmi2 = this.f5678a;
                valueOf = String.valueOf(((File) jri.m13404b(gmi2.f26435b.mo7273a())).getAbsolutePath());
                String str = "Could not decode preview file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                gmi2.mo14922b(valueOf);
                return;
            }
            gkt gkt = this.f5678a;
            gkt.f24404u.mo7235a((gmq) jri.m13404b(gkt.f24397n), new alt(bitmapDrawable, new agx()));
            gkt = this.f5678a;
            gkt.mo14914a(gkt.f24402s);
        } catch (IOException e) {
            IOException iOException = e;
            gmi gmi3 = this.f5678a;
            valueOf = ((File) jri.m13404b(gmi3.f26435b.mo7273a())).getAbsolutePath();
            String message = iOException.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(message).length());
            stringBuilder.append("Could not read preview file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(message);
            gmi3.mo14922b(stringBuilder.toString());
        }
    }
}
