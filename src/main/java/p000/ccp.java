package p000;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* renamed from: ccp */
public final class ccp {
    /* renamed from: a */
    public final ProviderInfo f1869a;
    /* renamed from: b */
    public final Context f1870b;

    public ccp(ContentProvider contentProvider, ProviderInfo providerInfo) {
        this.f1869a = providerInfo;
        this.f1870b = contentProvider.getContext();
    }
}
