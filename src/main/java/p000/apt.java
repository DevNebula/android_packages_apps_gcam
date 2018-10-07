package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apt */
public final class apt {
    /* renamed from: a */
    private final List f866a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo1666a(ImageHeaderParser imageHeaderParser) {
        this.f866a.add(imageHeaderParser);
    }

    /* renamed from: a */
    public final synchronized List mo1665a() {
        return this.f866a;
    }
}
