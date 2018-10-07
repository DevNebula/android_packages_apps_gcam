package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jtm */
public final class jtm implements jtl {
    /* renamed from: a */
    private FeatureTable f21736a;

    public jtm(FeatureTable featureTable) {
        jri.m13404b((Object) featureTable);
        this.f21736a = featureTable;
    }

    /* renamed from: a */
    public final jtv mo9552a(String str) {
        String group;
        int parseInt;
        int i = 0;
        CharSequence toUpperCase = str.toUpperCase();
        Matcher matcher = Pattern.compile("^(.+):(\\d+)$").matcher(toUpperCase);
        if (matcher.matches()) {
            group = matcher.group(1);
            parseInt = Integer.parseInt(matcher.group(2));
        } else {
            CharSequence group2 = toUpperCase;
            parseInt = 0;
        }
        for (jza name : jza.values()) {
            if (name.name().equals(group2)) {
                i = 1;
                break;
            }
        }
        if (i != 0) {
            return new juc(this.f21736a, jza.m4766a(group2), parseInt);
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21736a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
        stringBuilder.append("FeatureTableFeatureScorerProvider[featureTable = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
