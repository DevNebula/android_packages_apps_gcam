package p000;

import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.InitParams;

/* compiled from: PG */
/* renamed from: bym */
public interface bym {
    /* renamed from: a */
    byx mo2214a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp);

    /* renamed from: a */
    byx mo2215a(int i, bzx bzx, fwa fwa, fxi fxi, iwp iwp);

    /* renamed from: a */
    AeResults mo2216a(byx byx, iwp iwp, iwz iwz);

    /* renamed from: a */
    BurstSpec mo2217a(byx byx);

    /* renamed from: a */
    BurstSpec mo2218a(byx byx, AeResults aeResults);

    /* renamed from: a */
    InitParams mo2219a();

    /* renamed from: a */
    void mo2220a(byx byx, int i, iwp iwp, iwz iwz);

    /* renamed from: a */
    void mo2221a(byx byx, int i, iwp iwp, iwz iwz, iwz iwz2, Face[] faceArr);

    /* renamed from: a */
    void mo2222a(byx byx, BurstSpec burstSpec);

    /* renamed from: a */
    boolean mo2223a(int i);

    /* renamed from: b */
    BurstSpec mo2224b(byx byx);

    /* renamed from: b */
    boolean mo2225b(int i);

    /* renamed from: c */
    int mo2226c(int i);

    /* renamed from: c */
    boolean mo2227c(byx byx);
}
