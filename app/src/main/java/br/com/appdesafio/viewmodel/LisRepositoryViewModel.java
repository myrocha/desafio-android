package br.com.appdesafio.viewmodel;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

import javax.inject.Inject;

import br.com.appdesafio.model.persistence.SharedPreference;
import br.com.appdesafio.model.pojo.Repository;
import br.com.appdesafio.repository.ListRepository;

public class LisRepositoryViewModel extends ViewModel {
    @Inject
    ListRepository mRepository;

    public Context mContext;

    public LisRepositoryViewModel (final ListRepository listRepository, final Application application){
        this.mRepository = listRepository;
        this.mContext = application;
    }

    /**
     * access the repository to login.
     * @return
     */
    public LiveData<Repository> getListRepository(final int page) {
        return mRepository.getListRepository(page);


    }



}