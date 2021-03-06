package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jte */
public final class jte implements jtf {
    /* renamed from: a */
    private final jtf[] f21725a;

    public jte(jtf[] jtfArr) {
        this.f21725a = jtfArr;
    }

    /* renamed from: a */
    public final List mo9546a(Bitmap bitmap) {
        jri.m13404b((Object) bitmap);
        List arrayList = new ArrayList();
        for (jtf a : this.f21725a) {
            arrayList.addAll(a.mo9546a(bitmap));
        }
        return arrayList;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21725a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 34);
        stringBuilder.append("ComboFeatureExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
