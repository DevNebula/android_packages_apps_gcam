package p000;

import android.util.Pair;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.vision.face.Face;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: juz */
public final class juz extends jum {
    /* renamed from: a */
    private final jxm f24831a;
    /* renamed from: b */
    private final float f24832b;
    /* renamed from: c */
    private final float f24833c;
    /* renamed from: d */
    private final float f24834d;

    public juz(jxm jxm) {
        this(jxm, (byte) 0);
    }

    private juz(jxm jxm, byte b) {
        jri.m13404b((Object) jxm);
        this.f24831a = jxm;
        this.f24832b = 0.25f;
        this.f24833c = 0.25f;
        this.f24834d = 0.5f;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        if (juh.mo9563b()) {
            return juh;
        }
        Map hashMap = new HashMap();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            for (Face face : (List) this.f24831a.mo9599a(longValue).mo9589a(jxa.f8412c)) {
                if (FaceUtils.hasAllProbabilities(face)) {
                    Integer valueOf = Integer.valueOf(face.getTrackId());
                    float joyScore = FaceUtils.getJoyScore(face, this.f24832b, this.f24833c, this.f24834d);
                    if (!hashMap.containsKey(valueOf) || joyScore > ((Float) ((Pair) hashMap.get(valueOf)).second).floatValue()) {
                        hashMap.put(valueOf, Pair.create(Long.valueOf(longValue), Float.valueOf(joyScore)));
                    }
                }
            }
        }
        Collection hashSet = new HashSet();
        for (Entry value : hashMap.entrySet()) {
            hashSet.add((Long) ((Pair) value.getValue()).first);
        }
        return new juh(hashSet);
    }

    public final String toString() {
        float f = this.f24832b;
        float f2 = this.f24833c;
        float f3 = this.f24834d;
        StringBuilder stringBuilder = new StringBuilder(152);
        stringBuilder.append("MaxJoyFaceSegmentFilter[isLeftEyeOpenScoreWeight = ");
        stringBuilder.append(f);
        stringBuilder.append(", isRightEyeOpenScoreWeight = ");
        stringBuilder.append(f2);
        stringBuilder.append(", isSmilingScoreWeight = ");
        stringBuilder.append(f3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
