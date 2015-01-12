/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.lib.ui.adapter;

    import  android.os.Parcelable;
    import  android.support.v4.view.PagerAdapter;
    import  android.view.View;
    import  android.view.ViewGroup;
    import  de.christopherstock.android.lib.ui.LibUI;

    /************************************************************************
    *   Represents the adapter that serves a {@link android.support.v4.view.ViewPager} with data.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    ************************************************************************/
    public class LibViewPagerAdapter extends PagerAdapter
    {
        /** All pages of the view pager. */
        public          LibAdapterData[]               iData                       = null;

        /************************************************************************
        *   Creates a new adapter to serve a ViewPager with data.
        *
        *   @param  aData   All initial pages of the ViewPager.
        ************************************************************************/
        public LibViewPagerAdapter( LibAdapterData[] aData )
        {
            iData = ( aData == null ? new LibAdapterData[] {} : aData );
        }

        /************************************************************************
        *   Changes the adapter of this ViewPager.
        *
        *   @param  aData   The new pages for the ViewPager.
        ************************************************************************/
        public void setNewData( LibAdapterData[] aData )
        {
            iData = aData;
            notifyDataSetChanged();     // obsolete ?
        }

        @Override
        public int getCount()
        {
            return iData.length;
        }

        /************************************************************************
        *   Create the page for the given position.  The adapter is responsible
        *   for adding the view to the container given here, although it only
        *   must ensure this is done by the time it returns from {@link #finishUpdate(ViewGroup)}.
        *
        *   @param  collection  The containing View in which the page will be shown.
        *   @param  position    The page position to be instantiated.
        *   @return             Returns an Object representing the new page.
        *                       This does not need to be a View, but can be some other container of the page.
        ************************************************************************/
        @Override
        public Object instantiateItem( ViewGroup collection, int position )
        {
            //AppsDebugSystem.bugfix.out( ">>>>>>>>>> ViewPagerAdapter::instantiateItem " + position );

            //add data's view
            View ret = iData[ position ].getView();

            LibUI.freeFromParent( ret );

            collection.addView( ret );

            return ret;
        }

        @Override
        public void destroyItem( ViewGroup collection, int position, Object object )
        {
            //AppsDebugSystem.bugfix.out( ">>>>>>>>>> ViewPagerAdapter::destroyItem " + position );

            //remove data's view
            collection.removeView( iData[ position ].getView() );
        }

        @Override
        public boolean isViewFromObject( View view, Object object )
        {
            return ( view == ( (View)object ) );
        }

        @Override
        public void restoreState( Parcelable arg0, ClassLoader arg1 )
        {
            //AppsDebugSystem.bugfix.out( ">>>>>>>>>> ViewPagerAdapter::restoreState" );
        }

        @Override
        public Parcelable saveState()
        {
            return null;
        }

        @Override
        public CharSequence getPageTitle( int position )
        {
            String ret = null;
            if ( iData.length <= position )
            {
                ret = "";
            }
            else
            {
                ret = iData[ position ].getTitle();
            }
            return ret;
        }

        /************************************************************************
        *   This is told to be a very unperformant solution because all views
        *   get recreated when {@link #notifyDataSetChanged()} is called.
        *   But it works.
        ************************************************************************/
        @Override
        public int getItemPosition( Object object )
        {
            return POSITION_NONE;
        }
    }
