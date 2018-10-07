package p000;

import android.util.ArraySet;
import com.google.googlex.gcam.GcamSwigLoader;
import com.google.googlex.gcam.GoudaSwigWrapper;
import com.google.googlex.gcam.JniUtilsJniLoader;
import com.google.googlex.gcam.image.ImageJniLoader;
import com.google.googlex.gcam.imageproc.ImageProcJniLoader;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: gcp */
public final class gcp {
    static {
        GcamSwigLoader.initialize();
        JniUtilsJniLoader.initialize();
        ImageJniLoader.initialize();
        ImageProcJniLoader.initialize();
    }

    /* renamed from: a */
    public static gds m2536a(gcv gcv) {
        return gcv;
    }

    /* renamed from: a */
    public static Executor m2537a(ikd ikd) {
        return new ikh(ikd, Executors.newSingleThreadExecutor(iel.m3778c("GoudaProc", 0)));
    }

    /* renamed from: a */
    public static fov m2535a() {
        return new fov(1);
    }

    /* renamed from: b */
    public static GoudaSwigWrapper m2538b() {
        return new GoudaSwigWrapper();
    }

    /* renamed from: c */
    public static Set m2539c() {
        Set arraySet = new ArraySet();
        arraySet.add(gdp.f5331c);
        arraySet.add(gdp.f5329a);
        arraySet.add(gdp.f5330b);
        arraySet.add(gdp.f5332d);
        arraySet.add(gdp.f5333e);
        return arraySet;
    }
}
