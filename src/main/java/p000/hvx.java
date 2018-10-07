package p000;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: hvx */
public final class hvx {
    /* renamed from: a */
    public final Account f7111a;
    /* renamed from: b */
    public final Set f7112b;
    /* renamed from: c */
    public final Set f7113c;
    /* renamed from: d */
    public final Map f7114d;
    /* renamed from: e */
    public final String f7115e;
    /* renamed from: f */
    public final String f7116f;
    /* renamed from: g */
    public final iav f7117g;
    /* renamed from: h */
    public Integer f7118h;

    public hvx(Account account, Set set, Map map, String str, String str2, iav iav) {
        this.f7111a = account;
        this.f7112b = set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f7114d = map;
        this.f7115e = str;
        this.f7116f = str2;
        this.f7117g = iav;
        Set hashSet = new HashSet(this.f7112b);
        Iterator it = this.f7114d.values().iterator();
        while (it.hasNext()) {
            it.next();
            hashSet.addAll(null);
        }
        this.f7113c = Collections.unmodifiableSet(hashSet);
    }
}
