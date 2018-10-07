package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hl */
final class C0270hl implements Callable {
    /* renamed from: a */
    private final /* synthetic */ Context f6699a;
    /* renamed from: b */
    private final /* synthetic */ C0268hj f6700b;
    /* renamed from: c */
    private final /* synthetic */ int f6701c;
    /* renamed from: d */
    private final /* synthetic */ String f6702d;

    C0270hl(Context context, C0268hj c0268hj, int i, String str) {
        this.f6699a = context;
        this.f6700b = c0268hj;
        this.f6701c = i;
        this.f6702d = str;
    }

    public final /* synthetic */ Object call() {
        C0274hr a = C0269hk.m3272a(this.f6699a, this.f6700b, this.f6701c);
        if (a.f6830a != null) {
            C0269hk.f6650a.mo8654a(this.f6702d, a.f6830a);
        }
        return a;
    }
}
