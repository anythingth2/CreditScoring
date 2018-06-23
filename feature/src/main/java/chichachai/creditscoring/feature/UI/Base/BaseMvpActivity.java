package chichachai.creditscoring.feature.UI.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;

import chichachai.creditscoring.feature.UI.Base.Exception.MvpNotSetLayoutException;
import chichachai.creditscoring.feature.UI.Base.Exception.MvpPresenterNotCreateException;

public abstract class BaseMvpActivity<P extends BaseMvpInterface.Presenter>
        extends AppCompatActivity
        implements BaseMvpInterface.View {

    private P presenter;
    protected ProgressBar progressBar;

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();
        presenter.attachView(this);
        int layoutResId = getLayoutView();
        if (getLayoutView() == 0) throw new MvpNotSetLayoutException();
        setContentView(layoutResId);
        bindView();

        setupInstance();
        setupView();
        getPresenter().onViewCreate();
        if (savedInstanceState == null) {
            initialize();
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        getPresenter().onViewStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        getPresenter().onViewStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().onViewDestroy();
        presenter.detachView();
    }

    protected void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    protected void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public P getPresenter() {
        if (presenter != null) return presenter;
        throw new MvpPresenterNotCreateException();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        restoreView(savedInstanceState);
    }

    public void restoreView(Bundle savedInstanceState) {
    }

    public abstract P createPresenter();

    public abstract int getLayoutView();

    public abstract void bindView();

    public abstract void setupInstance();

    public abstract void setupView();

    public abstract void initialize();


}
