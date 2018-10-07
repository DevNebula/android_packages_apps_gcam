package android.support.p001v4.app;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import p000.C0005al;
import p000.C0301iz;
import p000.C0510u;
import p000.C0552w;
import p000.C0587y;
import p000.C0801z;

/* compiled from: PG */
/* renamed from: android.support.v4.app.SupportActivity */
public class SupportActivity extends Activity implements C0587y {
    public C0301iz mExtraDataMap = new C0301iz();
    public C0801z mLifecycleRegistry = new C0801z(this);

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.SupportActivity$ExtraData */
    public class ExtraData {
    }

    public ExtraData getExtraData(Class cls) {
        return (ExtraData) this.mExtraDataMap.get(cls);
    }

    public C0510u getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0005al(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo14474a(C0552w.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }
}
