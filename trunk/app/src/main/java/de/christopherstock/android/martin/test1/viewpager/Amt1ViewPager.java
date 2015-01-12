/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.martin.test1.viewpager;

    import  android.app.Activity;
    import  android.os.Bundle;
    import  android.support.v4.view.ViewPager;
    import  android.support.v4.view.ViewPager.OnPageChangeListener;
    import  de.christopherstock.android.lib.ui.adapter.LibAdapterData;
    import  de.christopherstock.android.lib.ui.adapter.LibViewPagerAdapter;
    import  de.christopherstock.android.lib.ui.adapter.LibViewPagerView;
    import  com.viewpagerindicator.CirclePageIndicator;
    import  de.christopherstock.android.martin.test1.R;

    /**********************************************************************************************
    *   The martin_view_pager 'acclaim', displaying the 'acclaim'-ViewPager.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    **********************************************************************************************/
    public class Amt1ViewPager extends Activity implements OnPageChangeListener
    {
        @Override
        protected void onCreate( Bundle savedInstanceState )
        {
            //invoke super method
            super.onCreate( savedInstanceState );

            //reference martin_view_pager layout
            setContentView(R.layout.martin_view_pager);

            //create pages
            setupPages();
        }

        /**********************************************************************************************
        *   Sets up all pages for the ViewPager and assigns them.
        **********************************************************************************************/
        private void setupPages()
        {
            //create pages for view-pager
            Amt1ViewPagerView1 iPage1 = new Amt1ViewPagerView1( this );
            Amt1ViewPagerView2 iPage2 = new Amt1ViewPagerView2( this );
            Amt1ViewPagerView3 iPage3 = new Amt1ViewPagerView3( this );

            //reference featured list view pager - the title-page-indicator may be null!
            {
                ViewPager           iViewPagerAcclaim   = (ViewPager)findViewById(           R.id.acclaim_view_pager                );
                CirclePageIndicator titlePageIndicator  = (CirclePageIndicator)findViewById( R.id.acclaim_view_pager_title_strip    );
                LibViewPagerAdapter adapter             = new LibViewPagerAdapter
                (
                    new LibAdapterData[]
                    {
                        new LibViewPagerView( "Page 1", iPage1.iView ),
                        new LibViewPagerView( "Page 2", iPage2.iView ),
                        new LibViewPagerView( "Page 3", iPage3.iView ),
                    }
                );

                //assign the adapter to the view pager
                iViewPagerAcclaim.setAdapter( adapter );
                iViewPagerAcclaim.setOnPageChangeListener( this );

                //setup TitlePageIndicator if existent
                titlePageIndicator.setViewPager( iViewPagerAcclaim );
            }
        }

        @Override
        public final void onPageScrolled( int i, float f, int i2 )
        {
        }

        @Override
        public final void onPageScrollStateChanged( int i )
        {
        }

        @Override
        public final void onPageSelected( int i )
        {
        }
    }
