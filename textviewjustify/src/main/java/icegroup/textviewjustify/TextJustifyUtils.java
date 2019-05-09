package icegroup.textviewjustify;

import android.graphics.Paint;

public class TextJustifyUtils{

    public static Object [] createWrappedLine(String block, Paint paint, float spaceOffset, float maxWidth) {
        float cacheWidth = maxWidth;
        float origMaxWidth = maxWidth;

        String line = "";

        for(String word : block.split("\\s"))
        {
            cacheWidth = paint.measureText(word);
            maxWidth -= cacheWidth;

            if(maxWidth <= 0)
            {
                return new Object[] { line, maxWidth + cacheWidth + spaceOffset };
            }

            line += word + " ";
            maxWidth -= spaceOffset;

        }

        if(paint.measureText(block) <= origMaxWidth)
        {
            return new Object[] { block, Float.MIN_VALUE };
        }
        return new Object[] { line, maxWidth };
    }

}

