/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.lib.ui;

    import  android.content.Context;
    import  android.graphics.Typeface;
    import  android.view.LayoutInflater;
    import  android.view.View;
    import  android.view.ViewGroup;
    import  android.widget.TextView;
    import  de.christopherstock.android.lib.LibResource;

    /************************************************************************
    *   All independent UI-functions.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    ************************************************************************/
    public class LibUI
    {
        /************************************************************************
        *   Sets up a {@link TextView} with the major attributes.
        *
        *   @param  context         The current system context.
        *   @param  textView        The TextView to configure.
        *   @param  typeface        The typeface to use for the caption.
        *   @param  textID          The resource-ID for the caption of this button.
        ************************************************************************/
        public static void setupTextView( Context context, TextView textView, Typeface typeface, int textID )
        {
            setupTextView( textView, typeface,  LibResource.getResourceSpannedString( context, textID ) );
        }

        /************************************************************************
        *   Sets up a {@link TextView} with the major attributes.
        *
        *   @param  textView        The TextView to configure.
        *   @param  typeface        The typeface to use for the caption.
        *   @param  text            The caption of this button.
        ************************************************************************/
        public static void setupTextView( TextView textView, Typeface typeface, CharSequence text )
        {
            if ( typeface != null ) textView.setTypeface(   typeface    );
            textView.setText(       text        );
        }

        /*********************************************************************************
        *   Removes this view from it's parent view.
        *   This method must be invoked from the UI-Thread since it changes view components.
        *   Performs nothing, if the specified view doesn't have a parent.
        *
        *   @param  view        The view to free from their parent.
        *********************************************************************************/
        public static void freeFromParent( View view )
        {
            if ( view.getParent() != null )
            {
                ( (ViewGroup)view.getParent() ).removeView( view );
            }
        }

        /*********************************************************************************
        *   Inflates and returns a view by id
        *   even if the View is not set as the current activitie's content-view.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-layout-id of the layout to inflate.
        *   @return             The inflated View.
        *********************************************************************************/
        public static View getInflatedLayoutById( Context context, int id )
        {
            LayoutInflater  inflator    = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            View            ret         = inflator.inflate( id, null );

            return ret;
        }
    }
