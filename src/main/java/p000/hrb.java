package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hrb */
public enum hrb {
    BADGE("badge"),
    EDIT("edit"),
    INTERACT("interact"),
    LAUNCH("launch");
    
    /* renamed from: f */
    private static final Set f6836f = null;
    /* renamed from: e */
    private final String f6838e;

    static {
        f6836f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{BADGE.toString(), EDIT.toString(), INTERACT.toString()})));
        Set hashSet = new HashSet(f6836f);
        hashSet.add(LAUNCH.toString());
        Collections.unmodifiableSet(hashSet);
    }

    private hrb(String str) {
        this.f6838e = str;
    }

    public final String toString() {
        return this.f6838e;
    }
}
