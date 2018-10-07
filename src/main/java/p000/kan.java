package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.LoaderManager.LoaderCallbacks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kan */
public final class kan extends Fragment implements LoaderCallbacks {
    /* renamed from: a */
    public kap f24897a;
    /* renamed from: b */
    private ArrayAdapter f24898b;

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof kap) {
            this.f24897a = (kap) parentFragment;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof kap) {
            this.f24897a = (kap) activity;
        }
    }

    public final C0243gf onCreateLoader(int i, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getStringArrayList("pluginLicensePaths") == null || arguments.getStringArrayList("pluginLicensePaths").isEmpty()) {
            return new kam(getActivity());
        }
        return new kam(getActivity(), arguments.getStringArrayList("pluginLicensePaths"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        getActivity().getSupportLoaderManager().destroyLoader(54321);
    }

    public final void onDetach() {
        super.onDetach();
        this.f24897a = null;
    }

    public final /* synthetic */ void onLoadFinished(C0243gf c0243gf, Object obj) {
        List list = (List) obj;
        this.f24898b.clear();
        this.f24898b.addAll(list);
        this.f24898b.notifyDataSetChanged();
    }

    public final void onLoaderReset(C0243gf c0243gf) {
        this.f24898b.clear();
        this.f24898b.notifyDataSetChanged();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context activity = getActivity();
        this.f24898b = new ArrayAdapter(activity, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        activity.getSupportLoaderManager().initLoader(54321, null, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter(this.f24898b);
        listView.setOnItemClickListener(new kao(this));
    }
}
