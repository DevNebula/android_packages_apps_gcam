package p000;

import android.net.Uri;
import android.provider.MediaStore.Files;

/* compiled from: PG */
/* renamed from: eqf */
public final class eqf implements kwk {
    /* renamed from: a */
    public static final eqf f17643a = new eqf();

    /* renamed from: b */
    public static Uri m9990b() {
        return (Uri) ktm.m14219a(Files.getContentUri("external"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
