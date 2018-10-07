package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: apj */
public final class apj extends Fragment {
    /* renamed from: a */
    public final aos f22503a;
    /* renamed from: b */
    public final aph f22504b;
    /* renamed from: c */
    public acm f22505c;
    /* renamed from: d */
    public Fragment f22506d;
    /* renamed from: e */
    private final Set f22507e;
    /* renamed from: f */
    private apj f22508f;

    public apj() {
        this(new aos());
    }

    @SuppressLint({"ValidFragment"})
    private apj(aos aos) {
        this.f22504b = new apk(this);
        this.f22507e = new HashSet();
        this.f22503a = aos;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            Context activity = getActivity();
            m14946a();
            this.f22508f = acc.m98a(activity).f192f.mo1656a(activity.getSupportFragmentManager(), activity.isFinishing() ^ 1);
            if (!equals(this.f22508f)) {
                this.f22508f.f22507e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f22503a.mo12298a();
        m14946a();
    }

    public final void onDetach() {
        super.onDetach();
        this.f22506d = null;
        m14946a();
    }

    public final void onStart() {
        super.onStart();
        this.f22503a.mo12299b();
    }

    public final void onStop() {
        super.onStop();
        this.f22503a.mo12300c();
    }

    public final String toString() {
        String fragment = super.toString();
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(fragment).length() + 9) + String.valueOf(valueOf).length());
        stringBuilder.append(fragment);
        stringBuilder.append("{parent=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final void m14946a() {
        apj apj = this.f22508f;
        if (apj != null) {
            apj.f22507e.remove(this);
            this.f22508f = null;
        }
    }
}
