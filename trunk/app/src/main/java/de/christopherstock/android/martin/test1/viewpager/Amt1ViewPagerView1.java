/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.martin.test1.viewpager;

    import  android.content.Context;
    import  android.view.View;
    import  android.widget.TextView;
    import  de.christopherstock.android.lib.ui.LibUI;
    import  de.christopherstock.android.martin.test1.R;

    /**********************************************************************************************
    *   The 1st page of the 'acclaim' ViewPager.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    **********************************************************************************************/
    public class Amt1ViewPagerView1
    {
        /** The inflated view that represents the 1st page. */
        protected                   View                iView                           = null;
        /** A reference to the acclaim text that is displayed on this page. */
        protected                   TextView            iAcclaimText                    = null;

        /**********************************************************************************************
        *   Creates the 1st page of the 'acclaim' ViewPager.
        *
        *   @param  context     The current system context.
        **********************************************************************************************/
        public Amt1ViewPagerView1(Context context)
        {
            iView        = LibUI.getInflatedLayoutById( context, R.layout.martin_view_pager_page1);

            iAcclaimText = (TextView)iView.findViewById( R.id.acclaim_text );

            //setup text
            LibUI.setupTextView( context, iAcclaimText, null, R.string.state_acclaim_page1 );
        }
    }
