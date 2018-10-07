package p000;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: ro */
final class C0456ro {
    /* renamed from: a */
    public int f9638a = 0;
    /* renamed from: b */
    public boolean f9639b = false;
    /* renamed from: c */
    public float f9640c = -1.0f;
    /* renamed from: d */
    public float f9641d = -1.0f;
    /* renamed from: e */
    public float f9642e = -1.0f;
    /* renamed from: f */
    public int[] f9643f = new int[0];
    /* renamed from: g */
    public boolean f9644g = false;
    /* renamed from: h */
    public final Context f9645h;
    /* renamed from: i */
    private final TextView f9646i;

    static {
        RectF rectF = new RectF();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }

    C0456ro(TextView textView) {
        this.f9646i = textView;
        this.f9645h = this.f9646i.getContext();
    }

    /* renamed from: a */
    static int[] m5818a(int[] iArr) {
        int size;
        if (size != 0) {
            int i;
            Arrays.sort(iArr);
            List arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0) {
                    Integer valueOf = Integer.valueOf(i2);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (size != arrayList.size()) {
                size = arrayList.size();
                iArr = new int[size];
                for (i = 0; i < size; i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    final boolean mo11026a() {
        return (this.f9646i instanceof C0439qu) ^ 1;
    }
}
