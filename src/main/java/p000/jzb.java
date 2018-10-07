package p000;

import com.google.android.libraries.smartburst.utils.FloatArray;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jzb */
public final class jzb implements Iterator {
    /* renamed from: a */
    private int f8498a = 0;
    /* renamed from: b */
    private final /* synthetic */ FloatArray f8499b;

    public jzb(FloatArray floatArray) {
        this.f8499b = floatArray;
    }

    public final boolean hasNext() {
        return this.f8498a < this.f8499b.f2663b;
    }

    public final /* synthetic */ Object next() {
        float[] fArr = this.f8499b.f2662a;
        int i = this.f8498a;
        this.f8498a = i + 1;
        return Float.valueOf(fArr[i]);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported in FloatArray!");
    }
}
