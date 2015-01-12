/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.lib.ui.adapter;

    import  android.view.View;

    /************************************************************************
    *   Represents one page in a ViewPager.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    ************************************************************************/
    public final class LibViewPagerView implements LibAdapterData
    {
        /** This view's title being possibly displayed in a PagerTitleStrip. */
        private         String          iTitle                  = null;

        /** The content view of this ViewPager. */
        private         View            iView                   = null;

        /************************************************************************
        *   Creates a page for a ViewPager.
        *
        *   @param  aTitle  This page's title.
        *   @param  aView   This page's content view.
        ************************************************************************/
        public LibViewPagerView( String aTitle, View aView )
        {
            iTitle  = aTitle;
            iView   = aView;
        }

        @Override
        public View createView()
        {
            return iView;
        }

        @Override
        public View getView()
        {
            return iView;
        }

        @Override
        public String getTitle()
        {
            return iTitle;
        }

        @Override
        public void updateView()
        {
            //do nothing - view is constant..!
        }

        @Override
        public Runnable getActionOnClick()
        {
            return null;
        }

        @Override
        public synchronized void changeVisibility( boolean visible )
        {
        }
    }
