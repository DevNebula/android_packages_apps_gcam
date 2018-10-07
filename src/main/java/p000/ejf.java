package p000;

import android.graphics.Point;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: ejf */
public final class ejf {
    /* renamed from: a */
    private static final String f3868a = bli.m887a("CameraSizeUtility");
    /* renamed from: b */
    private static ejg f3869b = null;
    /* renamed from: c */
    private static ejg f3870c = null;
    /* renamed from: d */
    private static ejg f3871d = null;

    /* renamed from: b */
    private static ejg m1812b(aaz aaz, int i) {
        int i2;
        double d;
        int i3;
        int i4;
        double d2;
        int i5;
        double d3;
        double d4;
        double abs;
        int i6;
        List a = aaz.mo45a();
        List c = aaz.mo51c();
        int[] iArr = new int[a.size()];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = i7;
            if (i2 >= a.size()) {
                break;
            }
            iArr[i2] = -1;
            d = ((double) ((abw) a.get(i2)).f178a.x) / ((double) ((abw) a.get(i2)).f178a.y);
            i7 = 0;
            i3 = Integer.MAX_VALUE;
            while (true) {
                i4 = i7;
                if (i4 >= c.size()) {
                    break;
                }
                if (Math.abs(d - (((double) ((abw) c.get(i4)).f178a.x) / ((double) ((abw) c.get(i4)).f178a.y))) < 0.03d && ((abw) c.get(i4)).f178a.x < 640) {
                    i7 = Math.abs(((abw) c.get(i4)).f178a.x - 320);
                    if (i7 < i3) {
                        iArr[i2] = i4;
                        i3 = i7;
                    }
                }
                i7 = i4 + 1;
            }
            if (iArr[i2] >= 0) {
                i8++;
            }
            i7 = i2 + 1;
        }
        if (i8 == 0) {
            i4 = -1;
            i8 = 0;
            d2 = 320.0d;
            while (true) {
                i3 = i8;
                i5 = i4;
                d3 = d2;
                if (i3 >= c.size()) {
                    break;
                }
                d = (double) Math.abs(((abw) c.get(i3)).f178a.x - 320);
                d2 = d < d3 ? d : d3;
                i4 = d < d3 ? i3 : i5;
                i8 = i3 + 1;
            }
            for (i7 = 0; i7 < a.size(); i7++) {
                iArr[i7] = i5;
            }
            i5 = -1;
            i3 = 0;
            d3 = Double.MAX_VALUE;
            d2 = Double.MAX_VALUE;
        } else {
            i5 = -1;
            i3 = 0;
            d3 = Double.MAX_VALUE;
            d2 = Double.MAX_VALUE;
        }
        while (true) {
            int i9 = i3;
            double d5 = d3;
            d3 = d2;
            i2 = i5;
            d4 = d5;
            if (i9 >= a.size()) {
                break;
            }
            if (iArr[i9] < 0) {
                d5 = d3;
                d3 = d4;
                i5 = i2;
                d2 = d5;
            } else {
                double abs2 = (double) Math.abs(((abw) a.get(i9)).f178a.x - i);
                abs = Math.abs((((double) ((abw) a.get(i9)).f178a.x) / ((double) ((abw) a.get(i9)).f178a.y)) - 3.3333333333333335d);
                if (i2 < 0) {
                    d2 = abs;
                    d3 = abs2;
                    i5 = i9;
                } else if (abs2 < d4) {
                    d2 = abs;
                    d3 = abs2;
                    i5 = i9;
                } else if (abs2 != d4) {
                    d5 = d3;
                    d3 = d4;
                    i5 = i2;
                    d2 = d5;
                } else if (abs < d3) {
                    d2 = abs;
                    d3 = abs2;
                    i5 = i9;
                } else {
                    d5 = d3;
                    d3 = d4;
                    i5 = i2;
                    d2 = d5;
                }
            }
            i3 = i9 + 1;
        }
        if (d3 > 0.03d) {
            double d6 = ((double) i) * 0.35d;
            int i10 = 0;
            d = d4;
            i6 = i2;
            while (i10 < a.size()) {
                if (iArr[i10] < 0) {
                    d2 = d3;
                    i3 = i6;
                    d3 = d;
                } else {
                    d4 = Math.abs((((double) ((abw) a.get(i10)).f178a.x) / ((double) ((abw) a.get(i10)).f178a.y)) - 3.3333333333333335d);
                    abs = (double) Math.abs(((abw) a.get(i10)).f178a.x - i);
                    if (0.03d + d4 < d3) {
                        double abs3 = (double) Math.abs(((abw) a.get(i10)).f178a.x - i);
                        if (abs3 < d6) {
                            d2 = d4;
                        } else {
                            d2 = d3;
                        }
                        if (abs3 < d6) {
                            d3 = abs;
                        } else {
                            d3 = d;
                        }
                        i3 = abs3 < d6 ? i10 : i6;
                    } else if (Math.abs(d4 - d3) >= 0.03d) {
                        d2 = d3;
                        i3 = i6;
                        d3 = d;
                    } else if (abs < d) {
                        d2 = d4;
                        d3 = abs;
                        i3 = i10;
                    } else {
                        d2 = d3;
                        i3 = i6;
                        d3 = d;
                    }
                }
                i10++;
                d = d3;
                i6 = i3;
                d3 = d2;
            }
        } else {
            i6 = i2;
        }
        i2 = iArr[i6];
        abw abw = (abw) a.get(i6);
        String str = f3868a;
        Point point = abw.f178a;
        i4 = point.x;
        i7 = point.y;
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("Image size : ");
        stringBuilder.append(i4);
        stringBuilder.append(" x ");
        stringBuilder.append(i7);
        bli.m888a(str, stringBuilder.toString());
        return new ejg((abw) c.get(i2), (abw) a.get(i6));
    }

    /* renamed from: a */
    public static ejg m1810a(aaz aaz) {
        if (f3869b == null) {
            f3869b = ejf.m1812b(aaz, 3000);
        }
        return f3869b;
    }

    /* renamed from: a */
    public static ejg m1811a(aaz aaz, int i) {
        if (i == C0252go.f5845ar) {
            return ejf.m1810a(aaz);
        }
        if (i == C0252go.f5846as) {
            if (f3870c == null) {
                f3870c = ejf.m1812b(aaz, 1800);
            }
            return f3870c;
        } else if (i != C0252go.f5847at) {
            return ejf.m1810a(aaz);
        } else {
            if (f3871d == null) {
                f3871d = ejf.m1812b(aaz, DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX);
            }
            return f3871d;
        }
    }
}
