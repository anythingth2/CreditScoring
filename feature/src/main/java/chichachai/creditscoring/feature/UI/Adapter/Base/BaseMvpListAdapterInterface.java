package chichachai.creditscoring.feature.UI.Adapter.Base;

import java.util.List;

public class BaseMvpListAdapterInterface {
    public interface Adapter{
        Presenter getPresenter();

        void notifyDataSetChanged();

        void notifyItemInserted( int index );

        void notifyItemRemoved( int index );
    }
    public interface Presenter<A extends BaseMvpListAdapterInterface.Adapter>{
        void setAdapter( A adapter );

        A getAdapter();

        int getItemViewType( int pos );

        int getItemCount();

        boolean hasItems();

        List<BaseItem> getItems();

        BaseItem getItem( int pos );

        void setItems( List<BaseItem> items );

        void addItem( BaseItem item );

        void removeItem( int index );

        void removeAllItems();
    }
}
