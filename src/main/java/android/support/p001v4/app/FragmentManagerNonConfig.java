package android.support.p001v4.app;

import java.util.List;

/* compiled from: PG */
/* renamed from: android.support.v4.app.FragmentManagerNonConfig */
public class FragmentManagerNonConfig {
    public final List mChildNonConfigs;
    public final List mFragments;
    public final List mViewModelStores;

    FragmentManagerNonConfig(List list, List list2, List list3) {
        this.mFragments = list;
        this.mChildNonConfigs = list2;
        this.mViewModelStores = list3;
    }

    List getChildNonConfigs() {
        return this.mChildNonConfigs;
    }

    List getFragments() {
        return this.mFragments;
    }

    List getViewModelStores() {
        return this.mViewModelStores;
    }
}
