package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gly */
public class gly implements glm {
    public gly(ira ira) {
        ira.mo8854a("BitmapEncoder");
    }

    /* renamed from: a */
    public static List m11392a(List list, String str) {
        Object[] split = str.split(",");
        if (split.length == 0) {
            return list;
        }
        Set hashSet = new HashSet(khb.m4924a(split));
        List arrayList = new ArrayList();
        for (iqp iqp : list) {
            if (!gly.m11394a(iqp, hashSet)) {
                arrayList.add(iqp);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m11394a(iqp iqp, Set set) {
        int i = iqp.f7695a;
        int i2 = iqp.f7696b;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return set.contains(stringBuilder.toString());
    }

    /* renamed from: a */
    public static gqd m11391a(Runnable runnable) {
        jri.m13404b((Object) runnable);
        return new gqg(runnable);
    }

    public void onCaptureCanceled(int i, int i2) {
    }

    public void onCaptureDeleted() {
    }

    public void onCaptureFailed(int i, int i2) {
    }

    public void onCaptureFinalized() {
    }

    public void onCapturePersisted(int i, int i2) {
    }

    public void onCaptureStartCommitted(int i, int i2) {
    }

    public void onCaptureStarted(glw glw) {
    }

    public void onMediumThumb() {
    }

    public void onTinyThumb() {
    }

    /* renamed from: a */
    public static void m11393a(kwk kwk, Executor executor) {
        executor.execute(new gqe(kwk));
    }
}
