package p000;

import android.content.UriMatcher;

/* compiled from: PG */
/* renamed from: blb */
public final class blb {
    /* renamed from: a */
    public ccp f1287a;
    /* renamed from: b */
    public final /* synthetic */ cgn f1288b;

    public blb(cgn cgn, ccp ccp) {
        this.f1288b = cgn;
        this.f1287a = (ccp) ktm.m14218a((Object) ccp);
    }

    /* renamed from: a */
    public final UriMatcher mo2010a() {
        String a = ccq.m8109a(this.f1287a);
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(a, "type/*", 1);
        uriMatcher.addURI(a, "data/*", 2);
        uriMatcher.addURI(a, "icon/#/badge", 3);
        uriMatcher.addURI(a, "icon/#/interact", 4);
        uriMatcher.addURI(a, "icon/#/dialog", 5);
        uriMatcher.addURI(a, "delete/#", 6);
        uriMatcher.addURI(a, "processing", 7);
        uriMatcher.addURI(a, "processing/#", 8);
        return (UriMatcher) ktm.m14219a(uriMatcher, "Cannot return null from a non-@Nullable @Provides method");
    }
}
