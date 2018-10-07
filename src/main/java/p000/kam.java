package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: kam */
final class kam extends C0682gc {
    /* renamed from: i */
    private List f24895i;
    /* renamed from: j */
    private List f24896j;

    static {
        kam.class.getCanonicalName();
    }

    kam(Context context) {
        super(context.getApplicationContext());
    }

    kam(Context context, List list) {
        this(context);
        this.f24896j = list;
    }

    /* renamed from: a */
    private final void m16773a(List list) {
        this.f24895i = list;
        super.mo7097b(list);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13322b() {
        Collection treeSet = new TreeSet();
        treeSet.addAll(jqk.m13337a(jqk.m13332a(this.f5364d.getApplicationContext(), "third_party_license_metadata", 0, -1), ""));
        List<String> list = this.f24896j;
        if (list != null) {
            for (String str : list) {
                Collection a;
                String a2 = jqk.m13335a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a2 != null) {
                    a = jqk.m13337a(a2, str);
                } else {
                    a = new ArrayList();
                }
                treeSet.addAll(a);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: e */
    protected final void mo7100e() {
        List list = this.f24895i;
        if (list != null) {
            m16773a(list);
        } else {
            mo7099d();
        }
    }

    /* renamed from: f */
    protected final void mo7101f() {
        mo7098c();
    }
}
