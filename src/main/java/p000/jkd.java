package p000;

import android.util.Pair;
import com.google.android.libraries.smartburst.artifacts.gifutils.LZWEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: jkd */
final class jkd implements izi {
    /* renamed from: a */
    private final jje f21568a;
    /* renamed from: b */
    private final jzp f21569b;
    /* renamed from: c */
    private final int f21570c;
    /* renamed from: d */
    private final int f21571d;

    public jkd(jje jje, jzp jzp, int i, int i2) {
        this.f21568a = jje;
        this.f21569b = jzp;
        this.f21570c = i;
        this.f21571d = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        Pair pair = (Pair) obj;
        int i = this.f21570c;
        if (((Integer) pair.second).intValue() == this.f21571d - 1) {
            i += 500;
        }
        jje jje = this.f21568a;
        Object obj2 = (ByteBuffer) pair.first;
        jzp jzp = this.f21569b;
        int i2 = jzp.f8515a;
        int i3 = jzp.f8516b;
        int intValue = ((Integer) pair.second).intValue();
        int i4 = this.f21571d;
        jri.m13404b(obj2);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13395a(z2);
        if (intValue < 0) {
            z3 = false;
        } else if (intValue < i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        jri.m13395a(z3);
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        jri.m13395a(z3);
        if (i < 0) {
            z4 = false;
        }
        jri.m13395a(z4);
        jri.m13404b(obj2);
        jri.m13395a(z);
        jri.m13395a(z2);
        obj2.order(ByteOrder.nativeOrder());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(768);
        allocateDirect.order(ByteOrder.nativeOrder());
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i2 * i3);
        allocateDirect2.order(ByteOrder.nativeOrder());
        jje.f8245a.mo9473a(obj2, allocateDirect, allocateDirect2, i2, i3);
        Pair create = Pair.create(allocateDirect, allocateDirect2);
        return LZWEncoder.m1384a((ByteBuffer) create.first, (ByteBuffer) create.second, i2, i3, intValue, i4, i, jje.f8247c, jje.f8246b, 0);
    }
}
