package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ajd */
final class ajd implements adw {
    /* renamed from: a */
    private final String f10331a;
    /* renamed from: b */
    private final ajc f10332b;
    /* renamed from: c */
    private Object f10333c;

    ajd(String str, ajc ajc) {
        this.f10331a = str;
        this.f10332b = ajc;
    }

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
        try {
            ((InputStream) this.f10333c).close();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public final Class mo186a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        try {
            String str = this.f10331a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    this.f10333c = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    adx.mo192a(this.f10333c);
                    return;
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            }
            throw new IllegalArgumentException("Not a valid image data URL.");
        } catch (Exception e) {
            adx.mo191a(e);
        }
    }
}
