/*  $Id:$
 *  ==============================================================================================================
 */
    package de.christopherstock.android.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

    /*********************************************************************************
    *   All functions for accessing system resources.
    *
    *   @author     Christopher Stock
    *   @version    0.0.1
    *   @see        "$URL:$"
    *********************************************************************************/
    public abstract class LibResource
    {
        /*********************************************************************************
        *   Delivers a String resource as a Spanned-object.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the String to pick.
        *   @return             A Spanned String object.
        *********************************************************************************/
        public static final Spanned getResourceSpannedString( Context context, int id )
        {
            return Html.fromHtml( context.getResources().getString( id ) );
        }

        /*********************************************************************************
        *   Delivers a String resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the String to pick.
        *   @return             The according String resource.
        *********************************************************************************/
        public static final String getResourceString( Context context, int id )
        {
            return context.getResources().getString( id );
        }

        /*********************************************************************************
        *   Delivers multiple String resource.
        *
        *   @param  context     The current system context.
        *   @param  ids         The resource-ids of the Strings to pick.
        *   @return             An array containing all according String resources.
        *********************************************************************************/
        public static final String[] getResourceStrings( Context context, int[] ids )
        {
            String[] ret = new String[ ids.length ];
            for ( int i = 0; i < ids.length; ++i )
            {
                ret[ i ] = getResourceSpannedString( context, ids[ i ] ).toString();
            }
            return ret;
        }

        /*********************************************************************************
        *   Delivers an animation resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the animation to pick.
        *   @return             The according animation resource.
        *********************************************************************************/
        public static final Animation getResourceAnimation( Context context, int id )
        {
            return AnimationUtils.loadAnimation( context, id );
        }

        /*********************************************************************************
        *   Delivers a Bitmap resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the Bitmap to pick.
        *   @return             The according Bitmap resource.
        *********************************************************************************/
        public static final Bitmap getResourceBitmap( Context context, int id )
        {
            return ( (BitmapDrawable)LibResource.getResourceDrawable( context, id ) ).getBitmap();
        }

        /*********************************************************************************
        *   Delivers an integer resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the integer to pick.
        *   @return             The according integer resource.
        *********************************************************************************/
        public static final int getResourceInteger( Context context, int id )
        {
            return context.getResources().getInteger( id );
        }

        /*********************************************************************************
        *   Delivers a BitmapDrawable resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the BitmapDrawable to pick.
        *   @return             The according BitmapDrawable resource.
        *********************************************************************************/
        public static final BitmapDrawable getResourceBitmapDrawable( Context context, int id )
        {
            return (BitmapDrawable)LibResource.getResourceDrawable( context, id );
        }

        /*********************************************************************************
        *   Delivers a Drawable resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the Drawable to pick.
        *   @return             The according BitmapDrawable resource.
        *********************************************************************************/
        public static final Drawable getResourceDrawable( Context context, int id )
        {
            return context.getResources().getDrawable( id );
        }

        /*********************************************************************************
        *   Delivers a color resource.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the color to pick.
        *   @return             The int-value of the according color resource.
        *********************************************************************************/
        public static final int getResourceColor( Context context, int id )
        {
            return context.getResources().getColor( id );
        }

        /*********************************************************************************
        *   Delivers a dimension resource in pixels.
        *
        *   @param  context     The current system context.
        *   @param  id          The resource-id of the dimension to pick.
        *   @return             The value of the according dimension resource in pixels.
        *                       This value varies between different screen resolutions.
        *********************************************************************************/
        public static final int getResourceDimensionInPixel( Context context, int id )
        {
            return context.getResources().getDimensionPixelSize( id );
        }
    }
