package com.allco.flickrsearch.photolist.ioc;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;

import com.allco.flickrsearch.R;
import com.allco.flickrsearch.photolist.PhotoListPresenter;
import com.allco.flickrsearch.utils.BitmapBorderTransformer;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@SuppressWarnings("WeakerAccess")
@Module
public class PhotoListModule {

    public static final String THUMB_SIZE = "THUMB_SIZE";

    @PhotoListScope
    @Named(THUMB_SIZE)
    @Provides
    public int provideThumbSize(Resources res) {
        return res.getDimensionPixelSize(R.dimen.thumb_size);
    }

    @PhotoListScope
    @Provides
    public BitmapBorderTransformer provideBitmapBorderTransformer(Context context) {
        Resources res = context.getResources();
        int sizeThumbRoundPixels = res.getDimensionPixelSize(R.dimen.thumb_round_corner_size);
        return new BitmapBorderTransformer(1 /*border size*/, sizeThumbRoundPixels, ResourcesCompat.getColor(res, R.color.gray_light, null));
    }
}