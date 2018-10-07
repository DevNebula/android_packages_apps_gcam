package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: al */
public final class C0005al extends Fragment {
    /* renamed from: a */
    private final void m329a(C0531v c0531v) {
        Activity activity = getActivity();
        if (activity instanceof C0627aa) {
            ((C0627aa) activity).mo11607a().mo14475b(c0531v);
        } else if (activity instanceof C0587y) {
            C0510u lifecycle = ((C0587y) activity).getLifecycle();
            if (lifecycle instanceof C0801z) {
                ((C0801z) lifecycle).mo14475b(c0531v);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m329a(C0531v.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        m329a(C0531v.ON_DESTROY);
    }

    public final void onPause() {
        super.onPause();
        m329a(C0531v.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        m329a(C0531v.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        m329a(C0531v.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m329a(C0531v.ON_STOP);
    }
}
