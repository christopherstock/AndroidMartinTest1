/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.lib.ui.adapter;

    import  android.view.View;

    /************************************************************************
    *   Represents one item in an adapter.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    ************************************************************************/
    public interface LibAdapterData
    {
        /************************************************************************
        *   Constructs the view and returns it.
        *
        *   @return             The constructed view for this item.
        ************************************************************************/
        public View createView();

        /************************************************************************
        *   Returns the created view. This method is being invoked by the system
        *   each time the view is ordered.
        *
        *   @return     The view for this item.
        ************************************************************************/
        public View getView();

        /************************************************************************
        *   Returns this item's title, if any.
        *
        *   @return     The title of this view. This may be used to represent
        *               the title of a ViewPager-page.
        ************************************************************************/
        public String getTitle();

        /************************************************************************
        *   Updates the view for this adapter item.
        ************************************************************************/
        public void updateView();

        /************************************************************************
        *   Returns the associated click action.
        *
        *   @return     The action to be performed when this view is clicked.
        ************************************************************************/
        public Runnable getActionOnClick();

        /************************************************************************
        *   Updates this item's visibility.
        *
        *   @param  visible     <code>true</code> if this item is currently visible.
        *                       Otherwise <code>false</code>.
        ************************************************************************/
        public void changeVisibility( boolean visible );
    }
