package p000;

import java.util.Collection;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: inc */
public enum inc {
    FPS_AUTO(30, 30),
    FPS_30(30, 30),
    FPS_60(60, 60),
    FPS_120(120, 30),
    FPS_240(240, 30);
    
    /* renamed from: f */
    public final int f7508f;
    /* renamed from: g */
    public final int f7509g;

    private inc(int i, int i2) {
        this.f7508f = i;
        this.f7509g = i2;
    }

    /* renamed from: a */
    public final int mo8635a() {
        return this.f7508f / this.f7509g;
    }

    /* renamed from: b */
    public static Collection m3931b() {
        Collection linkedList = new LinkedList();
        for (inc inc : inc.values()) {
            if (inc.mo8637d()) {
                linkedList.add(inc);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public final boolean mo8636c() {
        return this.f7508f == this.f7509g;
    }

    /* renamed from: d */
    public final boolean mo8637d() {
        return this.f7508f > this.f7509g;
    }

    /* renamed from: a */
    public static inc m3930a(String str) {
        return (inc) Enum.valueOf(inc.class, str);
    }
}
