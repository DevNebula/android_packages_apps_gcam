package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjr */
public final class jjr extends jip {
    /* renamed from: d */
    private final jiv f24756d;
    /* renamed from: e */
    private final List f24757e;

    public jjr(jiv jiv, List list, String str, int i, long j) {
        super(str, i, j);
        jri.m13404b((Object) jiv);
        jri.m13404b((Object) list);
        this.f24756d = jiv;
        this.f24757e = list;
    }

    /* renamed from: a */
    private final int[] m16615a(int i) {
        jiv jiv = this.f24756d;
        int i2 = jiv.f8223a;
        int i3 = jiv.f8224b;
        if (i2 < i3) {
            i3 = Math.round((((float) i2) * ((float) i)) / ((float) i3));
        } else {
            int round = Math.round((((float) i3) * ((float) i)) / ((float) i2));
            i3 = i;
            i = round;
        }
        return new int[]{i3, i};
    }

    /* renamed from: c */
    private final jwx m16616c() {
        int[] a = m16615a(2500);
        return new jwx(this.f21537a, GDepthUtil.MIME_JPEG, this.f21539c, a[0], a[1]);
    }

    /* renamed from: a */
    public final Collection mo13807a() {
        Collection arrayList = new ArrayList();
        for (jkq jkq : this.f24757e) {
            arrayList.add(Long.valueOf(jkq.f8261b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final jaq mo9466a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        return m16614a(this.f24757e, jrg, jqo, 2500, executor).mo9275a(executor, jkm.m13147a(jxo, m16616c()));
    }

    /* renamed from: a */
    public final jaq mo9465a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return m16614a(this.f24757e, jrg, jqo, 640, executor).mo9275a(executor, jkm.m13146a(jqo, context));
    }

    /* renamed from: a */
    private final jaq m16614a(List list, jrg jrg, jqo jqo, int i, Executor executor) {
        boolean z;
        if (this.f24756d.f8228f.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jiv jiv = this.f24756d;
        int max = Math.max(jiv.f8223a, jiv.f8224b);
        int[] a = m16615a(i);
        Object a2 = jqp.m4671a(jqo, jzp.m4772a(a[0], a[1]), "collage canvas");
        return jli.m13198b((Iterable) list, executor, new jjs(jrg, ((float) i) / ((float) max), jqo, a2)).mo9275a(executor, ion.m3999a(a2));
    }
}
