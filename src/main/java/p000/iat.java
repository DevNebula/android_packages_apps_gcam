package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: iat */
public final class iat {
    /* renamed from: a */
    public Set f7246a = new HashSet();
    /* renamed from: b */
    private Map f7247b = new HashMap();

    /* renamed from: a */
    public final GoogleSignInOptions mo8311a() {
        return new GoogleSignInOptions(3, new ArrayList(this.f7246a), null, false, false, false, null, null, this.f7247b);
    }
}
