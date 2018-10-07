package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juh */
public final class juh implements Iterable {
    /* renamed from: a */
    public final List f8350a;
    /* renamed from: b */
    public final Set f8351b;
    /* renamed from: c */
    public final long f8352c;
    /* renamed from: d */
    public final long f8353d;

    public juh(Collection collection) {
        this(collection, -1, -1);
    }

    public juh(Collection collection, long j, long j2) {
        this(collection, j, j2, EnumSet.noneOf(jui.class));
    }

    public juh(Collection collection, long j, long j2, Set set) {
        this.f8350a = khb.m4955c((Iterable) collection);
        this.f8351b = khb.m4950b((Iterable) set);
        Collections.sort(this.f8350a);
        if (j == -1 && this.f8350a.size() != 0) {
            j = ((Long) this.f8350a.get(0)).longValue();
        }
        this.f8352c = j;
        if (j2 == -1 && this.f8350a.size() != 0) {
            List list = this.f8350a;
            j2 = ((Long) list.get(list.size() - 1)).longValue();
        }
        this.f8353d = j2;
        long j3 = this.f8353d;
        long j4 = this.f8352c;
        if (j3 < j4) {
            StringBuilder stringBuilder = new StringBuilder(71);
            stringBuilder.append("Segment range is negative: ");
            stringBuilder.append(j4);
            stringBuilder.append(" to ");
            stringBuilder.append(j3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (Long longValue : this.f8350a) {
            j4 = longValue.longValue();
            long j5 = this.f8352c;
            if (j4 >= j5) {
                if (j4 > this.f8353d) {
                }
            }
            long j6 = this.f8353d;
            StringBuilder stringBuilder2 = new StringBuilder(93);
            stringBuilder2.append("Frame ");
            stringBuilder2.append(j4);
            stringBuilder2.append(" is not within segment [");
            stringBuilder2.append(j5);
            stringBuilder2.append(", ");
            stringBuilder2.append(j6);
            stringBuilder2.append("]");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public juh(Collection collection, Set set) {
        this(collection, -1, -1, set);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof juh)) {
            return false;
        }
        juh juh = (juh) obj;
        if (juh.f8352c == this.f8352c && juh.f8353d == this.f8353d && juh.f8351b.equals(this.f8351b) && juh.f8350a.equals(this.f8350a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo9561a() {
        jri.m13406b(mo9563b() ^ 1, (Object) "No frames in segment");
        return ((Long) this.f8350a.get(0)).longValue();
    }

    /* renamed from: a */
    public final boolean mo9562a(jui jui) {
        return this.f8351b.contains(jui);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f8352c), Long.valueOf(this.f8353d), this.f8350a, this.f8351b});
    }

    /* renamed from: b */
    public final boolean mo9563b() {
        return this.f8350a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f8350a.iterator();
    }

    /* renamed from: c */
    public final long mo9564c() {
        jri.m13406b(mo9563b() ^ 1, (Object) "No frames in segment");
        List list = this.f8350a;
        return ((Long) list.get(list.size() - 1)).longValue();
    }

    /* renamed from: d */
    public final int mo9565d() {
        return this.f8350a.size();
    }

    public final String toString() {
        long j = this.f8352c;
        long j2 = this.f8353d;
        String valueOf = String.valueOf(this.f8351b);
        int size = this.f8350a.size();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 82);
        stringBuilder.append("[range=");
        stringBuilder.append(j);
        stringBuilder.append(":");
        stringBuilder.append(j2);
        stringBuilder.append(", labels=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", frameCount=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
