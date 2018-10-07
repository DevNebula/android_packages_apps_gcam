package p000;

import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gli */
final class gli implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glf f5606a;

    gli(glf glf) {
        this.f5606a = glf;
    }

    public final void run() {
        String valueOf;
        try {
            glf glf = this.f5606a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(glf.f24413c.mo7399d((File) jri.m13404b(glf.f24412b.mo7273a()))));
            if (bitmapDrawable.getBitmap() == null) {
                glf glf2 = this.f5606a;
                valueOf = String.valueOf(((File) jri.m13404b(glf2.f24412b.mo7273a())).getAbsolutePath());
                String str = "Could not decode preview file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                glf2.mo14930b(valueOf);
                return;
            }
            glf = this.f5606a;
            glf.f24415e.mo7235a((gmq) jri.m13404b(glf.f24416f), new alt(bitmapDrawable, new agx()));
            glf = this.f5606a;
            glf.f24414d.mo7244a((Uri) jri.m13404b(glf.f24417g));
        } catch (IOException e) {
            IOException iOException = e;
            glf glf3 = this.f5606a;
            valueOf = ((File) jri.m13404b(glf3.f24412b.mo7273a())).getAbsolutePath();
            String message = iOException.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(message).length());
            stringBuilder.append("Could not read preview file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(message);
            glf3.mo14930b(stringBuilder.toString());
        }
    }
}
