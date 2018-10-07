package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor.Builder;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.vision.face.Face;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjg */
public final class jjg extends jip {
    /* renamed from: d */
    private final Map f24749d;
    /* renamed from: e */
    private final jzp f24750e;
    /* renamed from: f */
    private final ByteBuffer f24751f;

    public jjg(String str, int i, long j, Map map, jzp jzp, ByteBuffer byteBuffer) {
        boolean z = false;
        super(str, i, j);
        jri.m13404b((Object) map);
        jri.m13404b((Object) jzp);
        if (jzp.f8515a > 0 && jzp.f8516b > 0) {
            z = true;
        }
        jri.m13395a(z);
        jri.m13404b((Object) byteBuffer);
        this.f24749d = kes.m4866a(map);
        this.f24750e = jzp;
        this.f24751f = byteBuffer;
    }

    /* renamed from: c */
    private final jwx m16606c(jrg jrg) {
        return new jwx(this.f21537a, GDepthUtil.MIME_JPEG, this.f21539c, jrg.f21668a, jrg.f21669b);
    }

    /* renamed from: b */
    final float mo15045b(jrg jrg) {
        return ((float) jrg.f21668a) / ((float) this.f24750e.f8515a);
    }

    /* renamed from: a */
    public final Collection mo13807a() {
        return this.f24749d.keySet();
    }

    /* renamed from: a */
    public final jaq mo9466a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) jxo);
        jri.m13404b((Object) executor);
        return m16605a(jrg, executor, jqo).mo9275a(executor, jkm.m13147a(jxo, m16606c(jrg)));
    }

    /* renamed from: a */
    private final jaq m16605a(jrg jrg, Executor executor, jqo jqo) {
        int i;
        int i2;
        int i3;
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) executor);
        Iterable arrayList = new ArrayList();
        float b = mo15045b(jrg);
        for (Entry entry : this.f24749d.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            if (!(list == null || list.isEmpty())) {
                List arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                i = 0;
                i2 = 0;
                while (true) {
                    i3 = i;
                    if (i3 >= list.size()) {
                        break;
                    }
                    Face face = (Face) list.get(i3);
                    if (FaceUtils.hasAllLandmarks(face) && FaceUtils.hasAllProbabilities(face)) {
                        Rect scaledBoundingBox = FaceUtils.getScaledBoundingBox(face, b);
                        if (scaledBoundingBox.intersect(0, 0, jrg.f21668a - 1, jrg.f21669b - 1)) {
                            Rect rect = new Rect(i2, 0, scaledBoundingBox.width() + i2, scaledBoundingBox.height());
                            i2 += scaledBoundingBox.width();
                            arrayList2.add(face);
                            arrayList3.add(Pair.create(scaledBoundingBox, rect));
                        }
                    }
                    i = i3 + 1;
                }
                arrayList.add(new jjl(longValue, arrayList3, arrayList2));
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < arrayList.size()) {
            Iterator it = ((jjl) arrayList.get(i4)).f8250b.iterator();
            i = 0;
            int i7 = 0;
            while (true) {
                i3 = i7;
                i2 = i;
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                i = ((Rect) pair.second).width() + i2;
                i7 = Math.max(i3, ((Rect) pair.second).height());
            }
            i2 = Math.max(i6, i2);
            i4++;
            i5 = Math.max(i5, i3);
            i6 = i2;
        }
        jzp a = jzp.m4772a(i6, i5);
        FaceEditor build = new Builder().setFrameDimensions(a.f8515a, a.f8516b).setPittPattAsDetector(this.f24751f).setAllSmilesAsOutput().build();
        return jli.m13198b(arrayList, executor, new jjh(this, jrg, jqo, build, a)).mo9275a(executor, new jjk(jqo, build)).mo9277a(executor, new jjm(jrg, jqo, arrayList)).mo9279a(executor, new jjj(build));
    }

    /* renamed from: a */
    public final jaq mo9465a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return m16605a(jrg, executor, jqo).mo9275a(executor, jkm.m13146a(jqo, context));
    }
}
