package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: jh */
public final class C0310jh {
    /* renamed from: a */
    public boolean f8186a;
    /* renamed from: b */
    private ViewParent f8187b;
    /* renamed from: c */
    private ViewParent f8188c;
    /* renamed from: d */
    private final View f8189d;
    /* renamed from: e */
    private int[] f8190e;

    public C0310jh(View view) {
        this.f8189d = view;
    }

    /* renamed from: a */
    public final boolean mo9420a(float f, float f2, boolean z) {
        if (!this.f8186a) {
            return false;
        }
        ViewParent c = m4539c(0);
        if (c != null) {
            return C0261ha.m3026a(c, this.f8189d, f, f2, z);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo9419a(float f, float f2) {
        if (!this.f8186a) {
            return false;
        }
        ViewParent c = m4539c(0);
        if (c != null) {
            return C0261ha.m3025a(c, this.f8189d, f, f2);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo9424a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.f8186a) {
            ViewParent c = m4539c(i3);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                int i4;
                int i5;
                int[] iArr3;
                if (iArr2 != null) {
                    this.f8189d.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.f8190e == null) {
                        this.f8190e = new int[2];
                    }
                    iArr3 = this.f8190e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                View view = this.f8189d;
                if (c instanceof C0311ji) {
                    ((C0311ji) c).mo9447a(view, i, i2, iArr3, i3);
                } else if (i3 == 0) {
                    try {
                        c.onNestedPreScroll(view, i, i2, iArr3);
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ViewParent ");
                        stringBuilder.append(c);
                        stringBuilder.append(" does not implement interface ");
                        stringBuilder.append("method onNestedPreScroll");
                        Log.e("ViewParentCompat", stringBuilder.toString(), e);
                    }
                }
                if (iArr2 != null) {
                    this.f8189d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr3[0] == 0 && iArr3[1] == 0) {
                    return false;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo9423a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (this.f8186a) {
            ViewParent c = m4539c(i5);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i6;
                int i7;
                if (iArr != null) {
                    this.f8189d.getLocationInWindow(iArr);
                    int i8 = iArr[0];
                    i6 = iArr[1];
                    i7 = i8;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                View view = this.f8189d;
                if (c instanceof C0311ji) {
                    ((C0311ji) c).mo9446a(view, i, i2, i3, i4, i5);
                } else if (i5 == 0) {
                    try {
                        c.onNestedScroll(view, i, i2, i3, i4);
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ViewParent ");
                        stringBuilder.append(c);
                        stringBuilder.append(" does not implement interface ");
                        stringBuilder.append("method onNestedScroll");
                        Log.e("ViewParentCompat", stringBuilder.toString(), e);
                    }
                }
                if (iArr != null) {
                    this.f8189d.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final ViewParent m4539c(int i) {
        switch (i) {
            case 0:
                return this.f8187b;
            case 1:
                return this.f8188c;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final boolean mo9421a(int i) {
        return m4539c(i) != null;
    }

    /* renamed from: a */
    public final void mo9418a(boolean z) {
        if (this.f8186a) {
            C0315jm.m4605E(this.f8189d);
        }
        this.f8186a = z;
    }

    /* renamed from: a */
    private final void m4538a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f8187b = viewParent;
                return;
            case 1:
                this.f8188c = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final boolean mo9422a(int i, int i2) {
        if (mo9421a(i2)) {
            return true;
        }
        if (this.f8186a) {
            View view = this.f8189d;
            for (ViewParent parent = this.f8189d.getParent(); parent != null; parent = parent.getParent()) {
                if (C0261ha.m3027a(parent, view, this.f8189d, i, i2)) {
                    m4538a(i2, parent);
                    View view2 = this.f8189d;
                    if (parent instanceof C0311ji) {
                        ((C0311ji) parent).mo9450b(view2, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view2, i);
                        } catch (Throwable e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("ViewParent ");
                            stringBuilder.append(parent);
                            stringBuilder.append(" does not implement interface ");
                            stringBuilder.append("method onNestedScrollAccepted");
                            Log.e("ViewParentCompat", stringBuilder.toString(), e);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo9425b(int i) {
        ViewParent c = m4539c(i);
        if (c != null) {
            View view = this.f8189d;
            if (c instanceof C0311ji) {
                ((C0311ji) c).mo9449b(view, i);
            } else if (i == 0) {
                try {
                    c.onStopNestedScroll(view);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(c);
                    stringBuilder.append(" does not implement interface ");
                    stringBuilder.append("method onStopNestedScroll");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            }
            m4538a(i, null);
        }
    }
}
