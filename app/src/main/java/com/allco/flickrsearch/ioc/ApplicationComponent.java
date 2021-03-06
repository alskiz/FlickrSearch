package com.allco.flickrsearch.ioc;

import com.allco.flickrsearch.photodetails.ioc.PhotoDetailsComponent;
import com.allco.flickrsearch.photodetails.ioc.PhotoDetailsModule;
import com.allco.flickrsearch.photolist.ioc.PhotoListComponent;
import com.allco.flickrsearch.photolist.ioc.PhotoListModule;
import com.allco.flickrsearch.photolist.view.PhotoListAdapter;
import com.allco.flickrsearch.rest.RestClient;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(PhotoListAdapter photoListAdapter);
    PhotoListComponent photoListComponent(PhotoListModule photoListModule);
    PhotoDetailsComponent photoDetailsComponent(PhotoDetailsModule photoDetailsModule);
    RestClient restClient();
}
