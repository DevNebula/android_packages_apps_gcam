package p000;

import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: igo */
public final class igo {
    /* renamed from: a */
    public final PutDataRequest f7366a;
    /* renamed from: b */
    public final igj f7367b = new igj();

    private igo(PutDataRequest putDataRequest) {
        this.f7366a = putDataRequest;
    }

    /* renamed from: a */
    public static igo m3801a(String str) {
        return new igo(PutDataRequest.m15391a(str));
    }
}
