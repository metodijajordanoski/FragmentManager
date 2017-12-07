package prvaaplikacija.a05122017;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Mende on 05.12.2017.
 */

public class Fragment3 extends Fragment {
    @BindView(R.id.imageView)
    ImageView imageView;
    private Unbinder mUnbindir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,null);
        mUnbindir = ButterKnife.bind(this,view);

        Picasso.with(getActivity()).load("https://upload.wikimedia.org/wikipedia/commons/4/47/PNG_transparency_demonstration_1.png").fit().centerInside().into(imageView);

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbindir.unbind();
    }
}
