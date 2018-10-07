package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* compiled from: PG */
/* renamed from: apd */
public final class apd extends Fragment {
    /* renamed from: a */
    public final aos f848a;
    /* renamed from: b */
    public final aph f849b;
    /* renamed from: c */
    public acm f850c;
    /* renamed from: d */
    public Fragment f851d;
    /* renamed from: e */
    private final Set f852e;
    /* renamed from: f */
    private apd f853f;

    public apd() {
        this(new aos());
    }

    @SuppressLint({"ValidFragment"})
    private apd(aos aos) {
        this.f849b = new ape(this);
        this.f852e = new HashSet();
        this.f848a = aos;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m561a();
            this.f853f = acc.m98a((Context) activity).f192f.mo1655a(activity.getFragmentManager(), apf.m563b(activity));
            if (!equals(this.f853f)) {
                this.f853f.f852e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f848a.mo12298a();
        m561a();
    }

    public final void onDetach() {
        super.onDetach();
        m561a();
    }

    public final void onStart() {
        super.onStart();
        this.f848a.mo12299b();
    }

    public final void onStop() {
        super.onStop();
        this.f848a.mo12300c();
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
    private final void m561a() {
        apd apd = this.f853f;
        if (apd != null) {
            apd.f852e.remove(this);
            this.f853f = null;
        }
    }
}
